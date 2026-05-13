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
import org.jpos.iso.ISOUtil;
import org.jpos.util.Loggeable;
import java.io.PrintStream;

/**
 * Represents a single test case within a simulator test suite.
 * <p>
 * A TestCase encapsulates all information needed to execute a single ISO-8583
 * message test, including the request, expected response, evaluation scripts,
 * and SQL statements to be executed before and/or after the test.
 * </p>
 * <p>
 * The test lifecycle is:
 * <ol>
 *   <li>{@link #start()} - marks test start time</li>
 *   <li>Optional: execute pre-evaluation script via BSH</li>
 *   <li>Optional: execute preSQL via JDBC</li>
 *   <li>Send request to MUX</li>
 *   <li>Receive and validate response</li>
 *   <li>Optional: execute postSQL via JDBC</li>
 *   <li>Optional: execute post-evaluation script via BSH</li>
 *   <li>{@link #end()} - marks test end time</li>
 * </ol>
 * </p>
 *
 * @author Alejandro P. Revilla
 * @author <a href="mailto:support@jpos.org">jPOS Support Team</a>
 * @version $Revision: 1.17 $ $Date: 2006/06/06 00:19:32 $
 * @see TestRunner
 * @see <a href="https://www.jpos.org/wiki/ClientSimulator">Client Simulator Documentation</a>
 */
public class TestCase implements Loggeable {
    /** Test completed successfully */
    public static final int OK      = 0;

    /** Test failed - response mismatch or assertion error */
    public static final int FAILURE = 1;

    /** Test timed out - no response received within timeout period */
    public static final int TIMEOUT = 2;

    /** Test case name identifier */
    String name;

    /** Test start timestamp (milliseconds since epoch) */
    long start;

    /** Test end timestamp (milliseconds since epoch) */
    long end;

    /** Request timeout in milliseconds */
    long timeout;

    /** Original request message */
    ISOMsg request;

    /** Request after property substitution and script evaluation */
    ISOMsg expandedRequest;

    /** Actual response received from the MUX */
    ISOMsg response;

    /** Expected response for comparison */
    ISOMsg expectedResponse;

    /** BeanShell script executed before sending request (optional) */
    String preEvaluationScript;

    /** BeanShell script executed after receiving response (optional) */
    String postEvaluationScript;

    /**
     * SQL statement(s) executed before sending the request.
     * <p>
     * Multiple statements can be separated by semicolons (;).
     * The SQL is executed via JDBC using the Hibernate session.
     * </p>
     * <p>
     * Example usage in test suite XML:
     * <pre>&lt;pre-sql&gt;INSERT INTO audit_log (test_id) VALUES (123)&lt;/pre-sql&gt;</pre>
     * </p>
     *
     * @see TestRunner#executeSQL(String)
     */
    String preSQL;

    /**
     * SQL statement(s) executed after receiving and validating the response.
     * <p>
     * Multiple statements can be separated by semicolons (;).
     * The SQL is executed via JDBC using the Hibernate session.
     * </p>
     * <p>
     * Example usage in test suite XML:
     * <pre>&lt;post-sql&gt;UPDATE test_status SET completed=NOW() WHERE test_id=123&lt;/post-sql&gt;</pre>
     * </p>
     *
     * @see TestRunner#executeSQL(String)
     */
    String postSQL;

    /**
     * If true, continue running tests even if SQL execution fails.
     * <p>
     * When false (default: true for backward compatibility), a SQL failure
     * will throw {@link SQLFailureException} and stop test execution.
     * </p>
     */
    private boolean continueOnSqlError;

    /** Result code indicating test outcome */
    int resultCode;

    /** If true, continue executing tests even if this one fails */
    boolean continueOnErrors;

    /** Path to the test case files (used for error reporting) */
    private String testcasePath;

    /** Number of times to repeat this test case */
    private long count;

    /**
     * Creates a new TestCase with the specified name.
     *
     * @param name Unique identifier for this test case
     */
    public TestCase (String name) {
        super();
        this.name = name;
        this.resultCode = -1;
        this.continueOnErrors = false;
        this.continueOnSqlError = true;
    }

    /**
     * Sets the original ISO-8583 request message.
     *
     * @param request The request message to send
     */
    public void setRequest (ISOMsg request) {
        this.request = request;
    }

    /**
     * Sets the actual response received from the MUX.
     *
     * @param response The response message received
     */
    public void setResponse (ISOMsg response) {
        this.response = response;
    }

    /**
     * Sets the request after property substitution and script evaluation.
     *
     * @param expandedRequest The expanded request message
     */
    public void setExpandedRequest (ISOMsg expandedRequest) {
        this.expandedRequest = expandedRequest;
    }

    /**
     * Sets the expected response for validation.
     *
     * @param expectedResponse The expected response message
     */
    public void setExpectedResponse (ISOMsg expectedResponse) {
        this.expectedResponse = expectedResponse;
    }

