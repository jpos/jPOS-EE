package org.jpos.q2.cli;

import org.jpos.q2.CLIContext;
import org.jpos.q2.CLISubSystem;

public class SYSCONFIG implements CLISubSystem {
    public static final String PREFIX = "sysconfig.prefix";
    @Override
    public String getPrompt(CLIContext ctx, String[] args) {
        String prefix = null;
        if (args.length > 1) {
            prefix = args[1];
            if (!prefix.endsWith("."))
                prefix  = prefix + ".";
            ctx.getUserData().put(PREFIX, prefix);
        } else {
            ctx.getUserData().remove(PREFIX);
        }
        return  "sysconfig" + (prefix != null ? "[" + args[1] + "]" : "") + "> ";
    }

    @Override
    public String[] getCompletionPrefixes(CLIContext ctx, String[] args) {
        return new String[] { "org.jpos.q2.cli.sysconfig." };
    }
}

