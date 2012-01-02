/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2012 Alejandro P. Revilla
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

import java.io.Serializable;
import java.util.Set;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.JDBCException;
import org.hibernate.Hibernate;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.CollectionKey;
import org.hibernate.engine.EntityKey;
import org.hibernate.stat.SessionStatistics;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.Type;
import org.jpos.util.Log;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;
import org.jpos.core.Sequencer;

/**
 * @author Alejandro P. Revilla
 * @version $Revision: 1.5 $ $Date: 2004/12/09 00:50:14 $
 *
 * DB encapsulate some housekepping specific 
 * to Hibernate O/R mapping engine
 */
public class DB {
    protected static SessionFactory sf;
    protected static Configuration cfg;
    Session session;
    Log log;

    static {
        try {
            init ();
        } catch (Exception e) {
            // now we're in deep trouble
            e.printStackTrace();
        }
    }
    public DB () {
        super();
    }
    public DB (Log log) {
        super ();
        setLog (log);
    }
    private static void init () throws HibernateException {
        synchronized (DB.class) {
            if (cfg != null)
                return;

            cfg = new Configuration().configure();
            sf  = cfg.buildSessionFactory();
        }
    }
    /**
     * @return Hibernate's session factory
     */
    public SessionFactory getSessionFactory () {
        return sf;
    }
    /**
     * Creates database schema
     * @param outputFile optional output file (may be null)
     * @param create true to actually issue the create statements
     */
    public void createSchema (String outputFile, boolean create) 
        throws HibernateException 
    {
        SchemaExport export = new SchemaExport (cfg);
        if (outputFile != null) {
            export.setOutputFile (outputFile);
            export.setDelimiter (";");
        }
        export.create (true, create);  
    }
    /**
     * open a new HibernateSession if none exists 
     * @throws HibernateException
     * @return HibernateSession associated with this DB object
     */
    public synchronized Session open () throws HibernateException {
        if (session == null)
            session = sf.openSession ();
        return session;
    }
    /**
     * close hibernate session
     * @throws HibernateException
     */
    public synchronized void close () throws HibernateException {
        if (session != null) {
            session.close ();
            session = null;
        }
    }
    /**
     * @return session hibernate Session 
     */
    public Session session () {
        return session;
    }
    /**
     * handy method used to avoid having to call db.session().save (xxx)
     * @param obj to save
     */
    public void save (Object obj) throws HibernateException {
        session.save (obj);
    }

    public void delete (Object obj) {
        session.delete (obj);
    }

    /**
     * @return newly created Transaction
     * @throws HibernateException
     */
    public synchronized Transaction beginTransaction () 
        throws HibernateException
    {
        return session.beginTransaction ();
    }
    public synchronized void commit() {
        if (session() != null) {
            Transaction tx = session().getTransaction();
            if (tx != null && tx.isActive())
                tx.commit();
        }
    }
    public synchronized void rollback() {
        if (session() != null) {
            Transaction tx = session().getTransaction();
            if (tx != null && tx.isActive())
                tx.rollback();
        }
    }
    /**
     * @param  timeout in seconds
     * @return newly created Transaction
     * @throws HibernateException
     */
    public synchronized Transaction beginTransaction (int timeout) 
        throws HibernateException
    {
        Transaction tx = session.beginTransaction ();
        if (timeout > 0)
            tx.setTimeout (timeout);
        return tx;
    }
    public synchronized Log getLog () {
        if (log == null)
            log = Log.getLog ("Q2", "DB"); // Q2 standard Logger
        return log;
    }
    public synchronized void setLog (Log log) {
        this.log = log;
    }
    public void printStats() {
        if (getLog()!=null) {
            LogEvent info = getLog().createInfo();

            if (session != null) {
                info.addMessage("====  STATISTICS ====");
                SessionStatistics statistics = session().getStatistics();
                info.addMessage("====   ENTITIES  ====");
                Set<EntityKey> entityKeys = statistics.getEntityKeys();
                for (EntityKey ek : entityKeys) {
                    info.addMessage(
                        String.format("[%s] %s",
                            ek.getIdentifier(), ek.getEntityName())
                        );
                }
                info.addMessage("==== COLLECTIONS ====");
                Set<CollectionKey> collectionKeys = statistics.getCollectionKeys();
                for (CollectionKey ck : collectionKeys) {
                    info.addMessage(
                        String.format("[%s] %s", ck.getKey(), ck.getRole())
                    );
                }
                info.addMessage("=====================");
            } else
                info.addMessage ("Session is not open");
            Logger.log(info);

        }
    }
}

