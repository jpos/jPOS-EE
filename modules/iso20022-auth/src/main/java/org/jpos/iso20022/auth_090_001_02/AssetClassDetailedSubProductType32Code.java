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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType32Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType32Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BAKK"/>
 *     <enumeration value="BDSL"/>
 *     <enumeration value="BRNT"/>
 *     <enumeration value="BRNX"/>
 *     <enumeration value="CNDA"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="DSEL"/>
 *     <enumeration value="DUBA"/>
 *     <enumeration value="ESPO"/>
 *     <enumeration value="ETHA"/>
 *     <enumeration value="FUEL"/>
 *     <enumeration value="FOIL"/>
 *     <enumeration value="GOIL"/>
 *     <enumeration value="GSLN"/>
 *     <enumeration value="HEAT"/>
 *     <enumeration value="JTFL"/>
 *     <enumeration value="KERO"/>
 *     <enumeration value="LLSO"/>
 *     <enumeration value="MARS"/>
 *     <enumeration value="NAPH"/>
 *     <enumeration value="NGLO"/>
 *     <enumeration value="TAPI"/>
 *     <enumeration value="WTIO"/>
 *     <enumeration value="URAL"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType32Code")
@XmlEnum
public enum AssetClassDetailedSubProductType32Code {

    BAKK,
    BDSL,
    BRNT,
    BRNX,
    CNDA,
    COND,
    DSEL,
    DUBA,
    ESPO,
    ETHA,
    FUEL,
    FOIL,
    GOIL,
    GSLN,
    HEAT,
    JTFL,
    KERO,
    LLSO,
    MARS,
    NAPH,
    NGLO,
    TAPI,
    WTIO,
    URAL,
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType32Code fromValue(String v) {
        return valueOf(v);
    }

}
