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

package org.jpos.ee.usertype;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.TestInstance.Lifecycle.*;

import java.io.Serializable;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

import org.hibernate.Interceptor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.Type;
import org.jpos.ee.DB;
import org.jpos.gl.Account;
import org.jpos.gl.CompositeAccount;
import org.jpos.gl.FinalAccount;
import org.jpos.util.Tags;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testcontainers.containers.PostgreSQLContainer;

/**
 * Integration tests for {@link TagsType} using PostgreSQL via Testcontainers.
 * <p>
 * These tests validate that the fix applied in commit b6bf9f9ca074 (PR #377)
 * correctly handles null Tags in Hibernate's dirty-checking mechanism at the
 * database level. Unlike the unit tests in {@link TagsTypeTest}, this class
 * uses a real PostgreSQL database to verify the full Hibernate lifecycle:
 * <ol>
 * <li>Entity persistence and retrieval with null Tags</li>
 * <li>Null → non-null and non-null → null transition of Tags fields</li>
 * <li>Spurious dirty marking: loading a null-Tags entity and making zero
 *     changes must NOT trigger {@code onFlushDirty} or issue an UPDATE</li>
 * <li>Second-level-cache null-safety: the
 *     {@link TagsType#disassemble disassemble}/{@link TagsType#assemble
 *     assemble} contract must handle null without exceptions</li>
 * </ol>
 * <p>
 * <strong>Test Strategy:</strong> Uses the {@link Account} hierarchy from the
 * {@code minigl} module as a realistic domain entity that carries a
 * {@link Tags}
 * field. A PostgreSQL Testcontainer is provisioned per test class with a
 * minimal
 * schema matching the {@code acct} table structure. The {@code CONFIG_MODIFIER}
 * mechanism in {@link DB} is used to configure Hibernate properties without
 * affecting the main application configuration.
 * <p>
 * <strong>Schema Note:</strong> The table schema created in
 * {@link #createSchema()}
 * mirrors the relevant columns from the jPOS GL accounting module. Only the
 * columns
 * needed for these tests (id, subclass, code, description, tags, and the
 * parent-relationship columns) are included.
 * <p>
 * <strong>Why PostgreSQL:</strong> The bug manifests specifically during
 * Hibernate's
 * dirty-checking at flush time, which triggers UPDATE statements. To verify
 * that
 * these UPDATEs are eliminated (or at least harmless), we need a real database
 * that acquires row-level locks and serializes transactions — behavior that
 * in-memory databases may not fully reproduce.
 *
 * @see TagsType The Hibernate UserType under test
 * @see TagsTypeTest Unit tests for TagsType
 */
@TestInstance(PER_CLASS)
class TagsTypePersistenceTest {

    /** Name of the test database created in the PostgreSQL container. */
    private static final String TEST_DB_NAME = "jposee_tags_test";

    /** PostgreSQL user for the test database. */
    private static final String TEST_DB_USER = "jpos";

    /** PostgreSQL password for the test database. */
    private static final String TEST_DB_PASS = "password";

    /**
     * Config modifier key used to register Hibernate properties without conflicting
     * with the application's main configuration. This isolates test configuration
     * from any running jPOS instance.
     *
     * @see DB#registerProperties(String, Properties)
     * @see DB#invalidateSessionFactory(String)
     */
    private static final String CONFIG_MODIFIER = "tagstest";

    /**
     * Singleton PostgreSQL container shared across all tests. Uses Postgres 17
     * with {@code withReuse(true)} to keep the container running between test
     * runs for faster iteration during development.
     *
     * @implNote The {@code @SuppressWarnings("resource")} annotation is necessary
     *           because the container is never explicitly closed — it is stopped in
     *           {@link #tearDown()}. Testcontainers recommends this pattern for
     *           static
     *           containers.
     */
    @SuppressWarnings("resource")
    private static final PostgreSQLContainer<?> DB_CONTAINER = new PostgreSQLContainer<>("postgres:17")
            .withDatabaseName(TEST_DB_NAME)
            .withUsername(TEST_DB_USER)
            .withPassword(TEST_DB_PASS)
            .withReuse(true);

    /**
     * Starts the PostgreSQL container, configures Hibernate properties, and
     * creates the test schema. Called once before any test in this class.
     * <p>
     * The container start can take 10-30 seconds on first run (image pull).
     * Subsequent runs are faster if {@code withReuse(true)} is active and
     * the Testcontainers Ryuk reaper is running.
     */
    @BeforeAll
    static void setUp() {
        DB_CONTAINER.start();
        configureDBProperties();
        createSchema();
    }

