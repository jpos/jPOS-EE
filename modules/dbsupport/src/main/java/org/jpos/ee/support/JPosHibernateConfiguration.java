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

package org.jpos.ee.support;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.HibernateException;
import org.hibernate.internal.util.ReflectHelper;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.SettingsFactory;
import org.jpos.core.ConfigurationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class JPosHibernateConfiguration extends Configuration
{
    public static final String DB_PROPERTY_FILE = "jposee.db-property-file";

    @SuppressWarnings("unused")
    public JPosHibernateConfiguration(SettingsFactory settingsFactory)
    {
        super(settingsFactory);
    }

    public JPosHibernateConfiguration()
    {
    }

    @Override
    protected Configuration doConfigure(Document doc) throws HibernateException
    {
        final Configuration cfg = super.doConfigure(doc);
        try
        {
            configureMappings(cfg);
        }
        catch (Exception e)
        {
            throw new HibernateException(e);
        }
        return cfg;
    }

    private void configureMappings(Configuration cfg) throws ConfigurationException, IOException
    {
        try
        {
            //Read DB properties.
            String propFile = cfg.getProperty(DB_PROPERTY_FILE);
            propFile = propFile == null ? "cfg/db.properties" : propFile;
            Properties dbProps = loadProperties(propFile);
            if (dbProps != null)
            {
                cfg.addProperties(dbProps);
            }

            SAXReader reader = new SAXReader();

            List<String> moduleConfigs = ModuleUtils.getModuleEntries("META-INF/org/jpos/ee/modules/");
            for (String moduleConfig : moduleConfigs)
            {
                final URL url = getClass().getClassLoader().getResource(moduleConfig);
                final Document doc = reader.read(url);
                Element mappings = doc.getRootElement().element("mappings");
                if (mappings != null)
                {
                    addMappings(cfg, mappings, moduleConfig);
                }
            }
        }
        catch (DocumentException e)
        {
            throw new ConfigurationException("Could not parse mappings document", e);
        }
    }

    private void addMappings(Configuration cfg, Element module, String moduleName) throws ConfigurationException
    {
        for (Iterator l = module.elementIterator("mapping"); l.hasNext(); )
        {
            Element mapping = (Element) l.next();
            parseMapping(cfg, mapping, moduleName);
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
        { throw new ConfigurationException("<mapping> element in configuration specifies no known attributes at module " + moduleName); }
    }

    private Properties loadProperties(String filename) throws IOException
    {
        Properties props = new Properties();
        final String s = filename.replaceAll("/", "\\" + File.separator);
        final File f = new File(s);
        if(f.exists())
        {
            props.load(new FileReader(f));
        }
        return props;
    }
}
