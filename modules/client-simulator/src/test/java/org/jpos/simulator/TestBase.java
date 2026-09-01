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
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.io.TempDir;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.PostgreSQLContainer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

/**
 * Base test class for client-simulator tests.
 * <p>
 * This class sets up a database using Testcontainers for testing SQL functionality.
 * It supports both PostgreSQL and MySQL. It provides:
 * <ul>
 *   <li>Automatic database container lifecycle management</li>
 *   <li>Database properties file creation for Hibernate</li>
 *   <li>Session factory invalidation between tests</li>
 * </ul>
 * </p>
 * <p>
 * The database configuration can be controlled via the system property
 * {@code test.clientsim_db_driver}:
 * <ul>
 *   <li>"postgres" (default) - Use Testcontainers with PostgreSQL 17</li>
 *   <li>"mysql" - Use Testcontainers with MySQL 8</li>
 *   <li>"local" - Use a local database instance (requires system properties set)</li>
 * </ul>
 * </p>
 * <p>
 * When using local database, set these system properties before running:
 * <ul>
 *   <li>db.connection - JDBC URL</li>
 *   <li>db.username - Database username</li>
 *   <li>db.password - Database password</li>
 *   <li>db.driver - JDBC driver class name</li>
 * </ul>
 * </p>
 *
 * @see TestCaseSQLTest
 * @see TestRunnerSQLTest
 * @see <a href="https://www.testcontainers.org/">Testcontainers Documentation</a>
 */
@TestInstance(PER_CLASS)
public abstract class TestBase {
    /**
     * Temporary directory for test files.
     * JUnit Jupiter will inject this automatically.
     */
    @TempDir
    protected static File tempDir;

    /**
     * Optional config modifier for multi-database configurations.
     * Default is null (uses default database).
     */
    protected static String configModifier = null;

    /**
     * PostgreSQL container for test database.
     * Container is reused across tests for performance.
     */
    private static final PostgreSQLContainer<?> PG_CONTAINER =
      new PostgreSQLContainer<>("postgres:17")
        .withDatabaseName("jposee")
        .withUsername("jpos")
        .withPassword("password")
        .withReuse(true);

    /**
     * MySQL container for test database.
     * Container is reused across tests for performance.
     */
    private static final MySQLContainer<?> MYSQL_CONTAINER =
      new MySQLContainer<>("mysql:8")
        .withDatabaseName("jposee")
        .withUsername("jpos")
        .withPassword("password")
        .withReuse(true);

    /**
     * Sets up the test database before all tests run.
     * <p>
     * This method:
     * <ol>
     *   <li>Determines database source (Testcontainers PostgreSQL, MySQL, or local)</li>
     *   <li>Configures system properties for database connection</li>
     *   <li>Invalidates any existing session factory</li>
     *   <li>Creates cfg/db.properties for Hibernate</li>
     * </ol>
     * </p>
     *
     * @throws Exception if setup fails
     */
    @BeforeAll
    public static void setUpBase () throws Exception {
        String driver = System.getProperty("test.clientsim_db_driver", "postgres");
        if ("local".equals(driver)) {
            // Use pre-configured local database - set properties externally
        } else if ("mysql".equals(driver)) {
            // Start Testcontainers MySQL
            if (!MYSQL_CONTAINER.isRunning())
                MYSQL_CONTAINER.start();
            System.setProperty("db.connection", MYSQL_CONTAINER.getJdbcUrl());
            System.setProperty("db.username", MYSQL_CONTAINER.getUsername());
            System.setProperty("db.password", MYSQL_CONTAINER.getPassword());
            System.setProperty("db.driver", "com.mysql.cj.jdbc.Driver");
        } else {
            // Start Testcontainers PostgreSQL (default)
            if (!PG_CONTAINER.isRunning())
                PG_CONTAINER.start();
            System.setProperty("db.connection", PG_CONTAINER.getJdbcUrl());
            System.setProperty("db.username", PG_CONTAINER.getUsername());
            System.setProperty("db.password", PG_CONTAINER.getPassword());
            System.setProperty("db.driver", "org.postgresql.Driver");
        }
        // Ensure clean session factory state
        DB.invalidateSessionFactory(configModifier);
        writeDbProperties();
    }

    /**
     * Cleans up database resources after all tests complete.
     * <p>
     * This method:
     * <ol>
     *   <li>Invalidates the session factory to release connections</li>
     *   <li>Deletes the test-generated cfg/db.properties file</li>
     * </ol>
     * </p>
     *
     * @throws Exception if cleanup fails
     */
    @AfterAll
    public static void tearDownBase () throws Exception {
        DB.invalidateSessionFactory(configModifier);
        // Clean up test-generated db.properties
        File dbProps = new File("cfg/db.properties");
        if (dbProps.exists()) {
            dbProps.delete();
        }
    }

    /**
     * Creates cfg/db.properties with Hibernate connection settings.
     * <p>
     * The properties file configures:
     * <ul>
     *   <li>Agroal connection pool (for performance)</li>
     *   <li>Connection credentials from system properties</li>
     *   <li>Connection pool size limits</li>
     * </ul>
     * </p>
     *
     * @throws IOException if file write fails
     */
    private static void writeDbProperties() throws IOException {
        File cfgDir = new File("cfg");
        if (!cfgDir.exists())
            cfgDir.mkdirs();
        Properties props = new Properties();
        props.setProperty("hibernate.connection.provider_class", "org.hibernate.agroal.internal.AgroalConnectionProvider");
        props.setProperty("hibernate.connection.username", System.getProperty("db.username"));
        props.setProperty("hibernate.connection.password", System.getProperty("db.password"));
        props.setProperty("hibernate.connection.url", System.getProperty("db.connection"));
        props.setProperty("hibernate.connection.driver_class", System.getProperty("db.driver"));
        props.setProperty("hibernate.agroal.minSize", "1");
        props.setProperty("hibernate.agroal.maxSize", "8");
        try (FileOutputStream fos = new FileOutputStream(new File(cfgDir, "db.properties"))) {
            props.store(fos, null);
        }
    }

    /**
     * Helper method to determine if tests are running against MySQL.
     *
     * @return true if MySQL driver is selected, false for PostgreSQL
     */
    protected static boolean isMySQL() {
        return "mysql".equals(System.getProperty("test.clientsim_db_driver", "postgres"));
    }
}
