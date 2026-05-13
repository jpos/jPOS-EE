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

import bsh.BshClassManager;
import bsh.EvalError;
import bsh.Interpreter;
import bsh.UtilEvalError;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.hibernate.Session;
import org.hibernate.jdbc.Work;
import org.jdom2.Element;
import org.jpos.core.Environment;
import org.jpos.ee.DB;
import org.jpos.iso.*;
import org.jpos.iso.packager.XMLPackager;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;
import org.jpos.util.NameRegistrar;
import org.xml.sax.SAXException;

/**
 * TestRunner executes a suite of simulator test cases against an ISO-8583 MUX.
 * <p>
 * TestRunner is a QBean that loads test case definitions from an XML configuration
 * and executes them sequentially. Each test case can include:
 * <ul>
 *   <li>Pre-evaluation BeanShell scripts (to prepare request data)</li>
 *   <li>Pre-SQL statements (to perform database operations before the request)</li>
 *   <li>ISO-8583 request/response exchange via MUX</li>
 *   <li>Post-SQL statements (to perform database operations after the response)</li>
 *   <li>Post-evaluation BeanShell scripts (to validate response data)</li>
 * </ul>
 * </p>
 * <p>
 * Configuration example in a Q2 deploy.xml:
 * <pre>
 * &lt;test-runner realm="simulator" class="org.jpos.simulator.TestRunner"&gt;
 *     &lt;property name="mux" value="mux.selector"/&gt;
 *     &lt;property name="timeout" value="30000"/&gt;
 *     &lt;property name="sessions" value="1"/&gt;
 *     &lt;property name="shutdown" value="true"/&gt;
 *     &lt;test-suite&gt;
 *         &lt;path&gt;/opt/simulator/tests/&lt;/path&gt;
 *         &lt;test name="authorization" file="0200" continue-on-sql-error="no"&gt;
 *             &lt;init&gt;...optional BSH script...&lt;/init&gt;
 *             &lt;pre-sql&gt;...optional SQL...&lt;/pre-sql&gt;
 *             &lt;post&gt;...optional BSH script...&lt;/post&gt;
 *             &lt;post-sql&gt;...optional SQL...&lt;/post-sql&gt;
 *         &lt;/test&gt;
 *     &lt;/test-suite&gt;
 * &lt;/test-runner&gt;
 * </pre>
 * </p>
 *
 * @author Alejandro P. Revilla
 * @author <a href="mailto:support@jpos.org">jPOS Support Team</a>
 * @version $Revision: 1.17 $ $Date: 2006/06/06 00:19:32 $
 * @see TestCase
 * @see <a href="https://www.jpos.org/wiki/ClientSimulator">Client Simulator Documentation</a>
 */
public class TestRunner extends org.jpos.q2.QBeanSupport implements Runnable {

  /** MUX used to send/receive ISO-8583 messages */
  MUX mux;

  /** Packager for parsing test case message files */
  ISOPackager packager;

  /** BeanShell interpreter for evaluating scripts */
  Interpreter bsh;

  /** Default timeout for requests without per-test timeout */
  long timeout;

  /** Newline separator for log output */
  private static final String NL = System.getProperty("line.separator");

  /** Default request timeout (60 seconds) */
  public static final long TIMEOUT = 60000;

  /**
   * Creates a new TestRunner instance.
   */
  public TestRunner() {
    super();
  }

  /**
   * Initializes the service by loading the packager configuration.
   * <p>
   * The packager class can be specified via the "packager" configuration property.
   * If not specified, a default XMLPackager is used.
   * </p>
   *
   * @throws ISOException if the packager cannot be instantiated
   */
  protected void initService() throws ISOException {
    String packagerClass = cfg.get("packager", null);
    timeout = cfg.getLong("timeout", TIMEOUT);
    if (packagerClass != null) {
      try {
        packager = (ISOPackager) Class.forName(packagerClass).newInstance();
      } catch (
        InstantiationException
        | IllegalAccessException
        | ClassNotFoundException e
      ) {
        throw new ISOException("Error instatiating packager", e);
      }
    } else {
      packager = getDefaultPackager();
    }
  }

