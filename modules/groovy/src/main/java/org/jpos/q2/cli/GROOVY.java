/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

package org.jpos.q2.cli;


import groovy.lang.Binding;
import org.codehaus.groovy.tools.shell.Groovysh;
import org.codehaus.groovy.tools.shell.IO;
import org.jline.terminal.Attributes;
import org.jline.terminal.Terminal;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;


public class GROOVY implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] strings) throws Exception {
       Terminal term = cli.getReader().getTerminal();

        Attributes termAttrs = term.getAttributes();
        termAttrs.setLocalFlag(Attributes.LocalFlag.ECHO, false);
        term.setAttributes(termAttrs);

        InputStream in = term.input();
        OutputStream out = term.output();
        OutputStream err = out;

        Binding binding = new Binding();
        binding.setVariable("q2", cli.getCLI().getQ2());
        binding.setVariable("cli", cli.getCLI());
        binding.setVariable("out", new PrintStream(out));  // PrintStream "out" in the Binding will redirect println()
        binding.setVariable("err", new PrintStream(err));

        IO io = new IO(in, out, err);

        String wasHeadless = System.getProperty("java.awt.headless");
        System.setProperty("java.awt.headless", "true");    // don't start awt/swing

        Groovysh ish = new Groovysh(binding, io);

        if (wasHeadless != null)                            // restore headless value
            System.setProperty("java.awt.headless", wasHeadless);
        else
            System.clearProperty("java.awt.headless");

        ish.run("");
    }
}
