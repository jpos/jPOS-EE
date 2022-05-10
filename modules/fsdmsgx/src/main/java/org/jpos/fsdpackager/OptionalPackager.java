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

package org.jpos.fsdpackager;

import java.util.Map;

import org.jpos.iso.ISOException;

public class OptionalPackager extends AFSDFieldPackager {
	
	private AFSDFieldPackager fieldPackager;

	public OptionalPackager(String name,AFSDFieldPackager fieldPackager){
		
		this.fieldPackager = fieldPackager;
		setName(name);
		
	}

	@Override
	public byte[] pack(Map<String, String> setfields) throws ISOException {
		
		try {
			return fieldPackager.pack(setfields);
			
		} catch (Exception e) {
			;// If optional was absent, pack would have thrown an exception as field was not set
		}
		return null;
	}

	@Override
	public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {
		try{
		 return fieldPackager.unpack(inStream, offset, fields);
		}
		catch (Exception ex){
			;//Do nothing, means optional field not present
		}
		return offset; // return original offset passed in
	}

	@Override
	public String getParserTree(String prefix) {
		// TODO Auto-generated method stub
		return String.format("%sField [%s] : [OPTIONAL]%n",prefix,getName()) +fieldPackager.getParserTree(prefix+"\t");
		
	}

	@Override
	public String dump(String prefix, Map<String, String> setfields) {
		
		try {
			return fieldPackager.dump(prefix, setfields);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "";
	}
	
	
	
	
	

}
