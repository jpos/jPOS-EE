/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2015 Alejandro P. Revilla
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
 * jPOS use a combination of a consumer's secret key, received timestamp and payLoad hash
 * to validate requests.
 */
public class APIAuthentication {
    long receivedTimestamp;
    long systemTimeStamp;
    byte[][] payLoad;
    byte[] hash;
    SecretKey secretKey;
    public static final String VERSION = "1.0";
    public static final String HASH_ALGORITHM = "HmacSHA256";

    private static final long FIVE_MINUTES = 5*60*1000L;

    public APIAuthentication(SecretKey secretKey, long receivedTimestamp, byte[]... payLoad)
            throws InvalidKeyException, NoSuchAlgorithmException
    {
        this.secretKey = secretKey;
        this.receivedTimestamp = receivedTimestamp;
        this.payLoad = payLoad;
        this.systemTimeStamp = System.currentTimeMillis();
    }

    public APIAuthentication hash(byte[] hash) {
        this.hash = hash;
        return this;
    }

    public byte[] getHash() {
        return hash;
    }

    public APIAuthentication computeHash() throws NoSuchAlgorithmException, InvalidKeyException {
        this.hash = computeHash(secretKey, receivedTimestamp, payLoad);
        return this;
    }

    @SuppressWarnings("unused")
    public APIAuthentication forceSystemTimestamp (long systemTimeStamp) {
        this.systemTimeStamp = systemTimeStamp;
        return this;
    }

    public void validate() throws NoSuchAlgorithmException, InvalidKeyException {
        assertNotNull(payLoad, "invalid.payLoad");
        assertNotNull(secretKey, "invalid.secret");
        assertNotNull(hash, "invalid.null.hash");
        assertTimestamp();
        assertEquals(hash, computeHash(secretKey, receivedTimestamp, payLoad), "invalid.hash");
    }

    private void assertTimestamp() {
        long offset = Math.abs(systemTimeStamp - receivedTimestamp);
        if (offset > FIVE_MINUTES) {
            throw new IllegalArgumentException ("invalid.timestamp");
        }
    }

    private void assertNotNull(Object obj, String message)
            throws IllegalArgumentException {
        if (obj == null) {
            throw new IllegalArgumentException(message);
        }
    }

    private void assertEquals (byte[] a, byte[] b, String message) {
        if (!Arrays.equals(a, b))
            throw new IllegalArgumentException(message);
    }

    public static byte[] computeHash (SecretKey secretKey, long timestamp, byte[]... payLoad)
            throws InvalidKeyException, NoSuchAlgorithmException
    {
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        mac.init(secretKey);
        mac.update(Long.toString(timestamp).getBytes());
        for (int i=0; i<payLoad.length; i++)
            mac.update(payLoad[i]);
        return mac.doFinal();
    }
}

