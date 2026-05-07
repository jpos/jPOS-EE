/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.qrest;

import io.micrometer.core.instrument.DistributionSummary;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import io.micrometer.core.instrument.Timer;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * QRest HTTP server metrics, contributed to the Q2 Micrometer registry.
 *
 * <p>Emits OpenTelemetry-style HTTP server semantic-conventions metrics:
 * <ul>
 *   <li>{@code http.server.request.duration} – request duration {@link Timer}, base unit seconds.</li>
 *   <li>{@code http.server.active_requests} – in-flight request {@link Gauge}.</li>
 *   <li>{@code http.server.request.body.size} – request body bytes {@link DistributionSummary}.</li>
 *   <li>{@code http.server.response.body.size} – response body bytes {@link DistributionSummary}.</li>
 * </ul>
 *
 * <p>All operations are no-ops when the underlying {@link MeterRegistry} is {@code null}, so
 * QRest works correctly when Q2 metrics are not enabled.</p>
 *
 * <p>Tag cardinality is bounded by {@code metricsMaxRoutes} (default 200); once the cap is
 * reached, further distinct route values are reported as {@code _overflow}.</p>
 */
final class QRestMetrics {
    static final String REQUEST_DURATION = "http.server.request.duration";
    static final String ACTIVE_REQUESTS  = "http.server.active_requests";
    static final String REQUEST_SIZE     = "http.server.request.body.size";
    static final String RESPONSE_SIZE    = "http.server.response.body.size";

    static final String UNKNOWN_ROUTE = "_unknown";
    static final String UNMATCHED_ROUTE = "_unmatched";
    static final String UNKNOWN_QUEUE = "_unknown";
    static final String OVERFLOW_ROUTE = "_overflow";
    static final String OTHER_METHOD = "_OTHER";

    /** Configuration knob: how to label the request path. */
    enum PathLabel { ROUTE, PATH, NONE }

    private static final Set<String> KNOWN_METHODS = Set.of(
      "GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS", "PATCH", "TRACE", "CONNECT"
    );

    private final MeterRegistry registry;
    private final String serverName;
    private final PathLabel pathLabel;
    private final int maxRoutes;
    private final Set<String> seenRoutes = ConcurrentHashMap.newKeySet();
    private final AtomicLong activeRequests = new AtomicLong();

    QRestMetrics(MeterRegistry registry, String serverName, PathLabel pathLabel, int maxRoutes) {
        this.registry = registry;
        this.serverName = serverName;
        this.pathLabel = pathLabel != null ? pathLabel : PathLabel.ROUTE;
        this.maxRoutes = maxRoutes > 0 ? maxRoutes : 200;
        if (registry != null) {
            Gauge.builder(ACTIVE_REQUESTS, activeRequests, AtomicLong::doubleValue)
              .tags(Tags.of("server", safeServer()))
              .description("In-flight HTTP server requests")
              .register(registry);
        }
    }

    boolean isEnabled() {
        return registry != null;
    }

    long activeRequests() {
        return activeRequests.get();
    }

    /** Records the start of a request and increments the active-requests gauge. */
    void requestStarted(RestAccessState state) {
        if (registry == null || state == null)
            return;
        activeRequests.incrementAndGet();
    }

    /**
     * Records request completion. Idempotent — calling it more than once for the same
     * {@link RestAccessState} is a no-op so that {@link SendResponse} and
     * {@link RestSession#channelInactive} cannot double-count.
     */
    void requestCompleted(RestAccessState state) {
        if (registry == null || state == null || state.recorded)
            return;
        state.recorded = true;
        activeRequests.decrementAndGet();

        Tags tags = tagsFor(state);
        long elapsedNanos = state.startNanos != null
          ? Math.max(0L, System.nanoTime() - state.startNanos)
          : 0L;

        Timer.builder(REQUEST_DURATION)
          .description("Duration of HTTP server requests")
          .tags(tags)
          .publishPercentileHistogram()
          .minimumExpectedValue(Duration.ofMillis(1))
          .maximumExpectedValue(Duration.ofSeconds(60))
          .register(registry)
          .record(Duration.ofNanos(elapsedNanos));

        if (state.requestBytes != null) {
            DistributionSummary.builder(REQUEST_SIZE)
              .description("Size of HTTP server request bodies")
              .baseUnit("bytes")
              .tags(tags)
              .register(registry)
              .record(state.requestBytes.doubleValue());
        }
        if (state.responseBytes != null) {
            DistributionSummary.builder(RESPONSE_SIZE)
              .description("Size of HTTP server response bodies")
              .baseUnit("bytes")
              .tags(tags)
              .register(registry)
              .record(state.responseBytes.doubleValue());
        }
    }

    /**
     * Records a failed request that never produced a normal response. Sets status to 500
     * if missing and routes through {@link #requestCompleted(RestAccessState)} so the
     * idempotency guarantee still holds.
     */
    void requestFailed(RestAccessState state, Throwable t) {
        if (registry == null || state == null || state.recorded)
            return;
        if (state.status == null)
            state.status = 500;
        requestCompleted(state);
    }

    private Tags tagsFor(RestAccessState state) {
        Tags tags = Tags.of(
          "http.request.method", normalizeMethod(state.method),
          "http.response.status_code", state.status != null ? state.status.toString() : "0",
          "url.scheme", safe(state.scheme, "http"),
          "network.protocol.version", safe(state.protocolVersion, "1.1"),
          "outcome", outcomeFor(state.status),
          "queue", safe(state.queue, UNKNOWN_QUEUE),
          "server", safeServer()
        );
        String pathTag = pathTagFor(state);
        if (pathTag != null)
            tags = tags.and("http.route", pathTag);
        return tags;
    }

    private String pathTagFor(RestAccessState state) {
        switch (pathLabel) {
            case NONE:
                return null;
            case PATH: {
                String raw = state.path;
                return capCardinality(raw != null ? raw : UNKNOWN_ROUTE);
            }
            case ROUTE:
            default: {
                String r = state.route;
                if (r == null || r.isEmpty())
                    r = UNMATCHED_ROUTE;
                return capCardinality(r);
            }
        }
    }

    private String capCardinality(String value) {
        if (value == null)
            return UNKNOWN_ROUTE;
        if (seenRoutes.contains(value))
            return value;
        if (seenRoutes.size() >= maxRoutes)
            return OVERFLOW_ROUTE;
        seenRoutes.add(value);
        return value;
    }

    private String safeServer() {
        return safe(serverName, "qrest");
    }

    private static String safe(String s, String fallback) {
        return s == null || s.isEmpty() ? fallback : s;
    }

    private static String normalizeMethod(String m) {
        if (m == null)
            return OTHER_METHOD;
        return KNOWN_METHODS.contains(m) ? m : OTHER_METHOD;
    }

    static String outcomeFor(Integer status) {
        if (status == null)
            return "UNKNOWN";
        int s = status;
        if (s >= 100 && s < 200) return "INFORMATIONAL";
        if (s >= 200 && s < 300) return "SUCCESS";
        if (s >= 300 && s < 400) return "REDIRECTION";
        if (s >= 400 && s < 500) return "CLIENT_ERROR";
        if (s >= 500 && s < 600) return "SERVER_ERROR";
        return "UNKNOWN";
    }

    static PathLabel parsePathLabel(String s) {
        if (s == null)
            return PathLabel.ROUTE;
        switch (s.trim().toLowerCase()) {
            case "path": return PathLabel.PATH;
            case "none": return PathLabel.NONE;
            case "route":
            default:     return PathLabel.ROUTE;
        }
    }
}
