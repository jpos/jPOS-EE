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

package org.jpos.qi;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vaadin.server.*;
import org.jpos.q2.Q2;
import org.jpos.util.Log;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class QIServlet extends VaadinServlet {
    Log log;

    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException
    {
        try {
            super.service(request, response);
            QI.closeDB();
        } catch (Throwable t) {
            log.trace(t);
        }
    }

    @Override
    protected void servletInitialized() throws ServletException {
        super.servletInitialized();
        log = Log.getLog(Q2.LOGGER_NAME, "QI");
        SLF4JBridgeHandler.install();
        getService().addSessionInitListener((SessionInitListener) event -> event.getSession().addBootstrapListener(new BootstrapListener() {
            @Override
            public void modifyBootstrapFragment(BootstrapFragmentResponse response) {}
            @Override
            public void modifyBootstrapPage(BootstrapPageResponse response) {
                response.getDocument().head().prependElement("meta").attr("name", "viewport").attr("content", "width=device-width");
            }}
        ));
        fixThemeCacheDirectory();
    }
    private void fixThemeCacheDirectory () {
        String root = getServletContext().getRealPath("/");
        if (root != null && Files.isDirectory(Paths.get(root))) {
            try {
                Files.createDirectories(Paths.get(getServletContext().getRealPath("/VAADIN/themes/jpos")));
            } catch (IOException e) {
                log.error (e);
            }
        }
    }
}
