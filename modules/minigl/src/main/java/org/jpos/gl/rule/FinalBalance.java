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
import org.jpos.gl.Account;
import org.jpos.gl.JournalRule;
import org.jpos.gl.GLSession;
import org.jpos.gl.GLException;
import org.jpos.gl.GLEntry;
import org.jpos.gl.GLTransaction;
import org.jpos.gl.Journal;
import org.hibernate.Session;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;

public abstract class FinalBalance implements JournalRule {
    private static final BigDecimal ZERO = new BigDecimal ("0.00");
    private static final Log log = 
        LogFactory.getLog (FinalMinBalance.class);

    protected abstract String getRuleName();
    protected abstract boolean isError
        (BigDecimal balance, BigDecimal paramBalance);

    public void check (GLSession session, GLTransaction txn, 
            String param, Account account, int[] offsets, short[] layers)
        throws GLException, HibernateException
    {
        List entries = txn.getEntries();
        if (entries.size() == 0 || offsets.length ==0)
            return;
        for (int i=0; i<offsets.length; i++) {
            GLEntry entry = ((GLEntry) entries.get (offsets[i]));
            if (match (entry.getLayer(), layers))
                checkBalance (session, txn, entry, param, offsets, layers);
        }
    }
    private void checkBalance 
        (GLSession session, GLTransaction txn, GLEntry entry, 
         String param, int[] offsets, short[] layers)
        throws GLException, HibernateException
    {
        Journal journal = txn.getJournal();
        Account account = entry.getAccount();
        session.lock (journal, account);

        BigDecimal balance = session.getBalance (journal, account, layers);
        BigDecimal minBalance = 
            (param != null) ?  new BigDecimal (param) : ZERO;
        BigDecimal impact = getImpact (txn, account, offsets, layers);

        if (isError (balance.add (impact), minBalance)) {
            StringBuffer sb = new StringBuffer (getRuleName());
            sb.append (" rule for account ");
            sb.append (account.getCode());
            sb.append (" failed. balance=");
            sb.append (balance);
            sb.append (", impact=");
            sb.append (impact);
            sb.append (", minimum=");
            sb.append (param);
            throw new GLException (sb.toString());
        }
    }
    private BigDecimal getImpact 
        (GLTransaction txn, Account account, int[] offsets, short[] layers)
    {
        BigDecimal impact = ZERO;
        List entries = txn.getEntries();
        
        for (int i=0; i<offsets.length; i++) {
            GLEntry entry = ((GLEntry) entries.get (offsets[i]));
            if (account.equals (entry.getAccount()) && match (entry.getLayer(), layers)) 
                impact = impact.add (entry.getImpact());
        }
        return impact;
    }
    private boolean match (short layer, short[] layers) {
        for (int i=0; i<layers.length; i++)
            if (layers[i] == layer)
                return true;
        return false;
    }
}

