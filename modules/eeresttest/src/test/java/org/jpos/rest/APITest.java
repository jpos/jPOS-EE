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
