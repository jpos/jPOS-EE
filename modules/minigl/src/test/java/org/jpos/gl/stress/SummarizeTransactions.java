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

package org.jpos.gl.stress;

import org.jpos.gl.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import org.hibernate.Transaction;

public class SummarizeTransactions extends TestBase {
    public void testSummarize() throws Exception {
        Date POSTDATE = Util.parseDateTime ("20050104120000");
        Journal tj = gls.getJournal ("TestJournal");
        System.out.println ("Creating summarized Transaction");
        Transaction tx = gls.beginTransaction();
        gls.summarize (tj, POSTDATE, POSTDATE, "Summarized Stress Txn", new short[] { 0 });
        tx.commit();
    }
}

