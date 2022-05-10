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

/**
 * @author Murtuza
 *
 */
public class BranchFieldPackager extends AFSDFieldPackager {

	private String switchField;
	private Map<String, AFSDFieldPackager> switchCases;
	private AFSDFieldPackager defaultCase;

	/**
	 * @param name
	 *            Name of this field.
	 * @param switchField
	 *            Name of the field whose parsed value value will be used to
	 *            determine packager to follow.
	 * @param switchCases
	 *            A map containing values to packager mapping.
	 * @param defaultCase
	 *            If the map cannot find the value in the map, uses this default
	 *            packager to handle it.
	 */
	public BranchFieldPackager(String name, String switchField, Map<String, AFSDFieldPackager> switchCases,
			AFSDFieldPackager defaultCase) {

		this.setName(name);
		this.switchField = switchField;
		this.switchCases = switchCases;
		this.defaultCase = defaultCase;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpos.fsdpackager.AFSDFieldPackager#unpack(byte[], int,
	 * java.util.Map)
	 */
	@Override
	public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {

		String fieldValue = fields.get(switchField);
		if (fieldValue == null) {
			if (defaultCase != null) {

				offset = defaultCase.unpack(inStream, offset, fields);
				fields.put(defaultCase.getName(), defaultCase.getValue());
			}
		} else {
			AFSDFieldPackager temp = switchCases.get(fieldValue);
			if (temp == null) {
				if (defaultCase != null) {
					offset = defaultCase.unpack(inStream, offset, fields);
					fields.put(defaultCase.getName(), defaultCase.getValue());
				}
			} else {
				offset = temp.unpack(inStream, offset, fields);
				fields.put(temp.getName(), temp.getValue());
			}
		}

		return offset;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jpos.fsdpackager.AFSDFieldPackager#pack(java.util.Map)
	 */
	@Override
	public byte[] pack(Map<String, String> fields) throws ISOException {

		String value = fields.get(switchField);

		if (value == null) {
			if (defaultCase != null) {
				defaultCase.setValue(fields.get(defaultCase.getName()));
				return defaultCase.pack(fields);
			}
			return null;
		}
		AFSDFieldPackager selectedPackager = switchCases.get(value);
		if (selectedPackager == null) {

			if (defaultCase != null) {
				defaultCase.setValue(fields.get(defaultCase.getName()));
				return defaultCase.pack(fields);
			}
			return null;

		}
		selectedPackager.setValue(fields.get(selectedPackager.getName()));
		return selectedPackager.pack(fields);

	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void setValue(String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public String dump(String prefix, Map<String, String> setfields) {

		String fieldValue = setfields.get(switchField);
		if (fieldValue == null) {
			if (defaultCase != null) {

				return defaultCase.dump(prefix, setfields);
			}
		} else {
			AFSDFieldPackager temp = switchCases.get(fieldValue);
			if (temp == null) {
				if (defaultCase != null) {
					return defaultCase.dump(prefix, setfields);
				}
			} else {

				return temp.dump(prefix, setfields);
			}
		}
		return "";

	}

	/**
	 * Provides a description of this parser rule.
	 * e.g. output
	 * <pre>
	 * Field [F1] : Fixed [5] : ABCDE
	 * Field [F2] : Fixed [2] : 02
	 * Field [F3] : [Branch]
	 * switch (F2)
	 * 	01:
	 * 		Field [F4] : Fixed [3] 
	 * 	02:
	 * 		Field [F5] : Fixed [4] : 4444
	 * 	default:
	 * </pre>
	 */
	@Override
	public String getParserTree(String prefix) {

		String cases = "";
		if (switchCases == null) {

			cases += "[Not Set]" + System.lineSeparator();
		} else {
			for (Map.Entry<String, AFSDFieldPackager> entry : switchCases.entrySet()) {

				AFSDFieldPackager fPkgr = entry.getValue();

				cases += "\t\t" + entry.getKey() + ":" + System.lineSeparator() + fPkgr.getParserTree("\t\t\t");

			}
		}
		cases += "\t\tdefault:" + System.lineSeparator() + ((defaultCase != null)
				? System.lineSeparator() + defaultCase.getParserTree("\t\t\t") : "\t\t\t[Not Set]");

		return String.format("%sField [%s] : [Branch]%n" + "\tswitch (%s)%n" + "%s", prefix, getName(), switchField,
				cases);
	}

}
