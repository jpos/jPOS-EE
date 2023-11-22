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

package org.jpos.iso20022.casp_001_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnitOfMeasure6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PIEC"/>
 *     <enumeration value="TONS"/>
 *     <enumeration value="FOOT"/>
 *     <enumeration value="GBGA"/>
 *     <enumeration value="USGA"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="KILO"/>
 *     <enumeration value="PUND"/>
 *     <enumeration value="METR"/>
 *     <enumeration value="CMET"/>
 *     <enumeration value="MMET"/>
 *     <enumeration value="LITR"/>
 *     <enumeration value="CELI"/>
 *     <enumeration value="MILI"/>
 *     <enumeration value="GBOU"/>
 *     <enumeration value="USOU"/>
 *     <enumeration value="GBQA"/>
 *     <enumeration value="USQA"/>
 *     <enumeration value="GBPI"/>
 *     <enumeration value="USPI"/>
 *     <enumeration value="MILE"/>
 *     <enumeration value="KMET"/>
 *     <enumeration value="YARD"/>
 *     <enumeration value="SQKI"/>
 *     <enumeration value="HECT"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="SMET"/>
 *     <enumeration value="SCMT"/>
 *     <enumeration value="SMIL"/>
 *     <enumeration value="SQMI"/>
 *     <enumeration value="SQYA"/>
 *     <enumeration value="SQFO"/>
 *     <enumeration value="SQIN"/>
 *     <enumeration value="ACRE"/>
 *     <enumeration value="KWHO"/>
 *     <enumeration value="DGEU"/>
 *     <enumeration value="GGEU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnitOfMeasure6Code")
@XmlEnum
public enum UnitOfMeasure6Code {

    PIEC,
    TONS,
    FOOT,
    GBGA,
    USGA,
    GRAM,
    INCH,
    KILO,
    PUND,
    METR,
    CMET,
    MMET,
    LITR,
    CELI,
    MILI,
    GBOU,
    USOU,
    GBQA,
    USQA,
    GBPI,
    USPI,
    MILE,
    KMET,
    YARD,
    SQKI,
    HECT,
    ARES,
    SMET,
    SCMT,
    SMIL,
    SQMI,
    SQYA,
    SQFO,
    SQIN,
    ACRE,
    KWHO,
    DGEU,
    GGEU;

    public String value() {
        return name();
    }

    public static UnitOfMeasure6Code fromValue(String v) {
        return valueOf(v);
    }

}
