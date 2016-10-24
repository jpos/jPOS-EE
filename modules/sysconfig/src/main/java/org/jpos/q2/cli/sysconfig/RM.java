package org.jpos.q2.cli.sysconfig;

import org.jpos.ee.DB;
import org.jpos.ee.SysConfigManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.SYSCONFIG;

@SuppressWarnings("unused")
public class RM implements CLICommand {
    public static String READPERM = "sysconfig.read";
    public static String WRITEPERM = "sysconfig.write";

    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        if (args.length < 2) {
            cli.println("Usage: rm <id> ");
            return;
        }
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            SysConfigManager mgr = new SysConfigManager(db);
            if (cli.getUserData().containsKey(SYSCONFIG.PREFIX))
                mgr.setPrefix((String) cli.getUserData().get(SYSCONFIG.PREFIX));
            boolean deleted = mgr.delete(args[1]);
            db.commit();
            cli.println ("sysconfig " + (deleted ? "deleted" : "not found"));
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }
}
