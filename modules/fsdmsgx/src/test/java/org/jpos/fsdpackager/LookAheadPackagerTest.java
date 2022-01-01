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

import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.ISOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LookAheadPackagerTest {

	/**
	 * Lookahead in the stream to see if a certain byte is present, if present
	 * start parsing the stream based on the set lookup value.
	 * 
	 * @throws ISOException
	 */
	@Test

	public void unpacktest01() throws ISOException {

		String s = "ABCD1234XYZ";
		FSDMsgX ifSet = new FSDMsgX("ifSet");
		AFSDFieldPackager f0_a = new FixedFieldPackager("F0", new String(new byte[] { (byte) ';' }),
				AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f1_a = new FixedFieldPackager("F1", 4, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2_a = new FixedFieldPackager("F2", 4, AsciiInterpreter.INSTANCE);

		ifSet.add("F1", f1_a);
		ifSet.add("F2", f2_a);
		ifSet.add("F0", f0_a);

		FSDMsgX ifNotSet = new FSDMsgX("ifnotSet");
		AFSDFieldPackager f1_b = new FixedFieldPackager("F1", 8, AsciiInterpreter.INSTANCE);
		ifNotSet.add("F1", f1_b);

		AFSDFieldPackager f3 = new FixedFieldPackager("F3", 3, AsciiInterpreter.INSTANCE);

		FSDMsgX main = new FSDMsgX("main");
		String[] setFields = { "F0" };
		AFSDFieldPackager look = new LookAheadPackager("LA", 8, Byte.valueOf((byte) ';'), ifSet, ifNotSet, setFields,
				null);
		main.add("LA", look);
		main.add("F3", f3);
		System.out.println(main.getParserTree(""));

		main.unpack(s.getBytes());
//		assertEquals("ABCD", main.get("F1"));
//		assertEquals("1234", main.get("F2"));
//		assertEquals(";", main.get("F0"));
//		assertEquals("XYZ", main.get("F3"));
		System.out.println(main.dump(""));
		System.out.println(main.hexDump(""));
		
		System.out.println(main.getParserTree(""));

	}

	/**
	 * Lookahead in the stream to see if a certain byte is present, since its not present, choose the ifnotset path
	 * @throws ISOException
	 */

	@Test

	public void unpacktest02() throws ISOException {

		String s = "ABCD1234XYZ";

		FSDMsgX ifSet = new FSDMsgX("ifSet");
		AFSDFieldPackager f0_a = new FixedFieldPackager("F0", new String(new byte[] { (byte) ';' }),
				AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f1_a = new FixedFieldPackager("F1", 4, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2_a = new FixedFieldPackager("F2", 4, AsciiInterpreter.INSTANCE);

		ifSet.add("F1", f1_a);
		ifSet.add("F2", f2_a);
		ifSet.add("F0", f0_a);

		FSDMsgX ifNotSet = new FSDMsgX("ifnotSet");
		AFSDFieldPackager f1_b = new FixedFieldPackager("F1", 8, AsciiInterpreter.INSTANCE);
		ifNotSet.add("F1", f1_b);

		AFSDFieldPackager f3 = new FixedFieldPackager("F3", 3, AsciiInterpreter.INSTANCE);

		FSDMsgX main = new FSDMsgX("main");
		String[] setFields = { "F0" };
		AFSDFieldPackager look = new LookAheadPackager("LA", 8, Byte.valueOf((byte) ';'), ifSet, ifNotSet, setFields,
				null);
		main.add("LA", look);
		main.add("F3", f3);
		main.unpack(s.getBytes());
		assertEquals("ABCD1234", main.get("F1"));
		assertEquals("XYZ", main.get("F3"));
		
		System.out.println(main.dump(""));
		System.out.println(main.hexDump(""));
		System.out.println(main.getParserTree(""));

	}

	
	@Test
	public void packtest02() throws ISOException {


		FSDMsgX ifSet = new FSDMsgX("ifSet");
		AFSDFieldPackager f0_a = new FixedFieldPackager("F0", new String(new byte[] { (byte) ';' }),
				AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f1_a = new FixedFieldPackager("F1", 4, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2_a = new FixedFieldPackager("F2", 4, AsciiInterpreter.INSTANCE);

		ifSet.add("F1", f1_a);
		ifSet.add("F2", f2_a);
		ifSet.add("F0", f0_a);

		FSDMsgX ifNotSet = new FSDMsgX("ifnotSet");
		AFSDFieldPackager f1_b = new FixedFieldPackager("F1", 8, AsciiInterpreter.INSTANCE);
		ifNotSet.add("F1", f1_b);

		AFSDFieldPackager f3 = new FixedFieldPackager("F3", 3, AsciiInterpreter.INSTANCE);

		FSDMsgX main = new FSDMsgX("main");
		String[] setFields = { "F0" };
		AFSDFieldPackager look = new LookAheadPackager("LA", 8, Byte.valueOf((byte) ';'), ifSet, ifNotSet, setFields,
				null);
		main.add("LA", look);
		main.add("F3", f3);
		
		main.set("F1", "ABCD1234");
		main.set("F3", "XYZ");
		byte[] outStream = main.pack();
		assertArrayEquals("ABCD1234XYZ".getBytes(), outStream);
		
		System.out.println(main.dump(""));
		System.out.println(main.hexDump(""));

	}

	@Test
	public void packtest01() throws ISOException {

		FSDMsgX ifSet = new FSDMsgX("ifSet");
		AFSDFieldPackager f0_a = new FixedFieldPackager("F0", new String(new byte[] { (byte) ';' }),
				AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f1_a = new FixedFieldPackager("F1", 4, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2_a = new FixedFieldPackager("F2", 4, AsciiInterpreter.INSTANCE);

		ifSet.add("F1", f1_a);
		ifSet.add("F2", f2_a);
		ifSet.add("F0", f0_a);

		FSDMsgX ifNotSet = new FSDMsgX("ifnotSet");
		AFSDFieldPackager f1_b = new FixedFieldPackager("F1", 8, AsciiInterpreter.INSTANCE);
		ifNotSet.add("F1", f1_b);

		AFSDFieldPackager f3 = new FixedFieldPackager("F3", 3, AsciiInterpreter.INSTANCE);

		FSDMsgX main = new FSDMsgX("main");
		String[] setFields = { "F0" };
		AFSDFieldPackager look = new LookAheadPackager("LA", 8, Byte.valueOf((byte) ';'), ifSet, ifNotSet, setFields,
				null);
		main.add("LA", look);
		main.add("F3", f3);
		
		main.set("F1", "ABCD");
		main.set("F2", "1234");
		main.set("F3", "XYZ");
		main.set("F0", ";");
		byte[] outStream = main.pack();
		assertArrayEquals("ABCD1234;XYZ".getBytes(), outStream);
		
		System.out.println(main.dump(""));
		System.out.println(main.hexDump(""));

	}

}
