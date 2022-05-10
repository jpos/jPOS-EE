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

import org.jpos.q2.CLIContext;
import org.jpos.q2.CLISubSystem;

import java.io.File;

/**
 * CLI implementation - Binlog subsystem
 */
public class BINLOG implements CLISubSystem {
    @Override
    public String getPrompt(CLIContext ctx, String[] args) {
        if (args.length < 2) {
            ctx.println ("Usage: binlog directory-name");
            return null;
        }
        ctx.getUserData().put("binlog", args[1]);
        return String.format("(%s)> ", new File(args[1]).getName());
    }

    @Override
    public String[] getCompletionPrefixes(CLIContext ctx, String[] args) {
        if (args.length < 2)
            return null;
        return new String[] { "org.jpos.q2.cli.binlog." };
    }
}

