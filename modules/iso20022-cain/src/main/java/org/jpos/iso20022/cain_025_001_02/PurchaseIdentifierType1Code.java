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

package org.jpos.iso20022.cain_025_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseIdentifierType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PurchaseIdentifierType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONU"/>
 *     <enumeration value="CUOR"/>
 *     <enumeration value="CUPO"/>
 *     <enumeration value="FONU"/>
 *     <enumeration value="INNU"/>
 *     <enumeration value="ORNU"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PRNU"/>
 *     <enumeration value="PUID"/>
 *     <enumeration value="RELO"/>
 *     <enumeration value="REAG"/>
 *     <enumeration value="RENU"/>
 *     <enumeration value="RSNU"/>
 *     <enumeration value="SUOR"/>
 *     <enumeration value="TINU"/>
 *     <enumeration value="TRNU"/>
 *     <enumeration value="SUIN"/>
 *     <enumeration value="TNID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PurchaseIdentifierType1Code")
@XmlEnum
public enum PurchaseIdentifierType1Code {

    CONU,
    CUOR,
    CUPO,
    FONU,
    INNU,
    ORNU,
    OTHN,
    OTHP,
    PRNU,
    PUID,
    RELO,
    REAG,
    RENU,
    RSNU,
    SUOR,
    TINU,
    TRNU,
    SUIN,
    TNID;

    public String value() {
        return name();
    }

    public static PurchaseIdentifierType1Code fromValue(String v) {
        return valueOf(v);
    }

}
