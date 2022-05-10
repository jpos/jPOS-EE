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

import org.hibernate.HibernateException;

import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;

@SuppressWarnings("unused")
public class ConsumerManager extends DBManager<Consumer> {
    private User user;

    public ConsumerManager (DB db) {
        super(db,Consumer.class);
    }

    public ConsumerManager(DB db, User user) {
        super(db,Consumer.class);
        this.user = user;
    }

    public Consumer getById (String id) throws HibernateException
    {
        return getItemByParam("id", id, true);
    }

    public List<Consumer> getConsumers (User user) {
        this.user = user;
        List<Consumer> consumers = getAll();
        this.user = null;
        return consumers;
    }

    protected Predicate[] buildFilters(Root<Consumer> root) {
        Predicate notDeleted = db.session.getCriteriaBuilder().isFalse(root.get("deleted"));
        if (user != null) {
            Predicate p = db.session().getCriteriaBuilder().equal(root.get("user"),user.getId());
            return new Predicate[]{notDeleted,p};
        }
        return new Predicate[]{notDeleted};
    }

}
