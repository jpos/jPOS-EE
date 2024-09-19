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

import org.hibernate.HibernateException;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.query.Query;

@SuppressWarnings("unused")
public class RevisionManager extends DBManager<Revision> {

    public RevisionManager (DB db) {
        super(db,Revision.class);
    }

    public List<Revision> getRevisionsByRef (String ref)
        throws HibernateException
    {
        Query<Revision> q = db.session().createQuery("from revision where ref = :ref order by id desc");
        q.setParameter("ref", ref);
        return q.list();
    }

    public List<Revision> getRevisionsByAuthor (User author)
        throws HibernateException
    {
        Query<Revision> q = db.session().createQuery("from revision where author = :author order by id desc");
        q.setParameter("author", author);
        return q.list();
    }

    //overridden to avoid LazyInitializationExc
    @Override
    public List<Revision> getAll(int offset, int limit, Map<String,Boolean> orders) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Revision> query = criteriaBuilder.createQuery(Revision.class);
        Root<Revision> root = query.from(Revision.class);
        // To avoid LazyInitializationExc
        root.fetch("author");
        List<jakarta.persistence.criteria.Order> orderList = new ArrayList<>();
        //ORDERS
        orders.forEach((key, value) ->
                orderList.add(Boolean.TRUE.equals(value) ? criteriaBuilder.asc(root.get(key)) : criteriaBuilder.desc(root.get(key)))
        );
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

