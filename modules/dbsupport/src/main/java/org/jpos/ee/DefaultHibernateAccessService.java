/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2014 Alejandro P. Revilla
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
import org.hibernate.cfg.Configuration;
import org.jpos.ee.support.ClassloaderUtil;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;

class DefaultHibernateAccessService implements HibernateAccessService
{
    private SessionFactory sessionFactory;
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

        this.sessionFactory = createSessionFactory(configuration);
        this.readOnly = _readOnly;
    }

    @SuppressWarnings("unchecked")
    private SessionFactory createSessionFactory(Configuration configuration)
    {
        try
        {
            Class ssrbCls=null;
            try
            {
                //4.3.x
                ssrbCls= ClassloaderUtil.classForName("org.hibernate.boot.registry.StandardServiceRegistryBuilder");
            }
            catch (ClassNotFoundException e)
            {
                try
                {
                    //4.2.x
                    ssrbCls=ClassloaderUtil.classForName("org.hibernate.boot.registry.ServiceRegistryBuilder");
                }
                catch (ClassNotFoundException e1)
                {
                }
            }
            if(ssrbCls!=null)
            {
                Object ssrb=ssrbCls.newInstance();
                Class srCls=ClassloaderUtil.classForName("org.hibernate.service.ServiceRegistry");
                ssrb=ssrbCls.getMethod("applySettings",Map.class).invoke(ssrb,configuration.getProperties());
                Object ssr=ssrbCls.getMethod("build").invoke(ssrb);
                return (SessionFactory) configuration.getClass()
                        .getMethod("buildSessionFactory", srCls)
                        .invoke(configuration, ssr);
            }
            else
            {
                throw new RuntimeException("Could not create session factory (Unsupported hibernate version)");
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException("Could not create session factory",e);
        }
    }

    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
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
