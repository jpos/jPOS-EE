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
}
