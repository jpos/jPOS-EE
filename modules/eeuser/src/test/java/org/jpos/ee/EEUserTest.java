package org.jpos.ee;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class EEUserTest {
    DB db;
    @Before
    public void setUp() {
        db = new DB();
        db.createSchema("schema.sql", true);
        db.open();
    }

    @Test
    public void tests() {
        createUser();
        checkUser();
    }

    private void createUser() {
        db.beginTransaction();
        User user = new User();
        user.setNick ("admin");
        user.setName ("User Administrator");
        user.setActive (true);
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
    public void checkUser() {
        db.beginTransaction();
        UserManager mgr = new UserManager(db);
        User u = mgr.getUserByNick("admin");
        assertNotNull("User can't be null", u);
        assertTrue("User has 'login' permission", u.hasPermission("login"));
        assertTrue("User has 'admin' permission", u.hasPermission("admin"));
        assertTrue("User has 'admin' role", u.hasPermission("role.admin"));
        assertTrue("User has all permissions", u.hasAllPermissions(new String[]{"login", "admin", "role.admin" }));
        assertTrue("User has any permissions", u.hasAnyPermission(new String[]{"nologin", "admin", "role.admin" }));
        assertFalse("User don't have 'superuser' permission", u.hasPermission("superuser"));
        db.commit();
    }

    @After
    public void tearDown() {
        db.close();
    }
}
