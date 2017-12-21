package org.jpos.q2.cli;

import org.apache.commons.cli.*;
import org.jpos.ee.DB;
import org.jpos.gl.GLPermission;
import org.jpos.gl.GLSession;
import org.jpos.gl.GLUser;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

import java.io.PrintWriter;
import java.util.Collections;

public class ADDGLUSER implements CLICommand {

    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        CommandLineParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption ("n", "name", true, "GLUser's name");
        options.addOption ("p", "permissions", true, "GLUser's permissions");
        CommandLine line = parser.parse(options, shl(shl(args)));

        if (args.length < 2) {
            showHelp (cli, args, options);
            return;
        }
        if (!line.hasOption('n')) {
            cli.println ("--name parameter is required. See --help for help");
            return;
        }

        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            GLSession gls = new GLSession(db);
            GLUser u = gls.getUser(args[1]);
            if (u != null) {
                cli.println ("GLUser already exists");
                return;
            }
            GLPermission[] pp = null;
            if (line.hasOption('p')) {
                String[] permissions = line.getOptionValues('p');
                pp = new GLPermission[permissions.length];
                int i=0;
                for (String s : permissions) {
                    GLPermission p = new GLPermission(s);
                    pp[i++] = p;
                }
            }
            GLUser user = new GLUser();
            user.setNick (args[1]);
            user.setName (line.getOptionValue('n'));
            db.session().save(user);
            if (pp != null)
                Collections.addAll(user.getPermissions(), pp);

            db.commit();
            cli.println ("GLUser '" + user.getNick() + "' created");
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
        helpFormatter.printHelp (args[0] + " <nick> [options]", options);
        helpFormatter.printHelp(pw, HelpFormatter.DEFAULT_WIDTH, args[0], null, options, 0, HelpFormatter.DEFAULT_DESC_PAD, null,false);
    }
}
