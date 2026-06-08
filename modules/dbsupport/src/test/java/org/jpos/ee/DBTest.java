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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.hibernate.Session;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Semaphore;

/**
 * Unit tests for the session-injection constructor in {@link DB}.
 * <p>
 * <h2>Background</h2>
 * Before {@code DB(Session)} existed, every constructor triggered real
 * Hibernate bootstrapping — loading {@code hibernate.cfg.xml}, building
 * {@code Metadata}, and creating a {@code SessionFactory}.  There was no
 * way to create a {@code DB} instance without a real database.  Testing
 * DAOs/Managers required Testcontainers and a live PostgreSQL instance.
 * <p>
 * The new constructor {@code DB(Session)} bypasses all of that.  The
 * caller provides a ready-to-use {@link Session} (real or mock), and
 * every operation on {@code DB} delegates to it directly.  No
 * {@code SessionFactory} is created, no config files are loaded.
 * <p>
 * <h2>What gets tested</h2>
 * These tests verify that a {@code DB} backed by a mock {@code Session}
 * correctly:
 * <ul>
 *   <li>stores and returns the injected session</li>
 *   <li>rejects null with a clear error</li>
 *   <li>delegates {@code open()}, {@code save()}, {@code close()}, etc.
 *       to the mock without calling {@code getSessionFactory()}</li>
 *   <li>applies the same guard logic as production for
 *       {@code commit()}, {@code rollback()}, and transaction timeout</li>
 *   <li>throws {@code IllegalStateException} from
 *       {@code getSessionFactory()} with a descriptive message</li>
 * </ul>
 * <p>
 * <h2>Transaction model in DB</h2>
 * {@code DB} has two {@code beginTransaction} overloads:
 * <dl>
 *   <dt>{@code beginTransaction()} (no-arg)</dt>
 *   <dd>Calls {@code session.beginTransaction()} — Hibernate creates and
 *       begins a new {@code Transaction} in one step.  This is the
 *       common case.</dd>
 *   <dt>{@code beginTransaction(int timeout)}</dt>
 *   <dd>Calls {@code session.getTransaction()} (note: NOT
 *       {@code beginTransaction()}) to obtain or create the
 *       {@code Transaction} object, then calls {@code tx.setTimeout(n)}
 *       and {@code tx.begin()} separately.  Using
 *       {@code getTransaction()} returns the already-active transaction
 *       if one exists, so this overload can be called on a session that
 *       already has a transaction in progress.</dd>
 * </dl>
 * <p>
 * {@code commit()} and {@code rollback()} are guard methods:
 * they obtain the active {@code Transaction} via
 * {@code session.getTransaction()}, check its status, and only act if
 * the transaction is in an appropriate state.  This is safe to call
 * even when there is no transaction at all.
 * <p>
 * <h2>How to write a test using this pattern</h2>
 * <pre>{@code
 * Session s = mock(Session.class);
 * DB db = new DB(s);
 * MyManager mgr = new MyManager(db);
 * // test mgr methods against the mock session
 * }</pre>
 */
class DBTest {

    // ---------------------------------------------------------------
    //  Constructor
    // ---------------------------------------------------------------

    @Test
    void testSessionInjectionConstructorStoresSession() {
        // DB(Session session) sets this.session = session directly.
        // No getSessionFactory() is called.  session() is a simple
        // field accessor — verify the object identity matches.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        assertSame(mockSession, db.session());
    }

    @Test
    void testSessionInjectionConstructorThrowsOnNullSession() {
        // The constructor requires a non-null session.  Passing null
        // would leave DB in an inconsistent state where open() would
        // try to call getSessionFactory().  Fail fast with a clear
        // error rather than an NPE later.
        assertThrows(IllegalArgumentException.class, () -> new DB((Session) null));
    }

    // ---------------------------------------------------------------
    //  Session lifecycle: open / close
    // ---------------------------------------------------------------

    @Test
    void testOpenReturnsInjectedSessionWithoutSessionFactory() {
        // open() checks if (session == null).  Since the constructor
        // already set it, open() returns it directly — no
        // getSessionFactory() call, no real Hibernate interaction.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        assertSame(mockSession, db.open());
    }

