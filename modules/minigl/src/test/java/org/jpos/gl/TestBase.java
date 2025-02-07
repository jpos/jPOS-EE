/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

import org.jpos.ee.DB;
import org.jpos.gl.tools.Export;
import org.jpos.gl.tools.Import;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.io.TempDir;
import org.testcontainers.containers.PostgreSQLContainer;

import java.io.File;

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
        if (System.getProperty("test.minigl_db_driver").equals("postgres")) {
            DB_CONTAINER.start();
            System.setProperty("db.connection", DB_CONTAINER.getJdbcUrl());
            System.setProperty("db.username", DB_CONTAINER.getUsername());
            System.setProperty("db.password", DB_CONTAINER.getPassword());
            System.setProperty("db.driver", "org.postgresql.Driver");
            System.setProperty("db.create.enabled", "YES");
        } else {
            // nothing required - use H2
        }
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
        gls = new GLSession(db, "bob");
        start = checkpoint = System.currentTimeMillis();
    }
    @AfterAll
    public static void tearDownBase () throws Exception {
        gls.close();
        if (System.getProperty("test.minigl_db_driver").equals("postgres")) {
            DB_CONTAINER.stop();
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

