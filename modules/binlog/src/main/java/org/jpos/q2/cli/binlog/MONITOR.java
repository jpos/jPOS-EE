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

package org.jpos.q2.cli.binlog;

import org.jpos.binlog.BinLog;
import org.jpos.binlog.BinLogReader;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import java.nio.file.Paths;

@SuppressWarnings("unused")
public class MONITOR implements CLICommand {
    CLIContext cli;
    boolean ansi;

    public void exec(CLIContext cli, String[] args) throws Exception {
        try (BinLogReader bl = new BinLogReader(Paths.get((String) cli.getUserData().get("binlog")))) {
            while (bl.hasNext(10000L)) {
                BinLog.Entry ref = bl.next();
                cli.println(String.format("%06d@%08d %s",
                  ref.ref().getFileNumber(),
                  ref.ref().getOffset(),
                  ISOUtil.hexdump(ref.get())));
                cli.getReader().getTerminal().flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