    /**
     * Returns the test case name.
     *
     * @return The test case name
     */
    public String getName () {
        return name;
    }

    /**
     * Sets the BeanShell script to execute before sending the request.
     * <p>
     * The script has access to variables "testcase" (this TestCase) and "request" (the ISOMsg).
     * </p>
     *
     * @param preEvaluationScript BSH script to execute pre-request
     */
    public void setPreEvaluationScript (String preEvaluationScript) {
        this.preEvaluationScript = preEvaluationScript;
    }

    /**
     * Returns the pre-evaluation script.
     *
     * @return The BSH script, or null if not set
     */
    public String getPreEvaluationScript () {
        return preEvaluationScript;
    }

    /**
     * Sets the BeanShell script to execute after receiving the response.
     * <p>
     * The script has access to variables "testcase" (this TestCase) and "response" (the ISOMsg).
     * If the script returns Boolean.FALSE, the test is marked as failed.
     * </p>
     *
     * @param postEvaluationScript BSH script to execute post-response
     */
    public void setPostEvaluationScript (String postEvaluationScript) {
        this.postEvaluationScript = postEvaluationScript;
    }

    /**
     * Returns the post-evaluation script.
     *
     * @return The BSH script, or null if not set
     */
    public String getPostEvaluationScript () {
        return postEvaluationScript;
    }

    /**
     * Sets the SQL statement(s) to execute before sending the request.
     * <p>
     * Multiple statements can be separated by semicolons.
     * The SQL is executed using the database connection from {@link org.jpos.ee.DB}.
     * </p>
     * <p>
     * Example:
     * <pre>setPreSQL("INSERT INTO audit_log (test_name) VALUES ('test1')");</pre>
     * </p>
     *
     * @param preSQL SQL statement(s) to execute pre-request, or null for no pre-SQL
     * @see #getPreSQL()
     * @see TestRunner#executeSQL(String)
     */
    public void setPreSQL (String preSQL) {
        this.preSQL = preSQL;
    }

    /**
     * Returns the SQL statement(s) to execute before the request.
     *
     * @return The pre-SQL statement(s), or null if not set
     * @see #setPreSQL(String)
     */
    public String getPreSQL () {
        return preSQL;
    }

    /**
     * Sets the SQL statement(s) to execute after receiving the response.
     * <p>
     * Multiple statements can be separated by semicolons.
     * The SQL is executed using the database connection from {@link org.jpos.ee.DB}.
     * </p>
     * <p>
     * Example:
     * <pre>setPostSQL("UPDATE test_status SET done=1 WHERE id=123; INSERT INTO results VALUES (456)");</pre>
     * </p>
     *
     * @param postSQL SQL statement(s) to execute post-response, or null for no post-SQL
     * @see #getPostSQL()
     * @see TestRunner#executeSQL(String)
     */
    public void setPostSQL (String postSQL) {
        this.postSQL = postSQL;
    }

    /**
     * Returns the SQL statement(s) to execute after the response.
     *
     * @return The post-SQL statement(s), or null if not set
     * @see #setPostSQL(String)
     */
    public String getPostSQL () {
        return postSQL;
    }

    /**
     * Returns the original request message.
     *
     * @return The request ISOMsg, or null if not set
     */
    public ISOMsg getRequest() {
        return request;
    }

    /**
     * Returns the expanded request message (after property substitution).
     *
     * @return The expanded request ISOMsg, or null if not set
     */
    public ISOMsg getExpandedRequest() {
        return expandedRequest;
    }

    /**
     * Returns the actual response received.
     *
     * @return The response ISOMsg, or null if not yet received
     */
    public ISOMsg getResponse() {
        return response;
    }

    /**
     * Returns the expected response for validation.
     *
     * @return The expected response ISOMsg, or null if not set
     */
    public ISOMsg getExpectedResponse() {
        return expectedResponse;
    }

