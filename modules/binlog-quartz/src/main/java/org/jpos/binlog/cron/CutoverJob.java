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

package org.jpos.binlog.cron;

import org.jpos.binlog.BinLogWriter;
import org.jpos.q2.QuartzJobSupport;

@SuppressWarnings("unused")
public class CutoverJob extends QuartzJobSupport {
    public void run() {
        try (BinLogWriter bl = new BinLogWriter (getConfiguration().get("binlog"))) {
            bl.cutover();
        } catch (Throwable t) {
            getLog().error (t);
        }
    }
}
