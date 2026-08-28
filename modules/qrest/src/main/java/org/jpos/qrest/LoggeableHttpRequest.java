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
import io.netty.handler.codec.DecoderResult;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;
import org.jpos.util.Loggeable;

import java.io.PrintStream;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * {@link FullHttpRequest} wrapper whose log renderings mask credential headers.
 *
 * <p>Participants read the real request through the regular
 * {@code FullHttpRequest} interface, but the {@link Loggeable} dump used by
 * {@code Context}'s XML output and {@link #toString()} render method, URI and
 * protocol plus headers with {@code Authorization}, {@code Proxy-Authorization},
 * {@code Cookie} and {@code Set-Cookie} values masked. Credential schemes and
 * dotted key ids stay visible ({@code ApiKey cpk_x.***}), cookie names stay
 * visible with values masked, and sensitive query parameter values in the URI
 * are masked following {@link HttpParams} rules.</p>
 *
 * <p>Masking is always on and cannot be disabled; callers may only extend the
 * built-in header list (see {@code RestSession}'s {@code masked-headers}
 * property). Reference counting is delegated to the wrapped request, and
 * copies ({@link #copy()}, {@link #duplicate()}, {@link #replace(ByteBuf)})
 * remain masked.</p>
 *
 * @since 3.0.2
 */
public class LoggeableHttpRequest implements FullHttpRequest, Loggeable {
    private static final Set<String> MASKED_HEADERS = Set.of(
      "authorization", "proxy-authorization", "cookie", "set-cookie"
    );
    private static final HttpParams QUERY_MASKER = new HttpParams();

    private final FullHttpRequest delegate;
    private final Set<String> extraMasked;

    public LoggeableHttpRequest(FullHttpRequest delegate) {
        this(delegate, Set.of());
    }

    /**
     * @param delegate    the real request
     * @param extraMasked additional header names to mask, on top of the
     *                    built-in list; matched case-insensitively
     */
    public LoggeableHttpRequest(FullHttpRequest delegate, Collection<String> extraMasked) {
        this.delegate = delegate;
        this.extraMasked = extraMasked.stream()
          .filter(s -> s != null && !s.isBlank())
          .map(s -> s.toLowerCase(Locale.ROOT))
          .collect(Collectors.toUnmodifiableSet());
    }

    /**
     * @param name header name
     * @return true if this header's value is masked in log output
     */
    public boolean isMasked(String name) {
        String lower = name.toLowerCase(Locale.ROOT);
        return MASKED_HEADERS.contains(lower) || extraMasked.contains(lower);
    }

    @Override
    public void dump(PrintStream p, String indent) {
        String inner = indent + "  ";
        p.println(indent + "<http-request>");
        p.println(inner + method() + " " + maskedUri() + " " + protocolVersion().text());
        for (Map.Entry<String,String> entry : headers())
            p.println(inner + entry.getKey() + ": " + maskedHeaderValue(entry.getKey(), entry.getValue()));
        p.println(indent + "</http-request>");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
          .append(method()).append(' ').append(maskedUri()).append(' ').append(protocolVersion().text())
          .append(" {");
        boolean first = true;
        for (Map.Entry<String,String> entry : headers()) {
            if (!first)
                sb.append(", ");
            sb.append(entry.getKey()).append(": ").append(maskedHeaderValue(entry.getKey(), entry.getValue()));
            first = false;
        }
        return sb.append('}').toString();
    }

    private String maskedHeaderValue(String name, String value) {
        String lower = name.toLowerCase(Locale.ROOT);
        if (!isMasked(name))
            return value;
        if ("cookie".equals(lower))
            return maskCookiePairs(value, Integer.MAX_VALUE);
        if ("set-cookie".equals(lower))
            return maskCookiePairs(value, 1);
        return maskCredential(value);
    }

    // "ApiKey cpk_x.secret" -> "ApiKey cpk_x.***": keep the scheme and, for
    // dotted credentials, the key-id segment needed to correlate log entries
    private static String maskCredential(String value) {
        String v = value.trim();
        int sp = v.indexOf(' ');
        return sp > 0
          ? v.substring(0, sp) + ' ' + maskToken(v.substring(sp + 1).trim())
          : maskToken(v);
    }

    private static String maskToken(String token) {
        int dot = token.indexOf('.');
        return dot > 0 ? token.substring(0, dot + 1) + HttpParams.MASK : HttpParams.MASK;
    }

    private static String maskCookiePairs(String value, int maskedPairs) {
        StringBuilder sb = new StringBuilder();
        String[] segments = value.split(";");
        for (int i = 0; i < segments.length; i++) {
            String segment = segments[i].trim();
            if (i > 0)
                sb.append("; ");
            if (i < maskedPairs) {
                int eq = segment.indexOf('=');
                sb.append(eq > 0 ? segment.substring(0, eq + 1) + HttpParams.MASK : HttpParams.MASK);
            } else
                sb.append(segment);
        }
        return sb.toString();
    }

    private String maskedUri() {
        String uri = uri();
        int q = uri.indexOf('?');
        if (q < 0)
            return uri;
        StringBuilder sb = new StringBuilder(uri.substring(0, q + 1));
        String[] params = uri.substring(q + 1).split("&");
        for (int i = 0; i < params.length; i++) {
            if (i > 0)
                sb.append('&');
            int eq = params[i].indexOf('=');
            if (eq > 0 && QUERY_MASKER.isMasked(params[i].substring(0, eq)))
                sb.append(params[i], 0, eq + 1).append(HttpParams.MASK);
            else
                sb.append(params[i]);
        }
        return sb.toString();
    }

    @Override
    public HttpMethod method() {
        return delegate.method();
    }

    @Deprecated
    @Override
    public HttpMethod getMethod() {
        return delegate.method();
    }

    @Override
    public FullHttpRequest setMethod(HttpMethod method) {
        delegate.setMethod(method);
        return this;
    }

    @Override
    public String uri() {
        return delegate.uri();
    }

    @Deprecated
    @Override
    public String getUri() {
        return delegate.uri();
    }

    @Override
    public FullHttpRequest setUri(String uri) {
        delegate.setUri(uri);
        return this;
    }

    @Override
    public HttpVersion protocolVersion() {
        return delegate.protocolVersion();
    }

    @Deprecated
    @Override
    public HttpVersion getProtocolVersion() {
        return delegate.protocolVersion();
    }

    @Override
    public FullHttpRequest setProtocolVersion(HttpVersion version) {
        delegate.setProtocolVersion(version);
        return this;
    }

    @Override
    public HttpHeaders headers() {
        return delegate.headers();
    }

    @Override
    public HttpHeaders trailingHeaders() {
        return delegate.trailingHeaders();
    }

    @Override
    public DecoderResult decoderResult() {
        return delegate.decoderResult();
    }

    @Deprecated
    @Override
    public DecoderResult getDecoderResult() {
        return delegate.decoderResult();
    }

    @Override
    public void setDecoderResult(DecoderResult result) {
        delegate.setDecoderResult(result);
    }

    @Override
    public ByteBuf content() {
        return delegate.content();
    }

    @Override
    public FullHttpRequest copy() {
        return new LoggeableHttpRequest(delegate.copy(), extraMasked);
    }

    @Override
    public FullHttpRequest duplicate() {
        return new LoggeableHttpRequest(delegate.duplicate(), extraMasked);
    }

    @Override
    public FullHttpRequest retainedDuplicate() {
        return new LoggeableHttpRequest(delegate.retainedDuplicate(), extraMasked);
    }

    @Override
    public FullHttpRequest replace(ByteBuf content) {
        return new LoggeableHttpRequest(delegate.replace(content), extraMasked);
    }

    @Override
    public FullHttpRequest retain() {
        delegate.retain();
        return this;
    }

    @Override
    public FullHttpRequest retain(int increment) {
        delegate.retain(increment);
        return this;
    }

    @Override
    public FullHttpRequest touch() {
        delegate.touch();
        return this;
    }

    @Override
    public FullHttpRequest touch(Object hint) {
        delegate.touch(hint);
        return this;
    }

    @Override
    public int refCnt() {
        return delegate.refCnt();
    }

    @Override
    public boolean release() {
        return delegate.release();
    }

    @Override
    public boolean release(int decrement) {
        return delegate.release(decrement);
    }
}
