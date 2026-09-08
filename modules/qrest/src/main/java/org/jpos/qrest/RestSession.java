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
import io.netty.util.ReferenceCountUtil;
import org.jpos.qrest.evt.QRestAccess;
import org.jpos.transaction.Context;
import org.jpos.qrest.evt.QRestAuditLogEventProvider;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.time.Instant;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import static io.netty.buffer.Unpooled.copiedBuffer;

public class RestSession extends ChannelInboundHandlerAdapter {
    private RestServer server;
    private String contentKey;
    private TrustedProxies trustedProxies;
    private Set<String> maskedHeaders;
    private final int requestTimeout;
    static final AttributeKey<Set<RestAccessState>> PENDING = AttributeKey.valueOf("qrestPendingAccess");
    private AttributeKey<HttpVersion> httpVersion = AttributeKey.valueOf("httpVersion");

    static final AttributeKey<RestAccessState> ACCESS_STATE = AttributeKey.valueOf("qrestAccessState");
    static final AttributeKey<BiConsumer<QRestAccess, UUID>> ACCESS_EMITTER = AttributeKey.valueOf("qrestAccessEmitter");
    static final AttributeKey<UUID> TRACE_ID = AttributeKey.valueOf("qrestTraceId");
    static final AttributeKey<QRestMetrics> METRICS = AttributeKey.valueOf("qrestMetrics");

