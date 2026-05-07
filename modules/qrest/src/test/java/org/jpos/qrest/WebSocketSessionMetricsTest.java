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

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PingWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PongWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.jpos.core.SimpleConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Verifies that WebSocket frame events recorded by {@link WebSocketSession} are
 * tagged with the configured WebSocket route/template (not the raw URI) and are
 * counted on the right meters via the actual session lifecycle.
 */
class WebSocketSessionMetricsTest {

    private SimpleMeterRegistry registry;
    private MetricsRestServer server;
    private EmbeddedChannel channel;
    private WebSocketSession session;

    @BeforeEach
    void setUp() throws Exception {
        registry = new SimpleMeterRegistry();
        server = new MetricsRestServer(registry);
        server.setName("rest-ws");
        server.setConfiguration(new SimpleConfiguration());

        RestServer.WebSocketRouteMatch match =
          new RestServer.WebSocketRouteMatch("WS.QUEUE", "/ws/chat/**", false);
        session = new WebSocketSession(server, null, "/ws/chat/room42", null, java.util.Map.of(), match);
        channel = new EmbeddedChannel(session);
    }

    @AfterEach
    void tearDown() {
        if (channel != null && channel.isOpen())
            channel.finishAndReleaseAll();
        if (registry != null)
            registry.close();
    }

    @Test
    void textFrameIncrementsReceivedCounterWithRouteTemplate() {
        channel.writeInbound(new TextWebSocketFrame("hello"));

        Counter c = registry.find(QRestMetrics.WS_FRAMES_RECEIVED).counter();
        assertNotNull(c);
        Map<String,String> tags = tagMap(c);
        assertEquals("text",       tags.get("frame.type"));
        assertEquals("in",         tags.get("direction"));
        assertEquals("/ws/chat/**", tags.get("ws.route"),
          "must use configured route template, not raw /ws/chat/room42");
        assertEquals("WS.QUEUE",   tags.get("queue"));
        assertEquals("rest-ws",    tags.get("server"));
    }

    @Test
    void binaryFrameIncrementsReceivedAndSizesCorrectly() {
        byte[] payload = new byte[]{1, 2, 3, 4, 5};
        channel.writeInbound(new BinaryWebSocketFrame(Unpooled.wrappedBuffer(payload)));

        Counter c = registry.find(QRestMetrics.WS_FRAMES_RECEIVED).counter();
        assertNotNull(c);
        assertEquals("binary", tagMap(c).get("frame.type"));

        var s = registry.find(QRestMetrics.WS_FRAME_SIZE).summary();
        assertNotNull(s);
        assertEquals(5.0, s.totalAmount(), 0.0001);
    }

    @Test
    void pingFrameIsCountedAsInboundAndPongIsCountedAsOutbound() {
        channel.writeInbound(new PingWebSocketFrame(Unpooled.wrappedBuffer(new byte[]{9, 9})));

        boolean inboundPing = registry.find(QRestMetrics.WS_FRAMES_RECEIVED).counters().stream()
          .anyMatch(c -> "ping".equals(tagMap(c).get("frame.type")));
        assertTrue(inboundPing, "inbound ping must be counted as frames.received with frame.type=ping");

        boolean outboundPong = registry.find(QRestMetrics.WS_FRAMES_SENT).counters().stream()
          .anyMatch(c -> "pong".equals(tagMap(c).get("frame.type")));
        assertTrue(outboundPong, "echoed pong must be counted as frames.sent with frame.type=pong");
    }

    @Test
    void pongFrameIsCountedAsInbound() {
        channel.writeInbound(new PongWebSocketFrame(Unpooled.wrappedBuffer(new byte[]{1})));

        boolean inboundPong = registry.find(QRestMetrics.WS_FRAMES_RECEIVED).counters().stream()
          .anyMatch(c -> "pong".equals(tagMap(c).get("frame.type")));
        assertTrue(inboundPong);
    }

    @Test
    void exceptionCaughtIncrementsErrorsAndDoesNotLeakExceptionMessage() {
        channel.pipeline().fireExceptionCaught(new IllegalStateException("specific-leaky-message"));
        // exceptionCaught closes the channel.

        Counter c = registry.find(QRestMetrics.WS_ERRORS).counter();
        assertNotNull(c);
        assertEquals(1.0, c.count(), 0.0001);
        boolean leaked = c.getId().getTags().stream()
          .anyMatch(t -> t.getValue().contains("specific-leaky-message"));
        assertEquals(false, leaked, "exception message must not be tagged");
    }

    @Test
    void channelInactiveRecordsConnectionClosedExactlyOnce() {
        // No prior connect — start the gauge at zero so the decrement clamps cleanly.
        channel.close().syncUninterruptibly();
        // Send a second close just in case (no-op).
        if (channel.isOpen())
            channel.close().syncUninterruptibly();

        double closedTotal = registry.find(QRestMetrics.WS_CONNECTIONS_CLOSED).counters().stream()
          .mapToDouble(Counter::count).sum();
        assertEquals(1.0, closedTotal, 0.0001,
          "channelInactive must increment the closed counter exactly once");
    }

    private static Map<String,String> tagMap(Counter c) {
        return c.getId().getTags().stream().collect(Collectors.toMap(Tag::getKey, Tag::getValue));
    }

    /** Test double exposing a real {@link QRestMetrics} backed by a {@link SimpleMeterRegistry}. */
    private static class MetricsRestServer extends RestServer {
        private final QRestMetrics metrics;

        MetricsRestServer(SimpleMeterRegistry reg) {
            this.metrics = new QRestMetrics(reg, "rest-ws", QRestMetrics.PathLabel.ROUTE, 100);
        }

        @Override
        QRestMetrics getMetrics() {
            return metrics;
        }
    }
}
