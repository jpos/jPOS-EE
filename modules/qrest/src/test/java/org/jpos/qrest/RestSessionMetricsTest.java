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

import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Timer;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import org.jpos.core.SimpleConfiguration;
import org.jpos.transaction.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Verifies HTTP server metrics emission through the actual {@link RestSession} +
 * {@link SendResponse} lifecycle.
 */
class RestSessionMetricsTest {
    private SimpleMeterRegistry registry;
    private MetricsCapturingRestServer server;
    private RestSession session;
    private EmbeddedChannel channel;

    @BeforeEach
    void setUp() throws Exception {
        registry = new SimpleMeterRegistry();
        server = new MetricsCapturingRestServer(registry);
        server.setName("rest-metrics");
        server.setConfiguration(new SimpleConfiguration());
        session = new RestSession(server);
        channel = new EmbeddedChannel(session);
    }

    @AfterEach
    void tearDown() {
        if (channel != null)
            channel.finishAndReleaseAll();
        if (registry != null)
            registry.close();
    }

    @Test
    void successfulRequestEmitsTimerWithRouteTemplate() {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.GET, "/users/123");
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        channel.writeInbound(request);

        Context ctx = server.lastQueuedContext;
        assertNotNull(ctx, "queue() must have been called");
        ctx.put(Constants.RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK));
        new SendResponse().commit(1L, ctx);
        drainOutbound();

        Timer t = registry.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t, "duration timer must be recorded");
        assertEquals(1L, t.count());

        Map<String,String> tags = tagMap(t);
        assertEquals("GET",          tags.get("http.request.method"));
        assertEquals("200",          tags.get("http.response.status_code"));
        assertEquals("/users/{id}",  tags.get("http.route"),
          "tagging must use route template, not raw /users/123");
        assertEquals("SUCCESS",      tags.get("outcome"));
        assertEquals("WEB.QUEUE",    tags.get("queue"));
        assertEquals("rest-metrics", tags.get("server"));

        assertEquals(0L, server.getMetrics().activeRequests(),
          "active gauge must return to zero after the response is sent");
    }

    @Test
    void requestAndResponseSizeAreRecorded() {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.POST, "/users/9");
        request.content().writeBytes("hello".getBytes());
        channel.writeInbound(request);

        Context ctx = server.lastQueuedContext;
        assertNotNull(ctx, "queue() must have been called");
        DefaultFullHttpResponse resp = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK);
        resp.content().writeBytes("0123456789".getBytes());
        ctx.put(Constants.RESPONSE, resp);
        new SendResponse().commit(1L, ctx);
        drainOutbound();

        var req  = registry.find(QRestMetrics.REQUEST_SIZE).summary();
        var rsp  = registry.find(QRestMetrics.RESPONSE_SIZE).summary();
        assertNotNull(req,  "request size summary must be present");
        assertNotNull(rsp,  "response size summary must be present");
        assertEquals(1L,    req.count());
        assertEquals(5.0,   req.totalAmount(), 0.0001);
        assertEquals(1L,    rsp.count());
        assertEquals(10.0,  rsp.totalAmount(), 0.0001);
    }

    @Test
    void exceptionPathRecordsServerErrorAndDoesNotDoubleCount() {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.GET, "/users/4");
        channel.writeInbound(request);

        channel.pipeline().fireExceptionCaught(new RuntimeException("boom"));
        drainOutbound();
        // channel may be closed by exceptionCaught.
        if (channel.isOpen())
            channel.close().syncUninterruptibly();

        Timer t = registry.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t, "exception path must record one duration sample");
        assertEquals(1L, t.count(), "must not double-count when channelInactive runs after exceptionCaught");
        assertEquals("500",          tagMap(t).get("http.response.status_code"));
        assertEquals("SERVER_ERROR", tagMap(t).get("outcome"));
        assertEquals(0L, server.getMetrics().activeRequests());
    }

    @Test
    void clientDisconnectFlushesMetricWithUnknownStatus() {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.POST, "/users/5");
        channel.writeInbound(request);

        // SendResponse never runs.
        channel.close().syncUninterruptibly();

        Timer t = registry.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t, "channelInactive must flush a residual request as a duration sample");
        assertEquals(1L, t.count());
        assertEquals("UNKNOWN", tagMap(t).get("outcome"),
          "missing status must bucket to UNKNOWN");
        assertEquals(0L, server.getMetrics().activeRequests());
    }

    private void drainOutbound() {
        FullHttpResponse outbound = channel.readOutbound();
        while (outbound != null) {
            outbound.release();
            outbound = channel.readOutbound();
        }
    }

    private static Map<String,String> tagMap(Timer t) {
        return t.getId().getTags().stream().collect(Collectors.toMap(Tag::getKey, Tag::getValue));
    }

    /**
     * RestServer test double that wires in a real {@link QRestMetrics} backed by a
     * {@link SimpleMeterRegistry} and resolves {@code /users/{id}} as a known route.
     */
    private static class MetricsCapturingRestServer extends RestServer {
        private final QRestMetrics metrics;
        Context lastQueuedContext;

        MetricsCapturingRestServer(SimpleMeterRegistry registry) {
            this.metrics = new QRestMetrics(registry, "rest-metrics", QRestMetrics.PathLabel.ROUTE, 100);
        }

        @Override
        QRestMetrics getMetrics() {
            return metrics;
        }

        @Override
        boolean isTLSEnabled() {
            return false;
        }

        @Override
        public void queue(FullHttpRequest request, Context ctx) {
            lastQueuedContext = ctx;
            ChannelHandlerContext ch = ctx.get(Constants.SESSION);
            if (ch != null) {
                RestAccessState state = ch.channel().attr(RestSession.ACCESS_STATE).get();
                if (state != null) {
                    state.queue = "WEB.QUEUE";
                    state.route = "/users/{id}";
                }
            }
        }
    }
}
