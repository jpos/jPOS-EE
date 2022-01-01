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

package org.jpos.q2.cli.crypto;

import java.util.Base64;

import org.jpos.crypto.CryptoService;
import org.jpos.crypto.SecureData;
import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;
import org.jpos.util.NameRegistrar;

@SuppressWarnings("unused")
public class ENCRYPT implements CLICommand {
    private CryptoService cs;

    @Override
    public void exec(CLIContext cli, String[] args) throws Exception {
        cs = NameRegistrar.getIfExists("crypto-service");
        if (args.length != 2) {
            usage(cli);
            return;
        }
        if (cs == null) {
            cli.println("'crypto-service' not registered");
            return;
        }
        encrypt(cli, args[1]);
    }

    private void usage (CLIContext cli) {
        cli.println ("Usage: ENCRYPT clear-text");
    }

    private void encrypt (CLIContext cli, String clear) throws Exception {
        SecureData sd = cs.aesEncrypt(clear.getBytes());
        cli.println (sd.getId() + " " + Base64.getEncoder().encodeToString(sd.getEncoded()));
    }
}