    /**
     * Sets the result code for this test case.
     *
     * @param resultCode One of: {@link #OK}, {@link #FAILURE}, {@link #TIMEOUT}, or custom code
     */
    public void setResultCode (int resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * Returns the result code for this test case.
     *
     * @return The result code: {@link #OK}, {@link #FAILURE}, {@link #TIMEOUT}, or custom code
     */
    public int getResultCode () {
        return resultCode;
    }

    /**
     * Returns the result code as a human-readable string.
     *
     * @return "OK", "FAILURE", "TIMEOUT", or the numeric code as a string
     */
    public String getResultCodeAsString () {
        switch (resultCode) {
            case OK :
                return "OK";
            case FAILURE:
                return "FAILURE";
            case TIMEOUT:
                return "TIMEOUT";
            default:
                return Integer.toString (resultCode);
        }
    }

    /**
     * Dumps the test case state to the provided PrintStream in XML format.
     * <p>
     * The output includes request, expanded request, expected response,
     * actual response, pre-SQL, post-SQL, and elapsed time.
     * </p>
     *
     * @param p     The PrintStream to write to
     * @param indent The indentation string for nested elements
     */
    public void dump (PrintStream p, String indent) {
        String inner = indent + "  ";
        p.println (indent + "<test-case name='" + name + "'>");
        p.println (inner + "<request>");
        request.dump (p, inner + "  ");
        p.println (inner + "</request>");
        if (expandedRequest != null) {
            p.println (inner + "<expanded-request>");
            expandedRequest.dump (p, inner + "  ");
            p.println (inner + "</expanded-request>");
        }
        p.println (inner + "<expected-response>");
        expectedResponse.dump (p, inner + "  ");
        p.println (inner + "</expected-response>");
        if (response != null) {
            p.println (inner + "<response>");
            response.dump (p, inner + "  ");
            p.println (inner + "</response>");
        }
        if (preSQL != null) {
            p.println (inner + "<pre-sql>");
            p.println (inner + "  " + preSQL);
            p.println (inner + "</pre-sql>");
        }
        if (postSQL != null) {
            p.println (inner + "<post-sql>");
            p.println (inner + "  " + postSQL);
            p.println (inner + "</post-sql>");
        }
        p.println (inner + "<elapsed>" + elapsed() + "</elapsed>");
        p.println (indent + "</test-case>");
    }

    /**
     * Returns a single-line string representation of the test case result.
     * <p>
     * Format: "test-case-name-here                    [OK] 123ms."
     * </p>
     *
     * @return String representation of test case status
     */
    public String toString() {
        StringBuffer sb = new StringBuffer(ISOUtil.strpad (name, 50));
        sb.append (" [");
        sb.append (getResultCodeAsString());
        sb.append ("] ");
        sb.append (elapsed());
        sb.append ("ms.");
        return sb.toString();
    }

    /**
     * Marks the start time of the test case.
     * <p>
     * Typically called just before sending the request to the MUX.
     * </p>
     *
     * @see #end()
     */
    public void start() {
        start = System.currentTimeMillis();
    }

    /**
     * Marks the end time of the test case.
     * <p>
     * Typically called after receiving and processing the response.
     * </p>
     *
     * @see #start()
     */
    public void end () {
        end = System.currentTimeMillis();
    }

    /**
     * Calculates the elapsed time in milliseconds.
     * <p>
     * If start has been set but end has not, automatically calls {@link #end()}.
     * </p>
     *
     * @return Elapsed time in milliseconds
     */
    public long elapsed() {
        if (start != 0 && end == 0)
            end();
        return end - start;
    }

    /**
     * Returns true if the test case completed successfully.
     *
     * @return true if result code is {@link #OK}
     */
    public boolean ok() {
        return resultCode == OK;
    }

    /**
     * Sets whether to continue running tests if this one fails.
     *
     * @param continueOnErrors true to continue on failure, false to stop
     */
    public void setContinueOnErrors (boolean continueOnErrors) {
        this.continueOnErrors = continueOnErrors;
    }

    /**
     * Returns whether to continue on errors.
     *
     * @return true if continue on failure is enabled
     */
    public boolean isContinueOnErrors () {
        return continueOnErrors;
    }

    /**
     * Sets whether to continue running tests if SQL execution fails.
     * <p>
     * When false, a SQL failure will throw {@link SQLFailureException} and stop test execution.
     * Default is true for backward compatibility with existing test configurations.
     * </p>
     *
     * @param continueOnSqlError true to continue on SQL error, false to stop
     * @see #isContinueOnSqlError()
     */
    public void setContinueOnSqlError (boolean continueOnSqlError) {
        this.continueOnSqlError = continueOnSqlError;
    }

    /**
     * Returns whether to continue on SQL errors.
     *
     * @return true if continuing on SQL error is enabled
     */
    public boolean isContinueOnSqlError () {
        return continueOnSqlError;
    }

    /**
     * Sets the request timeout in milliseconds.
     *
     * @param timeout Timeout in milliseconds
     */
    public void setTimeout (long timeout) {
        this.timeout = timeout;
    }

    /**
     * Returns the request timeout in milliseconds.
     *
     * @return Timeout in milliseconds
     */
    public long getTimeout () {
        return timeout;
    }

    /**
     * Sets the file path associated with this test case.
     * <p>
     * Used for error reporting and logging.
     * </p>
     *
     * @param string The file path to the test case files
     */
    public void setFilename(String string) {
        testcasePath  = string;
    }

    /**
     * Returns the file path associated with this test case.
     *
     * @return The file path, or null if not set
     */
    public String getFilename() {
        return testcasePath;
    }

    /**
     * Sets the number of times to repeat this test case.
     *
     * @param count Number of repetitions (default is 1)
     */
	public void setCount(long count) {
		this.count = count;
	}

    /**
     * Returns the repetition count.
     *
     * @return Number of times to repeat this test case
     */
    public long getCount() {
        return count;
    }
}