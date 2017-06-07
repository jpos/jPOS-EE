package org.jpos.ee;

import org.hibernate.query.criteria.internal.OrderImpl;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by jr on 6/6/17.
 */
public class ManagerSupport<T> {

    protected DB db;

    public ManagerSupport(DB db) {
        this.db = db;
    }

    public int getItemCount(Class<T> clazz) throws Exception {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<T> root = query.from(clazz);
        Predicate[] predicates = buildGenericPredicates(root);
        if (predicates != null)
            query.where(predicates);
        query.select(criteriaBuilder.count(root));
        return db.session().createQuery(query).getSingleResult().intValue();
    }

    public List<T> getAll(Class<T> clazz, int offset, int limit, Map<String,Boolean> orders) {
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
        Predicate[] predicates = buildGenericPredicates(root);
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

    public List<T> getAll(Class<T> clazz) {
        return this.getAll(clazz,0,-1,null);

    }

    public T getItemByParam(Class<T> clazz, String param, Object value, boolean withFilter) {
        try {
            CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
            CriteriaQuery<T> query = criteriaBuilder.createQuery(clazz);
            Root<T> root = query.from(clazz);
            Predicate equals = criteriaBuilder.equal(root.get(param), value);
            query.where(equals);
            if (withFilter) {
                Predicate[] predicates = buildGenericPredicates(root);
                if (predicates != null) {
                    //overrides previous
                    query.where(criteriaBuilder.and(criteriaBuilder.and(predicates), equals));
                }
            }
            query.select(root);
            return db.session().createQuery(query).getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }
    }

    protected Predicate[] buildGenericPredicates(Root<T> root) { return null; }








}
