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

package org.jpos.iso20022.tsmt_009_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTime3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentTime3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMTD"/>
 *     <enumeration value="EMTR"/>
 *     <enumeration value="EPBE"/>
 *     <enumeration value="EPRD"/>
 *     <enumeration value="PRMD"/>
 *     <enumeration value="PRMR"/>
 *     <enumeration value="EPIN"/>
 *     <enumeration value="EPAM"/>
 *     <enumeration value="EPPO"/>
 *     <enumeration value="EPRR"/>
 *     <enumeration value="EPSD"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="IREC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentTime3Code")
@XmlEnum
public enum PaymentTime3Code {

    EMTD,
    EMTR,
    EPBE,
    EPRD,
    PRMD,
    PRMR,
    EPIN,
    EPAM,
    EPPO,
    EPRR,
    EPSD,
    CASH,
    IREC;

    public String value() {
        return name();
    }

    public static PaymentTime3Code fromValue(String v) {
        return valueOf(v);
    }

}
