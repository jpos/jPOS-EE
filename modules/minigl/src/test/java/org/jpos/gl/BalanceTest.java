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
import org.hibernate.Transaction;

public class BalanceTest extends TestBase {
    Journal tj;
    Account root;
    Account cashUS;
    Account cashPesos;
    Account bobEquity;
    Account aliceEquity;
    Account assets;
    Account equity;

    public void setUp () throws Exception {
        super.setUp();
        tj = gls.getJournal ("TestJournal");
        cashUS      = gls.getAccount ("TestChart", "111");
        cashPesos   = gls.getAccount ("TestChart", "112");
        bobEquity   = gls.getAccount ("TestChart", "31");
        aliceEquity = gls.getAccount ("TestChart", "32");
        assets      = gls.getAccount ("TestChart", "1");
        equity      = gls.getAccount ("TestChart", "3");
        root        = assets.getRoot();
    }
    public void testCurrentBalances() throws Exception {
        checkCurrentBalances();
    }
    public void testBalancesByPostDate() throws Exception {
        checkBalancesByPostDate();
    }
    public void testCheckpoints() throws Exception {
        gls.createCheckpoint (tj, root, Util.parseDate ("20041231"), 1);
        gls.createCheckpoint (tj, root, Util.parseDate ("20050101"), 1);
        gls.createCheckpoint (tj, root, Util.parseDate ("20050102"), 1);
    }
    public void testBalancesAfterCheckpoint() throws Exception {
        checkBalancesByPostDate();
    }
    public void testBalanceCache() throws Exception {
        final Transaction tx1 = gls.beginTransaction();
        gls.createBalanceCache (tj, root, GLSession.LAYER_ZERO, 10);
        gls.createBalanceCache (tj, root, new short[] { 858 }, 10);
        tx1.commit ();
    }
    public void testBalanceCache2() throws Exception {
        // create a second set of cache, should erase first one
        final Transaction tx1 = gls.beginTransaction();
        gls.createBalanceCache (tj, root, GLSession.LAYER_ZERO);
        gls.createBalanceCache (tj, root, new short[] { 858 });
        tx1.commit ();
    }

    public void testCachedBalances() throws Exception {
        checkCurrentBalances();
    }
    public void testDeleteCache() throws Exception {
        final Transaction tx1 = gls.beginTransaction();
        gls.deleteBalanceCache (tj, cashUS, GLSession.LAYER_ZERO);       
        tx1.commit ();

    }
    public void testAccountDetailCashUS() throws Exception {
        AccountDetail detail = gls.getAccountDetail (
            tj, cashUS, 
            Util.parseDate ("20050101"),
            Util.parseDate ("20050131"),
            new short[] { 0 }
        );
        assertEquals (3, detail.size());
        assertEquals (
            new BigDecimal("0.00"),
            detail.getInitialBalance()
        );
        assertEquals (
            new BigDecimal("25000.00"),
            detail.getFinalBalance()
        );
    }
    public void testAccountDetailCashPesos() throws Exception {
        AccountDetail detail = gls.getAccountDetail (
            tj, cashPesos, 
            Util.parseDate ("20050101"),
            Util.parseDate ("20050131"),
            new short[] { 858 }
        );
        assertEquals (1, detail.size());
        assertEquals (
            new BigDecimal("0.00"),
            detail.getInitialBalance()
        );
        assertEquals (
            new BigDecimal("12500.00"),
            detail.getFinalBalance()
        );
        detail = gls.getAccountDetail (
            tj, cashPesos, 
            Util.parseDate ("20050101"),
            Util.parseDate ("20050131"),
            new short[] { 0 }
        );
        assertEquals (
            new BigDecimal("5000.00"),
            detail.getFinalBalance()
        );
    }

    // -----------------------------------------------------------------
    private void checkBalancesByPostDate () throws Exception {
        assertEquals (
            new BigDecimal("0.00"),
            gls.getBalance (tj, cashUS, Util.parseDate ("20041231"))
        );
        assertEquals (
            new BigDecimal("15000.00"),
            gls.getBalance (tj, cashUS, Util.parseDate ("20050101"))
        );
        assertEquals (
            new BigDecimal("25000.00"),
            gls.getBalance (tj, cashUS, Util.parseDate ("20050102"))
        );
        assertEquals (
            new BigDecimal("12500.00"),
            gls.getBalance (tj, cashPesos, Util.parseDate ("20050101"), (short) 858)
        );
        assertEquals (
            new BigDecimal("0.00"),
            gls.getBalance (tj, cashPesos, Util.parseDate ("20041231"), (short) 858)
        );

        // root account has to be always 0.00
        assertEquals (
            new BigDecimal("0.00"),
            gls.getBalance (tj, root, Util.parseDate ("20050102"))
        );
        assertEquals (
            new BigDecimal("0.00"),
            gls.getBalance (tj, root, Util.parseDate ("20050101"))
        );
        assertEquals (
            new BigDecimal("0.00"),
            gls.getBalance (tj, root, Util.parseDate ("20041231"))
        );
    }
    private void checkCurrentBalances() throws Exception {
        assertEquals (
            new BigDecimal ("25000.00"),
            gls.getBalance (tj, cashUS)
        );
        assertEquals (
            new BigDecimal("5000.00"),
            gls.getBalance (tj, cashPesos)
        );
        assertEquals (
            new BigDecimal("12500.00"),
            gls.getBalance (tj, cashPesos, (short) 858)
        );
        assertEquals (
            new BigDecimal("20000.00"),
            gls.getBalance (tj, bobEquity)
        );
        assertEquals (
            new BigDecimal("10000.00"),
            gls.getBalance (tj, aliceEquity)
        );
        assertEquals (
            new BigDecimal("50000.00"),
            gls.getBalance (tj, assets)
        );
        assertEquals (
            new BigDecimal("30000.00"),
            gls.getBalance (tj, equity)
        );
        assertEquals (
            new BigDecimal("0.00"),
            gls.getBalance (tj, root)
        );
    }
}

