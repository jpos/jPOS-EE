/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

package org.jpos.ee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.query.criteria.internal.OrderImpl;
import org.jpos.util.Logger;
import org.jpos.util.LogEvent;
import org.hibernate.Transaction;

import javax.persistence.criteria.*;

@SuppressWarnings("unused")
public class SysLogManager {
    DB db;
    boolean autoCommit;

    /**
     * create a SysLog object with auto commit on.
     * (open/begin/commit/close is not required).
     */
    public SysLogManager () {
        super ();
        db = new DB();
        autoCommit = true;
    }

    /**
     * create a SysLogManager with auto commit off.
     * User is responsible for opening the underlying session
     * and committing the transaction.
     * @param db the DB instance
     */
    public SysLogManager (DB db) {
        super();
        this.db = db;
        autoCommit = false;
    }

    /**
     * create a SysLogManager
     * @param db the DB instance
     * @param autoCommit true if we want this manager to auto-commit log events
     */
    public SysLogManager (DB db, boolean autoCommit) {
        super();
        this.db = db;
        this.autoCommit = autoCommit;
    }


    /**
     * @param autoCommit set autocommit mode
     */
    public void setAutocommit (boolean autoCommit) {
        this.autoCommit = autoCommit;
    }
    /**
     * @return auto commit mode
     */
    public boolean isAutoCommit() {
        return autoCommit;
    }

    /**
     * Create a SysLogEvent and add it to the DB.
     * If auto commit is on, then the operation is performed
     * within a transaction, otherwise, it's up to the user
     * to commit or flush the session.
     * @param source this log event source
     * @param type application specific event type (i.e. INFO, WARN, ERROR, ...)
     * @param severity either DEBUG, TRACE, INFO, WARN, ERROR or CRITICAL
     * @param summary summary information
     * @param detail optional detail information
     * @param trace optional trace information
     * @return the newly created SysLogEvent
     */
    public SysLog log (String source, String type, int severity,
        String summary, String detail, String trace)
    {
        SysLog evt = new SysLog ();
        try {
            evt.setDate (new Date());
            evt.setSource (source);
            evt.setType (type);
            evt.setSeverity (severity);
            evt.setSummary (summary);
            evt.setDetail (detail);
            evt.setTrace (trace);

            boolean autoClose = false;
            if (autoCommit && db.session() == null) {
                db.open ();
                autoClose = true;
            }
            if (autoCommit) {
                Transaction tx = db.beginTransaction ();
                db.session().save (evt);
                tx.commit ();
            } else {
                db.session().save (evt);
            }
            if (autoClose)
                db.close ();
        } catch (Throwable t) {
            errorLog (evt, t);
        }
        return evt;
    }
    /**
     * Create a SysLogEvent and add it to the DB.
     * If auto commit is on, then the operation is performed
     * within a transaction, otherwise, it's up to the user
     * to commit or flush the session.
     * @param source this log event source
     * @param type application specific event type (i.e. INFO, WARN, ERROR, ...)
     * @param severity either DEBUG, TRACE, INFO, WARN, ERROR or CRITICAL
     * @param summary summary information
     * @param detail optional detail information
     * @return the newly created SysLogEvent
     */
    public SysLog log (String source, String type, int severity,
        String summary, String detail)
    {
        return log (source, type, severity, summary, detail, null);
    }
    /**
     * Create a SysLogEvent and add it to the DB.
     * If auto commit is on, then the operation is performed
     * within a transaction, otherwise, it's up to the user
     * to commit or flush the session.
     * @param source this log event source
     * @param type application specific event type (i.e. INFO, WARN, ERROR, ...)
     * @param severity either DEBUG, TRACE, INFO, WARN, ERROR or CRITICAL
     * @param summary summary information
     * @return the newly created SysLogEvent
     */
    public SysLog log 
        (String source, String type, int severity, String summary) 
    {
        return log (source, type, severity, summary, null, null);
    }
    private void errorLog (SysLog evt, Throwable t) {
        LogEvent ev = db.getLog().createError ();
        ev.addMessage (new LoggeableSysLog (evt));
        ev.addMessage (t);
        Logger.log (ev);
    }
    public SysLog get (long id) {
        try {
            return db.session().load (SysLog.class, new Long (id));
        } catch (Throwable e) {
            db.getLog().error (e);
        } 
        return null;
    }

    public List<SysLog> getAll(int offset, int limit, Map<String,Boolean> orders) throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<SysLog> query = criteriaBuilder.createQuery(SysLog.class);
        Root<SysLog> root = query.from(SysLog.class);
        List<Order> orderList = new ArrayList<>();
        //ORDERS
        for (Map.Entry<String,Boolean> entry : orders.entrySet()) {
            OrderImpl order = new OrderImpl(root.get(entry.getKey()),entry.getValue());
            orderList.add(order);
        }
        query.select(root);
        query.orderBy(orderList);
        return db.session().createQuery(query)
                .setMaxResults(limit)
                .setFirstResult(offset)
                .getResultList();
    }

    public int getItemCount() throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        query.select(criteriaBuilder.count(query.from(SysLog.class)));
        return db.session().createQuery(query).getSingleResult().intValue();
    }

}

