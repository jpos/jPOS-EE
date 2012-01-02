/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2012 Alejandro P. Revilla
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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hibernate.Transaction;

public class PermissionTest extends TestBase {
    Journal journal;

    public void setUp () throws Exception {
        super.setUp();
        journal = gls.getJournal ("TestJournal");
    }
    public void testBasicGLPermissions() throws Exception {
        assertTrue  (gls.hasPermission (GLPermission.READ));
        assertFalse (gls.hasPermission (GLPermission.POST));
        assertTrue (gls.hasPermission (GLPermission.POST, journal));
        assertTrue (gls.hasPermission (GLPermission.READ, journal));
        assertFalse(gls.hasPermission ("InvalidGLPermission", journal));
    }
    public void testNoPerm() throws Exception {
        // 'eve',  our no-permissions user
        GLSession sess = new GLSession ("eve"); 
        assertFalse (sess.hasPermission (GLPermission.READ));
        assertFalse (sess.hasPermission (GLPermission.POST, journal));
        sess.close();
    }
    public void testGrant() throws Exception {
        // Grant 'eve' READ permission
        Transaction tx = gls.beginTransaction();
        gls.grant  ("eve", GLPermission.READ);
        tx.commit();
        GLSession sess = new GLSession ("eve"); 
        assertTrue (sess.hasPermission (GLPermission.READ));
        sess.close();
    }
    // ##FIXME - not working if placed after testGrant
    public void testRevoke() throws Exception {
        // Revoke READ permission from 'eve'
        Transaction tx = gls.beginTransaction();
        gls.revoke ("eve", GLPermission.READ);
        tx.commit();

        GLSession sess = new GLSession ("eve"); 
        assertFalse (sess.hasPermission (GLPermission.READ));
        sess.close();
    }
    public void testAnon() throws Exception {
        // 'anonymous', a non-existent user
        try {
            GLSession sess = new GLSession ("anonymous"); 
        } catch (GLException e) {
            assertEquals (e.getMessage(), "Invalid user 'anonymous'");
            return;
        }
        fail ("Anonymous user should have raised a GLException");
    }
}

