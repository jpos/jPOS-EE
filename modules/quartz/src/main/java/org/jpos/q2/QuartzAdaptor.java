/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

import org.jdom.Element;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.util.LogEvent;
import org.jpos.util.LogSource;
import org.jpos.util.Logger;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused unchecked")
public class QuartzAdaptor extends QBeanSupport implements XmlConfigurable {
    Scheduler scheduler;
    Element config;
    protected void initService() throws Exception {
        scheduler = StdSchedulerFactory.getDefaultScheduler();
        QFactory factory = getFactory();
        LogEvent evt = getLog().createInfo();
        for (Element e : (List<Element>) config.getChildren("job")) {
            String jobId = e.getAttributeValue("id");
            if (jobId == null)
                jobId = UUID.randomUUID().toString();
            Object obj = factory.newInstance(e.getAttributeValue("class"));
            if (!(obj instanceof Job)) {
                evt.addMessage(String.format("%s: Class %s does not implement Job interface - ignored", jobId, obj.toString()));
                continue;
            }
            Job j = (Job) obj;
            Q2Adaptor adaptor = new Q2Adaptor();
            factory.setLogger(adaptor, e);
            factory.setConfiguration(adaptor, e);
            JobDataMap jobData = new JobDataMap();
            jobData.put("Q2", adaptor);

            JobDetail job = JobBuilder.newJob(j.getClass())
                    .withIdentity(e.getAttributeValue("id"), getName())
                    .usingJobData(jobData)
                    .build();

            CronTrigger trigger;
            try {
                trigger = TriggerBuilder.newTrigger()
                        .withIdentity(e.getAttributeValue("id"), getName())
                        .withSchedule(CronScheduleBuilder.cronSchedule(e.getAttributeValue("when")))
                        .build();

                Date ft = scheduler.scheduleJob(job, trigger);
                evt.addMessage(job.getKey() + " (" + obj.getClass() + ") has been scheduled to run at: " + ft
                        + " and repeat based on expression: "
                        + trigger.getCronExpression());
            } catch (Exception e1) {
                evt.addMessage(String.format("%s: %s --- Exception follows", jobId, e1.getMessage()));
                evt.addMessage(e1);
            }
        }
        Logger.log(evt);
    }
    protected void startService() throws SchedulerException {
        scheduler.start();
    }
    protected void stopService() throws SchedulerException {
        scheduler.shutdown(true);
    }
    protected void destroyService() {
        scheduler = null;
    }
    public void setConfiguration(Element config) throws ConfigurationException {
        this.config = config;
    }
    public class Q2Adaptor implements LogSource, Configurable {
        Configuration cfg;
        Logger logger;
        String realm;

        public Q2Adaptor() {
            super();
        }

        public void setConfiguration(Configuration cfg) throws ConfigurationException {
            this.cfg = cfg;
        }
        public Configuration getConfiguration() {
            return cfg;
        }
        public void setLogger(Logger logger, String realm) {
            this.logger = logger;
            this.realm = realm;
        }

        public String getRealm() {
            return realm;
        }

        public Logger getLogger() {
            return logger;
        }
    }
}
