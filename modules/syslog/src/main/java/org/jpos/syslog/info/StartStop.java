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

package org.jpos.ee.info;

import org.jpos.ee.SysLog;
import org.jpos.ee.SysLogManager;
import org.jpos.q2.QBeanAsyncSupport;
import org.jpos.util.DateUtil;

@SuppressWarnings("unused")
public class StartStop extends QBeanAsyncSupport {
    long start;

    @Override
    protected void doStart() {
        start = System.currentTimeMillis();
        if (getServer().ready(60000L)) {
            new SysLogManager().log (cfg.get ("source", getName()),
                "SYSTEM", SysLog.INFO, "Start");
        } else {
            getLog().warn ("Q2 not ready");
        }
    }

    @Override
    protected void doStop() {
        long elapsed = System.currentTimeMillis() - start;
        new SysLogManager().log (cfg.get ("source", getName()),
            "SYSTEM", SysLog.INFO, "Stop (uptime " + DateUtil.toDays(elapsed) + ")"
        );
    }
}
