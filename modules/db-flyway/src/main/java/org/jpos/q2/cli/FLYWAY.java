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

import org.flywaydb.core.Flyway;
import org.jpos.ee.DB;
import org.jpos.q2.CLIContext;
import org.jpos.q2.CLISubSystem;

import java.util.Properties;

public class FLYWAY implements CLISubSystem {
    public static final String PREFIX = "flyway.dbmodifier";

    @Override
    public String getPrompt(CLIContext ctx, String[] args) {
        String prefix = null;
        if (args.length > 1) {
            prefix = args[1];
            ctx.getUserData().put(PREFIX, prefix);
        } else {
            ctx.getUserData().remove(PREFIX);
        }
        new DB(prefix); // force DB initialization
        return  "flyway" + (prefix != null ? "[" + args[1] + "]" : "") + "> ";
    }

    @Override
    public String[] getCompletionPrefixes(CLIContext ctx, String[] args) {
        return new String[] { "org.jpos.q2.cli.flyway." };
    }

    private Flyway getFlyWay() {
        Properties p = new DB().getProperties();
        return Flyway.configure().dataSource(
          p.getProperty("hibernate.connection.url"),
          p.getProperty("hibernate.connection.username"),
          p.getProperty("hibernate.connection.password")).load();
    }
}
