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

import org.apache.sshd.SshServer;
import org.apache.sshd.common.NamedFactory;
import org.apache.sshd.server.UserAuth;
import org.apache.sshd.server.auth.UserAuthPublicKey;
import org.apache.sshd.server.keyprovider.SimpleGeneratorHostKeyProvider;
import org.jpos.q2.QBeanSupport;

import java.util.Arrays;

public class SshCLI extends QBeanSupport implements SshCLIContextMBean
{
    SshServer sshd = null;

    @Override
    protected void startService() throws Exception
    {
        String username=cfg.get("auth-username","admin");
        String authorizedKeysFilename=cfg.get("authorized-keys-file","cfg/authorized_keys");
        String hostKeys=cfg.get("hostkeys-file","cfg/hostkeys.ser");
        int port=cfg.getInt("port",2222);

        String[] prefixes= getPrefixes();

        sshd = SshServer.setUpDefaultServer();
        sshd.setPort(port);
        sshd.setKeyPairProvider(new SimpleGeneratorHostKeyProvider(hostKeys));

        CliShellFactory csf = new CliShellFactory(getServer(), prefixes);
        sshd.setShellFactory(csf);
        sshd.setCommandFactory(csf);

        sshd.setUserAuthFactories(Arrays.<NamedFactory<UserAuth>>asList(new UserAuthPublicKey.Factory()));
        sshd.setPublickeyAuthenticator(new AuthorizedKeysFileBasedPKA(username, authorizedKeysFilename));
        sshd.start();
        log.info("Started SSHD @ port "+port);
    }

    @Override
    protected void stopService() throws Exception
    {
        log.info("Stopping SSHD");
        if(sshd!=null)
        {
            sshd.stop(true);
            sshd=null;
        }
    }

    private String[] getPrefixes()
    {
        String[] prefixes=cfg.getAll("prefixes");
        if(prefixes!=null && prefixes.length>0) return prefixes;

        return new String[]{"org.jpos.q2.cli.",
                            "org.jpos.ee.cli.cmds."};
    }
}
