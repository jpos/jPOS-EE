package org.jpos.q2.cli;

import org.jpos.ee.DB;
import org.jpos.ee.Permission;
import org.jpos.ee.Role;
import org.jpos.ee.RoleManager;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

import java.util.Set;

@SuppressWarnings("unused")
public class ADDROLE implements CLICommand {

    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        if (args.length < 2) {
            cli.println("Usage: addrole <role> <permission 1> <permission 2> ... <permission n>");
            return;
        }
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            RoleManager rm = new RoleManager(db);
            Role role = null;
            if (rm.getRoleByName(args[1]) == null) {


                role = new Role(args[1]);
                Set<Permission> perms = role.getPermissions();
                for (int i = 2; i < args.length; i++)
                    perms.add(Permission.valueOf(args[i]));
                db.save(role);
            }
            db.commit();
            cli.println (role != null ? "Role created " + role.getName() : " Role already exists");
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }
}
