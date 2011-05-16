/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2011 Alejandro P. Revilla
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
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;

public class AccountLockTest extends TestBase {
    Journal tj;
    Account cash;

    public void setUp () throws Exception {
        super.setUp();
        tj = gls.getJournal ("TestJournal");
        cash = gls.getAccount ("TestChart", "111");
    }
    public void testLock () throws Exception {
        final Transaction tx1 = gls.beginTransaction();
        gls.lock (tj, cash);
        tx1.commit();
    }
    public void testDeadLock () throws Exception {
        final Transaction tx1 = gls.beginTransaction();
        gls.lock (tj, cash);

        GLSession gls2 = new GLSession("bob");
        Transaction tx2 = gls2.beginTransaction();

        Journal tj2 = gls2.getJournal ("TestJournal");
        Account cash2 = gls2.getAccount ("TestChart", "111");
        new Thread() {
            public void run() {
                try {
                    Thread.sleep (5000);
                    tx1.commit();
                } catch (HibernateException e) {
                    fail ("tx1 commit failed");
                } catch (InterruptedException e) { }
            }
        }.start();
        long start = System.currentTimeMillis();
        gls2.lock (tj2, cash2);
        long end = System.currentTimeMillis();
        assertTrue (end - start > 5000);
        assertTrue (end - start < 6000);
        tx2.commit();
        gls2.close();
    }
}

