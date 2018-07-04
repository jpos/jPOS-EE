/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2018 jPOS Software SRL
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

import org.hibernate.query.criteria.internal.OrderImpl;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DBManager<T> {

    protected DB db;
    private Class<T> clazz;

    public DBManager(DB db, Class<T> clazz) {
        this.db = db;
        this.clazz = clazz;
    }

    public int getItemCount()  {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<T> root = query.from(clazz);
        Predicate[] predicates = buildFilters(root);
        if (predicates != null)
            query.where(predicates);
        query.select(criteriaBuilder.count(root));
        return db.session().createQuery(query).getSingleResult().intValue();
    }

    public List<T> getAll(int offset, int limit, Map<String,Boolean> orders) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(clazz);
        Root<T> root = query.from(clazz);
        List<Order> orderList = new ArrayList<>();
        //ORDERS
        if (orders != null) {
            for (Map.Entry<String, Boolean> entry : orders.entrySet()) {
                OrderImpl order = new OrderImpl(root.get(entry.getKey()), entry.getValue());
                orderList.add(order);
            }
        }
        Predicate[] predicates = buildFilters(root);
        if (predicates != null)
            query.where(predicates);
        query.select(root);
        query.orderBy(orderList);
        Query queryImp = db.session().createQuery(query);
        if (limit != -1) {
            queryImp.setMaxResults(limit);
        }
        List<T> list = queryImp
                .setFirstResult(offset)
                .getResultList();
        return list;
    }

    public List<T> getAll() {
        return this.getAll(0,-1,null);
    }

    public T getItemByParam(String param, Object value) {
        return getItemByParam(param,value,false);
    }

    public T getItemByParam(String param, Object value, boolean withFilter) {
        try {
            CriteriaQuery<T> query = createQueryByParam(param, value, withFilter);
            return db.session().createQuery(query).getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }
    }

    public List<T> getItemsByParam(String param, Object value) {
        return getItemsByParam(param,value,false);
    }

    public List<T> getItemsByParam(String param, Object value, boolean withFilter) {
        try {
            CriteriaQuery<T> query = createQueryByParam(param, value, withFilter);
            return db.session().createQuery(query).list();
        } catch (NoResultException nre) {
            return null;
        }
    }

    private CriteriaQuery<T> createQueryByParam(String param, Object value, boolean withFilter) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(clazz);
        Root<T> root = query.from(clazz);
        Predicate equals = criteriaBuilder.equal(root.get(param), value);
        query.where(equals);
        if (withFilter) {
            Predicate[] predicates = buildFilters(root);
            if (predicates != null) {
                //overrides previous predicates
                query.where(criteriaBuilder.and(criteriaBuilder.and(predicates), equals));
            }
        }
        query.select(root);
        return query;
    }

    protected Predicate[] buildFilters(Root<T> root) { return null; }

}
