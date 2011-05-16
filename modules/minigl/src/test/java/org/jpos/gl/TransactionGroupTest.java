/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2011 Alejandro P. Revilla
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

import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TransactionGroupTest extends TestBase {
    Journal tj;

    public void setUp () throws Exception {
        super.setUp();
        tj = gls.getJournal ("TestJournal");
    }
    public void testCreateTransactionGroup () throws Exception {
        Date d = Util.parseDate ("20050101");
        Transaction tx = gls.beginTransaction();
        List l = gls.findTransactions (tj, null, d, null, true);
        assertEquals ("List size for " + d + " should be 2", 2, l.size());
        gls.createGroup("Day01", l);
        tx.commit();
    }
    public void testFindTransactionsGroup () throws Exception {
        GLTransactionGroup group = gls.findTransactionGroup("Day01");
        assertNotNull("group should not be null", group);
        assertEquals("Day01 group ID should be 1", 1L, group.getId());
    }
    public void testGetBalance() throws Exception {
        GLTransactionGroup group = gls.findTransactionGroup("Day01");
        Account cashUS = gls.getAccount ("TestChart", "111");
        BigDecimal balance = gls.getBalance(tj, cashUS, group, GLSession.LAYER_ZERO);
        assertEquals ("Balance should be 15000.00",  new BigDecimal("15000.00"), balance);
    }
}
