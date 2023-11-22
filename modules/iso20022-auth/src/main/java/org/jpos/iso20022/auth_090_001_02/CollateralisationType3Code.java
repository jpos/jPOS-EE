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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralisationType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralisationType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FLCL"/>
 *     <enumeration value="OWCL"/>
 *     <enumeration value="OWC1"/>
 *     <enumeration value="OWC2"/>
 *     <enumeration value="OWP1"/>
 *     <enumeration value="OWP2"/>
 *     <enumeration value="PRCL"/>
 *     <enumeration value="PRC1"/>
 *     <enumeration value="PRC2"/>
 *     <enumeration value="UNCL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralisationType3Code")
@XmlEnum
public enum CollateralisationType3Code {

    FLCL("FLCL"),
    OWCL("OWCL"),
    @XmlEnumValue("OWC1")
    OWC_1("OWC1"),
    @XmlEnumValue("OWC2")
    OWC_2("OWC2"),
    @XmlEnumValue("OWP1")
    OWP_1("OWP1"),
    @XmlEnumValue("OWP2")
    OWP_2("OWP2"),
    PRCL("PRCL"),
    @XmlEnumValue("PRC1")
    PRC_1("PRC1"),
    @XmlEnumValue("PRC2")
    PRC_2("PRC2"),
    UNCL("UNCL");
    private final String value;

    CollateralisationType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollateralisationType3Code fromValue(String v) {
        for (CollateralisationType3Code c: CollateralisationType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
