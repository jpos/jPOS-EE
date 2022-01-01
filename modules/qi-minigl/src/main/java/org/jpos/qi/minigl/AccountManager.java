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

package org.jpos.qi.minigl;

import org.hibernate.query.criteria.internal.OrderImpl;
import org.jpos.ee.DB;
import org.jpos.ee.DBManager;
import org.jpos.gl.Account;
import org.jpos.gl.CompositeAccount;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by jr on 8/8/17.
 */
public class AccountManager extends DBManager<Account> {

    
    public AccountManager(DB db) {
        super(db,Account.class);
    }

    public List getAllChildren(int offset, int limit, Map<String,Boolean> orders, Account parent, boolean onlyComposite) throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery query;
        Root root;
        if (onlyComposite) {
            query = criteriaBuilder.createQuery(CompositeAccount.class);
            root = query.from(CompositeAccount.class);
        } else {
            query = criteriaBuilder.createQuery(Account.class);
            root = query.from(Account.class);
        }
        List<Order> orderList = new ArrayList<>();
        //ORDERS
        for (Map.Entry<String,Boolean> entry : orders.entrySet()) {
            OrderImpl order = new OrderImpl(root.get(entry.getKey()),entry.getValue());
            orderList.add(order);
        }
        //Is child of parent
        Predicate p;
        if (parent != null) {
            p = criteriaBuilder.equal(root.get("parent"), parent.getId());
        } else {
            p = criteriaBuilder.isNull(root.get("parent"));
        }
        query.select(root);
        query.orderBy(orderList);
        query.where(p);
        List<CompositeAccount> list = db.session().createQuery(query)
                .setMaxResults(limit)
                .setFirstResult(offset)
                .getResultList();
        return list;
    }

    public List getAllChildren(int offset, int limit, Map<String,Boolean> orders, Account parent) throws Exception {
        return getAllChildren(offset, limit, orders, parent, false);
    }

    public List getAllCompositeChildren(int offset, int limit, Map<String,Boolean> orders, Account parent) throws Exception {
        return getAllChildren(offset, limit, orders, parent, true);
    }


    public List<CompositeAccount> getCompositeAccounts(int offset, int limit, Map<String,Boolean> orders) throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<CompositeAccount> query = criteriaBuilder.createQuery(CompositeAccount.class);
        Root<CompositeAccount> root = query.from(CompositeAccount.class);
        List<Order> orderList = new ArrayList<>();
        //ORDERS
        for (Map.Entry<String,Boolean> entry : orders.entrySet()) {
            OrderImpl order = new OrderImpl(root.get(entry.getKey()),entry.getValue());
            orderList.add(order);
        }
        query.select(root);
        query.orderBy(orderList);
        List<CompositeAccount> list = db.session().createQuery(query)
                .setMaxResults(limit)
                .setFirstResult(offset)
                .getResultList();
        return list;
    }

    public int getCompositeAccountsCount()  {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<CompositeAccount> root = query.from(CompositeAccount.class);
        query.select(criteriaBuilder.count(root));
        return db.session().createQuery(query).getSingleResult().intValue();
    }

    public int getCompositeChildrenCount (Account parent) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<CompositeAccount> root = query.from(CompositeAccount.class);
        Predicate equals = criteriaBuilder.equal(root.get("parent"), parent);
        query.where(equals);
        query.select(criteriaBuilder.count(root));
        return db.session().createQuery(query).getSingleResult().intValue();
    }
}
