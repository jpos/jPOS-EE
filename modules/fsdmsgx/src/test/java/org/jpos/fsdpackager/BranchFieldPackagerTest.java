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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.ISOException;
import org.jpos.iso.LiteralInterpreter;
import org.junit.jupiter.api.Test;

public class BranchFieldPackagerTest {
	
    /**
     * Test case to verify the BranchFieldPackager with a switch field, switch
     * cases and a default case.
     *
     * @throws ISOException
     *             if an error occurs during packing or unpacking
     */
    @Test
    public void testBranchFieldPackagerWithCasesAndDefault() throws ISOException {
        // 1. Setup: Create the packagers.

        // Create packagers for each field.
        FixedFieldPackager field1Packager  = new FixedFieldPackager("F1", 5);
        FixedFieldPackager field2Packager  = new FixedFieldPackager("F2", 2);
        FixedFieldPackager field4Packager  = new FixedFieldPackager("F4", 3);
        FixedFieldPackager field5Packager  = new FixedFieldPackager("F5", 4);
        FixedFieldPackager defaultPackager = new FixedFieldPackager("FDefault", 3);

        // Create switch cases
        Map<String, AFSDFieldPackager> switchCases = new HashMap<>();
        switchCases.put("01", field4Packager);
        switchCases.put("02", field5Packager);

        // Create the branch packager
        BranchFieldPackager branchPackager = new BranchFieldPackager("F3", "F2", switchCases, defaultPackager);

        // 2. Test pack operation
        // Case 1: Switch field exists in the switch case
        Map<String, String> fields1 = new HashMap<>();
        fields1.put("F1", "ABCDE");
        fields1.put("F2", "02");
        fields1.put("F5", "4444");
        byte[] packed1 = branchPackager.pack(fields1);
        assertNotNull(packed1);
        assertEquals("34343434", bytesToHex(packed1));

        // Case 2: Switch field exists in the switch case
        Map<String, String> fields2 = new HashMap<>();
        fields2.put("F1", "ABCDE");
        fields2.put("F2", "01");
        fields2.put("F4", "123");

        byte[] packed2 = branchPackager.pack(fields2);
        assertNotNull(packed2);
        assertEquals("313233", bytesToHex(packed2));

        // Case 3: Switch field does not exist, should use default
        Map<String, String> fields3 = new HashMap<>();
        fields3.put("F1", "ABCDE");
        fields3.put("FDefault", "XYZ");

        byte[] packed3 = branchPackager.pack(fields3);
        assertNotNull(packed3);
        assertEquals("58595a", bytesToHex(packed3));

        // Case 4: Switch field is null and there is no default case. Should
        // return null.
        BranchFieldPackager branchPackagerNoDefault = new BranchFieldPackager("F3", "F2", switchCases, null);
        Map<String, String> fields4                 = new HashMap<>();
        fields4.put("F1", "ABCDE");

        byte[] packed4 = branchPackagerNoDefault.pack(fields4);
        assertNull(packed4);

        // Case 5: Switch field does not exist and no default case should return
        // null.
        Map<String, String> fields5 = new HashMap<>();
        fields5.put("F1", "ABCDE");
        fields5.put("F4", "123");

        byte[] packed5 = branchPackagerNoDefault.pack(fields5);
        assertNull(packed5);

        // 3. Test Unpack operation.
        // Case 1: Switch field exists in the switch case.
        byte[]              inStream1       = hexToBytes("34343434");
        Map<String, String> unpackedFields1 = new HashMap<>();
        unpackedFields1.put("F2", "02");
        int offset1 = branchPackager.unpack(inStream1, 0, unpackedFields1);
        assertEquals(4, offset1);
        assertEquals("4444", unpackedFields1.get("F5"));

        // Case 2: Switch field exists in the switch case
        byte[]              inStream2       = hexToBytes("313233");
        Map<String, String> unpackedFields2 = new HashMap<>();
        unpackedFields2.put("F2", "01");
        int offset2 = branchPackager.unpack(inStream2, 0, unpackedFields2);
        assertEquals(3, offset2);
        assertEquals("123", unpackedFields2.get("F4"));

        // Case 3: Switch field does not exist, should use default
        byte[]              inStream3       = hexToBytes("58595a");
        Map<String, String> unpackedFields3 = new HashMap<>();
        int                 offset3         = branchPackager.unpack(inStream3, 0, unpackedFields3);
        assertEquals(3, offset3);
        assertEquals("XYZ", unpackedFields3.get("FDefault"));

        // Case 4: Switch field is null and no default case, no changes
        BranchFieldPackager branchPackagerNoDefaultUnpack = new BranchFieldPackager("F3", "F2", switchCases, null);
        byte[]              inStream4                     = hexToBytes("313233");
        Map<String, String> unpackedFields4               = new HashMap<>();
        int                 offset4                       = branchPackagerNoDefaultUnpack.unpack(inStream4, 0,
                                                                                                 unpackedFields4);
        assertEquals(0, offset4);
        assertNull(unpackedFields4.get("F4"));
        assertNull(unpackedFields4.get("F5"));

        // Case 5: Switch field doesn't exist and no default
        byte[]              inStream5       = hexToBytes("313233");
        Map<String, String> unpackedFields5 = new HashMap<>();
        unpackedFields5.put("F2", "10");
        int offset5 = branchPackagerNoDefaultUnpack.unpack(inStream5, 0, unpackedFields5);
        assertEquals(0, offset5);
        assertNull(unpackedFields5.get("F4"));
        assertNull(unpackedFields5.get("F5"));

        // 4. Test dump operation
        // Case 1: Switch field exists in the switch case
        Map<String, String> dumpFields1 = new HashMap<>();
        dumpFields1.put("F2", "02");
        String dump1 = branchPackager.dump("", dumpFields1);
        assertEquals("<field id=\"F5\" value=\"4444\"/>", dump1.trim());

        // Case 2: Switch field exists in the switch case
        Map<String, String> dumpFields2 = new HashMap<>();
        dumpFields2.put("F2", "01");
        String dump2 = branchPackager.dump("", dumpFields2);
        assertEquals("<field id=\"F4\" value=\"123\"/>", dump2.trim());

        // Case 3: Switch field does not exist, should use default
        Map<String, String> dumpFields3 = new HashMap<>();
        dumpFields3.put("FDefault", "XYZ");
        String dump3 = branchPackager.dump("", dumpFields3);
        assertEquals("<field id=\"FDefault\" value=\"XYZ\"/>", dump3.trim());

//        // Case 4: Switch field is null, use default.
        switchCases = new HashMap<>();
        switchCases.put("01", field4Packager);
        switchCases.put("02", field5Packager);
        defaultPackager = new FixedFieldPackager("FDefault", 3);
        // Create the branch packager

        branchPackager = new BranchFieldPackager("F3", "F2", switchCases, defaultPackager);
        Map<String, String> dumpFields4 = new HashMap<>();

        dumpFields4.put("FDefault", "ABC");
        String dump4 = branchPackager.dump("", dumpFields4);
        assertEquals("<field id=\"FDefault\" value=\"ABC\"/>", dump4.trim());
        System.out.println(branchPackager.getParserTree("case4"));
        System.out.println(dump4);
        // Case 5: Switch field does not exist, use default.

        defaultPackager = new FixedFieldPackager("FDefault", 3);

        // Create switch cases
        switchCases = new HashMap<>();
        switchCases.put("01", field4Packager);
        switchCases.put("02", field5Packager);

        // Create the branch packager

        branchPackager = new BranchFieldPackager("F3", "F2", switchCases, defaultPackager);
        Map<String, String> dumpFields5 = new HashMap<>();
        dumpFields5.put("F2", "03");
        dumpFields5.put("FDefault", "ABC");
        String dump5 = branchPackager.dump("", dumpFields5);
        assertEquals("<field id=\"FDefault\" value=\"ABC\"/>", dump5.trim());
        System.out.println(branchPackager.getParserTree("case5"));
        System.out.println(dump5);

    }

