package org.jpos.ee;

import org.hibernate.query.criteria.internal.OrderImpl;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by jr on 6/6/17.
 */
public class ManagerSupport<T> {

    protected DB db;
    private Class<T> clazz;

    public ManagerSupport(DB db) {
        this.db = db;
        clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public int getItemCount()  {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<T> root = query.from(clazz);
        Predicate[] predicates = buildPredicates(root);
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
        Predicate[] predicates = buildPredicates(root);
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

    public T getItemByParam(String param, Object value, boolean withFilter) {
        try {
            CriteriaQuery<T> query = createQueryByParam(param, value, withFilter);
            return db.session().createQuery(query).getSingleResult();
        } catch (NoResultException nre) {
            return null;
        }
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
            Predicate[] predicates = buildPredicates(root);
            if (predicates != null) {
                //overrides previous predicates
                query.where(criteriaBuilder.and(criteriaBuilder.and(predicates), equals));
            }
        }
        query.select(root);
        return query;
    }

    protected Predicate[] buildPredicates(Root<T> root) { return null; }

}
