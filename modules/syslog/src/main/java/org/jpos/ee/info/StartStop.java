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

package org.jpos.ee.info;

import org.jpos.ee.SysLog;
import org.jpos.ee.SysLogManager;
import org.jpos.q2.QBeanSupport;
import org.jpos.util.DateUtil;

@SuppressWarnings("unused")
public class StartStop extends QBeanSupport {
    long start;
    public void startService() {
        start = System.currentTimeMillis();
        new SysLogManager().log (cfg.get ("source", getName()),
            "SYSTEM", SysLog.INFO, "Start");
    }
    public void stopService() {
        long elapsed = System.currentTimeMillis() - start;
        new SysLogManager().log (cfg.get ("source", getName()),
            "SYSTEM", SysLog.INFO, "Stop (uptime " + DateUtil.toDays(elapsed) + ")"
        );
    }
}
