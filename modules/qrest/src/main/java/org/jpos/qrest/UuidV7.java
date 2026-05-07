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

import java.security.SecureRandom;
import java.util.UUID;

/**
 * Minimal UUIDv7 generator (RFC 9562 §5.7). Produces time-ordered identifiers
 * suitable for trace-ids — newer ids sort after older ones, which makes a log
 * stream much easier to scan than UUIDv4.
 *
 * <p>Layout: 48-bit big-endian Unix-ms timestamp, 4-bit version (7),
 * 12-bit random {@code rand_a}, 2-bit variant (10), 62-bit random
 * {@code rand_b}.</p>
 */
final class UuidV7 {
    private static final SecureRandom RNG = new SecureRandom();

    private UuidV7() { }

    static UUID randomUuidV7() {
        long ts = System.currentTimeMillis();
        long randHigh = RNG.nextLong();
        long randLow  = RNG.nextLong();

        long msb = ((ts & 0xFFFFFFFFFFFFL) << 16)
                 | 0x7000L                          // version = 7
                 | (randHigh & 0x0FFFL);            // rand_a (12 bits)
        long lsb = (randLow & 0x3FFFFFFFFFFFFFFFL)  // clear top 2 bits, keep rand_b
                 | 0x8000000000000000L;             // variant = 10

        return new UUID(msb, lsb);
    }
}
