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

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * Resolves the originating client address of a proxied HTTP request from
 * {@code X-Forwarded-For}, but only when the socket peer is a proxy the
 * operator explicitly trusts.
 *
 * <p>Configured on the {@code qrest} QBean via {@code trusted-proxy-cidrs},
 * a comma-separated list of CIDRs (e.g. {@code 10.42.0.0/16, 127.0.0.1/32}).
 * When the property is absent the feature is off and the access log keeps
 * recording the socket peer — forwarded headers are client-controlled input
 * and must never be believed coming from an untrusted peer, or any caller
 * could forge its logged identity with a single crafted header.</p>
 *
 * <p>Resolution walks the forwarded chain right to left — the rightmost
 * entries were appended by the proxies closest to this server — skipping
 * addresses inside the trusted CIDRs; the first address NOT in the trusted
 * set is the client as witnessed by the outermost trusted proxy. A chain
 * consisting solely of trusted addresses yields its leftmost entry (the
 * originator lives inside the trusted network); an empty or absent header
 * yields the socket peer.</p>
 */
public class TrustedProxies {
    private final List<Cidr> cidrs;

    private TrustedProxies(List<Cidr> cidrs) {
        this.cidrs = cidrs;
    }

    /**
     * Parses a comma-separated CIDR list.
     *
     * @param csv the {@code trusted-proxy-cidrs} property value, may be null
     * @return a resolver, or {@code null} when the value is null/blank
     * @throws IllegalArgumentException on a malformed CIDR — a typo must
     *         fail deployment loudly rather than silently disable the
     *         feature or, worse, trust the wrong network
     */
    public static TrustedProxies parse(String csv) {
        if (csv == null || csv.isBlank())
            return null;
        List<Cidr> cidrs = new ArrayList<>();
        for (String part : csv.split(",")) {
            String v = part.trim();
            if (!v.isEmpty())
                cidrs.add(Cidr.parse(v));
        }
        return cidrs.isEmpty() ? null : new TrustedProxies(cidrs);
    }

    public boolean isTrusted(String ip) {
        InetAddress addr = parseAddress(ip);
        if (addr == null)
            return false;
        for (Cidr c : cidrs)
            if (c.matches(addr))
                return true;
        return false;
    }

    /**
     * Returns the client address to record for a request that arrived from
     * {@code socketPeer} carrying the given {@code X-Forwarded-For} header
     * values (one list element per header occurrence).
     */
    public String resolveClient(String socketPeer, List<String> forwardedFor) {
        if (!isTrusted(socketPeer))
            return socketPeer;
        List<String> chain = new ArrayList<>();
        if (forwardedFor != null) {
            for (String header : forwardedFor) {
                if (header == null)
                    continue;
                for (String part : header.split(",")) {
                    String ip = normalize(part);
                    if (ip != null)
                        chain.add(ip);
                }
            }
        }
        for (int i = chain.size() - 1; i >= 0; i--) {
            if (!isTrusted(chain.get(i)))
                return chain.get(i);
        }
        return chain.isEmpty() ? socketPeer : chain.get(0);
    }

    /**
     * Strips surrounding quotes, IPv6 brackets and an IPv4 port suffix,
     * returning null unless the remainder parses as an address literal.
     */
    private static String normalize(String value) {
        if (value == null)
            return null;
        String v = value.trim();
        if (v.length() >= 2 && v.startsWith("\"") && v.endsWith("\""))
            v = v.substring(1, v.length() - 1).trim();
        if (v.isEmpty() || "unknown".equalsIgnoreCase(v))
            return null;
        if (v.startsWith("[") && v.contains("]")) {
            v = v.substring(1, v.indexOf(']'));
        } else {
            int colon = v.indexOf(':');
            if (colon > 0 && v.indexOf(':', colon + 1) < 0)
                v = v.substring(0, colon); // IPv4:port
        }
        return parseAddress(v) != null ? v : null;
    }

    private static InetAddress parseAddress(String ip) {
        if (ip == null)
            return null;
        try {
            // Literals only — InetAddress.getByName on a hostname would do DNS.
            if (!ip.matches("\\d{1,3}(\\.\\d{1,3}){3}") && !ip.contains(":"))
                return null;
            return InetAddress.getByName(ip);
        } catch (Exception e) {
            return null;
        }
    }

    private record Cidr(InetAddress network, int prefixLength) {
        static Cidr parse(String value) {
            String[] parts = value.split("/", 2);
            InetAddress network = parseAddress(parts[0].trim());
            if (network == null)
                throw new IllegalArgumentException("invalid CIDR address: " + value);
            int bits = network.getAddress().length * 8;
            int prefix = parts.length == 2 ? Integer.parseInt(parts[1].trim()) : bits;
            if (prefix < 0 || prefix > bits)
                throw new IllegalArgumentException("invalid CIDR prefix: " + value);
            return new Cidr(network, prefix);
        }

        boolean matches(InetAddress address) {
            byte[] a = address.getAddress();
            byte[] n = network.getAddress();
            if (a.length != n.length)
                return false;
            int fullBytes = prefixLength / 8;
            int rest = prefixLength % 8;
            for (int i = 0; i < fullBytes; i++)
                if (a[i] != n[i])
                    return false;
            if (rest == 0)
                return true;
            int mask = 0xff << (8 - rest);
            return (a[fullBytes] & mask) == (n[fullBytes] & mask);
        }
    }
}
