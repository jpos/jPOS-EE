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

public class LookAheadPackager extends AFSDFieldPackager {

	private int lookAheadOffset;
	private Byte lookUpData;
	private AFSDFieldPackager useIfSet;
	private AFSDFieldPackager useIfNotSet;
	private boolean addLooklookUpValuePresent;
	private String[] fieldNamesSet;

	/**
	 * @param name
	 *            the name of the field
	 * @param lookAheadOffset
	 *            A positive or negative number to look up a byte.
	 * @param lookUpData
	 *            Value to lookup at the lookAheadOffset
	 * @param useIfSet
	 *            If lookUpData was found, the stream to follow
	 * @param useIfNotSet
	 *            If lookUpData was not found, the stream to follow
	 * @param fieldNamesSet
	 *            Used to determine if the lookUpData should be set at packing
	 *            time based on fields that are set.
	 * @param fieldNamesnotSet
	 *            Used to determine if the lookUpData should be set at packing
	 *            time based on fields that are not set.
	 */
	public LookAheadPackager(String name, int lookAheadOffset, Byte lookUpData, AFSDFieldPackager useIfSet,
			AFSDFieldPackager useIfNotSet, String[] fieldNamesSet, String[] fieldNamesnotSet) {

		this.setName(name);
		this.lookAheadOffset = lookAheadOffset;
		this.lookUpData = lookUpData;
		this.useIfSet = useIfSet;
		this.useIfNotSet = useIfNotSet;
		this.fieldNamesSet = fieldNamesSet;
	}

	@Override
	public byte[] pack(Map<String, String> setfields) throws ISOException {

		addLooklookUpValuePresent = true;
		for (String fieldName : fieldNamesSet) {
			if (setfields.get(fieldName) != null) {
				continue;
			}
			addLooklookUpValuePresent = false;
			break;
		}

		if (addLooklookUpValuePresent) {
			if (useIfSet != null)
				return useIfSet.pack(setfields);
		} else {
			if (useIfNotSet != null) {
				return useIfNotSet.pack(setfields);
			}
		}

		return null;
		// TODO Auto-generated method stub
		//return super.pack(setfields);
	}

	@Override
	public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {

		if ((offset + lookAheadOffset) < inStream.length) {

			if (inStream[offset + lookAheadOffset] == lookUpData.byteValue()) {
				if (useIfSet != null) {
					offset = useIfSet.unpack(inStream, offset, fields);
					fields.put(useIfSet.getName(), useIfSet.getValue());
				}
			} else {
				if (useIfNotSet != null) {
					offset = useIfNotSet.unpack(inStream, offset, fields);
					fields.put(useIfNotSet.getName(), useIfNotSet.getValue());

				}
			}
		}
		return offset;

	}

	@Override
	public String dump(String prefix, Map<String, String> setfields) {
		addLooklookUpValuePresent = true;
		for (String fieldName : fieldNamesSet) {
			if (setfields.get(fieldName) != null) {
				continue;
			}
			addLooklookUpValuePresent = false;
			break;
		}

		if (addLooklookUpValuePresent) {
			if (useIfSet != null)
				return useIfSet.dump(prefix, setfields);
		} else {
			if (useIfNotSet != null) {
				return useIfNotSet.dump(prefix, setfields);
			}
		}
		return "";

	}

	@Override
	public byte[] hexDump(String prefix, Map<String, String> setfields) {

		addLooklookUpValuePresent = true;
		for (String fieldName : fieldNamesSet) {
			if (setfields.get(fieldName) != null) {
				continue;
			}
			addLooklookUpValuePresent = false;
			break;
		}

		if (addLooklookUpValuePresent) {
			if (useIfSet != null)
				return useIfSet.hexDump(prefix, setfields);
		} else {
			if (useIfNotSet != null) {
				return useIfNotSet.hexDump(prefix, setfields);
			}
		}
		return null;

	}

	@Override
	public String getParserTree(String prefix) {
		
		String setFieldsNames="";
		for (String name:fieldNamesSet){
			
			setFieldsNames+=(name+",");
			
		}
		String ifset = useIfSet!=null?useIfSet.getParserTree("\t\t\t\t\t"):"\t\t\t\t\t[Not Set]"+System.lineSeparator();
		String ifnotset=useIfNotSet!=null?useIfNotSet.getParserTree("\t\t\t\t\t"):"\t\t\t\t\t[Not Set]"+System.lineSeparator();
		String s = String.format("%sField [%s] : [LookAhead]%n"
				+ "\t\t\toffset[%d] find[0x%X]%n"
				+ "\t\t\t\t[if found]%n"
				+ "%s"
				+ "\t\t\t\t[if not found]%n"
				+ "%s"
				+ "\t\t\tCheck Field[%s]%n", prefix,getName(),lookAheadOffset,lookUpData.byteValue(),ifset,ifnotset,setFieldsNames);
		// TODO Auto-generated method stub
		return s;
	}
	
	

}
