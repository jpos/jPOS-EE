/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2015 Alejandro P. Revilla
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

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.CollectionKey;
import org.hibernate.engine.spi.EntityKey;
import org.hibernate.stat.SessionStatistics;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.jpos.ee.support.JPosHibernateConfiguration;
import org.jpos.util.Log;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.util.Set;

/**
 * @author Alejandro P. Revilla
 * @version $Revision: 1.5 $ $Date: 2004/12/09 00:50:14 $
 *          <p/>
 *          DB encapsulate some housekeeping specific
 *          to Hibernate O/R mapping engine
 */
@SuppressWarnings({"UnusedDeclaration"})
public class DB
{
    Session session;
    Log log;

    private static class HibernateResourceHolder
    {
        public static volatile HibernateAccessService INSTANCE = new DefaultHibernateAccessService(null,
                                                                                                   new JPosHibernateConfiguration(),
                                                                                                   null,
                                                                                                   false);
    }

    /**
     * Creates DB Object using default Hibernate instance
     */
    public DB() {
        super();
    }

    /**
     * Creates DB Object using default Hibernate instance
     * @param log Log object
     */
    public DB(Log log)
    {
        super();
        setLog(log);
    }

    /**
     * @return Hibernate's session factory
     */
    public SessionFactory getSessionFactory()
    {
        return getHibernateAccessService().getSessionFactory();
    }

    protected HibernateAccessService getHibernateAccessService()
    {
        return HibernateResourceHolder.INSTANCE;
    }

    /**
     * Creates database schema
     *
     * @param outputFile optional output file (may be null)
     * @param create     true to actually issue the create statements
     */
    public void createSchema(String outputFile, boolean create) throws HibernateException
    {
        SchemaExport export = new SchemaExport(getHibernateAccessService().getConfiguration());
        if (outputFile != null)
        {
            export.setOutputFile(outputFile);
            export.setDelimiter(";");
        }
        export.create(true, create);
    }

    /**
     * open a new HibernateSession if none exists
     *
     * @return HibernateSession associated with this DB object
     * @throws HibernateException
     */
    public synchronized Session open() throws HibernateException
    {
        if (session == null)
        {
            session = getSessionFactory().openSession();
            if(getHibernateAccessService().isReadOnly())
            {
                session.setDefaultReadOnly(true);
            }
        }
        return session;
    }

    /**
     * close hibernate session
     *
     * @throws HibernateException
     */
    public synchronized void close() throws HibernateException
    {
        if (session != null)
        {
            session.close();
            session = null;
        }
    }

    /**
     * @return session hibernate Session
     */
    public Session session()
    {
        return session;
    }

    /**
     * handy method used to avoid having to call db.session().save (xxx)
     *
     * @param obj to save
     */
    public void save(Object obj) throws HibernateException
    {
        session.save(obj);
    }

    /**
     * handy method used to avoid having to call db.session().saveOrUpdate (xxx)
     *
     * @param obj to save or update
     */
    public void saveOrUpdate(Object obj) throws HibernateException
    {
        session.saveOrUpdate(obj);
    }

    public void delete(Object obj)
    {
        session.delete(obj);
    }

    /**
     * @return newly created Transaction
     * @throws HibernateException
     */
    public synchronized Transaction beginTransaction() throws HibernateException
    {
        return session.beginTransaction();
    }

    public synchronized void commit()
    {
        if (session() != null)
        {
            Transaction tx = session().getTransaction();
            if (tx != null && tx.isActive())
            {
                tx.commit();
            }
        }
    }

    public synchronized void rollback()
    {
        if (session() != null)
        {
            Transaction tx = session().getTransaction();
            if (tx != null && tx.isActive())
            {
                tx.rollback();
            }
        }
    }

    /**
     * @param timeout in seconds
     * @return newly created Transaction
     * @throws HibernateException
     */
    public synchronized Transaction beginTransaction(int timeout) throws HibernateException
    {
        Transaction tx = session.beginTransaction();
        if (timeout > 0)
        {
            tx.setTimeout(timeout);
        }
        return tx;
    }

    public synchronized Log getLog()
    {
        if (log == null)
        {
            log = Log.getLog("Q2", "DB"); // Q2 standard Logger
        }
        return log;
    }

    public synchronized void setLog(Log log)
    {
        this.log = log;
    }

    @SuppressWarnings({"unchecked"})
    public void printStats()
    {
        if (getLog() != null)
        {
            LogEvent info = getLog().createInfo();

            if (session != null)
            {
                info.addMessage("====  STATISTICS ====");
                SessionStatistics statistics = session().getStatistics();
                info.addMessage("====   ENTITIES  ====");
                Set<EntityKey> entityKeys = statistics.getEntityKeys();
                for (EntityKey ek : entityKeys)
                {
                    info.addMessage(String.format("[%s] %s", ek.getIdentifier(), ek.getEntityName()));
                }
                info.addMessage("==== COLLECTIONS ====");
                Set<CollectionKey> collectionKeys = statistics.getCollectionKeys();
                for (CollectionKey ck : collectionKeys)
                {
                    info.addMessage(String.format("[%s] %s", ck.getKey(), ck.getRole()));
                }
                info.addMessage("=====================");
            }
            else
            {
                info.addMessage("Session is not open");
            }
            Logger.log(info);
        }
    }
}
