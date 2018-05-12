/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2018 jPOS Software SRL
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

package org.jpos.q2.cli.crypto;

import org.bouncycastle.openpgp.PGPException;
import org.jpos.crypto.CryptoService;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.util.NameRegistrar;

@SuppressWarnings("unused")
public class DECRYPT implements CLICommand {
    private CryptoService cs;

    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        cs = NameRegistrar.getIfExists("crypto-service");
        if (args.length != 3) {
            usage(cli);
            if (cs == null)
                cli.println ("'crypto-service' not registered");
            return;
        }
        try {
            decrypt(cli, args[1], args[2]);
        } catch (Exception e) {
            cli.println (e.getMessage());
        }
    }

    private void usage (CLIContext cli) {
        cli.println ("Usage: DECRYPT key-id cypher-text");
    }

    private void decrypt (CLIContext cli, String keyId, String cryptogram) throws Exception {
        try {
            cs.loadKey(this.toString(), keyId, cs.isUnlocked() ? null : cli.getReader().readLine("Password: ", '*').toCharArray());
        } catch (PGPException e) {
            throw new IllegalArgumentException("Invalid password/key - " + e.getMessage());
        }
        byte[] cleartext = cs.aesDecrypt(this.toString(), keyId, ISOUtil.hex2byte(cryptogram));
        cs.unloadKey(this.toString(), keyId);
        cli.println (ISOUtil.hexdump(cleartext));
    }
}
