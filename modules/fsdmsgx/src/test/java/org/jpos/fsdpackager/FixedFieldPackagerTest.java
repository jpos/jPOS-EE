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

import org.jpos.fsdpackager.compliance.TrackDataCompliance;
import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.BCDInterpreter;
import org.jpos.iso.EbcdicInterpreter;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOUtil;
import org.junit.jupiter.api.Test;

public class FixedFieldPackagerTest {

	@Test
	public void unpackTest01() throws ISOException {
		int size = 5;
		FixedFieldPackager p = new FixedFieldPackager("F1", size, AsciiInterpreter.INSTANCE);
		FSDMsgX msg = new FSDMsgX("Test");
		;
		msg.add("F1", p);

		String s = "12ABCDEFH";
		int offset = msg.unpack(s.getBytes());
		assertEquals(size, offset);
		assertEquals("12ABC", msg.get("F1"));
		System.out.println(msg.get("F1"));
		System.out.println(msg.dump(""));

	}

	@Test
	public void unpackTest02() throws ISOException {

		// byte[] f = ISOUtil.str2bcd("12345", false);
		// String s = ISOUtil.bcd2str(f, 0, 5, false);
		int size = 5;
		FixedFieldPackager p = new FixedFieldPackager("F1", size, BCDInterpreter.RIGHT_PADDED);
		FSDMsgX msg = new FSDMsgX("Test");
		;
		msg.add("F1", p);

		byte[] b = { 0x12, 0x34, 0x56, 0x78 };
		int offset = msg.unpack(b);
		assertEquals(BCDInterpreter.RIGHT_PADDED.getPackedLength(5), offset);
		assertEquals("12345", msg.get("F1"));

	}

	@Test
	public void unpackTest03() throws ISOException {
		Throwable exception = assertThrows(ISOException.class, () -> {

			int size = 5;
			FixedFieldPackager p = new FixedFieldPackager("F1", size, AsciiInterpreter.INSTANCE);
			String s = "12AB";
			FSDMsgX msg = new FSDMsgX("Test");
			;
			msg.add("F1", p);

			int offset = msg.unpack(s.getBytes());
			assertEquals(size + 1, offset);
			assertEquals("12ABC", msg.get("F1"));
		});
		assertEquals("Field [F1] at offset [0]:Expecting 5 bytes found 4", exception.getMessage());

	}

	@Test
	public void unpackTest04() throws ISOException {

		FixedFieldPackager p = new FixedFieldPackager("F1", "12345", AsciiInterpreter.INSTANCE);
		String s = "12345";
		FSDMsgX msg = new FSDMsgX("Test");
		;
		msg.add("F1", p);

		int offset = msg.unpack(s.getBytes());
		assertEquals(5, offset);
		assertEquals("12345", msg.get("F1"));

	}

	@Test
	public void unpackTest05() throws ISOException {

		Throwable exception = assertThrows(ISOException.class, () -> {
			FixedFieldPackager p = new FixedFieldPackager("F1", "12345", AsciiInterpreter.INSTANCE);
			String s = "12346";
			FSDMsgX msg = new FSDMsgX("Test");
			;
			msg.add("F1", p);

			int offset = msg.unpack(s.getBytes());
			assertEquals(5 + 1, offset);
			assertEquals("12345", msg.get("F1"));
		});
		assertEquals("Field [F1] at offset [0]:Expected 12345 but found 12346", exception.getMessage());

	}

	@Test
	public void unpackTest06() throws ISOException {

		Throwable exception = assertThrows(ISOException.class, () -> {

			FixedFieldPackager p = new FixedFieldPackager("F1", "12345", AsciiInterpreter.INSTANCE);
			String s = "ABC";
			FSDMsgX msg = new FSDMsgX("Test");
			;
			msg.add("F1", p);

			int offset = msg.unpack(s.getBytes());
			assertEquals(5 + 1, offset);
			assertEquals("12345", msg.get("F1"));
		});
		assertEquals("Field [F1] at offset [0]:Expecting 5 bytes found 3", exception.getMessage());

	}

	@Test
	public void packTest01() throws ISOException {
		Throwable exception = assertThrows(ISOException.class, () -> {

			FixedFieldPackager p = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
			String s = "ABC1234";
			FSDMsgX msg = new FSDMsgX("Test");
			;
			msg.add("F1", p);
			msg.set("F1", s);
			byte[] b = msg.pack();
			assertEquals(null, b);
		});
		assertEquals("Field [F1]:Cannot pack as data has size 7 and size needs to be 5", exception.getMessage());

	}

	@Test
	public void packTest02() throws ISOException {

		FixedFieldPackager p = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		String s = "ABC12";
		FSDMsgX msg = new FSDMsgX("Test");
		;
		msg.add("F1", p);
		msg.set("F1", s);
		byte[] stream = msg.pack();
		assertArrayEquals("ABC12".getBytes(), stream);

	}

	@Test
	public void packTest03() throws ISOException {

		int size = 5;
		FixedFieldPackager p = new FixedFieldPackager("F1", size, BCDInterpreter.RIGHT_PADDED);

		FSDMsgX msg = new FSDMsgX("Test");
		;
		msg.add("F1", p);
		msg.set("F1", "12345");

		byte[] b = { 0x12, 0x34, 0x50 };
		byte[] stream = msg.pack();
		assertArrayEquals(b, stream);

	}

	@Test
	public void packTest09() throws ISOException {

		int size = 16;
		FixedFieldPackager p = new FixedFieldPackager("F1", size, AsciiInterpreter.INSTANCE, new TrackDataCompliance());
		FSDMsgX msg = new FSDMsgX("Test");
		;
		msg.add("F1", p);

		String s = "1234567890123456";

		msg.set("F1", s);

		byte[] b = msg.pack();
		System.out.println(ISOUtil.hexdump(b));
		System.out.println(msg.dump(""));
		System.out.println(msg.hexDump(""));
		System.out.println(msg.dump(""));

	}

	@Test
	public void packTest10() throws ISOException {

		int size = 16;
		FixedFieldPackager p = new FixedFieldPackager("F1", size, EbcdicInterpreter.INSTANCE,
				new TrackDataCompliance());
		FSDMsgX msg = new FSDMsgX("Test");
		;
		msg.add("F1", p);

		String s = "1234567890123456";

		msg.set("F1", s);

		byte[] b = msg.pack();
		System.out.println(ISOUtil.hexdump(b));
		System.out.println(msg.dump(""));
		System.out.println(msg.hexDump(""));
		System.out.println(msg.dump(""));

	}

}
