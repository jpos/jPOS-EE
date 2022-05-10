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
