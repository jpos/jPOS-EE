package org.jpos.q2.cli;


import groovy.lang.Binding;
import org.codehaus.groovy.tools.shell.Groovysh;
import org.codehaus.groovy.tools.shell.IO;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;


public class GROOVY implements CLICommand
{
  @Override
  public void exec(CLIContext cli, String[] strings) throws Exception
  {
    // if we use cli.getXxxStream(), it doesn't work correctly during remote access
    InputStream  in=  cli.getReader().getTerminal().input();
    OutputStream out= cli.getReader().getTerminal().output();
    OutputStream err= out;

    Binding binding= new Binding();
    binding.setVariable("q2",   cli.getCLI().getQ2());
    binding.setVariable("cli",  cli.getCLI());
    binding.setVariable("out",  new PrintStream(out));  // PrintStream "out" in the Binding will redirect println()
    binding.setVariable("err",  new PrintStream(err));

    IO io= new IO(in, out, err);

    String wasHeadless= System.getProperty("java.awt.headless");
    System.setProperty("java.awt.headless", "true");    // don't start awt/swing

    Groovysh ish= new Groovysh(binding, io);

    if (wasHeadless != null)                            // restore headless value
      System.setProperty("java.awt.headless", wasHeadless);
    else
      System.clearProperty("java.awt.headless");

    // control will return to exec after groovy session ends
    ish.run("");

    // append current session's history to $HOME/.groovy/groovysh.history
    //
    // TODO: BBB the history file name is currently hardcoded in Groovysh#run(String),
    // therefore it's shared by all sessions of interactive groovysh for the user.
    // It would be nice to have it configurable for jPOS purposes, or even per-Q2 app
    // One option is to subclass Groovysh and @Override run()
    // Another option is to fork groovy-core, do a proper enhancement, and send a Pull Request
    ish.getHistory().flush();
  }

}
