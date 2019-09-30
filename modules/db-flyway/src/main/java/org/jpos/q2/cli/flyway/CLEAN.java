package org.jpos.q2.cli.flyway;

import org.flywaydb.core.api.FlywayException;
import org.jpos.core.Environment;
import org.jpos.flyway.FlywaySupport;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.cli.FLYWAY;

public class CLEAN extends FlywaySupport implements CLICommand{
    @Override
    public void exec(CLIContext cli, String[] args) {
        boolean superSure = false;
        boolean sure  = cli.confirm("Are you sure you want to Clean your database (Yes/No) ? ");
        if (sure)
            superSure = cli.confirm("This action can not be reversed - still want to proceed (Yes/No) ? ");

        if (superSure) {
            try {
                getFlyway((String) cli.getUserData().get(FLYWAY.PREFIX), args).clean();
            } catch (FlywayException e) {
                cli.println (e.getMessage());
            }
        }
        else {
            cli.println ("No action taken");
        }
    }
}