    /**
     * Cleans up the Hibernate session factory registered for this config modifier
     * and stops the PostgreSQL container. Called once after all tests complete.
     * <p>
     * {@link DB#invalidateSessionFactory(String)} ensures the test-specific
     * connection pool is properly closed before the container stops, preventing
     * connection leak warnings.
     */
    @AfterAll
    static void tearDown() {
        DB.invalidateSessionFactory(CONFIG_MODIFIER);
        DB_CONTAINER.stop();
    }

    /**
     * Registers Hibernate properties for the test config modifier.
     * <p>
     * Uses Agroal connection pooling with a small pool (1-8 connections) suitable
     * for testing. The JDBC URL is obtained dynamically from the running container.
     * Globally quoted identifiers are disabled for schema compatibility with the
     * pre-existing table DDL.
     */
    private static void configureDBProperties() {
        Properties props = new Properties();

        // Disable globally quoted identifiers because the acct table DDL
        // (see createSchema) uses unquoted column names. Hibernate's default
        // "false" is correct here — the pre-existing schema does not quote.
        props.setProperty("hibernate.globally_quoted_identifiers", "false");
        props.setProperty("hibernate.connection.provider_class",
                "org.hibernate.agroal.internal.AgroalConnectionProvider");
        props.setProperty("hibernate.connection.username", TEST_DB_USER);
        props.setProperty("hibernate.connection.password", TEST_DB_PASS);
        props.setProperty("hibernate.connection.url", DB_CONTAINER.getJdbcUrl());
        // Agroal is Hibernate's recommended connection pool for production use.
        // We configure a small pool (min=1, max=8) since tests are single-threaded
        // in most cases but concurrent tests may need additional connections.
        props.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        props.setProperty("hibernate.agroal.minSize", "1");
        props.setProperty("hibernate.agroal.maxSize", "8");

        // Register these properties under a unique config modifier key so they
        // do not interfere with any running jPOS application configuration.
        // DB.registerProperties stores them in an internal map keyed by modifier;
        // DB.getMetadata() later retrieves them by this key.
        DB.registerProperties(CONFIG_MODIFIER, props);
    }

    /**
     * Creates the {@code acct} table used by the GL account hierarchy if it does
     * not already exist.
     * <p>
     * The schema matches the columns needed to persist {@link CompositeAccount}
     * and {@link FinalAccount} entities. Only the columns exercised by these tests
     * are included — additional columns from the full GL schema (balances, audit
     * fields, etc.) are omitted for simplicity.
     * <p>
     * Note: This uses a native PostgreSQL DDL statement rather than Hibernate's
     * {@code hbm2ddl.auto} to give explicit control over the schema structure
     * and avoid unintended table/constraint generation.
     */
    @SuppressWarnings("deprecation")
    private static void createSchema() {
        try (DB db = new DB(CONFIG_MODIFIER)) {
            String createTableSql = """
                    CREATE TABLE IF NOT EXISTS acct (
                        id BIGINT PRIMARY KEY,
                        subclass VARCHAR(1),
                        code VARCHAR(255) NOT NULL,
                        description VARCHAR(255),
                        tags VARCHAR(255),
                        created DATE,
                        expiration DATE,
                        type SMALLINT,
                        currency CHAR(5),
                        parent BIGINT,
                        root BIGINT,
                        layer SMALLINT DEFAULT 0
                    )
                    """;
            db.open();
            db.beginTransaction();
            db.session().createNativeQuery(createTableSql).executeUpdate();
            db.commit();
        }
    }

