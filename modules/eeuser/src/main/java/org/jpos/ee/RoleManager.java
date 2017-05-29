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

import org.hibernate.query.criteria.internal.OrderImpl;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoleManager {
    private DB db;
    public RoleManager (DB db) {
        this.db = db;
    }

    public Role getRoleByName (String name) {
        return (Role) db.session().createQuery("from Role c WHERE c.name=:name").
          setParameter("name", name).uniqueResult();
    }

    public Role getRoleById (long id) {
        return (Role) db.session().createQuery("from Role c WHERE c.id=:id").
                setParameter("id", id).uniqueResult();
    }

    public List<Role> getAll() {
        return db.session().createQuery("from Role", Role.class).list();
    }

    public List<Role> getAll(int offset, int limit, Map<String,Boolean> orders) throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Role> query = criteriaBuilder.createQuery(Role.class);
        Root<Role> root = query.from(Role.class);
        List<Order> orderList = new ArrayList<>();
        //ORDERS
        for (Map.Entry<String,Boolean> entry : orders.entrySet()) {
            OrderImpl order = new OrderImpl(root.get(entry.getKey()),entry.getValue());
            orderList.add(order);
        }
        query.select(root);
        query.orderBy(orderList);
        return db.session().createQuery(query)
                .setMaxResults(limit)
                .setFirstResult(offset)
                .getResultList();
    }

    public int getItemCount() throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        query.select(criteriaBuilder.count(query.from(Role.class)));
        return db.session().createQuery(query).getSingleResult().intValue();
    }

}
