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

package org.jpos.ee;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.testcontainers.containers.PostgreSQLContainer;

import java.time.Duration;
import java.util.Properties;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/** Verifies committed database state, not just calls to rollback on a mock. */
class DBTransactionTest {
    private static final String MODIFIER = "rollback-test";
    private static final PostgreSQLContainer<?> POSTGRES = new PostgreSQLContainer<>("postgres:17");

    @BeforeAll
    static void setup() throws Exception {
        System.setProperty("api.version", "1.44");
        POSTGRES.start();
        Properties props = new Properties();
        props.setProperty("hibernate.connection.provider_class", "org.hibernate.agroal.internal.AgroalConnectionProvider");
        props.setProperty("hibernate.connection.url", POSTGRES.getJdbcUrl());
        props.setProperty("hibernate.connection.username", POSTGRES.getUsername());
        props.setProperty("hibernate.connection.password", POSTGRES.getPassword());
        props.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        props.setProperty("hibernate.agroal.minSize", "1");
        props.setProperty("hibernate.agroal.maxSize", "2");
        DB.registerProperties(null, (Properties) props.clone());
        DB.registerProperties(MODIFIER, (Properties) props.clone());
        try (var c = POSTGRES.createConnection(""); var s = c.createStatement()) {
            s.execute("create table rollback_probe (id varchar(36) primary key)");
        }
    }

    @AfterAll
    static void cleanup() {
        try {
            DB.unregisterProperties(null);
            DB.unregisterProperties(MODIFIER);
        } finally {
            POSTGRES.stop();
        }
    }

    private static <T> T execute(int overload, DBAction<T> action) throws Exception {
        return switch (overload) {
            case 0 -> DB.execWithTransaction(action);
            case 1 -> DB.execWithTransaction(action, Duration.ofSeconds(30));
            case 2 -> DB.execWithTransaction(MODIFIER, action);
            default -> DB.execWithTransaction(MODIFIER, action, Duration.ofSeconds(30));
        };
    }

    private static void insert(DB db, String id) {
        db.session().createNativeMutationQuery("insert into rollback_probe values (:id)")
          .setParameter("id", id).executeUpdate();
    }

    private static long count(String id) throws Exception {
        try (var c = POSTGRES.createConnection("");
             var s = c.prepareStatement("select count(*) from rollback_probe where id = ?")) {
            s.setString(1, id);
            try (var rs = s.executeQuery()) {
                rs.next();
                return rs.getLong(1);
            }
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void actionFailuresRollBack(int overload) throws Exception {
        for (Throwable failure : new Throwable[] {new Exception("checked"),
          new IllegalStateException("unchecked"), new AssertionError("error")}) {
            String id = UUID.randomUUID().toString();
            Throwable actual = assertThrows(Throwable.class, () -> execute(overload, db -> {
                insert(db, id); // Native DML reaches PostgreSQL before the action fails.
                if (failure instanceof Error error) throw error;
                throw (Exception) failure;
            }));
            assertSame(failure, actual);
            assertEquals(0, count(id), failure.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void successCommits(int overload) throws Exception {
        String id = UUID.randomUUID().toString();
        assertEquals(id, execute(overload, db -> { insert(db, id); return id; }));
        assertEquals(1, count(id));
    }

    @Test
    void closeRollsBackPendingWork() throws Exception {
        String id = UUID.randomUUID().toString();
        DB db = new DB(MODIFIER);
        try (db) {
            db.open();
            db.beginTransaction();
            insert(db, id);
        }
        db.close();
        assertNull(db.session());
        assertEquals(0, count(id));
    }
}
