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

import java.io.PrintStream;
import org.jpos.util.Loggeable;

/**
 * @author Alejandro P. Revilla
 * @version $Revision: 1.5 $ $Date: 2004/12/09 19:45:33 $
 *
 * Business Logic Exception
 */
public class BLException extends Exception implements Loggeable {
    Throwable nested = null;
    String detail;

    public BLException() {
        super();
    }
    public BLException (String s) {
        super (s);
    }
    public BLException (String s, String detail) {
        super(s);
        this.detail = detail;
    }
    public BLException (Throwable nested) {
	super(nested.toString());
	this.nested = nested;
    }
    public BLException (String s, Throwable nested) {
	super(s);
	this.nested = nested;
    }
    public BLException (String s, String detail, Throwable nested) {
	super(s);
        this.detail = detail;
	this.nested = nested;
    }
    public Throwable getNested() {
	return nested;
    }
    public String getDetail () {
        return detail;
    }
    public String getDetailedMessage () {
        StringBuffer sb = new StringBuffer ();
        sb.append(getMessage());
        if (detail != null) {
            sb.append (" (");
            sb.append (detail);
            sb.append (')');
        }
        return sb.toString();
    }
    public void dump (PrintStream p, String indent) {
	String inner = indent + "  ";
	p.println (indent + "<bl-exception>");
	p.println (inner  + "<message>" + getMessage() + "</message>");
        if (detail != null)
            p.println (inner  + "<detail>" + detail + "</detail>");
	if (nested != null) {
	    if (nested instanceof Loggeable) 
		((Loggeable)nested).dump (p, inner);
	    else {
		p.println (inner + "<nested-exception>");
		p.print   (inner);
		nested.printStackTrace (p);
		p.println (inner + "</nested-exception>");
	    }
	}
	p.print (inner);
	printStackTrace (p);
	p.println (indent + "</bl-exception>");
    }
    public String toString() {
	StringBuffer buf = new StringBuffer (super.toString());
	if (nested != null)
	    buf.append (" (" + nested.toString() +")");
	return buf.toString();
    }
}

