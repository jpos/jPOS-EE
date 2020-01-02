/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2020 jPOS Software SRL
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

import java.io.FileInputStream;
import java.util.StringTokenizer;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.xml.XmlConfiguration;
import org.jpos.q2.QBeanSupport;

public class Jetty extends QBeanSupport implements JettyMBean {
    private String config;
    private Server server;

    @Override
    public void initService() throws Exception {
        server = new Server();
        StringTokenizer st = new StringTokenizer(config, ", ");
        while (st.hasMoreElements()) {
            FileInputStream fis = new FileInputStream(st.nextToken());
            XmlConfiguration xml = new XmlConfiguration(fis);
            xml.configure(server);
        }
    }

    @Override
    public void startService() throws Exception {
        server.start();
    }

    @Override
    public void stopService() throws Exception {
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
