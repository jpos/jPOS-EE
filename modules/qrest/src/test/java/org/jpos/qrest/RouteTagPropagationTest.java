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
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Regression test for the {@code http_route="_unmatched"} leak: verifies that
 * a route pattern written via {@link RestSession#setMatchedRoute} is the value
 * that ultimately ends up on the {@code http.route} timer tag.
 */
class RouteTagPropagationTest {

    private EmbeddedChannel channel;
    private ChannelHandlerContext ch;

    @BeforeEach
    void setUp() {
        channel = new EmbeddedChannel(new ChannelInboundHandlerAdapter());
        ch = channel.pipeline().firstContext();
        RestAccessStateAccessor.attachFreshState(ch);
    }

    @AfterEach
    void tearDown() {
        if (channel != null && channel.isOpen())
            channel.finishAndReleaseAll();
    }

    @Test
    void matchedRouteFromParticipantSurfacesAsHttpRouteTag() {
        // Simulates what Router.select() now does after route resolution.
        RestSession.setMatchedRoute(ch, "/users/{id}");
        RestAccessStateAccessor.populateForMetrics(ch, "GET", "/users/42", 200, "WEB.QUEUE");

        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        m.requestCompleted(RestAccessStateAccessor.getState(ch));

        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t);
        Map<String,String> tags = t.getId().getTags().stream()
          .collect(Collectors.toMap(Tag::getKey, Tag::getValue));
        assertEquals("/users/{id}", tags.get("http.route"),
          "route pattern set by a TM participant must reach the http.route tag");
    }

    @Test
    void noRouteSetFallsBackToUnmatchedSentinel() {
        RestAccessStateAccessor.populateForMetrics(ch, "GET", "/whatever", 404, "WEB.QUEUE");

        SimpleMeterRegistry reg = new SimpleMeterRegistry();
        QRestMetrics m = new QRestMetrics(reg, "rest", QRestMetrics.PathLabel.ROUTE, 100);
        m.requestCompleted(RestAccessStateAccessor.getState(ch));

        Timer t = reg.find(QRestMetrics.REQUEST_DURATION).timer();
        assertNotNull(t);
        Map<String,String> tags = t.getId().getTags().stream()
          .collect(Collectors.toMap(Tag::getKey, Tag::getValue));
        assertEquals(QRestMetrics.UNMATCHED_ROUTE, tags.get("http.route"),
          "_unmatched must remain reserved for genuinely unmatched paths");
    }
}
