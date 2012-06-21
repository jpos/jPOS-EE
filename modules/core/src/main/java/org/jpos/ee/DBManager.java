package org.jpos.ee;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.jpos.core.ConfigurationException;
import org.jpos.ee.support.JPosHibernateConfiguration;

import java.io.IOException;

public class DBManager
{
    protected static SessionFactory sf;
    protected static ServiceRegistry serviceRegistry;
    protected static Configuration cfg;

    static
    {
        try
        {
            init();
        }
        catch (Exception e)
        {
            // now we're in deep trouble
            e.printStackTrace();
        }
    }

    public SessionFactory getSessionFactory()
    {
        return sf;
    }

    private static void init() throws HibernateException, IOException, ConfigurationException
    {
        synchronized (DBManager.class)
        {
            if (cfg != null)
            {
                return;
            }

            cfg = new JPosHibernateConfiguration().configure();
            serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
            sf = cfg.buildSessionFactory(serviceRegistry);
        }
    }

    public void createSchema(String outputFile, boolean create) throws HibernateException
    {
        SchemaExport export = new SchemaExport(cfg);
        if (outputFile != null)
        {
            export.setOutputFile(outputFile);
            export.setDelimiter(";");
        }
        export.create(true, create);
    }
}
