/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

import jakarta.persistence.NoResultException;
import jakarta.persistence.criteria.*;
import org.hibernate.query.Query;

import java.util.*;

public class DBManager<T> {

    protected DB db;
    private Class<T> clazz;

    public DBManager(DB db, Class<T> clazz) {
        this.db = db;
        this.clazz = clazz;
    }

    /** Convenience method */
    public T byId(Long id) {
        return db.session().get(clazz, id);
    }

    public int getItemCount()  {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
        Root<T> root = query.from(clazz);
        Predicate[] predicates = buildFilters(root);
        if (predicates != null)
            query.where(predicates);
        query.select(criteriaBuilder.count(root));
        return db.session().createQuery(query).getSingleResult().intValue();
    }

    public int getItemCount(DBFilter<T>... filters)  {
        CriteriaBuilder cb = db.session().getCriteriaBuilder();
        CriteriaQuery<Long> countQuery = cb.createQuery(Long.class);
        Root<T> root = countQuery.from(clazz);
        Predicate combinedPredicate = cb.and(
            Arrays.stream(filters)
                .filter(Objects::nonNull)
                .map(f -> f.createPredicate(cb, root))
                .toArray(Predicate[]::new)
        );

        Predicate[] mgrFilters = buildFilters(root);
        if (mgrFilters != null) {
            Predicate[] nonNullPredicates = Arrays.stream(mgrFilters).filter(f -> f != null).toArray(Predicate[]::new);
            Predicate mgrPredicate = cb.and(nonNullPredicates);
            combinedPredicate = cb.and(mgrPredicate, combinedPredicate);
        }

        countQuery.select(cb.count(root));
        countQuery.where(combinedPredicate);
        Long totalCount = db.session().createQuery(countQuery).getSingleResult();
        return totalCount.intValue();

    }
    public List<T> getAll(int offset, int limit, Map<String,Boolean> orders) {
        return this.getAll(offset, limit, orders, (DBFilter<T>) null);
    }

