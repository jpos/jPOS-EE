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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType9Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType9Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGGR"/>
 *     <enumeration value="DCCV"/>
 *     <enumeration value="GRTT"/>
 *     <enumeration value="LOYT"/>
 *     <enumeration value="NRES"/>
 *     <enumeration value="PUCO"/>
 *     <enumeration value="RECP"/>
 *     <enumeration value="SOAF"/>
 *     <enumeration value="VCAU"/>
 *     <enumeration value="INSI"/>
 *     <enumeration value="INSA"/>
 *     <enumeration value="CSHB"/>
 *     <enumeration value="INST"/>
 *     <enumeration value="NRFD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType9Code")
@XmlEnum
public enum CardPaymentServiceType9Code {

    AGGR,
    DCCV,
    GRTT,
    LOYT,
    NRES,
    PUCO,
    RECP,
    SOAF,
    VCAU,
    INSI,
    INSA,
    CSHB,
    INST,
    NRFD;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType9Code fromValue(String v) {
        return valueOf(v);
    }

}
