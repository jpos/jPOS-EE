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
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import org.jpos.transaction.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SendResponseTest {
    private SendResponse participant;
    private EmbeddedChannel channel;
    private ChannelHandlerContext channelHandlerContext;

    @BeforeEach
    void setUp() {
        participant = new SendResponse();
        channel = new EmbeddedChannel(new ChannelInboundHandlerAdapter() {
            @Override
            public void handlerAdded(ChannelHandlerContext ctx) {
                channelHandlerContext = ctx;
            }
        });
    }

    @AfterEach
    void tearDown() {
        if (channel != null)
            channel.finishAndReleaseAll();
    }

    @Test
    void commitWritesResponseAndReleasesRequest() {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, "/balance");
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);

        participant.commit(1L, createContext(request));

        assertEquals(0, request.refCnt());
        FullHttpResponse outbound = channel.readOutbound();
        assertNotNull(outbound);
        assertEquals(HttpResponseStatus.OK, outbound.status());
        assertEquals(String.valueOf(outbound.content().readableBytes()), outbound.headers().get(HttpHeaderNames.CONTENT_LENGTH));
        outbound.release();
        assertNull(channel.readOutbound());
    }

    @Test
    void commitSkipsReleaseWhenRequestWasAlreadyReleased() {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, "/balance");
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        assertTrue(request.release());

        assertDoesNotThrow(() -> participant.commit(2L, createContext(request)));

        assertEquals(0, request.refCnt());
        FullHttpResponse outbound = channel.readOutbound();
        assertNotNull(outbound);
        assertEquals(HttpResponseStatus.OK, outbound.status());
        outbound.release();
        assertNull(channel.readOutbound());
    }

    private Context createContext(DefaultFullHttpRequest request) {
        Context ctx = new Context();
        ctx.put(Constants.SESSION, channelHandlerContext);
        ctx.put(Constants.REQUEST, request);
        ctx.put(Constants.RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK));
        return ctx;
    }
}

