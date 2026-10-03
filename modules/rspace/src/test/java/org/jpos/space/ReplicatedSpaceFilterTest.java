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

package org.jpos.space;

import org.jpos.iso.ISOMsg;
import org.junit.jupiter.api.Test;

import javax.management.BadAttributeValueExpException;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("removal")
class ReplicatedSpaceFilterTest {
    static final ObjectInputFilter FILTER =
        ObjectInputFilter.Config.createFilter(ReplicatedSpace.DEFAULT_SERIAL_FILTER);

    static byte[] ser(Object o) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream out = new ObjectOutputStream(baos)) {
            out.writeObject(o);
        }
        return baos.toByteArray();
    }

    static ReplicatedSpace.Request read(byte[] b) throws Exception {
        return ReplicatedSpace.deserialize(b, 0, b.length, FILTER);
    }

    @Test
    void acceptsRegularRequests() throws Exception {
        ISOMsg m = new ISOMsg("0800");
        m.set(11, "000001");
        Map<String,Object> map = new HashMap<>();
        map.put("bytes", new byte[] { 1, 2, 3 });
        map.put("msg", m);
        ReplicatedSpace.Request r = read(ser(new ReplicatedSpace.Request(ReplicatedSpace.Request.OUT, "k", map, 0)));
        assertEquals("k", r.key);
        assertEquals("000001", ((ISOMsg) ((Map<?,?>) r.value).get("msg")).getString(11));
    }

    @Test
    void rejectsNonAllowlistedTopLevelObject() {
        assertThrows(InvalidClassException.class, () -> read(ser(new BadAttributeValueExpException("x"))));
    }

    @Test
    void rejectsNonAllowlistedNestedValue() {
        assertThrows(InvalidClassException.class, () -> read(ser(
          new ReplicatedSpace.Request(ReplicatedSpace.Request.OUT, "k", new BadAttributeValueExpException("x"), 0))));
    }

    @Test
    void rejectsAllowlistedButNonRequest() {
        assertThrows(InvalidObjectException.class, () -> read(ser("just a string")));
    }

    @Test
    void rejectsDeepNesting() {
        List<Object> root = new ArrayList<>();
        List<Object> cur = root;
        for (int i = 0; i < 100; i++) {
            List<Object> next = new ArrayList<>();
            cur.add(next);
            cur = next;
        }
        assertThrows(InvalidClassException.class, () -> read(ser(
          new ReplicatedSpace.Request(ReplicatedSpace.Request.OUT, "k", root, 0))));
    }
}