  /**
   * Starts the service by creating a thread pool and launching runner threads.
   * <p>
   * The number of concurrent sessions is controlled by the "sessions" configuration property.
   * If "shutdown" is true, the Q2 server will be shut down after all tests complete or on timeout.
   * </p>
   */
  protected void startService() {
    int sessions = cfg.getInt("sessions", 1);
    ExecutorService executor = Executors.newCachedThreadPool();
    for (int i = 0; i < sessions; i++) executor.execute(this);
    executor.shutdown();
    if (cfg.getBoolean("shutdown")) {
      Executors.newSingleThreadExecutor().execute(() -> {
        try {
          if (!executor.awaitTermination(timeout, TimeUnit.MILLISECONDS)) {
            log.warn("Runners didn't finish before global timeout");
          }
        } catch (InterruptedException e) {
          log.warn("interrupted while awaiting workers termination", e);
        }
        getServer().shutdown();
      });
    }
  }

  /**
   * Main execution loop - loads test suite and runs all test cases.
   * <p>
   * This method is called by each runner thread. It initializes the BeanShell interpreter,
   * looks up the MUX from the NameRegistrar, loads the test suite, and executes it.
   * </p>
   */
  public void run() {
    try {
      Interpreter bsh = initBSH();
      mux = (MUX) NameRegistrar.get("mux." + cfg.get("mux"));
      List suite = initSuite(getPersist().getChild("test-suite"));
      runSuite(suite, mux, bsh);
    } catch (NameRegistrar.NotFoundException e) {
      LogEvent evt = getLog().createError();
      evt.addMessage(e);
      evt.addMessage(NameRegistrar.getInstance());
      Logger.log(evt);
    } catch (Throwable t) {
      getLog().error(t);
    }
  }

