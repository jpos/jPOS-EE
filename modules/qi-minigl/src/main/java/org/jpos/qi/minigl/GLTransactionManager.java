package org.jpos.qi.minigl;

import org.jpos.ee.DB;
import org.jpos.ee.ManagerSupport;
import org.jpos.gl.GLTransaction;

import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Date;

public class GLTransactionManager extends ManagerSupport<GLTransaction> {

   private Date start;
   private Date end;
   private Long journalId;

    public GLTransactionManager(DB db) {
        super(db);
    }

    public GLTransactionManager(DB db, Long journalId, Date start, Date end) {
        super(db);
        this.start = start;
        this.end = end;
        this.journalId = journalId;
    }

    @Override
    protected Predicate[] buildPredicates(Root<GLTransaction> root) {
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