    public List<T> getAll(int offset, int limit, Map<String,Boolean> orders, DBFilter<T>... filters) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(clazz);
        Root<T> root = query.from(clazz);
        List<Order> orderList = new ArrayList<>();
        //ORDERS
        if (orders != null) {
            orders.forEach((key, value) ->
              orderList.add(Boolean.TRUE.equals(value) ? criteriaBuilder.asc(root.get(key)) : criteriaBuilder.desc(root.get(key)))
            );
        }
        Predicate combinedPredicate = null;
        if (filters != null) {
            combinedPredicate = criteriaBuilder.and(Arrays.stream(filters)
                    .filter(Objects::nonNull)
                    .map(f -> f.createPredicate(criteriaBuilder, root))
                    .toArray(Predicate[]::new));
        }
        Predicate[] mgrFilters = buildFilters(root);
        if (mgrFilters != null) {
            Predicate[] nonNullPredicates = Arrays.stream(mgrFilters).filter(f -> f != null).toArray(Predicate[]::new);
            Predicate mgrPredicate = criteriaBuilder.and(nonNullPredicates);
            combinedPredicate = combinedPredicate != null ? criteriaBuilder.and(mgrPredicate, combinedPredicate) : mgrPredicate;
        }
        if (combinedPredicate != null)
            query.where(combinedPredicate);
        query.select(root);
        query.orderBy(orderList);
        Query<T> queryImp = db.session().createQuery(query);
        if (limit != -1) {
            queryImp.setMaxResults(limit);
        }
        return queryImp
                .setFirstResult(offset)
                .getResultList();
    }

    public List<T> getAll() {
        return this.getAll(0,-1,null);
    }

    public T getItemByParam(String param, Object value) {
        return getItemByParam(param,value,false);
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

    public List<T> getItemsByParam(int offset, int limit, String param, Object value, boolean withFilter) {
        try {
            CriteriaQuery<T> query = createQueryByParam(param, value, withFilter);
            Query<T> queryImp = db.session().createQuery(query);
            if (limit != -1) {
                queryImp.setMaxResults(limit);
            }
            return queryImp
                    .setFirstResult(offset)
                    .getResultList();
        } catch (NoResultException nre) {
            return null;
        }
    }

    public List<T> queryItems(int offset, int limit, DBFilter<T> filter) {
        return queryItems(offset, limit, false, filter);
    }

    /**
     * Paged version of {@link #queryItems(DBFilter[])}
     * @param offset page start
     * @param limit page size
     * @param filters predicate creators
     * @return items for which predicate created by filters are true
     */
    @SafeVarargs
    public final List<T> queryItems(int offset, int limit, DBFilter<T>... filters) {
        return queryItems(offset, limit, false, filters);
    }

    public List<T> queryItems(int offset, int limit, boolean internalFilters, DBFilter<T> filter) {
        Query<T> q = createQuery(internalFilters, filter);
        if (limit > 0) q.setMaxResults(limit);
        if (offset > 0) q.setFirstResult(offset);
        return q.getResultList();
    }

    /**
     * Paged version of {@link #queryItems(boolean, DBFilter[])}
     * @param offset page start
     * @param limit page size
     * @param internalFilters if true include manager's internal filter
     * @param filters predicate creators
     * @return items for which predicate created by filters are true
     */
    @SafeVarargs
    public final List<T> queryItems(int offset, int limit, boolean internalFilters, DBFilter<T>... filters) {
        Query<T> q = createQuery(internalFilters, filters);
        if (limit > 0) q.setMaxResults(limit);
        if (offset > 0) q.setFirstResult(offset);
        return q.getResultList();
    }

    public List<T> queryItems(DBFilter<T> filter) {
        return queryItems(false, filter);
    }

    /**
     * Arbitrary query over the entity type (T) of this manager
     * Example usage:
     * <pre>
     *     List&le;T&ge; results = queryItems( (cb, root) ->
     *          cb.or(
     *              cb.greaterThanOrEqualTo(root.get("property"), value),
     *              cb.isNotNull(root.get("otherProperty")
     *          )
     *     )
     * </pre>
     *
     * @param filters predicate creators
     * @return items for which predicate created by filters are true
     */
    @SafeVarargs
    public final List<T> queryItems(DBFilter<T>... filters) {
        return queryItems(false, filters);
    }

    public List<T> queryItems(boolean internalFilters, DBFilter<T> filter) {
        return createQuery(internalFilters, filter).getResultList();
    }

    /**
     * Version of {@link #queryItems(DBFilter[])} that adds the manager internal predicates
     * @param internalFilters if true the manager's internal predicates are added
     * @param filters predicate creators
     * @return items for which predicate created by filters are true
     */
    @SafeVarargs
    public final List<T> queryItems(boolean internalFilters, DBFilter<T>... filters) {
        return createQuery(internalFilters, filters).getResultList();
    }
    public List<T> getItemsByParam(String param, Object value) {
        return getItemsByParam(param,value,false);
    }

    public Query<T> createQuery(DBFilter<T> filter) {
        return createQuery(false, filter);
    }

    /**
     * Similar to {@link #queryItems(DBFilter[])} but returns the query to be modified prior execution
     * @param filters predicate creators
     * @return Hibernate Query ready to be executed or modified prior execution
     */
    @SafeVarargs
    public final Query<T> createQuery(DBFilter<T>... filters) {
        return createQuery(false, filters);
    }

    public Query<T> createQuery(boolean internalFilters, DBFilter<T> filter) {
        return db.session().createQuery(createCriteriaQuery(internalFilters, filter));
    }

    /**
     * Similar to {@link #createQuery(DBFilter[])} with ability of adding manager's internal predicates
     * @param internalFilters include manager's internal predicates?
     * @param filters predicate creators
     * @return Hibernate Query Ready to be executed or modified prior execution
     */
    @SafeVarargs
    public final Query<T> createQuery(boolean internalFilters, DBFilter<T>... filters) {
        return db.session().createQuery(createCriteriaQuery(internalFilters, filters));
    }

    protected CriteriaQuery<T> createCriteriaQuery(DBFilter<T> filter) {
        return createCriteriaQuery(false, filter);
    }

    @SafeVarargs
    protected final CriteriaQuery<T> createCriteriaQuery(DBFilter<T>... filters) {
        return createCriteriaQuery(false, filters);
    }

    protected CriteriaQuery<T> createCriteriaQuery(boolean internalFilters, DBFilter<T> filter) {

        CriteriaBuilder cb = db.session().getCriteriaBuilder();

        CriteriaQuery<T> query = cb.createQuery(clazz);
        Root<T> root = query.from(clazz);
        Predicate predicate = (filter != null) ? filter.createPredicate(cb, root) : null;
        if (internalFilters){
            Predicate[] predicates = buildFilters(root);
            if (predicates != null && predicates.length > 0) {
                predicate = (predicate != null) ? cb.and(predicate, cb.and(predicates)) : cb.and(predicates);
            }
        }
        if (predicate != null) query = query.where(predicate);
        return query.select(root);
    }

    @SafeVarargs
    protected final CriteriaQuery<T> createCriteriaQuery(boolean internalFilters, DBFilter<T>... filters) {
        CriteriaBuilder cb = db.session().getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(clazz);
        Root<T> root = query.from(clazz);
        Predicate combinedPredicate = cb.and(Arrays.stream(filters)
                    .filter(f -> f != null)
                    .map(f -> f.createPredicate(cb, root))
                    .toArray(Predicate[]::new));
        if (internalFilters) {
            Predicate[] mgrFilters = buildFilters(root);
            if (mgrFilters != null) {
                Predicate[] nonNullPredicates = Arrays.stream(mgrFilters).filter(f -> f != null).toArray(Predicate[]::new);
                Predicate mgrPredicate = cb.and(nonNullPredicates);
                combinedPredicate = cb.and(mgrPredicate, combinedPredicate);
            }
        }
        query.distinct(true);
        return query.where(combinedPredicate);
    }

    private CriteriaQuery<T> createQueryByParam(String param, Object value, boolean withFilter) {
        CriteriaBuilder criteriaBuilder = db.session().getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(clazz);
        Root<T> root = query.from(clazz);
        Predicate equals = criteriaBuilder.equal(root.get(param), value);
        query.where(equals);
        if (withFilter) {
            Predicate[] predicates = buildFilters(root);
            if (predicates != null) {
                //overrides previous predicates
                query.where(criteriaBuilder.and(criteriaBuilder.and(predicates), equals));
            }
        }
        query.select(root);
        return query;
    }

    protected Predicate[] buildFilters(Root<T> root) { return null; }

}
