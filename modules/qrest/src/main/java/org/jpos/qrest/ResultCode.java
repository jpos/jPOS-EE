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
    FORBIDDEN (HttpResponseStatus.FORBIDDEN.code(), false, true),
    NOT_FOUND (HttpResponseStatus.NOT_FOUND.code(), false, true),
    INTERNAL_SERVER_ERROR (HttpResponseStatus.INTERNAL_SERVER_ERROR.code(), false, true),
    NOT_ACCEPTABLE (HttpResponseStatus.NOT_ACCEPTABLE.code(), false, true),
    NOT_IMPLEMENTED (HttpResponseStatus.NOT_IMPLEMENTED.code(), false, true);

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

