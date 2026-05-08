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

import io.netty.channel.ChannelHandlerContext;

/**
 * Test-only bridge into the package-private {@link RestAccessState}
 * carrier and {@link RestSession#ACCESS_STATE} channel attribute.
 * Lives in the same package as the production code so it can read/write
 * the package-private fields without forcing them to be public in the API.
 */
public final class RestAccessStateAccessor {
    private RestAccessStateAccessor() { }

    /** Attaches a fresh {@link RestAccessState} to the channel attribute. */
    public static void attachFreshState(ChannelHandlerContext ch) {
        ch.channel().attr(RestSession.ACCESS_STATE).set(new RestAccessState());
    }

    /** Returns the access state currently on the channel, or {@code null}. */
    public static RestAccessState getState(ChannelHandlerContext ch) {
        return ch.channel().attr(RestSession.ACCESS_STATE).get();
    }

    /** Returns the matched route stored on the access state, or {@code null}. */
    public static String getRoute(ChannelHandlerContext ch) {
        RestAccessState s = getState(ch);
        return s != null ? s.route : null;
    }

    /**
     * Fills in the minimum fields needed for {@link QRestMetrics#requestCompleted}
     * to record a sample. {@code state.route} is intentionally left untouched so
     * tests can assert that route propagation happened earlier in the pipeline.
     */
    public static void populateForMetrics(ChannelHandlerContext ch,
                                          String method, String path,
                                          int status, String queue) {
        RestAccessState s = getState(ch);
        if (s == null)
            return;
        s.method = method;
        s.path = path;
        s.status = status;
        s.queue = queue;
        s.scheme = "http";
        s.protocolVersion = "1.1";
        s.startNanos = System.nanoTime() - 1_000_000L;
        s.requestBytes = 0L;
        s.responseBytes = 0L;
    }
}
