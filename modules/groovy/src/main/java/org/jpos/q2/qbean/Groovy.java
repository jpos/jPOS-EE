/*
 * Copyright (c) 2004 jPOS.org 
 *
 * See terms of license at http://jpos.org/license.html
 *
 */

package org.jpos.q2.qbean;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import org.jdom2.Element;
import org.jpos.q2.QBeanSupport;

import java.io.File;

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
            Element e = getPersist();
            Binding binding = new Binding();
            binding.setVariable("qbean", this);
            binding.setVariable("log", getLog());
            binding.setVariable("cfg", getConfiguration());
            GroovyShell shell = new GroovyShell(binding);
            String script = e.getAttributeValue("script");
            if (script != null)
                shell.evaluate(new File(script));
            else
                shell.evaluate(e.getText());
        } catch (Exception e) {
            getLog().error(e);
        }
    }
}
