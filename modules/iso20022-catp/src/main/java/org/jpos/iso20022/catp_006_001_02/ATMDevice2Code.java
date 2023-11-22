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

package org.jpos.iso20022.catp_006_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMDevice2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMDevice2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALRM"/>
 *     <enumeration value="BRCD"/>
 *     <enumeration value="CAMR"/>
 *     <enumeration value="CRDD"/>
 *     <enumeration value="CRDR"/>
 *     <enumeration value="CSHD"/>
 *     <enumeration value="CSHI"/>
 *     <enumeration value="CSHR"/>
 *     <enumeration value="CHCK"/>
 *     <enumeration value="CDIS"/>
 *     <enumeration value="DPST"/>
 *     <enumeration value="DPRN"/>
 *     <enumeration value="DOOR"/>
 *     <enumeration value="INPM"/>
 *     <enumeration value="JRNL"/>
 *     <enumeration value="JPRN"/>
 *     <enumeration value="SNSR"/>
 *     <enumeration value="PSBK"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="RPRN"/>
 *     <enumeration value="SCAN"/>
 *     <enumeration value="RWDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMDevice2Code")
@XmlEnum
public enum ATMDevice2Code {

    ALRM,
    BRCD,
    CAMR,
    CRDD,
    CRDR,
    CSHD,
    CSHI,
    CSHR,
    CHCK,
    CDIS,
    DPST,
    DPRN,
    DOOR,
    INPM,
    JRNL,
    JPRN,
    SNSR,
    PSBK,
    PINR,
    RPRN,
    SCAN,
    RWDR;

    public String value() {
        return name();
    }

    public static ATMDevice2Code fromValue(String v) {
        return valueOf(v);
    }

}
