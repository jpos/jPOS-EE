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
 * Backward compatibility tests for TestCase.
 * <p>
 * These tests verify that existing TestCase usage without SQL continues to work.
 * Specifically tests:
 * <ul>
 *   <li>TestCase created without SQL fields still functions normally</li>
 *   <li>Dump output does NOT contain SQL elements when no SQL set</li>
 *   <li>All existing result codes work</li>
 *   <li>Pre/post evaluation scripts work alongside SQL fields</li>
 *   <li>null SQL fields don't cause issues</li>
 *   <li>continueOnSqlError defaults to true (backward compatible)</li>
 * </ul>
 * </p>
 *
 * @see TestCase
 */
public class TestCaseBackwardCompatTest extends TestBase {

    /**
     * Creates a TestCase with minimal required messages for dump operations.
     */
    private TestCase createMinimalTestCase() {
        TestCase tc = new TestCase("legacy-test");
        tc.setRequest(new ISOMsg());
        tc.setExpectedResponse(new ISOMsg());
        return tc;
    }

    /**
     * Tests that a TestCase created the old way (no SQL) works normally.
     * <p>
     * This simulates the pre-SQL era where only init/post scripts were used.
     */
    @Test
    public void testTestCaseWithoutSQLFields() {
        TestCase tc = new TestCase("authorization-test");

        // SQL fields should be null by default (backward compatible)
        assertNull(tc.getPreSQL(), "preSQL should be null when not set");
        assertNull(tc.getPostSQL(), "postSQL should be null when not set");

        // Script fields should also be null (existing behavior)
        assertNull(tc.getPreEvaluationScript());
        assertNull(tc.getPostEvaluationScript());

        // Result code should be -1 (unset)
        assertEquals(-1, tc.getResultCode());

        // Test should NOT be ok() when result code is unset
        assertFalse(tc.ok());
    }

    /**
     * Tests that dump() does NOT include SQL elements when no SQL configured.
     * <p>
     * This ensures existing XML output remains unchanged for legacy test cases.
     */
    @Test
    public void testDumpWithoutSQLDoesNotContainSqlElements() {
        TestCase tc = createMinimalTestCase();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        tc.dump(new PrintStream(baos), "  ");

        String output = baos.toString();

        // SQL elements should NOT appear in output
        assertFalse(output.contains("<pre-sql>"), "pre-sql should not appear when preSQL is null");
        assertFalse(output.contains("<post-sql>"), "post-sql should not appear when postSQL is null");

        // Normal elements should still be present
        assertTrue(output.contains("<test-case"), "test-case element should be present");
        assertTrue(output.contains("<request>"), "request element should be present");
        assertTrue(output.contains("<expected-response>"), "expected-response element should be present");
    }

    /**
     * Tests that existing pre/post evaluation scripts still work.
     * <p>
     * SQL fields are nullable and independent of script fields.
     */
    @Test
    public void testScriptsWorkIndependentlyOfSQL() {
        TestCase tc = new TestCase("test");

        // Set scripts (existing functionality)
        tc.setPreEvaluationScript("request.set(7, \"123456789\");");
        tc.setPostEvaluationScript("return response.getString(39).equals(\"00\");");

        // SQL fields remain null (new optional feature)
        assertNull(tc.getPreSQL());
        assertNull(tc.getPostSQL());

        // Both script fields are set
        assertNotNull(tc.getPreEvaluationScript());
        assertNotNull(tc.getPostEvaluationScript());
    }

    /**
     * Tests that SQL fields can be set alongside existing fields.
     */
    @Test
    public void testSQLAndScriptsCanCoexist() {
        TestCase tc = new TestCase("test");

        // Set both scripts AND SQL (new combined usage)
        tc.setPreEvaluationScript("request.set(7, \"123456789\");");
        tc.setPreSQL("INSERT INTO audit_log VALUES ('start')");
        tc.setPostEvaluationScript("return response.getString(39).equals(\"00\");");
        tc.setPostSQL("UPDATE test SET status='done'");

        // All fields should be set
        assertNotNull(tc.getPreEvaluationScript());
        assertNotNull(tc.getPreSQL());
        assertNotNull(tc.getPostEvaluationScript());
        assertNotNull(tc.getPostSQL());
    }

