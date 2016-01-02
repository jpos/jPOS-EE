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

package org.jpos.ee;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.CollectionKey;
import org.hibernate.engine.spi.EntityKey;
import org.hibernate.internal.util.ReflectHelper;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.hibernate.stat.SessionStatistics;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.jpos.core.ConfigurationException;
import org.jpos.ee.support.ModuleUtils;
import org.jpos.util.Log;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * @author Alejandro P. Revilla
 * @version $Revision: 1.5 $ $Date: 2004/12/09 00:50:14 $
 *          <p>
 *          DB encapsulate some housekeeping specific
 *          to Hibernate O/R mapping engine
 */
@SuppressWarnings({"UnusedDeclaration"})
public class DB implements Closeable
{
    Session session;
    Log log;

    private static volatile SessionFactory sessionFactory = null;
    private static String propFile;

    /**
     * Creates DB Object using default Hibernate instance
     */
    public DB()
    {
        super();
    }

    /**
     * Creates DB Object using default Hibernate instance
     *
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
        if (sessionFactory == null)
        {
            synchronized (DB.class)
            {
                if (sessionFactory == null)
                {
                    try
                    {
                        sessionFactory = newSessionFactory();
                    }
                    catch (IOException | ConfigurationException | DocumentException e)
                    {
                        throw new RuntimeException("Could not configure session factory", e);
                    }
                }
            }
        }
        return sessionFactory;
    }

    public static synchronized void invalidateSessionFactory()
    {
        sessionFactory = null;
    }

    private SessionFactory newSessionFactory() throws IOException, ConfigurationException, DocumentException {
        String hibCfg = System.getProperty("HIBERNATE_CFG");
        if (hibCfg != null) {
            Configuration configuration = new Configuration().configure(hibCfg);
            configureProperties(configuration);
            configureMappings(configuration);
            return configuration.buildSessionFactory();
        }
        return getMetadata().buildSessionFactory();
    }

    private void configureProperties(Configuration cfg) throws IOException
    {
        String propFile = System.getProperty("DB_PROPERTIES", "cfg/db.properties");
        Properties dbProps = loadProperties(propFile);
        if (dbProps != null)
        {
            cfg.addProperties(dbProps);
        }
    }

    private void configureMappings(Configuration cfg) throws ConfigurationException, IOException {
        try {
            List<String> moduleConfigs = ModuleUtils.getModuleEntries("META-INF/org/jpos/ee/modules/");
            for (String moduleConfig : moduleConfigs) {
                addMappings(cfg, moduleConfig);
            }
        } catch (DocumentException e) {
            throw new ConfigurationException("Could not parse mappings document", e);
        }
    }

    private void addMappings(Configuration cfg, String moduleConfig) throws ConfigurationException, DocumentException
    {
        Element module = readMappingElements(moduleConfig);
        if (module != null)
        {
            for (Iterator l = module.elementIterator("mapping"); l.hasNext(); )
            {
                Element mapping = (Element) l.next();
                parseMapping(cfg, mapping, moduleConfig);
            }
        }
    }

    private void parseMapping(Configuration cfg, Element mapping, String moduleName) throws ConfigurationException
    {
        final String resource = mapping.attributeValue("resource");
        final String clazz = mapping.attributeValue("class");

        if (resource != null)
        {
            cfg.addResource(resource);
        }
        else if (clazz != null)
        {
            try
            {
                cfg.addAnnotatedClass(ReflectHelper.classForName(clazz));
            }
            catch (ClassNotFoundException e)
            {
                throw new ConfigurationException("Class " + clazz + " specified in mapping for module " + moduleName + " cannot be found");
            }
        }
        else
        {
            throw new ConfigurationException("<mapping> element in configuration specifies no known attributes at module " + moduleName);
        }
    }

    private Element readMappingElements(String moduleConfig) throws DocumentException
    {
        SAXReader reader = new SAXReader();

        final URL url = getClass().getClassLoader().getResource(moduleConfig);
        assert url != null;
        final Document doc = reader.read(url);
        return doc.getRootElement().element("mappings");
    }

    private Properties loadProperties(String filename) throws IOException
    {
        Properties props = new Properties();
        final String s = filename.replaceAll("/", "\\" + File.separator);
        final File f = new File(s);
        if (f.exists())
        {
            props.load(new FileReader(f));
        }
        return props;
    }

    /**
     * Creates database schema
     *
     * @param outputFile optional output file (may be null)
     * @param create     true to actually issue the create statements
     */
    public void createSchema(String outputFile, boolean create) throws HibernateException, DocumentException {
        try
        {
            SchemaExport export = new SchemaExport(getMetadata());
            if (outputFile != null)
            {
                export.setOutputFile(outputFile);
                export.setDelimiter(";");
            }
            export.create(true, create);
        }
        catch (IOException | ConfigurationException e)
        {
            throw new HibernateException("Could not create schema", e);
        }
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
            if (tx != null && tx.getStatus().isOneOf(TransactionStatus.ACTIVE))
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
            if (tx != null && tx.getStatus().canRollback())
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

    public static Object exec(DBAction action)
    {
        try (DB db = new DB())
        {
            db.open();
            return action.exec(db);
        }
    }

    public static Object execWithTransaction(DBAction action)
    {
        try (DB db = new DB())
        {
            db.open();
            db.beginTransaction();
            Object obj = action.exec(db);
            db.commit();
            return obj;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T unwrap (T proxy) {
        Hibernate.getClass(proxy);
        Hibernate.initialize(proxy);
        return (proxy instanceof HibernateProxy) ?
          (T) ((HibernateProxy) proxy).getHibernateLazyInitializer().getImplementation() : proxy;
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

    private MetadataImplementor getMetadata() throws IOException, ConfigurationException, DocumentException {
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
        String propFile = System.getProperty("DB_PROPERTIES", "cfg/db.properties");
        Properties dbProps = loadProperties(propFile);
        if (dbProps != null) {
            for (Map.Entry entry : dbProps.entrySet()) {
                ssrb.applySetting((String) entry.getKey(), entry.getValue());
            }
        }
        MetadataSources mds = new MetadataSources(ssrb.build());
        List<String> moduleConfigs = ModuleUtils.getModuleEntries("META-INF/org/jpos/ee/modules/");
        for (String moduleConfig : moduleConfigs) {
            addMappings(mds, moduleConfig);
        }
        return (MetadataImplementor) mds.buildMetadata();
    }

    private void addMappings(MetadataSources mds, String moduleConfig) throws ConfigurationException, DocumentException
    {
        Element module = readMappingElements(moduleConfig);
        if (module != null)
        {
            for (Iterator l = module.elementIterator("mapping"); l.hasNext(); )
            {
                Element mapping = (Element) l.next();
                parseMapping(mds, mapping, moduleConfig);
            }
        }
    }

    private void parseMapping (MetadataSources mds, Element mapping, String moduleName) throws ConfigurationException
    {
        final String resource = mapping.attributeValue("resource");
        final String clazz = mapping.attributeValue("class");
        if (resource != null)
            mds.addResource(resource);
        else if (clazz != null)
            mds.addAnnotatedClassName(clazz);
        else
            throw new ConfigurationException("<mapping> element in configuration specifies no known attributes at module " + moduleName);
    }
}
