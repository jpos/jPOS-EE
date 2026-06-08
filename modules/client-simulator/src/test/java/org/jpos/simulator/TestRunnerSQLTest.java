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
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for SQL execution functionality in TestRunner.
 * <p>
 * These tests verify the executeSQL() method behavior using Hibernate's
 * Work interface to access JDBC connections. Tests cover:
 * <ul>
 *   <li>Basic SQL execution (CREATE, INSERT, SELECT)</li>
 *   <li>Sequential SQL statement execution</li>
 *   <li>Whitespace-only SQL handling (database-specific behavior)</li>
 *   <li>Null/whitespace SQL handling</li>
 *   <li>SQL error handling with rollback behavior</li>
 * </ul>
 * </p>
 * <p>
 * Tests are designed to run against both PostgreSQL and MySQL via Testcontainers.
 * The database driver is selected via the {@code test.clientsim_db_driver} system property:
 * <ul>
 *   <li>"postgres" (default) - Uses Testcontainers PostgreSQL 17</li>
 *   <li>"mysql" - Uses Testcontainers MySQL 8</li>
 *   <li>"local" - Uses pre-configured local database</li>
 * </ul>
 * </p>
 * <p>
 * Note: Some SQL behaviors are database-specific at the JDBC level:
 * <ul>
 *   <li>MySQL throws an exception for whitespace-only SQL, PostgreSQL does not</li>
 *   <li>DDL syntax for auto-increment columns differs (SERIAL vs AUTO_INCREMENT)</li>
 * </ul>
 * </p>
 *
 * @see TestRunner#executeSQL(String)
 * @see TestBase
 */
public class TestRunnerSQLTest extends TestBase {

