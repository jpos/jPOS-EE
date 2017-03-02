package org.jpos.q2.cli;

import org.jpos.q2.CLIContext;
import org.jpos.q2.CLISubSystem;

import java.io.File;

/**
 * CLI implementation - Binlog subsystem
 */
public class BINLOG implements CLISubSystem {
    @Override
    public String getPrompt(CLIContext ctx, String[] args) {
        if (args.length < 2) {
            ctx.println ("Usage: binlog directory-name");
            return null;
        }
        ctx.getUserData().put("binlog", args[1]);
        return String.format("(%s)> ", new File(args[1]).getName());
    }

    @Override
    public String[] getCompletionPrefixes(CLIContext ctx, String[] args) {
        if (args.length < 2)
            return null;
        return new String[] { "org.jpos.q2.cli.binlog." };
    }
}

