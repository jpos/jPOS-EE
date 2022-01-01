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

package org.jpos.q2.qbean;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.codehaus.groovy.runtime.StackTraceUtils;
import org.jdom2.Element;
import org.jpos.groovy.GroovySetup;
import org.jpos.q2.QBeanSupport;
import org.jpos.q2.QFactory;

import java.io.File;
import java.net.URL;

/**
 * Groovy Interpreter QBean.
 */
@SuppressWarnings("unused")
public class Groovy extends QBeanSupport implements Runnable {
    public void startService() {
        new Thread(this, getName()).start();
    }

    public void run() {
        try {
            ClassLoader thisCL= this.getClass().getClassLoader();
            URL scriptURL= thisCL.getResource("org/jpos/groovy/JPOSGroovyDefaults.groovy");
            GroovySetup.runScriptOnce(scriptURL);

            Element e = getPersist();
            Binding binding = new Binding();
            binding.setVariable("qbean", this);
            binding.setVariable("log", getLog());
            binding.setVariable("cfg", getConfiguration());
            GroovyShell shell = new GroovyShell(binding);
            String src = e.getAttributeValue("src");
            if (src != null)
            {
                src= QFactory.getAttributeValue(e, "src");
                shell.evaluate(new File(src));
            }
            else
                shell.evaluate(e.getText());
        } catch (Exception e) {
            getLog().error(StackTraceUtils.deepSanitize(e));
        }
    }
}
