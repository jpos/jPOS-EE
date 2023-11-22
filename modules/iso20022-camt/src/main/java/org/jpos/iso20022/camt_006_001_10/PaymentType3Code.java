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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CBS"/>
 *     <enumeration value="BCK"/>
 *     <enumeration value="BAL"/>
 *     <enumeration value="CLS"/>
 *     <enumeration value="CTR"/>
 *     <enumeration value="CBH"/>
 *     <enumeration value="CBP"/>
 *     <enumeration value="DPG"/>
 *     <enumeration value="DPN"/>
 *     <enumeration value="EXP"/>
 *     <enumeration value="TCH"/>
 *     <enumeration value="LMT"/>
 *     <enumeration value="LIQ"/>
 *     <enumeration value="DPP"/>
 *     <enumeration value="DPH"/>
 *     <enumeration value="DPS"/>
 *     <enumeration value="STF"/>
 *     <enumeration value="TRP"/>
 *     <enumeration value="TCS"/>
 *     <enumeration value="LOA"/>
 *     <enumeration value="LOR"/>
 *     <enumeration value="TCP"/>
 *     <enumeration value="OND"/>
 *     <enumeration value="MGL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentType3Code")
@XmlEnum
public enum PaymentType3Code {

    CBS,
    BCK,
    BAL,
    CLS,
    CTR,
    CBH,
    CBP,
    DPG,
    DPN,
    EXP,
    TCH,
    LMT,
    LIQ,
    DPP,
    DPH,
    DPS,
    STF,
    TRP,
    TCS,
    LOA,
    LOR,
    TCP,
    OND,
    MGL;

    public String value() {
        return name();
    }

    public static PaymentType3Code fromValue(String v) {
        return valueOf(v);
    }

}
