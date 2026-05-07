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

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UuidV7Test {

    @Test
    void hasVersionSevenAndRfc9562Variant() {
        UUID uuid = UuidV7.randomUuidV7();
        assertEquals(7, uuid.version(), "UUIDv7 must have version=7");
        assertEquals(2, uuid.variant(), "UUIDv7 must use the RFC 9562 variant (10xx)");
    }

    @Test
    void embedsCurrentMillisecondTimestamp() {
        long before = System.currentTimeMillis();
        UUID uuid = UuidV7.randomUuidV7();
        long after = System.currentTimeMillis();

        long ts = uuid.getMostSignificantBits() >>> 16;
        assertTrue(ts >= before && ts <= after,
          "embedded timestamp " + ts + " must fall in [" + before + ", " + after + "]");
    }

    @Test
    void successiveIdsAreOrderedByTime() throws InterruptedException {
        UUID first = UuidV7.randomUuidV7();
        Thread.sleep(2);
        UUID second = UuidV7.randomUuidV7();
        long firstTs = first.getMostSignificantBits() >>> 16;
        long secondTs = second.getMostSignificantBits() >>> 16;
        assertTrue(secondTs > firstTs,
          "later UUIDv7 must carry a strictly greater timestamp (" + firstTs + " vs " + secondTs + ")");
    }

    @Test
    void successiveIdsAreUnique() {
        Set<UUID> ids = new HashSet<>();
        for (int i = 0; i < 1000; i++)
            ids.add(UuidV7.randomUuidV7());
        assertEquals(1000, ids.size(), "consecutive UUIDv7 generations must not collide");
    }
}
