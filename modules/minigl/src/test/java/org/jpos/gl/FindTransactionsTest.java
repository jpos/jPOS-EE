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

import java.util.List;
import java.util.Date;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;

public class FindTransactionsTest extends TestBase {
    Journal tj;

    public void setUp () throws Exception {
        super.setUp();
        tj = gls.getJournal ("TestJournal");
    }
    public void testFindTransactions () throws Exception {
        List l = gls.findTransactions (tj, null, null, null, true);
        assertEquals ("List size should be 8", 8, l.size());
    }
    public void testFindTransactionsByPostDate_Day01 () throws Exception {
        Date d = Util.parseDate ("20050101");
        List l = gls.findTransactions (tj, null, d, null, true);
        assertEquals ("List size for " + d + " should be 2", 2, l.size());
    }
    public void testFindTransactionsByPostDate_Day02 () throws Exception {
        Date d = Util.parseDate ("20050102");
        List l = gls.findTransactions (tj, d, d, null, true);
        assertEquals ("List size for " + d + " should be 2", 2, l.size());
    }
    public void testFindTransactionsByPostDate_Day01_and_02 () throws Exception {
        Date d1 = Util.parseDate ("20050101");
        Date d2 = Util.parseDate ("20050102");
        List l = gls.findTransactions (tj, d1, d2, null, true);
        assertEquals ("List size for " + d1 + " to " + d2 + " should be 4", 4, l.size());
    }
    /*
     * datetime changes from test to test
     *
    public void testFindTransactionsByDateTime () throws Exception {
        Date d = Util.parseDateTime ("20061018210655");
        List l = gls.findTransactions (tj, d, d, false);
        assertEquals ("List size for " + d + " should be 2", 2, l.size());
    }
    */
}

