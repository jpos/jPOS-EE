/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2023 jPOS Software SRL
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

package org.jpos.iso20022.caad_010_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputFormat5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OutputFormat5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="TEXT"/>
 *     <enumeration value="URLI"/>
 *     <enumeration value="HTML"/>
 *     <enumeration value="PLIN"/>
 *     <enumeration value="JSON"/>
 *     <enumeration value="XMLF"/>
 *     <enumeration value="EDIF"/>
 *     <enumeration value="CSVF"/>
 *     <enumeration value="JPEG"/>
 *     <enumeration value="PDFF"/>
 *     <enumeration value="PNGF"/>
 *     <enumeration value="SVGF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OutputFormat5Code")
@XmlEnum
public enum OutputFormat5Code {

    OTHN,
    OTHP,
    TEXT,
    URLI,
    HTML,
    PLIN,
    JSON,
    XMLF,
    EDIF,
    CSVF,
    JPEG,
    PDFF,
    PNGF,
    SVGF;

    public String value() {
        return name();
    }

    public static OutputFormat5Code fromValue(String v) {
        return valueOf(v);
    }

}
