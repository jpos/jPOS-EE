/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.groovy;

import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.control.customizers.ImportCustomizer;
import org.codehaus.groovy.runtime.StackTraceUtils;
import org.jpos.core.Configurable;
import org.jpos.core.XmlConfigurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;
import org.jpos.q2.QFactory;
import org.jpos.util.Log;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.jdom2.Element;

import groovy.lang.GroovyClassLoader;
import groovy.lang.Script;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;


/**
 * Groovy-based {@link ISORequestListener} whose {@link ISORequestListener#process(ISOSource, ISOMsg)} method can be
 * specified using a Groovy script.
 *
 * <p>The script's return value will be used as the return value from the {@code process} method.
 * A non-null return value is interpreted to be "true-ish". An explicit null return is interpreted to be false.
 * A <code>boolean/Boolean</code> value will be returned as such.
 *
 * <p>The Groovy script code can be given as text within the 'script' element (a {@code CDATA} section
 * is recommended), or in an external file pointed to by the 'src' attribute. The 'src' path attribute will
 * override the text/{@code CDATA} script (to avoid confusion, only one of the options should be used).
 *
 * <p>By default, scripts are pre-compiled by a {@code GroovyClassLoader}. If you want the script
 * to be evaluated each time, then set the "compiled" property to "false".
 *
 * <p>As a convenience, a comma-separated list of ISO-8583 MTI's can be given in the "whitelist" property.
 * If given, the script will be called <em>only</em> for requests having those MTI's. For requests not in the
 * whitelist, the {@link ISORequestListener#process(ISOSource, ISOMsg)} method will return "false", so the
 * request can be handled by another {@code ISORequestListener} down the line.
 *
 * <p>The following variables will be bound to the Groovy script's {@code Binding}:
 * <ul>
 *  <li><b>message</b> - the {@code ISOMsg} for this request</li>
 *  <li><b>source</b> - the {@code ISOSource} for message</li>
 *  <li><b>log</b> - a reference to {@code this} instance (since this class extends {@code org.jpos.util.Log})</li>
 *  <li><b>cfg</b> - this {@code ISORequestListener}'s {@code Configuration} properties</li>
 *  <li><b>xmlCfg</b> - this {@code ISORequestListener}'s configuration {@code Element}</li>
 * </ul>
 *
 * <p>We also recommend adding a "realm" attribute to the "request-listener" element, to identify errors in the logs.
 *
 * <h1>Examples:</h1>
 *
 * <p>A Groovy script given as embedded text in a {@code CDATA} section. The script will be pre-compiled, and called
 * only for requests of the MTI's given in the "whitelist" property.
 * <pre>
 *     &lt;request-listener class="org.jpos.groovy.GroovyRequestListener" logger="Q2" realm="groovy-test-one"&gt;
 *       &lt;property name="whitelist" value="0100, 0420" /&gt;
 *       &lt;script&gt;
 *         &lt;![CDATA[
 *             // ... embedded script
 *         ]]&gt;
 *       &lt;/script&gt;
 *     &lt;/request-listener&gt;
 * </pre>
 *
 * <p>A Groovy script given in an external file. The "compiled" property is set to "false", so the script
 * will be interpreted and evaluated for each request. The script will be called for all MTI's.
 * <pre>
 *     &lt;request-listener class="org.jpos.groovy.GroovyRequestListener" logger="Q2" realm="groovy-test-two"&gt;
 *       &lt;property name="compiled" value="false" /&gt;
 *       &lt;script src="../cfg/reqlistener2.groovy" /&gt;
 *     &lt;/request-listener&gt;
 * </pre>
 *
 * @author <a href="mailto:barspi@transactility.com">Barzilai Spinak</a>
 * @version $Revision$ $Date$
 */
