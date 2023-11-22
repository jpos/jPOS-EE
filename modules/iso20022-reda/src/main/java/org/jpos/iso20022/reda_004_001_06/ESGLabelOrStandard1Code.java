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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESGLabelOrStandard1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ESGLabelOrStandard1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="E005"/>
 *     <enumeration value="C003"/>
 *     <enumeration value="B002"/>
 *     <enumeration value="L012"/>
 *     <enumeration value="D004"/>
 *     <enumeration value="O015"/>
 *     <enumeration value="A001"/>
 *     <enumeration value="F006"/>
 *     <enumeration value="K011"/>
 *     <enumeration value="J010"/>
 *     <enumeration value="H008"/>
 *     <enumeration value="I009"/>
 *     <enumeration value="G007"/>
 *     <enumeration value="N014"/>
 *     <enumeration value="M013"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ESGLabelOrStandard1Code")
@XmlEnum
public enum ESGLabelOrStandard1Code {

    @XmlEnumValue("E005")
    E_005("E005"),
    @XmlEnumValue("C003")
    C_003("C003"),
    @XmlEnumValue("B002")
    B_002("B002"),
    @XmlEnumValue("L012")
    L_012("L012"),
    @XmlEnumValue("D004")
    D_004("D004"),
    @XmlEnumValue("O015")
    O_015("O015"),
    @XmlEnumValue("A001")
    A_001("A001"),
    @XmlEnumValue("F006")
    F_006("F006"),
    @XmlEnumValue("K011")
    K_011("K011"),
    @XmlEnumValue("J010")
    J_010("J010"),
    @XmlEnumValue("H008")
    H_008("H008"),
    @XmlEnumValue("I009")
    I_009("I009"),
    @XmlEnumValue("G007")
    G_007("G007"),
    @XmlEnumValue("N014")
    N_014("N014"),
    @XmlEnumValue("M013")
    M_013("M013");
    private final String value;

    ESGLabelOrStandard1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESGLabelOrStandard1Code fromValue(String v) {
        for (ESGLabelOrStandard1Code c: ESGLabelOrStandard1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
