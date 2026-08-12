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

import org.jpos.qrest.evt.HttpParamsEvt;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HttpParamsTest {

    @ParameterizedTest
    @ValueSource(strings = {
      "password", "PASSWORD", "passwd", "pwd", "pass", "secret", "token",
      "pin", "cvv", "cvc", "cvv2", "otp",
      "new_password", "confirmPassword", "confirmpassword", "current-password",
      "cardPin", "user_pin", "csrf_token", "access_token", "accessToken",
      "api_key", "apiKey", "apikey", "client_secret", "clientSecret"
    })
    void masksSensitiveNames(String name) {
        assertTrue(new HttpParams().isMasked(name), name + " should be masked");
    }

    @ParameterizedTest
    @ValueSource(strings = {
      "nick", "name", "email", "amount", "shipping", "description",
      "sort", "page", "account", "journal", "code"
    })
    void keepsRegularNames(String name) {
        assertFalse(new HttpParams().isMasked(name), name + " should not be masked");
    }

    @Test
    void valuesRemainReadableThroughMapInterface() {
        HttpParams params = params();
        assertEquals(List.of("admin8583"), params.get("password"));
        assertEquals(List.of("admin"), params.get("nick"));
    }

    @Test
    void dumpMasksSensitiveValues() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        params().dump(new PrintStream(baos), "  ");
        String out = baos.toString();
        assertFalse(out.contains("admin8583"), "dump leaked the password: " + out);
        assertTrue(out.contains(HttpParams.MASK));
        assertTrue(out.contains("admin"), "non-sensitive values should stay visible");
        assertTrue(out.contains("password"), "masked param names should stay visible");
    }

    @Test
    void toStringMasksSensitiveValues() {
        String s = params().toString();
        assertFalse(s.contains("admin8583"), "toString leaked the password: " + s);
        assertTrue(s.contains("admin"));
    }

    @Test
    void auditEventIsStructuredAndMasked() {
        HttpParamsEvt evt = (HttpParamsEvt) params().toAuditEvent();
        assertEquals(List.of("admin"), evt.params().get("nick"));
        assertEquals(List.of(HttpParams.MASK), evt.params().get("password"));
    }

    @Test
    void maskPreservesValueMultiplicity() {
        HttpParams params = new HttpParams();
        params.put("token", List.of("t1", "t2"));
        assertEquals(List.of(HttpParams.MASK, HttpParams.MASK), params.maskedView().get("token"));
    }

    @Test
    void extraMaskedNamesExtendDefaults() {
        HttpParams params = new HttpParams(Set.of("totp"));
        assertTrue(params.isMasked("totp"));
        assertTrue(params.isMasked("TOTP"));
        assertTrue(params.isMasked("user_totp"));
        assertTrue(params.isMasked("password"), "defaults must survive extension");
        assertFalse(params.isMasked("nick"));
    }

    @Test
    void copyConstructorMasksWithDefaults() {
        HttpParams params = new HttpParams(Map.of("password", List.of("s3cret")));
        assertEquals(List.of("s3cret"), params.get("password"));
        assertEquals(List.of(HttpParams.MASK), params.maskedView().get("password"));
    }

    private static HttpParams params() {
        HttpParams params = new HttpParams();
        params.put("nick", List.of("admin"));
        params.put("password", List.of("admin8583"));
        return params;
    }
}
