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

package org.jpos.simulator;

import org.jpos.ee.DB;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration tests that exercise the TestRunner SQL path directly.
 * <p>
 * Uses reflection to access private methods ({@code executeSQL}, {@code initSuite})
 * in {@link TestRunner} to verify SQL execution behavior without requiring a full
 * Q2 container or MUX setup.
 * </p>
 * <p>
 * Requires a live database connection configured via system properties
 * ({@code db.connection}, {@code db.driver}, {@code db.user}, {@code db.password}).
 * The database driver selection ({@code test.clientsim_db_driver}) determines whether
 * MySQL or PostgreSQL-compatible DDL is used.
 * </p>
 * <p>
 * Test tables ({@code test_integration}, {@code test_multi}) are dropped before each
 * test via {@link BeforeEach} to ensure isolation between runs.
 * </p>
 *
 * <h3>Test categories</h3>
 * <ul>
 * <li>{@code initSuite} tests — verify XML parsing of pre-sql/post-sql elements
 *     and the continue-on-sql-error attribute</li>
 * <li>{@code executeSQL} tests — verify SQL execution, error handling (strict vs.
 *     lenient mode), and multi-statement support</li>
 * </ul>
 *
 * @see TestRunner#executeSQL(String, boolean)
 * @see TestRunner#initSuite(Element)
 * @see TestBase#isMySQL()
 */
public class TestRunnerSQLIntegrationTest extends TestBase {

    @TempDir
    File tempDir;

    /**
     * Writes a string of XML content to a file.
     * <p>
     * Used to create test suite descriptor files in the temporary directory
     * for the {@code initSuite} XML parsing tests.
     * </p>
     *
     * @param file    The target file to write to
     * @param content The XML string content
     * @throws IOException if the file cannot be written
     */
    private void writeXml(File file, String content) throws IOException {
        try (FileWriter w = new FileWriter(file)) {
            w.write(content);
        }
    }

    /**
     * Drops test tables before each test to ensure isolation between runs.
     * <p>
     * {@code testExecuteSQLViaRunnerPath} creates {@code test_integration}
     * and {@code testExecuteSQLMultipleStatements} creates {@code test_multi}.
     * Without cleanup, repeated runs would accumulate stale rows.
     * </p>
     * <p>
     * Uses {@link TestRunner#executeSQL(String, boolean)} in lenient mode
     * ({@code continueOnError=true}) so that cleanup is a no-op when the
     * tables do not exist yet (e.g., on the very first run of a test session).
     * </p>
     */
    @BeforeEach
    void cleanUpTestTables() throws Exception {
        // Access private executeSQL via reflection to reuse the TestRunner path
        TestRunner runner = new TestRunner();
        Method executeSQL = TestRunner.class.getDeclaredMethod("executeSQL", String.class, boolean.class);
        executeSQL.setAccessible(true);
        // Lenient mode so DROP TABLE IF EXISTS on non-existent tables is harmless
        executeSQL.invoke(runner, "DROP TABLE IF EXISTS test_integration", true);
        executeSQL.invoke(runner, "DROP TABLE IF EXISTS test_multi", true);
    }

