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

import java.util.List;
import java.util.Iterator;
import java.math.BigDecimal;
import org.jpos.gl.JournalRule;
import org.jpos.gl.Account;
import org.jpos.gl.GLSession;
import org.jpos.gl.GLException;
import org.jpos.gl.GLEntry;
import org.jpos.gl.GLTransaction;

/**
 * Verify that debits equals credits.
 *
 * This rule check the following conditions:
 * <ul>
 *  <li>This {@link GLTransaction} has two or more {@link GLEntry}s.</li>
 *  <li>Debits equals Credits (in the reporting currency).</li>
 * </ul>
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 * @see org.jpos.gl.JournalRule
 * @see org.jpos.gl.RuleInfo
 */
public class DoubleEntry implements JournalRule {
    private static final BigDecimal ZERO = new BigDecimal ("0.00");

    public void check (GLSession session, GLTransaction txn, 
            String param, Account account, int[] entryOffsets, short[] layers)
        throws GLException
    {
        for (int i=0; i<layers.length; i++) 
            checkEntries (txn, layers[i]);
    }

    private void checkEntries (GLTransaction txn, short layer) 
        throws GLException
    {
        List list = txn.getEntries();
        // if (list.size() < 2) 
        //     throw new GLException ("too few entries (" + list.size() + ")");
        BigDecimal debits  = ZERO;
        BigDecimal credits = ZERO;
        Iterator iter = list.iterator();

        while (iter.hasNext()) {
            GLEntry entry = (GLEntry) iter.next();
            if (entry.getLayer() == layer) {
                if (entry.isDebit ())
                    debits = debits.add (entry.getAmount());
                else
                    credits = credits.add (entry.getAmount());
            }
        }
        if (!debits.equals (credits)) {
            throw new GLException (
                "Transaction (" + txn.getDetail() + ") does not balance. debits="+debits.toString() +
                ", credits=" + credits.toString() + " (layer=" + layer + ")"
            );
        }
    }
}
