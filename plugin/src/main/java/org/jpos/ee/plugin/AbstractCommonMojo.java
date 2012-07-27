package org.jpos.ee.plugin;

import org.apache.maven.plugin.AbstractMojo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

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

    protected void run(final Process p) throws IOException, InterruptedException
    {
        final File runtimeDir = new File(getRuntimeDirectory());
        final File shutdownXmlFile = new File(runtimeDir, "deploy/shutdown.xml");

        if (shutdownXmlFile.exists())
        {
            shutdownXmlFile.delete();
        }

        final Thread t1 = pipe(p.getErrorStream(), System.err);
        final Thread t2 = pipe(p.getInputStream(), System.out);
        final Thread t3 = pipein(System.in, p.getOutputStream());

        t1.start();
        t2.start();
        t3.start();

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Destroying process...");
                try
                {
                    deployShutdown(shutdownXmlFile);
                    try
                    {
                        p.waitFor();
                    }
                    catch (InterruptedException e)
                    {
                    }
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    try
                    {
                        if (shutdownXmlFile.exists())
                        {
                            shutdownXmlFile.delete();
                        }
                    }
                    catch (Exception e)
                    {
                    }
                    p.destroy();
                }
            }
        }));

        p.waitFor();
        System.exit(p.exitValue());
    }

    private void deployShutdown(File shutdownXmlFile) throws IOException
    {
        FileWriter w = new FileWriter(shutdownXmlFile);
        w.write("<shutdown/>");
        w.flush();
        w.close();
    }

    private Thread pipe(final InputStream src, final PrintStream dest)
    {
        return new Thread(new Runnable()
        {
            public void run()
            {
                try
                {
                    byte[] buffer = new byte[1024];
                    for (int n = 0; n != -1; n = src.read(buffer))
                    {
                        dest.write(buffer, 0, n);
                    }
                }
                catch (IOException e)
                {
                }
            }
        });
    }

    private Thread pipein(final InputStream src, final OutputStream dest)
    {
        return new Thread(new Runnable()
        {
            public void run()
            {
                try
                {
                    int ret = -1;
                    while ((ret = src.read()) != -1)
                    {
                        dest.write(ret);
                        dest.flush();
                    }
                }
                catch (IOException e)
                {
                }
            }
        });
    }
}
