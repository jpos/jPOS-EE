/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2012 Alejandro P. Revilla
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

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import org.hibernate.Transaction;

public class SummarizeTest extends TestBase {
    Journal tj;
    FinalAccount A;
    FinalAccount B;
    Date POSTDATE;
    BigDecimal A_0, A_858;  // A = account 111
    BigDecimal B_0, B_858;  // B = account 112
    public void setUp () throws Exception {
        super.setUp();
        tj = gls.getJournal ("TestJournal");
        POSTDATE = Util.parseDateTime ("20050103120000");
        A = gls.getFinalAccount ("TestChart", "111");
        B = gls.getFinalAccount ("TestChart", "112");
    }
    public void testSummarize () throws Exception {
        // Create Transaction to be summarized
        Transaction tx = gls.beginTransaction();
        gls.post (tj, createTransaction ("Txn 1"));
        gls.post (tj, createTransaction ("Txn 2"));
        tx.commit();

        // Fetch the balances
        A_0   = gls.getBalance (tj, A); 
        A_858 = gls.getBalance (tj, A, (short) 858);
        B_0   = gls.getBalance (tj, B);
        B_858 = gls.getBalance (tj, B, (short) 858);
        System.out.println ("--- pre-balances --- ");
        System.out.println ("  A(0): " + A_0);
        System.out.println ("A(858): " + A_858);
        System.out.println ("  B(0): " + B_0);
        System.out.println ("B(858): " + B_858);

        // Summarize
        tx = gls.beginTransaction();
        gls.summarize (tj, POSTDATE, POSTDATE, "Summarized Txn", new short[] { 0, 858 });
        tx.commit();

        // Test post summarize balances
        System.out.println ("--- post-balances ---");
        System.out.println ("  A(0): " + gls.getBalance (tj, A));
        System.out.println ("A(858): " + gls.getBalance (tj, A, (short) 858));
        System.out.println ("  B(0): " + gls.getBalance (tj, B));
        System.out.println ("B(858): " + gls.getBalance (tj, B, (short) 858));

        assertEquals (A_0, gls.getBalance (tj, A));
        assertEquals (A_858, gls.getBalance (tj, A, (short) 858));
        assertEquals (B_0, gls.getBalance (tj, B));
        assertEquals (B_858, gls.getBalance (tj, B, (short) 858));
    }
    private GLTransaction createTransaction (String desc) throws Exception {
        GLTransaction txn = new GLTransaction (desc);
        txn.setPostDate (POSTDATE);
        txn.createDebit (A, new BigDecimal ("1000.00"), null);
        txn.createDebit (A, new BigDecimal ("200.00"), null, (short) 858);
        txn.createCredit (B, new BigDecimal ("1000.00"), null);
        // txn.createCredit (B, new BigDecimal ("200.00"), null, (short) 858);
        return txn;
    }
}

