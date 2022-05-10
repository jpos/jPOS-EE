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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.ISOException;
import org.jpos.iso.LiteralInterpreter;
import org.junit.jupiter.api.Test;

public class BranchFieldPackagerTest {
	

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
		Map<String, AFSDFieldPackager> caseMap = new HashMap<String, AFSDFieldPackager>();
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
		Map<String, AFSDFieldPackager> caseMap = new HashMap<String, AFSDFieldPackager>();
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
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<String, AFSDFieldPackager>();
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
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<String, AFSDFieldPackager>();
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
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<String, AFSDFieldPackager>();
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
		msg.set("F6", String.valueOf((char)0x02));
		
		
		byte[] outStream = msg.pack();
		
		assertArrayEquals(("ABCDE01333"+(char)0x02).getBytes(), outStream);
		//System.out.println(ISOUtil.hexdump(outStream));
	
	}
	
	@Test
	public void packTest07() throws ISOException{
		
		AFSDFieldPackager f1 = new FixedFieldPackager("F1", 5, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager f2 = new FixedFieldPackager("F2", 2, AsciiInterpreter.INSTANCE);
		
		AFSDFieldPackager case01 = new FixedFieldPackager("F4", 3, AsciiInterpreter.INSTANCE);
		AFSDFieldPackager case02 = new FixedFieldPackager("F5", 4, AsciiInterpreter.INSTANCE);
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<String, AFSDFieldPackager>();
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
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<String, AFSDFieldPackager>();
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
		
		Map<String, AFSDFieldPackager> caseMap = new HashMap<String, AFSDFieldPackager>();
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
