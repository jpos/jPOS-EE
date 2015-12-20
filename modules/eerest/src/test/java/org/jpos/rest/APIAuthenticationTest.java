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
            APIAuthentication.validate(
              APICredential.builder()
                .version(APIAuthentication.VERSION)
                .timestamp(System.currentTimeMillis() - 10*60*1000L)
                .nonce(UUID.randomUUID().toString())
                .hash("invalidHash".getBytes()).build(),
              secretKey, "".getBytes()
            );
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

            APIAuthentication.validate(
              APICredential.builder()
                .version(APIAuthentication.VERSION)
                .timestamp(System.currentTimeMillis())
                .nonce(UUID.randomUUID().toString())
                .hash("invalidHash".getBytes()).build(),
              badSecretKey, payLoad
            );
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
            APICredential cred = APICredential.builder()
              .version(APIAuthentication.VERSION)
              .timestamp(System.currentTimeMillis())
              .nonce(UUID.randomUUID().toString()).build();

            APIAuthentication.validate(
              APICredential.builder()
                .version(APIAuthentication.VERSION)
                .timestamp(cred.getTimestamp())
                .nonce(cred.getNonce())
                .hash(APIAuthentication.computeHash(cred, secretKey, payLoad)).build(), secretKey, payLoad);
        } catch (IllegalArgumentException e) {
            assertTrue ("Returned " + e.getMessage() + " instead of 'invalid.hash'", "invalid.hash".equals(e.getMessage()));
        }
    }
}
