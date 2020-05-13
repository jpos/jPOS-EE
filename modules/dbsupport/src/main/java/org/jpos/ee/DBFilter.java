package org.jpos.ee;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Functional interface to create predicates for querying {@link DBManager}
 * @param <T> The root entity type on which to create the predicate
 */
@FunctionalInterface
public interface DBFilter<T> {
    /**
     * Creates the predicate for the root
     * @param criteriaBuilder criteria builder for predicate creation
     * @param root root entity of the query
     * @return Predicate suitable to add to a query on the given root
     */
    Predicate createPredicate(CriteriaBuilder criteriaBuilder, Root<T> root);
}
