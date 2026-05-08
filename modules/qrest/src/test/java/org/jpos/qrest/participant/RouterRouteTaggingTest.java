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

package org.jpos.qrest.participant;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;
import org.jdom2.Element;
import org.jpos.qrest.Constants;
import org.jpos.qrest.RestAccessStateAccessor;
import org.jpos.transaction.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Regression test for the {@code http_route="_unmatched"} leak.
 *
 * <p>When routes are registered under a {@code Router} participant in the
 * TransactionManager (the standard jPOS-EE deployment pattern), the matched
 * pattern must be propagated back to the per-request access state so that
 * the metrics tag uses the route template instead of the {@code _unmatched}
 * sentinel.</p>
 */
class RouterRouteTaggingTest {

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
    void matchedRouteIsWrittenBackToAccessState() throws Exception {
        Router router = new Router();
        router.setConfiguration(routerConfig(
          route("GET", "/login"),
          route("GET", "/users/{id}")
        ));

        Context ctx = new Context();
        ctx.put(Constants.SESSION, ch);
        ctx.put(Constants.REQUEST, new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.GET, "/users/42"));

        String group = router.select(1L, ctx);
        // We didn't set a "name" attribute, so apply() returns null — that's fine,
        // we only care about the side-effect on state.route here.
        // (returns null is OK; the test asserts the state mutation.)

        assertEquals("/users/{id}", RestAccessStateAccessor.getRoute(ch),
          "Router must propagate matched pattern to RestAccessState.route");
    }

    @Test
    void unmatchedRoutesDoNotMutateState() throws Exception {
        Router router = new Router();
        router.setConfiguration(routerConfig(route("GET", "/login")));

        Context ctx = new Context();
        ctx.put(Constants.SESSION, ch);
        ctx.put(Constants.REQUEST, new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.GET, "/nonexistent"));

        router.select(1L, ctx);

        assertNull(RestAccessStateAccessor.getRoute(ch),
          "unmatched paths must leave state.route untouched so metrics report _unmatched");
    }

    private static Element routerConfig(Element... routes) {
        Element parent = new Element("router");
        for (Element r : routes)
            parent.addContent(r);
        return parent;
    }

    private static Element route(String method, String path) {
        Element r = new Element("route");
        r.setAttribute("method", method);
        r.setAttribute("path", path);
        // No name → supplier returns null; that's fine, we only test the state mutation.
        return r;
    }
}