    /**
     * Tests that initSuite correctly parses pre-sql and post-sql XML elements
     * from a test suite descriptor.
     * <p>
     * Verifies that {@link TestRunner#initSuite(Element)} reads the
     * {@code <pre-sql>} and {@code <post-sql>} child elements and sets them on
     * the resulting {@link TestCase} via {@link TestCase#setPreSQL(String)} and
     * {@link TestCase#setPostSQL(String)}.
     * </p>
     * <p>
     * The {@code file="msg"} attribute triggers {@code getMessage()} internally,
     * but since no actual message files exist, it gracefully returns null
     * (checked by {@code f.canRead()} in the implementation). This test is
     * only concerned with XML parsing, not message I/O.
     * </p>
     */
    @Test
    public void testInitSuiteParsesPrePostSQL() throws Exception {
        // Build a minimal test suite descriptor with pre-sql and post-sql
        File suiteXml = new File(tempDir, "suite.xml");
        writeXml(suiteXml,
                "<test-suite><path>" + tempDir.getAbsolutePath() + "</path>"
                        + "<test name=\"sql-test\" file=\"msg\" continue-on-sql-error=\"no\">"
                        + "<pre-sql>INSERT INTO t VALUES (1)</pre-sql>"
                        + "<post-sql>UPDATE t SET x=2</post-sql>"
                        + "</test></test-suite>");

        // Parse the XML into a JDOM Element
        SAXBuilder sax = new SAXBuilder();
        Element suite = sax.build(suiteXml).getRootElement();

        // Access private initSuite(Element) via reflection
        Method m = TestRunner.class.getDeclaredMethod("initSuite", Element.class);
        m.setAccessible(true);

        @SuppressWarnings("unchecked")
        List<TestCase> cases = (List<TestCase>) m.invoke(new TestRunner(), suite);

        // Verify pre-sql and post-sql were extracted from the XML
        assertEquals(1, cases.size());
        TestCase tc = cases.get(0);
        assertEquals("INSERT INTO t VALUES (1)", tc.getPreSQL());
        assertEquals("UPDATE t SET x=2", tc.getPostSQL());
    }

    /**
     * Tests that the {@code continue-on-sql-error} attribute is correctly parsed
     * from XML and mapped to {@link TestCase#setContinueOnSqlError(boolean)}.
     * <p>
     * Two test cases are defined:
     * <ul>
     * <li>A "strict" test with {@code continue-on-sql-error="no"} — should set
     *     {@code continueOnSqlError=false}</li>
     * <li>A "lenient" test without the attribute — should default to
     *     {@code continueOnSqlError=true} for backward compatibility</li>
     * </ul>
     * </p>
     */
    @Test
    public void testInitSuiteParsesContinueOnSqlError() throws Exception {
        // Build a suite with one strict test and one default (lenient) test
        File suiteXml = new File(tempDir, "suite.xml");
        writeXml(suiteXml,
                "<test-suite><path>" + tempDir.getAbsolutePath() + "</path>"
                        + "<test name=\"strict-test\" file=\"msg\" continue-on-sql-error=\"no\">"
                        + "<pre-sql>SELECT 1</pre-sql>"
                        + "</test>"
                        + "<test name=\"lenient-test\" file=\"msg\">"
                        + "<pre-sql>SELECT 1</pre-sql>"
                        + "</test></test-suite>");

        SAXBuilder sax = new SAXBuilder();
        Element suite = sax.build(suiteXml).getRootElement();

        // Access private initSuite(Element) via reflection
        Method m = TestRunner.class.getDeclaredMethod("initSuite", Element.class);
        m.setAccessible(true);

        @SuppressWarnings("unchecked")
        List<TestCase> cases = (List<TestCase>) m.invoke(new TestRunner(), suite);

        assertEquals(2, cases.size());

        // First test: continue-on-sql-error="no" → strict mode
        TestCase strict = cases.get(0);
        assertFalse(strict.isContinueOnSqlError(), "continue-on-sql-error=\"no\" should set strict mode");

        // Second test: attribute absent → default lenient mode (true)
        TestCase lenient = cases.get(1);
        assertTrue(lenient.isContinueOnSqlError(), "missing attribute should default to lenient mode");
    }

