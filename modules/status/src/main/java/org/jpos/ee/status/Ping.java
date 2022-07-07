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

package org.jpos.ee.status;

import java.net.ConnectException;
import java.net.Socket;
import java.io.IOException;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.util.Log;

public class Ping extends Log implements MonitorTask, Configurable {
    String host;
    int port = 7;

    // code taken from Alireza's blog
    // http://jroller.com/page/alireza/20050601
    public String checkService () {
        boolean rc = false;
        String detail = "";
        long start = System.currentTimeMillis();
        try (Socket socket = new Socket(host, port)){
            socket.setSoLinger (true, 0);
            rc = true;
        } catch (ConnectException e) {
            rc = true;
        } catch (IOException e) {
            String msg = e.getMessage().toUpperCase();
            rc = false;
            detail = " " + msg;
        }
        long elapsed = System.currentTimeMillis() - start;
        return (rc ? Status.OK : Status.WARN) + detail 
            + " time=" + elapsed + "ms";
    }
    public void setConfiguration (Configuration cfg) 
        throws ConfigurationException
    {
        host = cfg.get ("host", null);
        if (host == null)
            throw new ConfigurationException (
                "host property has not been specified"
            );
        port = cfg.getInt ("port", 7);
    }
}

