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

package org.jpos.qrest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.apache.http.entity.ContentType;
import org.jpos.q2.Q2;
import org.jpos.util.NameRegistrar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;

import static io.netty.handler.codec.http.HttpHeaderValues.APPLICATION_JSON;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestTest  {
    private static final String BASE_URL = "http://localhost:8081/";
    private static Q2 q2;

    @BeforeAll
    public static void setUp() throws NameRegistrar.NotFoundException {
        RestAssured.baseURI = BASE_URL;
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.requestSpecification = new RequestSpecBuilder().build().contentType(APPLICATION_JSON.toString());
        if (q2 == null) {
            q2 = new Q2();
            q2.start();
            NameRegistrar.get("qrest", 60000L);
            NameRegistrar.get("qrest"); // this time throw exception
        }
    }

    @Test
    public void test404()  {
        given()
          .expect().statusCode(404)
          .then().log().all()
          .when().get("invalid");
    }

    @Test
    public void testVersion()  {
        given().log().all()
        .get("q2/version").then().statusCode(200).assertThat()
          .body("version", equalTo(
            String.format("jPOS %s %s/%s (%s)",
              Q2.getVersion(), Q2.getBranch(), Q2.getRevision(), Q2.getBuildTimestamp()
            )
          ));
    }

    @Test
    public void testAll()  {
        given().log().all()
        .get("q2").then().statusCode(200).assertThat()
          .body("version", equalTo(
            String.format("jPOS %s %s/%s (%s)",
              Q2.getVersion(), Q2.getBranch(), Q2.getRevision(), Q2.getBuildTimestamp()
            )
          ));
    }

    @Test
    public void testPost()  {
        given().and().body("{ \"test\": \"Test JSON\" }")
          .log().all().post("q2")
          .then().statusCode(200).assertThat()
          .body("version", equalTo(
            String.format("jPOS %s %s/%s (%s)",
              Q2.getVersion(), Q2.getBranch(), Q2.getRevision(), Q2.getBuildTimestamp()
            )
          ));
    }

    @Test
    public void testMultiplesTMs()  {
        given().log().all()
          .get("/q2/txnmgr/name").then().statusCode(200).assertThat()
          .body("name", equalTo("txnmgr")
        );
        given().log().all()
          .get("/v2/q2/txnmgr/name").then().statusCode(200).assertThat()
          .body("name", equalTo("txnmgr2")
          );
    }

    @Test
    void testUploadFile() throws Exception {

        File tempFile = File.createTempFile("qrest", "test");
        Files.write(tempFile.toPath(), "hello".getBytes());

        given().log().all()
          .contentType(ContentType.MULTIPART_FORM_DATA.getMimeType())
          .multiPart("file", tempFile, "multipart/form-data")
          .post("/test/load_file")
          .then()
          .statusCode(200)
          .assertThat()
          .body("content", equalTo("hello"));
    }
}
