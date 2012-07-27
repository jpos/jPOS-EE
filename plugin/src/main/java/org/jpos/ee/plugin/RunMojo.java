package org.jpos.ee.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;
import java.io.IOException;

/**
 * jPOS-EE Build Plugin :: Run Q2
 *
 * @goal run
 */
public class RunMojo extends AbstractCommonMojo
{
    public void execute() throws MojoExecutionException, MojoFailureException
    {
        try
        {
            doRun();
        }
        catch (Exception e)
        {
            throw new MojoExecutionException("Could not run Q2", e);
        }
    }

    private void doRun() throws IOException, InterruptedException
    {
        final Process p = new ProcessBuilder("java", "-jar", "q2.jar", "-cli")
                .directory(new File(getRuntimeDirectory())).start();
        run(p);
    }
}
