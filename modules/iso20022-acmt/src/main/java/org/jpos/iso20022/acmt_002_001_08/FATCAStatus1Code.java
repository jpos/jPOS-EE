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

package org.jpos.iso20022.acmt_002_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCAStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FATCAStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="F101"/>
 *     <enumeration value="F102"/>
 *     <enumeration value="F103"/>
 *     <enumeration value="F104"/>
 *     <enumeration value="F105"/>
 *     <enumeration value="F201"/>
 *     <enumeration value="F202"/>
 *     <enumeration value="F203"/>
 *     <enumeration value="F204"/>
 *     <enumeration value="F205"/>
 *     <enumeration value="F206"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FATCAStatus1Code")
@XmlEnum
public enum FATCAStatus1Code {

    @XmlEnumValue("F101")
    F_101("F101"),
    @XmlEnumValue("F102")
    F_102("F102"),
    @XmlEnumValue("F103")
    F_103("F103"),
    @XmlEnumValue("F104")
    F_104("F104"),
    @XmlEnumValue("F105")
    F_105("F105"),
    @XmlEnumValue("F201")
    F_201("F201"),
    @XmlEnumValue("F202")
    F_202("F202"),
    @XmlEnumValue("F203")
    F_203("F203"),
    @XmlEnumValue("F204")
    F_204("F204"),
    @XmlEnumValue("F205")
    F_205("F205"),
    @XmlEnumValue("F206")
    F_206("F206");
    private final String value;

    FATCAStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FATCAStatus1Code fromValue(String v) {
        for (FATCAStatus1Code c: FATCAStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
