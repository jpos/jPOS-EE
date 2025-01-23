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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map;

import org.jpos.fsdpackager.compliance.NoCompliance;
import org.jpos.fsdpackager.compliance.TrackDataCompliance;
import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.BCDInterpreter;
import org.jpos.iso.EbcdicInterpreter;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOUtil;
import org.jpos.iso.Interpreter;
import org.junit.Before;
import org.junit.Test;

public class FixedFieldPackagerTest {

	private FixedFieldPackager packager;

	@Before
	public void setUp() {

	}

	@Test
	public void testConstructorWithNameSizeAndInterpreter() {
		packager = new FixedFieldPackager("testField", 10, new AsciiInterpreter());
		assertEquals("testField", packager.getName());
	}

	@Test
	public void testConstructorWithNameSizeInterpreterAndCompliance() {
		packager = new FixedFieldPackager("testField", 10, new AsciiInterpreter(), new NoCompliance());
		assertEquals("testField", packager.getName());
	}

	@Test
	public void testConstructorWithNameValueAndInterpreter() {
		packager = new FixedFieldPackager("testField", "testValue", new AsciiInterpreter());
		assertEquals("testField", packager.getName());
		assertEquals("testValue", packager.getValue());
	}

	@Test
	public void testConstructorWithNameValueAndInterpreter2() throws ISOException {
		packager = new FixedFieldPackager("testField", "testValue", new AsciiInterpreter());
		assertEquals("testField", packager.getName());
		assertEquals("testValue", packager.getValue());
		Map<String, String> fields = new HashMap<>();
		byte[] inStream1 = "testValue".getBytes();
		packager.unpack(inStream1, 0, fields);
		assertEquals("testValue", fields.get("testField"));
		assertEquals("testValue", packager.getValue());

	}

	@Test(expected = ISOException.class)
	public void testConstructorWithNameValueAndInterpreter3() throws ISOException {
		packager = new FixedFieldPackager("testField", "testValue", new AsciiInterpreter());
		assertEquals("testField", packager.getName());
		assertEquals("testValue", packager.getValue());
		Map<String, String> fields = new HashMap<>();
		byte[] inStream1 = "TestValue".getBytes(); // does
													// not
													// match
													// constant
													// expected,
													// will
													// throw
													// exception
		packager.unpack(inStream1, 0, fields);

	}

	public void testPackWithConstant() throws ISOException {
		packager = new FixedFieldPackager("testField", "testValue", new AsciiInterpreter());
		assertEquals("testField", packager.getName());
		assertEquals("testValue", packager.getValue());
		Map<String, String> fields = new HashMap<>();

		byte[] packed = packager.pack(fields);
		assertArrayEquals("testValue".getBytes(), packed);

	}

	@Test
	public void testUnpack() throws ISOException {
		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());

		byte[] inStream = "abcde".getBytes();
		Map<String, String> fields = new HashMap<>();
		int newOffset = packager.unpack(inStream, 0, fields);

		assertEquals(5, newOffset);
		assertEquals("abcde", fields.get("testField"));
		assertEquals("abcde", packager.getValue());

