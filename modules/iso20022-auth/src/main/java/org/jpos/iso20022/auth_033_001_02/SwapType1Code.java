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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwapType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SwapType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OSSC"/>
 *     <enumeration value="XFSC"/>
 *     <enumeration value="XFMC"/>
 *     <enumeration value="XXSC"/>
 *     <enumeration value="XXMC"/>
 *     <enumeration value="IFMC"/>
 *     <enumeration value="FFSC"/>
 *     <enumeration value="FFMC"/>
 *     <enumeration value="IFSC"/>
 *     <enumeration value="OSMC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SwapType1Code")
@XmlEnum
public enum SwapType1Code {

    OSSC,
    XFSC,
    XFMC,
    XXSC,
    XXMC,
    IFMC,
    FFSC,
    FFMC,
    IFSC,
    OSMC;

    public String value() {
        return name();
    }

    public static SwapType1Code fromValue(String v) {
        return valueOf(v);
    }

}
