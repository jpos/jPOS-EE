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

package org.jpos.ee;

import org.jpos.q2.QBeanSupport;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;

/**
 * @author Sumeet Phadnis
 *          <p>
 *          Simple wrapper to instantiate DB class.
 *          It picks up db user name and password from configuration and puts that in Space.
 *          DB reads these values from the Space and sets Hibernate configuration properties accordingly.
 *          Being a qbean its deploy file can be encrypted using Q2.
 */
@SuppressWarnings({"UnusedDeclaration"})
public class DBInstantiator extends QBeanSupport {
    public void initService() throws Exception {
        super.initService();
        Space sp = SpaceFactory.getSpace("tspace:dbconfig");
        String cm = cfg.get("config-modifier", null);
        String dbprefix = (cm != null ? cm.split(":")[0] + ":" : "");
        sp.out(dbprefix + "connection.username", cfg.get("dbuser", "UNKNOWN"));
        sp.out(dbprefix + "connection.password", cfg.get("dbpass", "UNKNOWN"));
        new org.jpos.ee.DB(cm);
    }
}
