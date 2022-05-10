/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

import io.zonky.test.db.postgres.embedded.EmbeddedPostgres;
import org.jpos.ee.DB;
import org.jpos.gl.tools.Export;
import org.jpos.gl.tools.Import;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.io.TempDir;
import java.io.File;
import java.io.FileWriter;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public abstract class TestBase {
    @TempDir
    protected static File tempDir;
    protected static String configModifier = null;
    protected static GLSession gls;
    protected static long start;
    protected static long checkpoint;
    protected static EmbeddedPostgres pg;

    @BeforeAll
    public static void setUpBase () throws Exception {
        if (System.getProperty("test.minigl_db_driver").equals("postgres")) {
            pg = EmbeddedPostgres.start();
            String hibernateCfg = "<?xml version='1.0' encoding='utf-8'?>\n" +
                    "<!DOCTYPE hibernate-configuration PUBLIC\n" +
                    "        \"-//Hibernate/Hibernate Configuration DTD 3.0//EN\"\n" +
                    "        \"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd\">\n" +
                    "\n" +
                    "<hibernate-configuration>\n" +
                    "    <session-factory>\n" +
                    "        <!-- Database connection settings -->\n" +
                    "        <property name=\"connection.driver_class\">org.postgresql.Driver</property>\n" +
                    "        <property name=\"dialect\">org.hibernate.dialect.PostgreSQLDialect</property>\n" +
                    "        <property name=\"connection.url\">" + pg.getPostgresDatabase().getConnection().getMetaData().getURL() + "</property>\n" +
                    "        <property name=\"connection.username\">" + pg.getPostgresDatabase().getConnection().getMetaData().getUserName() + "</property>\n" +
                    "        <property name=\"connection.password\">postgres</property>\n" +
                    "        <!-- JDBC connection pool (use the built-in) -->\n" +
                    "        <property name=\"connection.pool_size\">1</property>\n" +
                    "        <!-- Enable Hibernate's automatic session context management -->\n" +
                    "        <property name=\"current_session_context_class\">thread</property>\n" +
                    "        <!-- Disable the second-level cache  -->\n" +
                    "        <property name=\"cache.provider_class\">org.hibernate.cache.internal.NoCacheProvider</property>\n" +
                    "        <!-- Echo all executed SQL to stdout -->\n" +
                    "        <property name=\"show_sql\">false</property>\n" +
                    "        <!-- Drop and re-create the database schema on startup -->\n" +
                    "        <property name=\"hbm2ddl.auto\">create</property>\n" +
                    "\n" +
                    "    </session-factory>\n" +
                    "</hibernate-configuration>\n";
            File target = new File(tempDir.getAbsolutePath() + "/hibernate.cfg.xml");
            FileWriter w = new FileWriter(target);
            w.write(hibernateCfg);
            w.flush();
            w.close();
            configModifier = target.toURI().toURL().toString();
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
        if (pg != null) {
            pg.close();
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

