/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2013 Alejandro P. Revilla
 *
 * THIS PROGRAM IS NOT FREE SOFTWARE and access to it should
 * be considered PRIVILEGED and CONFIDENTIAL.
 *
 * See license details in the PGP-signed file LICENSE.asc
 * available in the top level directory of this project.
 *
 * LICENSE.asc SHA-1 b1f42375545e1eb6351af9219f8949bc8563f1a3
 */

package org.jpos.rest;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class APIAuthentication {
    long receivedTimestamp;
    long systemTimeStamp;
    byte[] payLoad;
    byte[] hash;
    SecretKey secretKey;
    public static final String VERSION = "1.0";
    public static final String HASH_ALGORITHM = "HmacSHA256";

    private static final long FIVE_MINUTES = 5*60*1000L;

    public APIAuthentication(SecretKey secretKey, long receivedTimestamp, byte[] payLoad, byte[] hash)
            throws InvalidKeyException, NoSuchAlgorithmException
    {
        this.secretKey = secretKey;
        this.receivedTimestamp = receivedTimestamp;
        this.payLoad = payLoad;
        this.hash = hash;
        this.systemTimeStamp = System.currentTimeMillis();
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

