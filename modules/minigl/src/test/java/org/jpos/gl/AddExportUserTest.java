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

package org.jpos.gl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.jpos.ee.DB;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class AddExportUserTest extends TestBase {
    @Test
    public void testAddExportUser() throws Exception {
        Session sess = new DB(configModifier).open();
        try {
            GLUser user = getUser(sess,System.getProperty("user.name"));
        } catch (IllegalArgumentException e) {
            Transaction txn = sess.beginTransaction();
            GLUser user = new GLUser();
            user.setName(System.getProperty ("user.name"));
            user.setNick(System.getProperty ("user.name"));
            List<String> perms = Arrays.asList("read","write","grant");
            perms.forEach(p -> {sess.save (new GLPermission (p)); user.grant (new GLPermission (p));});
            sess.save (user);
            txn.commit();
        }
        sess.close ();
    }

    private GLUser getUser(Session session, String nick) throws HibernateException {
        // Validate input parameters
        Objects.requireNonNull(session, "Session must not be null");
        Objects.requireNonNull(nick, "Nick must not be null");

        if (nick.isBlank()) {
            throw new IllegalArgumentException("Nick cannot be blank");
        }

        // Create and execute type-safe query
        return session.createSelectionQuery("FROM GLUser u WHERE u.nick = :nick", GLUser.class)
          .setParameter("nick", nick.trim())  // Trim whitespace if needed
          .uniqueResultOptional()
          .orElseThrow(() -> new IllegalArgumentException("User with nick '" + nick + "' not found"));
    }
}
