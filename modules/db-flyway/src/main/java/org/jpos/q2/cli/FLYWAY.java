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

package org.jpos.q2.cli;

import org.jpos.flyway.FlywayTarget;
import org.jpos.q2.CLIContext;
import org.jpos.q2.CLISubSystem;

public class FLYWAY implements CLISubSystem {
    public static final String TARGET = "flyway.target";

    @Override
    public String getPrompt(CLIContext ctx, String[] args) {
        FlywayTarget target = FlywayTarget.fromCli(args);
        ctx.getUserData().put(TARGET, target);
        String label = target.label();
        return  "flyway" + (!label.isEmpty() ? "[" + label + "]" : "") + "> ";
    }

    @Override
    public String[] getCompletionPrefixes(CLIContext ctx, String[] args) {
        return new String[] { "org.jpos.q2.cli.flyway." };
    }

    public static FlywayTarget getTarget(CLIContext ctx) {
        FlywayTarget target = (FlywayTarget) ctx.getUserData().get(TARGET);
        return target != null ? target : FlywayTarget.DEFAULT;
    }
}
