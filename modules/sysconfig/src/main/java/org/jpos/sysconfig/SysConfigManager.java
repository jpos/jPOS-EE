/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

package org.jpos.sysconfig;

import java.util.*;

import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import jakarta.persistence.criteria.*;
import org.jpos.ee.DB;
import org.jpos.ee.DBManager;
@SuppressWarnings("unused")
public class SysConfigManager extends DBManager<SysConfig> {
    private String prefix = "";

    public SysConfigManager (DB db) {
        super(db,SysConfig.class);
    }
    public SysConfigManager (DB db, String prefix) {
        super(db,SysConfig.class);
        this.prefix = prefix;
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
            return db.session().get(SysConfig.class, name) != null;
        } catch (HibernateException e) {
            db.getLog().warn (e);
        }
        return false;
    }

    /**
     * @param name property name
     * @param defaultValue default value
     * @return if property exists, return its value, otherwise defaultValue.
     */
    public String get (String name, String defaultValue) {
        try {
            if (prefix != null)
                name = prefix + name;
            SysConfig cfg = db.session().get (SysConfig.class, name);
            if (cfg != null)
                return cfg.getValue();
        } catch (HibernateException e) {
            db.getLog().warn (e);
        }
        return defaultValue;
    }

    public SysConfig getObject(String name) {
        try {
            if (prefix != null)
                name = prefix + name;
            SysConfig cfg = db.session().get (SysConfig.class, name);
            return cfg;
        } catch (HibernateException e) {
            db.getLog().warn (e);
        }
        return null;
    }

    public boolean delete (String name) {
        try {
            if (prefix != null)
                name = prefix + name;
            SysConfig cfg = db.session().get (SysConfig.class, name);
            if (cfg != null) {
                db.session().remove(cfg);
                return true;
            }
        } catch (HibernateException e) {
            db.getLog().warn (e);
        }
        return false;
    }

    public SysConfig[] getAll  (String queryString) {
        SysConfig[] values;
        try {
            if (prefix != null)
                queryString = prefix + queryString;
            Query<SysConfig> query = db.session().createQuery (
                "from org.jpos.sysconfig.SysConfig sysconfig in class org.jpos.sysconfig.SysConfig where sysconfig.id like :queryString order by sysconfig.id", SysConfig.class
            );
            query.setParameter ("queryString", queryString);
            List<SysConfig> l = query.list();
            values = l.toArray(new SysConfig[0]);
        } catch (HibernateException e) {
            db.getLog().warn (e);
            values = new SysConfig[0];
        }
        return values;
    }
    public List<SysConfig> getAll () {
        HashMap<String,Boolean> orders = new HashMap<>();
        orders.put("id",true);
        return getAll(0,-1,orders);
    }
    public List<SysConfig> getAllByValue () {
        HashMap<String,Boolean> orders = new HashMap<>();
        orders.put("value",true);
        return getAll(0,-1,orders);
    }

    @Override
    protected Predicate[] buildFilters(Root<SysConfig> root) {
        Predicate[] predicates = new Predicate[] {
            db.session().getCriteriaBuilder().like(root.get("id"),prefix + "%")
        };
        return predicates;
    }

    @SuppressWarnings("unchecked")
    public Iterator<SysConfig> iterator() {
        Query<SysConfig> query;
        if (prefix != null) {
            query = db.session().createQuery (
                "from sysconfig in class org.jpos.sysconfig.SysConfig where id like :name order by id", SysConfig.class
            );
            query.setParameter ("name", prefix + "%");
        } else {
            query = db.session().createQuery (
                "from sysconfig in class org.jpos.sysconfig.SysConfig order by id", SysConfig.class
            );
        }
        return query.list().iterator();
    }
    public void put (String name, String value) {
        SysConfig cfg;
        if (prefix != null)
            name = prefix + name;

        try {
            boolean autoCommit = false;
            Transaction tx = db.session().getTransaction();
            if (tx == null || tx.getStatus().isNotOneOf(TransactionStatus.ACTIVE)) {
                tx = db.session().beginTransaction();
                autoCommit = true;
            }
            cfg = db.session().get (SysConfig.class, name);
            boolean saveIt = false;
            if (cfg == null) {
                cfg = new SysConfig ();
                cfg.setId (name);
                saveIt = true;
            }
            cfg.setValue (value);
            if (saveIt)
                db.session().persist (cfg);
            if (autoCommit)
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
    public int getMaxIdLength() {
        String queryString = "select max(length(id)) as maxidlen from sysconfig";
        if (prefix != null)
            queryString += " where id like :query";
        NativeQuery<Integer> query =  db.session().createNativeQuery(queryString, Integer.class);
        if (prefix != null)
            query.setParameter ("query", prefix + "%");

        Integer result = query.getSingleResult();
        return result != null ? result : 0;
    }
}
