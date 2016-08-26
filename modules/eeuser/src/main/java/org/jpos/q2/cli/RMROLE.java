package org.jpos.q2.cli;

import org.jpos.ee.DB;
import org.jpos.ee.Role;
import org.jpos.ee.RoleManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

@SuppressWarnings("unused")
public class RMROLE implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        if (args.length != 2) {
            cli.println("Usage: rmrole <role>");
            return;
        }
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            RoleManager rm = new RoleManager(db);
            Role r = rm.getRoleByName(args[1]);
            if (r != null)
                db.session().delete(r);
            db.commit();
            cli.println (r != null ? "Role " + r + " has been deleted" : "Role not found");
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }
}