 /**
    * Runs the complete test suite, executing each test case in order.
    * <p>
    * For each test case:
    * <ol>
    *   <li>Execute pre-evaluation script (if configured)</li>
     *   <li>Execute pre-SQL (if configured) — catches {@link SQLFailureException}</li>
    *   <li>Clone and expand the request message</li>
    *   <li>Send request to MUX and measure elapsed time</li>
     *   <li>Execute post-SQL (if configured and response was expected) — catches {@link SQLFailureException}</li>
    *   <li>Validate response and set result code</li>
    * </ol>
    * </p>
    * <p>
    * When {@code continue-on-sql-error="no"} is set on a test case, SQL execution failures
    * are caught, logged, and cause the test to fail. If {@code continue="yes"} is also set,
    * subsequent tests will still run.
    * </p>
    *
    * @param suite List of TestCase objects to execute
    * @param mux The MUX to use for sending/receiving messages
    * @param bsh BeanShell interpreter for script evaluation
    * @throws ISOException if message processing fails
    * @throws IOException if file operations fail
    * @throws EvalError if script evaluation fails
    */
  private void runSuite(List suite, MUX mux, Interpreter bsh)
    throws ISOException, IOException, EvalError {
    LogEvent evt = getLog().createLogEvent("results");
    LogEvent evt_error = null;
    Iterator iter = suite.iterator();
    long start = System.currentTimeMillis();
    long serverTime = 0;
    for (int i = 1; iter.hasNext(); i++) {
      evt_error = getLog().createLogEvent("error");
      TestCase tc = (TestCase) iter.next();
      for (long repetition = 0; repetition < tc.getCount(); repetition++) {
        getLog().trace(
          "---------------------------[ " +
            tc.getName() +
            " ]---------------------------"
        );

        ISOMsg m = (ISOMsg) tc.getRequest().clone();
        // Execute pre-evaluation script if configured
        if (tc.getPreEvaluationScript() != null) {
          bsh.set("testcase", tc);
          bsh.set("request", m);
          bsh.eval(tc.getPreEvaluationScript());
        }
        // Execute pre-SQL if configured (e.g., setup test data)
        if (tc.getPreSQL() != null) {
          try {
            executeSQL(tc.getPreSQL(), tc.isContinueOnSqlError());
          } catch (SQLFailureException e) {
            getLog().error(e);
            tc.setResultCode(TestCase.FAILURE);
            if (!tc.isContinueOnErrors()) break;
          }
        }
        // Apply property substitutions and expand request
        tc.setExpandedRequest(applyRequestProps(m, bsh));
        tc.start();
        if (tc.getExpectedResponse() != null) {
          // Send request and wait for response
          tc.setResponse(mux.request(m, tc.getTimeout()));
          tc.end();
          assertResponse(tc, bsh, evt_error);
          // Execute post-SQL if configured (e.g., record test result)
          if (tc.getPostSQL() != null) {
            try {
              executeSQL(tc.getPostSQL(), tc.isContinueOnSqlError());
            } catch (SQLFailureException e) {
              getLog().error(e);
              tc.setResultCode(TestCase.FAILURE);
              if (!tc.isContinueOnErrors()) break;
            }
          }
          evt.addMessage(i + ": " + tc.toString());
          if (evt_error.getPayLoad().size() != 0) {
            evt_error.addMessage("filename", tc.getFilename());
            evt.addMessage(NL + evt_error.toString("    "));
          }
          serverTime += tc.elapsed();
          if (!tc.ok() && !tc.isContinueOnErrors()) break;
        } else {
          // Fire-and-forget mode: send without expecting response
          mux.send(m);
          tc.end();
          // Execute post-SQL even for fire-and-forget
          if (tc.getPostSQL() != null) {
            try {
              executeSQL(tc.getPostSQL(), tc.isContinueOnSqlError());
            } catch (SQLFailureException e) {
              getLog().error(e);
              tc.setResultCode(TestCase.FAILURE);
              if (!tc.isContinueOnErrors()) break;
            }
          }
          tc.setResultCode(TestCase.OK);
          evt.addMessage(i + ": " + tc.toString() + " (response ignored)");
        }
      }
      if (!tc.ok()) {
        getLog().error(tc);
        if (!tc.isContinueOnErrors()) break;
      }
    }
    long end = System.currentTimeMillis();

    // Calculate timing statistics
    long simulatorTime = end - start - serverTime;
    long total = end - start;

    evt.addMessage(
      "elapsed server=" +
        serverTime +
        "ms(" +
        percentage(serverTime, total) +
        "%)" +
        ", simulator=" +
        simulatorTime +
        "ms(" +
        percentage(simulatorTime, total) +
        "%)" +
        ", total=" +
        total +
        "ms, shutdown=" +
        cfg.getBoolean("shutdown")
    );
    ISOUtil.sleep(100); // let the channel do its logging first
    if (cfg.getBoolean("shutdown")) evt.addMessage("waiting for shutdown");

    Logger.log(evt);
  }

