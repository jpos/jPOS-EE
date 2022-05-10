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

package org.jpos.gl.stress;

import org.jpos.gl.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import org.hibernate.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateTransactions extends TestBase {
    Random r = new Random(0); // we wan't a consistent set 
    Date POSTDATE;
    public static final BigDecimal ZERO = new BigDecimal ("0.00");
    @BeforeEach
    public void setUp () throws Exception {
        POSTDATE = Util.parseDateTime ("20050104120000");
    }
    @Test
    public void testCreateTransactions () throws Exception {
        Journal j = gls.getJournal ("TestJournal");
        for (int i=0; i<100; i++){
            Transaction tx = gls.beginTransaction();
            start ("createTransaction");
            GLTransaction txn = createTransaction (i);
            gls.post (j, txn);
            checkPoint ("post  ");
            tx.commit();
            checkPoint ("commit");
            gls.session().clear();
        }
    }
    private GLTransaction createTransaction (int n) throws Exception {
        GLTransaction txn = new GLTransaction ("Test " + n);
        txn.setPostDate (POSTDATE);
        // int numEntries = r.nextInt (10) + 1;
        int numEntries = 6;
        BigDecimal debits  = ZERO;
        BigDecimal credits = ZERO;
        FinalAccount acct;
        for (int i=0; i<numEntries; i++) {
            acct = getAccount ();
            BigDecimal amount = 
                new BigDecimal (r.nextInt (10000000)).setScale(2);
            if (r.nextInt(2) == 0) {
                 debits = debits.add (amount);
                 txn.createDebit   (acct, amount, "Test Debit " + i);
            }
            else {
                 credits = credits.add (amount);
                 txn.createCredit (acct, amount, "Test Credit " + i);
            }
        }
        if (debits.compareTo (credits) > 0) {
            acct = getAccount ();
            txn.createCredit (acct, debits.subtract (credits), "Last Credit");
        }
        else if (credits.compareTo (debits) > 0) {
            acct = getAccount ();
            txn.createDebit (acct, credits.subtract (debits), "Last Debit");
        }
        return txn;
    }
    private FinalAccount getAccount() throws Exception {
        StringBuffer sb = new StringBuffer ("23.");
        sb.append (Integer.toString (r.nextInt (10)));
        sb.append ('.');
        sb.append (Integer.toString (r.nextInt (100)));
        String s = sb.toString();
        FinalAccount acct = gls.getFinalAccount ("TestChart", sb.toString()); 
        return acct;
    }
}

