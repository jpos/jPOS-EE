/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2020 jPOS Software SRL
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
            String scr = e.getAttributeValue("src");
            if (scr != null)
                shell.evaluate(new File(scr));
            else
                shell.evaluate(e.getText());
        } catch (Exception e) {
            getLog().error(e);
        }
    }
}
