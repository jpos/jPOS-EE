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
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the WebSocket-related entry points on {@link QRestMetrics}.
 * Covers tagging, gauge increment/decrement, no-op behavior when the registry
 * is null, frame-type normalization, and that exception messages are not used
 * as tag values.
 */
class QRestWebSocketMetricsTest {

    @Test
    void noopWhenRegistryIsNull() {
        QRestMetrics m = new QRestMetrics(null, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        assertFalse(m.isEnabled());
        // Must not throw.
        m.webSocketConnected("/ws/chat", "WS.QUEUE");
        m.webSocketFrameReceived("/ws/chat", "WS.QUEUE", "text", 11L);
        m.webSocketFrameSent("/ws/chat", "WS.QUEUE", "binary", 23L);
        m.webSocketError("/ws/chat", "WS.QUEUE", new RuntimeException("boom"));
        m.webSocketMessageQueued("/ws/chat", "WS.QUEUE", "text", 7L);
        m.webSocketClosed("/ws/chat", "WS.QUEUE", 1000);
        assertEquals(0L, m.activeWebSockets());
    }

    @Test
    void connectedIncrementsGaugeAndRegistersOpenedCounter() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);

        m.webSocketConnected("/ws/chat", "WS.QUEUE");
        m.webSocketConnected("/ws/chat", "WS.QUEUE");

        Gauge g = reg.find(QRestMetrics.WS_CONNECTIONS_ACTIVE).gauge();
        assertNotNull(g, "active gauge must be registered");
        assertEquals(2.0, g.value(), 0.0001);
        assertEquals(2L, m.activeWebSockets());

