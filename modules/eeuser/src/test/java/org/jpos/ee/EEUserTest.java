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

package org.jpos.ee;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EEUserTest {
    DB db;
    @BeforeEach
    public void setUp() throws Exception {
        System.setProperty("db.create.enabled", "YES");
        db = new DB();
        db.createSchema("schema.sql", true);
        db.open();
        System.setProperty("db.create.enabled", "FALSE");
    }

    @Test
    void tests() throws Exception {
        createRealms();
        createUser();
        checkUser();
    }

    private void createRealms() {
        db.beginTransaction();
        db.save(new Realm("TEST"));
        db.save(new Realm("PROD"));
        db.commit();
    }

    private void createUser() throws Exception {
        db.beginTransaction();
        User user = new User();
        user.setNick("admin");
        user.setName("User Administrator");
        user.setActive(true);
        db.session().persist(user);
        UserManager mgr = new UserManager(db, HashVersion.ZERO);
        mgr.setPassword(user, "test", null);
        System.out.println ("----> Setting password test for user " + user + " " + user.getPasswordHash());

        RealmManager rmgr = new RealmManager(db);
        Realm testRealm = rmgr.getRealmByName("TEST");

        Role r = createRole(db, null, "admin", "login", "admin");
        user.getRoles().add(r);
        // user permissions: `login`, `admin`, `role.admin`

        Role r1 = createRole (db, testRealm, "tester", "testread", "testwrite");
        r1.setParent(r);
        user.getRoles().add(r1);
        // adds permissions: `TEST.testread`, `TEST.testwrite`

        db.commit();
    }
    public void checkUser() throws Exception {
        db.beginTransaction();
        UserManager mgr = new UserManager(db, HashVersion.ZERO);
        User u = mgr.getUserByNick("admin");
        assertNotNull(u, "User can't be null");
        assertTrue(u.hasPermission("login"), "User has 'login' permission");
        assertTrue(u.hasPermission("admin"), "User has 'admin' permission");
        assertTrue(u.hasPermission("role.admin"), "User has 'admin' role");

        assertTrue(u.hasPermission("TEST:testread"), "User has 'TEST:testread");
        assertTrue(u.hasPermission("TEST:admin"), "User has 'TEST:admin");

        assertTrue(
          u.hasAllPermissions(
             new String[] {"TEST:role.tester", "TEST:testread", "TEST:testwrite", "TEST:admin", "TEST:login"}
          ),
          "User has all permissions TEST:role.tester, TEST:testread, TEST:testwrite, TEST:admin, TEST:login");
        assertTrue(u.hasAllPermissions(new String[]{"login", "admin", "role.admin"}), "User has all permissions");
        assertTrue(u.hasAnyPermission(new String[]{"nologin", "admin", "role.admin"}), "User has any permissions");
        assertFalse(u.hasPermission("superuser"), "User don't have 'superuser' permission");

        assertTrue(mgr.checkPassword(u, "test"), "User password is 'test' " + u + " " + u.getPasswordHash());

        String v0Hash = u.getPasswordHash();
        assertFalse(mgr.checkNewPassword(u, "test"), "Password has to be in history");
        mgr.upgradePassword(u, "test");
        assertNotEquals(v0Hash, u.getPasswordHash(), "User hash has changed");
        assertTrue(mgr.checkPassword(u, "test"), "User password is still 'test'");
        assertFalse(mgr.checkNewPassword(u, "test"), "Password has to be in history");
        mgr.setPassword(u, "test1");
        mgr.setPassword(u, "test2");
        mgr.setPassword(u, "test3");
        assertFalse(mgr.checkNewPassword(u, "test1"), "Password 1 has to be in history");
        assertFalse(mgr.checkNewPassword(u, "test2"), "Password 2 has to be in history");
        assertFalse(mgr.checkNewPassword(u, "test3"), "Password 3 has to be in history");
        assertTrue(mgr.checkPassword(u, "test3"), "User password is now 'test3'");
        mgr.setPassword(u, "test");
        assertTrue(mgr.checkPassword(u, "test"), "User password is back to 'test'");
        assertEquals (5, u.getPasswordhistory().size(), "History size is ");
        db.commit();
    }


    @AfterEach
    public void tearDown() {
        db.close();
    }

    private Role createRole (DB db, Realm realm, String name, String... permissions) {
        Role role = new Role(realm, name);
        Set<Permission> perms = role.getPermissions();
        for (String p : permissions)
            perms.add(Permission.valueOf(p));
        db.save(role);
        return role;
    }
}
