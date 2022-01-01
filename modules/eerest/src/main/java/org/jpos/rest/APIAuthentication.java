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

package org.jpos.rest;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * Validate REST API requests
 *
 * jPOS uses a combination of a consumer's secret key, received timestamp, optional nonce and payLoad hash
 * to validate requests.
 */
public class APIAuthentication {
    public static final String VERSION = "1.0";
    public static final String HASH_ALGORITHM = "HmacSHA256";

    private static final long FIVE_MINUTES = 5*60*1000L;

    private APIAuthentication() { }

    public static byte[] computeHash(APICredential cred, SecretKey secretKey, byte[]... payLoad) throws NoSuchAlgorithmException, InvalidKeyException {
        return computeHash(secretKey, cred.getTimestamp(), cred.getNonce(), payLoad);
    }

    public static void validate (APICredential cred, SecretKey secretKey, byte[]... payLoad) throws NoSuchAlgorithmException, InvalidKeyException {
        if (!VERSION.equals(cred.getVersion()))
            throw new IllegalArgumentException ("unsupported.version");
        assertNotNull(payLoad, "invalid.payLoad");
        assertNotNull(secretKey, "invalid.secret");
        assertNotNull(cred.getHash(), "invalid.null.hash");
        assertTimestamp(cred.getTimestamp());
        assertEquals(computeHash(secretKey, cred.getTimestamp(), cred.getNonce(), payLoad), cred.getHash(), "invalid.hash");
    }

    private static void assertTimestamp(long ts) {
        long offset = Math.abs(System.currentTimeMillis() - ts);
        if (offset > FIVE_MINUTES) {
            throw new IllegalArgumentException ("invalid.timestamp");
        }
    }

    private static void assertNotNull(Object obj, String message)
            throws IllegalArgumentException {
        if (obj == null) {
            throw new IllegalArgumentException(message);
        }
    }

    private static void assertEquals (byte[] a, byte[] b, String message) {
        if (!Arrays.equals(a, b))
            throw new IllegalArgumentException(message);
    }

    private static byte[] computeHash (SecretKey secretKey, long timestamp, String nonce, byte[]... payLoad)
            throws InvalidKeyException, NoSuchAlgorithmException
    {
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        mac.init(secretKey);
        mac.update(Long.toString(timestamp).getBytes());
        if (nonce != null)
            mac.update (nonce.getBytes());
        for (byte[] p : payLoad) mac.update(p);
        return mac.doFinal();
    }
}
