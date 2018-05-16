package org.jpos.qrest;

import org.jpos.rc.IRC;

import java.util.HashMap;
import java.util.Map;

/**
 * QRest-specific internal result codes
 */
public enum ResultCode implements IRC {
    OK                          (0, true),
    SYSTEM_ERROR                (19000,false,true),
    MANDATORY_PARAM_NOT_PRESENT (19101),
    MANDATORY_JSON_NOT_PRESENT  (19102),
    INVALID_PARAM               (19103),
    INVALID_OPTIONAL_PARAM      (19104),
    INVALID_MANDATORY_JSON      (19105),
    INVALID_OPTIONAL_JSON       (19106);

    int irc;
    boolean success;
    boolean inhibit;
    private static Map<Integer,IRC> lookup = new HashMap<>();
    static {
        for (IRC irc : values())
            lookup.put(irc.irc(), irc);
    }

    ResultCode(int irc) {
        this.irc = irc;
        this.success = false;
        this.inhibit = false;
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

