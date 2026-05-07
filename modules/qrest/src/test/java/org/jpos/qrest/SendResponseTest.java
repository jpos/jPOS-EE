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
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import org.jpos.qrest.evt.QRestAccess;
import org.jpos.transaction.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

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

    @Test
    void commitHandlesMissingRequest() {
        assertDoesNotThrow(() -> participant.commit(3L, createContext(null)));

        FullHttpResponse outbound = channel.readOutbound();
        assertNotNull(outbound);
        assertEquals(HttpResponseStatus.OK, outbound.status());
        outbound.release();
        assertNull(channel.readOutbound());
    }

    @Test
    void abortHandlesMissingRequest() {
        assertDoesNotThrow(() -> participant.abort(4L, createContext(null)));

        FullHttpResponse outbound = channel.readOutbound();
        assertNotNull(outbound);
        assertEquals(HttpResponseStatus.OK, outbound.status());
        outbound.release();
        assertNull(channel.readOutbound());
    }

    @Test
    void commitEmitsViaAccessEmitterAndClearsState() {
        RestAccessState state = new RestAccessState();
        state.method = "GET";
        state.path = "/balance";
        channel.attr(RestSession.ACCESS_STATE).set(state);

        List<QRestAccess> emitted = Collections.synchronizedList(new ArrayList<>());
        List<UUID> traceIds = Collections.synchronizedList(new ArrayList<>());
        channel.attr(RestSession.ACCESS_EMITTER).set((access, traceId) -> {
            emitted.add(access);
            traceIds.add(traceId);
        });
        UUID sessionTraceId = UUID.randomUUID();
        channel.attr(RestSession.TRACE_ID).set(sessionTraceId);

        DefaultFullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, "/balance");
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);

        participant.commit(20L, createContext(request));

        assertEquals(1, emitted.size(),
          "SendResponse must emit exactly one QRestAccess via the ACCESS_EMITTER hook");
        QRestAccess evt = emitted.get(0);
        assertEquals(Integer.valueOf(200), evt.status());
        assertNotNull(evt.responseBytes());

        assertEquals(sessionTraceId, traceIds.get(0),
          "SendResponse must forward the session-scoped trace-id to the emitter");

        assertNull(channel.attr(RestSession.ACCESS_STATE).get(),
          "SendResponse must clear ACCESS_STATE so the next keep-alive request starts fresh");

        FullHttpResponse outbound = channel.readOutbound();
        if (outbound != null)
            outbound.release();
    }

    @Test
    void commitWithoutAccessStateIsHarmless() {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.POST, "/orders");
        request.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);

        // no RestAccessState and no ACCESS_EMITTER on the channel — SendResponse must tolerate it
        Context ctx = createContext(request);
        assertDoesNotThrow(() -> participant.commit(21L, ctx));

        FullHttpResponse outbound = channel.readOutbound();
        if (outbound != null)
            outbound.release();
    }

    private Context createContext(FullHttpRequest request) {
        Context ctx = new Context();
        ctx.put(Constants.SESSION, channelHandlerContext);
        ctx.put(Constants.REQUEST, request);
        ctx.put(Constants.RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK));
        return ctx;
    }
}
