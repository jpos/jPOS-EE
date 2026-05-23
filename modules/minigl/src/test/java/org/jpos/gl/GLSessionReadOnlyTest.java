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

import org.hibernate.Transaction;
import org.hibernate.stat.Statistics;
import org.jpos.ee.DB;
import org.jpos.util.Tags;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GLSessionReadOnlyTest extends TestBase {
    @Test
    public void testGetBalanceDoesNotUpdateReadOnlyAccount() throws Exception {
        DB db = new DB(configModifier);
        GLSession session = new GLSession(db, "bob");
        Statistics statistics = db.getSessionFactory().getStatistics();
        boolean statisticsEnabled = statistics.isStatisticsEnabled();
        Transaction tx = session.beginTransaction();
        try {
            Journal journal = session.getJournal("TestJournal");
            FinalAccount account = session.getFinalAccount("TestChart", "111");
            db.session().setReadOnly(account, false);
            account.setTags(new Tags("read-only-balance-test"));
            db.session().flush();
            db.session().clear();

            journal = session.getJournal("TestJournal");
            account = session.getFinalAccount("TestChart", "111");
            assertNotNull(account.getTags());
            assertTrue(db.session().isReadOnly(account));

            account.setDescription(account.getDescription() + " dirty");
            assertFalse(db.session().isDirty());

            statistics.setStatisticsEnabled(true);
            statistics.clear();

            session.getBalance(journal, account);

            assertEquals(0, statistics.getEntityUpdateCount(), "getBalance must not issue entity updates");
            assertEquals(0, statistics.getEntityInsertCount(), "getBalance must not issue entity inserts");
            assertEquals(0, statistics.getEntityDeleteCount(), "getBalance must not issue entity deletes");
        } finally {
            tx.rollback();
            statistics.setStatisticsEnabled(statisticsEnabled);
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
}
