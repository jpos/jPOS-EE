package org.jpos.q2.cli.flyway;

import org.flywaydb.core.Flyway;
import org.jpos.flyway.FlywaySupport;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.FLYWAY;

public class MIGRATE extends FlywaySupport implements CLICommand{
    @Override
    public void exec(CLIContext cli, String[] args) {
        try {
            Flyway flyway = getFlyway((String) cli.getUserData().get(FLYWAY.PREFIX), args);
            int migrations = flyway.migrate();
            cli.println ("Applied " + migrations + "migration(s)");
        } catch (Exception e) {
            cli.println(e.getMessage());
        }
    }
}
