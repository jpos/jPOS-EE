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

public class CurrencyTest extends TestBase {
    public void testCurrency840 () throws Exception {
        Currency currency = (Currency) gls.session().load (Currency.class, "840");
        assertNotNull (currency);
        assertEquals ("USD", currency.getSymbol());
        assertEquals ("US Dollars", currency.getName());
    }
    public void testCurrency858 () throws Exception {
        Currency currency = (Currency) gls.session().load (Currency.class, "858");
        assertNotNull (currency);
        assertEquals ("$U", currency.getSymbol());
        assertEquals ("Pesos uruguayos", currency.getName());
    }
}

