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

import java.util.Date;
import java.math.BigDecimal;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;

public class RulesTest extends TestBase {
    Journal journal;
    Account chart;
    FinalAccount cashUS;
    FinalAccount cashPesos;
    FinalAccount bank;
    FinalAccount loan;
    FinalAccount bobEquity;

    public void setUp () throws Exception {
        super.setUp();
        journal   = gls.getJournal ("TestJournal");
        chart     = gls.getChart ("TestChart");
        cashUS    = gls.getFinalAccount (chart, "111");
        cashPesos = gls.getFinalAccount (chart, "112");
        bank      = gls.getFinalAccount (chart, "113");
        loan      = gls.getFinalAccount (chart, "21");
        bobEquity = gls.getFinalAccount (chart, "31");
    }
    public void testSimplePost () throws Exception {
        BigDecimal amount      = new BigDecimal ("5.00");
        GLTransaction txn = 
            createTransaction ("Check ability to post", 
                    cashUS, amount, cashPesos, amount, (short) 0);

        Transaction tx = gls.beginTransaction();
        gls.post (journal, txn);
        tx.commit();
    }
    public void testUnbalancedPost () throws Exception {
        GLTransaction txn = 
            createTransaction (
                "Unbalanced transaction", 
                cashUS, new BigDecimal ("5.00"),
                cashPesos, new BigDecimal ("5.01"), (short) 0
            );
        Transaction tx = gls.beginTransaction();
        try {
            gls.post (journal, txn);
            tx.commit();
        } catch (GLException e) {
            assertEquals (
                "Transaction does not balance. debits=5.00, credits=5.01", 
                e.getMessage()
            );
            tx.rollback();
            return;
        }
        fail ("GLException should have been raised");
    }
    public void testFinalMinBalance () throws Exception {
        BigDecimal amount      = new BigDecimal ("4996.00");
        GLTransaction txn = 
            createTransaction (
                "check MinBalance rule", cashUS, amount, 
                cashPesos, amount, (short) 0
            );
        Transaction tx = gls.beginTransaction();
        try {
            gls.post (journal, txn);
            tx.commit();
        } catch (GLException e) {
            tx.rollback();
            if (!e.getMessage().startsWith (
                    "FinalMinBalance rule for account 112 failed"))
            {
                fail ("Unexpected GLException " + e.getMessage());
            }
            return;
        }
        fail ("GLException should have been raised");
    }
    public void testFinalMinBalanceInLayerOne () throws Exception {
        BigDecimal amount      = new BigDecimal ("4996.00");
        GLTransaction txn = 
            createTransaction (
                "check MinBalance rule", cashUS, amount,
                cashPesos, amount, (short) 1
            );
        Transaction tx = gls.beginTransaction();
        try {
            gls.post (journal, txn);
            tx.commit();
        } catch (GLException e) {
            tx.rollback();
            if (!e.getMessage().startsWith (
                    "FinalMinBalance rule for account 112 failed"))
            {
                fail ("Unexpected GLException " + e.getMessage());
            }
            return;
        }
        fail ("GLException should have been raised");
    }

    public void testCompositeMinBalance () throws Exception {
        BigDecimal amount = new BigDecimal ("5001.00");
        GLTransaction txn = 
            createTransaction (
                "check parent MinBalance rule", 
                    loan, amount, 
                    bank, amount, 
                    (short) 0
            );
        Transaction tx = gls.beginTransaction();
        try {
            gls.post (journal, txn);
            tx.commit();
        } catch (GLException e) {
            tx.rollback();
            if (!e.getMessage().startsWith (
                    "CompositeMinBalance rule for account 11 failed"))
            {
                fail ("Unexpected GLException " + e.getMessage());
            }
            return;
        }
        fail ("GLException should have been raised");
    }

    public void testCompositeMaxBalance () throws Exception {
        BigDecimal amount = new BigDecimal ("1000000.00");
        GLTransaction txn = 
            createTransaction (
                "check parent MaxBalance rule", 
                    bank, amount, 
                    loan, amount, 
                    (short) 0
            );
        Transaction tx = gls.beginTransaction();
        try {
            gls.post (journal, txn);
            tx.commit();
        } catch (GLException e) {
            tx.rollback();
            if (!e.getMessage().startsWith (
                    "CompositeMaxBalance rule for account 1 failed"))
            {
                fail ("Unexpected GLException " + e.getMessage());
            }
            return;
        }
        fail ("GLException should have been raised");
    }
    public void testFinalMaxBalance () throws Exception {
        BigDecimal amount = new BigDecimal ("100000.00");
        GLTransaction txn = 
            createTransaction (
                "check parent MaxBalance rule", 
                    cashUS, amount, 
                    bobEquity, amount, 
                    (short) 0
            );
        Transaction tx = gls.beginTransaction();
        try {
            gls.post (journal, txn);
            tx.commit();
        } catch (GLException e) {
            tx.rollback();
            if (!e.getMessage().startsWith (
                    "FinalMaxBalance rule for account 31 failed"))
            {
                fail ("Unexpected GLException " + e.getMessage());
            }
            return;
        }
        fail ("GLException should have been raised");
    }

    private GLTransaction createTransaction 
        (String detail, 
         FinalAccount debitAccount, BigDecimal debitAmount, 
         FinalAccount creditAccount, BigDecimal creditAmount, short layer) 
        throws GLException, HibernateException
    {
        GLTransaction txn  = new GLTransaction (detail);
        txn.setPostDate  (new Date());
        txn.createDebit  (debitAccount, debitAmount, null, layer);
        txn.createCredit (creditAccount, creditAmount, null, layer);
        return txn;
    }
}

