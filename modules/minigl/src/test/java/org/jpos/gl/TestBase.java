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

package org.jpos.gl;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.internal.SessionFactoryImpl;
import org.jpos.ee.DB;
import org.jpos.gl.tools.Export;
import org.jpos.gl.tools.Import;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.io.TempDir;
import org.testcontainers.containers.PostgreSQLContainer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public abstract class TestBase {
    @TempDir
    protected static File tempDir;
    protected static String configModifier = null;
    protected static GLSession gls;
    protected static long start;
    protected static long checkpoint;

    private static final PostgreSQLContainer<?> DB_CONTAINER =
      new PostgreSQLContainer<>("postgres:17")
        .withDatabaseName("jposee")
        .withUsername("jpos")
        .withPassword("password")
        .withReuse(true);

    @BeforeAll
    public static void setUpBase () throws Exception {
        String driver = System.getProperty("test.minigl_db_driver", "postgres");
        if ("local".equals(driver)) {
            System.setProperty("db.connection", "jdbc:postgresql://localhost:5432/jposee");
            System.setProperty("db.username", "jpos");
            System.setProperty("db.password", "password");
            System.setProperty("db.driver", "org.postgresql.Driver");
        } else {
            System.setProperty("api.version", "1.44");
            if (!DB_CONTAINER.isRunning())
                DB_CONTAINER.start();
            System.setProperty("db.connection", DB_CONTAINER.getJdbcUrl());
            System.setProperty("db.username", DB_CONTAINER.getUsername());
            System.setProperty("db.password", DB_CONTAINER.getPassword());
            System.setProperty("db.driver", "org.postgresql.Driver");
        }
        DB.invalidateSessionFactory(configModifier);
        writeDbProperties();
        try {
            String userName = System.getProperty("user.name");
            System.setProperty("user.name", "travis");
            System.setProperty("db.create.enabled", "YES");
            new Import(configModifier).parse("../test-classes/testdata.xml");
            new Export(configModifier).export(System.out);
            System.setProperty("user.name", userName);
            System.setProperty("db.create.enabled", "NO");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        DB db = new DB(configModifier);
        SessionFactoryImpl sf = (SessionFactoryImpl) db.getSessionFactory();
        ConnectionProvider cp = sf.getServiceRegistry().getService(ConnectionProvider.class);
        assertTrue(cp.getClass().getName().contains("AgroalConnectionProvider"),
          "Expected Agroal connection provider, got " + cp.getClass().getName());
        gls = new GLSession(db, "bob");
        start = checkpoint = System.currentTimeMillis();
    }
    @AfterAll
    public static void tearDownBase () throws Exception {
        if (gls != null)
            gls.close();
        DB.invalidateSessionFactory(configModifier);
    }

    private static void writeDbProperties() throws IOException {
        File cfgDir = new File("cfg");
        if (!cfgDir.exists())
            cfgDir.mkdirs();
        Properties props = new Properties();
        props.setProperty("hibernate.globally_quoted_identifiers", "true");
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

    public void start () {
        start = checkpoint = System.currentTimeMillis();
    }
    public void start (String s) {
        System.out.println ("     start: " + s + " ("
            + Runtime.getRuntime().totalMemory() + ")"
        );
        start = checkpoint = System.currentTimeMillis();
    }
    public void checkPoint (String s) {
        long now = System.currentTimeMillis();
        System.out.println ("checkpoint: " + s + " [" + (now - checkpoint) + "] (" 
            + Runtime.getRuntime().totalMemory() + ")"
        );
        checkpoint = now;
    }
    public void end (String s) {
        long now = System.currentTimeMillis();
        System.out.println ("       end: " + s + " [" + (now - start) + "] (" 
            + Runtime.getRuntime().totalMemory() + ")"
        );
        start = checkpoint = now;
    }
}

