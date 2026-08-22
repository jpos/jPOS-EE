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

import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpResponse;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.qrest.HttpParams;
import org.jpos.qrest.Response;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.jpos.qrest.Constants.*;

/**
 * Logs a safe summary of the HTTP values inhibited from ordinary Context output.
 *
 * <p>The optional {@code headers} and {@code params} properties are comma or
 * whitespace-separated allowlists. Sensitive names are always redacted and
 * request and response bodies are never logged.</p>
 */
public class DebugHttpContext implements TransactionParticipant, Configurable {
    private static final int MAX_VALUE_LENGTH = 256;
    private static final HttpParams PARAM_MASKER = new HttpParams();
    private Set<String> headers = Set.of();
    private Set<String> params = Set.of();

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        headers = names(cfg.get("headers", ""));
        params = names(cfg.get("params", ""));
    }

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        logRequest(ctx);
        logResponse(ctx);
        return PREPARED | READONLY | NO_JOIN;
    }

    private void logRequest(Context ctx) {
        FullHttpRequest request = ctx.get(REQUEST);
        if (request == null)
            return;
        ctx.log(String.format("HTTP request method=%s path=%s bytes=%d",
          request.method(), path(request.uri()), request.content().readableBytes()));
        headers.forEach(name -> logHeader(ctx, request, name));
        logParams(ctx, "query", ctx.get(QUERYPARAMS));
        logParams(ctx, "path", ctx.get(PATHPARAMS));
        logParams(ctx, "form", ctx.get(FORMPARAMS));
    }

    private void logHeader(Context ctx, FullHttpRequest request, String name) {
        String value = request.headers().get(name);
        if (value != null)
            ctx.log("HTTP request header " + name + "=" + display(name, value));
    }

    private void logParams(Context ctx, String source, Object value) {
        if (!(value instanceof Map<?, ?> values))
            return;
        for (String name : params) {
            Object param = values.get(name);
            if (param != null)
                ctx.log("HTTP " + source + " param " + name + "=" + display(name, param));
        }
    }

    private void logResponse(Context ctx) {
        Object response = ctx.get(RESPONSE);
        if (response instanceof FullHttpResponse full)
            ctx.log(String.format("HTTP response status=%d bytes=%d",
              full.status().code(), full.content().readableBytes()));
        else if (response instanceof HttpResponse http)
            ctx.log("HTTP response status=" + http.status().code());
        else if (response instanceof Response rest)
            ctx.log("HTTP response status=" + rest.status().code());
    }

    private String display(String name, Object value) {
        return sensitive(name) ? HttpParams.MASK : limit(String.valueOf(value));
    }

    private boolean sensitive(String name) {
        String normalized = name.toLowerCase(Locale.ROOT);
        return PARAM_MASKER.isMasked(name) || normalized.contains("authorization") || normalized.contains("cookie")
          || normalized.contains("password") || normalized.contains("token") || normalized.contains("secret")
          || normalized.contains("pin") || normalized.contains("cvv") || normalized.contains("key");
    }

    private String path(String uri) {
        int query = uri.indexOf('?');
        return limit(query < 0 ? uri : uri.substring(0, query));
    }

    private String limit(String value) {
        String sanitized = value.replace('\r', ' ').replace('\n', ' ');
        return sanitized.length() <= MAX_VALUE_LENGTH ? sanitized : sanitized.substring(0, MAX_VALUE_LENGTH) + "...";
    }

    private Set<String> names(String values) {
        return Arrays.stream(values.split("[,\\s]+"))
          .filter(s -> !s.isBlank())
          .collect(Collectors.toUnmodifiableSet());
    }
}
