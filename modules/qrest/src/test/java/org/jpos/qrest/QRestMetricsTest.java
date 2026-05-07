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
import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Timer;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QRestMetricsTest {

    private static RestAccessState state(String method, String route, Integer status) {
        RestAccessState s = new RestAccessState();
        s.method = method;
        s.path = "/users/123";
        s.route = route;
        s.status = status;
        s.startNanos = System.nanoTime() - 5_000_000L;
        s.queue = "TXNMGR.WEB";
        s.scheme = "http";
        s.protocolVersion = "1.1";
        s.requestBytes = 11L;
        s.responseBytes = 17L;
        return s;
    }

    @Test
    void noopWhenRegistryIsNull() {
        QRestMetrics m = new QRestMetrics(null, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        assertFalse(m.isEnabled());
        // Must not throw.
        RestAccessState s = state("GET", "/users/{id}", 200);
        m.requestStarted(s);
        m.requestCompleted(s);
        m.requestFailed(s, new RuntimeException("x"));
        assertEquals(0L, m.activeRequests());
    }

    @Test
    void recordsTimerWithRouteTemplateAndCanonicalTags() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        RestAccessState s = state("GET", "/users/{id}", 200);

        m.requestStarted(s);
        m.requestCompleted(s);

        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t, "duration timer must be registered");
        assertEquals(1L, t.count());

        Map<String,String> tags = tagMap(t);
        assertEquals("GET", tags.get("http.request.method"));
        assertEquals("200", tags.get("http.response.status_code"));
        assertEquals("/users/{id}", tags.get("http.route"));
        assertEquals("http", tags.get("url.scheme"));
        assertEquals("1.1", tags.get("network.protocol.version"));
        assertEquals("SUCCESS", tags.get("outcome"));
        assertEquals("TXNMGR.WEB", tags.get("queue"));
        assertEquals("rest", tags.get("server"));
    }

    @Test
    void recordsRequestAndResponseBodySize() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        RestAccessState s = state("POST", "/orders", 201);
        s.requestBytes  = 123L;
        s.responseBytes = 456L;

        m.requestStarted(s);
        m.requestCompleted(s);

        DistributionSummary req  = reg.find(QRestMetrics.REQUEST_SIZE).summary();
        DistributionSummary resp = reg.find(QRestMetrics.RESPONSE_SIZE).summary();
        assertNotNull(req);
        assertNotNull(resp);
        assertEquals(1L, req.count());
        assertEquals(1L, resp.count());
        assertEquals(123.0, req.totalAmount(), 0.0001);
        assertEquals(456.0, resp.totalAmount(), 0.0001);
    }

    @Test
    void activeRequestsGaugeIncrementsAndReturnsToZero() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        RestAccessState a = state("GET", "/a", 200);
        RestAccessState b = state("GET", "/b", 200);

        m.requestStarted(a);
        m.requestStarted(b);
        assertEquals(2L, m.activeRequests());

        m.requestCompleted(a);
        m.requestCompleted(b);
        assertEquals(0L, m.activeRequests());

        assertNotNull(reg.find(QRestMetrics.ACTIVE_REQUESTS).gauge());
        assertEquals(0.0, reg.find(QRestMetrics.ACTIVE_REQUESTS).gauge().value(), 0.0001);
    }

    @Test
    void requestCompletedIsIdempotent() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        RestAccessState s = state("GET", "/x", 200);

        m.requestStarted(s);
        m.requestCompleted(s);
        m.requestCompleted(s);
        m.requestFailed(s, new RuntimeException("late"));

        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t);
        assertEquals(1L, t.count(), "second completion call must be a no-op");
        assertEquals(0L, m.activeRequests(), "active gauge must not be decremented twice");
    }

    @Test
    void requestFailedAssignsServerErrorStatusWhenMissing() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        RestAccessState s = state("GET", "/boom", null);
        s.status = null;

        m.requestStarted(s);
        m.requestFailed(s, new RuntimeException("boom"));

        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t);
        assertEquals(1L, t.count());
        assertEquals("500", tagMap(t).get("http.response.status_code"));
        assertEquals("SERVER_ERROR", tagMap(t).get("outcome"));
    }

    @Test
    void rawPathIsNotTaggedWhenPathLabelIsRoute() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        RestAccessState s = state("GET", "/users/{id}", 200);
        s.path = "/users/12345";

        m.requestCompleted(s);

        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t);
        assertEquals("/users/{id}", tagMap(t).get("http.route"),
          "default ROUTE label must use template, not raw URI");
    }

    @Test
    void rawPathIsUsedWhenPathLabelIsPath() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.PATH, 100);
        RestAccessState s = state("GET", "/users/{id}", 200);
        s.path = "/users/12345";

        m.requestCompleted(s);

        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t);
        assertEquals("/users/12345", tagMap(t).get("http.route"));
    }

    @Test
    void noneLabelOmitsRouteTag() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.NONE, 100);
        m.requestCompleted(state("GET", "/users/{id}", 200));

        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t);
        assertNull(tagMap(t).get("http.route"));
    }

    @Test
    void unknownMethodIsNormalizedToOther() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        RestAccessState s = state("FROBNICATE", "/x", 200);
        m.requestCompleted(s);
        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertEquals("_OTHER", tagMap(t).get("http.request.method"));
    }

    @Test
    void unmatchedRouteUsesPlaceholder() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        RestAccessState s = state("GET", null, 200);
        m.requestCompleted(s);
        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertEquals("_unmatched", tagMap(t).get("http.route"));
    }

    @Test
    void cardinalityCapKicksInAfterMaxRoutes() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.PATH, 2);

        RestAccessState a = state("GET", null, 200); a.path = "/a";
        RestAccessState b = state("GET", null, 200); b.path = "/b";
        RestAccessState c = state("GET", null, 200); c.path = "/c";
        RestAccessState d = state("GET", null, 200); d.path = "/d";
        m.requestCompleted(a);
        m.requestCompleted(b);
        m.requestCompleted(c);
        m.requestCompleted(d);

        List<String> seen = reg.find(QRestMetrics.REQUEST_DURATION).timers()
          .stream()
          .map(QRestMetricsTest::tagMap)
          .map(t -> t.get("http.route"))
          .collect(Collectors.toList());
        assertTrue(seen.contains("/a"));
        assertTrue(seen.contains("/b"));
        assertTrue(seen.contains("_overflow"),
          "third+ distinct paths should collapse into _overflow once cap is reached");
    }

    @Test
    void outcomeBucketingCoversAllRanges() {
        assertEquals("INFORMATIONAL", QRestMetrics.outcomeFor(100));
        assertEquals("SUCCESS",       QRestMetrics.outcomeFor(204));
        assertEquals("REDIRECTION",   QRestMetrics.outcomeFor(301));
        assertEquals("CLIENT_ERROR",  QRestMetrics.outcomeFor(404));
        assertEquals("SERVER_ERROR",  QRestMetrics.outcomeFor(500));
        assertEquals("UNKNOWN",       QRestMetrics.outcomeFor(null));
        assertEquals("UNKNOWN",       QRestMetrics.outcomeFor(999));
    }

    private static Map<String,String> tagMap(Meter meter) {
        return meter.getId().getTags().stream()
          .collect(Collectors.toMap(Tag::getKey, Tag::getValue));
    }
}
