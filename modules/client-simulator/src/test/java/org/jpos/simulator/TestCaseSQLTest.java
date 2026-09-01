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

import org.jpos.iso.ISOMsg;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for SQL-related functionality in TestCase.
 * <p>
 * Tests cover:
 * <ul>
 *   <li>Pre-SQL and Post-SQL getter/setter methods</li>
 *   <li>XML dump output for SQL elements</li>
 *   <li>Result code string representations</li>
 *   <li>continueOnSqlError field getter/setter</li>
 *   <li>SQLFailureException behavior</li>
 * </ul>
 * </p>
 *
 * @see TestCase
 * @see TestBase
 */
public class TestCaseSQLTest extends TestBase {

    /**
     * Creates a minimal TestCase with request/response messages set.
     * <p>
     * This is needed because TestCase.dump() accesses request and expectedResponse.
     * </p>
     *
     * @return A configured TestCase instance
     */
    private TestCase createTestCase() {
        TestCase tc = new TestCase("test-case");
        tc.setRequest(new ISOMsg());
        tc.setExpectedResponse(new ISOMsg());
        return tc;
    }

    /**
     * Tests that pre-SQL getter/setter work correctly.
     */
    @Test
    public void testPreSQLGetterSetter() {
        TestCase tc = new TestCase("test-case");

        // Initially null
        assertNull(tc.getPreSQL());

        // Set value
        tc.setPreSQL("SELECT * FROM users");
        assertEquals("SELECT * FROM users", tc.getPreSQL());
    }

    /**
     * Tests that post-SQL getter/setter work correctly.
     */
    @Test
    public void testPostSQLGetterSetter() {
        TestCase tc = new TestCase("test-case");

        // Initially null
        assertNull(tc.getPostSQL());

        // Set value
        tc.setPostSQL("UPDATE users SET last_access = NOW()");
        assertEquals("UPDATE users SET last_access = NOW()", tc.getPostSQL());
    }

    /**
     * Tests that dump() outputs pre-sql element when preSQL is set.
     */
    @Test
    public void testDumpWithPreSQLOnly() {
        TestCase tc = createTestCase();
        tc.setPreSQL("SELECT 1");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        tc.dump(new PrintStream(baos), "  ");

        String output = baos.toString();
        assertTrue(output.contains("<pre-sql>"), "Should contain pre-sql element");
        assertTrue(output.contains("SELECT 1"), "Should contain pre-sql value");
        assertFalse(output.contains("<post-sql>"), "Should not contain post-sql element when null");
    }

    /**
     * Tests that dump() outputs post-sql element when postSQL is set.
     */
    @Test
    public void testDumpWithPostSQLOnly() {
        TestCase tc = createTestCase();
        tc.setPostSQL("SELECT 2");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        tc.dump(new PrintStream(baos), "  ");

        String output = baos.toString();
        assertFalse(output.contains("<pre-sql>"), "Should not contain pre-sql element when null");
        assertTrue(output.contains("<post-sql>"), "Should contain post-sql element");
        assertTrue(output.contains("SELECT 2"), "Should contain post-sql value");
    }

    /**
     * Tests result code string representations.
     */
    @Test
    public void testResultCodes() {
        TestCase tc = new TestCase("test-case");

        // Test OK
        tc.setResultCode(TestCase.OK);
        assertEquals("OK", tc.getResultCodeAsString());

        // Test FAILURE
        tc.setResultCode(TestCase.FAILURE);
        assertEquals("FAILURE", tc.getResultCodeAsString());

        // Test TIMEOUT
        tc.setResultCode(TestCase.TIMEOUT);
        assertEquals("TIMEOUT", tc.getResultCodeAsString());

        // Test unknown code returns numeric string
        tc.setResultCode(99);
        assertEquals("99", tc.getResultCodeAsString());
    }

    /**
     * Tests that continueOnSqlError defaults to true.
     */
    @Test
    public void testContinueOnSqlErrorDefaultsToTrue() {
        TestCase tc = new TestCase("test-case");
        assertTrue(tc.isContinueOnSqlError(), "continueOnSqlError should default to true");
    }

    /**
     * Tests that continueOnSqlError getter/setter work correctly.
     */
    @Test
    public void testContinueOnSqlErrorGetterSetter() {
        TestCase tc = new TestCase("test-case");

        // Default is true
        assertTrue(tc.isContinueOnSqlError());

        // Set to false
        tc.setContinueOnSqlError(false);
        assertFalse(tc.isContinueOnSqlError());

        // Set back to true
        tc.setContinueOnSqlError(true);
        assertTrue(tc.isContinueOnSqlError());
    }

    /**
     * Tests that SQLFailureException captures the failed SQL.
     */
    @Test
    public void testSQLFailureExceptionCapturesSql() {
        String failedSql = "INSERT INTO invalid_table VALUES (1)";
        Exception cause = new RuntimeException("table does not exist");

        SQLFailureException ex = new SQLFailureException(failedSql, cause);

        assertEquals(failedSql, ex.getSql());
        assertNotNull(ex.getMessage());
        assertTrue(ex.getMessage().contains(failedSql));
        assertEquals(cause, ex.getCause());
    }

    /**
     * Tests that SQLFailureException message contains the failed SQL.
     */
    @Test
    public void testSQLFailureExceptionMessage() {
        String failedSql = "DELETE FROM users WHERE id=1";
        Exception cause = new RuntimeException("connection refused");

        SQLFailureException ex = new SQLFailureException(failedSql, cause);

        assertTrue(ex.getMessage().contains("SQL execution failed"));
        assertTrue(ex.getMessage().contains(failedSql));
    }

    /**
     * Tests that SQLFailureException extends RuntimeException.
     */
    @Test
    public void testSQLFailureExceptionIsRuntimeException() {
        SQLFailureException ex = new SQLFailureException("test", new RuntimeException());
        assertInstanceOf(RuntimeException.class, ex);
    }

    /**
     * Tests that SQLFailureException can be caught as Exception.
     */
    @Test
    public void testSQLFailureExceptionCatchable() {
        try {
            throw new SQLFailureException("test sql", new RuntimeException());
        } catch (Exception e) {
            assertInstanceOf(SQLFailureException.class, e);
            assertEquals("test sql", ((SQLFailureException) e).getSql());
        }
    }
}