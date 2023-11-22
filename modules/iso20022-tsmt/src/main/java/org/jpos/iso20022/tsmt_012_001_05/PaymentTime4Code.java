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

package org.jpos.iso20022.tsmt_012_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTime4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentTime4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IREC"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="EPSD"/>
 *     <enumeration value="EPRR"/>
 *     <enumeration value="EPPO"/>
 *     <enumeration value="EPIN"/>
 *     <enumeration value="PRMR"/>
 *     <enumeration value="PRMD"/>
 *     <enumeration value="EPRD"/>
 *     <enumeration value="EPBE"/>
 *     <enumeration value="EMTR"/>
 *     <enumeration value="EMTD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentTime4Code")
@XmlEnum
public enum PaymentTime4Code {

    IREC,
    CASH,
    EPSD,
    EPRR,
    EPPO,
    EPIN,
    PRMR,
    PRMD,
    EPRD,
    EPBE,
    EMTR,
    EMTD;

    public String value() {
        return name();
    }

    public static PaymentTime4Code fromValue(String v) {
        return valueOf(v);
    }

}