    /**
     * Tests that executeSQL runs valid SQL through the TestRunner path.
     * <p>
     * Creates a table, inserts a row via {@code executeSQL} in strict mode
     * ({@code continueOnError=false}), then verifies the row exists by querying
     * directly through Hibernate's {@link DB} session.
     * </p>
     * <p>
     * Uses {@code CREATE TABLE IF NOT EXISTS} so the same DDL is safe across
     * repeated runs (the {@link BeforeEach} cleanup drops the table first).
     * </p>
     */
    @Test
    public void testExecuteSQLViaRunnerPath() throws Exception {
        // Select DDL compatible with the configured database driver
        String ddl = isMySQL()
                ? "CREATE TABLE IF NOT EXISTS test_integration (id INTEGER AUTO_INCREMENT PRIMARY KEY, val INT)"
                : "CREATE TABLE IF NOT EXISTS test_integration (id SERIAL PRIMARY KEY, val INT)";

        TestRunner runner = new TestRunner();

        // Access private executeSQL(String, boolean) via reflection
        Method executeSQL = TestRunner.class.getDeclaredMethod("executeSQL", String.class, boolean.class);
        executeSQL.setAccessible(true);

        // Run DDL + INSERT in strict mode — should not throw
        assertDoesNotThrow(
                () -> executeSQL.invoke(runner, ddl + ";INSERT INTO test_integration (val) VALUES (42)", false));

        // Verify the row was committed by opening a separate Hibernate session
        DB db = new DB();
        db.open();
        db.beginTransaction();
        db.session().doWork(new org.hibernate.jdbc.Work() {
            @Override
            public void execute(java.sql.Connection conn) throws java.sql.SQLException {
                try (java.sql.Statement stmt = conn.createStatement();
                        java.sql.ResultSet rs = stmt
                                .executeQuery("SELECT COUNT(*) FROM test_integration WHERE val=42")) {
                    assertTrue(rs.next(), "Result set should have at least one row");
                    assertEquals(1, rs.getInt(1), "Row should exist after executeSQL");
                }
            }
        });
        // Rollback the verification transaction — the INSERT was already committed
        // inside executeSQL, so this only rolls back the SELECT transaction
        db.rollback();
        db.close();
    }

    /**
     * Tests that executeSQL throws SQLFailureException for invalid SQL in strict
     * mode ({@code continueOnError=false}).
     * <p>
     * When {@code continueOnError} is {@code false} and the SQL statement fails,
     * {@link TestRunner#executeSQL(String, boolean)} should throw
     * {@link SQLFailureException} to signal the caller that execution must stop.
     * </p>
     * <p>
     * Because the method is accessed via reflection, the exception is wrapped in
     * {@link java.lang.reflect.InvocationTargetException}. The test unwraps it to
     * verify the root cause is the expected exception type.
     * </p>
     */
    @Test
    public void testExecuteSQLThrowsOnInvalidSql() throws Exception {
        TestRunner runner = new TestRunner();

        // Access private executeSQL method via reflection
        Method executeSQL = TestRunner.class.getDeclaredMethod("executeSQL", String.class, boolean.class);
        executeSQL.setAccessible(true);

        // Query a table that definitely does not exist
        String invalidSql = "SELECT * FROM nonexistent_table_xyz_12345";

        // assertThrows catches the InvocationTargetException from the reflection layer
        Exception thrown = assertThrows(Exception.class, () -> executeSQL.invoke(runner, invalidSql, false));

        // Verify the reflection wrapper is present
        assertTrue(thrown instanceof java.lang.reflect.InvocationTargetException,
                "Reflection should wrap exception");
        // Unwrap to check the actual exception type thrown by executeSQL
        Throwable cause = ((java.lang.reflect.InvocationTargetException) thrown).getTargetException();
        assertTrue(cause instanceof SQLFailureException,
                "Root cause should be SQLFailureException but was: " + cause.getClass().getName());
    }

    /**
     * Tests that executeSQL does NOT throw in lenient mode
     * ({@code continueOnError=true}).
     * <p>
     * When {@code continueOnError} is {@code true}, SQL execution failures should
     * be logged internally by {@link TestRunner#executeSQL(String, boolean)} but
     * NOT propagated as exceptions. This allows tests to continue even when
     * SQL statements fail (the default behavior for backward compatibility).
     * </p>
     */
    @Test
    public void testExecuteSQLLenientModeDoesNotThrow() throws Exception {
        TestRunner runner = new TestRunner();

        // Access private executeSQL method via reflection
        Method executeSQL = TestRunner.class.getDeclaredMethod("executeSQL", String.class, boolean.class);
        executeSQL.setAccessible(true);

        // Query a table that does not exist — should be logged but not thrown
        String invalidSql = "SELECT * FROM nonexistent_table_xyz_12345";

        // In lenient mode, the error is swallowed and logged internally
        assertDoesNotThrow(() -> executeSQL.invoke(runner, invalidSql, true));
    }

