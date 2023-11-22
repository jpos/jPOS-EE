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

package org.jpos.iso20022.acmt_031_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeDelivery1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ChequeDelivery1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MLDB"/>
 *     <enumeration value="MLCD"/>
 *     <enumeration value="MLFA"/>
 *     <enumeration value="CRDB"/>
 *     <enumeration value="CRCD"/>
 *     <enumeration value="CRFA"/>
 *     <enumeration value="PUDB"/>
 *     <enumeration value="PUCD"/>
 *     <enumeration value="PUFA"/>
 *     <enumeration value="RGDB"/>
 *     <enumeration value="RGCD"/>
 *     <enumeration value="RGFA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChequeDelivery1Code")
@XmlEnum
public enum ChequeDelivery1Code {

    MLDB,
    MLCD,
    MLFA,
    CRDB,
    CRCD,
    CRFA,
    PUDB,
    PUCD,
    PUFA,
    RGDB,
    RGCD,
    RGFA;

    public String value() {
        return name();
    }

    public static ChequeDelivery1Code fromValue(String v) {
        return valueOf(v);
    }

}
