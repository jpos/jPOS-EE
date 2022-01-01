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

import java.util.Date;
import java.sql.SQLException;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;

import org.jpos.ee.DB;
import org.jpos.q2.QBeanSupport;
import org.jpos.iso.ISOUtil;
import org.jpos.util.DateUtil;

public class Heartbeat extends QBeanSupport implements Runnable {
    DB db;
    StatusManager mgr;
    long interval;
    String statusId;

    public void initService () throws Exception {
        db = new DB();
        mgr = new StatusManager (db);
        interval = cfg.getLong ("interval", 60000L);
        initStatus();
    }
    public void startService() {
        new Thread (this).start();
    }
    public void run() {
        long start = System.currentTimeMillis();
        for (int i=1; running(); i++) {
            try {
                db.open ();
                if (cfg.getBoolean ("check", true))
                    mgr.check ();
                mgr.touch (statusId, Status.OK, getDetail (start, i));
            } catch (Throwable t) {
                getLog().error (t);
                ISOUtil.sleep (1000);
            } finally {
                close();
            }
            ISOUtil.sleep (interval);
        }
    }
    private void close() {
        try {
            db.close();
        } catch (HibernateException e) {
            getLog().error (e);
        }
    }
    protected String getDetail (long start, int tick) {
        Runtime r = Runtime.getRuntime();
        StringBuilder sb = new StringBuilder();
        sb.append ("memory=");
        sb.append (r.totalMemory());
        sb.append (", threads=");
        sb.append (Thread.activeCount());
        sb.append (", uptime=");
        sb.append (DateUtil.toDays (System.currentTimeMillis() - start));
        sb.append (", tick=");
        sb.append (tick);
        return sb.toString();
    }
    private void initStatus() 
        throws HibernateException, SQLException
    {
        try {
            db.open ();
            statusId = cfg.get ("status-id", getName());
            Status s = mgr.getStatus (statusId, false);
            if (s == null || cfg.getBoolean("update-status")) {
                Transaction tx = db.beginTransaction();
                if (s== null) s = mgr.getStatus (statusId, true);
                s.setName (cfg.get ("status-name", statusId));
                s.setGroupName (cfg.get ("status-group", ""));
                s.setTimeoutState (cfg.get ("on-timeout", Status.OFF));
                s.setTimeout (cfg.getLong ("status-timeout", 360000L));
                s.setLastTick (new Date());
                tx.commit();
            }
        } finally {
            close();
        }
    }
}

