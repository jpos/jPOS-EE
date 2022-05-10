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

package org.jpos.gl.stress;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.jpos.gl.*;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

public class CreateAccounts extends TestBase {
    @Test
    public void testCreateComposites () throws Exception {
        start ("testCreateComposites");
        CompositeAccount cards = gls.getCompositeAccount ("TestChart", "23");
        assertNotNull (cards);
        Transaction tx = gls.beginTransaction();
        for (int i=0; i<10; i++) {
            Account acct = new CompositeAccount ();
            acct.setCode ("23" + "." + Integer.toString (i));
            acct.setType (Account.CREDIT);
            acct.setDescription ("Group # " + i);
            gls.addAccount (cards, acct, true);
            gls.session().evict (acct);
        }
        end ("testCreateComposites");
        tx.commit();
        gls.session().evict (cards);
        for (int i=0; i<10; i++) {
            createFinals (i);
        }
    }
    @Test
    private void createFinals (int n) throws Exception {
        CompositeAccount parent = 
            gls.getCompositeAccount ("TestChart", "23." + n);

        assertNotNull (parent);
        Transaction tx = gls.beginTransaction();
        start ();
        for (int i=0; i<100; i++) {
            Account acct = new FinalAccount ();
            acct.setCode ("23" + "." + n + "." + Integer.toString (i));
            acct.setType (Account.CREDIT);
            acct.setDescription ("Card # " + acct.getCode());
            gls.addAccount (parent , acct, true);
            gls.session().evict (acct);
        }
        checkPoint ("pre-commit " + n);
        tx.commit();
        checkPoint ("commit     " + n);
        gls.session().evict (parent);
    }
}