    RestSession(RestServer server) {
        this.server = server;
        requestTimeout = server.getConfiguration().getInt("request-timeout",
          server.getConfiguration().getInt("timeout", 300));
        contentKey = server.getConfiguration().get("content", null);
        trustedProxies = TrustedProxies.parse(
          server.getConfiguration().get("trusted-proxy-cidrs", null));
        maskedHeaders = Arrays.stream(server.getConfiguration().get("masked-headers", "").split("[,\\s]+"))
          .filter(s -> !s.isBlank())
          .collect(Collectors.toUnmodifiableSet());
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        super.handlerAdded(ctx);
        ctx.channel().attr(PENDING).set(ConcurrentHashMap.newKeySet());
        ctx.channel().attr(ACCESS_EMITTER).set(this::emitAccessLog);
        ctx.channel().attr(TRACE_ID).set(UuidV7.randomUuidV7());
        QRestMetrics m = server.getMetrics();
        if (m != null)
            ctx.channel().attr(METRICS).set(m);
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
            try {
                // Never transfer pooled transport storage into a leased Space entry.
                FullHttpRequest detached = LoggeableHttpRequest.snapshot(request, maskedHeaders);
                RestAccessState state = captureRequest(ch, detached);
                Context ctx = new Context();
                ctx.put(Constants.SESSION, ch);
                ctx.put(Constants.REQUEST, detached);
                ctx.put(Constants.ACCESS_STATE, state);
                ch.channel().attr(httpVersion).set(detached.protocolVersion());
                if (contentKey != null)
                    ctx.put(contentKey, detached.content().toString(CharsetUtil.UTF_8));
                server.queue(detached, ctx);
            } finally {
                ReferenceCountUtil.release(request);
            }
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
        if (version == null)
            version = HttpVersion.HTTP_1_1;

        RestAccessState state = ctx.channel().attr(ACCESS_STATE).get();
        if (state != null) {
            synchronized (state) {
                if (!state.completed && state.status == null)
                    state.status = HttpResponseStatus.INTERNAL_SERVER_ERROR.code();
            }
        }

        ctx.writeAndFlush(new DefaultFullHttpResponse(
          version,
          HttpResponseStatus.INTERNAL_SERVER_ERROR,
          copiedBuffer("Internal Server Error", CharsetUtil.UTF_8)
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
        completePending(ctx);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        try {
            completePending(ctx);
        } finally {
            super.handlerRemoved(ctx);
        }
    }

    private static void completePending(ChannelHandlerContext ch) {
        Set<RestAccessState> pending = ch.channel().attr(PENDING).get();
        if (pending != null)
            for (RestAccessState state : pending.toArray(RestAccessState[]::new))
                completeAccess(ch, state, null, null);
        // Compatibility for callers which install access state directly.
        completeAccess(ch, ch.channel().attr(ACCESS_STATE).get(), null, null);
    }

    static RestAccessState accessState(Context ctx) {
        RestAccessState state = ctx.get(Constants.ACCESS_STATE);
        ChannelHandlerContext ch = ctx.get(Constants.SESSION);
        return state != null || ch == null ? state : ch.channel().attr(ACCESS_STATE).get();
    }

    /** Complete each request once, even when write completion races channel closure. */
    static boolean completeAccess(ChannelHandlerContext ch, RestAccessState state, Integer status, Long bytes) {
        if (ch == null || state == null)
            return false;
        synchronized (state) {
            if (state.completed)
                return false;
            state.completed = true;
            if (state.deadline != null)
                state.deadline.cancel(false);
            if (status != null)
                state.status = status;
            if (bytes != null)
                state.responseBytes = bytes;
            ch.channel().attr(ACCESS_STATE).compareAndSet(state, null);
            Set<RestAccessState> pending = ch.channel().attr(PENDING).get();
            if (pending != null)
                pending.remove(state);
            QRestMetrics metrics = ch.channel().attr(METRICS).get();
            if (metrics != null)
                metrics.requestCompleted(state);
            BiConsumer<QRestAccess, UUID> emitter = ch.channel().attr(ACCESS_EMITTER).get();
            if (emitter != null)
                emitter.accept(state.toAccess(), ch.channel().attr(TRACE_ID).get());
        }
        return true;
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) {
        if (evt instanceof IdleStateEvent) {
            IdleState e = ((IdleStateEvent) evt).state();
            if (e == IdleState.READER_IDLE) {
                ctx.close();
            }
        }
    }

    /**
     * Records the matched route template on the per-request access state held
     * on the netty channel. Intended for use by TransactionManager participants
     * that resolve the {@link Route} match themselves (e.g. {@code Router},
     * {@code Q2Info}) so that downstream metrics can label by route pattern
     * instead of falling back to the {@code _unmatched} sentinel.
     *
     * <p>No-op if {@code ch}, {@code route}, or the access state is {@code null}.</p>
     */
    public static void setMatchedRoute(io.netty.channel.ChannelHandlerContext ch, String route) {
        if (ch == null || route == null || route.isEmpty())
            return;
        RestAccessState state = ch.channel().attr(ACCESS_STATE).get();
        if (state != null)
            state.route = route;
    }

    /** Set the route on this request, independent of other requests on the connection.
     * @param ctx transaction context
     * @param route matched route template
     */
    public static void setMatchedRouteForContext(Context ctx, String route) {
        RestAccessState state = accessState(ctx);
        if (state != null && route != null && !route.isEmpty())
            state.route = route;
    }

    /**
     * Emits one structured QRest audit-log event. The trace-id (a session-scoped
     * UUIDv7) is attached to the {@link LogEvent} so all events from the same
     * keep-alive session share it. Visible for testing.
     */
    protected void emitAccessLog(QRestAccess access, UUID traceId) {
        LogEvent evt = new LogEvent(server.getLog(), QRestAuditLogEventProvider.QREST_ACCESS);
        if (traceId != null)
            evt.withTraceId(traceId);
        evt.addMessage(access);
        Logger.log(evt);
    }

    private RestAccessState captureRequest(ChannelHandlerContext ch, FullHttpRequest request) {
        RestAccessState state = new RestAccessState();
        state.ts = Instant.now();
        state.startNanos = System.nanoTime();
        state.method = request.method().name();
        state.path = stripQuery(request.uri());
        // Behind a proxy the socket peer is the proxy, not the caller. When
        // the peer is inside trusted-proxy-cidrs, record the client the
        // outermost trusted proxy witnessed (rightmost untrusted entry of
        // X-Forwarded-For); from any other peer the header is untrusted
        // client input and the socket address is the only honest answer.
        String peer = remoteAddress(ch);
        state.remote = trustedProxies != null
          ? trustedProxies.resolveClient(peer, request.headers().getAll("X-Forwarded-For"))
          : peer;
        state.requestBytes = (long) request.content().readableBytes();
        state.scheme = server.isTLSEnabled() ? "https" : "http";
        state.protocolVersion = stripProtocol(request.protocolVersion().text());
        ch.channel().attr(ACCESS_STATE).set(state);
        ch.channel().attr(PENDING).get().add(state);
        QRestMetrics m = server.getMetrics();
        if (m != null)
            m.requestStarted(state);
        if (requestTimeout > 0) {
            state.deadline = ch.executor().schedule(() -> {
                // This bounds response waiting, not transaction execution.
                // A participant may still safely use its heap snapshot.
                if (completeAccess(ch, state, null, null)) {
                    server.getLog().warn("HTTP response timeout");
                    ch.close();
                }
            }, requestTimeout, TimeUnit.SECONDS);
        }
        return state;
    }

    private static String stripProtocol(String text) {
        if (text == null)
            return null;
        int slash = text.indexOf('/');
        return slash >= 0 ? text.substring(slash + 1) : text;
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
