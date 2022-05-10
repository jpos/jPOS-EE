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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.hibernate.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TransactionGroupTest extends TestBase {
    Journal tj;

    @BeforeEach
    public void setUp () throws Exception {
        tj = gls.getJournal ("TestJournal");
    }
    @Test
    public void testCreateTransactionGroupAndGetBalance () throws Exception {
        Date d = Util.parseDate ("20050101");
        Transaction tx = gls.beginTransaction();
        List<GLTransaction> l = gls.findTransactions (tj, null, d, null, true);
        assertEquals (2, l.size(), "List size for " + d + " should be 2");
        gls.createGroup("Day01", l);
        tx.commit();
        GLTransactionGroup group = gls.findTransactionGroup("Day01");
        assertNotNull(group, "group should not be null");
        //assertEquals(1L, group.getId(), "Day01 group ID should be 1");

        GLTransactionGroup group2 = gls.findTransactionGroup("Day01");
        Account cashUS = gls.getAccount ("TestChart", "111");
        BigDecimal balance = gls.getBalance(tj, cashUS, group2, GLSession.LAYER_ZERO);
        assertEquals (new BigDecimal("15000.00"), balance, "Balance should be 15000.00");
    }
}
