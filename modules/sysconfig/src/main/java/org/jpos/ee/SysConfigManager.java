/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

import java.util.*;

import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.query.criteria.internal.OrderImpl;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.hibernate.type.IntegerType;

import javax.persistence.criteria.*;

@SuppressWarnings("unused")
public class SysConfigManager {
    private DB db;
    private String prefix = "";

//    public SysConfigManager() {
//        super();
//    }
//    public SysConfigManager(String prefix) {
//        super();
//        this.prefix=prefix;
//    }

    public SysConfigManager (DB db) {
        super();
        this.db = db;
    }
    public SysConfigManager (DB db, String prefix) {
        super();
        this.db = db;
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
                db.session().delete(cfg);
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
            Query query = db.session().createQuery (
                "from sysconfig in class org.jpos.ee.SysConfig where id like :queryString order by id"
            );
            query.setParameter ("queryString", queryString);
            List l = query.list();
            values = new SysConfig[l.size()];
            Iterator iter = l.iterator();
            for (int i=0; iter.hasNext(); i++) {
                values[i] = (SysConfig) iter.next();
            }
        } catch (HibernateException e) {
            db.getLog().warn (e);
            values = new SysConfig[0];
        }
        return values;
    }
    public SysConfig[] getAll () {

        SysConfig[] values;
        try {
            String queryAsString = "from sysconfig in class org.jpos.ee.SysConfig";
            if (prefix != null)
                queryAsString += " where id like :query";
            Query query = db.session().createQuery (queryAsString + " order by id");
            if (prefix != null)
                query.setParameter ("query", prefix + "%");
            List l = query.list();
            values = new SysConfig[l.size()];
            Iterator iter = l.iterator();
            for (int i=0; iter.hasNext(); i++) {
                values[i] = (SysConfig) iter.next();
            }
        } catch (HibernateException e) {
            db.getLog().warn (e);
            values = new SysConfig[0];
        }
        return values;
    }

    public SysConfig[] getAll(int offset, int limit, Map<String,Boolean> orders) throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<SysConfig> query = criteriaBuilder.createQuery(SysConfig.class);
        Root<SysConfig> root = query.from(SysConfig.class);
        List<Order> orderList = new ArrayList<>();
        //ORDERS
        for (Map.Entry<String,Boolean> entry : orders.entrySet()) {
            OrderImpl order = new OrderImpl(root.get(entry.getKey()),entry.getValue());
            orderList.add(order);
        }
        //Get only by prefix
        Predicate prefixLike = criteriaBuilder.like(root.get("id"), prefix + "%");

        query.select(root);
        query.orderBy(orderList);
        query.where(prefixLike);
        List<SysConfig> list = db.session().createQuery(query)
                .setMaxResults(limit)
                .setFirstResult(offset)
                .getResultList();
        return list.toArray(new SysConfig[] { });

    }

    public int getItemCount() throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<SysConfig> root = query.from(SysConfig.class);
        Predicate prefixLike = criteriaBuilder.like(root.get("id"), prefix + "%");
        query.where(prefixLike);
        query.select(criteriaBuilder.count(root));
        return db.session().createQuery(query).getSingleResult().intValue();
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
            cfg.setReadPerm (readPerm);
            cfg.setWritePerm (writePerm);
            cfg.setValue (value);
            if (saveIt)
                db.session().save (cfg);
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
        NativeQuery query =  db.session().createNativeQuery(queryString);
        if (prefix != null)
            query.setParameter ("query", prefix + "%");
        return (int) query.addScalar("maxidlen",  IntegerType.INSTANCE).getSingleResult();
    }
}
