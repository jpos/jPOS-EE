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

package org.jpos.qrest;

import org.jpos.core.SimpleConfiguration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebSocketOriginCheckTest {
    @Test
    void acceptsSameHttpOrigin() {
        assertTrue(WebSocketUpgradeHandler.isSameOrigin(
            false, "example.test:8080", "http://example.test:8080"));
    }

    @Test
    void acceptsDefaultPorts() {
        assertTrue(WebSocketUpgradeHandler.isSameOrigin(
            false, "example.test", "http://example.test"));
        assertTrue(WebSocketUpgradeHandler.isSameOrigin(
            true, "example.test", "https://example.test"));
    }

    @Test
    void rejectsCrossSiteOrigin() {
        assertFalse(WebSocketUpgradeHandler.isSameOrigin(
            false, "example.test:8080", "http://evil.test:8080"));
        assertFalse(WebSocketUpgradeHandler.isSameOrigin(
            false, "example.test:8080", "https://example.test:8080"));
    }

    @Test
    void normalizesConfiguredAllowedOrigins() throws Exception {
        SimpleConfiguration cfg = new SimpleConfiguration();
        cfg.put("websocket-allowed-origins", "https://admin.example.test, http://localhost:8080");

        RestServer server = new RestServer();
        server.setConfiguration(cfg);

        assertTrue(server.getWebSocketAllowedOrigins().contains("https://admin.example.test:443"));
        assertTrue(server.getWebSocketAllowedOrigins().contains("http://localhost:8080"));
    }
}
