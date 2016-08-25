/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

public class MoveTest extends TestBase {
    public void testMove () throws Exception {
        Journal j = gls.getJournal ("TestJournal");
        Journal h = gls.getJournal ("HistoryJournal");
        Transaction tx = gls.beginTransaction();
        GLTransaction txn = createTransaction ("Test Move");
        gls.post (j, txn);
        tx.commit();

        FinalAccount cashUS = gls.getFinalAccount ("TestChart", "111");
        BigDecimal balance_j = gls.getBalance (j, cashUS);
        BigDecimal balance_h = gls.getBalance (h, cashUS);
        BigDecimal amount = new BigDecimal ("1000.00");
        tx = gls.beginTransaction();
        gls.move (txn, h);
        tx.commit();

        assertEquals (
            balance_j.subtract(amount), gls.getBalance (j, cashUS)
        );
        assertEquals (
            balance_h.add(amount), gls.getBalance (h, cashUS)
        );
    }
    private GLTransaction createTransaction (String desc) throws Exception {
        GLTransaction txn = new GLTransaction (desc);
        txn.setPostDate (new Date());
        txn.createDebit (
            gls.getFinalAccount ("TestChart", "111"),
            new BigDecimal ("1000.00"), null
        );
        txn.createCredit (
            gls.getFinalAccount ("TestChart", "112"),
            new BigDecimal ("1000.00"), null
        );
        return txn;
    }
}

