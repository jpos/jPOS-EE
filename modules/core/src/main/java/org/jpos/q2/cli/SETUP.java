/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2012 Alejandro P. Revilla
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

import org.jpos.ee.support.BasicSetup;
import org.jpos.q2.CLI;

public class SETUP implements CLI.Command
{
    public void exec(CLI cli, String[] args) throws Exception
    {
        String directory="samples";
        if(args.length>1)
        {
            directory=args[1];
        }

        BasicSetup setup=new BasicSetup();
        setup.install(false,directory);
        cli.println("Sample setup files have been installed in '"+directory+"' directory.");
    }
}
