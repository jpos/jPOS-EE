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

package org.jpos.ee.status;

import org.jpos.ee.User;
import org.jpos.util.DateUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Alejandro Revilla
 */
public abstract class StatusBase {
    public static final String OK       = "OK";
    public static final String OFF      = "OFF";
    public static final String WARN     = "WARN";
    public static final String ERROR    = "ERROR";
    public static final String CRITICAL = "CRITICAL";
    public static final String[] possibleStates = { OFF, OK, WARN, ERROR, CRITICAL };

    public static final Map icons = new HashMap();

    static {
        icons.put (OK,       "green.gif");
        icons.put (OFF,      "off.gif");
        icons.put (WARN,     "yellow.gif");
        icons.put (ERROR,    "red.gif");
        icons.put (CRITICAL, "critical.gif");
    }

    public abstract String getState();
    public abstract Date getLastTick();
    public abstract long getTimeout();
    public abstract Set getRevisions();
    public abstract String getValidCommands();

    public String getIconName() {
        String state = getState();
        String icon  = null;
        if (state != null)
            icon = (String) icons.get (state);
        return icon != null ? icon : "red.gif";
    }
    /**
     * Computes expiration based on last tick + timeout
     * @return true if lasttick+timeout &lt; current-time
     */
    public boolean hasExpired() {
        long now = System.currentTimeMillis();
        Date lastTick = getLastTick();
        long timeout = getTimeout();
        if (lastTick == null || timeout == 0)
            return false;

        long exp = lastTick.getTime() + timeout;
        return now > exp;
    }
    public String getElapsedAsString () {
        Date lastTick = getLastTick();
        if (lastTick == null)
            return "never";
        long elapsed = System.currentTimeMillis() - lastTick.getTime();
        return DateUtil.toDays (elapsed);
    }
    /**
     * factory method used to create a RevisionEntry associated with this user.
     *
     * @param info information
     * <!-- @param detail detailed information -->
     * @param author change author
     */

    public StatusRevision logRevision (String info, User author) {
        StatusRevision re = new StatusRevision();
        re.setDate (new Date());
        re.setInfo (info);
        re.setStatus ((Status) this);
        re.setAuthor (author);
        getRevisions().add (re);
        return re;
    }

    public String[] getPossibleStates() {
        return possibleStates;
    }
    public StringTokenizer getCommands () {
        if (getValidCommands() != null) {
            return new StringTokenizer (getValidCommands());
        }
        return null;
    }
}

