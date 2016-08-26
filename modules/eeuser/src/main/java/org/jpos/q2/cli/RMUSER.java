package org.jpos.q2.cli;

import org.jpos.ee.*;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

@SuppressWarnings("unused")
public class RMUSER implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        if (args.length != 2) {
            cli.println("Usage: rmuser <user>");
            return;
        }
        try (DB db = new DB()) {
            db.open();
            db.beginTransaction();
            UserManager mgr = new UserManager(db);
            User u = mgr.getUserByNick(args[1]);
            if (u != null) {
                u.setDeleted(true);
            }
            db.commit();
            cli.println(u != null ? "User " + u.getNickAndId() + " has been deleted" : "User does not exist");
        } catch (Exception e) {
            cli.println(e.getMessage());
        }
    }
}
