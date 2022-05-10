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

import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest extends TestBase {
    private Account createNonCanonicalAccount(CompositeAccount parent) {
        Account newac = new FinalAccount();
        newac.setParent(parent);
        newac.setType(Account.DEBIT);
        newac.setCode("invalid");
        return newac;
    }

    @Test
    public void errorThrownIfStrictChecksFail () throws Exception {
        CompositeAccount parent = gls.getCompositeAccount("TestChart", "11");
        assertFalse(parent.isChart());
        assertTrue(gls.isEnforcingStrictAccountCodes());
        Transaction tx = gls.beginTransaction();
        try {
            Account newac = createNonCanonicalAccount(parent);
            gls.addAccount(parent, newac);
            tx.commit();
        } catch (GLException e) {
            tx.rollback();
            if (!e.getMessage().equals (
                    "Child account code `invalid` must start with parent account code `11`"))
            {
                fail ("Unexpected GLException " + e.getMessage());
            }
            return;
        }
        fail ("GLException should have been raised");
    }

    @Test
    public void noErrorIfStrictChecksDisabled () throws Exception {
        assertTrue(gls.isEnforcingStrictAccountCodes());
        gls.setEnforceStrictAccountCodes(false);
        assertFalse(gls.isEnforcingStrictAccountCodes());
        try {
            CompositeAccount parent = gls.getCompositeAccount("TestChart", "11");

            Transaction tx = gls.beginTransaction();
            try {
                Account newac = createNonCanonicalAccount(parent);
                gls.addAccount(parent, newac);
                tx.commit();
            } catch (Exception e) {
                tx.rollback();
                throw e;
            }
        } finally {
            gls.setEnforceStrictAccountCodes(true);
            assertTrue(gls.isEnforcingStrictAccountCodes());
        }
    }
}
