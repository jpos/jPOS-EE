/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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
import org.jpos.transaction.TransactionStatusEvent;
import org.jpos.transaction.TransactionStatusListener;
import org.jpos.util.NameRegistrar;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HttpClientTest {
    private static final String BASE_URL = "http://localhost:8081";
    private static Q2 q2;
    private static TransactionManager mgr;

    @BeforeAll
    public static void setUp() throws NameRegistrar.NotFoundException {
        if (q2 == null) {
            q2 = new Q2();
            q2.start();
            NameRegistrar.get("qrest", 60000L);
            NameRegistrar.get("qrest"); // this time throw exception
            mgr = NameRegistrar.get("http-client-txnmgr", 10000L);
        }
    }

    @AfterAll
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
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
        assertNotNull(ctx.getString("HTTP_RESPONSE"), "Response should not bee null");
        assertFalse (ctx.getString("HTTP_RESPONSE").isEmpty(), "Response is not empty");
    }

    @Test
    public void test404() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", BASE_URL + "/invalid");
        ctx.put("HTTP_REQUEST", "");
        ctx.put("HTTP_METHOD", "GET");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_NOT_FOUND), sc, "Status code should be 404");
    }

    @Test @Disabled
    public void test400() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", BASE_URL + "/bad");
        ctx.put("HTTP_REQUEST", "");
        ctx.put("HTTP_METHOD", "GET");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_BAD_REQUEST), sc, "Status code should be 400");
        assertNotNull(ctx.getString("HTTP_RESPONSE"), "Response should not bee null");
        assertFalse (ctx.getString("HTTP_RESPONSE").isEmpty(), "Response is not empty");
    }

    @Test
    public void testNotSupportedMethod() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", BASE_URL + "/q2/version");
        ctx.put("HTTP_REQUEST", "");
        ctx.put("HTTP_METHOD", "PUT");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_NOT_FOUND), sc, "Status code should be 404");
    }

    @Test
    public void testBasicAuth() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "http://httpbin.org/basic-auth/user/passwd");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put(".HTTP_BASIC_AUTHENTICATION", "user:passwd");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
        assertNotNull(ctx.getString("HTTP_RESPONSE"), "Response should not bee null");
        assertFalse (ctx.getString("HTTP_RESPONSE").isEmpty(), "Response is not empty");
    }

    @Test
    public void testBasicAuthBadPasswd() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "http://httpbin.org/basic-auth/user/passwd");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put(".HTTP_BASIC_AUTHENTICATION", "user:passwdbad");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_UNAUTHORIZED), sc, "Status code should be 401");
    }

    @Test
    public void testTrustRevokedCertificate() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "https://revoked.badssl.com/");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put("HTTP_TRUST_ALL_CERTS", "true");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
    }

    @Test
    public void testTrustPinnedKeyNotInCertificate() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "https://pinning-test.badssl.com/");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put("HTTP_TRUST_ALL_CERTS", "true");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
    }

    @Test
    public void testTrustSelfSignedCertificate() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "https://self-signed.badssl.com/");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put("HTTP_TRUST_ALL_CERTS", "true");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
    }

    @Test
    public void testTrustUntrustedRootCertificate() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "https://untrusted-root.badssl.com/");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put("HTTP_TRUST_ALL_CERTS", "true");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
    }

    @Test
    public void testTrustExpiredCertificate() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "https://expired.badssl.com/");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put("HTTP_TRUST_ALL_CERTS", "true");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
    }

    @Test
    public void testTrustWrongHostCertificate() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "https://wrong.host.badssl.com/");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put("HTTP_TRUST_ALL_CERTS", "true");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
    }

    @Test
    public void testHttpVersionDefault() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "https://untrusted-root.badssl.com/");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put("HTTP_TRUST_ALL_CERTS", "true");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
    }

    @Test
    public void testHttpVersionSetValue() {
        Context ctx = new Context();
        ctx.put("HTTP_URL", "https://untrusted-root.badssl.com/");
        ctx.put("HTTP_VERSION", "2.0");
        ctx.put("HTTP_METHOD", "GET");
        ctx.put("HTTP_TRUST_ALL_CERTS", "true");
        mgr.queue(ctx);
        Integer sc = ctx.get ("HTTP_STATUS", 10000L);
        assertEquals (Integer.valueOf(HttpStatus.SC_OK), sc, "Status code should be 200");
    }
}