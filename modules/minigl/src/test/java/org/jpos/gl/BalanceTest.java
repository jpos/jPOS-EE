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

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.Transaction;
import org.jpos.gl.tools.Export;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BalanceTest extends TestBase {
    Journal tj;
    Account root;
    FinalAccount cashUS;
    Account cashPesos;
    Account bobEquity;
    Account aliceEquity;
    Account assets;
    Account equity;
    Account tripFund;

    @BeforeEach
    public void setUp () throws Exception {
        gls.overrideSafeWindow(0L);
        tj = gls.getJournal ("TestJournal");
        cashUS      = gls.getFinalAccount ("TestChart", "111");
        cashPesos   = gls.getAccount ("TestChart", "112");
        bobEquity   = gls.getAccount ("TestChart", "31");
        aliceEquity = gls.getAccount ("TestChart", "32");
        assets      = gls.getAccount ("TestChart", "1");
        equity      = gls.getAccount ("TestChart", "3");
        tripFund    = gls.getAccount ("TestChart", "114");
        root        = assets.getRoot();
    }
    @Test
    @Order(1)
    public void testCurrentBalances() throws Exception {
        checkCurrentBalances();
    }
    @Test
    @Order(2)
    public void testBalancesByPostDate() throws Exception {
        checkBalancesByPostDate();
    }
    @Test
    @Order(3)
    public void testCheckpoints() throws Exception {
        final Transaction tx1 = gls.beginTransaction();
        gls.createCheckpoint (tj, root, Util.parseDate ("20041231"), 1);
        gls.createCheckpoint (tj, root, Util.parseDate ("20050101"), 1);
        gls.createCheckpoint (tj, root, Util.parseDate ("20050102"), 1);
        tx1.commit();
    }
    @Test
    @Order(4)
    public void testBalancesAfterCheckpoint() throws Exception {
        checkBalancesByPostDate();
    }
    @Test
    @Order(5)
    public void testBalanceCache() throws Exception {
        final Transaction tx1 = gls.beginTransaction();
        gls.createBalanceCache (tj, root, GLSession.LAYER_ZERO);
        gls.createBalanceCache (tj, root, new short[] { 858 });
        tx1.commit ();
    }
    @Test
    @Order(6)
    public void testBalanceCache2() throws Exception {
        // create a second set of cache, should erase first one
        final Transaction tx1 = gls.beginTransaction();
        gls.createBalanceCache (tj, root, GLSession.LAYER_ZERO);
        gls.createBalanceCache (tj, root, new short[] { 858 });
        tx1.commit ();
    }

    @Test
    @Order(7)
    public void testCachedBalances() throws Exception {
        checkCurrentBalances();
    }
    @Test
    @Order(8)
    public void testDeleteCache() throws Exception {
        final Transaction tx1 = gls.beginTransaction();
        gls.deleteBalanceCache (tj, cashUS, GLSession.LAYER_ZERO);       
        tx1.commit ();

    }
    @Test
    @Order(9)
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
    @Test
    @Order(10)
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

    @Test
    @Order(11)
    public void testMiniStatementCashPesos() throws Exception {
        AccountDetail detail = gls.getMiniStatement (
                tj, cashPesos,
                new short[] { 858 }, 1
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
    }

    @Test
    @Order(12)
    public void testGLTransactionImpact() {
        GLTransaction t = new GLTransaction("Test transaction");
        t.createDebit (cashUS, new BigDecimal("1000.00") , null, (short) 840);
        t.createCredit(cashUS, new BigDecimal("100.00"), null, (short) 1840);
        assertEquals(new BigDecimal("900.00"), t.getImpact(cashUS, new short[] { 840, 1840 }));
        assertEquals(new BigDecimal("1000.00"), t.getImpact(cashUS, new short[] { 840 }));
        assertEquals(new BigDecimal("-100.00"), t.getImpact(cashUS, new short[] { 1840 }));
    }

    // formerly FindTransactionsTest
    @Test
    @Order(20)
    public void testFindTransactions () throws Exception {
        List l = gls.findTransactions (tj, null, null, null, true);
        assertEquals (4, l.size(), "List size should be 4");
    }
    @Test
    @Order(21)
    public void testFindTransactionsByPostDate_Day01 () throws Exception {
        Date d = Util.parseDate ("20050101");
        List l = gls.findTransactions (tj, null, d, null, true);
        assertEquals (2, l.size(), "List size for " + d + " should be 2");
    }
    @Test
    @Order(22)
    public void testFindTransactionsByPostDate_Day02 () throws Exception {
        Date d = Util.parseDate ("20050102");
        List l = gls.findTransactions (tj, d, d, null, true);
        assertEquals (2, l.size(), "List size for " + d + " should be 2");
    }
    @Test
    @Order(23)
    public void testFindTransactionsByPostDate_Day01_and_02 () throws Exception {
        Date d1 = Util.parseDate ("20050101");
        Date d2 = Util.parseDate ("20050102");
        List l = gls.findTransactions (tj, d1, d2, null, true);
        assertEquals (4, l.size(), "List size for " + d1 + " to " + d2 + " should be 4");
    }

    @Test
    @Order(24)
    public void testMinBalance() throws Exception {
        assertEquals (new BigDecimal("0.00"), gls.getBalance(tj, tripFund, new short[] { 0 }));
        assertEquals (new BigDecimal("2000.00"), gls.getBalance(tj, tripFund, new short[] { 1 }));
        assertEquals (new BigDecimal("-50000.00"), gls.getBalance(tj, tripFund, new short[] { 2 }));

        assertEquals (new BigDecimal("0.00"), gls.getMinBalance(tj, tripFund, new short[] { 0 }));
        assertEquals (new BigDecimal("2000.00"), gls.getMinBalance(tj, tripFund, new short[] { 1 }));
        assertEquals (new BigDecimal("-50000.00"), gls.getMinBalance(tj, tripFund, new short[] { 2 }));

        assertEquals (new BigDecimal("0.00"), gls.getMinBalance(tj, tripFund, new short[] { 0 }, new short[] { 1 }));
        assertEquals (new BigDecimal("-50000.00"), gls.getMinBalance(tj, tripFund, new short[] { 1 }, new short[] { 2 }));
        assertEquals (new BigDecimal("2000.00"), gls.getMinBalance(tj, tripFund, new short[] { 0,1 }));
        assertEquals (new BigDecimal("0.00"), gls.getMinBalance(tj, tripFund, new short[] { 0,1 }, new short[] { 0 }));
        assertEquals (new BigDecimal("-50000.00"), gls.getMinBalance(tj, tripFund, new short[] { 0,1 }, new short[] { 0,2 }));
        assertEquals (new BigDecimal("-50000.00"), gls.getMinBalance(tj, tripFund, new short[] { 0 }, new short[] { 0,1 }, new short[] { 0,2 }));
        assertEquals (new BigDecimal("-48000.00"), gls.getMinBalance(tj, tripFund, new short[] { 0,1 }, new short[] { 1,2 }));
    }

    @Test
    @Order(25)
    public void testMaxBalance() throws Exception {
        assertEquals (new BigDecimal("0.00"), gls.getMaxBalance(tj, tripFund, new short[] { 0 }));
        assertEquals (new BigDecimal("2000.00"), gls.getMaxBalance(tj, tripFund, new short[] { 1 }));
        assertEquals (new BigDecimal("-50000.00"), gls.getMaxBalance(tj, tripFund, new short[] { 2 }));

        assertEquals (new BigDecimal("2000.00"), gls.getMaxBalance(tj, tripFund, new short[] { 0 }, new short[] { 1 }));
        assertEquals (new BigDecimal("2000.00"), gls.getMaxBalance(tj, tripFund, new short[] { 1 }, new short[] { 2 }));
        assertEquals (new BigDecimal("2000.00"), gls.getMaxBalance(tj, tripFund, new short[] { 0,1 }));
        assertEquals (new BigDecimal("2000.00"), gls.getMaxBalance(tj, tripFund, new short[] { 0,1 }, new short[] { 0 }));
        assertEquals (new BigDecimal("2000.00"), gls.getMaxBalance(tj, tripFund, new short[] { 0,1 }, new short[] { 0,2 }));
        assertEquals (new BigDecimal("2000.00"), gls.getMaxBalance(tj, tripFund, new short[] { 0,1 }, new short[] { 1,2 }));
        assertEquals (new BigDecimal("0.00"), gls.getMaxBalance(tj, tripFund, new short[] { 0,2 }, new short[] { 0 }));
    }

    // Formerly SummarizeTest
    @Test
    @Order(30)
    public void testSummarize () throws Exception {
        tj = gls.getJournal ("TestJournal");
        Date postDate = Util.parseDateTime ("20050103120000");
        FinalAccount A = gls.getFinalAccount ("TestChart", "111");
        FinalAccount B = gls.getFinalAccount ("TestChart", "112");
        // Create Transaction to be summarized
        Transaction tx = gls.beginTransaction();
        gls.post (tj, createTransaction ("Txn 1", postDate, A, B));
        gls.post (tj, createTransaction ("Txn 2", postDate, A, B));
        tx.commit();

        // Fetch the balances
        BigDecimal A_0   = gls.getBalance (tj, A);
        BigDecimal A_858 = gls.getBalance (tj, A, (short) 858);
        BigDecimal B_0   = gls.getBalance (tj, B);
        BigDecimal B_858 = gls.getBalance (tj, B, (short) 858);
        System.out.println ("--- pre-balances --- ");
        System.out.println ("  A(0): " + A_0);
        System.out.println ("A(858): " + A_858);
        System.out.println ("  B(0): " + B_0);
        System.out.println ("B(858): " + B_858);

        // Summarize
        tx = gls.beginTransaction();
        gls.summarize (tj, postDate, postDate, "Summarized Txn", new short[] { 0, 858 });
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
    private GLTransaction createTransaction (String desc, Date postDate, FinalAccount A, FinalAccount B) throws Exception {
        GLTransaction txn = new GLTransaction (desc);
        txn.setPostDate (postDate);
        txn.createDebit (A, new BigDecimal ("1000.00"), null);
        txn.createDebit (A, new BigDecimal ("200.00"), null, (short) 858);
        txn.createCredit (B, new BigDecimal ("1000.00"), null);
        // txn.createCredit (B, new BigDecimal ("200.00"), null, (short) 858);
        return txn;
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
        short[] zeroOnly = {0};
        assertEquals (
                new BigDecimal("25000.00"),
                gls.getBalancesORM (tj, cashUS, Util.parseDate ("20050102"), true, zeroOnly, 0)[0]
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