  /**
   * Initializes a test suite from the XML configuration element.
   * <p>
   * Each &lt;test&gt; element creates a TestCase with the following properties:
   * <ul>
   *   <li>name: Test case name (defaults to file attribute)</li>
   *   <li>file: Base filename for _s (send) and _r (receive) message files</li>
   *   <li>count: Number of repetitions (default 1)</li>
   *   <li>continue: "yes" to continue on failure (default false)</li>
   *   <li>timeout: Per-test timeout override (default uses global timeout)</li>
   *   <li>init: Pre-evaluation BeanShell script</li>
   *   <li>post: Post-evaluation BeanShell script</li>
  *   <li>pre-sql: SQL to execute before sending request</li>
    *   <li>post-sql: SQL to execute after receiving response</li>
    *   <li>continue-on-sql-error: "no" to fail test on SQL error (default: true/yes)</li>
    * </ul>
    * </p>
   *
   * @param suite The XML element containing test case definitions
   * @return List of initialized TestCase objects
   * @throws IOException if message files cannot be read
   * @throws ISOException if message files cannot be parsed
   */
  private List<TestCase> initSuite(Element suite)
    throws IOException, ISOException {
    List<TestCase> l = new ArrayList<>();
    String prefix = suite.getChildTextTrim("path");
    Iterator iter = suite.getChildren("test").iterator();
    while (iter.hasNext()) {
      Element e = (Element) iter.next();
      boolean cont = "yes".equals(e.getAttributeValue("continue"));
      String s = e.getAttributeValue("count");
      int count = s != null ? Integer.parseInt(s) : 1;
      String path = e.getAttributeValue("file");
      String name = e.getAttributeValue("name");
      if (name == null) name = path;

      TestCase tc = new TestCase(name);
      tc.setCount(count);
      tc.setContinueOnErrors(cont);
      String coSql = e.getAttributeValue("continue-on-sql-error");
      if (coSql != null) tc.setContinueOnSqlError("yes".equals(coSql));
      tc.setRequest(getMessage(prefix + path + "_s"));
      tc.setExpectedResponse(getMessage(prefix + path + "_r"));
      tc.setPreEvaluationScript(e.getChildTextTrim("init"));
      tc.setPostEvaluationScript(e.getChildTextTrim("post"));
      // Parse SQL statements from XML configuration
      tc.setPreSQL(e.getChildTextTrim("pre-sql"));
      tc.setPostSQL(e.getChildTextTrim("post-sql"));
      tc.setFilename(prefix + path);

      String to = e.getAttributeValue("timeout");
      if (to != null) tc.setTimeout(Long.parseLong(to));
      else tc.setTimeout(timeout);
      l.add(tc);
    }
    return l;
  }

  /**
   * Loads an ISO message from a file.
   * <p>
   * The file should contain raw bytes that can be parsed by the configured packager.
   * </p>
   *
   * @param filename Path to the message file
   * @return The parsed ISOMsg, or null if file cannot be read
   * @throws IOException if file cannot be read
   * @throws ISOException if message cannot be parsed
   */
  private ISOMsg getMessage(String filename) throws IOException, ISOException {
    File f = new File(filename);
    ISOMsg m = null;
    if (f.canRead()) {
      try (FileInputStream fis = new FileInputStream(f)) {
        byte[] b = new byte[fis.available()];
        fis.read(b);
        m = new ISOMsg();
        m.setPackager(packager);
        try {
          m.unpack(b);
        } catch (ISOException e) {
          throw new ISOException("Error parsing '" + filename + "'", e);
        }
      }
    }
    return m;
  }

