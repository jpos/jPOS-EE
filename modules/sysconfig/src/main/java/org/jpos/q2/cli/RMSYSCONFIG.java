package org.jpos.q2.cli;

import org.jpos.ee.DB;
import org.jpos.ee.SysConfigManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

@SuppressWarnings("unused")
public class RMSYSCONFIG implements CLICommand {
    public static String READPERM = "sysconfig.read";
    public static String WRITEPERM = "sysconfig.write";

    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        if (args.length < 2) {
            cli.println("Usage: rmsysconfig <id> ");
            return;
        }
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            SysConfigManager mgr = new SysConfigManager(db);
            boolean deleted = mgr.delete(args[1]);
            db.commit();
            cli.println ("sysconfig " + (deleted ? "deleted" : "not found"));
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }
}
