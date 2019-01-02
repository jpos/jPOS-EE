/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2018 jPOS Software SRL
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

package org.jpos.http.client;

import org.apache.http.HttpStatus;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.Q2;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionManager;
import org.jpos.util.NameRegistrar;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HttpClientTest {
    private static final String BASE_URL = "http://localhost:8081";
    private static Q2 q2;
    private static TransactionManager mgr;

    @BeforeClass
    public static void setUp() throws NameRegistrar.NotFoundException {
        if (q2 == null) {
            q2 = new Q2();
            q2.start();
            NameRegistrar.get("qrest", 60000L);
            NameRegistrar.get("qrest"); // this time throw exception
            mgr = NameRegistrar.get("http-client-txnmgr", 10000L);
        }
    }

    @AfterClass
    public static void tearDown() {
        ISOUtil.sleep(1000L);
    }

    @Test
    public void testGET() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", BASE_URL + "/q2/version");
        ctx.put("HTTP_METHOD", "GET");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals ("Status code should be 200", Integer.valueOf(HttpStatus.SC_OK), sc);
        assertFalse ("Response is not empty", ctx.getString("HTTP_RESPONSE").isEmpty());
    }

    @Test
    public void test404() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", BASE_URL + "/invalid");
        ctx.put("HTTP_REQUEST", "");
        ctx.put("HTTP_METHOD", "GET");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals ("Status code should be 404", Integer.valueOf(HttpStatus.SC_NOT_FOUND), sc);

    }

    @Test
    public void testNotSupportedMethod() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", BASE_URL + "/q2/version");
        ctx.put("HTTP_REQUEST", "");
        ctx.put("HTTP_METHOD", "PUT");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals ("Status code should be 404", Integer.valueOf(HttpStatus.SC_NOT_FOUND), sc);
    }

}
