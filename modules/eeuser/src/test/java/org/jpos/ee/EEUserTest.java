/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2019 jPOS Software SRL
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

import org.jpos.util.Chronometer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EEUserTest {
    DB db;
    @Before
    public void setUp() throws Exception {
        db = new DB();
        db.createSchema("schema.sql", true);
        db.open();
    }

    @Test
    public void tests() throws Exception {
        createRealms();
        createUser();
        checkUser();
    }

    private void createRealms() throws Exception {
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
        db.session().save(user);
        UserManager mgr = new UserManager(db, HashVersion.ZERO);
        mgr.setPassword(user, "test", null);

        RealmManager rmgr = new RealmManager(db);
        Realm testRealm = rmgr.getRealmByName("TEST");
        Realm prodRealm = rmgr.getRealmByName("PROD");


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
        assertNotNull("User can't be null", u);
        assertTrue("User has 'login' permission", u.hasPermission("login"));
        assertTrue("User has 'admin' permission", u.hasPermission("admin"));
        assertTrue("User has 'admin' role", u.hasPermission("role.admin"));

//        for (Role r : u.getRoles()) {
//            System.out.println("Role " + r.getName() + "-> " + r.getActivePermissions());
//        }

        assertTrue("User has 'TEST:testread", u.hasPermission("TEST:testread"));
        assertTrue("User has 'TEST:admin", u.hasPermission("TEST:admin"));

        assertTrue("User has all permissions TEST:role.tester, TEST:testread, TEST:testwrite, TEST:admin, TEST:login",
          u.hasAllPermissions(
             new String[] {"TEST:role.tester", "TEST:testread", "TEST:testwrite", "TEST:admin", "TEST:login"})
          );
        assertTrue("User has all permissions", u.hasAllPermissions(new String[]{"login", "admin", "role.admin"}));
        assertTrue("User has any permissions", u.hasAnyPermission(new String[]{"nologin", "admin", "role.admin"}));
        assertFalse("User don't have 'superuser' permission", u.hasPermission("superuser"));

        assertTrue("User password is 'test'", mgr.checkPassword(u, "test"));
        assertEquals("User hash is correct", "ee89026a6c5603c51b4504d218ac60f6874b7750", u.getPasswordHash());
        assertFalse("Password has to be in history", mgr.checkNewPassword(u, "test"));
        mgr.upgradePassword(u, "test");
        assertNotEquals("User hash has changed", "ee89026a6c5603c51b4504d218ac60f6874b7750", u.getPasswordHash());
        assertTrue("User password is still 'test'", mgr.checkPassword(u, "test"));
        assertNotEquals("User hash has changed", "ee89026a6c5603c51b4504d218ac60f6874b7750", u.getPasswordHash());
        assertFalse("Password has to be in history", mgr.checkNewPassword(u, "test"));
        mgr.setPassword(u, "test1");
        mgr.setPassword(u, "test2");
        mgr.setPassword(u, "test3");
        assertFalse("Password 1 has to be in history", mgr.checkNewPassword(u, "test1"));
        assertFalse("Password 2 has to be in history", mgr.checkNewPassword(u, "test2"));
        assertFalse("Password 3 has to be in history", mgr.checkNewPassword(u, "test3"));
        assertTrue("User password is now 'test3'", mgr.checkPassword(u, "test3"));
        mgr.setPassword(u, "test");
        assertTrue("User password is back to 'test'", mgr.checkPassword(u, "test"));
        assertEquals ("History size is ", 5, u.getPasswordhistory().size());
        db.commit();
    }


    @After
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
