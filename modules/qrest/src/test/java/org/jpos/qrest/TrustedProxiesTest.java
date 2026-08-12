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

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrustedProxiesTest {
    private static final TrustedProxies POD_NET = TrustedProxies.parse("10.42.0.0/16");

    @Test
    void blankConfigDisablesTheFeature() {
        assertNull(TrustedProxies.parse(null));
        assertNull(TrustedProxies.parse(""));
        assertNull(TrustedProxies.parse("  ,  "));
    }

    @Test
    void malformedCidrFailsLoudly() {
        assertThrows(IllegalArgumentException.class, () -> TrustedProxies.parse("not-a-cidr"));
        assertThrows(IllegalArgumentException.class, () -> TrustedProxies.parse("10.42.0.0/99"));
    }

    @Test
    void cidrMembership() {
        assertTrue(POD_NET.isTrusted("10.42.7.13"));
        assertFalse(POD_NET.isTrusted("10.43.0.1"));
        assertFalse(POD_NET.isTrusted("203.0.113.7"));
        assertFalse(POD_NET.isTrusted("embedded"));   // non-literal peer
        assertFalse(POD_NET.isTrusted(null));
    }

    @Test
    void untrustedPeerNeverGetsItsHeaderBelieved() {
        // Direct caller forging X-Forwarded-For: the socket wins.
        assertEquals("203.0.113.7",
          POD_NET.resolveClient("203.0.113.7", List.of("198.51.100.99")));
    }

    @Test
    void trustedPeerYieldsRightmostUntrustedEntry() {
        assertEquals("203.0.113.7",
          POD_NET.resolveClient("10.42.0.9", List.of("203.0.113.7")));
        // Client-forged prefix entries are ignored; the entry appended by
        // the trusted proxy (rightmost untrusted) wins.
        assertEquals("203.0.113.7",
          POD_NET.resolveClient("10.42.0.9", List.of("1.2.3.4, 203.0.113.7")));
        // Multiple header occurrences concatenate in order.
        assertEquals("203.0.113.7",
          POD_NET.resolveClient("10.42.0.9", List.of("1.2.3.4", "203.0.113.7")));
    }

    @Test
    void chainOfTrustedProxiesSkipsToTheClient() {
        TrustedProxies tp = TrustedProxies.parse("10.42.0.0/16, 192.168.1.1/32");
        assertEquals("203.0.113.7",
          tp.resolveClient("10.42.0.9", List.of("203.0.113.7, 192.168.1.1")));
    }

    @Test
    void allTrustedChainYieldsOriginator() {
        assertEquals("10.42.3.3",
          POD_NET.resolveClient("10.42.0.9", List.of("10.42.3.3, 10.42.0.5")));
    }

    @Test
    void missingOrGarbageHeaderFallsBackToSocketPeer() {
        assertEquals("10.42.0.9", POD_NET.resolveClient("10.42.0.9", List.of()));
        assertEquals("10.42.0.9", POD_NET.resolveClient("10.42.0.9", null));
        assertEquals("10.42.0.9",
          POD_NET.resolveClient("10.42.0.9", List.of("unknown, not-an-ip")));
    }

    @Test
    void normalizationHandlesPortsBracketsAndQuotes() {
        assertEquals("203.0.113.7",
          POD_NET.resolveClient("10.42.0.9", List.of("203.0.113.7:4711")));
        assertEquals("2001:db8::1",
          POD_NET.resolveClient("10.42.0.9", List.of("[2001:db8::1]:443")));
        assertEquals("203.0.113.7",
          POD_NET.resolveClient("10.42.0.9", List.of("\"203.0.113.7\"")));
    }

    @Test
    void ipv6Cidr() {
        TrustedProxies tp = TrustedProxies.parse("2001:db8::/32");
        assertTrue(tp.isTrusted("2001:db8::1"));
        assertFalse(tp.isTrusted("2001:db9::1"));
    }
}
