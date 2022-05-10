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

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.jpos.ee.DB;
import org.jpos.ee.SysLog;
import org.jpos.ee.SysLogManager;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Alejandro Revilla
 */
public class StatusManager {
    DB db;
    SysLogManager syslog;
    public static final Map severity = new HashMap();

    static {
        severity.put (Status.OK,       new Integer (SysLog.INFO));
        severity.put (Status.OFF,      new Integer (SysLog.INFO));
        severity.put (Status.WARN,     new Integer (SysLog.WARN));
        severity.put (Status.ERROR,    new Integer (SysLog.ERROR));
        severity.put (Status.CRITICAL, new Integer (SysLog.CRITICAL));
    }

    public StatusManager (DB db) {
        super ();
        this.db = db;
        this.syslog = new SysLogManager(db);
    }
    /**
     * @param id status id
     * @param state Status.OK, Status.WARN, Status.ERROR or user defined
     * @param detail optional detail information
     */
    public void touch (String id, String state, String detail) 
        throws HibernateException, SQLException
    {
        Transaction tx = db.beginTransaction();
        Status status = touch (id, state, detail, tx);
        tx.commit();
        db.session().evict (status);
    }

     /**
     * @param id status id
     * @param state Status.OK, Status.WARN, Status.ERROR or user defined
     * @param detail optional detail information
     * @param groupName group name
     */
    public void touch (String id, String state, String detail, String groupName) 
        throws HibernateException, SQLException
    {
        Transaction tx = db.beginTransaction();
        Status status = touch (id, state, detail, tx, groupName);
        tx.commit();
        db.session().evict (status);
    }

    /**
     * @param id status id
     * @param state Status.OK, Status.WARN, Status.ERROR or user defined
     * @param detail optional detail information
     * @param tx transaction 
     */
    public Status touch (String id, String state, String detail, Transaction tx) 
        throws HibernateException, SQLException
    {
        return touch(id, state, detail, tx, null);
    }

    /**
     * @param id status id
     * @param state Status.OK, Status.WARN, Status.ERROR or user defined
     * @param detail optional detail information
     * @param tx transaction 
     * @param groupName group name
     */
    public Status touch (String id, String state, String detail, Transaction tx, String groupName) 
        throws HibernateException, SQLException
    {
        Status status = getStatus (id, true);
        if (state == null) {
            state = Status.ERROR;
            if (detail == null)
                detail = "";
            detail = detail + " invalid state (null)";
        }
        Date now = new Date();

        String previousState = status.getState();
        if ((status.getMaxEvents() > 0 || status.getMaxEvents() == -1 ) && previousState != null && !state.equals (previousState)) {
            Set events = status.getEvents();
            if (events != null) {
                purgeEvents (events, status.getMaxEvents());
                StringBuffer transition = new StringBuffer();
                transition.append (status.getState());
                transition.append ("-->");
                transition.append (state);
                events.add (
                    syslog.log (
                        "status:" + status.getId(), state, 
                        getSysLogSeverity (state), 
                        transition.toString(),
                        detail)
                );
            }
        }
        status.setState (state);
        status.setLastTick (now);
        status.setDetail (detail);
        status.setExpired (false);
        status.setGroupName (groupName);
        return status;
    }
    
    /**
     * @param state
     * @return syslog severity associated with this state
     */
    public int getSysLogSeverity (String state) {
        if (state != null) {
            Integer sev = (Integer) severity.get (state);
            if (sev != null)
                return sev.intValue();
        }
        return SysLog.ERROR;
    }

    /**
     * @param key status name
     * @param state Status.OK, Status.WARN, Status.ERROR or user defined
     * <!-- @param info optional information -->
     */
    public void touch (String key, String state)
        throws HibernateException, SQLException
    {
        touch (key, state, null);
    }
    /**
     * @param id status id and optional name (used when create=true)
     * @param create if true and status doesn't exist, a new status with an optional name would be created.
     */
    public Status getStatus (String id, boolean create) 
        throws HibernateException, SQLException
    {
        return getStatus(id, create, null);
    }

