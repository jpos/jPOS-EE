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
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http.cors.CorsConfig;
import io.netty.handler.codec.http.cors.CorsHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.AttributeKey;
import io.netty.util.CharsetUtil;
import org.jpos.qrest.evt.QRestAccess;
import org.jpos.transaction.Context;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.time.Instant;
import java.util.UUID;
import java.util.function.BiConsumer;

import static io.netty.buffer.Unpooled.copiedBuffer;

public class RestSession extends ChannelInboundHandlerAdapter {
    private RestServer server;
    private String contentKey;
    private AttributeKey<HttpVersion> httpVersion = AttributeKey.valueOf("httpVersion");

    static final AttributeKey<RestAccessState> ACCESS_STATE = AttributeKey.valueOf("qrestAccessState");
    static final AttributeKey<BiConsumer<QRestAccess, UUID>> ACCESS_EMITTER = AttributeKey.valueOf("qrestAccessEmitter");
    static final AttributeKey<UUID> TRACE_ID = AttributeKey.valueOf("qrestTraceId");

    RestSession(RestServer server) {
        this.server = server;
        contentKey = server.getConfiguration().get("content", null);
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        super.handlerAdded(ctx);
        ctx.channel().attr(ACCESS_EMITTER).set(this::emitAccessLog);
        ctx.channel().attr(TRACE_ID).set(UuidV7.randomUuidV7());
    }

    @Override
    public void channelRead(ChannelHandlerContext ch, Object msg) throws Exception {
        if (msg instanceof FullHttpRequest) {
            final FullHttpRequest request = (FullHttpRequest) msg;
            if (request.method().equals(HttpMethod.OPTIONS)) {
                CorsConfig corsConfig = server.getCorsConfig(request);
                if (corsConfig != null) {
                    new CorsHandler(corsConfig).channelRead(ch, msg);
                    return;
                }
            }
            captureRequest(ch, request);
            Context ctx = new Context();
            ctx.put(Constants.SESSION, ch);
            ctx.put(Constants.REQUEST, request);
            ch.channel().attr(httpVersion).set(request.protocolVersion());

            if (contentKey != null)
                ctx.put(contentKey, request.content().toString(CharsetUtil.UTF_8));
            server.queue(request, ctx);
        } else {
            super.channelRead(ch, msg);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        String msg = cause.getMessage();
        LogEvent evt = server.getLog().createWarn(ctx.channel() + " " + msg);
        while (cause.getCause() != null) {
            cause = cause.getCause();
            if (msg != null && !msg.equals(cause.getMessage())) {
                msg = cause.getMessage();
                evt.addMessage("  " + msg);
            }
        }
        Logger.log(evt);

        HttpVersion version = ctx.channel().attr(httpVersion).get();

        RestAccessState state = ctx.channel().attr(ACCESS_STATE).get();
        if (state != null && state.status == null)
            state.status = HttpResponseStatus.INTERNAL_SERVER_ERROR.code();

        ctx.writeAndFlush(new DefaultFullHttpResponse(
          version,
          HttpResponseStatus.INTERNAL_SERVER_ERROR,
          copiedBuffer(cause.getMessage().getBytes())
        ));
        ctx.close();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        RestAccessState state = ctx.channel().attr(ACCESS_STATE).getAndSet(null);
        if (state != null)
            emitAccessLog(state.toAccess(), ctx.channel().attr(TRACE_ID).get());
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) {
        if (evt instanceof IdleStateEvent) {
            IdleState e = ((IdleStateEvent) evt).state();
            if (e == IdleState.READER_IDLE) {
                ctx.fireChannelInactive();
                ctx.close();
            }
        }
    }

    /**
     * Emits one structured QRest audit-log event. The trace-id (a session-scoped
     * UUIDv7) is attached to the {@link LogEvent} so all events from the same
     * keep-alive session share it. Visible for testing.
     */
    protected void emitAccessLog(QRestAccess access, UUID traceId) {
        LogEvent evt = new LogEvent(server.getLog(), "qrest-access");
        if (traceId != null)
            evt.withTraceId(traceId);
        evt.addMessage(access);
        Logger.log(evt);
    }

    private void captureRequest(ChannelHandlerContext ch, FullHttpRequest request) {
        RestAccessState state = new RestAccessState();
        state.ts = Instant.now();
        state.startNanos = System.nanoTime();
        state.method = request.method().name();
        state.path = stripQuery(request.uri());
        state.remote = remoteAddress(ch);
        state.requestBytes = (long) request.content().readableBytes();
        ch.channel().attr(ACCESS_STATE).set(state);
    }

    private String stripQuery(String uri) {
        if (uri == null)
            return null;
        int q = uri.indexOf('?');
        return q < 0 ? uri : uri.substring(0, q);
    }

    private String remoteAddress(ChannelHandlerContext ch) {
        SocketAddress addr = ch.channel().remoteAddress();
        if (addr instanceof InetSocketAddress isa && isa.getAddress() != null)
            return isa.getAddress().getHostAddress();
        return addr != null ? addr.toString() : null;
    }
}
