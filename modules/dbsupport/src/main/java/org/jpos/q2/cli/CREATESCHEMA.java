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

package org.jpos.q2.cli;

import org.jpos.ee.DB;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

@SuppressWarnings("unused")
public class CREATESCHEMA implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        String filename = "-";  // defaults to stdout     '
        String configModifier = null;
        boolean create = false;
        if (args.length > 1)
            filename = args[1];
        if (args.length > 2)
            create = "yes".equalsIgnoreCase(args[2]) || "true".equalsIgnoreCase(args[2]);
        if (args.length > 3)
            configModifier = args[3];

        try (DB db = new DB(configModifier)) {
            db.open();
            db.beginTransaction();
            db.createSchema(filename, create);
        }
    }
}
