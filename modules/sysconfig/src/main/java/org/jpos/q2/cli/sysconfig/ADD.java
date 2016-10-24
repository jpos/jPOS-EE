package org.jpos.q2.cli.sysconfig;

import org.jpos.ee.DB;
import org.jpos.ee.SysConfigManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.SYSCONFIG;

@SuppressWarnings("unused")
public class ADD implements CLICommand {
    public static String READPERM = "sysconfig.read";
    public static String WRITEPERM = "sysconfig.write";

    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        if (args.length < 3) {
            cli.println("Usage: add <id> <value>");
            return;
        }
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            SysConfigManager mgr = new SysConfigManager(db);
            if (cli.getUserData().containsKey(SYSCONFIG.PREFIX))
                mgr.setPrefix((String) cli.getUserData().get(SYSCONFIG.PREFIX));
            boolean added = false;
            if (mgr.get(args[1], null) == null) {
                mgr.put(args[1], args[2], READPERM, WRITEPERM);
                added = true;
            }
            db.commit();
            cli.println ("sysconfig " + (added ? "created" : "already exists"));
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }
}

