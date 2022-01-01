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

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.is;

public class EchoTest extends APITestSupport {
    @Test
    public void echoGET() throws NoSuchAlgorithmException, InvalidKeyException, IOException {
        APICredential cred = createAPICredential(
                RestConstants.DUMMY_CONSUMER.value(),
                RestConstants.DUMMY_NONCE.value(),
                UUID.randomUUID().toString(), new byte[] {});
        given()
          .header("consumer-id", cred.getConsumerId())
          .and().header("version", cred.getVersion())
          .and().header("timestamp", cred.getTimestamp())
          .and().header("hash", cred.getHashAsBase64String())
          .and().header("nonce", cred.getNonce())
          .expect().statusCode(200)
          .then().log().all()
          .body("success", is(true),
                  "version", any(String.class),
                  "revision", any(String.class),
                  "timestamp", any(Long.class))
          .when().get("echo");
    }
}