  /**
   * Processes and validates a response message against the expected response.
   * <p>
   * Supports the following field value prefixes:
   * <ul>
   *   <li>! - Evaluate as BeanShell expression (with actual value as "value" variable)</li>
   *   <li>*M - Field is mandatory (must be present in response)</li>
   *   <li>*E - Echo field (copy value from request to expected)</li>
   *   <li>*A - Field should not be present in response</li>
   * </ul>
   * </p>
   *
   * @param er Expanded request (for echo field processing)
   * @param m Actual response received
   * @param expected Expected response
   * @param bsh BeanShell interpreter for ! expressions
   * @param evt LogEvent for accumulating errors
   * @return true if response is valid, false otherwise
   * @throws ISOException if message processing fails
   * @throws EvalError if script evaluation fails
   */
  private boolean processResponse(
    ISOMsg er,
    ISOMsg m,
    ISOMsg expected,
    Interpreter bsh,
    LogEvent evt
  ) throws ISOException, EvalError {
    int maxField = Math.max(m.getMaxField(), expected.getMaxField());

    for (int i = 0; i <= maxField; i++) {
      if (expected.hasField(i)) {
        ISOComponent c = expected.getComponent(i);
        if (c instanceof ISOField) {
          String value = expected.getString(i);
          if (value.charAt(0) == '!' && value.length() > 1) {
            // BeanShell expression evaluation
            bsh.set("value", m.getString(i));
            Object ret = bsh.eval(value.substring(1));
            if (ret instanceof Boolean) {
              if (!(Boolean) ret) {
                evt.addMessage(
                  "field",
                  "[" + i + "] Boolean eval returned false"
                );
              }
            } else if (ret instanceof String) {
              if (m.hasField(i) && !ret.equals(m.getString(i))) {
                evt.addMessage(
                  "field",
                  "[" +
                    i +
                    "] Received:[" +
                    m.getString(i) +
                    "]" +
                    " Expected:[" +
                    ret +
                    "]"
                );
              }
            }
            m.unset(i);
            expected.unset(i);
          } else if (value.startsWith("*M")) {
            // Mandatory field check
            if (m.hasField(i)) {
              expected.unset(i);
              m.unset(i);
            } else {
              evt.addMessage("field", "[" + i + "] Mandatory field missing");
            }
          } else if (value.startsWith("*E")) {
            // Echo field: copy request value to expected
            if (m.hasField(i) && er.hasField(i)) {
              expected.set(i, er.getString(i));
            } else {
              evt.addMessage("field", "[" + i + "] Echo field missing");
            }
          } else if (value.startsWith("*A")) {
            // Field should NOT be present
            if (m.hasField(i)) {
              evt.addMessage(
                "field",
                "[" +
                  i +
                  "] Received:[" +
                  m.getString(i) +
                  "]" +
                  " Expected: Not to be set"
              );
            } else {
              m.unset(i);
              expected.unset(i);
            }
          } else if (m.hasField(i) && !m.getString(i).equals(value)) {
            // Direct comparison
            evt.addMessage(
              "field",
              "[" +
                i +
                "] Received:[" +
                m.getString(i) +
                "]" +
                " Expected:[" +
                value +
                "]"
            );
          }
        } else if (c instanceof ISOMsg) {
          // Nested message (sub-field) processing
          ISOMsg rc = (ISOMsg) m.getComponent(i);
          ISOMsg innerExpectedResponse = (ISOMsg) er.getComponent(i);
          if (rc instanceof ISOMsg) {
            processResponse(
              innerExpectedResponse,
              (ISOMsg) rc,
              (ISOMsg) c,
              bsh,
              evt
            );
          }
        }
      } else {
        m.unset(i);
      }
    }
    if (evt.getPayLoad().size() != 0) {
      return false;
    }
    return true;
  }

  /**
   * Asserts that the response matches the expected response.
   * <p>
   * This method performs the complete validation:
   * <ol>
   *   <li>Check for timeout (null response)</li>
   *   <li>Process field-by-field comparison</li>
   *   <li>Execute post-evaluation script (if configured)</li>
   *   <li>Pack comparison (if using same packager)</li>
   * </ol>
   * </p>
   *
   * @param tc The test case with request/response data
   * @param bsh BeanShell interpreter for script evaluation
   * @param evt LogEvent for accumulating errors
   * @return true if response is valid, false otherwise
   * @throws ISOException if message processing fails
   * @throws EvalError if script evaluation fails
   */
  private boolean assertResponse(TestCase tc, Interpreter bsh, LogEvent evt)
    throws ISOException, EvalError {
    if (tc.getResponse() == null) {
      tc.setResultCode(TestCase.TIMEOUT);
      return false;
    }
    ISOMsg c = (ISOMsg) tc.getResponse().clone();
    ISOMsg expected = (ISOMsg) tc.getExpectedResponse().clone();
    ISOMsg er = (ISOMsg) tc.getExpandedRequest().clone();
    c.setHeader(tc.getResponse().getHeader());
    if (!processResponse(er, c, expected, bsh, evt)) {
      tc.setResultCode(TestCase.FAILURE);
      return false;
    }
    expected.setPackager(null);
    c.setPackager(null);
    ISOPackager p = getDefaultPackager();
    expected.setPackager(p);
    c.setPackager(p);

    // Execute post-evaluation script if configured
    if (tc.getPostEvaluationScript() != null) {
      bsh.set("testcase", tc);
      bsh.set("response", tc.getResponse());
      Object ret = bsh.eval(tc.getPostEvaluationScript());
      if (ret instanceof Boolean && !(Boolean) ret) {
        tc.setResultCode(TestCase.FAILURE);
        return false;
      }
    }
    if (expected.getHeader() == null) c.setHeader((byte[]) null);
    // Final pack comparison
    if (!Arrays.equals(c.pack(), expected.pack())) {
      evt.addMessage("Pack mismatch");
      evt.addMessage("--- expected ---");
      evt.addMessage(ISOUtil.hexdump(expected.pack()));
      evt.addMessage("--- actual ---");
      evt.addMessage(ISOUtil.hexdump(c.pack()));
      tc.setResultCode(TestCase.FAILURE);
      return false;
    }
    tc.setResultCode(TestCase.OK);
    return true;
  }