@SuppressWarnings("unchecked")
public class GroovyRequestListener extends Log
    implements ISORequestListener, Configurable, XmlConfigurable
{
    private boolean compiled= true;
    private GroovyClassLoader gcl;          // this instance's GCL which can be used to parse source into instances of Class<Script>
    private Object script;                  // can be an instance of String, File, or Class<Script>
    private String scriptName;              // a printable name (a file name, or generated from the realm)

    protected HashSet whitelist;
    Configuration cfg;
    Element xmlCfg;

    /**
     * @param cfg
     * <ul>
     *  <li>whitelist - supported message types (example: "1100,1220")
     *  <li>script - Groovy script to run (given as CDATA or in a file pointed to by the 'src' attribute)
     * </ul>
    */
    @Override
    public void setConfiguration (Configuration cfg)
        throws ConfigurationException
    {
        this.cfg= cfg;
        String[] mti= cfg.get ("whitelist", "*").split("[ ,]+");   // space or comma
        whitelist = new HashSet(Arrays.asList(mti));
    }


    /**
     * Handle extra XML configurations from its inner Elements.
     *
     * <p>We expect an inner 'script' Element holding a Groovy script. The source code can be given as CDATA,
     * or in a file pointed to by the 'src' attribute. By default, the script will be pre-compiled. If the
     * 'compiled' attribute of the 'script' element is set to 'false', the script will be parsed and
     * compiled for each invocation of the {@code process} method.
     *
     * <p>This is useful when testing/developing, and the script is given by an external file, which can be
     * changed during run-time.
     *
     * @param e configuration Element
     * @throws ConfigurationException if no 'script' element is given.
    */
    @Override
    public void setConfiguration(Element e) throws ConfigurationException
    {
        ClassLoader thisCL= this.getClass().getClassLoader();
        URL scriptURL= thisCL.getResource("org/jpos/groovy/JPOSGroovyDefaults.groovy");
        GroovySetup.runScriptOnce(scriptURL);

        xmlCfg= e;

        script= getScript(e.getChild("script"));
        if (script == null)                           // avoid typos, for instance
            throw new ConfigurationException(("GroovyRequestListener without mandatory 'script' element."));
    }


    public boolean process (ISOSource source, ISOMsg m)
    {
        Object ret= null;                   // the groovy return value

        try
        {
            String mti = m.getMTI ();
            if (!whitelist.contains(mti) && !whitelist.contains("*"))   // not in whitelist
                return false;                                           // let another request handle it

            Binding binding= new Binding();
            binding.setVariable("source", source);
            binding.setVariable("message", m);
            binding.setVariable("log", this);
            binding.setVariable("cfg", cfg);
            binding.setVariable("xmlCfg", xmlCfg);

            if (compiled)
            {
                Script s= ((Class<Script>)script).newInstance();
                s.setBinding(binding);
                ret= s.run();
            }
            else // !compiled, evaluate it each time
            {
                GroovyShell shell= new GroovyShell(binding,newCompilerConfiguration());
                if (script instanceof File)
                    ret= shell.evaluate((File)script);
                else if (script instanceof String)
                    ret= shell.evaluate((String)script, scriptName) ;
            }
        }
        catch (Exception e)
        {
            error(StackTraceUtils.deepSanitize(e));
        }

        // any non-null and non-boolean value is considered "true-ish"
        // a null return is considered false
        if (ret != null)
        {
            if (ret instanceof Boolean)
                return ((Boolean) ret).booleanValue();
            else
                return true;
        }
        else
            return false;
    }


    /**
    * Helper method to {@link #setConfiguration(Element)}
    * Returns a String, a File, or a fully parsed {@code Class&lt;groovy.lang.Script&gt;}.
    */
    protected Object getScript (Element e) throws ConfigurationException
    {
        compiled= cfg.getBoolean("compiled", true);
        String src=     e.getAttributeValue("src");
        String srcText= null;
        File f=         null;

        if (src != null)
        {
            src= QFactory.getAttributeValue(e, "src");          // effective src, after ${} replacements
            scriptName= src;                                    // should be a file path, will be output as file name part
            f= new File(src);
            if (!f.canRead())
                throw new ConfigurationException ("Can't read '" + src + "'");
            if (!compiled)
                return f;
        }
        else
        {
            scriptName= "GroovyRequestListener:"+getRealm();    // dynamic script name to show in logs and dumps
            srcText= e.getText();   // this returns, at worst, an empty String
            if (!compiled)
                return srcText;
        }

        // Here we can assume compiled == true (or it would have returned from the block above).
        // So we pre-compile the script into a Class<Script> object
        // that will be instantiated for each invocation of the participant's method
        try
        {
            gcl= new GroovyClassLoader(this.getClass().getClassLoader(),newCompilerConfiguration());
            // TODO: We can add CompilerConfiguration to set a JDK8 target
            // Also, using CompilationCustomizer's I think we can mandate a @CompileStatic
            // as explained in http://docs.groovy-lang.org/latest/html/documentation/#_static_compilation_by_default
            // (start by reading the sections above that link)
            // This @CompileStatic could be added as a flag in an XML attribute
            // Other options could include adding some default imports to the script using ImportCustomizer
            // and then we can create a CompilerConfiguration to pass to the GCL o GroovyShell

            Class clazz;
            if (f != null)
                clazz= gcl.parseClass(f);
            else
                clazz= gcl.parseClass(srcText, scriptName);

            // We only support Groovy Scripts, not classes
            if (!Script.class.isAssignableFrom(clazz))
            {
                throw new ConfigurationException(
                    "Groovy code for '"+scriptName+"' "+
                    "must be a simple script, not a class."
                );
            }
            return clazz;
        }
        catch (IOException ex)
        {
            throw new ConfigurationException(ex.getMessage(), ex.getCause());
        }
    }
    protected CompilerConfiguration newCompilerConfiguration(){
        CompilerConfiguration conf = new CompilerConfiguration();
        ImportCustomizer customizer  = new ImportCustomizer();
        customizer.addStaticStars("org.jpos.transaction.TransactionConstants");
        customizer.addStaticStars("org.jpos.transaction.ContextConstants");
        conf.addCompilationCustomizers(customizer);

        String[] paths= cfg.getAll("classpath");
        if (paths.length > 0)
        {
            List<String> cpList= Arrays.asList(paths);
            conf.setClasspathList(cpList);
        }

        return conf;
    }
}
