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

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.jpos.q2.Q2;
import org.jpos.space.Space;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;


@SuppressWarnings("unused")
public class APITest extends APITestSupport {
    static Q2 q2;
    static Space sp;
    static ClientConfig clientConfig;
    public static final String BASE_URL = "http://localhost:8080/api";
    public static String lastCustomerId;
    public static String testCustomerId;

    private Client newClient() {
        return ClientBuilder.newClient (
                new ClientConfig().register(JacksonFeature.class)
        );
    }

    // ------------------------ ECHO TESTS -------------------------//
//    @Test
//    public void echoGET() throws UnsupportedEncodingException, NoSuchAlgorithmException {
//        Client client = newClient();
//        String version = "1.0";
//        String consumerId = Setup.DUMMY_CONSUMER;
//        String consumerSecret = Setup.DUMMY_CONSUMER_SECRET;
//        String nonce = UUID.randomUUID().toString();
//        String timestamp = Long.toString(System.currentTimeMillis());
//        String hash = "FIXME"; // TODO: fixme
//        WebTarget target = client.target(BASE_URL).path("echo");
//        Response r = target.request(MediaType.APPLICATION_JSON).
//                header("version", version).
//                header("consumer-id", consumerId).
//                header("timestamp", timestamp).
//                header("nonce", nonce).
//                header("hash", hash).
//                get();
//        assertTrue(r.getStatus() == HttpServletResponse.SC_OK);
//    }
//
//
//    @Test
//    public void echoPOST() {
//        Client client = newClient();
//
//        String version = "1.0";
//        String consumerId = Setup.DUMMY_CONSUMER;
//        String nonce = "FIXME"; //TODO: fixme
//        String hash = "FIXME"; //TODO: fixme
//        String timestamp = Long.toString(System.currentTimeMillis());
//
//        WebTarget target = client.target(BASE_URL).path("echo");
//
//        Map<String, Object> requestBody = new LinkedHashMap<String, Object>();
//        requestBody.put("test", "hello");
//        Response r = target.request(MediaType.APPLICATION_JSON).header("version", version)
//                .header("consumer-id",consumerId)
//                .header("timestamp", timestamp)
//                .header("nonce",nonce)
//                .header("hash",hash)
//                .post(Entity.entity(requestBody, MediaType.APPLICATION_JSON));
//
//        assertNotNull(r);
//        assertTrue(r.getStatus() == HttpServletResponse.SC_CREATED);
//        Map resp = r.readEntity(Map.class);
//        assertNotNull(resp);
//        assertTrue((Boolean) resp.get("success"));
//        assertEquals(target.getUri(), r.getLocation());
//    }

    // ------------------------ SYSCONFIG TESTS -------------------------//

//    @Test
//    public void sysConfigGET() {
//        Client client = newClient();
//
//        String version = "1.0";
//        String consumerId = Setup.DUMMY_CONSUMER;
//        String nonce = "FIXME"; //TODO: fixme
//        String hash = "FIXME"; //TODO: fixme
//        String timestamp = Long.toString(System.currentTimeMillis());
//
//        WebTarget target = client.target(BASE_URL).path("sysconfig/perm.login");
//
//        Response r = target.request(MediaType.APPLICATION_JSON).header("version", version)
//                .header("consumer-id",consumerId)
//                .header("timestamp", timestamp)
//                .header("nonce",nonce)
//                .header("hash",hash).get();
//
//        assertNotNull(r);
//        assertTrue(r.getStatus() == HttpServletResponse.SC_OK);
//        Map resp = r.readEntity(Map.class);
//        assertNotNull(resp);
//        assertTrue((Boolean) resp.get("success"));
//
//    }
//
//
//    @Test
//    public void sysConfigGetAll() {
//        Client client = newClient();
//
//        String version ="1.0";
//        String consumerID = Setup.DUMMY_CONSUMER;
//        String nonce = "FIXME"; //TODO: fixme
//        String hash = "FIXME"; //TODO: fixme
//        String timestamp = Long.toString(System.currentTimeMillis());
//
//
//    }


}
