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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.criteria.internal.OrderImpl;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@SuppressWarnings("unused")
public class RevisionManager extends DBManager<Revision> {

    public RevisionManager (DB db) {
        super(db,Revision.class);
    }
    @SuppressWarnings("unchecked")
    public List<Revision> getRevisionsByRef (String ref)
        throws HibernateException
    {
        Criteria crit = db.session().createCriteria (Revision.class)
            .add (Restrictions.eq ("ref", ref))
            .addOrder (Order.desc("id"));
        return (List<Revision>) crit.list();
    }
    @SuppressWarnings("unchecked")
    public List<Revision> getRevisionsByAuthor (User author)
        throws HibernateException
    {
        Criteria crit = db.session().createCriteria (Revision.class)
            .add (Restrictions.eq ("author", author))
            .addOrder (Order.desc("id"));
        return (List<Revision>) crit.list();
    }

    //overridden to avoid LazyInitializationExc
    @Override
    public List<Revision> getAll(int offset, int limit, Map<String,Boolean> orders) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Revision> query = criteriaBuilder.createQuery(Revision.class);
        Root<Revision> root = query.from(Revision.class);
        // To avoid LazyInitializationExc
        root.fetch("author");
        List<javax.persistence.criteria.Order> orderList = new ArrayList<>();
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



    /**
     * factory method used to create a Revision associated with this user.
     *
     * @param author the revision author
     * @param ref associated with this revision
     * @param info information
     * @return a revision entry
     */
    public Revision createRevision (User author, String ref, String info) {
        Revision re = new Revision();
        re.setDate (new Date());
        re.setInfo (info);
        re.setRef (ref);
        re.setAuthor (author);
        db.save (re);
        return re;
    }
}

