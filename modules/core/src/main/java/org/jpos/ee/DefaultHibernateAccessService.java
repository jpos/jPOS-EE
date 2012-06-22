package org.jpos.ee;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;

class DefaultHibernateAccessService implements HibernateAccessService
{
    private SessionFactory sessionFactory;
    private ServiceRegistry serviceRegistry;
    private Configuration configuration;
    private boolean readOnly = false;

    DefaultHibernateAccessService(File hibernameConfigFile,
                                  Configuration _configuration,
                                  Map<String, String> overrideProperties,
                                  boolean _readOnly)
    {
        configuration = _configuration==null? new Configuration() : _configuration;
        if(hibernameConfigFile!=null)
        {
            configuration.configure(hibernameConfigFile);
        }
        else
        {
            File f=new File("cfg/hibernate.cfg.xml");
            if(f.exists())
            {
                configuration.configure(f);
            }
            else
            {
                configuration.configure();
            }
        }

        if(overrideProperties!=null)
        {
            for (Entry<String, String> entry : overrideProperties.entrySet())
            {
                configuration.setProperty(entry.getKey(),entry.getValue());
            }
        }

        this.serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        this.sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        this.readOnly = _readOnly;
    }

    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    public ServiceRegistry getServiceRegistry()
    {
        return serviceRegistry;
    }

    public Configuration getConfiguration()
    {
        return configuration;
    }

    public boolean isReadOnly()
    {
        return readOnly;
    }
}
