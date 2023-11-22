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

package org.jpos.iso20022.sese_012_001_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PensionSchemeType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PensionSchemeType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AAVC"/>
 *     <enumeration value="DBEN"/>
 *     <enumeration value="EXPP"/>
 *     <enumeration value="FAVC"/>
 *     <enumeration value="GPPS"/>
 *     <enumeration value="SIPG"/>
 *     <enumeration value="STKG"/>
 *     <enumeration value="IPST"/>
 *     <enumeration value="STKI"/>
 *     <enumeration value="OTPM"/>
 *     <enumeration value="OCDC"/>
 *     <enumeration value="PPNS"/>
 *     <enumeration value="EPKA"/>
 *     <enumeration value="ITPO"/>
 *     <enumeration value="REAN"/>
 *     <enumeration value="SC32"/>
 *     <enumeration value="S32A"/>
 *     <enumeration value="SIPP"/>
 *     <enumeration value="SSAS"/>
 *     <enumeration value="NWRP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PensionSchemeType3Code")
@XmlEnum
public enum PensionSchemeType3Code {

    AAVC("AAVC"),
    DBEN("DBEN"),
    EXPP("EXPP"),
    FAVC("FAVC"),
    GPPS("GPPS"),
    SIPG("SIPG"),
    STKG("STKG"),
    IPST("IPST"),
    STKI("STKI"),
    OTPM("OTPM"),
    OCDC("OCDC"),
    PPNS("PPNS"),
    EPKA("EPKA"),
    ITPO("ITPO"),
    REAN("REAN"),
    @XmlEnumValue("SC32")
    SC_32("SC32"),
    @XmlEnumValue("S32A")
    S_32_A("S32A"),
    SIPP("SIPP"),
    SSAS("SSAS"),
    NWRP("NWRP");
    private final String value;

    PensionSchemeType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PensionSchemeType3Code fromValue(String v) {
        for (PensionSchemeType3Code c: PensionSchemeType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
