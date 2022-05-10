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

package org.jpos.gl.rule;

import java.util.Date;
import java.util.List;
import java.util.Iterator;
import java.math.BigDecimal;
import org.hibernate.Session;
import org.jpos.gl.JournalRule;
import org.jpos.gl.GLSession;
import org.jpos.gl.GLException;
import org.jpos.gl.Account;
import org.jpos.gl.GLEntry;
import org.jpos.gl.GLTransaction;
import org.jpos.gl.GLPermission;
import org.jpos.gl.Journal;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Verify that user can post to a given journal.
 *
 * This rule check the following conditions:
 * <ul>
 *  <li>GLUser has GLPermission.POST in this journal.</li>
 *  <li>Journal is not closed.</li>
 *  <li>Transaction posting date is not null.</li>
 *  <li>If Journal has a start date, check it against txn.postDate</li>
 *  <li>If Journal has an end date, check it against txn.postDate</li>
 *  <li>Check entries' accounts for expired accounts</li>
 * </ul>
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 * @see org.jpos.gl.JournalRule
 * @see org.jpos.gl.RuleInfo
 */
public class CanPost implements JournalRule {
    private static final BigDecimal ZERO = new BigDecimal ("0.00");
    private static final Log log = 
        LogFactory.getLog (CanPost.class);

    public void check (GLSession session, GLTransaction txn, 
            String param, Account account, int[] entryOffsets, short[] layers)
        throws GLException
    {
        Journal journal = txn.getJournal();
        Date postDate   = txn.getPostDate();
        Date end        = journal.getEnd();
        Date start      = journal.getStart();
        Date lockDate   = journal.getLockDate();

        session.checkPermission (GLPermission.POST, journal);

        if (journal.isClosed()) {
            throw new GLException (
                "Journal '" + journal.getName() + "' is closed");
        }
        if (postDate == null)
            throw new GLException ("Invalid transaction. Posting date is null");

        if (start != null && postDate.compareTo (start) < 0) {
            throw new GLException (
                "Journal '" + journal.getName() + 
                "' cannot accept transactions with a posting date less than " +
                start.toString()
            );
        }
        if (end != null && postDate.compareTo (end) > 0) {
            throw new GLException (
                "Journal '" + journal.getName() + 
                "' cannot accept transactions with a post date greater than " +
                end.toString()
            );
        }
        if (lockDate != null && postDate.compareTo (lockDate) <= 0) {
            throw new GLException (
                "Journal '" + journal.getName() + 
                "' has a temporary lockDate at " + lockDate.toString()
            );
        }
        checkEntries (txn, postDate);
    }
    private void checkEntries (GLTransaction txn, Date postDate) 
        throws GLException
    {
        List list = txn.getEntries();
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            GLEntry entry = (GLEntry) iter.next();
            Account acct = entry.getAccount();
            Date end = acct.getExpiration();
            if (end != null && postDate.compareTo (end) > 0) {
                throw new GLException (
                    "Account '" + acct.toString() + 
                "' cannot accept transactions with a post date greater than " +
                    end.toString()
                );
            }
        }
    }
}

