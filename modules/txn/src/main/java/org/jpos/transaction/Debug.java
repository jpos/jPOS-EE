/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

package org.jpos.transaction;

import java.io.Serializable;
import org.jpos.util.Logger;
import org.jpos.util.LogEvent;

public class Debug extends TxnSupport implements AbortParticipant {
    public int prepare (long id, Serializable o) {
        // Logger.log (createEvent ("prepare", id, (Context) o));
        return PREPARED | READONLY;
    }
    public int prepareForAbort (long id, Serializable o) { 
        // Logger.log (createEvent ("prepare-for-abort", id, (Context) o));
        return PREPARED | READONLY;
    }
    public void commit (long id, Serializable o) { 
        Logger.log (createEvent ("commit", id, (Context) o));
    }
    public void abort  (long id, Serializable o) { 
        Logger.log (createEvent ("abort", id, (Context) o));
    }
    private LogEvent createEvent (String action, long id, Context ctx) {
        LogEvent evt = createLogEvent (action);
        evt.addMessage ("<id>" + id + "</id>");
        evt.addMessage (ctx);
        return evt;
    }
}

