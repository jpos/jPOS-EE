/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

public class AFSDFieldPackager implements IFSDFieldPackager {

	private String name;
	
	@Override
	public byte[] pack(Map<String, String> setfields) throws ISOException {
		return null;
	}

	@Override
	public String getValue() {
		return null;
	}

	@Override
	public void setValue(String value) {

	}

	@Override
	public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String fieldName) {
		this.name = fieldName;
	}

	@Override
	public String dump(String prefix, Map<String, String> setfields) {
		
		return "";
		
	}

	@Override
	public byte[] hexDump(String prefix,Map<String, String> setfields) {
		return null;
	}

	@Override
	public String getParserTree(String prefix) {
		return null;
	}


}
