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

package org.jpos.q2;

import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.util.Log;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@SuppressWarnings("unused")
public abstract class QuartzJobSupport implements Job, Configurable, Runnable {
    Configuration cfg;
    JobExecutionContext executionContext;
    Log log;
    QuartzAdaptor.Q2Adaptor adaptor;

    public QuartzJobSupport() {
        super();
    }

    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.cfg = cfg;
    }

    public Configuration getConfiguration() {
        return cfg;
    }

    public void setExecutionContext (JobExecutionContext executionContext) {
        this.executionContext = executionContext;
    }

    public JobExecutionContext getExecutionContext() {
        return executionContext;
    }
    public Log getLog() {
        return log;
    }

    public abstract void run();

    public void execute (JobExecutionContext ctx) throws JobExecutionException {
        setExecutionContext(ctx);

        Object o = ctx.getJobDetail().getJobDataMap().get("Q2");
        try {
            if (o instanceof QuartzAdaptor.Q2Adaptor) {
                adaptor = (QuartzAdaptor.Q2Adaptor) o;
                log = new Log(adaptor.getLogger(), adaptor.getRealm());
                QFactory.autoconfigure(this, adaptor.getConfiguration());
                setConfiguration(adaptor.getConfiguration());
            }
            run();
        } catch (Exception e) {
            getLog().warn(e);
        }
    }
    public boolean running() {
        return adaptor == null || adaptor.running();
    }
}
