package org.jpos.q2.cli;

import org.jpos.gl.tools.Export;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

@SuppressWarnings("unused")
public class GLEXPORT implements CLICommand
{
    public void exec(CLIContext cli, String[] args)
    {
        Export.main(new String[]{args[1]});
    }
}
