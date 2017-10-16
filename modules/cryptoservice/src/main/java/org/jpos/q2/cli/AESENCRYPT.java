package org.jpos.q2.cli;

import org.jpos.crypto.CryptoService;
import org.jpos.crypto.SecureData;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.util.NameRegistrar;

import javax.crypto.spec.IvParameterSpec;
import java.nio.ByteBuffer;

public class AESENCRYPT implements CLICommand {
    CryptoService cs;

    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        cs = (CryptoService) NameRegistrar.getIfExists("crypto-service");
        if (args.length != 2) {
            usage(cli);
            if (cs == null)
                cli.println ("'crypto-service' not registered");
            return;
        }
        encrypt(cli, args[1]);
    }

    private void usage (CLIContext cli) {
        cli.println ("Usage: AESENCRYPT clear-text");
    }

    private void encrypt (CLIContext cli, String clear) throws Exception {
        SecureData sd = cs.aesEncrypt(clear.getBytes());
        cli.println (sd.getId() + " " + ISOUtil.hexString(sd.getEncoded()));
    }
}
