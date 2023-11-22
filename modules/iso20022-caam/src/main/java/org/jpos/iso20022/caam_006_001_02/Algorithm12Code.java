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

package org.jpos.iso20022.caam_006_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MACC"/>
 *     <enumeration value="MCCS"/>
 *     <enumeration value="CMA1"/>
 *     <enumeration value="MCC1"/>
 *     <enumeration value="CMA9"/>
 *     <enumeration value="CMA5"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm12Code")
@XmlEnum
public enum Algorithm12Code {

    MACC("MACC"),
    MCCS("MCCS"),
    @XmlEnumValue("CMA1")
    CMA_1("CMA1"),
    @XmlEnumValue("MCC1")
    MCC_1("MCC1"),
    @XmlEnumValue("CMA9")
    CMA_9("CMA9"),
    @XmlEnumValue("CMA5")
    CMA_5("CMA5");
    private final String value;

    Algorithm12Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm12Code fromValue(String v) {
        for (Algorithm12Code c: Algorithm12Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
