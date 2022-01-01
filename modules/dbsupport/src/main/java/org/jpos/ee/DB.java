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

package org.jpos.ee;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.spi.CollectionKey;
import org.hibernate.engine.spi.EntityKey;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.internal.util.ReflectHelper;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.hibernate.stat.SessionStatistics;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.jpos.core.ConfigurationException;
import org.jpos.core.Environment;
import org.jpos.ee.support.ModuleUtils;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.util.Log;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author Alejandro P. Revilla
 * @version $Revision: 1.5 $ $Date: 2004/12/09 00:50:14 $
 *          <p>
 *          DB encapsulate some housekeeping specific
 *          to Hibernate O/R mapping engine
 */
@SuppressWarnings({"UnusedDeclaration"})
public class DB implements Closeable {
    Session session;
    Log log;
    String configModifier;
    private Dialect dialect;

    private static Map<String,Semaphore> sfSems = Collections.synchronizedMap(new HashMap<>());
    private static Map<String,Semaphore> mdSems = Collections.synchronizedMap(new HashMap<>());
    private static Semaphore newSessionSem = new Semaphore(1);

    private static String propFile;
    private static final String MODULES_CONFIG_PATH = "META-INF/org/jpos/ee/modules/";
    private static Map<String,SessionFactory> sessionFactories = Collections.synchronizedMap(new HashMap<>());
    private static Map<String,Metadata> metadatas = Collections.synchronizedMap(new HashMap<>());
    private static Map<String,Properties> properties = Collections.synchronizedMap(new HashMap<>());

    /**
     * Creates DB Object using default Hibernate instance
     */
    public DB() {
        this((String) null);
    }

    /**
     * Creates DB Object using a config <i>modifier</i>.
     *
     * The <i>configModifier</i> can take a number of different forms used to locate the <code>cfg/db.properties</code> file.
     *
     * <ul>
     *
     *  <li>a filename prefix, i.e.: "mysql" used as modifier would pick the configuration from
     *      <code>cfg/mysql-db.properties</code> instead of the default <code>cfg/db.properties</code> </li>
     *
     *  <li>if a colon and a second modifier is present (e.g.: "mysql:v1"), the metadata is picked from
     *      <code>META-INF/org/jpos/ee/modules/v1-*</code> instead of just
     *      <code>META-INF/org/jpos/ee/modules/</code> </li>
     *
     *  <li>finally, if the modifier ends with <code>.cfg.xml</code> (case insensitive), then all configuration
     *      is picked from that config file.</li>
     * </ul>
     *
     * @param configModifier modifier
     */
    public DB (String configModifier) {
        super();
        this.configModifier = configModifier;
        sfSems.putIfAbsent(configModifier, new Semaphore(1));
        mdSems.putIfAbsent(configModifier, new Semaphore(1));
        getSessionFactory();
    }

    /**
     * Creates DB Object using default Hibernate instance
     *
     * @param log Log object
     */
    public DB(Log log) {
        this();
        setLog(log);
    }

    /**
     * Creates DB Object using default Hibernate instance
     *
     * @param log Log object
     * @param configModifier modifier
     */
    public DB(Log log, String configModifier) {
        this(configModifier);
        setLog(log);
    }

    /**
     * @return Hibernate's session factory
     */
    public SessionFactory getSessionFactory() {
        Semaphore sfSem = sfSems.get(configModifier);
        SessionFactory sf;
        String cm  = configModifier != null ? configModifier : "";
        try {
            if (!sfSem.tryAcquire(60, TimeUnit.SECONDS)) {
                throw new RuntimeException ("Unable to acquire lock");
            }
            sf = sessionFactories.get(cm);
            if (sf == null)
                sessionFactories.put(cm, sf = newSessionFactory());
            if (sf instanceof SessionFactoryImpl) {
                dialect = ((SessionFactoryImpl) sf).getJdbcServices().getDialect();
            }
        } catch (IOException | ConfigurationException | DocumentException | InterruptedException e) {
            throw new RuntimeException("Could not configure session factory", e);
        } finally {
            sfSem.release();
        }
        return sf;
    }

    public Properties getProperties() {
        String cm  = configModifier != null ? configModifier : "";
        return properties.get(cm);
    }

    public Dialect getDialect() {
        return dialect;
    }

    public static synchronized void invalidateSessionFactories() {
        for (SessionFactory sf : sessionFactories.values()) {
            try {
                sf.close();
            } catch (Exception ignored) {}
        }
        sessionFactories.clear();
    }

