package com.sample.hsm;

import java.util.HashMap;
import java.util.Map;

import org.jpos.fsdpackager.AFSDFieldPackager;
import org.jpos.fsdpackager.BranchFieldPackager;
import org.jpos.fsdpackager.FSDMsgX;
import org.jpos.fsdpackager.FixedFieldPackager;
import org.jpos.fsdpackager.LookAheadPackager;
import org.jpos.fsdpackager.OptionalPackager;
import org.jpos.fsdpackager.compliance.TrackDataCompliance;
import org.jpos.iso.AsciiInterpreter;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOUtil;

public class HSMMessage {

	public FSDMsgX getFSDMessage() {

		FSDMsgX message = new FSDMsgX("HSM");
		FixedFieldPackager stan = new FixedFieldPackager("stan", 4, AsciiInterpreter.INSTANCE);
		message.add(stan);

		FixedFieldPackager command = new FixedFieldPackager("command", 2, AsciiInterpreter.INSTANCE);
		message.add(command);

		Map<String, AFSDFieldPackager> commandCases = new HashMap<String, AFSDFieldPackager>();
		commandCases.put("A0", getA0Packager());
		commandCases.put("A1", getA1Packager());
		commandCases.put("A6", getA6Packager());
		commandCases.put("FA", getFAPackager());

		BranchFieldPackager branchCommand = new BranchFieldPackager("commandBrancher", "command", commandCases, null);

		message.add(branchCommand);
		return message;

	}

