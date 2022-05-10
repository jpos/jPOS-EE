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

package org.jpos.space;

import org.jpos.q2.QBeanSupport;
import org.jpos.core.ConfigurationException;
import org.jpos.util.NameRegistrar;
import org.jdom2.Element;

/**
 * RemoteSpaceAdaptor
 * @author Alejandro Revilla
 */
public class ReplicatedSpaceAdaptor extends QBeanSupport {
    private Space sp = null;
    private ReplicatedSpace rs = null;
    private String rspaceUri = null;

    public ReplicatedSpaceAdaptor () {
        super ();
    }
    public void initService() throws ConfigurationException {
        Space sp  = SpaceFactory.getSpace (cfg.get ("space", ""));
        rspaceUri = cfg.get ("rspace", "rspace");
        try {
            rs = new ReplicatedSpace (
                sp,
                cfg.get ("group", "rspace"),
                cfg.get ("config", "cfg.jgroups.xml"),
                getLog().getLogger(),
                getLog().getRealm(),
                cfg.getBoolean ("trace"),
                cfg.getBoolean ("replicate", false)
            );
            NameRegistrar.register (rspaceUri, rs);
        } catch (Throwable t) {
            throw new ConfigurationException (t);
        }
    }
    protected void stopService () throws Exception {
        if (rs != null)
            rs.close();
        NameRegistrar.unregister (rspaceUri);
    }
}
