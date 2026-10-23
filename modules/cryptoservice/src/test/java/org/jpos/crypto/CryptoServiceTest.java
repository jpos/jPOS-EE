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


package org.jpos.crypto;

import org.jpos.core.ConfigurationException;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CryptoServiceTest {
    @Test
    public void setKeyStoreProviderInitializesAndUsesTheProviderWithoutQ2() throws Exception {
        RecordingProvider provider = new RecordingProvider();
        CryptoService cs = new CryptoService();
        cs.setKeyStoreProvider(provider);
        assertTrue(provider.initialized, "the provider is initialized as the ks-provider element would be");

        UUID keyId = UUID.randomUUID();
        SecurityException e = assertThrows(SecurityException.class,
          () -> cs.loadKey(UUID.randomUUID(), keyId, "passphrase".toCharArray()));
        assertEquals("Invalid key", e.getMessage());
        assertEquals(keyId.toString(), provider.asked, "the key is looked up in the provider that was set");
    }

    @Test
    public void setKeyStoreProviderRefusesNullAndAFailingInit() {
        CryptoService cs = new CryptoService();
        assertThrows(ConfigurationException.class, () -> cs.setKeyStoreProvider(null));
        assertThrows(ConfigurationException.class, () -> cs.setKeyStoreProvider(new RecordingProvider() {
            @Override
            public void init() throws Exception {
                throw new IllegalStateException("no store");
            }
        }));
    }

    private static class RecordingProvider implements CryptoServiceKeyStoreProvider {
        boolean initialized;
        String asked;

        @Override
        public void init() throws Exception {
            initialized = true;
        }

        @Override
        public void put(String id, String value, boolean override) {
        }

        @Override
        public String get(String id) {
            asked = id;
            return null;
        }
    }
}
