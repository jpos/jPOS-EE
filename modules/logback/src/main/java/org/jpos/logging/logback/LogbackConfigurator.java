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

package org.jpos.logging.logback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.util.StatusPrinter;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.q2.QBeanSupport;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * Logback Configurator.
 *
 * @author Victor Salaman
 */
public class LogbackConfigurator extends QBeanSupport
{
    private String configResource;

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException
    {
        super.setConfiguration(cfg);
        configResource = cfg.get("config-resource", "classpath:/logback.xml");
    }

    @Override
    protected void startService() throws Exception
    {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        try
        {
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(context);
            context.reset();

            if (configResource.startsWith("file:"))
            {
                final String f = configResource.substring(5);
                log.info("Reading logback configuration from file: "+f);
                configurator.doConfigure(new File(f));
            }
            else if (configResource.startsWith("classpath:"))
            {
                final URL r = getClass().getResource(configResource.substring(10));
                log.info("Reading logback configuration from classpath resource: "+r.toString());
                configurator.doConfigure(r);
            }
            SLF4JBridgeHandler.removeHandlersForRootLogger();
            SLF4JBridgeHandler.install();
        }
        catch (JoranException je)
        {
            log.error("Logger configuration exception", je);
        }

        printStatusIfWarningOrError(context);
    }

    private void printStatusIfWarningOrError(LoggerContext context)
    {
        StatusUtil su = new StatusUtil(context);
        if (su.getHighestLevel(0) >= ErrorStatus.WARN)
        {
            printStatus(context);
        }
    }

    private void printStatus(LoggerContext context)
    {
        StringBuilder sb = new StringBuilder();

        StatusManager sm = context.getStatusManager();
        List<Status> statusList = StatusUtil.filterStatusListByTimeThreshold(sm.getCopyOfStatusList(), 0);
        if (statusList != null)
        {
            for (Status s : statusList)
            {
                StatusPrinter.buildStr(sb, "", s);
            }
        }

        log.error(sb.toString());
    }
}
