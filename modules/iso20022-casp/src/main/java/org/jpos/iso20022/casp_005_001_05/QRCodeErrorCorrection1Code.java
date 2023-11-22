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

package org.jpos.iso20022.casp_005_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QRCodeErrorCorrection1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="QRCodeErrorCorrection1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="M015"/>
 *     <enumeration value="Q025"/>
 *     <enumeration value="H030"/>
 *     <enumeration value="L007"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "QRCodeErrorCorrection1Code")
@XmlEnum
public enum QRCodeErrorCorrection1Code {

    @XmlEnumValue("M015")
    M_015("M015"),
    @XmlEnumValue("Q025")
    Q_025("Q025"),
    @XmlEnumValue("H030")
    H_030("H030"),
    @XmlEnumValue("L007")
    L_007("L007");
    private final String value;

    QRCodeErrorCorrection1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QRCodeErrorCorrection1Code fromValue(String v) {
        for (QRCodeErrorCorrection1Code c: QRCodeErrorCorrection1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
