package org.jpos.ee;

import org.bouncycastle.util.encoders.Base64;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import static org.junit.Assert.*;

public class EEUserTest {
    DB db;
    @Before
    public void setUp() {
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
        UserManager mgr = new UserManager(db);
        mgr.setPassword(user, "test");
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
        assertEquals("User hash is correct", "ee89026a6c5603c51b4504d218ac60f6874b7750", u.getPassword());
        assertTrue("Upgrade password", mgr.upgradePassword(u, "test"));
        assertNotEquals("User hash has changed", "ee89026a6c5603c51b4504d218ac60f6874b7750", u.getPassword());
        assertTrue("User upgraded password is still 'test'", mgr.checkPassword(u, "test"));

        byte[] b = Base64.decode(u.getPassword());
        byte[] clientSalt = new byte[UserManager.VERSION.ONE.getSalt().length];
        System.arraycopy(b, 1 + clientSalt.length, clientSalt, 0, clientSalt.length);

        Method method = UserManager.class.getDeclaredMethod("upgradeClearPassword", String.class, byte[].class);
        method.setAccessible(true);
        String upgradedClearPass = "v1:" + method.invoke(mgr, "test", clientSalt);
        assertTrue("User upgraded password is still 'hash(test)'", mgr.checkPassword(u, upgradedClearPass));
        db.commit();
    }

    @After
    public void tearDown() {
        db.close();
    }
}
