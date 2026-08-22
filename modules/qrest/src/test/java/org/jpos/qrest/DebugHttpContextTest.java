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
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;
import org.jdom2.Element;
import org.jpos.core.SimpleConfiguration;
import org.jpos.qrest.participant.DebugHttpContext;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionConstants;
import org.jpos.util.Inhibit;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class DebugHttpContextTest {
    @Test
    void qrestKeysAreInhibited() {
        assertInstanceOf(Inhibit.class, Constants.REQUEST);
        assertInstanceOf(Inhibit.class, WsConstants.WS_FRAME);
    }

    @Test
    void extractsJsonUnderTheInhibitedEnumKey() {
        Context ctx = new Context();
        ctx.put(Constants.REQUEST, new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.POST, "/login",
          Unpooled.copiedBuffer("{\"password\":\"secret\"}", CharsetUtil.UTF_8)));

        assertEquals(TransactionConstants.PREPARED | TransactionConstants.READONLY | TransactionConstants.NO_JOIN,
          new ExtractJSONRequest().prepare(1L, ctx));
        assertEquals("{\"password\":\"secret\"}", ctx.get(Constants.JSON_REQUEST));
        assertNull(ctx.get(Constants.JSON_REQUEST.name()));
    }

    @Test
    void validatesJsonConfiguredByTheOriginalStringKey() throws Exception {
        Element config = new Element("participant");
        config.addContent(new Element("mandatory").addContent(new Element("param")
          .setAttribute("name", "JSON_REQUEST")
          .setAttribute("type", "json-schema")
          .setText("{\"type\":\"object\"}")));
        ValidateParams participant = new ValidateParams();
        participant.setConfiguration(config);
        Context ctx = new Context();
        ctx.put(Constants.JSON_REQUEST, "{\"name\":\"alice\"}");

        assertEquals(TransactionConstants.PREPARED | TransactionConstants.READONLY | TransactionConstants.NO_JOIN,
          participant.prepare(1L, ctx));
    }

    @Test
    void logsOnlyAllowlistedSafeHttpDetails() throws Exception {
        Properties props = new Properties();
        props.setProperty("headers", "Authorization, X-Request-ID");
        props.setProperty("params", "password, limit");
        DebugHttpContext participant = new DebugHttpContext();
        participant.setConfiguration(new SimpleConfiguration(props));

        DefaultFullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.POST,
          "/login?token=query-token", Unpooled.copiedBuffer("body-secret", CharsetUtil.UTF_8));
        request.headers().set(HttpHeaderNames.AUTHORIZATION, "Bearer header-token");
        request.headers().set("X-Request-ID", "request-42");
        Context ctx = new Context();
        ctx.put(Constants.REQUEST, request);
        ctx.put(Constants.QUERYPARAMS, Map.of("limit", List.of("10")));
        ctx.put(Constants.FORMPARAMS, Map.of("password", List.of("form-secret")));
        ctx.put(Constants.RESPONSE, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.CREATED));

        participant.prepare(1L, ctx);

        String log = ctx.getLogEvent().getPayLoad().toString();
        assertTrue(log.contains("method=POST path=/login bytes=11"));
        assertTrue(log.contains("X-Request-ID=request-42"));
        assertTrue(log.contains("query param limit=[10]"));
        assertTrue(log.contains("Authorization=***"));
        assertTrue(log.contains("form param password=***"));
        assertTrue(log.contains("status=201 bytes=0"));
        assertFalse(log.contains("header-token"));
        assertFalse(log.contains("query-token"));
        assertFalse(log.contains("body-secret"));
        assertFalse(log.contains("form-secret"));
    }
}
