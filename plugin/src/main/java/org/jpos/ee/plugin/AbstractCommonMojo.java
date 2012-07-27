package org.jpos.ee.plugin;

import org.apache.maven.plugin.AbstractMojo;

abstract class AbstractCommonMojo extends AbstractMojo
{
    /**
     * The runtime directory. Defaults to 'runtime'
     *
     * @parameter default-value="runtime"
     */
    String runtimeDirectory;

    public String getRuntimeDirectory()
    {
        return runtimeDirectory;
    }

    public void setRuntimeDirectory(String runtimeDirectory)
    {
        this.runtimeDirectory = runtimeDirectory;
    }
}
