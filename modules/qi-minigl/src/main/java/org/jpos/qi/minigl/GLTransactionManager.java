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

import org.jpos.ee.DB;
import org.jpos.ee.DBManager;
import org.jpos.gl.GLTransaction;

import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Date;

public class GLTransactionManager extends DBManager<GLTransaction> {

   private Date start;
   private Date end;
   private Long journalId;

    public GLTransactionManager(DB db) {
        super(db,GLTransaction.class);
    }

    public GLTransactionManager(DB db, Long journalId, Date start, Date end) {
        super(db,GLTransaction.class);
        this.start = start;
        this.end = end;
        this.journalId = journalId;
    }

    @Override
    protected Predicate[] buildFilters(Root<GLTransaction> root) {
        db.session().enableFetchProfile("eager");
        Predicate journalPredicate = null;
        if (journalId != null) {
            journalPredicate = db.session().getCriteriaBuilder().equal(root.get("journal"), this.journalId);
        }
        if (start != null && end != null) {
            Predicate datePredicate = db.session().getCriteriaBuilder().between(root.get("timestamp"), start, end);
            if (journalId == null) {
                return new Predicate[] { datePredicate };
            }
            Predicate and = db.session().getCriteriaBuilder().and(journalPredicate,datePredicate);
            return new Predicate[] { and };
        }
        if (journalPredicate == null) {
            return null;
        }
        return new Predicate[] { journalPredicate };
    }
}
