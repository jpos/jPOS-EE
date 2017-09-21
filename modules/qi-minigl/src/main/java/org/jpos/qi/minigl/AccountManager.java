package org.jpos.qi.minigl;

import org.hibernate.query.criteria.internal.OrderImpl;
import org.jpos.ee.DB;
import org.jpos.ee.ManagerSupport;
import org.jpos.gl.Account;
import org.jpos.gl.CompositeAccount;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by jr on 8/8/17.
 */
public class AccountManager extends ManagerSupport<Account> {
    
    
    public AccountManager(DB db) {
        super(db);
    }

    public List<Account> getAllChildren(int offset, int limit, Map<String,Boolean> orders, Account parent) throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Account> query = criteriaBuilder.createQuery(Account.class);
        Root<Account> root = query.from(Account.class);
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
        List<Account> list = db.session().createQuery(query)
                .setMaxResults(limit)
                .setFirstResult(offset)
                .getResultList();
        return list;
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
}
