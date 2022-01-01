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

package org.jpos.ee;
import org.jpos.util.Loggeable;
import java.io.PrintStream;

public class LoggeableSysLog implements Loggeable {
    SysLog evt;
    public LoggeableSysLog (SysLog evt) {
        this.evt = evt;
    }
    public void dump (PrintStream p, String indent) {
        String newIndent = indent + "   ";
        p.println (indent + "<syslog>");
        if (evt.isDeleted())
            p.println (newIndent + "<deleted />" );
        p.println (newIndent + "<date>"     + evt.getDate()     + "</date>");
        p.println (newIndent + "<source>"   + evt.getSource()+ "</source>");
        p.println (newIndent + "<type>"     + evt.getType() + "</type>");
        p.println (newIndent 
            + "<severity>" + evt.getSeverityAsString () + "</severity>"
        );
        if (evt.getSummary() != null)
            p.println (newIndent + "<summary>"+ evt.getSummary()+"</summary>");
        if (evt.getDetail() != null)
            p.println (newIndent + "<detail>" + evt.getDetail() + "</detail>");
        if (evt.getTrace() != null)
            p.println (newIndent + "<trace>"  + evt.getTrace() + "</trace>");
        p.println (indent + "</syslog>");
    }
}