    @Test
    void testOpenCalledTwiceReturnsSameSession() {
        // open() returns the existing session on subsequent calls
        // (it only opens a new one when session is null).  Verify
        // both calls return the same object.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        assertSame(db.open(), db.open());
    }

    @Test
    void testCloseClosesInjectedSession() {
        // close() calls session.close() on the injected session
        // and then sets the field to null.  After close, session()
        // returns null — the DB is effectively detached.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        db.close();
        verify(mockSession).close();
        assertNull(db.session());
    }

    @Test
    void testCloseCanBeCalledMultipleTimes() {
        // close() is idempotent: after the first call, the session
        // reference is null, and the session.close() guard (null
        // check) prevents a second close call on the mock.  The
        // mock's close() is only invoked once.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        db.close();
        db.close();
        verify(mockSession, times(1)).close();
    }

    // ---------------------------------------------------------------
    //  Error guards
    // ---------------------------------------------------------------

    @Test
    void testGetSessionFactoryThrowsWhenUsingSessionInjection() {
        // DB(Session) sets sessionInjected = true.  getSessionFactory()
        // checks the instance flag first and throws before any access
        // to static semaphore maps.  The message must mention both
        // "SessionFactory not available" and "Session injection" so
        // users can diagnose the cause.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        IllegalStateException ex = assertThrows(IllegalStateException.class, db::getSessionFactory);
        assertTrue(ex.getMessage().contains("SessionFactory not available"));
        assertTrue(ex.getMessage().contains("Session injection"));
    }

    @SuppressWarnings("unchecked")
    @Test
    void testGetSessionFactoryThrowsEvenAfterWarmedStaticState() throws Exception {
        // Prime the static semaphore maps with a unique non-null key,
        // simulating the state where a prior DB(configModifier) has
        // registered semaphores for that modifier in the same JVM.
        // Without an instance-level guard, a later DB(mockSession, key)
        // would find the warm semaphore and try to acquire it, leaking
        // into real Hibernate bootstrap.  The sessionInjected flag
        // prevents this regardless of the static map state.
        // Uses a unique key rather than null to avoid polluting the
        // default configModifier slot that other tests may rely on.
        var sfField = DB.class.getDeclaredField("sfSems");
        sfField.setAccessible(true);
        var mdField = DB.class.getDeclaredField("mdSems");
        mdField.setAccessible(true);
        Map<String, Semaphore> sfSems = (Map<String, Semaphore>) sfField.get(null);
        Map<String, Semaphore> mdSems = (Map<String, Semaphore>) mdField.get(null);
        String testKey = "_test_warmed_" + UUID.randomUUID();
        sfSems.put(testKey, new Semaphore(1));
        mdSems.put(testKey, new Semaphore(1));
        try {
            Session mockSession = mock(Session.class);
            DB db = new DB(mockSession, testKey);
            IllegalStateException ex = assertThrows(IllegalStateException.class, db::getSessionFactory);
            assertTrue(ex.getMessage().contains("SessionFactory not available"));
        } finally {
            sfSems.remove(testKey);
            mdSems.remove(testKey);
        }
    }

    @Test
    void testGetMetadataThrowsWithSessionInjection() throws Exception {
        // getMetadata() is private and uses the same sessionInjected
        // guard as getSessionFactory().  Verify it throws the
        // appropriate message via reflection.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        var method = DB.class.getDeclaredMethod("getMetadata");
        method.setAccessible(true);
        var thrown = assertThrows(InvocationTargetException.class, () -> method.invoke(db));
        assertEquals(IllegalStateException.class, thrown.getCause().getClass());
        assertTrue(thrown.getCause().getMessage().contains("Metadata not available"));
    }

    // ---------------------------------------------------------------
    //  CRUD operations (direct session delegation)
    // ---------------------------------------------------------------

    @Test
    void testSaveDelegatesToInjectedSession() {
        // DB.save(Object) calls session.persist(obj) — note that
        // despite the method name "save", it uses JPA's persist()
        // rather than Hibernate's save().  This is intentional for
        // JPA-compliance.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        Object entity = new Object();
        db.save(entity);
        verify(mockSession).persist(entity);
    }

