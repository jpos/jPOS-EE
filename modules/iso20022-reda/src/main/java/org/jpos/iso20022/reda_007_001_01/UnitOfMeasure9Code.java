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

package org.jpos.iso20022.reda_007_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnitOfMeasure9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BAGG"/>
 *     <enumeration value="BALE"/>
 *     <enumeration value="BOTL"/>
 *     <enumeration value="BOXX"/>
 *     <enumeration value="CRTN"/>
 *     <enumeration value="CELI"/>
 *     <enumeration value="CMET"/>
 *     <enumeration value="CNTR"/>
 *     <enumeration value="CRAT"/>
 *     <enumeration value="CBIN"/>
 *     <enumeration value="CBME"/>
 *     <enumeration value="CBML"/>
 *     <enumeration value="PIEC"/>
 *     <enumeration value="FOOT"/>
 *     <enumeration value="GBFO"/>
 *     <enumeration value="GBGA"/>
 *     <enumeration value="GBPI"/>
 *     <enumeration value="GBQA"/>
 *     <enumeration value="GBTN"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="KILO"/>
 *     <enumeration value="KMET"/>
 *     <enumeration value="LITR"/>
 *     <enumeration value="METR"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="MILE"/>
 *     <enumeration value="MMET"/>
 *     <enumeration value="MILI"/>
 *     <enumeration value="PUND"/>
 *     <enumeration value="USOU"/>
 *     <enumeration value="SCMT"/>
 *     <enumeration value="SQFO"/>
 *     <enumeration value="SQIN"/>
 *     <enumeration value="SQKI"/>
 *     <enumeration value="SMET"/>
 *     <enumeration value="SQMI"/>
 *     <enumeration value="SMIL"/>
 *     <enumeration value="SQYA"/>
 *     <enumeration value="USBA"/>
 *     <enumeration value="USFO"/>
 *     <enumeration value="USGA"/>
 *     <enumeration value="USPI"/>
 *     <enumeration value="USQA"/>
 *     <enumeration value="USTN"/>
 *     <enumeration value="YARD"/>
 *     <enumeration value="GBOU"/>
 *     <enumeration value="ACRE"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="HECT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnitOfMeasure9Code")
@XmlEnum
public enum UnitOfMeasure9Code {

    BAGG,
    BALE,
    BOTL,
    BOXX,
    CRTN,
    CELI,
    CMET,
    CNTR,
    CRAT,
    CBIN,
    CBME,
    CBML,
    PIEC,
    FOOT,
    GBFO,
    GBGA,
    GBPI,
    GBQA,
    GBTN,
    GRAM,
    INCH,
    KILO,
    KMET,
    LITR,
    METR,
    TONE,
    MILE,
    MMET,
    MILI,
    PUND,
    USOU,
    SCMT,
    SQFO,
    SQIN,
    SQKI,
    SMET,
    SQMI,
    SMIL,
    SQYA,
    USBA,
    USFO,
    USGA,
    USPI,
    USQA,
    USTN,
    YARD,
    GBOU,
    ACRE,
    ARES,
    HECT;

    public String value() {
        return name();
    }

    public static UnitOfMeasure9Code fromValue(String v) {
        return valueOf(v);
    }

}
