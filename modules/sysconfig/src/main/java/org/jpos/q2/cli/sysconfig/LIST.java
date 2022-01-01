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

package org.jpos.q2.cli.sysconfig;

import org.jpos.ee.DB;
import org.jpos.ee.SysConfig;
import org.jpos.ee.SysConfigManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.SYSCONFIG;

@SuppressWarnings("unused")
public class LIST implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        try (DB db = new DB()) {
            db.open();
            SysConfigManager mgr = new SysConfigManager(db);

            if (cli.getUserData().containsKey(SYSCONFIG.PREFIX))
                mgr.setPrefix((String) cli.getUserData().get(SYSCONFIG.PREFIX));
            else if (args.length > 1)
                mgr.setPrefix(args[1]);
            String format = "%" + mgr.getMaxIdLength() + "s: %s";
            for (SysConfig sc : mgr.getAll()) {
                cli.println (String.format (format, sc.getId(), sc.getValue()));
            }
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }
}
