/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2019 jPOS Software SRL
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

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SensitiveStringTest {
    @Test
    public void testSS() throws Exception {
        String s = this.toString();
        for (int i=0; i<15; i++) {
            SensitiveString ss = new SensitiveString(s);
            assertEquals("Should be equal", s, ss.get());
            s = s + System.lineSeparator() + s;
        }
    }

    @Test
    public void testSSEquals() throws Exception {
        String s = "The quick brown fox jumps over the lazy dog";
        SensitiveString ss0 = new SensitiveString(s);
        SensitiveString ss1 = new SensitiveString(s);
        assertEquals ("Equals should be true", ss0, ss1);
    }
}
