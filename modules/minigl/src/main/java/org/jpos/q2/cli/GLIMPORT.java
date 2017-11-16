package org.jpos.q2.cli;

import org.jpos.gl.tools.Import;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

@SuppressWarnings("unused")
public class GLIMPORT implements CLICommand
{
    public void exec(CLIContext cli, String[] args)
    {
        Import.main(new String[] { args[1] });
    }
}