    private SessionFactory newSessionFactory() throws IOException, ConfigurationException, DocumentException, InterruptedException {
        Metadata md = getMetadata();
        try {
            newSessionSem.acquireUninterruptibly();
            return md.buildSessionFactory();
        } finally {
            newSessionSem.release();
        }
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
        try {
            // SchemaExport export = new SchemaExport(getMetadata());
            SchemaExport export = new SchemaExport();
            List<TargetType> targetTypes=new ArrayList<>();
            if (outputFile != null) {
                export.setDelimiter(";");
                if(outputFile.trim().equals("-")) {
                    targetTypes.add(TargetType.STDOUT);
                }
                else {
                    export.setOutputFile(outputFile);
                    targetTypes.add(TargetType.SCRIPT);
                }
            }
            if (create) {
                if (isCreateEnabled())
                    targetTypes.add(TargetType.DATABASE);
                else
                    throw new IllegalStateException ("createSchema not enabled");
            }
            if(targetTypes.size()>0) {
                // First, drop everything, disregarding errors
                export.setHaltOnError(false);
                export.drop(EnumSet.copyOf(targetTypes), getMetadata());
                // Now attempt schema creation, but halting on error
                export.setHaltOnError(true);
                export.createOnly(EnumSet.copyOf(targetTypes), getMetadata());
            }
        }
        catch (IOException | ConfigurationException | InterruptedException e)
        {
            throw new HibernateException("Could not create schema", e);
        }
    }

    private boolean isCreateEnabled() {
        return "YES".equals(System.getProperty("db.create.enabled"));
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
        Transaction tx = session.getTransaction();
        if (timeout > 0)
            tx.setTimeout(timeout);
        tx.begin();
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

    public static <T> T exec(DBAction<T> action) throws Exception {
        try (DB db = new DB()) {
            db.open();
            return action.exec(db);
        }
    }

    public static <T> T exec(String configModifier, DBAction<T> action) throws Exception {
        try (DB db = new DB(configModifier)) {
            db.open();
            return action.exec(db);
        }
    }

    public static <T> T execWithTransaction(DBAction<T> action) throws Exception {
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            T obj = action.exec(db);
            db.commit();
            return obj;
        }
    }

    public static <T> T execWithTransaction(String configModifier, DBAction<T> action) throws Exception {
        try (DB db = new DB(configModifier)) {
            db.open();
            db.beginTransaction();
            T obj = action.exec(db);
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


    @Override
    public String toString() {
        return "DB{" + (configModifier != null ? configModifier : "") + '}';
    }

    private Metadata getMetadata() throws IOException, ConfigurationException, DocumentException, InterruptedException {
        Semaphore mdSem = mdSems.get(configModifier);
        if (!mdSem.tryAcquire(60, TimeUnit.SECONDS))
            throw new RuntimeException ("Unable to acquire lock");

        String cm  = configModifier != null ? configModifier : "";
        Metadata md = metadatas.get(cm);
        try {
            if (md == null) {
                StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
                String propFile;
                String dbPropertiesPrefix = "";
                String metadataPrefix = "";
                boolean standardHibernateConfig = cm.endsWith(".cfg.xml");

                String hibCfg = null;
                if (standardHibernateConfig) {
                    hibCfg = cm;
                } else if (configModifier != null) {
                    String[] ss = configModifier.split(":");
                    if (ss.length > 0)
                        dbPropertiesPrefix = ss[0] + ":";
                    if (ss.length > 1)
                        metadataPrefix = ss[1] + ":";
                    hibCfg = System.getProperty("HIBERNATE_CFG","/" + dbPropertiesPrefix + "hibernate.cfg.xml");
                    if (getClass().getClassLoader().getResource(hibCfg) == null)
                        hibCfg = null;

                }
                if (hibCfg == null)
                    hibCfg = System.getProperty("HIBERNATE_CFG","/hibernate.cfg.xml");

                ssrb.configure(hibCfg);
                Properties dbProps = null;
                if (!standardHibernateConfig) {
                    propFile = System.getProperty(dbPropertiesPrefix + "DB_PROPERTIES", "cfg/" + dbPropertiesPrefix + "db.properties");
                    dbProps = loadProperties(propFile);
                    for (Map.Entry entry : dbProps.entrySet()) {
                        String k = (String) entry.getKey();
                        String v = Environment.get((String) entry.getValue());
                        ssrb.applySetting(k,v);
                        dbProps.setProperty(k,v);
                    }

                    // if DBInstantiator has put db user name and/or password in Space, set Hibernate config accordingly
                    Space sp = SpaceFactory.getSpace("tspace:dbconfig");
                    String user = (String) sp.inp(dbPropertiesPrefix +"connection.username");
                    String pass = (String) sp.inp(dbPropertiesPrefix +"connection.password");
                    if (user != null)
                        ssrb.applySetting("hibernate.connection.username", user);
                    if (pass != null)
                        ssrb.applySetting("hibernate.connection.password", pass);
                }
                MetadataSources mds = new MetadataSources(ssrb.build());

                List<String> moduleConfigs = ModuleUtils.getModuleEntries(MODULES_CONFIG_PATH);
                for (String moduleConfig : moduleConfigs) {
                    if (metadataPrefix.length() == 0 || moduleConfig.substring(MODULES_CONFIG_PATH.length()).startsWith(metadataPrefix)) {
                        if ( (!metadataPrefix.contains(":") && moduleConfig.contains(":")) ||
                          (!moduleConfig.contains(":") && metadataPrefix.contains(":")))
                            continue;
                        addMappings(mds, moduleConfig);
                    }
                }
                md = mds.buildMetadata();
                metadatas.put(cm, md);
                if (dbProps != null)
                    properties.put(cm, dbProps);
            }
        } finally {
            mdSem.release();
        }
        return md;
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
