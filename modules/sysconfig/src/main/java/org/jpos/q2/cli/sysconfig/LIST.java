package org.jpos.q2.cli.sysconfig;

import org.jpos.ee.DB;
import org.jpos.ee.SysConfig;
import org.jpos.ee.SysConfigManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.SYSCONFIG;

@SuppressWarnings("unused")
public class LIST implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        try (DB db = new DB()) {
            db.open();
            SysConfigManager mgr = new SysConfigManager(db);

            if (cli.getUserData().containsKey(SYSCONFIG.PREFIX))
                mgr.setPrefix((String) cli.getUserData().get(SYSCONFIG.PREFIX));
            else if (args.length > 1)
                mgr.setPrefix(args[1]);
            String format = "%" + mgr.getMaxIdLength() + "s: %s";
            for (SysConfig sc : mgr.getAll()) {
                cli.println (String.format (format, sc.getId(), sc.getValue()));
            }
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }
}
