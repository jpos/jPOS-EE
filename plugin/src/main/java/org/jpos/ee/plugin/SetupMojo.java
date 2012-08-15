package org.jpos.ee.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * jPOS-EE Build Plugin :: Setup
 *
 * @goal setup
 */
@SuppressWarnings("UnusedDeclaration")
public class SetupMojo extends AbstractCommonMojo
{
    /**
     * @parameter default-value="." expression="${setupDirectory}"
     */
    private String setupDirectory;

    public String getSetupDirectory()
    {
        return setupDirectory;
    }

    public void setSetupDirectory(String setupDirectory)
    {
        this.setupDirectory = setupDirectory;
    }

    public void execute() throws MojoExecutionException, MojoFailureException
    {
        try
        {
            final Process p = new ProcessBuilder("java", "-jar", "q2.jar", "-c", "setup " + setupDirectory + " ; shutdown --force")
                    .directory(runtimeDirectory).start();
            run(p);
        }
        catch (Exception e)
        {
            throw new MojoExecutionException("Failure while trying to run setup", e);
        }
    }
}
