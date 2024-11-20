package org.jpos.q2.cli;

import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.q2.QuartzAdaptor;
import org.jpos.util.NameRegistrar;
import org.quartz.JobDetail;

public class RUNJOB implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        if (args.length != 3) {
            cli.println ("Usage: RUNJOB <cronname> <jobid>");
            return;
        }
        try {
            QuartzAdaptor adaptor = NameRegistrar.get(args[1]);
            JobDetail job = adaptor.getJob(args[2]);
            if (job != null) {
                adaptor.scheduler().triggerJob(job.getKey());
            }
        } catch (NameRegistrar.NotFoundException e) {
            cli.println("QBean '" + args[1] + "' not found");
        }
    }
}
