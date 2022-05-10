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

package org.jpos.q2.cli.flyway;

import org.flywaydb.core.api.FlywayException;
import org.jpos.core.Environment;
import org.jpos.flyway.FlywaySupport;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.FLYWAY;

public class CLEAN extends FlywaySupport implements CLICommand{
    @Override
    public void exec(CLIContext cli, String[] args) {
        if ("true".equals(Environment.get("${flyway.cleanDisabled}", "true"))) {
            cli.println ("Clean disabled - no action taken");
            return;
        }
        boolean superSure = false;
        boolean sure  = cli.confirm("Are you sure you want to Clean your database (Yes/No) ? ");
        if (sure)
            superSure = cli.confirm("This action can not be reversed - still want to proceed (Yes/No) ? ");

        if (superSure) {
            try {
                getFlyway((String) cli.getUserData().get(FLYWAY.PREFIX), args).clean();
            } catch (FlywayException e) {
                cli.println (e.getMessage());
            }
        }
        else {
            cli.println ("No action taken");
        }
    }
}
