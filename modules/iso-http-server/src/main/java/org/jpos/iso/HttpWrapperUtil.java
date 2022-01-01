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

package org.jpos.iso;

import java.io.IOException;

import org.jpos.http.FilterISOMsg;

public class HttpWrapperUtil {

    public static boolean hasMoreData(BaseChannel c) throws IOException {
        return c.serverIn.available() > 0;
    }

    public static void configureFilter(FilterISOMsg filter, ISOServer server) {
        ISOChannel c = server.clientSideChannel != null ? server.clientSideChannel : server.getISOChannel(":last");
        c = (c != null ? (ISOChannel) c.clone() : null);
        filter.configure((BaseChannel) c, server.listeners);
        if (filter.getPackager() == null) {
            filter.setPackager(server.clientPackager);
        }
        filter.setPort(server.getPort());
    }

}
