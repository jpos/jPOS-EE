package org.jpos.ee.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;

/**
 * jPOS-EE Build Plugin :: Setup
 *
 * @goal setup
 */
public class SetupMojo extends AbstractCommonMojo
{
    /**
     * @parameter default-value="." expression="${setupDirectory}"
     */
    private String setupDirectory;

    public void execute() throws MojoExecutionException, MojoFailureException
    {
        final File runtimeDir = new File(getRuntimeDirectory());

        try
        {
            final Process p = new ProcessBuilder("java", "-jar", "q2.jar", "-c", "setup " + setupDirectory + " ; shutdown --force")
                    .directory(runtimeDir).start();
            run(p);
        }
        catch (Exception e)
        {
            throw new MojoExecutionException("Failure while trying to run setup", e);
        }
    }
}
