package org.jpos.q2.cli;

import org.jpos.ee.DB;
import org.jpos.ee.Role;
import org.jpos.ee.RoleManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

@SuppressWarnings("unused")
public class SHOWROLES implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        try (DB db = new DB()) {
            db.open();
            RoleManager rm = new RoleManager(db);
            for (Role r : rm.getAll()) {
                cli.println (r.getName() + " " + r.getPermissions());
            }
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }
}
