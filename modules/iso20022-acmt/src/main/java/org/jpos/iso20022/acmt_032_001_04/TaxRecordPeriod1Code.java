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

package org.jpos.iso20022.acmt_032_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxRecordPeriod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxRecordPeriod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MM01"/>
 *     <enumeration value="MM02"/>
 *     <enumeration value="MM03"/>
 *     <enumeration value="MM04"/>
 *     <enumeration value="MM05"/>
 *     <enumeration value="MM06"/>
 *     <enumeration value="MM07"/>
 *     <enumeration value="MM08"/>
 *     <enumeration value="MM09"/>
 *     <enumeration value="MM10"/>
 *     <enumeration value="MM11"/>
 *     <enumeration value="MM12"/>
 *     <enumeration value="QTR1"/>
 *     <enumeration value="QTR2"/>
 *     <enumeration value="QTR3"/>
 *     <enumeration value="QTR4"/>
 *     <enumeration value="HLF1"/>
 *     <enumeration value="HLF2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxRecordPeriod1Code")
@XmlEnum
public enum TaxRecordPeriod1Code {

    @XmlEnumValue("MM01")
    MM_01("MM01"),
    @XmlEnumValue("MM02")
    MM_02("MM02"),
    @XmlEnumValue("MM03")
    MM_03("MM03"),
    @XmlEnumValue("MM04")
    MM_04("MM04"),
    @XmlEnumValue("MM05")
    MM_05("MM05"),
    @XmlEnumValue("MM06")
    MM_06("MM06"),
    @XmlEnumValue("MM07")
    MM_07("MM07"),
    @XmlEnumValue("MM08")
    MM_08("MM08"),
    @XmlEnumValue("MM09")
    MM_09("MM09"),
    @XmlEnumValue("MM10")
    MM_10("MM10"),
    @XmlEnumValue("MM11")
    MM_11("MM11"),
    @XmlEnumValue("MM12")
    MM_12("MM12"),
    @XmlEnumValue("QTR1")
    QTR_1("QTR1"),
    @XmlEnumValue("QTR2")
    QTR_2("QTR2"),
    @XmlEnumValue("QTR3")
    QTR_3("QTR3"),
    @XmlEnumValue("QTR4")
    QTR_4("QTR4"),
    @XmlEnumValue("HLF1")
    HLF_1("HLF1"),
    @XmlEnumValue("HLF2")
    HLF_2("HLF2");
    private final String value;

    TaxRecordPeriod1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxRecordPeriod1Code fromValue(String v) {
        for (TaxRecordPeriod1Code c: TaxRecordPeriod1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