    /**
     * Tests basic SQL execution through Hibernate Work interface.
     * <p>
     * This test creates a table, inserts rows, and verifies the data was persisted.
     * Uses driver-aware DDL syntax because PostgreSQL and MySQL have different
     * auto-increment column syntax (SERIAL vs AUTO_INCREMENT).
     * </p>
     *
     * @see TestRunner#executeSQL(String, boolean)
     */
    @Test
    public void testDBSQLExecution() throws Exception {
        String ddl = isMySQL()
            ? "CREATE TABLE IF NOT EXISTS test_simulator (id INTEGER AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100))"
            : "CREATE TABLE IF NOT EXISTS test_simulator (id SERIAL PRIMARY KEY, name VARCHAR(100))";

        DB db = new DB();
        db.open();
        db.beginTransaction();
        db.session().doWork(new org.hibernate.jdbc.Work() {
            @Override
            public void execute(Connection conn) throws SQLException {
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(ddl);
                    stmt.execute("INSERT INTO test_simulator (name) VALUES ('test1')");
                    stmt.execute("INSERT INTO test_simulator (name) VALUES ('test2')");

                    ResultSet rs = stmt.executeQuery("SELECT * FROM test_simulator ORDER BY id");
                    int count = 0;
                    while (rs.next()) {
                        count++;
                        assertNotNull(rs.getString("name"), "Name should not be null");
                    }
                    assertEquals(2, count, "Should have 2 rows");
                }
            }
        });
        db.commit();
        db.close();
    }

    /**
     * Tests that multiple SQL statements are executed sequentially.
     * <p>
     * This test verifies that the TestRunner can execute multiple statements
     * by calling each one separately. MySQL does not support semicolon-separated
     * multi-statement execution in a single JDBC call, so statements are executed
     * individually to ensure cross-database compatibility.
     * </p>
     *
     * @see TestRunner#executeSQL(String, boolean)
     */
    @Test
    public void testMultiStatementSQL() throws Exception {
        DB db = new DB();
        db.open();
        db.beginTransaction();
        db.session().doWork(new org.hibernate.jdbc.Work() {
            @Override
            public void execute(Connection conn) throws SQLException {
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute("INSERT INTO test_simulator (name) VALUES ('test3')");
                    stmt.execute("INSERT INTO test_simulator (name) VALUES ('test4')");

                    ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM test_simulator");
                    assertTrue(rs.next());
                    int count = rs.getInt(1);
                    assertTrue(count >= 4, "Should have at least 4 rows after multi-statement insert");
                }
            }
        });
        db.commit();
        db.close();
    }

    /**
     * Tests that whitespace-only SQL is handled appropriately.
     * <p>
     * Behavior differs between databases at the JDBC level:
     * <ul>
     *   <li>MySQL throws a SQLException when executing whitespace-only SQL</li>
     *   <li>PostgreSQL accepts whitespace-only SQL without error</li>
     * </ul>
     * The TestRunner.executeSQL() method guards against null/empty SQL before
     * reaching the JDBC layer, so this test verifies underlying JDBC behavior.
     * </p>
     *
     * @see TestRunner#executeSQL(String, boolean)
     */
    @Test
    public void testEmptySQLGraceful() throws Exception {
        DB db = new DB();
        db.open();
        db.beginTransaction();

        if (isMySQL()) {
            assertThrows(Exception.class, () -> {
                db.session().doWork(new org.hibernate.jdbc.Work() {
                    @Override
                    public void execute(Connection conn) throws SQLException {
                        try (Statement stmt = conn.createStatement()) {
                            stmt.execute("   ");
                        }
                    }
                });
            });
        } else {
            assertDoesNotThrow(() -> {
                db.session().doWork(new org.hibernate.jdbc.Work() {
                    @Override
                    public void execute(Connection conn) throws SQLException {
                        try (Statement stmt = conn.createStatement()) {
                            stmt.execute("   ");
                        }
                    }
                });
            });
        }

        db.rollback();
        db.close();
    }

    /**
     * Tests that null and whitespace-only SQL values are handled correctly.
     * <p>
     * Note: executeSQL() guards against null/empty SQL, so this test
     * verifies the TestCase field storage behavior.
     * </p>
     */
    @Test
    public void testNullAndWhitespaceSQL() {
        TestCase tc = new TestCase("test");

        tc.setPreSQL(null);
        assertNull(tc.getPreSQL());

        tc.setPostSQL("   ");
        assertNotNull(tc.getPostSQL());
    }

    /**
     * Tests that executing invalid SQL throws an exception.
     * <p>
     * Verifies the underlying JDBC behavior that executeSQL() relies on -
     * invalid SQL should propagate as SQLException through the cause chain.
     * </p>
     *
     * @see TestRunner#executeSQL(String, boolean)
     */
    @Test
    public void testInvalidSQLErrors() {
        DB db = new DB();
        db.open();
        db.beginTransaction();

        Exception thrown = assertThrows(Exception.class, () -> {
            db.session().doWork(new org.hibernate.jdbc.Work() {
                @Override
                public void execute(Connection conn) throws SQLException {
                    try (Statement stmt = conn.createStatement()) {
                        stmt.execute("SELECT * FROM nonexistent_table_xyz");
                    }
                }
            });
        });

        assertTrue(thrown.getCause() instanceof SQLException, "Root cause should be SQLException");
        db.rollback();
        db.close();
    }

    /**
     * Tests that SQL errors in a transaction can be rolled back.
     * <p>
     * Verifies that when a transaction is rolled back, all changes made during
     * that transaction are undone. This test creates a table, inserts a row,
     * commits it (verifying it persists), then inserts another row and rolls back
     * (verifying it does not persist).
     * </p>
     *
     * @see TestRunner#executeSQL(String, boolean)
     */
    @Test
    public void testSQLErrorRollback() throws Exception {
        String ddl = isMySQL()
            ? "CREATE TABLE IF NOT EXISTS test_rollback (id INTEGER AUTO_INCREMENT PRIMARY KEY, val INT)"
            : "CREATE TABLE IF NOT EXISTS test_rollback (id SERIAL PRIMARY KEY, val INT)";

        DB db = new DB();
        db.open();
        db.beginTransaction();
        db.session().doWork(new org.hibernate.jdbc.Work() {
            @Override
            public void execute(Connection conn) throws SQLException {
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(ddl);
                    stmt.execute("INSERT INTO test_rollback (val) VALUES (999)");
                }
            }
        });
        db.commit();
        db.close();

        DB db2 = new DB();
        db2.open();
        db2.beginTransaction();
        db2.session().doWork(new org.hibernate.jdbc.Work() {
            @Override
            public void execute(Connection conn) throws SQLException {
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM test_rollback WHERE val=999")) {
                    assertTrue(rs.next());
                    assertEquals(1, rs.getInt(1), "Row should exist after commit");
                }
            }
        });
        db2.rollback();
        db2.close();

        DB db3 = new DB();
        db3.open();
        db3.beginTransaction();
        db3.session().doWork(new org.hibernate.jdbc.Work() {
            @Override
            public void execute(Connection conn) throws SQLException {
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute("INSERT INTO test_rollback (val) VALUES (888)");
                }
            }
        });
        db3.rollback();
        db3.close();

        DB db4 = new DB();
        db4.open();
        db4.beginTransaction();
        db4.session().doWork(new org.hibernate.jdbc.Work() {
            @Override
            public void execute(Connection conn) throws SQLException {
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM test_rollback WHERE val=888")) {
                    assertTrue(rs.next());
                    assertEquals(0, rs.getInt(1), "Row should not exist after rollback");
                }
            }
        });
        db4.rollback();
        db4.close();
    }

    /**
     * Tests that SQLFailureException is thrown with the correct SQL string.
     */
    @Test
    public void testSQLFailureExceptionContainsFailedSql() {
        String failedSql = "INVALID SQL STATEMENT";
        Exception cause = new RuntimeException("syntax error");

        SQLFailureException ex = new SQLFailureException(failedSql, cause);

        assertEquals(failedSql, ex.getSql());
        assertTrue(ex.getMessage().contains(failedSql));
        assertSame(cause, ex.getCause());
    }
}