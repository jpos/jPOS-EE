package org.jpos.q2.cli.flyway;

import org.jpos.flyway.FlywaySupport;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.FLYWAY;

public class BASELINE extends FlywaySupport implements CLICommand{
    @Override
    public void exec(CLIContext cli, String[] args) {
        getFlyway((String) cli.getUserData().get(FLYWAY.PREFIX), args).baseline();
    }
}
