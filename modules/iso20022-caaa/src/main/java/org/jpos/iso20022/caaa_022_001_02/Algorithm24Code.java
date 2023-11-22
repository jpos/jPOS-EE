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
 * <p>Java class for Algorithm24Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm24Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EA2C"/>
 *     <enumeration value="E3DC"/>
 *     <enumeration value="DKP9"/>
 *     <enumeration value="UKPT"/>
 *     <enumeration value="UKA2"/>
 *     <enumeration value="EA9C"/>
 *     <enumeration value="EA5C"/>
 *     <enumeration value="DA12"/>
 *     <enumeration value="DA19"/>
 *     <enumeration value="DA25"/>
 *     <enumeration value="N108"/>
 *     <enumeration value="EA5R"/>
 *     <enumeration value="EA9R"/>
 *     <enumeration value="EA2R"/>
 *     <enumeration value="E3DR"/>
 *     <enumeration value="E36C"/>
 *     <enumeration value="E36R"/>
 *     <enumeration value="SD5C"/>
 *     <enumeration value="UKA1"/>
 *     <enumeration value="UKA3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm24Code")
@XmlEnum
public enum Algorithm24Code {

    @XmlEnumValue("EA2C")
    EA_2_C("EA2C"),
    @XmlEnumValue("E3DC")
    E_3_DC("E3DC"),
    @XmlEnumValue("DKP9")
    DKP_9("DKP9"),
    UKPT("UKPT"),
    @XmlEnumValue("UKA2")
    UKA_2("UKA2"),
    @XmlEnumValue("EA9C")
    EA_9_C("EA9C"),
    @XmlEnumValue("EA5C")
    EA_5_C("EA5C"),
    @XmlEnumValue("DA12")
    DA_12("DA12"),
    @XmlEnumValue("DA19")
    DA_19("DA19"),
    @XmlEnumValue("DA25")
    DA_25("DA25"),
    @XmlEnumValue("N108")
    N_108("N108"),
    @XmlEnumValue("EA5R")
    EA_5_R("EA5R"),
    @XmlEnumValue("EA9R")
    EA_9_R("EA9R"),
    @XmlEnumValue("EA2R")
    EA_2_R("EA2R"),
    @XmlEnumValue("E3DR")
    E_3_DR("E3DR"),
    @XmlEnumValue("E36C")
    E_36_C("E36C"),
    @XmlEnumValue("E36R")
    E_36_R("E36R"),
    @XmlEnumValue("SD5C")
    SD_5_C("SD5C"),
    @XmlEnumValue("UKA1")
    UKA_1("UKA1"),
    @XmlEnumValue("UKA3")
    UKA_3("UKA3");
    private final String value;

    Algorithm24Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm24Code fromValue(String v) {
        for (Algorithm24Code c: Algorithm24Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
