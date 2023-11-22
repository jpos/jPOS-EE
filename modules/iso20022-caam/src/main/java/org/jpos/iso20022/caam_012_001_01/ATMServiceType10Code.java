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

package org.jpos.iso20022.caam_012_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMServiceType10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ATMServiceType10Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRFC"/>
 *     <enumeration value="TRFI"/>
 *     <enumeration value="TRFP"/>
 *     <enumeration value="ASTS"/>
 *     <enumeration value="BLCQ"/>
 *     <enumeration value="CDVF"/>
 *     <enumeration value="CHSN"/>
 *     <enumeration value="CMPF"/>
 *     <enumeration value="DCCS"/>
 *     <enumeration value="XRTD"/>
 *     <enumeration value="XRTW"/>
 *     <enumeration value="MCHG"/>
 *     <enumeration value="DPSN"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="PINR"/>
 *     <enumeration value="PINU"/>
 *     <enumeration value="PATH"/>
 *     <enumeration value="PRFL"/>
 *     <enumeration value="EMVS"/>
 *     <enumeration value="STDR"/>
 *     <enumeration value="SPRV"/>
 *     <enumeration value="DPSV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ATMServiceType10Code")
@XmlEnum
public enum ATMServiceType10Code {

    TRFC,
    TRFI,
    TRFP,
    ASTS,
    BLCQ,
    CDVF,
    CHSN,
    CMPF,
    DCCS,
    XRTD,
    XRTW,
    MCHG,
    DPSN,
    PINC,
    PINR,
    PINU,
    PATH,
    PRFL,
    EMVS,
    STDR,
    SPRV,
    DPSV;

    public String value() {
        return name();
    }

    public static ATMServiceType10Code fromValue(String v) {
        return valueOf(v);
    }

}
