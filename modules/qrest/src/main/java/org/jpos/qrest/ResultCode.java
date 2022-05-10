/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

import io.netty.handler.codec.http.HttpResponseStatus;
import org.jpos.rc.IRC;

import java.util.HashMap;
import java.util.Map;

/**
 * QRest-specific internal result codes
 */
public enum ResultCode implements IRC {
    OK (HttpResponseStatus.OK.code(), true),
    CREATED (HttpResponseStatus.CREATED.code(), true),
    ACCEPTED (HttpResponseStatus.ACCEPTED.code(), true),
    NO_CONTENT (HttpResponseStatus.NO_CONTENT.code(), true, true),
    BAD_REQUEST (HttpResponseStatus.BAD_REQUEST.code(), false, true),
    UNAUTHORIZED (HttpResponseStatus.UNAUTHORIZED.code(), false, true),
    FORBIDDEN (HttpResponseStatus.FORBIDDEN.code(), false, true),
    NOT_FOUND (HttpResponseStatus.NOT_FOUND.code(), false, true),
    NOT_ACCEPTABLE (HttpResponseStatus.NOT_ACCEPTABLE.code(), false, true),
    CONFLICT (HttpResponseStatus.CONFLICT.code(), false, true),
    INTERNAL_SERVER_ERROR (HttpResponseStatus.INTERNAL_SERVER_ERROR.code(), false, true),
    NOT_IMPLEMENTED (HttpResponseStatus.NOT_IMPLEMENTED.code(), false, true),
    SERVICE_UNAVAILABLE (HttpResponseStatus.SERVICE_UNAVAILABLE.code(), false, true),
    GATEWAY_TIMEOUT(HttpResponseStatus.GATEWAY_TIMEOUT.code(), false, true);

    int irc;
    boolean success;
    boolean inhibit;
    private static Map<Integer,IRC> lookup = new HashMap<>();
    static {
        for (IRC irc : values())
            lookup.put(irc.irc(), irc);
    }

    ResultCode(int irc, boolean success) {
        this.irc = irc;
        this.success = success;
        this.inhibit = false;
    }

    ResultCode(int irc, boolean success, boolean inhibit) {
        this.irc = irc;
        this.success = success;
        this.inhibit = inhibit;
    }

    @Override
    public int irc() {
        return irc;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public boolean inhibit() { return inhibit; }

    public static IRC valueOf(int i) {
        return lookup.get(i);
    }
}

