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

import java.util.LinkedHashMap;
import java.util.Map;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOUtil;

public class FSDMsgX extends AFSDFieldPackager {

	public String dump(String prefix, Map<String, String> setfields) {
		// TODO Auto-generated method stub
		return dump(prefix);
	}

	private Map<String, AFSDFieldPackager> fieldPackagers = new LinkedHashMap<String, AFSDFieldPackager>();
	private Map<String, String> setfields = new LinkedHashMap<String, String>();

	public FSDMsgX(String name) {
		setName(name);
	}

	private FSDMsgX() {
	};

	public void add(String name, AFSDFieldPackager fsdFieldPackager) {

		getFields().put(name,fsdFieldPackager);

	}

	public void add(AFSDFieldPackager fsdFieldPackager) {

		getFields().put(fsdFieldPackager.getName(), fsdFieldPackager);

	}
	@Override
	public byte[] pack(Map<String, String> setfields) throws ISOException {
		this.setSetfields(setfields);
		return pack();

	}

	@Override
	public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException {
		// TODO Auto-generated method stub
		Map<String, AFSDFieldPackager> f = getFields();

		int innerOffset = unpack(inStream, offset);

		for (Map.Entry<String, String> entry : getSetfields().entrySet()) {

			fields.put(entry.getKey(), entry.getValue());
		}

		return innerOffset;

	}

	public void set(String fieldName, String value) {

		IFSDFieldPackager p = getFields().get(fieldName);

		getSetfields().put(fieldName, value);
		if (p != null)
			p.setValue(value);

	}

	public String get(String fieldName) {

		return setfields.get(fieldName);
	}

	public int unpack(byte[] inStream, int offset) throws ISOException {

		for (Map.Entry<String, AFSDFieldPackager> entry : getFields().entrySet()) {

			FSDField f = new FSDField();
			f.setName(entry.getKey());

			offset = entry.getValue().unpack(inStream, offset, getSetfields());
			getSetfields().put(entry.getValue().getName(), entry.getValue().getValue());

		}
		return offset;

	}

	public int unpack(byte[] inStream) throws ISOException {

		int offset = 0;
		for (Map.Entry<String, AFSDFieldPackager> entry : getFields().entrySet()) {

			FSDField f = new FSDField();
			f.setName(entry.getKey());

			offset = entry.getValue().unpack(inStream, offset, getSetfields());
			getSetfields().put(entry.getValue().getName(), entry.getValue().getValue());

		}
		return offset;

	}

	public byte[] pack() throws ISOException {

		byte[] outStream = null;
		for (Map.Entry<String, AFSDFieldPackager> entry : getFields().entrySet()) {

			byte[] temp = entry.getValue().pack(getSetfields());
			if (temp != null) {
				if (outStream == null) {
					outStream = temp;
				} else {
					byte[] outStream2 = new byte[outStream.length + temp.length];
					System.arraycopy(outStream, 0, outStream2, 0, outStream.length);
					System.arraycopy(temp, 0, outStream2, outStream.length, temp.length);
					outStream = outStream2;
				}
			}
		}
		return outStream;

	}

	public String dump(String prefix) {

		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s<fsdmsgX name=\"%s\">%n", prefix, getName()));
		String inner_prefix = prefix + "\t";
		for (Map.Entry<String, AFSDFieldPackager> entry : getFields().entrySet()) {

			sb.append(entry.getValue().dump(inner_prefix, getSetfields()));

		}
		sb.append(String.format("%s</fsdmsgX>%n", prefix));
		return sb.toString();
	}

	public String hexDump(String prefix) {

		StringBuilder sb = new StringBuilder();
		byte[] outStream = null;
		for (Map.Entry<String, AFSDFieldPackager> entry : getFields().entrySet()) {

			Map<String, String> setFieldmap = getSetfields();
			Map<String, AFSDFieldPackager> fieldPackager = getFields();
			AFSDFieldPackager fPkgr = entry.getValue();
			if (fPkgr instanceof FSDMsgX) {
				byte[] innerOutStream = hexDump(prefix, ((FSDMsgX) fPkgr).getSetfields());
				if (innerOutStream != null) {

					if (outStream == null) {
						outStream = innerOutStream;
					} else {
						byte[] outStream2 = new byte[outStream.length + innerOutStream.length];
						System.arraycopy(outStream, 0, outStream2, 0, outStream.length);
						System.arraycopy(innerOutStream, 0, outStream2, outStream.length, innerOutStream.length);
						outStream = outStream2;
					}

				}

			} else {
				byte[] temp = entry.getValue().hexDump("", getSetfields());
				if (temp != null) {
					if (outStream == null) {
						outStream = temp;
					} else {
						byte[] outStream2 = new byte[outStream.length + temp.length];
						System.arraycopy(outStream, 0, outStream2, 0, outStream.length);
						System.arraycopy(temp, 0, outStream2, outStream.length, temp.length);
						outStream = outStream2;
					}
				}
			}

		}
		sb.append(ISOUtil.hexdump(outStream));
		sb.append(System.lineSeparator());
		return sb.toString();

	}

	public Map<String, AFSDFieldPackager> getFields() {
		return fieldPackagers;
	}

	public void setFields(Map<String, AFSDFieldPackager> fields) {
		this.fieldPackagers = fields;
	}

	public Map<String, String> getSetfields() {
		return setfields;
	}

	public void setSetfields(Map<String, String> setfields) {
		this.setfields = setfields;
	}

	@Override
	public byte[] hexDump(String prefix, Map<String, String> setfields) {

		byte[] outStream = null;
		for (Map.Entry<String, AFSDFieldPackager> entry : fieldPackagers.entrySet()) {

			byte[] temp = entry.getValue().hexDump(prefix, getSetfields());
			if (temp != null) {
				if (outStream == null) {
					outStream = temp;
				} else {
					byte[] outStream2 = new byte[outStream.length + temp.length];
					System.arraycopy(outStream, 0, outStream2, 0, outStream.length);
					System.arraycopy(temp, 0, outStream2, outStream.length, temp.length);
					outStream = outStream2;
				}
			}

		}
		return outStream;
		// sb.append(ISOUtil.hexdump(outStream));

	}

	@Override
	public String getParserTree(String prefix) {
		StringBuilder sb = new StringBuilder(String.format("%s[%s]%n", prefix,getName()));
		
		for (Map.Entry<String, AFSDFieldPackager> entry : getFields().entrySet()) {

			AFSDFieldPackager fPkgr = entry.getValue();
			sb.append(fPkgr.getParserTree(prefix));
		}
		
		return sb.toString();
	}
	
	

}
