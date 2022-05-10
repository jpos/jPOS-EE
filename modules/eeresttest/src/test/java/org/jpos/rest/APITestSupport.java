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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.bouncycastle.util.encoders.Base64;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.Q2;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.junit.jupiter.api.BeforeAll;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SuppressWarnings("unchecked")
public abstract class APITestSupport {
    static Q2 q2;
    static Space sp;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = APITest.BASE_URL;
        RestAssured.requestSpecification = new RequestSpecBuilder().build().contentType(MediaType.APPLICATION_JSON);
        sp = SpaceFactory.getSpace();
        if (sp.rdp ("JPOSEE:STARTED") == null) {
            System.setProperty("user.name", "admin");
            q2 = new Q2();
            q2.start();
        }
        if (!q2.ready(15000L))
            throw new IllegalStateException("Q2 not running");
    }

    protected APICredential createAPICredential(String consumerId, String base64Key, String nonce, byte[] payLoad)
      throws NoSuchAlgorithmException, IOException, InvalidKeyException
    {
        byte[] encodedKey = Base64.decode(base64Key);
        SecretKey secretKey = new SecretKeySpec(encodedKey, 0, encodedKey.length, APIAuthentication.HASH_ALGORITHM);
        long ts = System.currentTimeMillis();
        APICredential cred = APICredential.builder()
          .version(APIAuthentication.VERSION)
          .consumerId(consumerId)
          .timestamp(ts)
          .nonce(nonce).build();

        return cred.withHash(APIAuthentication.computeHash(cred, secretKey, payLoad));
    }


    protected String toJson(Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();  //TODO: do something
            return "";
        }
    }

//    protected String hash(String str) throws NoSuchAlgorithmException, InvalidKeySpecException {
//        KeySpec spec = new PBEKeySpec(str.toCharArray(), ISOUtil.hex2byte(CheckPIN.DUMMY_CONSUMER_SECRET), CheckPIN.ITERATIONS, 32 << 3);
//        SecretKeyFactory f = SecretKeyFactory.getInstance(CheckPIN.HASH_ALGORITHM);
//        String hashedStr = Base64.toBase64String(f.generateSecret(spec).getEncoded());
//        return hashedStr;
//    }
}
