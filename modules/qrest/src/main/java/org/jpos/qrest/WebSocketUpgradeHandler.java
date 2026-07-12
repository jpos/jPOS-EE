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
import io.netty.channel.ChannelFutureListener;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.QueryStringDecoder;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory;
import io.netty.handler.codec.http.websocketx.WebSocketFrameAggregator;

import java.util.HashMap;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Handles WebSocket upgrade requests by intercepting HTTP requests with
 * the Upgrade: websocket header that match the configured websocket-path pattern.
 *
 * On successful handshake, replaces the RestSession handler with WebSocketSession.
 */
public class WebSocketUpgradeHandler extends ChannelInboundHandlerAdapter {
    private final RestServer server;
    private final Pattern pathPattern;
    private final int maxFrameSize;

    private static final int DEFAULT_MAX_FRAME_SIZE = 65536;

    public WebSocketUpgradeHandler(RestServer server, String websocketPath) {
        this(server, websocketPath, DEFAULT_MAX_FRAME_SIZE);
    }

    public WebSocketUpgradeHandler(RestServer server, String websocketPath, int maxFrameSize) {
        this.server = server;
        this.pathPattern = compilePathPattern(websocketPath);
        this.maxFrameSize = maxFrameSize;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof FullHttpRequest) {
            FullHttpRequest request = (FullHttpRequest) msg;

            if (isWebSocketUpgrade(request) && matchesPath(request)) {
                handleWebSocketUpgrade(ctx, request);
                return;
            }
        }
        // Pass non-WebSocket requests to the next handler (RestSession)
        ctx.fireChannelRead(msg);
    }

    private boolean isWebSocketUpgrade(FullHttpRequest request) {
        String upgrade = request.headers().get(HttpHeaderNames.UPGRADE);
        return HttpHeaderValues.WEBSOCKET.contentEqualsIgnoreCase(upgrade);
    }

    private boolean matchesPath(FullHttpRequest request) {
        QueryStringDecoder decoder = new QueryStringDecoder(request.uri());
        String path = decoder.path();
        return pathPattern.matcher(path).matches();
    }

    private void handleWebSocketUpgrade(ChannelHandlerContext ctx, FullHttpRequest request) {
        if (!isAllowedOrigin(ctx, request)) {
            server.getLog().warn("Rejected WebSocket cross-site Origin: " +
                request.headers().get(HttpHeaderNames.ORIGIN) + " path=" + request.uri());
            ctx.writeAndFlush(new DefaultFullHttpResponse(
                HttpVersion.HTTP_1_1, HttpResponseStatus.FORBIDDEN
            )).addListener(ChannelFutureListener.CLOSE);
            return;
        }

        String wsUrl = getWebSocketUrl(ctx, request);

        WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(
            wsUrl,
            null,  // subprotocols
            true,  // allowExtensions
            maxFrameSize
        );

        WebSocketServerHandshaker handshaker = wsFactory.newHandshaker(request);

        if (handshaker == null) {
            WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(ctx.channel());
        } else {
            // Look up handler for this path
            QueryStringDecoder decoder = new QueryStringDecoder(request.uri());
            String requestPath = decoder.path();
            RestServer.WebSocketRouteMatch match = server.resolveWebSocketRoute(requestPath);
            WebSocketHandler handler = match.handler() ? server.getWebSocketHandler(requestPath) : null;

            // Extract HTTP headers from the upgrade request for downstream use
            Map<String, String> headers = new HashMap<>();
            for (Map.Entry<String, String> entry : request.headers()) {
                headers.put(entry.getKey(), entry.getValue());
            }

            // Perform the handshake
            handshaker.handshake(ctx.channel(), request).addListener(future -> {
                if (future.isSuccess()) {
                    // Replace RestSession with WebSocketSession in the pipeline
                    ctx.pipeline().addAfter(
                        ctx.name(),
                        "wsFrameAggregator",
                        new WebSocketFrameAggregator(maxFrameSize)
                    );
                    ctx.pipeline().replace(
                        "restSession",
                        "wsSession",
                        new WebSocketSession(server, handshaker, request.uri(), handler, headers, match)
                    );
                    QRestMetrics m = server.getMetrics();
                    if (m != null)
                        m.webSocketConnected(match.route(), match.queue());
                    server.getLog().info("WebSocket connected: " + ctx.channel() + " path=" + request.uri());
                } else {
                    server.getLog().warn("WebSocket handshake failed: " + ctx.channel());
                    ctx.close();
                }
            });
        }
    }

    private String getWebSocketUrl(ChannelHandlerContext ctx, FullHttpRequest request) {
        String scheme = ctx.pipeline().get("ssl") != null ? "wss" : "ws";
        String host = request.headers().get(HttpHeaderNames.HOST);
        return scheme + "://" + host + request.uri();
    }

    private boolean isAllowedOrigin(ChannelHandlerContext ctx, FullHttpRequest request) {
        String origin = request.headers().get(HttpHeaderNames.ORIGIN);
        if (origin == null || origin.isBlank()) return true;

        Set<String> allowed = server.getWebSocketAllowedOrigins();
        if (allowed.contains("*") || allowed.contains(origin)) return true;

        String normalized = normalizeOrigin(origin);
        return normalized != null &&
            (allowed.contains(normalized) ||
             isSameOrigin(ctx.pipeline().get("ssl") != null,
                 request.headers().get(HttpHeaderNames.HOST), normalized));
    }

    static boolean isSameOrigin(boolean tls, String hostHeader, String origin) {
        if (hostHeader == null || hostHeader.isBlank()) return false;
        String expectedScheme = tls ? "https" : "http";
        String expected = normalizeHostOrigin(expectedScheme, hostHeader);
        return expected != null && expected.equals(normalizeOrigin(origin));
    }

    static String normalizeOrigin(String origin) {
        try {
            URI uri = new URI(origin);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (scheme == null || host == null) return null;
            scheme = scheme.toLowerCase(Locale.ROOT);
            if (!scheme.equals("http") && !scheme.equals("https")) return null;
            int port = uri.getPort() >= 0 ? uri.getPort() : defaultPort(scheme);
            return scheme + "://" + host.toLowerCase(Locale.ROOT) + ":" + port;
        } catch (URISyntaxException e) {
            return null;
        }
    }

    private static String normalizeHostOrigin(String scheme, String hostHeader) {
        return normalizeOrigin(scheme + "://" + hostHeader);
    }

    private static int defaultPort(String scheme) {
        return "https".equals(scheme) ? 443 : 80;
    }

    /**
     * Compiles a path pattern supporting wildcards:
     * - ** matches any path segments (including multiple levels)
     * - * matches a single path segment
     *
     * Example: /ws/** matches /ws, /ws/foo, /ws/foo/bar
     */
    private static Pattern compilePathPattern(String path) {
        StringBuilder regex = new StringBuilder("^");

        String[] parts = path.split("/");
        boolean endsWithDoubleWildcard = false;

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            if (part.isEmpty()) {
                continue;
            }

            if ("**".equals(part)) {
                // Match anything including sub-paths, making the slash optional
                regex.append("(?:/.*)?");
                endsWithDoubleWildcard = true;
            } else if ("*".equals(part)) {
                // Match single path segment
                regex.append("/[^/]+");
            } else {
                // Literal match
                regex.append("/");
                regex.append(Pattern.quote(part));
            }
        }

        // Handle trailing slash for exact match cases
        if (!endsWithDoubleWildcard && !path.endsWith("/*")) {
            regex.append("/?");
        }

        regex.append("$");
        return Pattern.compile(regex.toString());
    }
}
