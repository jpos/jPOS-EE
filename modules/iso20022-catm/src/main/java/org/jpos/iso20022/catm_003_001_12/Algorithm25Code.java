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

package org.jpos.iso20022.catm_003_001_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm25Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm25Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ERS2"/>
 *     <enumeration value="ERS1"/>
 *     <enumeration value="RPSS"/>
 *     <enumeration value="ERS3"/>
 *     <enumeration value="ED32"/>
 *     <enumeration value="ED33"/>
 *     <enumeration value="ED35"/>
 *     <enumeration value="ED23"/>
 *     <enumeration value="ED25"/>
 *     <enumeration value="ES22"/>
 *     <enumeration value="ES32"/>
 *     <enumeration value="ES33"/>
 *     <enumeration value="ES35"/>
 *     <enumeration value="ES23"/>
 *     <enumeration value="ES25"/>
 *     <enumeration value="ED22"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm25Code")
@XmlEnum
public enum Algorithm25Code {

    @XmlEnumValue("ERS2")
    ERS_2("ERS2"),
    @XmlEnumValue("ERS1")
    ERS_1("ERS1"),
    RPSS("RPSS"),
    @XmlEnumValue("ERS3")
    ERS_3("ERS3"),
    @XmlEnumValue("ED32")
    ED_32("ED32"),
    @XmlEnumValue("ED33")
    ED_33("ED33"),
    @XmlEnumValue("ED35")
    ED_35("ED35"),
    @XmlEnumValue("ED23")
    ED_23("ED23"),
    @XmlEnumValue("ED25")
    ED_25("ED25"),
    @XmlEnumValue("ES22")
    ES_22("ES22"),
    @XmlEnumValue("ES32")
    ES_32("ES32"),
    @XmlEnumValue("ES33")
    ES_33("ES33"),
    @XmlEnumValue("ES35")
    ES_35("ES35"),
    @XmlEnumValue("ES23")
    ES_23("ES23"),
    @XmlEnumValue("ES25")
    ES_25("ES25"),
    @XmlEnumValue("ED22")
    ED_22("ED22");
    private final String value;

    Algorithm25Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm25Code fromValue(String v) {
        for (Algorithm25Code c: Algorithm25Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
