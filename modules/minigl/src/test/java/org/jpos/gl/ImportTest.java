/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2019 jPOS Software SRL
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

import junit.framework.TestCase;
import org.jpos.gl.tools.Import;

public class ImportTest extends TestCase {
    public void testImport() throws Exception {
        String userName = System.getProperty("user.name");
        System.setProperty("user.name", "travis");
        new Import().parse("../test-classes/testdata.xml");
        System.setProperty("user.name", userName);
    }
}
