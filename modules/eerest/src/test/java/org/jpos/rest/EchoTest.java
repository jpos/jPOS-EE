/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2010 Alejandro P. Revilla
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

import com.jayway.restassured.http.ContentType;
//import org.jpos.jcard.rest.ParseLogin;
import org.junit.Test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.is;

public class EchoTest extends APITestSupport {
    @Test
    public void echoGET() throws NoSuchAlgorithmException, InvalidKeyException, IOException {
//        APICredential cred = createAPICredential(ParseLogin.DUMMY_CONSUMER, ParseLogin.DUMMY_CONSUMER_SECRET, UUID.randomUUID().toString(), new byte[] {});
        given()
                .header("consumer-id", "c400ded2-f9cc-11e4-accc-3c15c2cf79f2")
                .and().header("version", "1.0")
                .and().header("timestamp", "1212332211222")
                .and().header("nonce", "121b1b1b")
                .and().header("hash", "12b12b12")
//          .header("consumer-id", cred.getConsumerId())
//          .and().header("version", cred.getVersion())
//          .and().header("timestamp", cred.getTimestamp())
//          .and().header("hash", cred.getHashAsBase64String())
//          .and().header("nonce", cred.getNonce())
          .expect().statusCode(200)
          .then().log().all()
          .body("success", is(true),
                  "version", any(String.class),
                  "revision", any(String.class))
//                  "timestamp", any(String.class))
          .when().get("echo");
    }

    @Test
    public void echoPOST() throws NoSuchAlgorithmException, InvalidKeyException, IOException {
//        Map<String, Object> requestBody = new LinkedHashMap<String, Object>();
//        requestBody.put("test", "hello");
//        APICredential cred = createAPICredential(ParseLogin.DUMMY_CONSUMER, ParseLogin.DUMMY_CONSUMER_SECRET, UUID.randomUUID().toString(), toJson(requestBody).getBytes());
//        given()
//                .header("consumer-id", cred.getConsumerId())
//                .and().header("version", cred.getVersion())
//                .and().header("timestamp", cred.getTimestamp())
//                .and().header("hash", cred.getHashAsBase64String())
//                .and().header("nonce", cred.getNonce())
//                .and().contentType(ContentType.JSON)
//                .body(requestBody)
//                .expect().statusCode(201)
//                .then().log().all()
//                .body("success", is(true))
//                .when().post("echo");
    }

}