		byte[] inStream1 = "abcdefghij".getBytes();
		packager = new FixedFieldPackager("testField1", 10, new AsciiInterpreter());
		fields = new HashMap<>();
		newOffset = packager.unpack(inStream1, 0, fields);
		assertEquals(10, newOffset);
		assertEquals("abcdefghij", fields.get("testField1"));
		assertEquals("abcdefghij", packager.getValue());

	}

	@Test(expected = ISOException.class)
	public void testUnpackShortInput() throws ISOException {

		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());
		byte[] inStream = "abcd".getBytes();
		Map<String, String> fields = new HashMap<>();
		packager.unpack(inStream, 0, fields);
	}

	@Test(expected = ISOException.class)
	public void testUnpackValueMismatch() throws ISOException {

		packager = new FixedFieldPackager("testField", "abcde", new AsciiInterpreter());

		byte[] inStream = "abcxy".getBytes();
		Map<String, String> fields = new HashMap<>();
		packager.unpack(inStream, 0, fields);
	}

	@Test
	public void testPackWithValueFromFields() throws ISOException {

		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());

		Map<String, String> fields = new HashMap<>();
		fields.put("testField", "abcde");
		byte[] packed = packager.pack(fields);
		assertArrayEquals("abcde".getBytes(), packed);
		assertEquals("abcde", fields.get("testField"));
	}

	@Test
	public void testPackWithValueFromConstructor() throws ISOException {

		packager = new FixedFieldPackager("testField", "abcde", new AsciiInterpreter());
		Map<String, String> fields = new HashMap<>();
		byte[] packed = packager.pack(fields);
		assertArrayEquals("abcde".getBytes(), packed);
		assertEquals("abcde", fields.get("testField"));
	}

	@Test
	public void testPackWithPadding() throws ISOException {

		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());
		packager.setPad(true);
		Map<String, String> fields = new HashMap<>();
		fields.put("testField", "abc");
		byte[] packed = packager.pack(fields);
		assertArrayEquals("  abc".getBytes(), packed);

		packager.setPad(false);
		packed = packager.pack(fields);
		assertArrayEquals("abc  ".getBytes(), packed);
		assertEquals("  abc", fields.get("testField"));
	}

	@Test(expected = ISOException.class)
	public void testPackNoValue() throws ISOException {
		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());
		Map<String, String> fields = new HashMap<>();
		packager.pack(fields);
	}

	@Test(expected = ISOException.class)
	public void testPackValueTooLong() throws ISOException {
		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());
		Map<String, String> fields = new HashMap<>();
		fields.put("testField", "abcdef");
		packager.pack(fields);
	}

	@Test
	public void testGetValueAndSetValue() {
		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());
		packager.setValue("test");
		assertEquals("test", packager.getValue());
	}

	@Test
	public void testSetPad() {
		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());
		packager.setPad(false);
		packager.setPad(true);
	}

	@Test
	public void testGetAndSetPadCharacter() {
		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());
		Byte padChar = (byte) '0';
		packager.setPadCharacter(padChar);
		assertEquals(padChar, packager.getPadCharacter());
	}

	@Test
	public void testDumpWithValue() {

		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter(), new NoCompliance());
		packager.setValue("test");
		String expectedDump = "<field id=\"testField\" value=\"test\"/>" + System.lineSeparator();
		assertEquals(expectedDump, packager.dump("", new HashMap<>()));
	}

	@Test
	public void testDumpWithoutValue() {
		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter(), new NoCompliance());
		String expectedDump = "";
		assertEquals(expectedDump, packager.dump("", new HashMap<>()));
	}

	@Test
	public void testHexDumpWithValue() throws ISOException {

		packager = new FixedFieldPackager("testField", 4, new AsciiInterpreter(), new NoCompliance());
		packager.setValue("ABCD");

		Map<String, String> fields = new HashMap<>();
		byte[] hexDump = packager.hexDump("", fields);
		assertArrayEquals(new byte[] { 0x41, 0x42, 0x43, 0x44 }, hexDump);
		assertEquals("ABCD", fields.get("testField"));

	}

	@Test
	public void testHexDumpWithoutValue() throws ISOException {

		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter(), new NoCompliance());
		Map<String, String> fields = new HashMap<>();
		byte[] hexDump = packager.hexDump("", fields);
		assertNull(hexDump);
	}

	@Test
	public void testGetParserTreeWithValue() {
		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());
		packager.setValue("test");
		String expectedTree = "Field [testField] : Fixed [5] : test" + System.lineSeparator();
		assertEquals(expectedTree, packager.getParserTree(""));
	}

	@Test
	public void testGetParserTreeWithoutValue() {
		packager = new FixedFieldPackager("testField", 5, new AsciiInterpreter());
		String expectedTree = "Field [testField] : Fixed [5] " + System.lineSeparator();
		assertEquals(expectedTree, packager.getParserTree(""));
	}

	@Test
	public void testAsciiInterpreter() throws ISOException {
		Interpreter interpreter = new AsciiInterpreter();
		byte[] out = new byte[5];
		interpreter.interpret("abcde", out, 0);
		assertArrayEquals("abcde".getBytes(), out);
		assertEquals("abcde", interpreter.uninterpret("abcde".getBytes(), 0, 5));
		assertEquals(5, interpreter.getPackedLength(5));
	}

	@Test
	public void unpackTest01() throws ISOException {
		int size = 5;
		FixedFieldPackager p = new FixedFieldPackager("F1", size, AsciiInterpreter.INSTANCE);
		FSDMsgX msg = new FSDMsgX("Test");

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

		msg.add("F1", p);
		msg.set("F1", "12345");

		byte[] b = { 0x12, 0x34, 0x50 };
		byte[] stream = msg.pack();
		assertArrayEquals(b, stream);

	}

	@Test
	public void packTest09() throws ISOException {

		int size = 16;
		FixedFieldPackager p = new FixedFieldPackager("F1", size, AsciiInterpreter.INSTANCE,
				new TrackDataCompliance());
		FSDMsgX msg = new FSDMsgX("Test");

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