    /**
     * @param id status id and optional name (used when create=true)
     * @param create if true and status doesn't exist, a new status with an optional name would be created.
     * @param groupName group name to be used if a new status is created.
     */
    public Status getStatus (String id, boolean create, String groupName) 
        throws HibernateException, SQLException
    {
        String name = "";
        int sp = id.indexOf (" ");
        if (sp > 0 && id.length() > sp) {
            name = id.substring (sp + 1);
            id = id.substring (0, sp);
        }
        Status s = (Status) db.session().get(Status.class, id);
        if (s == null && create) {
            s = new Status ();
            s.setId (id);
            s.setName (name.length() > 0 ? name : id);
            s.setTimeoutState (Status.OFF);
            s.setGroupName (groupName != null ? groupName : "Unfiled");
            db.save (s);
        }
        return s;
    }

    /**
     * Get optional command associated with this status.
     * If response is not null, then we understand the command has been executed
     * already and we return null.
     * @return command or null
     */
    public String getNextCommand (String id) 
        throws HibernateException, SQLException
    {
        Status status = getStatus (id, false);
        if (status != null)
            return status.getCommand();
        return null;
    }
    public void setNextCommand (String id, String command) 
        throws HibernateException, SQLException
    {
        Transaction tx = db.beginTransaction();
        Status status = getStatus (id, false);
        if (status != null)
            status.setCommand (command);
        tx.commit();
    }
    /**
     * Set command to null and optionally log optional response
     * @param id status id
     * @param response response to be logged in revision history - may be null
     */
    public void setResponse (String id, String response) 
        throws HibernateException, SQLException
    {
        Transaction tx = db.beginTransaction();
        Status status = getStatus (id, false);
        if (status != null && status.getCommand() != null && response != null && (status.getMaxEvents() > 0 || status.getMaxEvents() == -1  )) {
            Set events = status.getEvents();
            if (events != null) { 
                purgeEvents (events, status.getMaxEvents());
                StringBuffer sb = new StringBuffer();
                sb.append (status.getCommand());
                sb.append (" = ");
                sb.append (response);
                events.add (
                    syslog.log (
                        "status:" + status.getId(), "AUDIT", 
                        SysLog.INFO, 
                        sb.toString(),
                        null)
                );
            }
        }
        status.setCommand (null);   // command has been processed
        tx.commit();
        db.session().evict (status);
    }

    /**
     * check if a status is expired, and create appropriate syslog event
     * @param status Status instance
     */
    public void check (Status status) throws HibernateException, SQLException
    {
        Transaction tx = null;
        try {
            if (!status.isExpired() && status.hasExpired()) {
                tx = db.beginTransaction();
                String state = status.getState();
                String timeoutState = status.getTimeoutState();
                String detail = status.getDetail();
                if (state == null)
                    state = Status.ERROR;
                if (timeoutState == null)
                    timeoutState = Status.ERROR;
                if (detail == null)
                    detail = "(timeout)";
                else
                    detail = detail + " (timeout)";
                StringBuffer transition = new StringBuffer();
                if (!state.equals (timeoutState)) {
                    transition.append (state);
                    transition.append ("-->");
                    transition.append (timeoutState);
                }
                Set events = status.getEvents();
                purgeEvents (events, status.getMaxEvents());
                if (status.getMaxEvents() > 0 || status.getMaxEvents() == -1) {
                    events.add (
                        syslog.log (
                            "status:" + status.getId(), state, 
                            getSysLogSeverity (timeoutState), 
                            transition.toString())
                    );
                }
                status.setState (timeoutState);
                status.setExpired (true);
                status.setDetail (detail);
            }
        } finally {
            if (tx != null)
                tx.commit();
        }
    }

    /**
     * check if unexpired status entries became expired, and create 
     * appropriate syslog event.
     */
    public void check () throws HibernateException, SQLException {
        Iterator iter = findByExpired(false).iterator();
        while (iter.hasNext()) {
            check ((Status) iter.next());
        }
    }

    public List findByExpired(boolean expired) throws SQLException, HibernateException {
        Query q = db.session().createQuery ("from org.jpos.ee.status.Status where expired=:expired");
        q.setBoolean ("expired", expired);
        return q.list();
    }
    private void purgeEvents (Set events, int maxEvents) {
        if (maxEvents > 0) { 
            int rmcount = events.size() - maxEvents + 1;
            Iterator iter = events.iterator();
            for (; rmcount > 0 && iter.hasNext(); rmcount--) {
                iter.next();
                iter.remove ();
            }
        }
    }
}

