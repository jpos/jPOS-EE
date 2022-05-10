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

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

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
    public Thing create (String type) {
        Thing thing = new Thing (type);
        db.save (thing);
        return thing;
    }
    public Thing get (long id) {
        return (Thing) db.session().get (Thing.class, id);
    }
    @SuppressWarnings("unchecked")
    public List<Thing> getAll (String type) {
        Criteria crit = db.session().createCriteria (Thing.class)
            .add (Restrictions.eq ("type", type));
        return (List<Thing>) crit.list();
    }
    @SuppressWarnings("unchecked")
    public Thing getLast (String type) {
        Criteria crit = db.session().createCriteria (Thing.class)
            .add (Restrictions.eq ("type", type))
            .addOrder(Order.desc("id"));
        List<Thing> l = crit.list();
        return l.size() > 0 ? l.get(0) : null;
    }
    // === String ==============================================================
    @SuppressWarnings("unchecked")
    public List<Thing> listByStringName (String type, String name) {
        Query query = db.session().getNamedQuery ("list-by-string-name")
            .setString ("type", type)
            .setString ("name", name);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByStringValue (String type, String value) {
        Query query = db.session().getNamedQuery ("list-by-string-value")
            .setString ("type", type)
            .setString ("value", value);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByStringNameValue (String type, String name, String value) {
        Query query = db.session().getNamedQuery ("list-by-string-name-value")
            .setString ("type", type)
            .setString ("name", name)
            .setString ("value", value);
        return (List<Thing>) query.list();
    }
    // === Text ==============================================================
    @SuppressWarnings("unchecked")
    public List<Thing> listByTextName (String type, String name) {
        Query query = db.session().getNamedQuery ("list-by-text-name")
            .setString ("type", type)
            .setString ("name", name);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByTextValue (String type, String value) {
        Query query = db.session().getNamedQuery ("list-by-text-value")
            .setString ("type", type)
            .setString ("value", value);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByTextNameValue (String type, String name, String value) {
        Query query = db.session().getNamedQuery ("list-by-text-name-value")
            .setString ("type", type)
            .setString ("name", name)
            .setString ("value", value);
        return (List<Thing>) query.list();
    }
    // === Long ==============================================================
    @SuppressWarnings("unchecked")
    public List<Thing> listByLongName (String type, String name) {
        Query query = db.session().getNamedQuery ("list-by-long-name")
            .setString ("type", type)
            .setString ("name", name);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByLongValue (String type, long value) {
        Query query = db.session().getNamedQuery ("list-by-long-value")
            .setString ("type", type)
            .setLong ("value", value);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByLongNameValue (String type, String name, long value) {
        Query query = db.session().getNamedQuery ("list-by-long-name-value")
            .setString ("type", type)
            .setString ("name", name)
            .setLong ("value", value);
        return (List<Thing>) query.list();
    }
    // === Date ==============================================================
    @SuppressWarnings("unchecked")
    public List<Thing> listByDateName (String type, String name) {
        Query query = db.session().getNamedQuery ("list-by-date-name")
            .setString ("type", type)
            .setString ("name", name);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByDateValue (String type, Date value) {
        Query query = db.session().getNamedQuery ("list-by-date-value")
            .setString ("type", type)
            .setDate ("value", value);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByDateNameValue (String type, String name, Date value) {
        Query query = db.session().getNamedQuery ("list-by-date-name-value")
            .setString ("type", type)
            .setString ("name", name)
            .setDate ("value", value);
        return (List<Thing>) query.list();
    }

    // === Timestamp ==============================================================
    @SuppressWarnings("unchecked")
    public List<Thing> listByTimestampName(String type, String name) {
        Query query = db.session().getNamedQuery ("list-by-timestamp-name")
            .setString ("type", type)
            .setString ("name", name);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByTimestampValue (String type, Date value) {
        Query query = db.session().getNamedQuery ("list-by-timestamp-value")
            .setString ("type", type)
            .setTimestamp ("value", value);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByTimestampNameValue (String type, String name, Date value) {
        Query query = db.session().getNamedQuery ("list-by-timestamp-name-value")
            .setString ("type", type)
            .setString ("name", name)
            .setTimestamp ("value", value);
        return (List<Thing>) query.list();
    }

    // === BigDecimal ==============================================================
    @SuppressWarnings("unchecked")
    public List<Thing> listByBigDecimalName(String type, String name) {
        Query query = db.session().getNamedQuery ("list-by-big-decimal-name")
            .setString ("type", type)
            .setString ("name", name);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByBigDecimalValue (String type, BigDecimal value) {
        Query query = db.session().getNamedQuery ("list-by-big-decimal-value")
            .setString ("type", type)
            .setBigDecimal ("value", value);
        return (List<Thing>) query.list();
    }
    @SuppressWarnings("unchecked")
    public List<Thing> listByBigDecimalNameValue (String type, String name, BigDecimal value) {
        Query query = db.session().getNamedQuery ("list-by-big-decimal-name-value")
            .setString ("type", type)
            .setString ("name", name)
            .setBigDecimal ("value", value);
        return (List<Thing>) query.list();
    }
}
