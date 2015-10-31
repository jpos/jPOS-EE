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
