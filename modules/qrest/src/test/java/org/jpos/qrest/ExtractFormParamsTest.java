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
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ExtractFormParamsTest {

    private ExtractFormParams participant;

    @BeforeEach
    void setUp() {
        participant = new ExtractFormParams();
    }

    @Test
    void singleParam() {
        Context ctx = contextWithForm("name=value");
        int result = participant.prepare(0L, ctx);

        assertEquals(TransactionConstants.PREPARED | TransactionConstants.READONLY | TransactionConstants.NO_JOIN, result);
        Map<String, List<String>> params = ctx.get(Constants.FORMPARAMS);
        assertEquals(List.of("value"), params.get("name"));
        assertEquals(1, params.size());
    }

    @Test
    void multipleParams() {
        Context ctx = contextWithForm("a=1&b=2");
        int result = participant.prepare(0L, ctx);

        assertEquals(TransactionConstants.PREPARED | TransactionConstants.READONLY | TransactionConstants.NO_JOIN, result);
        Map<String, List<String>> params = ctx.get(Constants.FORMPARAMS);
        assertEquals(List.of("1"), params.get("a"));
        assertEquals(List.of("2"), params.get("b"));
        assertEquals(2, params.size());
    }

    @Test
    void duplicateKeys() {
        Context ctx = contextWithForm("color=red&color=blue");
        int result = participant.prepare(0L, ctx);

        assertEquals(TransactionConstants.PREPARED | TransactionConstants.READONLY | TransactionConstants.NO_JOIN, result);
        Map<String, List<String>> params = ctx.get(Constants.FORMPARAMS);
        assertEquals(List.of("red", "blue"), params.get("color"));
    }

    @Test
    void urlEncodedValues() {
        Context ctx = contextWithForm("greeting=hello+world&special=%26%3D");
        int result = participant.prepare(0L, ctx);

        assertEquals(TransactionConstants.PREPARED | TransactionConstants.READONLY | TransactionConstants.NO_JOIN, result);
        Map<String, List<String>> params = ctx.get(Constants.FORMPARAMS);
        assertEquals(List.of("hello world"), params.get("greeting"));
        assertEquals(List.of("&="), params.get("special"));
    }

    @Test
    void emptyBody() {
        Context ctx = contextWithForm("");
        int result = participant.prepare(0L, ctx);

        assertEquals(TransactionConstants.PREPARED | TransactionConstants.READONLY | TransactionConstants.NO_JOIN, result);
        Map<String, List<String>> params = ctx.get(Constants.FORMPARAMS);
        assertNotNull(params);
        assertTrue(params.isEmpty());
    }

    @Test
    void wrongContentTypeReturnsFail() {
        Context ctx = contextWithBody("application/json", "{\"a\":1}");
        int result = participant.prepare(0L, ctx);

        assertEquals(TransactionConstants.FAIL, result);
    }

    @Test
    void wrongContentTypeWithIgnoreReturnsSuccess() throws Exception {
        Field f = ExtractFormParams.class.getDeclaredField("ignoreContentType");
        f.setAccessible(true);
        f.setBoolean(participant, true);

        Context ctx = contextWithBody("application/json", "{\"a\":1}");
        int result = participant.prepare(0L, ctx);

        assertEquals(TransactionConstants.PREPARED | TransactionConstants.READONLY | TransactionConstants.NO_JOIN, result);
    }

    private Context contextWithForm(String body) {
        return contextWithBody("application/x-www-form-urlencoded", body);
    }

    private Context contextWithBody(String contentType, String body) {
        DefaultFullHttpRequest request = new DefaultFullHttpRequest(
            HttpVersion.HTTP_1_1,
            HttpMethod.POST,
            "/test",
            Unpooled.copiedBuffer(body, CharsetUtil.UTF_8)
        );
        request.headers().set(HttpHeaderNames.CONTENT_TYPE, contentType);
        Context ctx = new Context();
        ctx.put(Constants.REQUEST, request);
        return ctx;
    }
}
