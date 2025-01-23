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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.ISOException;
import org.junit.jupiter.api.Test;

public class LookAheadPackagerTest {

	/**
	 * Lookahead in the stream to see if a certain byte is present, if present
	 * start parsing the stream based on the set lookup value.
	 * 
	 * @throws ISOException
	 */
	@Test

	public void unpacktest01() throws ISOException {

        String            s     = "ABCD1234;XYZ";
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
	
    @Test
    void testPack_useIfSet_fieldsSet() throws ISOException {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValueIfSet");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValueIfNotSet");
        String[]          fieldNamesSet       = { "field1" };
        String[]          fieldNamesnotSet    = { "field2" };
        LookAheadPackager packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, useIfSetPackager,
                                                                      useIfNotSetPackager, fieldNamesSet,
                                                                      fieldNamesnotSet);

        Map<String, String> fields = new HashMap<>();
        fields.put("field1", "value1");

        byte[] packed = packager.pack(fields);

        assertNotNull(packed);
        assertEquals("testValueIfSet".length(), packed.length);
        assertArrayEquals("testValueIfSet".getBytes(), packed);
        assertEquals("testValueIfSet", useIfSetPackager.getValue());
    }

    @Test
    void testPack_useIfNotSet_fieldsNotSet() throws ISOException {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValueIfSet");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValueIfNotSet");
        String[]          fieldNamesSet       = { "field1" };
        String[]          fieldNamesnotSet    = { "field2" };
        LookAheadPackager packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, useIfSetPackager,
                                                                      useIfNotSetPackager, fieldNamesSet,
                                                                      fieldNamesnotSet);

        Map<String, String> fields = new HashMap<>();

        byte[] packed = packager.pack(fields);

        assertNotNull(packed);
        assertEquals("testValueIfNotSet".length(), packed.length);
        assertArrayEquals("testValueIfNotSet".getBytes(), packed);
        assertEquals("testValueIfNotSet", useIfNotSetPackager.getValue());
    }

    @Test
    void testPack_noMatch() throws ISOException {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValueIfSet");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValueIfNotSet");
        String[]          fieldNamesSet       = { "field1" };
        String[]          fieldNamesnotSet    = { "field2" };
        LookAheadPackager packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, null, null,
                                                                      fieldNamesSet, fieldNamesnotSet);

        Map<String, String> fields = new HashMap<>();

        byte[] packed = packager.pack(fields);

        assertNull(packed);
    }

    @Test
    void testUnpack_useIfSet_match() throws ISOException {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValue");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValue");
        String[]          fieldNamesSet       = { "field1" };
        String[]          fieldNamesnotSet    = { "field2" };
        LookAheadPackager packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, useIfSetPackager,
                                                                      useIfNotSetPackager, fieldNamesSet,
                                                                      fieldNamesnotSet);

        byte[]              inStream = { 0x00, 0x01, 0x02, 0x03 };
        Map<String, String> fields   = new HashMap<>();

        int newOffset = packager.unpack(inStream, 0, fields);

        assertEquals("testValue", useIfSetPackager.getValue());
        assertEquals("testValue", fields.get("useIfSet"));

        assertEquals("testValue", useIfSetPackager.getValue());
        assertEquals(9, newOffset);

    }

    @Test
    void testUnpack_useIfNotSet_noMatch() throws ISOException {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValue");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValue2");
        String[]          fieldNamesSet       = { "field1" };
        String[]          fieldNamesnotSet    = { "field2" };
        LookAheadPackager packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, useIfSetPackager,
                                                                      useIfNotSetPackager, fieldNamesSet,
                                                                      fieldNamesnotSet);

        byte[]              inStream = { 0x00, 0x02, 0x02, 0x03 };
        Map<String, String> fields   = new HashMap<>();

        int newOffset = packager.unpack(inStream, 0, fields);

        assertEquals("testValue2", useIfNotSetPackager.getValue());
        assertEquals("testValue2", fields.get("useIfNotSet"));
        assertEquals(9, newOffset);
    }

    @Test
    void testUnpack_noMatch() throws ISOException {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValue");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValue");
        String[]          fieldNamesSet       = { "field1" };
        String[]          fieldNamesnotSet    = { "field2" };
        LookAheadPackager packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, null, null,
                                                                      fieldNamesSet, fieldNamesnotSet);

        byte[]              inStream = { 0x00, 0x02, 0x02, 0x03 };
        Map<String, String> fields   = new HashMap<>();

        int newOffset = packager.unpack(inStream, 0, fields);

        assertEquals(0, newOffset);
    }

    @Test
    void testUnpack_offsetOutOfBounds() throws ISOException {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValue");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValue");
        String[]          fieldNamesSet       = { "field1" };
        String[]          fieldNamesnotSet    = { "field2" };
        LookAheadPackager packager            = new LookAheadPackager("lookAhead", 2, (byte) 0x01, useIfSetPackager,
                                                                      useIfNotSetPackager, fieldNamesSet,
                                                                      fieldNamesnotSet);

        byte[]              inStream = { 0x00, 0x01 };
        Map<String, String> fields   = new HashMap<>();

        int newOffset = packager.unpack(inStream, 0, fields);

        assertEquals(0, newOffset);
    }

    @Test
    void testDump_useIfSet_fieldsSet() {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValue");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValue");
        String[]          fieldNamesSet       = { "field1" };
        String[]          fieldNamesnotSet    = { "field2" };
        LookAheadPackager packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, useIfSetPackager,
                                                                      useIfNotSetPackager, fieldNamesSet,
                                                                      fieldNamesnotSet);

        Map<String, String> fields = new HashMap<>();
        fields.put("field1", "value1");

        String dump = packager.dump("", fields);

        assertEquals("Mock Field [useIfSet] : value=testValue", dump);
    }

    @Test
    void testDump_useIfNotSet_fieldsNotSet() {
        AFSDFieldPackager   useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValue");
        AFSDFieldPackager   useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValue2");
        String[]            fieldNamesSet       = { "field1" };
        String[]            fieldNamesnotSet    = { "field2" };
        LookAheadPackager   packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, useIfSetPackager,
                                                                        useIfNotSetPackager, fieldNamesSet,
                                                                        fieldNamesnotSet);
        Map<String, String> fields              = new HashMap<>();
        String              dump                = packager.dump("", fields);
        assertEquals("Mock Field [useIfNotSet] : value=testValue2", dump);
    }

    @Test
    void testDump_noMatch() {
        String[]            fieldNamesSet    = { "field1" };
        String[]            fieldNamesnotSet = { "field2" };
        LookAheadPackager   packager         = new LookAheadPackager("lookAhead", 1, (byte) 0x01, null, null,
                                                                     fieldNamesSet, fieldNamesnotSet);
        Map<String, String> fields           = new HashMap<>();
        String              dump             = packager.dump("", fields);
        assertEquals("", dump);
    }

    @Test
    void testHexDump_useIfSet_fieldsSet() {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValue");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValue2");
        String[]          fieldNamesSet       = { "field1" };
        String[]          fieldNamesnotSet    = { "field2" };
        LookAheadPackager packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, useIfSetPackager,
                                                                      useIfNotSetPackager, fieldNamesSet,
                                                                      fieldNamesnotSet);

        Map<String, String> fields = new HashMap<>();
        fields.put("field1", "value1");

        byte[] hexDump = packager.hexDump("", fields);
        assertArrayEquals("testValue".getBytes(), hexDump);
        // assertEquals("Mock Field [useIfSet] : value=testValue", hexDump);
    }

    @Test
    void testHexDump_useIfNotSet_fieldsNotSet() {
        AFSDFieldPackager   useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValue");
        AFSDFieldPackager   useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValue2");
        String[]            fieldNamesSet       = { "field1" };
        String[]            fieldNamesnotSet    = { "field2" };
        LookAheadPackager   packager            = new LookAheadPackager("lookAhead", 1, (byte) 0x01, useIfSetPackager,
                                                                        useIfNotSetPackager, fieldNamesSet,
                                                                        fieldNamesnotSet);
        Map<String, String> fields              = new HashMap<>();
        byte[]              hexDump             = packager.hexDump("", fields);
        assertArrayEquals("testValue2".getBytes(), hexDump);

        // assertEquals("Mock Field [useIfNotSet] : value=testValue2", hexDump);
    }

    @Test
    void testHexDump_noMatch() {
        String[]            fieldNamesSet    = { "field1" };
        String[]            fieldNamesnotSet = { "field2" };
        LookAheadPackager   packager         = new LookAheadPackager("lookAhead", 1, (byte) 0x01, null, null,
                                                                     fieldNamesSet, fieldNamesnotSet);
        Map<String, String> fields           = new HashMap<>();

        byte[] hexDump = packager.hexDump("", fields);
        assertNull(hexDump);

    }

    @Test
    void testGetParserTree() {
        AFSDFieldPackager useIfSetPackager    = new MockAFSDFieldPackager("useIfSet", "testValue");
        AFSDFieldPackager useIfNotSetPackager = new MockAFSDFieldPackager("useIfNotSet", "testValue2");
        String[]          fieldNamesSet       = { "field1", "field2" };
        String[]          fieldNamesnotSet    = { "field3" };

        LookAheadPackager packager = new LookAheadPackager("lookAhead", 1, (byte) 0x01, useIfSetPackager,
                                                           useIfNotSetPackager, fieldNamesSet, fieldNamesnotSet);
        String            tree     = packager.getParserTree("");
        String            expected = String.format("Field [lookAhead] : [LookAhead]%n" + "\t\t\toffset[1] find[0x1]%n"
                + "\t\t\t\t[if found]%n" + "\t\t\t\t\tMock Field [useIfSet] : value=testValue%n"
                + "\t\t\t\t[if not found]%n" + "\t\t\t\t\tMock Field [useIfNotSet] : value=testValue2%n"
                + "\t\t\tCheck Field[field1,field2,]%n");
        assertEquals(expected, tree);

        LookAheadPackager packagerNulls = new LookAheadPackager("lookAhead", 1, (byte) 0x01, null, null, fieldNamesSet,
                                                                fieldNamesnotSet);
        String            treeNulls     = packagerNulls.getParserTree("");
        String            expectedNulls = String.format("Field [lookAhead] : [LookAhead]%n"
                + "\t\t\toffset[1] find[0x1]%n" + "\t\t\t\t[if found]%n" + "\t\t\t\t\t[Not Set]"
                + System.lineSeparator() + "\t\t\t\t[if not found]%n" + "\t\t\t\t\t[Not Set]" + System.lineSeparator()
                + "\t\t\tCheck Field[field1,field2,]%n");
        assertEquals(expectedNulls, treeNulls);
    }

    // Mock class for AFSDFieldPackager to isolate LookAheadPackager logic.
    static class MockAFSDFieldPackager extends AFSDFieldPackager {
        private String value;
        private String name;

        public MockAFSDFieldPackager(String name, String value) {
            this.value = value;
            this.name = name;
        }

        @Override
        public byte[] pack(Map<String, String> setfields) throws ISOException {
            return value.getBytes();
        }

        @Override
        public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {
            fields.put(name, value);
            return 9;

        }

        @Override
        public String dump(String prefix, Map<String, String> setfields) {
            return prefix + "Mock Field [" + name + "] : value=" + value;
        }

        @Override
        public byte[] hexDump(String prefix, Map<String, String> setfields) {
            return value.getBytes();
        }

        @Override
        public String getParserTree(String prefix) {
            return prefix + "Mock Field [" + name + "] : value=" + value + System.lineSeparator();
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String getName() {
            return name;
        }
    }


}
