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

import org.jpos.iso.ISOException;

public interface IFSDFieldPackager {

	/**
	 * @param inStream
	 *            the byte array containing data to be parsed and unpacked into
	 *            the {@link FSDMsgX} object.
	 * @param offset
	 *            The current position where the parser is at.
	 * @param fields
	 *            A map containing the field name and value.
	 * 
	 * @return The offset in the instream after unpacking using current field
	 *         packager.
	 * @throws ISOException
	 */
	public int unpack(byte[] inStream, int offset, Map<String, String> fields) throws ISOException;

	/**
	 * @param setfields
	 *            A map containing the field name and values tha are set up.
	 * @return The byte array containing data the current fieldpackager packed.
	 * @throws ISOException
	 */
	public byte[] pack(Map<String, String> setfields) throws ISOException;

	public String getValue();

	public void setValue(String value);

	/**
	 * @param prefix
	 *            Prepending Text.
	 * @param setfields
	 *            A map containing the field name as key and text representation
	 *            of the value.
	 * @return A pretty printed xml string.
	 */
	public String dump(String prefix, Map<String, String> setfields);

	/**
	 * @param prefix
	 *            Prepending decorative text.
	 * @param setfields
	 *            A map containing the field name as key and text representation
	 *            of the value.
	 * @return A hexdump of the data stream.
	 */
	public byte[] hexDump(String prefix, Map<String, String> setfields);

	/**
	 * @param prefix
	 *            Prepending decorative text.
	 * @return A descriptive string of the parsing rule.
	 */
	public String getParserTree(String prefix);

}
