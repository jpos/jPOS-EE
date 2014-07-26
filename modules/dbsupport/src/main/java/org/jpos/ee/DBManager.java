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

import org.jpos.ee.support.JPosHibernateConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class DBManager
{
    final static Map<String,HibernateAccessService> serviceMap=new HashMap<String, HibernateAccessService>();

    /**
     * Convenience method to register a read-only datasource suitable for data lookups.
     * It uses a normal hibernate.cfg.xml where jPOS-EE will not do any processing, there
     * it's up to the developer to define mappings, specify jdbc driver, class, etc.
     *
     * @param name The alias name
     * @param fileName The name of a file containing hibernate session factory configuration
     * @throws IOException
     */
    public static void registerLookupDB(String name,String fileName) throws IOException
    {
        registerDB(name,new DefaultHibernateAccessService(new File(fileName),null,null,true));
    }

    /**
     * Convenience method to register a read-only copy of the default database.
     * This replica will usually point to another database on another server.
     *
     * @param name The alias name
     * @param propertiesFilename  The name of a file containing connection information.
     * @throws IOException
     */
    public static void registerReplica(String name,String propertiesFilename) throws IOException
    {
        final Map<String,String> props=new HashMap<String, String>();
        props.put(JPosHibernateConfiguration.DB_PROPERTY_FILE,propertiesFilename);

        final JPosHibernateConfiguration config = new JPosHibernateConfiguration();
        registerDB(name,new DefaultHibernateAccessService(null, config,props,true));
    }

    private static void registerDB(String name, HibernateAccessService accessService)
    {
        serviceMap.put(name,accessService);
    }

    /**
     * Retrieves DB keyed by name
     * @param name
     * @return
     */
    public static DB getDB(String name)
    {
        HibernateAccessService service=serviceMap.get(name);
        if(service==null)
        {
            throw new IllegalArgumentException("Tried to lookup non-existent jPOS-EE DB with name: "+name);
        }
        return buildDB(service);
    }

    private static DB buildDB(final HibernateAccessService accessService)
    {
        return new DB()
        {
            @Override
            protected HibernateAccessService getHibernateAccessService()
            {
                return accessService;
            }
        };
    }
}
