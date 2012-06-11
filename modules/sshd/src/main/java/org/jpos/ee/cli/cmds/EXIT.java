package org.jpos.ee.cli.cmds;

import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

public class EXIT implements CLICommand
{
    public void exec(CLIContext ctx, String[] strings) throws Exception
    {
        ctx.println("Exiting...");
        ctx.setStopped(true);
    }
}