    /**
     * Tests that executeSQL handles semicolon-separated multiple statements.
     * <p>
     * {@link TestRunner#executeSQL(String, boolean)} splits input on semicolons
     * and executes each statement individually. This test verifies that three
     * statements (one DDL + two INSERTs) all execute successfully in sequence
     * within a single call.
     * </p>
     */
    @Test
    public void testExecuteSQLMultipleStatements() throws Exception {
        // Select DDL compatible with the configured database driver
        String ddl = isMySQL()
                ? "CREATE TABLE IF NOT EXISTS test_multi (id INTEGER AUTO_INCREMENT PRIMARY KEY, val INT)"
                : "CREATE TABLE IF NOT EXISTS test_multi (id SERIAL PRIMARY KEY, val INT)";

        TestRunner runner = new TestRunner();

        // Access private executeSQL method via reflection
        Method executeSQL = TestRunner.class.getDeclaredMethod("executeSQL", String.class, boolean.class);
        executeSQL.setAccessible(true);

        // Three statements joined by semicolons: DDL + two INSERTs
        String multiSql = ddl + ";INSERT INTO test_multi (val) VALUES (1);INSERT INTO test_multi (val) VALUES (2)";

        // Execute all three in strict mode — should not throw
        assertDoesNotThrow(() -> executeSQL.invoke(runner, multiSql, false));

        // Verify both rows were committed by querying through a separate Hibernate session
        DB db = new DB();
        db.open();
        db.beginTransaction();
        db.session().doWork(new org.hibernate.jdbc.Work() {
            @Override
            public void execute(java.sql.Connection conn) throws java.sql.SQLException {
                try (java.sql.Statement stmt = conn.createStatement();
                        java.sql.ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM test_multi")) {
                    assertTrue(rs.next(), "Result set should have at least one row");
                    int count = rs.getInt(1);
                    assertTrue(count >= 2, "Should have at least 2 rows from multi-statement SQL");
                }
            }
        });
        // Rollback the verification transaction only
        db.rollback();
        db.close();
    }

    /**
     * Tests that initSuite does NOT set SQL fields when {@code <pre-sql>} and
     * {@code <post-sql>} elements are absent from the test descriptor.
     * <p>
     * When no SQL elements are provided, the corresponding fields on
     * {@link TestCase} should remain {@code null}. This ensures that
     * {@link TestRunner#runSuite} correctly skips SQL execution when nothing
     * is configured.
     * </p>
     */
    @Test
    public void testInitSuiteNoSqlElements() throws Exception {
        // Build a suite with no pre-sql or post-sql elements at all
        File suiteXml = new File(tempDir, "suite.xml");
        writeXml(suiteXml,
                "<test-suite><path>" + tempDir.getAbsolutePath() + "</path>"
                        + "<test name=\"no-sql\" file=\"msg\">"
                        + "</test></test-suite>");

        SAXBuilder sax = new SAXBuilder();
        Element suite = sax.build(suiteXml).getRootElement();

        // Access private initSuite(Element) via reflection
        Method m = TestRunner.class.getDeclaredMethod("initSuite", Element.class);
        m.setAccessible(true);

        @SuppressWarnings("unchecked")
        List<TestCase> cases = (List<TestCase>) m.invoke(new TestRunner(), suite);

        // Verify SQL fields are null when not present in XML
        assertEquals(1, cases.size());
        TestCase tc = cases.get(0);
        assertNull(tc.getPreSQL(), "preSQL should be null when pre-sql element absent");
        assertNull(tc.getPostSQL(), "postSQL should be null when post-sql element absent");
    }
}