        Counter opened = reg.find(QRestMetrics.WS_CONNECTIONS_OPENED).counter();
        assertNotNull(opened);
        assertEquals(2.0, opened.count(), 0.0001);
        Map<String,String> tags = tagMap(opened);
        assertEquals("/ws/chat", tags.get("ws.route"));
        assertEquals("WS.QUEUE", tags.get("queue"));
        assertEquals("rest", tags.get("server"));
    }

    @Test
    void closedDecrementsActiveGaugeAndDoesNotGoNegativeOnDuplicate() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);

        m.webSocketConnected("/ws/chat", "WS.QUEUE");
        m.webSocketClosed("/ws/chat", "WS.QUEUE", 1000);
        m.webSocketClosed("/ws/chat", "WS.QUEUE", 1006);

        assertEquals(0L, m.activeWebSockets(), "active gauge must clamp at zero");
        assertEquals(0.0, reg.find(QRestMetrics.WS_CONNECTIONS_ACTIVE).gauge().value(), 0.0001);

        // both close events are still counted.
        double closedTotal = reg.find(QRestMetrics.WS_CONNECTIONS_CLOSED).counters().stream()
          .mapToDouble(Counter::count).sum();
        assertEquals(2.0, closedTotal, 0.0001);

        // close.status tag is present.
        boolean has1000 = reg.find(QRestMetrics.WS_CONNECTIONS_CLOSED).counters().stream()
          .anyMatch(c -> "1000".equals(tagMap(c).get("close.status")));
        assertTrue(has1000, "close.status must be tagged");
    }

    @Test
    void frameReceivedTagsMatchSpec() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);

        m.webSocketFrameReceived("/ws/chat", "WS.QUEUE", "text", 42L);

        Counter c = reg.find(QRestMetrics.WS_FRAMES_RECEIVED).counter();
        assertNotNull(c);
        assertEquals(1.0, c.count(), 0.0001);
        Map<String,String> tags = tagMap(c);
        assertEquals("/ws/chat", tags.get("ws.route"));
        assertEquals("WS.QUEUE", tags.get("queue"));
        assertEquals("rest",     tags.get("server"));
        assertEquals("text",     tags.get("frame.type"));
        assertEquals("in",       tags.get("direction"));

        DistributionSummary s = reg.find(QRestMetrics.WS_FRAME_SIZE).summary();
        assertNotNull(s);
        assertEquals(1L, s.count());
        assertEquals(42.0, s.totalAmount(), 0.0001);
        assertEquals("in", tagMap(s).get("direction"));
        assertEquals("bytes", s.getId().getBaseUnit());
    }

    @Test
    void frameSentTagsDirectionOut() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);

        m.webSocketFrameSent("/ws/chat", "WS.QUEUE", "binary", 99L);

        Counter c = reg.find(QRestMetrics.WS_FRAMES_SENT).counter();
        assertNotNull(c);
        assertEquals("binary", tagMap(c).get("frame.type"));
        assertEquals("out",    tagMap(c).get("direction"));

        DistributionSummary s = reg.find(QRestMetrics.WS_FRAME_SIZE).summary();
        assertNotNull(s);
        assertEquals("out", tagMap(s).get("direction"));
        assertEquals(99.0, s.totalAmount(), 0.0001);
    }

    @Test
    void unknownFrameTypeIsNormalized() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);

        m.webSocketFrameReceived("/ws/chat", "WS.QUEUE", "WhAtEvEr", 1L);
        m.webSocketFrameReceived("/ws/chat", "WS.QUEUE", null, 1L);

        boolean foundUnknown = reg.find(QRestMetrics.WS_FRAMES_RECEIVED).counters().stream()
          .anyMatch(c -> QRestMetrics.WS_FRAME_UNKNOWN.equals(tagMap(c).get("frame.type")));
        assertTrue(foundUnknown, "unrecognized frame.type must collapse to 'unknown'");
    }

    @Test
    void unmatchedRouteUsesPlaceholder() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);

        m.webSocketFrameReceived(null, null, "text", 1L);

        Counter c = reg.find(QRestMetrics.WS_FRAMES_RECEIVED).counter();
        assertNotNull(c);
        assertEquals(QRestMetrics.UNMATCHED_ROUTE, tagMap(c).get("ws.route"));
        assertEquals(QRestMetrics.UNKNOWN_QUEUE,   tagMap(c).get("queue"));
    }

    @Test
    void errorIncrementsCounterWithoutExceptionMessageAsTag() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);

        m.webSocketError("/ws/chat", "WS.QUEUE", new IllegalStateException("highly specific error"));

        Counter c = reg.find(QRestMetrics.WS_ERRORS).counter();
        assertNotNull(c);
        assertEquals(1.0, c.count(), 0.0001);
        Map<String,String> tags = tagMap(c);
        assertEquals("/ws/chat", tags.get("ws.route"));
        assertEquals("WS.QUEUE", tags.get("queue"));
        assertEquals("rest",     tags.get("server"));
        // No tag should carry the exception message.
        assertFalse(tags.values().stream().anyMatch(v -> v.contains("highly specific error")),
          "exception message must not be used as a tag value");
        assertNull(tags.get("error.message"));
    }

    @Test
    void messagesQueuedTagsIncludeFrameTypeAndQueue() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);

        m.webSocketMessageQueued("/ws/chat", "TXNMGR.WS", "text", 17L);

        Counter c = reg.find(QRestMetrics.WS_MESSAGES_QUEUED).counter();
        assertNotNull(c);
        assertEquals(1.0, c.count(), 0.0001);
        Map<String,String> tags = tagMap(c);
        assertEquals("/ws/chat",  tags.get("ws.route"));
        assertEquals("TXNMGR.WS", tags.get("queue"));
        assertEquals("text",      tags.get("frame.type"));
    }

    @Test
    void cardinalityCapAppliesToWebSocketRoutes() {
        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 2);

        m.webSocketFrameReceived("/a", "Q", "text", 1L);
        m.webSocketFrameReceived("/b", "Q", "text", 1L);
        m.webSocketFrameReceived("/c", "Q", "text", 1L);
        m.webSocketFrameReceived("/d", "Q", "text", 1L);

        boolean overflowed = reg.find(QRestMetrics.WS_FRAMES_RECEIVED).counters().stream()
          .anyMatch(c -> QRestMetrics.OVERFLOW_ROUTE.equals(tagMap(c).get("ws.route")));
        assertTrue(overflowed, "third+ distinct ws.route values must collapse into _overflow");
    }

    private static Map<String,String> tagMap(Meter meter) {
        return meter.getId().getTags().stream()
          .collect(Collectors.toMap(Tag::getKey, Tag::getValue));
    }
}