    /**
     * Tests that result codes remain unchanged.
     */
    @Test
    public void testResultCodesUnchanged() {
        TestCase tc = new TestCase("test");

        // OK (0)
        tc.setResultCode(TestCase.OK);
        assertEquals("OK", tc.getResultCodeAsString());
        assertTrue(tc.ok());

        // FAILURE (1)
        tc.setResultCode(TestCase.FAILURE);
        assertEquals("FAILURE", tc.getResultCodeAsString());
        assertFalse(tc.ok());

        // TIMEOUT (2)
        tc.setResultCode(TestCase.TIMEOUT);
        assertEquals("TIMEOUT", tc.getResultCodeAsString());
        assertFalse(tc.ok());
    }

    /**
     * Tests that timeout and continueOnErrors work as before.
     */
    @Test
    public void testTimeoutAndContinueSettingsUnchanged() {
        TestCase tc = new TestCase("test");

        // Default values
        assertEquals(0, tc.getTimeout(), "Default timeout should be 0");
        assertFalse(tc.isContinueOnErrors(), "Default continueOnErrors should be false");

        // Set custom values
        tc.setTimeout(30000);
        tc.setContinueOnErrors(true);

        assertEquals(30000, tc.getTimeout());
        assertTrue(tc.isContinueOnErrors());
    }

    /**
     * Tests that start/end/elapsed work correctly without SQL.
     */
    @Test
    public void testTimingWorksWithoutSQL() {
        TestCase tc = new TestCase("test");

        assertEquals(0, tc.elapsed(), "Elapsed should be 0 before start()");

        tc.start();
        try {
            Thread.sleep(10); // Small delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        tc.end();

        assertTrue(tc.elapsed() >= 10, "Elapsed should be at least 10ms after 10ms sleep");
    }

    /**
     * Tests that setFilename works as before.
     */
    @Test
    public void testFilenameSettingUnchanged() {
        TestCase tc = new TestCase("test");

        assertNull(tc.getFilename(), "Filename should be null initially");

        tc.setFilename("/path/to/test_0200");
        assertEquals("/path/to/test_0200", tc.getFilename());
    }

    /**
     * Tests that continueOnSqlError defaults to true for backward compatibility.
     * <p>
     * Existing test configurations without continue-on-sql-error attribute
     * should continue to work (SQL errors logged but not thrown).
     * </p>
     */
    @Test
    public void testContinueOnSqlErrorDefaultsToTrue() {
        TestCase tc = new TestCase("legacy-test");
        assertTrue(tc.isContinueOnSqlError(), "continueOnSqlError should default to true for backward compatibility");
    }

    /**
     * Tests that legacy tests without SQL can still set continueOnSqlError.
     */
    @Test
    public void testLegacyTestsCanSetContinueOnSqlError() {
        TestCase tc = new TestCase("legacy-test");

        // Default is true (backward compatible)
        assertTrue(tc.isContinueOnSqlError());

        // Can be explicitly set to false for stricter SQL error handling
        tc.setContinueOnSqlError(false);
        assertFalse(tc.isContinueOnSqlError());

        // Legacy behavior restored by default
        tc.setContinueOnSqlError(true);
        assertTrue(tc.isContinueOnSqlError());
    }

    /**
     * Tests that continueOnSqlError is independent of continueOnErrors.
     */
    @Test
    public void testContinueOnSqlErrorIndependentOfContinueOnErrors() {
        TestCase tc = new TestCase("test");

        // Defaults: continueOnErrors=false, continueOnSqlError=true
        assertFalse(tc.isContinueOnErrors());
        assertTrue(tc.isContinueOnSqlError());

        // Can be set independently
        tc.setContinueOnErrors(true);
        tc.setContinueOnSqlError(false);

        assertTrue(tc.isContinueOnErrors());
        assertFalse(tc.isContinueOnSqlError());
    }
}