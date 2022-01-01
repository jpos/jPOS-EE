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

package org.jpos.iso;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.PrintStream;
import org.jpos.fsdpackager.FSDMsgX;

public class FSDISOMsgX extends ISOMsg   {
    FSDMsgX fsd;
    public  FSDISOMsgX () {
        super();
    }
    public FSDISOMsgX (FSDMsgX fsd) {
        super();
        this.fsd = fsd;
    }
    public String getMTI() {
        return getString(0);
    }
    public byte[] pack() throws ISOException {
        try {
            return fsd.pack();
        } catch (Exception e) {
            throw new ISOException (e);
        }
    }
    public int unpack(byte[] b) throws ISOException {
        try {
            return fsd.unpack (b);
           
        } catch (Exception e) {
            throw new ISOException (e);
        }
    }
    public void unpack (InputStream in) throws IOException, ISOException {
    	throw new UnsupportedOperationException();
    }

    public FSDMsgX getFSDMsg() {
        return fsd;
    }
    public String getString (int fldno) {
        return fsd.get (Integer.toString(fldno));
    }
    public String getString (String fld) {
        return fsd.get (fld);
    }
    public boolean hasField (int fldno) {
        return getString(fldno) != null;
    }
    public boolean hasField (String fld) {
        return getString(fld) != null;
    }
    public void dump (PrintStream p, String indent) {
        if (fsd != null)
        	p.println( fsd.dump (indent));
    }
    public void writeExternal (ObjectOutput out) throws IOException {
    	throw new UnsupportedOperationException();
    }
    public void readExternal  (ObjectInput in) 
        throws IOException, ClassNotFoundException
    {
    	throw new UnsupportedOperationException();
    	
    }
    public void setResponseMTI() {
        try {
            super.setResponseMTI();
        } catch (ISOException ignored) { }               
    }
    public void set (String name, String value)  {
        if (value != null)
            this.fsd.set (name, value);
    }   
    private static final long serialVersionUID = 1L;
}

