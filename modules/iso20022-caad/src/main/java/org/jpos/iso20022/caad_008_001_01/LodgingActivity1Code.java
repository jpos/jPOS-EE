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

package org.jpos.iso20022.caad_008_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LodgingActivity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LodgingActivity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APTM"/>
 *     <enumeration value="BEBR"/>
 *     <enumeration value="COTT"/>
 *     <enumeration value="CRUI"/>
 *     <enumeration value="HOME"/>
 *     <enumeration value="HOST"/>
 *     <enumeration value="HOTL"/>
 *     <enumeration value="LODG"/>
 *     <enumeration value="MOTL"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="RESO"/>
 *     <enumeration value="ROAB"/>
 *     <enumeration value="TOSH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LodgingActivity1Code")
@XmlEnum
public enum LodgingActivity1Code {

    APTM,
    BEBR,
    COTT,
    CRUI,
    HOME,
    HOST,
    HOTL,
    LODG,
    MOTL,
    OTHN,
    OTHP,
    RESO,
    ROAB,
    TOSH;

    public String value() {
        return name();
    }

    public static LodgingActivity1Code fromValue(String v) {
        return valueOf(v);
    }

}
