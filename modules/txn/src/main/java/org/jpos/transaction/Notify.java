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

package org.jpos.transaction;

import java.io.Serializable;

/**
 * General purpose participant notifies objects that might be waiting 
 * on this context
 */
public class Notify implements AbortParticipant {
    public int prepare (long id, Serializable context) {
        return PREPARED | READONLY;
    }
    public int prepareForAbort (long id, Serializable context) { 
        return PREPARED | READONLY;
    }
    public void commit (long id, Serializable context) { 
        synchronized (context) {
            context.notifyAll();
        }
    }
    public void abort  (long id, Serializable context) { 
        synchronized (context) {
            context.notifyAll();
        }
    }
}

