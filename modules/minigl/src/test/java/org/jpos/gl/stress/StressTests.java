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

package org.jpos.gl.stress;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import org.jpos.gl.ImportTest;

public class StressTests {
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest (new TestSuite (ImportTest.class));
        suite.addTest (new TestSuite (CreateAccounts.class));
        suite.addTest (new TestSuite (CreateTransactions.class));
        suite.addTest (new TestSuite (SummarizeTransactions.class));
        return suite;
    }
}