    @Test
    void testSaveOrUpdateDelegatesToInjectedSession() {
        // DB.saveOrUpdate(Object) calls session.saveOrUpdate(obj).
        // For a mock, the call is a no-op by default — we just
        // verify the delegation happened.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        Object entity = new Object();
        db.saveOrUpdate(entity);
        verify(mockSession).saveOrUpdate(entity);
    }

    @Test
    void testDeleteDelegatesToInjectedSession() {
        // DB.delete(Object) calls session.delete(obj).
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        Object entity = new Object();
        db.delete(entity);
        verify(mockSession).delete(entity);
    }

    // ---------------------------------------------------------------
    //  Transaction lifecycle: begin / commit / rollback
    // ---------------------------------------------------------------

    @Test
    void testSessionInjectionWithMockedTransaction() {
        // beginTransaction() (no-arg) calls session.beginTransaction()
        // and returns the result.  We mock the return value to verify
        // the delegation — in a real test you would typically use the
        // returned Transaction for further assertions.
        Session mockSession = mock(Session.class);
        org.hibernate.Transaction mockTx = mock(org.hibernate.Transaction.class);
        when(mockSession.beginTransaction()).thenReturn(mockTx);

        DB db = new DB(mockSession);
        db.beginTransaction();

        verify(mockSession).beginTransaction();
    }

    @Test
    void testCommitDelegatesToSessionTransaction() {
        // commit() obtains the active Transaction via
        // session.getTransaction(), checks tx.getStatus().isOneOf(ACTIVE),
        // and only calls tx.commit() when the transaction is actually
        // active.  We stub both getTransaction() and getStatus() to
        // simulate an active transaction.
        Session mockSession = mock(Session.class);
        org.hibernate.Transaction mockTx = mock(org.hibernate.Transaction.class);
        when(mockSession.getTransaction()).thenReturn(mockTx);
        when(mockTx.getStatus()).thenReturn(TransactionStatus.ACTIVE);

        DB db = new DB(mockSession);
        db.commit();

        verify(mockTx).commit();
    }

    @Test
    void testRollbackDelegatesToSessionTransaction() {
        // rollback() mirrors commit(): it obtains the Transaction,
        // checks tx.getStatus().canRollback(), and only calls
        // tx.rollback() when the transaction can be rolled back.
        // ACTIVE transactions can roll back.
        Session mockSession = mock(Session.class);
        org.hibernate.Transaction mockTx = mock(org.hibernate.Transaction.class);
        when(mockSession.getTransaction()).thenReturn(mockTx);
        when(mockTx.getStatus()).thenReturn(TransactionStatus.ACTIVE);

        DB db = new DB(mockSession);
        db.rollback();

        verify(mockTx).rollback();
    }

    // ---------------------------------------------------------------
    //  beginTransaction(int timeout) — distinct overload
    // ---------------------------------------------------------------

    @Test
    void testBeginTransactionWithTimeout() {
        // This overload calls session.getTransaction() (not
        // beginTransaction()!) to obtain the Transaction object,
        // then explicitly calls tx.setTimeout(30) and tx.begin().
        // Using getTransaction() instead of beginTransaction()
        // means this overload works even when a transaction is
        // already in progress — it reuses the existing one.
        Session mockSession = mock(Session.class);
        org.hibernate.Transaction mockTx = mock(org.hibernate.Transaction.class);
        when(mockSession.getTransaction()).thenReturn(mockTx);

        DB db = new DB(mockSession);
        db.beginTransaction(30);

        verify(mockTx).setTimeout(30);
        verify(mockTx).begin();
    }

    @Test
    void testBeginTransactionWithZeroTimeoutDoesNotSetTimeout() {
        // When timeout is 0 (or negative), the guard
        // if (timeout > 0) tx.setTimeout(timeout) skips the
        // setTimeout call entirely.  tx.begin() is still called.
        Session mockSession = mock(Session.class);
        org.hibernate.Transaction mockTx = mock(org.hibernate.Transaction.class);
        when(mockSession.getTransaction()).thenReturn(mockTx);

        DB db = new DB(mockSession);
        db.beginTransaction(0);

        verify(mockTx, never()).setTimeout(anyInt());
        verify(mockTx).begin();
    }

