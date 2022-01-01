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

import org.jpos.fsdpackager.compliance.APCICompliance;
import org.jpos.fsdpackager.compliance.NoCompliance;
import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.ISOException;
import org.jpos.iso.Interpreter;

public class VariableFieldPackager extends AFSDFieldPackager {

	String value;
	Byte delimiter;
	Interpreter interpreter = AsciiInterpreter.INSTANCE;
	private int maxSize = Integer.MAX_VALUE;
	int size;
	boolean mandatory = false;
	private APCICompliance compliance = new NoCompliance();

	@Override
	public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {

		boolean delimiterFound = false;
		int i = offset;
		int lengthTotraverse;
		if (maxSize <= inStream.length - offset) // length-offset = remaining
													// bytes
			lengthTotraverse = maxSize + offset + 1;// to include th delimiter
		else
			lengthTotraverse = inStream.length;
		while (i < lengthTotraverse) { // there is no point traversing to the
										// end, if we can we should traverse to
										// the maxsize
			if (inStream[i] == delimiter.byteValue()) {
				delimiterFound = true;
				break;
			}

			i++;
		}
		if (delimiterFound || i == inStream.length) {

			byte[] dest = new byte[i - offset];
			if ((i - offset) == 0) {
				// Means there is no data and its terminated by delimiter
				value = "";
			} else if ((i - offset) <= maxSize) {
				System.arraycopy(inStream, offset, dest, 0, i - offset);
				value = interpreter.uninterpret(dest, 0, i - offset);

			} else
				throw new ISOException(
						String.format("Field size [%d] is greater than max size [%d] of field ", i - offset, maxSize));

		} else {
			throw new ISOException(String.format("Field [%s]: Delimiter %x not present after max size %d", getName(),
					delimiter.byteValue(), maxSize));
		}
		setValue(value);
		return i + 1;
	}

	@Override
	public byte[] pack(Map<String, String> fields) throws ISOException {

		if (value == null || value.equals("")) {
			// if field is not set, make sure to send the delimiter to indicate
			// its presence.
			return new byte[] { delimiter.byteValue() };
		}
		if (value.length() <= maxSize) {
			byte[] b = new byte[interpreter.getPackedLength(value.length() + 1)];
			interpreter.interpret(value, b, 0);
			b[b.length - 1] = delimiter.byteValue();

			return b;
		}
		throw new ISOException(String.format("Size [%d] is greater than maxSize[%d] ", value.length(), maxSize));
	}

	public VariableFieldPackager(String name, int maxSize, Byte delimiter, Interpreter interpretter) {

		this.maxSize = maxSize;
		this.interpreter = interpretter;
		this.delimiter = delimiter;
		this.setName(name);
	}

	public VariableFieldPackager(String name, int maxSize, Byte delimiter, Interpreter interpretter,
			APCICompliance compliance) {
		this(name, maxSize, delimiter, interpretter);
		this.compliance = compliance;
	}

	public VariableFieldPackager(String name, Byte delimiter, Interpreter interpretter) {

		this.interpreter = interpretter;
		this.delimiter = delimiter;
		this.setName(name);
	}

	public VariableFieldPackager(String name, Byte delimiter, Interpreter interpretter, APCICompliance compliance) {

		this.interpreter = interpretter;
		this.delimiter = delimiter;
		this.setName(name);
		this.compliance = compliance;
	}

	public VariableFieldPackager(String name, int maxSize, Byte delimiter, Interpreter interpretter,
			boolean mandatory) {

		this(name, maxSize, delimiter, interpretter);
		this.mandatory = mandatory;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public void setValue(String value) {
		this.value = value;
		// TODO Auto-generated method stub

	}

	@Override
	public String dump(String prefix, Map<String, String> setfields) {
		if (getValue()!=null)
		return String.format("%s<field id=\"%s\" value=\"%s\"/>%n", prefix, getName(),
				compliance.makeCompliant(getValue()));
		return "";
	}

	@Override
	public byte[] hexDump(String prefix, Map<String, String> setfields) {

		int numberOfPackedBytes = interpreter.getPackedLength(getValue().length());
		String compliant = compliance.makeCompliant(getValue());
		byte[] temp = new byte[numberOfPackedBytes+1];// +1 for the delimiter
		try {
			interpreter.interpret(compliant, temp, 0);
			temp[temp.length-1]= delimiter.byteValue();
		} catch (ISOException e) {
			return null;
		}
		return temp;

	}

	@Override
	public String getParserTree(String prefix) {

		return String.format("%sField [%s] : VAR[0..%d] delimiter[0x%X] or EOM  %s%n", prefix, getName(),maxSize, delimiter.byteValue(), getValue()==null?"":": "+getValue());

	}

}
