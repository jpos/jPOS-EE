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

package org.jpos.iso20022.caaa_022_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm17Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm17Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MACC"/>
 *     <enumeration value="MCCS"/>
 *     <enumeration value="CMA1"/>
 *     <enumeration value="MCC1"/>
 *     <enumeration value="CMA9"/>
 *     <enumeration value="CMA5"/>
 *     <enumeration value="CMA2"/>
 *     <enumeration value="CM31"/>
 *     <enumeration value="CM32"/>
 *     <enumeration value="CM33"/>
 *     <enumeration value="MCS3"/>
 *     <enumeration value="CCA1"/>
 *     <enumeration value="CCA2"/>
 *     <enumeration value="CCA3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm17Code")
@XmlEnum
public enum Algorithm17Code {

    MACC("MACC"),
    MCCS("MCCS"),
    @XmlEnumValue("CMA1")
    CMA_1("CMA1"),
    @XmlEnumValue("MCC1")
    MCC_1("MCC1"),
    @XmlEnumValue("CMA9")
    CMA_9("CMA9"),
    @XmlEnumValue("CMA5")
    CMA_5("CMA5"),
    @XmlEnumValue("CMA2")
    CMA_2("CMA2"),
    @XmlEnumValue("CM31")
    CM_31("CM31"),
    @XmlEnumValue("CM32")
    CM_32("CM32"),
    @XmlEnumValue("CM33")
    CM_33("CM33"),
    @XmlEnumValue("MCS3")
    MCS_3("MCS3"),
    @XmlEnumValue("CCA1")
    CCA_1("CCA1"),
    @XmlEnumValue("CCA2")
    CCA_2("CCA2"),
    @XmlEnumValue("CCA3")
    CCA_3("CCA3");
    private final String value;

    Algorithm17Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm17Code fromValue(String v) {
        for (Algorithm17Code c: Algorithm17Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
