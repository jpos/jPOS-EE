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

package org.jpos.iso20022.caaa_007_001_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardPaymentServiceType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BALC"/>
 *     <enumeration value="CACT"/>
 *     <enumeration value="CRDP"/>
 *     <enumeration value="CAFH"/>
 *     <enumeration value="CAVR"/>
 *     <enumeration value="CSHW"/>
 *     <enumeration value="CSHD"/>
 *     <enumeration value="DEFR"/>
 *     <enumeration value="LOAD"/>
 *     <enumeration value="ORCR"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="QUCH"/>
 *     <enumeration value="RFND"/>
 *     <enumeration value="RESA"/>
 *     <enumeration value="VALC"/>
 *     <enumeration value="UNLD"/>
 *     <enumeration value="CAFT"/>
 *     <enumeration value="CAFL"/>
 *     <enumeration value="CIDD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType12Code")
@XmlEnum
public enum CardPaymentServiceType12Code {

    BALC,
    CACT,
    CRDP,
    CAFH,
    CAVR,
    CSHW,
    CSHD,
    DEFR,
    LOAD,
    ORCR,
    PINC,
    QUCH,
    RFND,
    RESA,
    VALC,
    UNLD,
    CAFT,
    CAFL,
    CIDD;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType12Code fromValue(String v) {
        return valueOf(v);
    }

}