    /**
     * Test case to verify the getParserTree method with a branch packager.
     */
    @Test
    public void testGetParserTree() {
        // 1. Setup
        FixedFieldPackager field1Packager  = new FixedFieldPackager("F1", 5);
        FixedFieldPackager field2Packager  = new FixedFieldPackager("F2", 2);
        FixedFieldPackager field4Packager  = new FixedFieldPackager("F4", 3);
        FixedFieldPackager field5Packager  = new FixedFieldPackager("F5", 4);
        FixedFieldPackager defaultPackager = new FixedFieldPackager("FDefault", 3);

        // Create switch cases
        Map<String, AFSDFieldPackager> switchCases = new HashMap<>();
        switchCases.put("01", field4Packager);
        switchCases.put("02", field5Packager);

        // Create the branch packager
        BranchFieldPackager branchPackager = new BranchFieldPackager("F3", "F2", switchCases, defaultPackager);

        // 2. Execute and assert

        String expectedTree = "Field [F3] : [Branch]" + System.lineSeparator() + "\tswitch (F2)"
                + System.lineSeparator() + "\t\t01:" + System.lineSeparator() + "\t\t\tField [F4] : Fixed [3] "
                + System.lineSeparator() + "\t\t02:" + System.lineSeparator()
                + "\t\t\tField [F5] : Fixed [4] " + System.lineSeparator() + "\t\tdefault:" + System.lineSeparator()
                + ""
                + System.lineSeparator() + "\t\t\tField [FDefault] : Fixed [3] " + System.lineSeparator();

        assertEquals(expectedTree, branchPackager.getParserTree(""));

    }

