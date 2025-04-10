/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/** Automatically generated Finder class for ResultCodeInfoFinder.
 * @author Hibernate FinderGenerator  **/
public class ResultCodeInfoFinder implements Serializable {

    public static List<ResultCodeInfo> findAll(Session session) throws HibernateException {
        return session.createQuery(
            "from ResultCodeInfo in class org.jpos.ee.ResultCodeInfo", ResultCodeInfo.class
        ).list();
    }
}
