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

package org.jpos.iso20022.camt_086_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingChargeMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BillingChargeMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UPRC"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="BCHG"/>
 *     <enumeration value="DPRC"/>
 *     <enumeration value="FCHG"/>
 *     <enumeration value="LPRC"/>
 *     <enumeration value="MCHG"/>
 *     <enumeration value="MXRD"/>
 *     <enumeration value="TIR1"/>
 *     <enumeration value="TIR2"/>
 *     <enumeration value="TIR3"/>
 *     <enumeration value="TIR4"/>
 *     <enumeration value="TIR5"/>
 *     <enumeration value="TIR6"/>
 *     <enumeration value="TIR7"/>
 *     <enumeration value="TIR8"/>
 *     <enumeration value="TIR9"/>
 *     <enumeration value="TPRC"/>
 *     <enumeration value="ZPRC"/>
 *     <enumeration value="BBSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BillingChargeMethod1Code")
@XmlEnum
public enum BillingChargeMethod1Code {

    UPRC("UPRC"),
    STAM("STAM"),
    BCHG("BCHG"),
    DPRC("DPRC"),
    FCHG("FCHG"),
    LPRC("LPRC"),
    MCHG("MCHG"),
    MXRD("MXRD"),
    @XmlEnumValue("TIR1")
    TIR_1("TIR1"),
    @XmlEnumValue("TIR2")
    TIR_2("TIR2"),
    @XmlEnumValue("TIR3")
    TIR_3("TIR3"),
    @XmlEnumValue("TIR4")
    TIR_4("TIR4"),
    @XmlEnumValue("TIR5")
    TIR_5("TIR5"),
    @XmlEnumValue("TIR6")
    TIR_6("TIR6"),
    @XmlEnumValue("TIR7")
    TIR_7("TIR7"),
    @XmlEnumValue("TIR8")
    TIR_8("TIR8"),
    @XmlEnumValue("TIR9")
    TIR_9("TIR9"),
    TPRC("TPRC"),
    ZPRC("ZPRC"),
    BBSE("BBSE");
    private final String value;

    BillingChargeMethod1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillingChargeMethod1Code fromValue(String v) {
        for (BillingChargeMethod1Code c: BillingChargeMethod1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