    /**
     * Test case to verify hexDump operation with various scenarios.
     * 
     * @throws ISOException
     *             if an error occurs during packing
     */
    @Test
    public void testHexDump() throws ISOException {
        // 1. Setup
        FixedFieldPackager field1Packager  = new FixedFieldPackager("F1", 5);
        FixedFieldPackager field2Packager  = new FixedFieldPackager("F2", 2);
        FixedFieldPackager field4Packager  = new FixedFieldPackager("F4", 3);
        FixedFieldPackager field5Packager  = new FixedFieldPackager("F5", 4);
        FixedFieldPackager defaultPackager = new FixedFieldPackager("FDefault", 3);

        // Create switch cases
        Map<String, AFSDFieldPackager> switchCases = new HashMap<>();
        switchCases.put("01", field4Packager);
        switchCases.put("02", field5Packager);

        // Create the branch packager
        BranchFieldPackager branchPackager = new BranchFieldPackager("F3", "F2", switchCases, defaultPackager);

        // 2. Test hexDump operation

        // Case 1: Switch field exists in the switch case
        Map<String, String> fields1 = new HashMap<>();
        fields1.put("F2", "02");
        fields1.put("F5", "4444");

        byte[] hexDump1 = branchPackager.hexDump("", fields1);
        assertNotNull(hexDump1);
        assertEquals("34343434", bytesToHex(hexDump1));

        // Case 2: Switch field exists in the switch case
        Map<String, String> fields2 = new HashMap<>();
        fields2.put("F2", "01");
        fields2.put("F4", "123");

        byte[] hexDump2 = branchPackager.hexDump("", fields2);
        assertNotNull(hexDump2);
        assertEquals("313233", bytesToHex(hexDump2));

        // Case 3: Switch field does not exist, should use default
        Map<String, String> fields3 = new HashMap<>();
        fields3.put("FDefault", "XYZ");

        byte[] hexDump3 = branchPackager.hexDump("", fields3);
        assertNotNull(hexDump3);
        assertEquals("58595a", bytesToHex(hexDump3));

        // Case 4: Switch field is null and no default case. Should return null.
        BranchFieldPackager branchPackagerNoDefault = new BranchFieldPackager("F3", "F2", switchCases, null);
        Map<String, String> fields4                 = new HashMap<>();
        byte[]              hexDump4                = branchPackagerNoDefault.hexDump("", fields4);
        assertNull(hexDump4);

        // Case 5: Switch field does not exist, and there is no default. Should
        // return null.
        Map<String, String> fields5 = new HashMap<>();
        fields5.put("F2", "10");
        fields5.put("F4", "123");

        byte[] hexDump5 = branchPackagerNoDefault.hexDump("", fields5);
        assertNull(hexDump5);
    }

