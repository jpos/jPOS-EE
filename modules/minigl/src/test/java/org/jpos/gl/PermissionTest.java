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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.hibernate.Transaction;
import org.jpos.ee.DB;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PermissionTest extends TestBase {
    Journal journal;

    @BeforeEach
    public void setUp () throws Exception {
        journal = gls.getJournal ("TestJournal");
    }
    @Test
    public void testBasicGLPermissions() throws Exception {
        assertTrue  (gls.hasPermission (GLPermission.READ));
        assertFalse (gls.hasPermission (GLPermission.POST));
        assertTrue (gls.hasPermission (GLPermission.POST, journal));
        assertTrue (gls.hasPermission (GLPermission.READ, journal));
        assertFalse(gls.hasPermission ("InvalidGLPermission", journal));
    }
    @Test
    public void testNoPermAndGrant() throws Exception {
        // 'eve',  our no-permissions user
        GLSession sess = new GLSession (new DB(configModifier),"eve");
        assertFalse (sess.hasPermission (GLPermission.READ));
        assertFalse(sess.hasPermission(GLPermission.POST, journal));
        sess.close();
    }
    @Test
    public void testGrant() throws Exception {
        // Grant 'eve' READ permission
        Transaction tx = gls.beginTransaction();
        gls.grant  ("eve", GLPermission.READ);
        tx.commit();
        GLSession sess = new GLSession (new DB(configModifier), "eve");
        assertTrue (sess.hasPermission (GLPermission.READ));
        sess.close();
         // OK, now take it away
        tx = gls.beginTransaction();
        gls.revoke("eve", GLPermission.READ);
        tx.commit();
        sess = new GLSession (new DB(configModifier), "eve");
        assertFalse(sess.hasPermission(GLPermission.READ));
        sess.close();
    }
    // ##FIXME - not working if placed after testGrant
    @Test
    public void testRevoke() throws Exception {
        // Revoke READ permission from 'eve'
        Transaction tx = gls.beginTransaction();
        gls.revoke ("eve", GLPermission.READ);
        tx.commit();

        GLSession sess = new GLSession (new DB(configModifier), "eve");
        assertFalse (sess.hasPermission (GLPermission.READ));
        sess.close();
    }
    @Test
    public void testAnon() throws Exception {
        // 'anonymous', a non-existent user
        try {
            new GLSession (new DB(configModifier),"anonymous");
        } catch (GLException e) {
            assertEquals (e.getMessage(), "Invalid user 'anonymous'");
            return;
        }
        fail ("Anonymous user should have raised a GLException");
    }
}
