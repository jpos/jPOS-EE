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

package org.jpos.q2.freemarker;

import freemarker.cache.FileTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.jpos.q2.ConfigDecorationProvider;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Properties;

public class FreemarkerDecorationProvider implements ConfigDecorationProvider
{
    private Configuration config;
    private String[] configFiles;
    private File deployDir;
    private final static String DEPLOY_PROPERTIES_TEMPLATE="deploy-properties.ftl";

    public void initialize(File deployDir) throws Exception
    {
        this.deployDir=deployDir;
        InputStream is=null;
        try
        {
            is=getClass().getResourceAsStream("/META-INF/org/jpos/config/Q2-decorator.properties");
            Properties p=new Properties();
            p.load(is);
            String cf=p.getProperty("config-files");
            if(cf!=null)
            {
                configFiles=cf.split(",");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            configFiles=new String[]{};
        }
        finally
        {
            if(is!=null)
            {
                try
                {
                    is.close();
                }
                catch (IOException e)
                {
                }
            }
        }

        config=new Configuration();

        final File cfgDir = new File(deployDir, "../cfg");

        final Q2ConfigFileLoader loader1 = new Q2ConfigFileLoader(deployDir);
        final Q2ConfigFileLoader loader2 = new Q2ConfigFileLoader(cfgDir);
        final MultiTemplateLoader loader=new MultiTemplateLoader(new TemplateLoader[]{loader1,loader2});

        config.setTemplateLoader(loader);
        config.setTemplateUpdateDelay(0);
        config.setTagSyntax(Configuration.SQUARE_BRACKET_TAG_SYNTAX);
        if(new File(cfgDir,DEPLOY_PROPERTIES_TEMPLATE).exists())
        {
            config.addAutoInclude(DEPLOY_PROPERTIES_TEMPLATE);
        }
    }

    public String decorateFile(File f) throws Exception
    {
        final HashMap rootMap = new HashMap();
        initRootMap(rootMap);

        String ddPath=deployDir.getAbsolutePath();
        String filePath=f.getAbsolutePath();
        final int index = filePath.indexOf(ddPath);
        if(index<0)
        {
            throw new Exception("File "+filePath+" is not under deploy directory");
        }
        String nPath=filePath.substring(ddPath.length()+1);
        Template t=config.getTemplate(nPath);
        StringWriter sw=new StringWriter();
        t.process(rootMap,sw);
        return sw.toString();
    }

    private void initRootMap(HashMap rootMap)
    {
        for (String configFile : configFiles)
        {
            initRootMap(rootMap,configFile);
        }
    }

    @SuppressWarnings({"unchecked"})
    private void initRootMap(HashMap rootMap, String configFile)
    {
        File f=new File(configFile);
        if(f.exists())
        {
            FileReader r=null;
            try
            {
                r=new FileReader(f);
                Properties p=new Properties();
                p.load(r);
                rootMap.putAll(p);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                if(r!=null)
                {
                    try
                    {
                        r.close();
                    }
                    catch (IOException e)
                    {
                    }
                }
            }
        }
    }

    public void uninitialize()
    {
        // Do nothing
    }

    public static class Q2ConfigFileLoader extends FileTemplateLoader
    {
        public Q2ConfigFileLoader(File file) throws IOException
        {
            super(file);
        }

        public long getLastModified(Object templateSource)
        {
            return System.currentTimeMillis();
        }
    }
}
