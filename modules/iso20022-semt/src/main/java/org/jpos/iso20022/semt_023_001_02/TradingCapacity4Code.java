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

package org.jpos.iso20022.semt_023_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingCapacity4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TradingCapacity4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PRIN"/>
 *     <enumeration value="CPRN"/>
 *     <enumeration value="RISP"/>
 *     <enumeration value="PROP"/>
 *     <enumeration value="AGEN"/>
 *     <enumeration value="CAGN"/>
 *     <enumeration value="OAGN"/>
 *     <enumeration value="PRAG"/>
 *     <enumeration value="BAGN"/>
 *     <enumeration value="INFI"/>
 *     <enumeration value="MKTM"/>
 *     <enumeration value="MLTF"/>
 *     <enumeration value="RMKT"/>
 *     <enumeration value="SINT"/>
 *     <enumeration value="TAGT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TradingCapacity4Code")
@XmlEnum
public enum TradingCapacity4Code {

    PRIN,
    CPRN,
    RISP,
    PROP,
    AGEN,
    CAGN,
    OAGN,
    PRAG,
    BAGN,
    INFI,
    MKTM,
    MLTF,
    RMKT,
    SINT,
    TAGT;

    public String value() {
        return name();
    }

    public static TradingCapacity4Code fromValue(String v) {
        return valueOf(v);
    }

}
