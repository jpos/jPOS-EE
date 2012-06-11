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
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class AllTests {
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest (new TestSuite (ImportTest.class));
        suite.addTest (new TestSuite (CurrencyTest.class));
        suite.addTest (new TestSuite (PermissionTest.class));
        suite.addTest (new TestSuite (BalanceTest.class));
        suite.addTest (new TestSuite (RulesTest.class));
        suite.addTest (new TestSuite (AccountLockTest.class));
        suite.addTest (new TestSuite (MoveTest.class));
        suite.addTest (new TestSuite (SummarizeTest.class));
        suite.addTest (new TestSuite (LayersTest.class));
        suite.addTest (new TestSuite (FindTransactionsTest.class));
        suite.addTest (new TestSuite (TransactionGroupTest.class));
        return suite;
    }
}

