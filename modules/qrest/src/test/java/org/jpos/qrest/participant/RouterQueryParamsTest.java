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

import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;
import org.jpos.qrest.Constants;
import org.jpos.qrest.HttpParams;
import org.jpos.transaction.Context;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RouterQueryParamsTest {

    @Test
    void queryParamsAreMaskedInLogOutputButReadable() {
        Context ctx = new Context();
        ctx.put(Constants.REQUEST, new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.GET, "/login?nick=admin&password=admin8583"));

        new Router().select(0L, ctx);

        Map<String, List<String>> params = ctx.get(Constants.QUERYPARAMS);
        assertInstanceOf(HttpParams.class, params);
        assertEquals(List.of("admin8583"), params.get("password"));
        assertEquals(List.of("admin"), params.get("nick"));
        assertFalse(params.toString().contains("admin8583"), "log rendering leaked the password");
    }

    @Test
    void requestWithoutQueryParamsLeavesContextUntouched() {
        Context ctx = new Context();
        ctx.put(Constants.REQUEST, new DefaultFullHttpRequest(
          HttpVersion.HTTP_1_1, HttpMethod.GET, "/login"));

        new Router().select(0L, ctx);

        assertNull(ctx.get(Constants.QUERYPARAMS));
    }
}
