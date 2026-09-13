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

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.HttpVersion;
import org.jpos.core.SimpleConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WebSocketForwardedOriginTest {
    private static final String TRUSTED = "10.42.0.0/16,2001:db8::/32";
    private static final SocketAddress PROXY = new InetSocketAddress("10.42.1.2", 12345);
    private static final SocketAddress CLIENT = new InetSocketAddress("203.0.113.7", 12345);

    @Test
    void trustedTlsTerminationAcceptsSameSiteButNotCrossSite() throws Exception {
        handshake(PROXY, TRUSTED, false, null, "example.test", "https://example.test", 101,
            r -> r.headers().set("X-Forwarded-Proto", "https"));
        handshake(PROXY, TRUSTED, false, null, "example.test", "https://evil.test", 403,
            r -> r.headers().set("X-Forwarded-Proto", "https"));
    }

    @Test
    void trustedRewrittenAuthorityIncludesPort() throws Exception {
        for (int status : new int[] {101, 403})
            handshake(PROXY, TRUSTED, false, null, "internal:8080",
                status == 101 ? "https://public.test:8443" : "https://public.test", status, r -> {
                    r.headers().set("X-Forwarded-Proto", "HTTPS");
                    r.headers().set("X-Forwarded-Host", "public.test:8443");
                });
    }

    @Test
    void ipv6PeerAndAuthorityAreSupported() throws Exception {
        handshake(new InetSocketAddress("2001:db8::2", 12345), TRUSTED, false, null,
            "internal:8080", "https://[2001:db8:1::3]:443", 101, r -> {
                r.headers().set("X-Forwarded-Proto", "https");
                r.headers().set("X-Forwarded-Host", "[2001:db8:1::3]");
            });
    }

    @Test
    void untrustedPeerCannotForgeOriginOrPeerIdentity() throws Exception {
        Consumer<FullHttpRequest> spoof = r -> {
            r.headers().set("X-Forwarded-Proto", "https");
            r.headers().set("X-Forwarded-Host", "evil.test");
            r.headers().set("X-Forwarded-For", "10.42.1.2");
        };
        handshake(CLIENT, TRUSTED, false, null, "example.test", "https://evil.test", 403, spoof);
        handshake(CLIENT, TRUSTED, false, null, "example.test", "http://example.test", 101, spoof);
        handshake(PROXY, null, false, null, "example.test", "https://evil.test", 403, spoof);
        handshake(null, TRUSTED, false, null, "example.test", "https://evil.test", 403, spoof);
        handshake(InetSocketAddress.createUnresolved("proxy.test", 12345), TRUSTED, false,
            null, "example.test", "https://evil.test", 403, spoof);
    }

    @Test
    void missingHeadersKeepLocalSchemeAndHost() throws Exception {
        handshake(PROXY, TRUSTED, false, null, "example.test:8080", "http://example.test:8080", 101, r -> {});
        handshake(CLIENT, TRUSTED, true, null, "example.test", "https://example.test:443", 101, r -> {});
        handshake(PROXY, TRUSTED, true, null, "internal", "https://public.test", 101,
            r -> r.headers().set("X-Forwarded-Host", "public.test"));
        handshake(PROXY, TRUSTED, true, null, "example.test", "http://example.test", 101,
            r -> r.headers().set("X-Forwarded-Proto", "http"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "ftp", "wss", "https,http", "https,", "https://example.test"})
    void malformedProtoCannotFallBackToLocalOrigin(String value) throws Exception {
        handshake(PROXY, TRUSTED, false, null, "example.test", "http://example.test", 403,
            r -> r.headers().set("X-Forwarded-Proto", value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "example.test,evil.test", "https://example.test", "user@example.test",
        "example.test/path", "example.test/", "example.test?x", "example.test#x", "example.test:",
        "example.test:0", "example.test:65536", "example.test:-1", "example.test:abc", "bad host"})
    void malformedAuthorityCannotFallBackToLocalOrigin(String value) throws Exception {
        handshake(PROXY, TRUSTED, false, null, "example.test", "http://example.test", 403,
            r -> r.headers().set("X-Forwarded-Host", value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"X-Forwarded-Proto", "X-Forwarded-Host"})
    void repeatedHeadersAreNotGuessed(String name) throws Exception {
        handshake(PROXY, TRUSTED, false, null, "example.test", "http://example.test", 403, r -> {
            String value = name.endsWith("Proto") ? "http" : "example.test";
            r.headers().add(name, value).add(name, value);
        });
    }

    @Test
    void allowlistAndMissingOriginKeepExistingBehavior() throws Exception {
        handshake(PROXY, TRUSTED, false, "https://allowed.test", "example.test", "https://allowed.test", 101,
            r -> r.headers().set("X-Forwarded-Proto", "bad"));
        handshake(CLIENT, TRUSTED, false, "*", "example.test", "https://other.test", 101, r -> {});
        handshake(PROXY, TRUSTED, false, null, "example.test", null, 101, r -> {});
    }

    private void handshake(SocketAddress peer, String cidrs, boolean tls, String allowed, String host,
                           String origin, int status, Consumer<FullHttpRequest> headers) throws Exception {
        SimpleConfiguration cfg = new SimpleConfiguration();
        if (cidrs != null) cfg.put("trusted-proxy-cidrs", cidrs);
        if (allowed != null) cfg.put("websocket-allowed-origins", allowed);
        RestServer server = new RestServer();
        server.setConfiguration(cfg);
        EmbeddedChannel channel = new EmbeddedChannel() {
            @Override
            protected SocketAddress remoteAddress0() { return peer; }
        };
        // A marker exercises the existing socket-scheme detection without a TLS handshake.
        if (tls) channel.pipeline().addLast("ssl", new ChannelInboundHandlerAdapter());
        channel.pipeline().addLast("http", new HttpServerCodec());
        channel.pipeline().addLast("upgrade", new WebSocketUpgradeHandler(server, "/ws"));
        channel.pipeline().addLast("restSession", new ChannelInboundHandlerAdapter());
        FullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, "/ws");
        request.headers().set(HttpHeaderNames.HOST, host);
        request.headers().set(HttpHeaderNames.UPGRADE, "websocket");
        request.headers().set(HttpHeaderNames.CONNECTION, "Upgrade");
        request.headers().set(HttpHeaderNames.SEC_WEBSOCKET_VERSION, "13");
        request.headers().set(HttpHeaderNames.SEC_WEBSOCKET_KEY, "dGhlIHNhbXBsZSBub25jZQ==");
        if (origin != null) request.headers().set(HttpHeaderNames.ORIGIN, origin);
        headers.accept(request);
        try {
            channel.pipeline().context("http").fireChannelRead(request);
            channel.runPendingTasks();
            channel.checkException();
            ByteBuf response = channel.readOutbound();
            assertNotNull(response);
            try {
                assertTrue(response.toString(StandardCharsets.US_ASCII).startsWith("HTTP/1.1 " + status),
                    response.toString(StandardCharsets.US_ASCII));
            } finally {
                response.release();
            }
            if (status == 101)
                assertNotNull(channel.pipeline().get(WebSocketSession.class));
        } finally {
            // The existing upgrade handler retains the request; this test owns cleanup.
            if (request.refCnt() > 0) request.release(request.refCnt());
            channel.finishAndReleaseAll();
        }
    }
}
