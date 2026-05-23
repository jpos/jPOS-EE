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

package org.jpos.ee.usertype;

import org.jpos.util.Tags;
import org.junit.jupiter.api.Test;

import java.io.Serializable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TagsTypeTest {
    private final TagsType tagsType = new TagsType();

    @Test
    void deepCopyReturnsNullForNullValue() {
        assertNull(tagsType.deepCopy(null));
    }

    @Test
    void deepCopyReturnsSeparateEqualInstance() {
        Tags tags = new Tags("a,b");

        Tags copy = tagsType.deepCopy(tags);

        assertEquals(tags, copy);
        assertNotSame(tags, copy);
    }

    @Test
    void equalsHandlesNullAndTagsValues() {
        assertTrue(tagsType.equals(null, null));
        assertFalse(tagsType.equals(null, new Tags()));
        assertTrue(tagsType.equals(new Tags("a"), new Tags("a")));
    }

    @Test
    void hashCodeReturnsZeroForNullValue() {
        assertEquals(0, tagsType.hashCode(null));
    }

    @Test
    void disassembleAndAssembleAreNullSafeAndSymmetric() {
        assertNull(tagsType.disassemble(null));
        assertNull(tagsType.assemble(null, null));

        Tags tags = new Tags("a,b");
        Serializable cached = tagsType.disassemble(tags);

        assertEquals(tags, tagsType.assemble(cached, null));
    }
}
