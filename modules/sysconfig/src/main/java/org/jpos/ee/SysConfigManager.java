/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2011 Alejandro P. Revilla
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

package org.jpos.ee;

import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;

public class SysConfigManager {
    DB db;
    String prefix = "";

    public SysConfigManager() {
        super();
        db = new DB();
    }
    public SysConfigManager (DB db) {
        super();
        this.db = db;
    }
    public void setPrefix (String prefix) {
        this.prefix = prefix;
    }
    public String getPrefix() {
        return prefix;
    }
    public boolean hasProperty (String name) {
    	try {
            if (prefix != null)
                name = prefix + name;
            SysConfig cfg = (SysConfig) 
                db.session().get (SysConfig.class, name);
            return cfg != null;
        } catch (ObjectNotFoundException e) {
            // okay to happen
        } catch (HibernateException e) {
            db.getLog().warn (e);
        }
        return false;
    }
    public String get (String name, String defaultValue) {
        try {
            if (prefix != null)
                name = prefix + name;
            SysConfig cfg = (SysConfig) db.session().load (SysConfig.class, name);
            return cfg.getValue();
        } catch (ObjectNotFoundException e) {
            // okay to happen
        } catch (HibernateException e) {
            db.getLog().warn (e);
        }
        return defaultValue;
    }
    public String[] getAll  (String name) {
        String[] values;
        try {
            if (prefix != null)
                name = prefix + name;
            Query query = db.session().createQuery (
                "from sysconfig in class org.jpos.ee.SysConfig where id like :name order by id"
            );
            query.setParameter ("name", name);
            List l = query.list();
            values = new String[l.size()];
            Iterator iter = l.iterator();
            for (int i=0; iter.hasNext(); i++) {
                values[i] = (String) iter.next();
            }
        } catch (HibernateException e) {
            db.getLog().warn (e);
            values = new String[0];
        }
        return values;
    }
    @SuppressWarnings("unchecked")
    public Iterator<SysConfig> iterator() {
        Query query;
        if (prefix != null) {
            query = db.session().createQuery (
                "from sysconfig in class org.jpos.ee.SysConfig where id like :name order by id"
            );
            query.setParameter ("name", prefix + "%");
        } else {
            query = db.session().createQuery (
                "from sysconfig in class org.jpos.ee.SysConfig order by id"
            );
        }
        return (Iterator<SysConfig>) query.list().iterator();        
    }
    public void put (String name, String value) {
        put (name, value, null, null);
    }
    public void put (String name, String value, String readPerm, String writePerm) {
        SysConfig cfg;
        if (prefix != null)
            name = prefix + name;
        try {
            Transaction tx = db.beginTransaction();
            cfg = (SysConfig) db.session().get (SysConfig.class, name);
            boolean saveIt = false;
            if (cfg == null) {
                cfg = new SysConfig ();
                cfg.setId (name);
                saveIt = true;
            }
            cfg.setReadPerm (readPerm);
            cfg.setWritePerm (writePerm);
            cfg.setValue (value);
            if (saveIt)
                db.session().save (cfg);
            tx.commit();
        } catch (HibernateException e) {
            db.getLog().warn (e);
        }
    }
    public String get (String name) {
        return get (name, "");
    }
    public int getInt (String name) {
        return Integer.parseInt(get (name, "0").trim());
    }
    public int getInt (String name, int defaultValue) {
        String value = get (name, null);
        return value != null ? Integer.parseInt(value.trim()) : defaultValue;
    }
    public long getLong (String name) {
        return Long.parseLong(get (name, "0").trim());
    }
    public long getLong (String name, long defaultValue) {
        String value = get (name, null);
        return value != null ? Long.parseLong(value.trim()) : defaultValue;
    }
    public double getDouble (String name) {
        return Double.parseDouble(get (name, "0.00").trim());
    }
    public double getDouble (String name, double defaultValue) {
        String value = get (name, null);
        return value != null ? Double.parseDouble(value.trim()) : defaultValue;
    }
    public boolean getBoolean (String name) {
        String v = get (name, "false").trim();
        return v.equalsIgnoreCase("true") || v.equalsIgnoreCase("yes");
    }
    public boolean getBoolean (String name, boolean def) {
        String v = get (name);
        return v.length() == 0 ? def :
            (v.equalsIgnoreCase("true") || v.equalsIgnoreCase("yes"));
    }
}

