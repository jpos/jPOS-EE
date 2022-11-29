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

package org.jpos.ee;


import jakarta.persistence.TemporalType;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@SuppressWarnings({"unused", "JpaQueryApiInspection"})
public class ThingsManager {
    DB db;

    public ThingsManager(DB db) {
        super();
        this.db = db;
    }

    public Thing create(String type) {
        Thing thing = new Thing(type);
        db.save(thing);
        return thing;
    }

    public Thing get(long id) {
        return (Thing) db.session().get(Thing.class, id);
    }

    public List<Thing> getAll(String type) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Thing> query = criteriaBuilder.createQuery(Thing.class);
        Root<Thing> root = query.from(Thing.class);

        query = query
                .where(criteriaBuilder.equal(root.get("type"), type))
                .select(root);

        return db.session.createQuery(query).getResultList();
    }

    public Thing getLast(String type) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Thing> query = criteriaBuilder.createQuery(Thing.class);
        Root<Thing> root = query.from(Thing.class);

        query = query
                .where(criteriaBuilder.equal(root.get("type"), type))
                .orderBy(criteriaBuilder.desc(root.get("id")))
                .select(root);

        List<Thing> l = db.session.createQuery(query).getResultList();
        return l.size() > 0 ? l.get(0) : null;
    }

    // === String ==============================================================
    public List<Thing> listByStringName(String type, String name) {
        return db.session().createNamedQuery("list-by-string-name", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .getResultList();
    }

    public List<Thing> listByStringValue(String type, String value) {
        return db.session().createNamedQuery("list-by-string-value", Thing.class)
                .setParameter("type", type)
                .setParameter("value", value)
                .list();
    }

    public List<Thing> listByStringNameValue(String type, String name, String value) {
        return db.session().createNamedQuery("list-by-string-name-value", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .setParameter("value", value)
                .list();
    }

    // === Text ==============================================================
    public List<Thing> listByTextName(String type, String name) {
        return db.session().createNamedQuery("list-by-text-name", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .list();
    }


    public List<Thing> listByTextValue(String type, String value) {
        return db.session().createNamedQuery("list-by-text-value", Thing.class)
                .setParameter("type", type)
                .setParameter("value", value)
                .list();
    }


    public List<Thing> listByTextNameValue(String type, String name, String value) {
        return db.session().createNamedQuery("list-by-text-name-value", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .setParameter("value", value)
                .getResultList();
    }

    // === Long ==============================================================

    public List<Thing> listByLongName(String type, String name) {
        return db.session().createNamedQuery("list-by-long-name", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .getResultList();
    }


    public List<Thing> listByLongValue(String type, long value) {
        return db.session().createNamedQuery("list-by-long-value", Thing.class)
                .setParameter("type", type)
                .setParameter("value", value, Long.class)
                .getResultList();
    }


    public List<Thing> listByLongNameValue(String type, String name, long value) {
        return db.session().createNamedQuery("list-by-long-name-value", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .setParameter("value", value, Long.class)
                .list();
    }

    // === Date ==============================================================

    public List<Thing> listByDateName(String type, String name) {
        return db.session().createNamedQuery("list-by-date-name", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .list();
    }


    public List<Thing> listByDateValue(String type, Date value) {
        return db.session().createNamedQuery("list-by-date-value", Thing.class)
                .setParameter("type", type)
                .setParameter("value", value, TemporalType.DATE)
                .list();
    }


    public List<Thing> listByDateNameValue(String type, String name, Date value) {
        return db.session().createNamedQuery("list-by-date-name-value", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .setParameter("value", value, TemporalType.DATE)
                .list();
    }

    // === Timestamp ==============================================================

    public List<Thing> listByTimestampName(String type, String name) {
        return db.session().createNamedQuery("list-by-timestamp-name", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .list();
    }


    public List<Thing> listByTimestampValue(String type, Date value) {
        return db.session().createNamedQuery("list-by-timestamp-value", Thing.class)
                .setParameter("type", type)
                .setParameter("value", value, TemporalType.TIMESTAMP)
                .list();
    }


    public List<Thing> listByTimestampNameValue(String type, String name, Date value) {
        return db.session().createNamedQuery("list-by-timestamp-name-value", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .setParameter("value", value, TemporalType.TIMESTAMP)
                .list();
    }

    // === BigDecimal ==============================================================

    public List<Thing> listByBigDecimalName(String type, String name) {
        return db.session().createNamedQuery("list-by-big-decimal-name", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .list();
    }


    public List<Thing> listByBigDecimalValue(String type, BigDecimal value) {
        return db.session().createNamedQuery("list-by-big-decimal-value", Thing.class)
                .setParameter("type", type)
                .setParameter("value", value, BigDecimal.class)
                .list();
    }


    public List<Thing> listByBigDecimalNameValue(String type, String name, BigDecimal value) {
        return db.session().createNamedQuery("list-by-big-decimal-name-value", Thing.class)
                .setParameter("type", type)
                .setParameter("name", name)
                .setParameter("value", value, BigDecimal.class)
                .list();
    }
}
