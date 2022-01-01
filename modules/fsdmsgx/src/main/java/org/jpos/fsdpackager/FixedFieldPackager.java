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
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOUtil;
import org.jpos.iso.Interpreter;

public class FixedFieldPackager extends  AFSDFieldPackager {

	private String value;
	Interpreter interpretter;
	private int size;
	private boolean padLeft = true;
	private boolean padright = false;
	private Byte padCharacter = new Byte((byte) 0x20); //space
	private APCICompliance compliance = new NoCompliance();

	public FixedFieldPackager(String name,int size,Interpreter interpretter) {
		this.interpretter = interpretter;
		this.size = size;
		this.setName(name);
	}
	public FixedFieldPackager(String name,int size,Interpreter interpretter, APCICompliance compliance) {

		this(name,size,interpretter);
		this.compliance  = compliance;
	}
	public FixedFieldPackager(String name,String value, Interpreter interpretter) {
		this.interpretter = interpretter;
		this.setName(name);
		this.setValue(value);
		this.size = value.length();
	}

	@Override
	public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {


		int packedSize = interpretter.getPackedLength(size);
		if (inStream.length - offset < packedSize) {
			throw new ISOException(String.format("Field [%s] at offset [%d]:Expecting %d bytes found %d", getName(),offset,packedSize, inStream.length - offset));
		}
		String interprettedvalue = interpretter.uninterpret(inStream, offset, size);
		if (getValue() != null) {
			if (!getValue().equals(interprettedvalue)) {
				throw new ISOException(String.format("Field [%s] at offset [%d]:Expected %s but found %s", getName(),offset,getValue(), interprettedvalue));
			}
		}

		fields.put(getName(),interprettedvalue);
		value = interprettedvalue;
		return offset + packedSize;

	}

	@Override
	public byte[] pack(Map<String, String> fields) throws ISOException {

		if (value== null) {// if the hardcoded value is in the constructor , use it.
			value = fields.get(getName());
			
		}
		else {
			fields.put(getName(), value);
		}
		if (value==null){
			throw new ISOException(String.format("Field [%s]: Unable to pack as field is not set",getName()));
		}
		if (value.length() <= size) {
			if (padLeft){
				ISOUtil.padleft(getValue(), size,(char) padCharacter.byteValue() );
			}
			else {
				ISOUtil.padright(getValue(), size,(char) padCharacter.byteValue() );
			}
		}
		else {
			throw new ISOException(String.format("Field [%s]:Cannot pack as data has size %d and size needs to be %d",getName(), value.length(),size));
		}
		
		byte[] packedbyte = new byte[interpretter.getPackedLength(size)];
		interpretter.interpret(getValue(), packedbyte, 0);
		return packedbyte;

	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setValue(String value) {
		this.value = value;
	}

	

	public void setPad(boolean padLeft) {
		this.padLeft = padLeft;
		this.padright = !padLeft;
	}

	public Byte getPadCharacter() {
		return padCharacter;
	}

	public void setPadCharacter(Byte padCharacter) {
		this.padCharacter = padCharacter;
	}

	@Override
	public String dump(String prefix,Map<String, String> setfields) {
		if (getValue()!=null)
		return String.format("%s<field id=\"%s\" value=\"%s\"/>%n", prefix,getName(),compliance.makeCompliant(getValue()));
		return "";
	}
	@Override
	public byte[] hexDump(String prefix,Map<String, String> setfields) {
		
		int numberOfPackedBytes = interpretter.getPackedLength(getValue().length());
		String compliant = compliance.makeCompliant(getValue());
		byte[] temp = new byte[numberOfPackedBytes];
		try {
			interpretter.interpret(compliant, temp, 0);
		} catch (ISOException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return temp;
		
		

		
	}
	@Override
	public String getParserTree(String prefix) {
		
		return String.format("%sField [%s] : Fixed [%d] %s%n", prefix,getName(),size, (value==null)?"":": "+value);
	}

	

}
