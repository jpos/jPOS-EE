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

import java.io.Serializable;
import java.util.List;
import java.sql.SQLException;

import org.hibernate.*;

/** Automatically generated Finder class for ResultCodeFinder.
 * @author Hibernate FinderGenerator  **/
public class ResultCodeFinder implements Serializable {

    public static List findByMnemonic(Session session, java.lang.String mnemonic) throws SQLException, HibernateException {
        Query q = session.createQuery (
            "from org.jpos.ee.ResultCode as resultcode where resultcode.mnemonic=:mnemonic"
        );
        q.setParameter ("mnemonic", mnemonic);
        return q.list();
    }

    public static List findAll(Session session) throws SQLException, HibernateException {
        return session.createQuery(
            "from ResultCode in class org.jpos.ee.ResultCode"
        ).list();
    }
}

