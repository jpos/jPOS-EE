/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

package org.jpos.q2.jetty;

import java.nio.file.Path;
import java.util.StringTokenizer;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.util.resource.ResourceFactory;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.xml.XmlConfiguration;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.core.annotation.Config;
import org.jpos.q2.QBeanSupport;
import org.jpos.security.SensitiveString;

public class Jetty extends QBeanSupport implements JettyMBean {
    private String config;
    private Server server;
    private SensitiveString keystorePassword;

    @Config("dump-at-startup") boolean dumpAtStartUp;

    @Override
    public void initService() throws Exception {
        System.setProperty("jetty.base", System.getProperty("user.dir"));
        server = new Server();
        if (dumpAtStartUp)
            server.setDumpAfterStart(true);

        ResourceFactory rf = ResourceFactory.of(server); // ties resource lifecycle to the Server
        StringTokenizer st = new StringTokenizer(config, ", ");
        while (st.hasMoreElements()) {
            String path = st.nextToken();
            Resource res = rf.newResource(Path.of(path));   // or rf.newResource(path) for URL/filename
            XmlConfiguration xml = new XmlConfiguration(res);
            xml.configure(server);
        }

        // If a keystore password is provided, push it into any SSL connection factories.
        if (keystorePassword != null && keystorePassword.get() != null && !keystorePassword.get().trim().isEmpty()) {
            for (Connector connector : server.getConnectors()) {
                if (connector instanceof ServerConnector sc) {
                    sc.getConnectionFactories().stream()
                      .filter(cf -> cf instanceof SslConnectionFactory)
                      .map(cf -> (SslConnectionFactory) cf)
                      .forEach(cf -> {
                          SslContextFactory.Server ssl = cf.getSslContextFactory();
                          if (ssl != null) {
                              ssl.setKeyStorePassword(keystorePassword.get());
                          }
                      });
                }
            }
        }
    }

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        super.setConfiguration(cfg);
        try {
            keystorePassword = new SensitiveString(cfg.get("keystorePassword"));
        } catch (Exception e) {
            throw new ConfigurationException(e);
        }
    }

    @Override
    public void startService() throws Exception {
        server.start();
    }

    @Override
    public void stopService() throws Exception {
        // stop() is fine; destroy() is optional if you want to force bean teardown
        server.stop();
    }

    @Override
    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public String getConfig() {
        return config;
    }
}
