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

import static org.junit.jupiter.api.Assertions.*;

import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOUtil;
import org.junit.jupiter.api.Test;

public class VariableFieldPackagerTest {

	/**
	 * Happy day scenario where a variable field within the max size with a
	 * field separator is received. The field should be available for use
	 * without the delimiter.
	 * 
	 * @throws ISOException
	 */
	@Test
	public void unpackTest01() throws ISOException {

		VariableFieldPackager p = new VariableFieldPackager("F1", 20, new Byte((byte) 0x1c), AsciiInterpreter.INSTANCE);
		FSDMsgX msg = new FSDMsgX("Test");;
		msg.add("F1", p);
		String inStream = "123456" + (char) 0x1c;
		msg.unpack(inStream.getBytes());

		assertEquals("123456", msg.get("F1"));

	}

	/**
	 * Happy day scenario where a variable field is set without using a
	 * delimiter. The resulting byte array will have the data and the delimiter
	 * in it.
	 * 
	 * @throws ISOException
	 */
	@Test
	public void packTest01() throws ISOException {

		VariableFieldPackager f1 = new VariableFieldPackager("F1", 20, new Byte((byte) 0x1c),
				AsciiInterpreter.INSTANCE);
		FSDMsgX msg = new FSDMsgX("Test");;
		msg.add("F1", f1);
		msg.set("F1", "123456");

		byte[] outStream = msg.pack();

		assertArrayEquals(("123456" + (char) 0x1c).getBytes(), outStream);

	}

	/**
	 * Happy day scenario where a 2 variable field within the max size with
	 * their respective delimiters is received. The field should be available
	 * for use without the delimiter.
	 * 
	 * @throws ISOException
	 */
	@Test
	public void unpackTest02() throws ISOException {

		VariableFieldPackager f1 = new VariableFieldPackager("F1", 20, new Byte((byte) 0x1c),
				AsciiInterpreter.INSTANCE);
		VariableFieldPackager f2 = new VariableFieldPackager("F2", 5, new Byte((byte) 0x1d), AsciiInterpreter.INSTANCE);

		FSDMsgX msg = new FSDMsgX("Test");;
		msg.add("F1", f1);
		msg.add("F2", f2);

		String inStream = "123456" + (char) 0x1c + "ABC" + (char) 0x1d;
		msg.unpack(inStream.getBytes());

		assertEquals("123456", msg.get("F1"));
		assertEquals("ABC", msg.get("F2"));

	}

	/**
	 * Happy day scenario where a multiple variable fields are set without using
	 * a delimiter. The resulting byte array will have the data of the fields
	 * with their respective delimiters in it.
	 * 
	 * @throws ISOException
	 */

	@Test
	public void packTest02() throws ISOException {

		VariableFieldPackager f1 = new VariableFieldPackager("F1", 20, new Byte((byte) 0x1c),
				AsciiInterpreter.INSTANCE);
		VariableFieldPackager f2 = new VariableFieldPackager("F2", 5, new Byte((byte) 0x1d), AsciiInterpreter.INSTANCE);

		FSDMsgX msg = new FSDMsgX("Test");;
		msg.add("F1", f1);
		msg.add("F2", f2);

		msg.set("F1", "123456");
		msg.set("F2", "ABC");

		byte[] outStream = msg.pack();

		assertArrayEquals(("123456" + (char) 0x1c + "ABC" + (char) 0x1d).getBytes(), outStream);

	}

	/**
	 * The order of the packed fields is dependent on the FSDMsg2's add. Setting
	 * of fields can be in any order.
	 * 
	 * @throws ISOException
	 */
	@Test
	public void packTest03() throws ISOException {

		VariableFieldPackager f1 = new VariableFieldPackager("F1", 20, new Byte((byte) 0x1c),
				AsciiInterpreter.INSTANCE);
		VariableFieldPackager f2 = new VariableFieldPackager("F2", 5, new Byte((byte) 0x1d), AsciiInterpreter.INSTANCE);

		FSDMsgX msg = new FSDMsgX("Test");;
		msg.add("F1", f1);
		msg.add("F2", f2);

		msg.set("F2", "ABC");
		msg.set("F1", "123456");

		byte[] outStream = msg.pack();

		assertArrayEquals(("123456" + (char) 0x1c + "ABC" + (char) 0x1d).getBytes(), outStream);

	}

	/**
	 * Field size can be upto 20 followed by delimiter. The data available is 25
	 * wide and no delimiter. An exception should be thrown indicating a
	 * delimiter wasnt found after the max of 20 allowed.
	 * 
	 * @throws ISOException
	 */
	@Test
	public void unpackTest03() throws ISOException {

		Throwable exception = assertThrows(ISOException.class, () -> {

			VariableFieldPackager p = new VariableFieldPackager("F1", 20, new Byte((byte) 0x1c), AsciiInterpreter.INSTANCE);
			FSDMsgX msg = new FSDMsgX("Test");;
			msg.add("F1", p);

			String inStream = ISOUtil.padleft("", 25, '1') + (char) 0x1c;
			msg.unpack(inStream.getBytes());
		});
		assertEquals("Field [F1]: Delimiter 1c not present after max size 20", exception.getMessage());

	}

	/**
	 * If a variable stream comes in with data that reaches end of stream and
	 * does not contain a delimitter its valid. There is no point to have a
	 * delimiter at the end of a field if its the last field.
	 * 
	 * @throws ISOException
	 */
	@Test
	public void unpackTest04() throws ISOException {

		VariableFieldPackager p = new VariableFieldPackager("F1", 20, new Byte((byte) 0x1c), AsciiInterpreter.INSTANCE);
		FSDMsgX msg = new FSDMsgX("Test");;
		msg.add("F1", p);

		String inStream = ISOUtil.padleft("", 10, '1');
		msg.unpack(inStream.getBytes());

		assertEquals(inStream, msg.get("F1"));

	}

	/**
	 * variable fields indicate their presence with the delimiter. If there is
	 * no data a delimiter needs to be sent indicating the presence of the field
	 * with no data. The field will be set with an empty string.
	 * 
	 * @throws ISOException
	 */
	@Test
	public void unpackTest05() throws ISOException {

		VariableFieldPackager p = new VariableFieldPackager("F1", 20, new Byte((byte) 0x1c), AsciiInterpreter.INSTANCE);
		FSDMsgX msg = new FSDMsgX("Test");;
		msg.add("F1", p);

		String inStream = new String(new byte[] { 0x1c });
		msg.unpack(inStream.getBytes());

		assertEquals("", msg.get("F1"));

	}

	/**
	 * At time of packing if the field is not set, make sure that the delimiter
	 * is still available.
	 * 
	 * @throws ISOException
	 */
	@Test
	public void packTest04() throws ISOException {

		VariableFieldPackager p = new VariableFieldPackager("F1", 20, new Byte((byte) 0x1c), AsciiInterpreter.INSTANCE);
		FSDMsgX msg = new FSDMsgX("Test");;
		msg.add("F1", p);

		byte[] outStream = msg.pack();

		assertArrayEquals(new byte[] { 0x1c }, outStream);

	}

}
