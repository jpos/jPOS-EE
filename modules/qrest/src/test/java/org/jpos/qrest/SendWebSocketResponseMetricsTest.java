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
import io.micrometer.core.instrument.DistributionSummary;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import org.jpos.core.SimpleConfiguration;
import org.jpos.transaction.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Verifies that {@link SendWebSocketResponse} records outgoing-frame metrics
 * with the correct direction, frame type and configured route, and does not
 * alter the existing frame ownership/release behavior.
 */
class SendWebSocketResponseMetricsTest {

    private SimpleMeterRegistry registry;
    private MetricsRestServer server;
    private EmbeddedChannel channel;
    private WebSocketSession session;

    @BeforeEach
    void setUp() throws Exception {
        registry = new SimpleMeterRegistry();
        server = new MetricsRestServer(registry);
        server.setName("rest-ws-send");
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
    void textResponseIncrementsSentCounterWithRouteTemplate() {
        Context ctx = new Context();
        ctx.put(WsConstants.WS_SESSION, channel.pipeline().firstContext());
        ctx.put(WsConstants.WS_PATH, "/ws/chat/room42");
        ctx.put(Constants.RESPONSE, "hello world");

        new SendWebSocketResponse().commit(1L, ctx);

        WebSocketFrame outbound = channel.readOutbound();
        assertNotNull(outbound, "TextWebSocketFrame must be written to the channel");
        try {
            assertTrue(outbound instanceof TextWebSocketFrame);
            assertEquals("hello world", ((TextWebSocketFrame) outbound).text());
        } finally {
            outbound.release();
        }

        Counter c = registry.find(QRestMetrics.WS_FRAMES_SENT).counter();
        assertNotNull(c);
        Map<String,String> tags = tagMap(c);
        assertEquals("text",       tags.get("frame.type"));
        assertEquals("out",        tags.get("direction"));
        assertEquals("/ws/chat/**", tags.get("ws.route"),
          "must use configured route template, not raw /ws/chat/room42");

        DistributionSummary s = registry.find(QRestMetrics.WS_FRAME_SIZE).summary();
        assertNotNull(s);
        assertEquals(11.0, s.totalAmount(), 0.0001);
    }

    @Test
    void binaryResponseIncrementsSentCounter() {
        Context ctx = new Context();
        ctx.put(WsConstants.WS_SESSION, channel.pipeline().firstContext());
        ctx.put(WsConstants.WS_PATH, "/ws/chat/room42");
        ctx.put(Constants.RESPONSE, new byte[]{1, 2, 3, 4});

        new SendWebSocketResponse().commit(1L, ctx);

        WebSocketFrame outbound = channel.readOutbound();
        assertNotNull(outbound);
        try {
            assertTrue(outbound instanceof BinaryWebSocketFrame);
        } finally {
            outbound.release();
        }

        Counter c = registry.find(QRestMetrics.WS_FRAMES_SENT).counter();
        assertNotNull(c);
        Map<String,String> tags = tagMap(c);
        assertEquals("binary", tags.get("frame.type"));
        assertEquals("out",    tags.get("direction"));

        DistributionSummary s = registry.find(QRestMetrics.WS_FRAME_SIZE).summary();
        assertNotNull(s);
        assertEquals(4.0, s.totalAmount(), 0.0001);
    }

    private static Map<String,String> tagMap(Counter c) {
        return c.getId().getTags().stream().collect(Collectors.toMap(Tag::getKey, Tag::getValue));
    }

    /** RestServer test double exposing a real {@link QRestMetrics}. */
    private static class MetricsRestServer extends RestServer {
        private final QRestMetrics metrics;

        MetricsRestServer(SimpleMeterRegistry reg) {
            this.metrics = new QRestMetrics(reg, "rest-ws-send", QRestMetrics.PathLabel.ROUTE, 100);
        }

        @Override
        QRestMetrics getMetrics() {
            return metrics;
        }
    }
}
