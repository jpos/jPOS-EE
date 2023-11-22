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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermediateSecurityDistributionType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IntermediateSecurityDistributionType5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BIDS"/>
 *     <enumeration value="DRIP"/>
 *     <enumeration value="DVCA"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="PRIO"/>
 *     <enumeration value="DVSC"/>
 *     <enumeration value="DVSE"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="SOFF"/>
 *     <enumeration value="SPLF"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="EXOF"/>
 *     <enumeration value="MRGR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IntermediateSecurityDistributionType5Code")
@XmlEnum
public enum IntermediateSecurityDistributionType5Code {

    BIDS,
    DRIP,
    DVCA,
    DVOP,
    EXRI,
    PRIO,
    DVSC,
    DVSE,
    INTR,
    LIQU,
    SOFF,
    SPLF,
    BONU,
    EXOF,
    MRGR;

    public String value() {
        return name();
    }

    public static IntermediateSecurityDistributionType5Code fromValue(String v) {
        return valueOf(v);
    }

}