  /**
   * Evaluates a BeanChild script from an XML element.
   *
   * @param e Parent element
   * @param name Child element name containing the script
   * @param bsh BeanShell interpreter
   * @throws EvalError if script evaluation fails
   */
  private void eval(Element e, String name, Interpreter bsh) throws EvalError {
    Element ee = e.getChild(name);
    if (ee != null) bsh.eval(ee.getText());
  }

  /**
   * Initializes the BeanShell interpreter with jPOS environment and classpath.
   *
   * @return Configured BeanShell interpreter
   * @throws UtilEvalError if class manager setup fails
   * @throws EvalError if initial script evaluation fails
   */
  private Interpreter initBSH() throws UtilEvalError, EvalError {
    Interpreter bsh = new Interpreter();
    BshClassManager bcm = bsh.getClassManager();
    bcm.setClassPath(getServer().getLoader().getURLs());
    bcm.setClassLoader(getServer().getLoader());
    bsh.set("qbean", this);
    bsh.set("log", getLog());
    bsh.eval(getPersist().getChildTextTrim("init"));
    return bsh;
  }

  /**
   * Applies property substitutions to a request message.
   * <p>
   * Supports the following value prefixes:
   * <ul>
   *   <li>$ - Standard property substitution via {@link Environment}</li>
   *   <li>! - BeanShell expression (evaluated dynamically)</li>
   *   <li># - Hex string to bytes conversion</li>
   * </ul>
   * </p>
   *
   * @param m The request message to modify
   * @param bsh BeanShell interpreter for ! expressions
   * @return The modified message
   * @throws ISOException if message processing fails
   * @throws EvalError if script evaluation fails
   */
  private ISOMsg applyRequestProps(ISOMsg m, Interpreter bsh)
    throws ISOException, EvalError {
    int maxField = m.getMaxField();
    for (int i = 0; i <= maxField; i++) {
      if (m.hasField(i)) {
        ISOComponent c = m.getComponent(i);
        if (c instanceof ISOMsg) {
          // Recursively process nested messages
          applyRequestProps((ISOMsg) c, bsh);
        } else if (c instanceof ISOField) {
          String value = Environment.get((String) c.getValue());
          if (value.length() > 0) {
            try {
              if (value.charAt(0) == '!') {
                // Dynamic BeanShell expression
                m.set(i, bsh.eval(value.substring(1)).toString());
              } else if (value.charAt(0) == '#') {
                // Hex to bytes conversion
                m.set(
                  i,
                  ISOUtil.hex2byte(bsh.eval(value.substring(1)).toString())
                );
              } else if (!value.equals(c.getValue())) {
                // Standard property replacement
                m.set(i, value);
              }
            } catch (NullPointerException e) {
              m.unset(i);
            }
          }
        }
      }
    }
    return m;
  }

  /**
   * Calculates percentage value.
   *
   * @param a Numerator
   * @param b Denominator
   * @return (a / b) * 100 as long
   */
  private long percentage(long a, long b) {
    double d = (double) a / b;
    return (long) (d * 100.00);
  }