    /**
     * Verifies that entities with null Tags can be persisted and reloaded
     * without losing the null value.
     * <p>
     * This test creates parent-child Account entities (CompositeAccount and
     * FinalAccount), both with null Tags, persists them, clears the Hibernate
     * session cache, and reloads them from the database. The null Tags value
     * must survive the round-trip through:
     * <ol>
     * <li>nullSafeSet → SQL INSERT with NULL</li>
     * <li>SQL SELECT → nullSafeGet → null</li>
     * <li>deepCopy (snapshot creation) → null (the fix under test)</li>
     * </ol>
     * <p>
     * Without the fix, {@code deepCopy(null)} would return {@code new Tags()}
     * and the reloaded entity would incorrectly have a non-null empty Tags.
     */
    @Test
    void testPersistAndLoadNullTags() {
        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            db.beginTransaction();

            // Create a parent account with explicit null tags.
            // Using CompositeAccount (one subclass) and FinalAccount (another)
            // exercises the Account hierarchy's discriminator mapping alongside
            // the Tags UserType — both must work together.
            CompositeAccount parent = new CompositeAccount();
            parent.setCode("TEST-PARENT-" + System.currentTimeMillis());
            parent.setTags(null);
            db.session().persist(parent);

            Long parentId = parent.getId();

            // Create a child account, also with null tags, under that parent.
            // Two entities with null tags avoids the coincidence of a single row.
            FinalAccount child = new FinalAccount();
            child.setCode("TEST-CHILD-" + System.currentTimeMillis());
            child.setTags(null);
            child.setParent(parent);
            db.session().persist(child);

            Long childId = child.getId();
            db.commit();

            // Clear the first-level cache (PersistenceContext) to force a
            // database reload via SELECT. Without this, find() returns the
            // same Java object from the session cache, which would not test
            // the nullSafeGet/nullSafeSet round-trip through JDBC.
            db.session().clear();

            // Reload both entities and verify null tags survived the round-trip.
            db.beginTransaction();
            Account reloadedParent = db.session().find(Account.class, parentId);
            Account reloadedChild = db.session().find(Account.class, childId);

            assertNotNull(reloadedParent, "Parent should be found");
            assertNotNull(reloadedChild, "Child should be found");
            assertNull(reloadedParent.getTags(), "Parent tags should be null after reload");
            assertNull(reloadedChild.getTags(), "Child tags should be null after reload");
            db.commit();
        }
    }

    /**
     * Verifies that entities with non-null Tags can be persisted and reloaded
     * correctly — a basic sanity check that the fix does not break normal
     * non-null Tags handling.
     * <p>
     * This is the happy-path counterpart to {@link #testPersistAndLoadNullTags()}.
     */
    @Test
    void testPersistAndLoadNonNullTags() {
        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            db.beginTransaction();

            // Create an account with a concrete Tags value.
            FinalAccount account = new FinalAccount();
            account.setCode("TEST-TAGS-" + System.currentTimeMillis());
            account.setTags(new Tags("alpha,beta,gamma"));
            db.session().persist(account);

            Long accountId = account.getId();
            db.commit();

            // Clear the persistence context to force a SELECT from the database,
            // verifying that nullSafeGet correctly reconstructs the Tags object
            // from the stored VARCHAR value.
            db.session().clear();

            // Reload and verify the Tags value is preserved.
            db.beginTransaction();
            Account reloaded = db.session().find(Account.class, accountId);

            assertNotNull(reloaded, "Account should be found");
            assertNotNull(reloaded.getTags(), "Tags should not be null after reload");
            assertEquals("alpha,beta,gamma", reloaded.getTags().toString());
            db.commit();
        }
    }

    /**
     * Proves that loading a null-Tags entity and making NO changes does NOT
     * trigger a flush. This is the core bug-detection test.
     * <p>
     * Uses a Hibernate {@link Interceptor} that flags when
     * {@link Interceptor#onFlushDirty onFlushDirty} is called — this method
     * is only invoked when Hibernate considers an entity dirty during flush.
     * An entity loaded with null Tags and never modified should NEVER be
     * considered dirty.
     * <p>
     * <strong>With the bug</strong> ({@code deepCopy(null) = new Tags()}):
     * The snapshot created at load time is {@code new Tags()} (non-null empty),
     * while the current property value is null. Hibernate sees a mismatch →
     * entity is dirty → {@code onFlushDirty} fires → test FAILS.
     * <p>
     * <strong>With the fix</strong> ({@code deepCopy(null) = null}):
     * The snapshot is null, matching the current property value. Hibernate
     * sees all properties clean → {@code onFlushDirty} never fires →
     * test PASSES.
     * <p>
     * The interceptor directly intercepts Hibernate's flush event, making
     * this a deterministic assertion — not probabilistic like the concurrent
     * stress tests. If this test passes, the null-snapshot bug is fixed.
     */
    @Test
    void testNoSpuriousFlushWhenEntityNotModified() throws Exception {
        // Create entity with null Tags using the standard DB infrastructure.
        Long accountId;
        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            db.beginTransaction();
            FinalAccount account = new FinalAccount();
            account.setCode("TEST-NO-FLUSH-" + System.currentTimeMillis());
            account.setTags(null);
            db.session().persist(account);
            accountId = account.getId();
            db.commit();
        }

        AtomicBoolean flushDirtyCalled = new AtomicBoolean(false);

        /*
         * Open a session with an Interceptor that detects dirty marking.
         *
         * Hibernate's dirty-checking works like this:
         *   1. On load (find/get), Hibernate calls TagsType.deepCopy() to
         *      create a "snapshot" of each property for future comparison.
         *   2. At flush time, Hibernate compares each property's snapshot
         *      against its current value using UserType.equals().
         *   3. If any property differs, the entity is marked dirty and
         *      Interceptor.onFlushDirty() is called before the UPDATE.
         *
         * With the bug (deepCopy(null) = new Tags()):
         *   Snapshot = new Tags() (non-null), current = null
         *   equals(new Tags(), null) == false  ← mismatch
         *   → entity marked dirty → onFlushDirty fires → test fails
         *
         * With the fix (deepCopy(null) = null):
         *   Snapshot = null, current = null
         *   equals(null, null) == true  ← match
         *   → entity stays clean → onFlushDirty never fires → test passes
         *
         * We bypass DB.open() to gain direct access to SessionBuilder,
         * which accepts a per-session Interceptor. DB's own session is
         * left null (no open() call), so db.close() is a no-op.
         */
        try (DB db = new DB(CONFIG_MODIFIER)) {
            SessionFactory sf = db.getSessionFactory();
            try (Session s = sf.withOptions()
                    .interceptor(new Interceptor() {
                        @Override
                        public boolean onFlushDirty(
                                Object entity, Object id,
                                Object[] currentState, Object[] previousState,
                                String[] propertyNames, Type[] types) {
                            flushDirtyCalled.set(true);
                            // Debug: dump all property values at flush time.
                            // NOTE: this will NEVER produce output when the test passes,
                            // because the whole point is that onFlushDirty is NOT called
                            // when the entity hasn't been modified (post-fix).
                            // If you see this output, the fix is broken.
                            System.out.println("=== onFlushDirty [entity not modified] ===");
                            System.out.println("  entity: " + entity.getClass().getName() + "@" + System.identityHashCode(entity));
                            System.out.println("  id: " + id);
                            for (int i = 0; i < propertyNames.length; i++) {
                                System.out.println("  [" + i + "] " + propertyNames[i]
                                        + "  prev=" + (previousState != null ? previousState[i] : "NULL")
                                        + "  curr=" + (currentState != null ? currentState[i] : "NULL")
                                        + "  type=" + (types != null ? types[i].getClass().getSimpleName() : "NULL"));
                            }
                            return false;
                        }
                    })
                    .openSession()) {

                s.beginTransaction();

                // Load the entity we persisted earlier.
                // At this point Hibernate:
                //   1. Calls nullSafeGet on TagsType to read tags from ResultSet
                //   2. Calls deepCopy on the result to create the snapshot
                //   3. Stores the snapshot in the PersistenceContext entry
                Account a = s.find(Account.class, accountId);
                assertNull(a.getTags(),
                        "Tags should be null immediately after load");

                // Flush with zero modifications to the entity.
                // This triggers Hibernate's dirty-checking:
                //   For each property, compare snapshot vs current via equals().
                //
                // With the fix:   deepCopy(null)=null → snapshot=null=current → clean
                // With the bug: deepCopy(null)=new Tags() → snapshot≠current → DIRTY
                //
                // If Hibernate considers the entity dirty, it calls onFlushDirty
                // on the interceptor BEFORE issuing the UPDATE. The test detects
                // this call via AtomicBoolean.
                s.flush();

                assertFalse(flushDirtyCalled.get(),
                        "Hibernate marked the entity dirty despite zero changes. " +
                                "deepCopy(null) returned non-null, causing a snapshot " +
                                "mismatch. This triggers spurious UPDATEs and can " +
                                "cause deadlocks under concurrent access.");

                s.getTransaction().commit();
            }
        }
    }

    /**
     * Verifies that onFlushDirty correctly fires when an entity IS modified
     * before the flush, confirming that dirty-checking works properly for
     * legitimate changes.
     * <p>
     * This is the positive counterpart of
     * {@link #testNoSpuriousFlushWhenEntityNotModified()} — if the entity
     * has actually been modified, Hibernate MUST detect the change and fire
     * {@code onFlushDirty} during flush.
     * <p>
     * <strong>With the fix</strong> ({@code deepCopy(null) = null}):
     * The snapshot is null, the current value is a non-null Tags.
     * {@code equals(null, nonNull) == false} → entity is correctly dirty → 
     * {@code onFlushDirty} fires → test PASSES.
     */
    @Test
    void testFlushDetectsDirtyWhenEntityModified() throws Exception {
        Long accountId;
        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            db.beginTransaction();
            FinalAccount account = new FinalAccount();
            account.setCode("TEST-FLUSH-MOD-" + System.currentTimeMillis());
            account.setTags(null);
            db.session().persist(account);
            accountId = account.getId();
            db.commit();
        }

        AtomicBoolean flushDirtyCalled = new AtomicBoolean(false);

        try (DB db = new DB(CONFIG_MODIFIER)) {
            SessionFactory sf = db.getSessionFactory();
            try (Session s = sf.withOptions()
                    .interceptor(new Interceptor() {
                        @Override
                        public boolean onFlushDirty(
                                Object entity, Object id,
                                Object[] currentState, Object[] previousState,
                                String[] propertyNames, Type[] types) {
                            flushDirtyCalled.set(true);
                            // Debug: dump all property values at flush time
                            System.out.println("=== onFlushDirty [entity modified] ===");
                            System.out.println("  entity: " + entity.getClass().getName() + "@" + System.identityHashCode(entity));
                            System.out.println("  id: " + id);
                            for (int i = 0; i < propertyNames.length; i++) {
                                System.out.println("  [" + i + "] " + propertyNames[i]
                                        + "  prev=" + (previousState != null ? previousState[i] : "NULL")
                                        + "  curr=" + (currentState != null ? currentState[i] : "NULL")
                                        + "  type=" + (types != null ? types[i].getClass().getSimpleName() : "NULL"));
                            }
                            return false;
                        }
                    })
                    .openSession()) {

                s.beginTransaction();

                Account a = s.find(Account.class, accountId);
                assertNull(a.getTags(),
                        "Tags should be null immediately after load");

                // Modify the entity — set Tags to a non-null value.
                a.setTags(new Tags("aaa,bbb"));

                s.flush();

                assertTrue(flushDirtyCalled.get(),
                        "Hibernate must detect the modification and fire " +
                                "onFlushDirty when Tags changes from null to non-null. " +
                                "This confirms that dirty-checking correctly identifies " +
                                "legitimate entity modifications.");

                s.getTransaction().commit();
            }
        }
    }

    /**
     * Verifies that {@code session.isDirty()} correctly reflects the
     * dirty state of the persistence context when Tags is modified.
     * <p>
     * Unlike the Interceptor-based tests, this uses Hibernate's built-in
     * dirty check directly — {@code isDirty()} runs the same snapshot
     * comparison that drives {@code onFlushDirty} under the hood.
     * <p>
     * <strong>Caveat:</strong> {@code isDirty()} is a coarse check — it
     * returns true if <em>any</em> entity in the persistence context is
     * dirty, not specifically the one we modified. In this test it is
     * reliable because only one entity is loaded, but in general it can
     * fire for unrelated reasons (collection changes, other entities
     * modified by triggers/interceptors, etc.). The Interceptor-based
     * approach in {@link #testFlushDetectsDirtyWhenEntityModified()} is
     * more precise because it tells us exactly which entity triggered
     * the dirty event and which properties changed.
     * <p>
     * <strong>Before modification:</strong> {@code isDirty()} returns false
     * (snapshot matches current value — confirmed by the fix).<br>
     * <strong>After modification:</strong> {@code isDirty()} returns true
     * (snapshot is null, current is non-null Tags).
     */
    @Test
    void testIsDirtyDetectsTagsModification() throws Exception {
        Long accountId;
        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            db.beginTransaction();
            FinalAccount account = new FinalAccount();
            account.setCode("TEST-ISDIRTY-" + System.currentTimeMillis());
            account.setTags(null);
            db.session().persist(account);
            accountId = account.getId();
            db.commit();
        }

        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            Session s = db.session();

            s.beginTransaction();

            Account a = s.find(Account.class, accountId);
            assertNull(a.getTags());

            assertFalse(s.isDirty(),
                    "isDirty() should be false after loading an unmodified entity. " +
                            "deepCopy(null) must return null to keep the snapshot " +
                            "consistent with the current value.");

            a.setTags(new Tags("aaa,bbb"));

            assertTrue(s.isDirty(),
                    "isDirty() should be true after Tags changes from null to non-null. " +
                            "This confirms that Hibernate's dirty-checking correctly " +
                            "detects the modification via the TagsType.equals() comparison.");

            db.commit();
        }
    }

    /**
     * Verifies that {@code session.isDirty()} returns false when a null-Tags
     * entity is loaded and not modified — the negative counterpart of
     * {@link #testIsDirtyDetectsTagsModification()}.
     * <p>
     * This guards against the regression where {@code deepCopy(null)} returns
     * a non-null empty {@code Tags()}, creating a snapshot mismatch that would
     * cause {@code isDirty()} to return true even with zero changes.
     */
    @Test
    void testIsDirtyFalseWhenTagsNotModified() throws Exception {
        Long accountId;
        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            db.beginTransaction();
            FinalAccount account = new FinalAccount();
            account.setCode("TEST-ISDIRTY-NOMOD-" + System.currentTimeMillis());
            account.setTags(null);
            db.session().persist(account);
            accountId = account.getId();
            db.commit();
        }

        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            Session s = db.session();

            s.beginTransaction();

            Account a = s.find(Account.class, accountId);
            assertNull(a.getTags());

            // No modifications — isDirty must be false.
            assertFalse(s.isDirty(),
                    "isDirty() should be false when a null-Tags entity is loaded " +
                            "and not modified. deepCopy(null) returning non-null would " +
                            "make this assertion fail.");

            db.commit();
        }
    }

    /**
     * Verifies that Tags can be transitioned from null → non-null in an update.
     * <p>
     * This is a critical lifecycle: an entity starts with no Tags, then gains
     * them. The Hibernate dirty-checking must correctly detect the change and
     * issue an UPDATE with the new Tags value. With the fix, this works because
     * the initial snapshot is null (correct), and the current value is
     * {@code new Tags("aaa,zzz")} — they differ, so the UPDATE is legitimate.
     */
    @Test
    void testUpdateTagsFromNullToNonNull() {
        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            db.beginTransaction();

            // Create account with null Tags.
            FinalAccount account = new FinalAccount();
            account.setCode("TEST-UPDATE-" + System.currentTimeMillis());
            account.setTags(null);
            db.session().persist(account);

            Long accountId = account.getId();
            db.commit();

            // Clear the persistence context to force a fresh load.
            // Without this, the entity is still in Hibernate's first-level cache
            // and find() would return the same Java object without a SELECT.
            db.session().clear();

            // Reload and update Tags from null to a concrete value.
            db.beginTransaction();
            Account reloaded = db.session().find(Account.class, accountId);
            assertNull(reloaded.getTags(), "Tags should be null initially — sanity check");

            // Transition tags from null → non-null.
            // The snapshot was null (created by deepCopy at find() time).
            // The current value is new Tags("aaa,zzz").
            // equals(null, nonNull) == false → Hibernate correctly detects dirtiness.
            // With the fix, this legitimate update works because the snapshot
            // is the correct null, not a spurious new Tags().
            reloaded.setTags(new Tags("aaa,zzz"));

            // merge() is used instead of update() because the entity is detached
            // after the clear(). merge() re-attaches it to the new persistence
            // context and propagates the changes to the database at flush/commit.
            db.session().merge(reloaded);
            db.commit();

            // Clear the persistence context and reload to confirm the UPDATE
            // was actually issued and persisted to PostgreSQL.
            db.session().clear();

            db.beginTransaction();
            Account reloaded2 = db.session().find(Account.class, accountId);
            assertNotNull(reloaded2.getTags(), "Tags should not be null after update");
            assertEquals("aaa,zzz", reloaded2.getTags().toString());
            db.commit();
        }
    }

    /**
     * Verifies that Tags can be transitioned from non-null → null in an update.
     * <p>
     * This is the inverse of {@link #testUpdateTagsFromNullToNonNull()}. An
     * entity that previously had Tags has them cleared. Hibernate must detect
     * the change and issue an UPDATE with tags=NULL.
     * <p>
     * This scenario is important because the bug would not affect this case
     * directly (the snapshot is non-null, the current is null — they differ,
     * correctly triggering an UPDATE). However, the fix must not break this
     * legitimate update path.
     */
    @Test
    void testUpdateTagsFromNonNullToNull() {
        try (DB db = new DB(CONFIG_MODIFIER)) {
            db.open();
            db.beginTransaction();

            // Create an account with concrete Tags.
            FinalAccount account = new FinalAccount();
            account.setCode("TEST-UPDATE2-" + System.currentTimeMillis());
            account.setTags(new Tags("original,tag"));
            db.session().persist(account);

            Long accountId = account.getId();
            db.commit();

            // Clear the persistence context so the next find() issues a SELECT
            // rather than returning the cached instance from the first-level cache.
            db.session().clear();

            // Reload and clear the Tags.
            db.beginTransaction();
            Account reloaded = db.session().find(Account.class, accountId);
            assertNotNull(reloaded.getTags(), "Tags should not be null initially — sanity check");

            // Transition tags from non-null → null.
            // The snapshot is the original non-null Tags. The current value is null.
            // equals(nonNull, null) == false → Hibernate correctly detects the change.
            // This path was never broken by the bug (the old deepCopy(null)=new Tags()
            // only affects the null→null case), but we test it to ensure the fix
            // doesn't regress legitimate updates that clear the Tags.
            reloaded.setTags(null);

            // merge() re-attaches the detached entity (post-clear) to the
            // current persistence context. At commit time Hibernate compares
            // the current snapshot (non-null Tags from the just-issued SELECT)
            // against the current value (null), sees a difference, and issues
            // an UPDATE ... SET tags = NULL.
            db.session().merge(reloaded);
            db.commit();

            // Clear the persistence context and reload to confirm the UPDATE
            // with tags=NULL was actually persisted.
            db.session().clear();

            db.beginTransaction();
            Account reloaded2 = db.session().find(Account.class, accountId);
            assertNull(reloaded2.getTags(), "Tags should be null after update");
            db.commit();
        }
    }

    /**
     * Verifies symmetry and null-safety of the disassemble/assemble contract.
     * <p>
     * Hibernate calls {@code disassemble()} when storing values in the
     * second-level cache (e.g., Ehcache, Redis) or when replicating entities
     * via JGroups. {@code assemble()} is the inverse operation called when
     * retrieving a cached/replicated value.
     * <p>
     * The contract requires:
     * <ul>
     * <li>{@code disassemble(null)} → null — must not throw NPE</li>
     * <li>{@code assemble(null, owner)} → null — must not throw NPE</li>
     * <li>{@code assemble(disassemble(x))} → x — round-trip must preserve
     *     identity for non-null x</li>
     * </ul>
     * <p>
     * The bug fix also addressed the {@code disassemble()} method which could
     * throw {@link NullPointerException} when the value was null (in an earlier
     * iteration of the patch before the merge). This test catches that scenario
     * independently of the database integration tests.
     * <p>
     * Unlike the other tests in this class, this test does NOT require a
     * database connection — it tests the {@link TagsType} instance directly.
     */
    @Test
    void testAssembleDisassembleSymmetry() {
        TagsType tagsType = new TagsType();

        // Null round-trip: both disassemble and assemble must handle null gracefully.
        // Prior to the fix, some Tags UserType implementations could throw
        // NullPointerException in disassemble(null).
        Serializable nullCached = tagsType.disassemble(null);
        assertNull(nullCached, "disassemble(null) should return null — NPE here indicates a bug");

        Tags nullAssembled = tagsType.assemble(nullCached, null);
        assertNull(nullAssembled, "assemble(null) should return null");

        // Non-null round-trip: value must survive serialization and deserialization.
        Tags original = new Tags("test,values");
        Serializable serialized = tagsType.disassemble(original);

        // Tags.toString() produces comma-separated key=value pairs or bare keys.
        // disassemble stores this as a String (which is Serializable).
        // We assert the content here to verify the serialization format.
        assertNotNull(serialized, "disassemble should return non-null for non-null input");
        assertEquals("test,values", serialized.toString());

        Tags reassembled = tagsType.assemble(serialized, null);
        assertNotNull(reassembled, "assemble should return non-null for non-null input");
        assertEquals(original, reassembled, "Reassembled Tags should equal original");
    }

}
