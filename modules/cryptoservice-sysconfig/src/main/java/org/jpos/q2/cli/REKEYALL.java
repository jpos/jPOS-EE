/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

package org.jpos.q2.cli.crypto;

import org.jpos.ee.DB;
import org.jpos.sysconfig.SysConfigManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

import java.util.ArrayList;
import java.util.List;

public class REKEYALL implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        List<String> argl = new ArrayList<>();
        argl.add(args[0]);
        try (DB db = new DB()) {
            db.open();
            SysConfigManager mgr = new SysConfigManager(db, "key.");
            mgr.getAll()
              .stream()
              .map(sc -> sc.getId().substring(4))
              .forEach(argl::add);
        } catch (Exception e) {
            cli.println(e.getMessage());
        }
        new REKEY().exec(cli, argl.toArray(new String[0]));
    }
}

