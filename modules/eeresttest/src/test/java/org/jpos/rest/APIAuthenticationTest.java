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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
public class APIAuthenticationTest {
    SecretKey secretKey;

    @BeforeEach
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
            assertTrue ("invalid.timestamp".equals(e.getMessage()), "Returned " + e.getMessage() + " instead of 'invalid.timestamp'");
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
            assertTrue ("invalid.hash".equals(e.getMessage()), "Returned " + e.getMessage() + " instead of 'invalid.hash'");
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
            assertTrue ("invalid.hash".equals(e.getMessage()), "Returned " + e.getMessage() + " instead of 'invalid.hash'");
        }
    }
}
