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

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

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

        this.serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
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
