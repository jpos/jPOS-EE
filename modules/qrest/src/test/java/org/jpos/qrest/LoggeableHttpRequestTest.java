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

import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LoggeableHttpRequestTest {
    private static final String API_KEY = "ApiKey cpk_HZFAsGc5.aScGZUit1yhMpZgy";

    @Test
    void headersRemainReadableThroughInterface() {
        LoggeableHttpRequest request = request();
        assertEquals(API_KEY, request.headers().get("Authorization"));
        assertEquals("JSESSIONID=abc123; theme=dark", request.headers().get("Cookie"));
        assertEquals("localhost", request.headers().get("Host"));
    }

    @Test
    void dumpMasksAuthorizationKeepingSchemeAndKeyId() {
        String out = dump(request());
        assertFalse(out.contains("aScGZUit1yhMpZgy"), "dump leaked the api secret: " + out);
        assertTrue(out.contains("ApiKey cpk_HZFAsGc5.***"), "scheme and key id should stay visible: " + out);
    }

    @Test
    void dumpMasksUndottedCredentialEntirely() {
        LoggeableHttpRequest request = request();
        request.headers().set("Authorization", "Basic dXNlcjpwYXNz");
        String out = dump(request);
        assertFalse(out.contains("dXNlcjpwYXNz"), "dump leaked the basic credential: " + out);
        assertTrue(out.contains("Basic ***"));
    }

    @Test
    void dumpMasksProxyAuthorization() {
        LoggeableHttpRequest request = request();
        request.headers().set("Proxy-Authorization", "Bearer plainsecret");
        String out = dump(request);
        assertFalse(out.contains("plainsecret"), "dump leaked the proxy credential: " + out);
        assertTrue(out.contains("Bearer ***"));
    }

    @Test
    void dumpMasksCookieValuesButKeepsNames() {
        String out = dump(request());
        assertFalse(out.contains("abc123"), "dump leaked a cookie value: " + out);
        assertFalse(out.contains("theme=dark"), "dump leaked a cookie value: " + out);
        assertTrue(out.contains("JSESSIONID=***"));
        assertTrue(out.contains("theme=***"));
    }

    @Test
    void dumpMasksSetCookieValueButKeepsAttributes() {
        LoggeableHttpRequest request = request();
        request.headers().set("Set-Cookie", "sid=s3cret; Path=/; HttpOnly");
        String out = dump(request);
        assertFalse(out.contains("s3cret"), "dump leaked the cookie value: " + out);
        assertTrue(out.contains("sid=***; Path=/; HttpOnly"));
    }

    @Test
    void dumpShowsMethodUriProtocolAndRegularHeaders() {
        String out = dump(request());
        assertTrue(out.contains("GET"));
        assertTrue(out.contains("/login?nick=admin"));
        assertTrue(out.contains("HTTP/1.1"));
        assertTrue(out.contains("localhost"), "non-sensitive headers should stay visible: " + out);
    }

    @Test
    void dumpMasksSensitiveQueryParamValues() {
        String out = dump(request());
        assertFalse(out.contains("admin8583"), "dump leaked a query credential: " + out);
        assertTrue(out.contains("nick=admin"));
        assertTrue(out.contains("password=***"));
    }

    @Test
    void toStringMasksLikeDump() {
        String s = request().toString();
        assertFalse(s.contains("aScGZUit1yhMpZgy"), "toString leaked the api secret: " + s);
        assertFalse(s.contains("abc123"), "toString leaked a cookie value: " + s);
        assertFalse(s.contains("admin8583"), "toString leaked a query credential: " + s);
        assertTrue(s.contains("ApiKey cpk_HZFAsGc5.***"));
    }

    @Test
    void isMaskedMatchesCaseInsensitively() {
        LoggeableHttpRequest request = request();
        assertTrue(request.isMasked("authorization"));
        assertTrue(request.isMasked("AUTHORIZATION"));
        assertTrue(request.isMasked("Set-Cookie"));
        assertFalse(request.isMasked("Host"));
    }

    @Test
    void extraMaskedHeadersExtendDefaults() {
        FullHttpRequest raw = rawRequest();
        raw.headers().set("X-Api-Key", "sup3rs3cret");
        LoggeableHttpRequest request = new LoggeableHttpRequest(raw, Set.of("X-Api-Key"));
        assertTrue(request.isMasked("x-api-key"));
        assertTrue(request.isMasked("Authorization"), "defaults must survive extension");
        String out = dump(request);
        assertFalse(out.contains("sup3rs3cret"), "dump leaked the extra masked header: " + out);
        request.release();
    }

    @Test
    void refCountingDelegates() {
        LoggeableHttpRequest request = request();
        assertEquals(1, request.refCnt());
        assertSame(request, request.retain());
        assertEquals(2, request.refCnt());
        assertSame(request, request.touch());
        assertSame(request, request.touch("hint"));
        assertFalse(request.release());
        assertTrue(request.release());
        assertEquals(0, request.refCnt());
    }

    @Test
    void contentRemainsReadable() {
        FullHttpRequest raw = new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.POST, "/login",
          Unpooled.copiedBuffer("nick=admin", CharsetUtil.UTF_8));
        LoggeableHttpRequest request = new LoggeableHttpRequest(raw);
        assertEquals("nick=admin", request.content().toString(CharsetUtil.UTF_8));
        request.release();
    }

    @Test
    void copiesStayMasked() {
        LoggeableHttpRequest request = request();
        FullHttpRequest copy = request.copy();
        assertInstanceOf(LoggeableHttpRequest.class, copy);
        assertFalse(copy.toString().contains("aScGZUit1yhMpZgy"), "copy leaked the api secret");
        FullHttpRequest replaced = request.replace(Unpooled.copiedBuffer("x", CharsetUtil.UTF_8));
        assertInstanceOf(LoggeableHttpRequest.class, replaced);
        assertInstanceOf(LoggeableHttpRequest.class, request.duplicate());
        copy.release();
        replaced.release();
        request.release();
    }

    @Test
    void mutatorsWriteThroughAndReturnWrapper() {
        LoggeableHttpRequest request = request();
        assertSame(request, request.setUri("/other"));
        assertSame(request, request.setMethod(HttpMethod.PUT));
        assertSame(request, request.setProtocolVersion(HttpVersion.HTTP_1_0));
        assertEquals("/other", request.uri());
        assertEquals(HttpMethod.PUT, request.method());
        assertEquals(HttpVersion.HTTP_1_0, request.protocolVersion());
        request.release();
    }

    private static LoggeableHttpRequest request() {
        return new LoggeableHttpRequest(rawRequest());
    }

    private static FullHttpRequest rawRequest() {
        FullHttpRequest raw = new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.GET, "/login?nick=admin&password=admin8583");
        raw.headers().set("Host", "localhost");
        raw.headers().set("Authorization", API_KEY);
        raw.headers().set("Cookie", "JSESSIONID=abc123; theme=dark");
        return raw;
    }

    private static String dump(LoggeableHttpRequest request) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        request.dump(new PrintStream(baos), "  ");
        return baos.toString();
    }
}
