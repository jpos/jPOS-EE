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

package org.jpos.http.service;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.jpos.core.ConfigurationException;
import org.jpos.util.NameRegistrar.NotFoundException;

import org.jpos.http.ClientRequestDetails;
import org.jpos.http.FilterISOMsg;
import org.jpos.http.FilterISOMsgRegistry;
import org.jpos.http.ISOResponse;


/**
 * <code>HttpTransactionServlet</code> is used as a servlet 
 * in order to provide hooks for ISO traffic over HTTP using 
 * a servlet container like Jetty.
 * Used in conjunction with module iso-http-servlet
 * on the server side.
 *
 * @version $Revision$ $Date$
 * @author  Ozzy Espaillat
 *
 */
@SuppressWarnings("serial")
public class HttpTransactionServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(HttpTransactionServlet.class);
    private static final int MIN_TIMEOUT = 20*1000;
    static final FilterISOMsgRegistry registry = FilterISOMsgRegistry.instance;

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            String initChannels = config.getInitParameter("channels");
            if (initChannels == null || initChannels.length() == 0) {
                registry.add("*", false);
            } else {
                for (String channel: initChannels.split("[,; ]")) {
                    registry.add(channel, false);
                }
            }
        } catch (ConfigurationException | NotFoundException e) {
            logger.warn("Failed to configure channels:", e);
            throw new ServletException(e);
        }
    }

    protected String getChannel(HttpServletRequest req) {
        String path = req.getPathInfo();
        if (path.endsWith("/")) {
            path = path.substring(0, path.length()-1);
        }
        return path.substring(path.lastIndexOf('/')+1);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {
        if (!MediaType.APPLICATION_OCTET_STREAM.equals(request.getContentType())) {
            res.sendError(HttpServletResponse.SC_BAD_REQUEST, "Content type must be " + MediaType.APPLICATION_OCTET_STREAM);
            return;
        }

        String src = getChannel(request);
        FilterISOMsg filter = registry.get(src);
        
        if (filter == null) {
            res.sendError(HttpServletResponse.SC_NOT_FOUND, "Port was not found on this server. Valid sources are: " + registry.getRegisteredPorts());
        } else {
            long startTime = System.currentTimeMillis();
            logger.debug("Received request on {} with filter {}", src, filter.getName());
            ClientRequestDetails clientDetails = new ClientRequestDetails(request.getRemoteAddr(), 
                    request.getServerPort(), 
                    request.getContentLength(), 
                    Math.max(filter.getTimeout(), MIN_TIMEOUT));

            ISOResponse isoRes = filter.process(request.getInputStream(), clientDetails);
            byte data[] = isoRes.getResponse();

            if (logger.isDebugEnabled()) {
                logger.debug("Received: {} messages and responded with {} messges with request {} and response {} bytes in {}ms, timeout is {}",
                        isoRes.request.size(), isoRes.response.size(), request.getContentLength(), 
                        (System.currentTimeMillis()-startTime), (data == null?0:data.length),
                        clientDetails.getTimeout());
            }
            if (data != null) {
                res.setStatus(HttpServletResponse.SC_OK);

                res.setContentLength(data.length);
                res.setContentType(MediaType.APPLICATION_OCTET_STREAM);

                OutputStream out = res.getOutputStream();
                out.write(data);
                out.close();
            } else {
                res.sendError(HttpServletResponse.SC_REQUEST_TIMEOUT, "Response took longer than " + filter.getTimeout() + "ms timeout.");
            }
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {
        String src = getChannel(request);
        FilterISOMsg filter = registry.get(src);
        
        if (filter == null) {
            res.sendError(HttpServletResponse.SC_NOT_FOUND, "Port was not found on this server. Valid sources are: " + registry.getRegisteredNames() + " and ports: " + registry.getRegisteredPorts());
        } else if (filter.getPackager() == null) {
            logger.debug("Packager is not yet available. " + filter.getPackager());
            try {
                filter.initialize();
            } catch (Exception e) {
                logger.debug("Failed configuring channel " + filter.getName(), e);
            }
            logger.debug("After initialized: " + filter.getPackager());
            res.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, filter.getName() + " is not available because packager is: " + filter.getPackager());
        } else {
            res.setStatus(HttpServletResponse.SC_OK);
            byte msg[] = (filter.getName() + " is ready to accept transactions.").getBytes();
            res.setContentLength(msg.length);
            OutputStream out = res.getOutputStream();
            out.write(msg);
            out.close();
        }
    }
}
