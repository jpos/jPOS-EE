package org.jpos.ee.support;

public class ClassloaderUtil
{
    public static Class classForName(String name) throws ClassNotFoundException
    {
        try
        {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null)
            {
                return contextClassLoader.loadClass(name);
            }
        }
        catch (Throwable ignore)
        {
        }
        return Class.forName(name);
    }
}
