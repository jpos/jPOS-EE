package org.jpos.ee.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.jpos.ee.support.BasicSetup;

import java.io.File;
import java.io.IOException;

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

    /**
     * @parameter default-value="false" expression="${allowOverride}"
     */
    private boolean allowOverride=false;

    public String getSetupDirectory()
    {
        return setupDirectory;
    }

    public void setSetupDirectory(String setupDirectory)
    {
        this.setupDirectory = setupDirectory;
    }

    public boolean isAllowOverride()
    {
        return allowOverride;
    }

    public void setAllowOverride(boolean allowOverride)
    {
        this.allowOverride = allowOverride;
    }

    public void execute() throws MojoExecutionException, MojoFailureException
    {
        final File runtimeDir = new File(getRuntimeDirectory());
        try
        {
            System.out.println("Starting setup...");
            System.out.println("-- Runtime directory: "+ runtimeDir.getAbsolutePath());
            System.out.println("-- Setup directory: "+new File(runtimeDir,setupDirectory).getAbsolutePath());
            if(allowOverride)
            {
                System.out.println("-- Allowing override of existing files");
            }
            new BasicSetup().install(allowOverride, setupDirectory);
            System.out.println("Setup complete");
        }
        catch (IOException e)
        {
            throw new MojoExecutionException("Failure while trying to run setup",e);
        }
    }
}
