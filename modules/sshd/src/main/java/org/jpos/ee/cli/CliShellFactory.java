/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

package org.jpos.ee.cli;

import org.apache.sshd.common.Factory;
import org.apache.sshd.common.SshConstants;
import org.apache.sshd.server.*;
import org.apache.sshd.server.session.ServerSession;
import org.jpos.q2.CLI;
import org.jpos.q2.Q2;
import org.jpos.util.Log;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CliShellFactory implements Factory<Command>, CommandFactory
{
    Q2 q2;
    String[] prefixes;

    public CliShellFactory(Q2 q2, String[] prefixes)
    {
        this.q2 = q2;
        this.prefixes = prefixes;
    }

    public Command create()
    {
        return new JPosCLIShell(null);
    }

    @Override
    public Command createCommand(String command) {
        return new JPosCLIShell(command);
    }

    public class JPosCLIShell implements Command, SessionAware
    {
        InputStream in;
        OutputStream out;
        OutputStream err;
        SshCLI cli = null;
        ServerSession serverSession;
        String args;

        public void setInputStream(InputStream in)
        {
            this.in = in;
        }

        public void setOutputStream(OutputStream out)
        {
            this.out = out;
        }

        public void setErrorStream(OutputStream err)
        {
            this.err = err;
        }

        public void setExitCallback(ExitCallback exitCallback)
        {
        }

        public JPosCLIShell(String args) {
            this.args = args;
        }

        public void setSession(ServerSession serverSession)
        {
            this.serverSession = serverSession;
        }

        public void start(Environment environment) throws IOException
        {
            MyFilterOutputStream fout = new MyFilterOutputStream(out);
            cli = new SshCLI(q2, args != null ? null : in, fout, args, args == null);
            try
            {
                cli.setServerSession(serverSession);
                cli.start();
            }
            catch (Exception e)
            {
                throw new IOException("Could not start", e);
            }
        }

        public void destroy()
        {
            if (cli != null)
            {
                cli.stop();
            }
        }
    }



    protected class MyFilterOutputStream extends FilterOutputStream
    {
        public MyFilterOutputStream(OutputStream out)
        {
            super(out);
        }

        @Override
        public void write(int c) throws IOException
        {
            if (c == '\n' || c == '\r')
            {
                super.write('\r');
                super.write('\n');
                return;
            }
            super.write(c);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException
        {
            for (int i = off; i < len; i++)
            {
                write(b[i]);
            }
        }
    }

    public class SshCLI extends CLI
    {
        ServerSession serverSession = null;

        public SshCLI(Q2 q2, InputStream in, OutputStream out, String line, boolean keepRunning) throws IOException
        {
            super(q2, in, out, line, keepRunning);
        }

        protected boolean isRunning()
        {
            return !ctx.isStopped();
        }

        protected void markStopped()
        {
            ctx.setStopped(true);
        }

        protected void markStarted()
        {
            ctx.setStopped(false);
        }

        protected String[] getCompletionPrefixes()
        {
            return prefixes;
        }

        protected String getPrompt()
        {
            return "q2> ";
        }

        protected void handleExit()
        {
            if (serverSession != null)
            {
                try
                {
                    serverSession.disconnect(SshConstants.SSH2_DISCONNECT_BY_APPLICATION, "");
                }
                catch (IOException e)
                {
                    Log.getLog(Q2.LOGGER_NAME, "sshd").error(e);
                }
            }
        }

        public void setServerSession(ServerSession serverSession)
        {
            this.serverSession = serverSession;
        }
    }
}
