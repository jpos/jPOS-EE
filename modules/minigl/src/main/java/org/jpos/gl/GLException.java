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

package org.jpos.gl;

import java.io.PrintStream;

/**
 * Base class for MiniGL especific exceptions
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 */
public class GLException extends Exception {
    /**
     * Constructs a new GLException 
     */
    public GLException() {
        super();
    }
    /**
     * Constructs a new exception with the specified detail message.
     * @param s the detail message.
     */
    public GLException(String s) {
        super(s);
    }

    /**
     * Constructs a new exception with the specified cause.
     * @param cause the cause
     */
    public GLException (Exception cause) {
	super(cause);
    }
    /**
     * Constructs a new exception with the specified detail and cause.
     * @param s the detail message.
     * @param cause the cause
     */
    public GLException (String s, Exception cause) {
	super(s, cause);
    }
    /**
     * Dump this exception.
     * @param p a print stream.
     * @param indent how much space to indent
     */
    public void dump (PrintStream p, String indent) {
	String inner = indent + "  ";
	p.println (indent + "<gl-exception>");
	p.println (inner  + getMessage());
        Throwable cause = getCause();
	if (cause != null) {
	    if (cause instanceof GLException) 
		((GLException)cause).dump (p, inner);
	    else {
		p.println (inner + "<cause>");
		p.print   (inner);
		cause.printStackTrace (p);
		p.println (inner + "</cause>");
	    }
	}
	p.print (inner);
	printStackTrace (p);
	p.println (indent + "</gl-exception>");
    }
    /**
     * @return exceptions' detail and optional cause' detail.
     */
    public String toString() {
	StringBuffer buf = new StringBuffer (super.toString());
        Throwable cause = getCause();
	if (cause != null)
	    buf.append (" [" + cause.toString() +"]");
	return buf.toString();
    }
}

