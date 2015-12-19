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

import org.junit.Before;
import org.junit.Test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class APIAuthenticationTest {
    SecretKey secretKey;

    @Before
    public void setUp() throws NoSuchAlgorithmException {
        KeyGenerator gen = KeyGenerator.getInstance(APIAuthentication.HASH_ALGORITHM);
        secretKey = gen.generateKey();
    }

    @Test
    public void testInvalidTimestamp () throws AssertionError, NoSuchAlgorithmException, InvalidKeyException {
        try {
            new APIAuthentication(
                    secretKey,
                    System.currentTimeMillis() - 10*60*1000L,
                    UUID.randomUUID().toString().getBytes()).hash("invalidHash".getBytes()).validate();
        } catch (IllegalArgumentException e) {
            assertTrue ("Returned " + e.getMessage() + " instead of 'invalid.timestamp'", "invalid.timestamp".equals(e.getMessage()));
            return;
        }
        fail ("Validation failed to catch invalid.timestamp");
    }

    @Test
    public void testInvalidValid () throws AssertionError, NoSuchAlgorithmException, InvalidKeyException {
        try {
            byte[] payLoad =  UUID.randomUUID().toString().getBytes();
            KeyGenerator gen = KeyGenerator.getInstance("HmacSHA256");
            SecretKey badSecretKey = gen.generateKey();
            long timestamp = System.currentTimeMillis();

            new APIAuthentication(
                    badSecretKey,
                    timestamp,
                    payLoad).hash(APIAuthentication.computeHash(secretKey, timestamp, payLoad)).validate();
        } catch (IllegalArgumentException e) {
            assertTrue ("Returned " + e.getMessage() + " instead of 'invalid.hash'", "invalid.hash".equals(e.getMessage()));
            return;
        }
        fail ("Validation failed to catch invalid.hash");
    }

    @Test
    public void testValidHash () throws AssertionError, NoSuchAlgorithmException, InvalidKeyException {
        try {
            byte[] payLoad =  UUID.randomUUID().toString().getBytes();
            long timestamp = System.currentTimeMillis();
            new APIAuthentication(
                    secretKey,
                    timestamp,
                    payLoad).hash(APIAuthentication.computeHash(secretKey, timestamp, payLoad)).validate();
        } catch (IllegalArgumentException e) {
            assertTrue ("Returned " + e.getMessage() + " instead of 'invalid.hash'", "invalid.hash".equals(e.getMessage()));
        }
    }

    @Test
    public void testAutoComputedHash () throws AssertionError, NoSuchAlgorithmException, InvalidKeyException {
        try {
            byte[] payLoad =  UUID.randomUUID().toString().getBytes();
            long timestamp = System.currentTimeMillis();
            new APIAuthentication(
              secretKey,
              timestamp,
              payLoad).computeHash().validate();
        } catch (IllegalArgumentException e) {
            assertTrue ("Returned " + e.getMessage() + " instead of 'invalid.hash'", "invalid.hash".equals(e.getMessage()));
        }
    }
}
