package org.jpos.q2.cli.flyway;

import org.jpos.flyway.FlywaySupport;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.FLYWAY;

public class VALIDATE extends FlywaySupport implements CLICommand{
    @Override
    public void exec(CLIContext cli, String[] args) {
        try {
            getFlyway((String) cli.getUserData().get(FLYWAY.PREFIX), args).validate();
        } catch (Exception e) {
            cli.println(e.getMessage());
        }
    }
}
