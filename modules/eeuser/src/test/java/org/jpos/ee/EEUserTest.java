/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
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
        createUser();
        checkUser();
    }

    private void createUser() throws BLException {
        db.beginTransaction();
        User user = new User();
        user.setNick("admin");
        user.setName("User Administrator");
        user.setActive(true);
        db.session().save(user);
        UserManager mgr = new UserManager(db, UserManager.VERSION.ZERO);
        mgr.setPassword(user, "test", null);
        Role role = new Role("admin");
        Set<Permission> perms = role.getPermissions();
        perms.add(Permission.valueOf("login"));
        perms.add(Permission.valueOf("admin"));

        db.session().save(role);
        user.getRoles().add(role);
        db.commit();
    }
    public void checkUser() throws BLException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        db.beginTransaction();
        UserManager mgr = new UserManager(db, UserManager.VERSION.ZERO);
        User u = mgr.getUserByNick("admin");
        assertNotNull("User can't be null", u);
        assertTrue("User has 'login' permission", u.hasPermission("login"));
        assertTrue("User has 'admin' permission", u.hasPermission("admin"));
        assertTrue("User has 'admin' role", u.hasPermission("role.admin"));
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
}
