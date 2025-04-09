/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

package org.jpos.ee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SysConfigEnvironmentProviderTest {

    @SuppressWarnings("unchecked")
    SysConfigEnvironmentProvider getProvider() {
        return new SysConfigEnvironmentProvider() {
            @Override
            protected <T> T exec(DBAction<T> action) throws Exception {
                return (T) "someValue";
            }
        };
    }

    @Test
    void testGetValue() {
        SysConfigEnvironmentProvider p = getProvider();
        String value = p.get("someKey");
        assertEquals("someValue", value);
    }

    @Test
    void testKeyIsNull() {
        assertThrows(NullPointerException.class, () -> getProvider().get(null));
    }
}
