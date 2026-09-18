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

package org.jpos.ee;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/** Fault injection for cleanup failures that a healthy database cannot reliably produce. */
class DBCleanupTest {
    @Test
    void closePreservesRollbackFailureAndStillClosesSession() {
        Session session = mock(Session.class);
        Transaction tx = mock(Transaction.class);
        when(session.getTransaction()).thenReturn(tx);
        when(tx.getStatus()).thenReturn(TransactionStatus.ACTIVE);
        RuntimeException rollbackFailure = new IllegalStateException("rollback");
        RuntimeException closeFailure = new IllegalStateException("close");
        doThrow(rollbackFailure).when(tx).rollback();
        doThrow(closeFailure).when(session).close();
        DB db = new DB(session);
        assertSame(rollbackFailure, assertThrows(RuntimeException.class, db::close));
        assertArrayEquals(new Throwable[] {closeFailure}, rollbackFailure.getSuppressed());
        assertNull(db.session());
        db.close();
        verify(session, times(1)).close();
    }

    @Test
    void closeRollsBackBeforeReturningConnection() {
        Session session = mock(Session.class);
        Transaction tx = mock(Transaction.class);
        when(session.getTransaction()).thenReturn(tx);
        when(tx.getStatus()).thenReturn(TransactionStatus.MARKED_ROLLBACK);
        new DB(session).close();
        var order = inOrder(tx, session);
        order.verify(tx).rollback();
        order.verify(session).close();
    }

    @Test
    void closeDoesNotRollBackCommittedTransaction() {
        Session session = mock(Session.class);
        Transaction tx = mock(Transaction.class);
        when(session.getTransaction()).thenReturn(tx);
        when(tx.getStatus()).thenReturn(TransactionStatus.COMMITTED);
        new DB(session).close();
        verify(tx, never()).rollback();
        verify(session).close();
    }

    @Test
    void closeFailureStillClearsSession() {
        Session session = mock(Session.class);
        Error failure = new AssertionError("close");
        doThrow(failure).when(session).close();
        DB db = new DB(session);
        assertSame(failure, assertThrows(Error.class, db::close));
        assertNull(db.session());
    }

    @Test
    void commitFailureKeepsCleanupFailuresSuppressed() throws Exception {
        RuntimeException failure = new IllegalStateException("commit");
        RuntimeException rollbackFailure = new IllegalStateException("rollback");
        RuntimeException closeFailure = new IllegalStateException("close");
        try (var construction = mockConstruction(DB.class, (db, context) -> {
            doThrow(failure).when(db).commit();
            doThrow(rollbackFailure).when(db).rollback();
            doThrow(closeFailure).when(db).close();
        })) {
            assertSame(failure, assertThrows(RuntimeException.class,
              () -> DB.execWithTransaction(db -> "result", Duration.ZERO)));
            assertArrayEquals(new Throwable[] {rollbackFailure, closeFailure}, failure.getSuppressed());
            var order = inOrder(construction.constructed().getFirst());
            order.verify(construction.constructed().getFirst()).commit();
            order.verify(construction.constructed().getFirst()).rollback();
            order.verify(construction.constructed().getFirst()).close();
        }
    }
}