   /**
     * Executes SQL statement(s) using the Hibernate-managed database connection.
     * <p>
     * This method:
     * <ul>
     *   <li>Opens a connection via {@link DB}</li>
     *   <li>Begins a transaction</li>
     *   <li>Splits SQL by semicolons and executes each statement</li>
     *   <li>Logs SELECT result sets with row data</li>
     *   <li>Logs affected row count for INSERT/UPDATE/DELETE</li>
     *   <li>Commits the transaction on success</li>
     *   <li>Rolls back the transaction on failure if {@code continueOnError} is false</li>
     * </ul>
     * </p>
     * <p>
     * If the SQL is null, empty, or whitespace-only, the method returns immediately
     * without any database operations.
     * </p>
     * <p>
      * When {@code continueOnError} is false and an error occurs, a {@link SQLFailureException}
     * is thrown to stop test execution. When true, errors are logged but the method returns normally.
     * </p>
     * <p>
     * Note: The database connection is configured via cfg/db.properties which
     * should contain Hibernate connection properties (url, username, password, driver).
     * </p>
     *
     * @param sql SQL statement(s) to execute. Multiple statements separated by semicolons.
      * @param continueOnError if false, throws {@link SQLFailureException} on error
     * @see DB
     * @see TestCase#getPreSQL()
     * @see TestCase#getPostSQL()
     */
    private void executeSQL (String sql, boolean continueOnError) {
        // Guard clause: skip null or empty SQL
        if (sql == null || sql.trim().isEmpty()) {
            return;
        }
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            // Use Hibernate's Work interface to access JDBC connection
            db.session().doWork(new Work() {
                @Override
                public void execute(Connection conn) throws java.sql.SQLException {
                    try (Statement stmt = conn.createStatement()) {
                        // Split by semicolon to support multiple statements
                        String[] queries = sql.split(";");
                        for (String q : queries) {
                            q = q.trim();
                            if (q.length() > 0) {
                                boolean isResultSet = stmt.execute(q);
                                LogEvent evt = getLog().createLogEvent("SQL");
                                evt.addMessage("Executed: " + q);

                                if (isResultSet) {
                                    // SELECT-type query - log result set
                                    java.sql.ResultSet rs = stmt.getResultSet();
                                    java.sql.ResultSetMetaData rsmd = rs.getMetaData();
                                    int cols = rsmd.getColumnCount();
                                    while (rs.next()) {
                                        StringBuilder sb = new StringBuilder("Row: ");
                                        for (int i = 1; i <= cols; i++) {
                                            sb.append(rsmd.getColumnName(i))
                                              .append("=")
                                              .append(rs.getString(i))
                                              .append(" ");
                                        }
                                        evt.addMessage(sb.toString());
                                    }
                                    rs.close();
                                } else {
                                    // INSERT/UPDATE/DELETE - log affected rows
                                    evt.addMessage("Rows affected: " + stmt.getUpdateCount());
                                }
                                Logger.log(evt);
                            }
                        }
                    }
                }
            });
            db.commit();
        } catch (Exception e) {
            if (!continueOnError) {
                // Rollback is handled by DB.close() / transaction management
                throw new SQLFailureException(sql, e);
            } else {
                // Log error but don't throw - let test continue
                getLog().error("SQL Error: " + sql, e);
            }
        }
    }

    /**
     * Executes SQL statement(s) using the Hibernate-managed database connection.
     * <p>
     * Convenience overload that logs errors but does not throw exceptions.
     * Equivalent to {@link #executeSQL(String, boolean)} with {@code continueOnError=true}.
     * </p>
     *
     * @param sql SQL statement(s) to execute. Multiple statements separated by semicolons.
     */
    private void executeSQL (String sql) {
        executeSQL(sql, true);
    }

    /**
   * Creates a default XMLPackager for parsing message files.
   *
   * @return A configured XMLPackager instance
   * @throws ISOException if packager cannot be created
   */
  private ISOPackager getDefaultPackager() throws ISOException {
    XMLPackager p = new XMLPackager();
    try {
      p.setXMLParserFeature(
        "http://apache.org/xml/features/disallow-doctype-decl",
        false
      );
      p.setXMLParserFeature(
        "http://xml.org/sax/features/external-general-entities",
        true
      );
      p.setXMLParserFeature(
        "http://xml.org/sax/features/external-parameter-entities",
        true
      );
      return p;
    } catch (SAXException e) {
      throw new ISOException("Error creating XMLPackager", e);
    }
  }
}
