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

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Iterator;
import java.util.ArrayList;
import org.jpos.ee.DB;
import org.jpos.q2.QFactory;
import org.jpos.q2.QBeanSupport;
import org.jpos.core.XmlConfigurable;
import org.jpos.core.ConfigurationException;
import org.jpos.core.Environment;
import org.jdom2.Element;
import org.hibernate.HibernateException;

public class Monitor extends QBeanSupport implements XmlConfigurable {
    DB db;
    StatusManager mgr;
    long interval;
    String statusId;
    Element config;
    Timer timer;

    public void initService () {
        db = new DB();
        mgr = new StatusManager (db);
        timer = new Timer (true);
        Iterator iter = config.getChildren ("monitor").iterator();
        List handlers = new ArrayList();
        while (iter.hasNext()) {
            Element e = (Element) iter.next();
            try {
                registerTask (e);
            } catch (ConfigurationException ex) {
                getLog().error (ex);
            }
        }
    }
    public void destroyService() {
        getLog().info ("Cancelling timer");
        timer.cancel();
    }
    private void close() {
        try {
            db.close();
        } catch (HibernateException e) {
            getLog().error (e);
        }
    }
    public void setConfiguration (Element config) {
        this.config = config;
    }
    private void registerTask (Element e) 
        throws ConfigurationException
    {
        QFactory qf = getServer().getFactory();
        Object obj  = qf.newInstance (e.getChildTextTrim ("class"));
        if (!(obj instanceof MonitorTask)) {
            throw new ConfigurationException (
                obj.toString() + " is not an instance of MonitorTask"
            );
        }
        qf.setLogger (obj, e);
        qf.setConfiguration (obj, e);
        timer.schedule (
            new MonitorTimerTask (
                Environment.get(e.getAttributeValue("id")),
                (MonitorTask) obj), 
                getLong (Environment.get(e.getAttributeValue ("delay"))),
                getLong (Environment.get(e.getAttributeValue ("period")))
        );
    }
    private long getLong (String l) 
        throws ConfigurationException
    {
        try {
            return Long.parseLong (l);
        } catch (Exception e) {
            throw new ConfigurationException (e);
        }
    }
    private synchronized void touch (String id, String detail) {
        int sp = detail.indexOf (" ");
        String state = Status.OFF;
        if (sp > 0 && detail.length() > sp) {
            state = detail.substring (0, sp);
            detail = detail.substring (++sp);
        }
        try {
            db.open ();
            mgr.touch (id, state, detail);
        } catch (Throwable t) {
            getLog().error (t);
        } finally {
            close();
        }
    }
    private synchronized String getNextCommand (String id) {
        try {
            db.open ();
            return mgr.getNextCommand (id);
        } catch (Throwable t) {
            getLog().error (t);
        } finally {
            close();
        }
        return null;
    }
    private synchronized void setResponse (String id, String response) {
        try {
            db.open ();
            mgr.setResponse (id, response);
        } catch (Throwable t) {
            getLog().error (t);
        } finally {
            close();
        }
    }
    public class MonitorTimerTask extends TimerTask {
        String id;
        MonitorTask task;
        public MonitorTimerTask (String id, MonitorTask task) {
            super();
            this.id = id;
            this.task = task;
        }
        public void run() {
            if (task instanceof TwoWayMonitorTask) {
                String command = getNextCommand (id);
                if (command != null) 
                    setResponse (id, 
                            ((TwoWayMonitorTask)task).command (command));
            }
            touch (id, task.checkService());
        }
    }
}

