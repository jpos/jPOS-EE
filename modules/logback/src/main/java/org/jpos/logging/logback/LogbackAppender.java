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

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.AppenderBase;
import org.jpos.util.Log;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;

/**
 * Logback Appender.
 *
 * @author Victor Salaman
 */
public class LogbackAppender extends AppenderBase<ILoggingEvent>
{
    Logger logger;

    @Override
    public void start()
    {
        logger = Logger.getLogger(getName());
        super.start();
    }

    @Override
    protected void append(final ILoggingEvent event)
    {
        if (!isStarted())
        {
            return;
        }

        // Build
        final Log source = new Log(logger, getName()+"/"+event.getLoggerName());
        final LogEvent ev = new LogEvent(source,
                                         event.getLevel().levelStr.toLowerCase(),
                                         event.getFormattedMessage());

        // Handle exceptions
        IThrowableProxy tp = event.getThrowableProxy();
        if (tp != null)
        {
            ev.addMessage(ThrowableProxyUtil.asString(tp));
        }

        // Do the actual logging
        Logger.log(ev);
    }
}
