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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRSFormType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CRSFormType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CER4"/>
 *     <enumeration value="CER3"/>
 *     <enumeration value="CER5"/>
 *     <enumeration value="CER6"/>
 *     <enumeration value="CER8"/>
 *     <enumeration value="CER1"/>
 *     <enumeration value="CER2"/>
 *     <enumeration value="CER7"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CRSFormType1Code")
@XmlEnum
public enum CRSFormType1Code {

    @XmlEnumValue("CER4")
    CER_4("CER4"),
    @XmlEnumValue("CER3")
    CER_3("CER3"),
    @XmlEnumValue("CER5")
    CER_5("CER5"),
    @XmlEnumValue("CER6")
    CER_6("CER6"),
    @XmlEnumValue("CER8")
    CER_8("CER8"),
    @XmlEnumValue("CER1")
    CER_1("CER1"),
    @XmlEnumValue("CER2")
    CER_2("CER2"),
    @XmlEnumValue("CER7")
    CER_7("CER7");
    private final String value;

    CRSFormType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CRSFormType1Code fromValue(String v) {
        for (CRSFormType1Code c: CRSFormType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
