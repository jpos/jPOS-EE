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

import java.util.Map;
import java.io.Serializable;
import org.jpos.util.Log;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.ee.DB;
import org.jpos.ee.BLException;

public abstract class TxnSupport extends Log 
    implements TransactionParticipant, Configurable, TxnConstants
{
    protected Configuration cfg;

    protected int doPrepare (long id, Context ctx) throws Exception {
        return ABORTED; // misconfigured participant
    }
    protected int doPrepareForAbort (long id, Context ctx) throws Exception {
        return ABORTED; // misconfigured participant
    }
    public int prepare (long id, Serializable o) {
        Context ctx = (Context) o;
        try {
            return doPrepare (id, ctx);
        } catch (BLException e) {
            setResultCode (ctx, e.getMessage(), e.getDetail());
        } catch (Throwable t) {
            ctx.log ("prepare exception in " + this.getClass().getName());
            ctx.log (t);
            setResultCode (ctx, t.getMessage());
        } finally {
            checkPoint (ctx);
        }
        return ABORTED;
    }
    
    public int prepareForAbort (long id, Serializable o) {
        // TxnSupport does not implement AbortParticipant on purpose,
        // but participants willing to implement it will benefit from
        // this method.
        Context ctx = (Context) o;
        try {
            return doPrepareForAbort (id, ctx);
        } catch (BLException e) {
            setResultCode (ctx, e.getMessage(), e.getDetail());
        } catch (Throwable t) {
            ctx.log ("prepare exception in " + this.getClass().getName());
            ctx.log (t);
            setResultCode (ctx, t.getMessage());
        } finally {
            checkPoint (ctx);
        }
        return ABORTED;
    }

    protected void assertTrue (boolean condition, String message) 
        throws BLException 
    {
        if (!condition)
            throw new BLException (message);
    }
    protected void assertFalse (boolean condition, String message) 
        throws BLException 
    {
        if (condition)
            throw new BLException (message);
    }
    protected void assertTrue 
        (boolean condition, String message, String detail) 
        throws BLException 
    {
        if (!condition)
            throw new BLException (message, detail);
    }
    protected void assertFalse
        (boolean condition, String message, String detail) 
        throws BLException 
    {
        if (condition)
            throw new BLException (message, detail);
    }
    protected void assertNotNull (Object obj, String message)
        throws BLException
    {
        if (obj == null)
            throw new BLException (message);
    }
    protected void assertNotNull (Object obj, String message, String detail)
        throws BLException
    {
        if (obj == null)
            throw new BLException (message, detail);
    }
    protected void assertNotNull (Object obj, int resultCode)
        throws BLException
    {
        if (obj == null)
            throw new BLException (Integer.toString (resultCode));
    }
    protected void assertNotNull (Object obj, int resultCode, String detail)
        throws BLException
    {
        if (obj == null)
            throw new BLException (Integer.toString (resultCode), detail);
    }
    protected void assertNotNull (Map map, String[] props, String message)
        throws BLException
    {
        for (int i=0; i<props.length; i++)
            assertNotNull (map.get (props[i]), message);
    }
    protected void assertNull (Object obj, String message)
        throws BLException
    {
        if (obj != null)
            throw new BLException (message);
    }
    protected void assertNull (Object obj, String message, String detail)
        throws BLException
    {
        if (obj != null)
            throw new BLException (message, detail);
    }
    protected void checkPoint (Context ctx) {
        String checkPointMessage = cfg.get ("checkpoint", null);
        if (checkPointMessage != null)
            ctx.checkPoint (checkPointMessage);
    }
    public void setConfiguration (Configuration cfg) 
        throws ConfigurationException
    {
        this.cfg = cfg;
    }
    public synchronized DB getDB (Context ctx) {
        DB db = (DB) ctx.get (DB);
        if (db == null) {
            ctx.put (DB, db = new DB ());
        }
        return db;
    }
    public void setResultCode (Context ctx, String rc) {
        setResultCode (ctx, rc, null);
    }
    public void setResultCode (Context ctx, String rc, String detail) {
        ctx.put (RC, rc);
        if (detail != null)
            ctx.put (EXTRC, detail);
    }
}

