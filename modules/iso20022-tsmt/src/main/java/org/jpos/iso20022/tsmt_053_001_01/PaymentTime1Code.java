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

package org.jpos.iso20022.tsmt_053_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTime1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentTime1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="EMTD"/>
 *     <enumeration value="EPRD"/>
 *     <enumeration value="PRMD"/>
 *     <enumeration value="IREC"/>
 *     <enumeration value="PRMR"/>
 *     <enumeration value="EPRR"/>
 *     <enumeration value="EMTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentTime1Code")
@XmlEnum
public enum PaymentTime1Code {

    CASH,
    EMTD,
    EPRD,
    PRMD,
    IREC,
    PRMR,
    EPRR,
    EMTR;

    public String value() {
        return name();
    }

    public static PaymentTime1Code fromValue(String v) {
        return valueOf(v);
    }

}