	private static AFSDFieldPackager getFAPackager() {
		FixedFieldPackager f1 = new FixedFieldPackager("zmk-scheme", 1, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f2 = new FixedFieldPackager("zmk", 32, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f3 = new FixedFieldPackager("import-key-scheme", 1, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f4 = new FixedFieldPackager("key-to-import-under-zmk", 32, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f5 = new FixedFieldPackager("mode", 1, AsciiInterpreter.INSTANCE);
		OptionalPackager f6 = new OptionalPackager("optiona-variant",
				new FixedFieldPackager("attalla-variant", 1, AsciiInterpreter.INSTANCE));

		FSDMsgX optionalGrp1 = new FSDMsgX("OptionalGroup1");
		AFSDFieldPackager semicolon = new FixedFieldPackager("delimiter",";",AsciiInterpreter.INSTANCE);
		AFSDFieldPackager reserved1 = new FixedFieldPackager("Reserved-1","O",AsciiInterpreter.INSTANCE);
		AFSDFieldPackager keySchemeLMK = new FixedFieldPackager("key-scheme-lmk",1,AsciiInterpreter.INSTANCE);
		AFSDFieldPackager keyCheckValue = new FixedFieldPackager("key-check-value-len",1,AsciiInterpreter.INSTANCE);
		optionalGrp1.add(semicolon);
		optionalGrp1.add(reserved1);
		optionalGrp1.add(keySchemeLMK);
		optionalGrp1.add(keyCheckValue);
		LookAheadPackager determineGrp1 = new LookAheadPackager("LAGRP1", 0, new Byte((byte)';') ,optionalGrp1, null, new String[]{"key-scheme-lmk","key-check-value-len"}, null);
		
		FSDMsgX optionalGrp2 = new FSDMsgX("OptionalGroup2");
		
		AFSDFieldPackager lmkid = new FixedFieldPackager("LMK-ID",2,AsciiInterpreter.INSTANCE);
		AFSDFieldPackager percent = new FixedFieldPackager("delimiter-2","%",AsciiInterpreter.INSTANCE);
		optionalGrp2.add(percent);
		optionalGrp2.add(lmkid);
		LookAheadPackager determineGrp2 = new LookAheadPackager("LAGRP2", 0, new Byte((byte)'%') ,optionalGrp2, null, new String[]{"LMK-ID"}, null);
		
		
		FSDMsgX container = new FSDMsgX("TranslateZPKReq-FA");
		container.add(f1);
		container.add(f2);
		container.add(f3);
		container.add(f4);
		container.add(f5);
		container.add(f6);
		container.add(determineGrp1);
		container.add(determineGrp2);
		
		return container;

	}

	private static FSDMsgX getA0Packager() {
		
		FixedFieldPackager f1 = new FixedFieldPackager("mode", 1, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f2 = new FixedFieldPackager("key-type", 3, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f3 = new FixedFieldPackager("key-scheme-key-under-lmk", 1, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f4 = new FixedFieldPackager("scheme-zmk-or-tmk", 1, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f5 = new FixedFieldPackager("key-zmk-or-tmk", 32, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f6 = new FixedFieldPackager("key-scheme-key-under-zmk-or-tmk", 1, AsciiInterpreter.INSTANCE);

		FSDMsgX container = new FSDMsgX("GenerateKeyReq-A0");
		container.add(f1);
		container.add(f2);
		container.add(f3);
		container.add(f4);
		container.add(f5);
		container.add(f6);
		return container;

	}

	private static AFSDFieldPackager getA6Packager() {
		FixedFieldPackager f1 = new FixedFieldPackager("key-type", 3, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f2 = new FixedFieldPackager("zmk-scheme", 1, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f3 = new FixedFieldPackager("zmk", 32, AsciiInterpreter.INSTANCE, new TrackDataCompliance());
		FixedFieldPackager f4 = new FixedFieldPackager("import-key-scheme", 1, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f5 = new FixedFieldPackager("key-to-import-under-zmk", 32, AsciiInterpreter.INSTANCE,
				new TrackDataCompliance());
		FixedFieldPackager f6 = new FixedFieldPackager("scheme-key-encrpt-under-lmk", 1, AsciiInterpreter.INSTANCE);
		OptionalPackager f7 = new OptionalPackager("optiona-variant",
				new FixedFieldPackager("attalla-variant", 1, AsciiInterpreter.INSTANCE));

		FSDMsgX container = new FSDMsgX("ImportKeyReq-A6");
		container.add(f1);
		container.add(f2);
		container.add(f3);
		container.add(f4);
		container.add(f5);
		container.add(f6);
		container.add(f7);
		return container;

	}

	private static AFSDFieldPackager getA1Packager() {

		FixedFieldPackager f0 = new FixedFieldPackager("error", 2, AsciiInterpreter.INSTANCE);

		FixedFieldPackager f1 = new FixedFieldPackager("scheme-key-under-lmk", 1, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f2 = new FixedFieldPackager("key-under-lmk", 32, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f3 = new FixedFieldPackager("scheme-key-under-zmk", 1, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f4 = new FixedFieldPackager("key-under-zmk", 32, AsciiInterpreter.INSTANCE);
		FixedFieldPackager f5 = new FixedFieldPackager("check-value", 6, AsciiInterpreter.INSTANCE);

		FSDMsgX container = new FSDMsgX("GenerateKeyRsp-A1");
		container.add(f0);
		container.add(f1);
		container.add(f2);
		container.add(f3);
		container.add(f4);
		container.add(f5);
		return container;
	}

	public static void main(String[] args) throws ISOException {
		HSMMessage m = new HSMMessage();
//		FSDMsgX fsd1 = m.getFSDMessage();
//		fsd1.set("stan", "1234");
//		fsd1.set("command", "A0");
//		fsd1.set("mode", "1");
//		fsd1.set("key-type", "001");
//		fsd1.set("key-scheme-key-under-lmk", "A");
//		fsd1.set("scheme-zmk-or-tmk", "B");
//		fsd1.set("key-zmk-or-tmk", ISOUtil.padleft("", 32, 'F'));
//		fsd1.set("key-scheme-key-under-zmk-or-tmk", "C");
//		byte[] outStream = fsd1.pack();
//		System.out.println(ISOUtil.hexdump(outStream));
//		System.out.println(fsd1.dump(""));
//		System.out.println(fsd1.getParserTree(""));
//
//		FSDMsgX fsd3 = m.getFSDMessage();
//		fsd3.set("stan", "1234");
//		fsd3.set("command", "A6");
//		fsd3.set("key-type", "001");
//		fsd3.set("zmk-scheme", "A");
//		fsd3.set("zmk", ISOUtil.padleft("", 32, 'A'));
//		fsd3.set("import-key-scheme", "X");
//		fsd3.set("key-to-import-under-zmk", ISOUtil.padleft("", 32, 'B'));
//		fsd3.set("scheme-key-encrpt-under-lmk", "C");
//		fsd3.set("attalla-variant", "V");
//		byte[] outStream3 = fsd3.pack();
//		System.out.println(ISOUtil.hexdump(outStream3));
//		System.out.println(fsd3.dump(""));
//		System.out.println(fsd3.getParserTree(""));
//
//		FSDMsgX fsd4 = m.getFSDMessage();
//		fsd4.set("stan", "1234");
//		fsd4.set("command", "A6");
//		fsd4.set("key-type", "001");
//		fsd4.set("zmk-scheme", "A");
//		fsd4.set("zmk", ISOUtil.padleft("", 32, 'A'));
//		fsd4.set("import-key-scheme", "X");
//		fsd4.set("key-to-import-under-zmk", ISOUtil.padleft("", 32, 'B'));
//		fsd4.set("scheme-key-encrpt-under-lmk", "C");
//		byte[] outStream4 = fsd4.pack();
//		System.out.println(ISOUtil.hexdump(outStream4));
//		System.out.println(fsd4.dump(""));
//		System.out.println(fsd4.getParserTree(""));
		
		
		FSDMsgX fsd2 = m.getFSDMessage();
		fsd2.set("stan", "1234");
		fsd2.set("command", "FA");
		fsd2.set("zmk-scheme", "A");
		fsd2.set("zmk", ISOUtil.padleft("", 32, 'A'));
		fsd2.set("import-key-scheme", "B");
		fsd2.set("key-to-import-under-zmk",ISOUtil.padleft("", 32, 'A'));
		fsd2.set("mode", "1");
		fsd2.set("attalla-variant", "V");
		
		//optional group fields
		fsd2.set("key-scheme-lmk", "U");
		fsd2.set("key-check-value-len", "0");
		
		//optional grp2 field
		fsd2.set("LMK-ID", "00");
		
		
		
		byte[] outStream2 = fsd2.pack();
		System.out.println(ISOUtil.hexdump(outStream2));
		System.out.println(fsd2.dump(""));
		System.out.println(fsd2.getParserTree(""));
		
		
//		FSDMsgX mess = m.getFSDMessage();
//		mess.unpack(outStream2);
//		System.out.println(mess.dump(""));
//		System.out.println(mess.getParserTree(""));


	}

}
