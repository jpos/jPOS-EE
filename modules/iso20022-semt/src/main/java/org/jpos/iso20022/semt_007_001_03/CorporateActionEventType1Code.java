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

package org.jpos.iso20022.semt_007_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionEventType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DRIP"/>
 *     <enumeration value="CAPG"/>
 *     <enumeration value="DVCA"/>
 *     <enumeration value="DVOP"/>
 *     <enumeration value="DVSE"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="MRGR"/>
 *     <enumeration value="NAME"/>
 *     <enumeration value="SOFF"/>
 *     <enumeration value="SPLF"/>
 *     <enumeration value="SPLR"/>
 *     <enumeration value="TEND"/>
 *     <enumeration value="BONU"/>
 *     <enumeration value="RHDI"/>
 *     <enumeration value="EXRI"/>
 *     <enumeration value="CHAN"/>
 *     <enumeration value="REDO"/>
 *     <enumeration value="EXOP"/>
 *     <enumeration value="EXOF"/>
 *     <enumeration value="DECR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionEventType1Code")
@XmlEnum
public enum CorporateActionEventType1Code {

    DRIP,
    CAPG,
    DVCA,
    DVOP,
    DVSE,
    LIQU,
    MRGR,
    NAME,
    SOFF,
    SPLF,
    SPLR,
    TEND,
    BONU,
    RHDI,
    EXRI,
    CHAN,
    REDO,
    EXOP,
    EXOF,
    DECR;

    public String value() {
        return name();
    }

    public static CorporateActionEventType1Code fromValue(String v) {
        return valueOf(v);
    }

}
