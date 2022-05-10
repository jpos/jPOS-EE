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

import org.apache.commons.cli.*;
import org.jpos.ee.*;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

import java.io.PrintWriter;
import java.util.Collections;

@SuppressWarnings("unused")
public class PASSWD implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        CommandLineParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption ("p", "password", true, "The password (mandatory)");
        CommandLine line = parser.parse(options, shl(shl(args)));

        if (args.length < 3) {
            showHelp (cli, args, options);
            return;
        }

        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            UserManager mgr = new UserManager(db);

            User user = mgr.getUserByNick(args[1], true);
            if (user == null) {
                cli.println ("User doesn't exist. Please create it first with the 'adduser' command");
                return;
            }
            if (!line.hasOption('p')) {
                cli.println ("A password must be given.");
                return;
            }

            mgr.setPassword(user, line.getOptionValue('p'));
            db.session().save(user);
            db.commit();
            cli.println ("User '" + user.getNickAndId() + "': password changed.");
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }

    private String[] shl (String[] args) {
        switch (args.length) {
            case 0:
                return args;
            case 1:
                return new String[0];
        }
        String[] shl = new String[args.length-1];
        System.arraycopy(args,1, shl, 0, args.length-1);
        return shl;
    }

    private void showHelp (CLIContext cli, String args[], Options options) {
        PrintWriter pw = new PrintWriter (cli.getOutputStream());
        HelpFormatter helpFormatter = new HelpFormatter ();
        helpFormatter.printHelp (args[0] + "<nick> [options]", options);
        helpFormatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, args[0], null, options, 0, HelpFormatter.DEFAULT_DESC_PAD, null,false);
    }
}
