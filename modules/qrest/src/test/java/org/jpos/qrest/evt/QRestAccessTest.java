/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

package org.jpos.qrest.evt;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.jpos.log.AuditLogEvent;
import org.jpos.log.AuditLogEventProvider;
import org.jpos.log.AuditLogEventRegistry;
import org.jpos.log.AuditLogEventType;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QRestAccessTest {

    private static ObjectMapper newMapper() {
        ObjectMapper m = new ObjectMapper();
        m.registerModule(new JavaTimeModule());
        m.disable(com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return AuditLogEventRegistry.register(m);
    }

    @Test
    void serviceLoaderDiscoversQRestProvider() {
        boolean found = StreamSupport.stream(
          ServiceLoader.load(AuditLogEventProvider.class).spliterator(), false
        ).anyMatch(p -> p instanceof QRestAuditLogEventProvider);
        assertTrue(found, "ServiceLoader must discover QRestAuditLogEventProvider");
    }

    @Test
    void registryExposesQRestAccessTypeId() {
        Map<String, Class<? extends AuditLogEvent>> byName = AuditLogEventRegistry.types().stream()
          .collect(Collectors.toMap(AuditLogEventType::name, AuditLogEventType::clazz, (a, b) -> a));
        assertEquals(QRestAccess.class, byName.get("qrest-access"),
          "AuditLogEventRegistry must include the qrest-access mapping");
    }

    @Test
    void roundTripsThroughJackson() throws Exception {
        ObjectMapper mapper = newMapper();
        QRestAccess evt = new QRestAccess(
          Instant.parse("2026-05-07T12:00:00Z"),
          "GET",
          "/balance",
          200,
          7L,
          "127.0.0.1",
          "REST.Q",
          0L,
          42L
        );
        String json = mapper.writeValueAsString(evt);
        JsonNode root = mapper.readTree(json);
        assertEquals("qrest-access", root.get("t").asText());
        assertEquals("GET",          root.get("method").asText());
        assertEquals("/balance",     root.get("path").asText());
        assertEquals(200,            root.get("status").asInt());
        assertEquals(7,              root.get("elapsed").asLong());
        assertEquals("127.0.0.1",    root.get("remote").asText());
        assertEquals("REST.Q",       root.get("queue").asText());
        assertEquals(0,              root.get("requestBytes").asLong());
        assertEquals(42,             root.get("responseBytes").asLong());

        QRestAccess back = mapper.readValue(json, QRestAccess.class);
        assertEquals(evt, back);
    }

    @Test
    void omitsNullFieldsAndDoesNotLogBodies() throws Exception {
        ObjectMapper mapper = newMapper();
        QRestAccess evt = new QRestAccess(
          null, "GET", "/health", null, null, null, null, null, null
        );
        String json = mapper.writeValueAsString(evt);
        JsonNode root = mapper.readTree(json);

        assertEquals("qrest-access", root.get("t").asText());
        assertEquals("GET",          root.get("method").asText());
        assertEquals("/health",      root.get("path").asText());
        assertNull(root.get("status"),        "null status must be omitted");
        assertNull(root.get("elapsed"),       "null elapsed must be omitted");
        assertNull(root.get("remote"),        "null remote must be omitted");
        assertNull(root.get("queue"),         "null queue must be omitted");
        assertNull(root.get("requestBytes"),  "null requestBytes must be omitted");
        assertNull(root.get("responseBytes"), "null responseBytes must be omitted");

        // sanity: nothing body-shaped leaked through. The record has no body field,
        // but guard against future drift.
        assertFalse(json.contains("body"), "QRestAccess must not carry a body field");
        assertNotNull(json);
    }

    @Test
    void toStringUsesCompactAccessLogFormat() {
        QRestAccess evt = new QRestAccess(
          Instant.parse("2026-05-07T12:00:00Z"),
          "GET",
          "/api/logs/histogram",
          200,
          19L,
          "0:0:0:0:0:0:0:1",
          "TXNMGR.WEB",
          0L,
          1801L
        );

        assertEquals(
          "GET /api/logs/histogram 200 19ms [remote=::1 queue=TXNMGR.WEB in=0B out=1801B]",
          evt.toString()
        );
    }

    @Test
    void toStringOmitsMissingDetails() {
        QRestAccess evt = new QRestAccess(
          null, "GET", "/health", null, null, null, null, null, null
        );

        assertEquals("GET /health", evt.toString());
    }
}
