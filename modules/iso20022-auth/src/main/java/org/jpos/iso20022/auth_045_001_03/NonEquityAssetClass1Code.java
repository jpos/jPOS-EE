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

package org.jpos.iso20022.auth_045_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEquityAssetClass1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonEquityAssetClass1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SDRV"/>
 *     <enumeration value="IRDV"/>
 *     <enumeration value="FEXD"/>
 *     <enumeration value="EQDV"/>
 *     <enumeration value="EADV"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="CRDV"/>
 *     <enumeration value="CFDS"/>
 *     <enumeration value="COMD"/>
 *     <enumeration value="C10D"/>
 *     <enumeration value="BOND"/>
 *     <enumeration value="ETCS"/>
 *     <enumeration value="ETNS"/>
 *     <enumeration value="SFPS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonEquityAssetClass1Code")
@XmlEnum
public enum NonEquityAssetClass1Code {

    SDRV("SDRV"),
    IRDV("IRDV"),
    FEXD("FEXD"),
    EQDV("EQDV"),
    EADV("EADV"),
    EMAL("EMAL"),
    CRDV("CRDV"),
    CFDS("CFDS"),
    COMD("COMD"),
    @XmlEnumValue("C10D")
    C_10_D("C10D"),
    BOND("BOND"),
    ETCS("ETCS"),
    ETNS("ETNS"),
    SFPS("SFPS");
    private final String value;

    NonEquityAssetClass1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonEquityAssetClass1Code fromValue(String v) {
        for (NonEquityAssetClass1Code c: NonEquityAssetClass1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
