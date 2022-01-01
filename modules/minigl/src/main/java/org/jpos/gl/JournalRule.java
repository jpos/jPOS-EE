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

package org.jpos.gl;

import org.hibernate.HibernateException;

public interface JournalRule {
    /**
     * @param session current GLSession
     * @param txn GLTransaction
     * @param param rule handback parameter
     * @param account account that triggers this rule (may be an ancestor)
     * @param entryOffsets entries that matches this rule
     * @throws GLException if rule denies transaction
     */
    public void check (GLSession session, GLTransaction txn, 
            String param, Account account, int[] entryOffsets, short[] layers)
        throws GLException, HibernateException;
}

