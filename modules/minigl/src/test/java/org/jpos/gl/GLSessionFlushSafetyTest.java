/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

import org.hibernate.FlushMode;
import org.hibernate.Transaction;
import org.hibernate.stat.Statistics;
import org.jpos.ee.DB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GLSessionFlushSafetyTest extends TestBase {
    @Test
    public void testGetJournalRemainsMutable() throws Exception {
        DB db = new DB(configModifier);
        GLSession session = new GLSession(db, "bob");
        Transaction tx = session.beginTransaction();
        Date lockDate = Util.parseDate("20050131");
        try {
            Journal journal = session.getJournal("TestJournal");
            session.setLockDate(journal, lockDate);
            db.session().flush();
            db.session().clear();

            journal = session.getJournal("TestJournal");
            assertEquals(lockDate, journal.getLockDate());

            session.setLockDate(journal, null);
            db.session().flush();
        } finally {
            tx.rollback();
            session.close();
        }
    }

    @Test
    public void testGetBalanceSeesPendingPostInSameSession() throws Exception {
        DB db = new DB(configModifier);
        GLSession session = new GLSession(db, "bob");
        Transaction tx = session.beginTransaction();
        try {
            Journal journal = session.getJournal("TestJournal");
            FinalAccount debitAccount = session.getFinalAccount("TestChart", "111");
            FinalAccount creditAccount = session.getFinalAccount("TestChart", "31");
            BigDecimal amount = new BigDecimal("123.45");
            BigDecimal originalBalance = session.getBalance(journal, debitAccount);

            GLTransaction txn = new GLTransaction("same session balance test");
            txn.createDebit(debitAccount, amount, null);
            txn.createCredit(creditAccount, amount, null);
            session.post(journal, txn);

            assertEquals(originalBalance.add(amount), session.getBalance(journal, debitAccount));
        } finally {
            tx.rollback();
            session.close();
        }
    }

    @Test
    public void testGetFinalAccountRemainsMutable() throws Exception {
        DB db = new DB(configModifier);
        GLSession session = new GLSession(db, "bob");
        Statistics statistics = db.getSessionFactory().getStatistics();
        boolean statisticsEnabled = statistics.isStatisticsEnabled();
        Transaction tx = session.beginTransaction();
        try {
            FinalAccount account = session.getFinalAccount("TestChart", "111");
            String originalDescription = account.getDescription();
            String updatedDescription = originalDescription + " updated";
            statistics.setStatisticsEnabled(true);
            statistics.clear();

            // Regression guard: get* methods must not return read-only entities.
            account.setDescription(updatedDescription);
            db.session().flush();
            assertEquals(1, statistics.getEntityUpdateCount());
            db.session().clear();

            account = session.getFinalAccount("TestChart", "111");
            assertEquals(updatedDescription, account.getDescription());

            account.setDescription(originalDescription);
            db.session().flush();
        } finally {
            tx.rollback();
            statistics.setStatisticsEnabled(statisticsEnabled);
            session.close();
        }
    }

    @Test
    public void testGetBalanceRestoresFlushMode() throws Exception {
        DB db = new DB(configModifier);
        GLSession session = new GLSession(db, "bob");
        Transaction tx = session.beginTransaction();
        try {
            FlushMode original = db.session().getHibernateFlushMode();
            db.session().setHibernateFlushMode(FlushMode.COMMIT);

            Journal journal = session.getJournal("TestJournal");
            FinalAccount account = session.getFinalAccount("TestChart", "111");
            session.getBalance(journal, account);

            assertEquals(FlushMode.COMMIT, db.session().getHibernateFlushMode());
            db.session().setHibernateFlushMode(original);
        } finally {
            tx.rollback();
            session.close();
        }
    }

}
