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
        sshd.setShellFactory(new CliShellFactory(getServer(), prefixes));
        sshd.setUserAuthFactories(Arrays.<NamedFactory<UserAuth>>asList(new UserAuthPublicKey.Factory()));
        sshd.setPublickeyAuthenticator(new AuthorizedKeysFileBasedPKA(username,authorizedKeysFilename));
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