    // ---------------------------------------------------------------
    //  commit/rollback guard conditions
    // ---------------------------------------------------------------

    @Test
    void testCommitSkipsWhenTransactionNotActive() {
        // commit() only acts when tx.getStatus().isOneOf(ACTIVE).
        // MARKED_ROLLBACK means the transaction has been flagged
        // for rollback — commit() must not call tx.commit().
        Session mockSession = mock(Session.class);
        org.hibernate.Transaction mockTx = mock(org.hibernate.Transaction.class);
        when(mockSession.getTransaction()).thenReturn(mockTx);
        when(mockTx.getStatus()).thenReturn(TransactionStatus.MARKED_ROLLBACK);

        DB db = new DB(mockSession);
        db.commit();

        verify(mockTx, never()).commit();
    }

    @Test
    void testCommitSkipsWhenSessionIsNull() {
        // commit() starts with if (session() != null).  After
        // close(), the session reference is null, so commit()
        // exits immediately without touching the mock at all.
        // This is a safety guard: calling commit() on a closed
        // DB should never throw.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        db.close();
        db.commit();

        verify(mockSession, never()).getTransaction();
    }

    @Test
    void testRollbackSkipsWhenCannotRollback() {
        // rollback() only acts when tx.getStatus().canRollback()
        // returns true.  COMMITTED transactions are final and
        // cannot roll back.  The guard prevents an illegal
        // tx.rollback() call.
        Session mockSession = mock(Session.class);
        org.hibernate.Transaction mockTx = mock(org.hibernate.Transaction.class);
        when(mockSession.getTransaction()).thenReturn(mockTx);
        when(mockTx.getStatus()).thenReturn(TransactionStatus.COMMITTED);

        DB db = new DB(mockSession);
        db.rollback();

        verify(mockTx, never()).rollback();
    }

    @Test
    void testRollbackSkipsWhenSessionIsNull() {
        // Same null-safety guard as commit: after close(),
        // rollback() is a no-op and never accesses the mock.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        db.close();
        db.rollback();

        verify(mockSession, never()).getTransaction();
    }

    // ---------------------------------------------------------------
    //  Miscellaneous: toString, Log, defaults
    // ---------------------------------------------------------------

    @Test
    void testToStringWithSessionInjection() {
        // DB(Session) delegates to DB(Session, null), so
        // configModifier is null and toString() renders "DB{}".
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        assertEquals("DB{}", db.toString());
    }

    @Test
    void testSessionInjectionWithConfigModifier() {
        // DB(Session, String) stores the modifier.  toString()
        // includes it, which matters for callers that route or
        // log based on the modifier label.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession, "tenant-a");
        assertSame(mockSession, db.session());
        assertEquals("DB{tenant-a}", db.toString());
    }

    @Test
    void testSessionInjectionWithNullConfigModifier() {
        // DB(Session, null) should behave identically to
        // DB(Session): configModifier stays null, toString
        // renders "DB{}".
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession, (String) null);
        assertSame(mockSession, db.session());
        assertEquals("DB{}", db.toString());
    }

    @Test
    void testLogCanBeSetOnSessionInjectedDB() {
        // The Log field is independent of the session injection mode.
        // Setting and getting a Log works exactly as it does in the
        // standard constructors.
        Session mockSession = mock(Session.class);
        org.jpos.util.Log log = new org.jpos.util.Log();
        DB db = new DB(mockSession);
        db.setLog(log);
        assertSame(log, db.getLog());
    }

    @Test
    void testGetLogReturnsNonNull() {
        // When no Log has been set, getLog() lazily creates a default
        // one via Log.getLog("Q2", "DB").  This must never return null,
        // even when there is no real SessionFactory or configuration.
        Session mockSession = mock(Session.class);
        DB db = new DB(mockSession);
        assertNotNull(db.getLog());
    }
}