    /**
     * Helper method to convert byte array to hex string.
     *
     * @param bytes
     *            The byte array to convert
     * @return Hex string representation of the byte array
     */
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    /**
     * Helper method to convert hex string to byte array
     *
     * @param hex
     *            The hex string to convert
     * @return Byte array represented by the hex string
     */
    private static byte[] hexToBytes(String hex) {
        int    len  = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

	@Test
	public void unpackTest06() throws ISOException{
		
		AFSDFieldPackager f1 = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2 = new FixedFieldPackager("F2", 2, AsciiInterpreter.INSTANCE);
		
		
		FSDMsgX innerFSDCase01 = new FSDMsgX("inner-1");
		AFSDFieldPackager f7 = new FixedFieldPackager("F7", 3, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f6 = new FixedFieldPackager("F6", 3, AsciiInterpreter.INSTANCE);

		innerFSDCase01.add("F7",f7);
		innerFSDCase01.add("F6",f6);
		FSDMsgX innerFSDCase02 = new FSDMsgX("inner-1");
		
		AFSDFieldPackager f8 = new FixedFieldPackager("F8", 4, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f9 = new FixedFieldPackager("F9", 4, AsciiInterpreter.INSTANCE);

		innerFSDCase02.add("F8",f8);
		innerFSDCase02.add("F9",f9);
		Map<String, AFSDFieldPackager> caseMap = new HashMap<>();
		caseMap.put("01", innerFSDCase01);
		caseMap.put("02", innerFSDCase02);
		AFSDFieldPackager f3 = new BranchFieldPackager("F3", "F2", caseMap, null);
		
		FSDMsgX msg = new FSDMsgX("Test");
		msg.add("F1", f1);
		msg.add("F2", f2);
		msg.add("F3", f3);
		
		msg.unpack("ABCDE0244445555".getBytes());
		System.out.println(msg.dump(""));
		assertEquals("ABCDE", msg.get("F1"));
		assertEquals("02", msg.get("F2"));
		
		assertEquals("4444", msg.get("F8"));
		assertEquals("5555", msg.get("F9"));

		
		
	}
	@Test
	public void packTest03() throws ISOException{
		
		AFSDFieldPackager f1 = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2 = new FixedFieldPackager("F2", 2, AsciiInterpreter.INSTANCE);
		
		AFSDFieldPackager case02 = new FixedFieldPackager("F5", 4, AsciiInterpreter.INSTANCE);
		
		FSDMsgX innerFSDCase01 = new FSDMsgX("Test");
		AFSDFieldPackager f4 = new FixedFieldPackager("F4", 3, AsciiInterpreter.INSTANCE);
		
		innerFSDCase01.add("Inner",f4);
		Map<String, AFSDFieldPackager> caseMap = new HashMap<>();
		caseMap.put("01", innerFSDCase01);
		caseMap.put("02", case02);
		AFSDFieldPackager f3 = new BranchFieldPackager("F3", "F2", caseMap, null);
		
		FSDMsgX msg = new FSDMsgX("Test");
		msg.add("F1", f1);
		msg.add("F2", f2);
		msg.add("F3", f3);
		
		msg.set("F1", "ABCDE");
		msg.set("F2", "01");
		msg.set("F4", "333");
		msg.set("F5", "4444");
		
		
		byte[] outStream = msg.pack();
		
		assertArrayEquals("ABCDE01333".getBytes(), outStream);
		
		
		
	}

	
	@Test
	public void packTest04() throws ISOException{
		
		AFSDFieldPackager f1 = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2 = new FixedFieldPackager("F2", 2, AsciiInterpreter.INSTANCE);
		
		AFSDFieldPackager case01 = new FixedFieldPackager("F4", 3, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager case02 = new FixedFieldPackager("F5", 4, AsciiInterpreter.INSTANCE);
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<>();
		caseMap.put("01", case01);
		caseMap.put("02", case02);
		AFSDFieldPackager f3 = new BranchFieldPackager("F3", "F2", caseMap, null);
		
		FSDMsgX msg = new FSDMsgX("Test");
		msg.add("F1", f1);
		msg.add("F2", f2);
		msg.add("F3", f3);
		
		msg.set("F1", "ABCDE");
		msg.set("F2", "03");
		msg.set("F4", "333");
		msg.set("F5", "4444");
		
		
		byte[] outStream = msg.pack();
		
		assertArrayEquals("ABCDE03".getBytes(), outStream);
		//System.out.println(ISOUtil.hexdump(outStream));
		
		
		
	}

	@Test
	public void packTest05() throws ISOException{
		
		AFSDFieldPackager f1 = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2 = new FixedFieldPackager("F2", 2, AsciiInterpreter.INSTANCE);
		
		AFSDFieldPackager case01 = new FixedFieldPackager("F4", 3, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager case02 = new FixedFieldPackager("F5", 4, AsciiInterpreter.INSTANCE);
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<>();
		caseMap.put("01", case01);
		caseMap.put("02", case02);
		AFSDFieldPackager f3 = new BranchFieldPackager("F3", "F2", caseMap, null);
		
		FSDMsgX msg = new FSDMsgX("Test");
		msg.add("F1", f1);
		msg.add("F2", f2);
		msg.add("F3", f3);
		
		msg.set("F1", "ABCDE");
		msg.set("F2", "02");
		msg.set("F4", "333");
		msg.set("F5", "4444");
		
		
		byte[] outStream = msg.pack();
		System.out.println(msg.getParserTree(""));
		
		assertArrayEquals("ABCDE024444".getBytes(), outStream);
		//System.out.println(ISOUtil.hexdump(outStream));
		
		
		
	}
	
	@Test
	public void packTest08() throws ISOException{
		
		AFSDFieldPackager f1 = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2 = new FixedFieldPackager("F2", 2, AsciiInterpreter.INSTANCE);
		
		AFSDFieldPackager case01 = new FixedFieldPackager("F4", 3, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager case02 = new FixedFieldPackager("F5", 4, AsciiInterpreter.INSTANCE);
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<>();
		caseMap.put("01", case01);
		caseMap.put("02", case02);
		AFSDFieldPackager f3 = new BranchFieldPackager("F3", "F2", caseMap, null);
		AFSDFieldPackager f6 = new FixedFieldPackager("F6", 1, LiteralInterpreter.INSTANCE);
		
		FSDMsgX msg = new FSDMsgX("Test");
		msg.add("F1", f1);
		msg.add("F2", f2);
		msg.add("F3", f3);
		msg.add("F6", f6);
		
		msg.set("F1", "ABCDE");
		msg.set("F2", "01");
		msg.set("F4", "333");
		msg.set("F5", "4444");
        msg.set("F6", String.valueOf(0x02));
		
		
		byte[] outStream = msg.pack();
		
        assertArrayEquals(("ABCDE013332").getBytes(), outStream);
		//System.out.println(ISOUtil.hexdump(outStream));
	
	}
	
	@Test
	public void packTest07() throws ISOException{
		
		AFSDFieldPackager f1 = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2 = new FixedFieldPackager("F2", 2, AsciiInterpreter.INSTANCE);
		
		AFSDFieldPackager case01 = new FixedFieldPackager("F4", 3, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager case02 = new FixedFieldPackager("F5", 4, AsciiInterpreter.INSTANCE);
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<>();
		caseMap.put("01", case01);
		caseMap.put("02", case02);
		AFSDFieldPackager f3 = new BranchFieldPackager("F3", "F2", caseMap, null);
		AFSDFieldPackager f6 = new FixedFieldPackager("F6", 1, LiteralInterpreter.INSTANCE);
		
		FSDMsgX msg = new FSDMsgX("Test");
		msg.add("F1", f1);
		msg.add("F2", f2);
		msg.add("F3", f3);
		// F6 is not added to the message.
		
		msg.set("F1", "ABCDE");
		msg.set("F2", "01");
		msg.set("F4", "333");
		msg.set("F5", "4444");
		msg.set("F6", String.valueOf((char)0x02));
		// But F6 is set, should have no impact on the output.
		
		byte[] outStream = msg.pack();
		
		assertArrayEquals("ABCDE01333".getBytes(), outStream);
		//System.out.println(ISOUtil.hexdump(outStream));
		
	}

	@Test
	public void packTest06() throws ISOException{
		
		AFSDFieldPackager f1 = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2 = new FixedFieldPackager("F2", 2, AsciiInterpreter.INSTANCE);
		
		AFSDFieldPackager case01 = new FixedFieldPackager("F4", 3, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager case02 = new FixedFieldPackager("F5", 4, AsciiInterpreter.INSTANCE);
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<>();
		caseMap.put("01", case01);
		caseMap.put("02", case02);
		AFSDFieldPackager f3 = new BranchFieldPackager("F3", "F2", caseMap, null);
		
		FSDMsgX msg = new FSDMsgX("Test");
		msg.add("F1", f1);
		msg.add("F2", f2);
		msg.add("F3", f3);
		
		msg.set("F1", "ABCDE");
		msg.set("F2", "01");
		msg.set("F4", "333");
		msg.set("F5", "4444");
		
		
		byte[] outStream = msg.pack();
		
		assertArrayEquals("ABCDE01333".getBytes(), outStream);
		//System.out.println(ISOUtil.hexdump(outStream));
		
	}
	
	@Test
	public void unpacktest07() throws ISOException{
		AFSDFieldPackager f1 = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2 = new FixedFieldPackager("F2", 2, AsciiInterpreter.INSTANCE);
		
		AFSDFieldPackager case01 = new FixedFieldPackager("F4", 3, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager case02 = new FixedFieldPackager("F5", 4, AsciiInterpreter.INSTANCE);
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<>();
		caseMap.put("01", case01);
		caseMap.put("02", case02);
		AFSDFieldPackager f3 = new BranchFieldPackager("F3", "F2", caseMap, null);
		
		FSDMsgX msg = new FSDMsgX("Test");
		msg.add("F1", f1);
		msg.add("F2", f2);
		msg.add("F3", f3);
		
		String raw = "12345" + "02" + "0000";
		msg.unpack(raw.getBytes());
		
		//System.out.println(msg.dump(""));
		
	}



}
