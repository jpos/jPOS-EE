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

package org.jpos.iso20022.auth_094_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialPartySectorType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialPartySectorType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AIFD"/>
 *     <enumeration value="CSDS"/>
 *     <enumeration value="CCPS"/>
 *     <enumeration value="CDTI"/>
 *     <enumeration value="INUN"/>
 *     <enumeration value="ORPI"/>
 *     <enumeration value="INVF"/>
 *     <enumeration value="REIN"/>
 *     <enumeration value="UCIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialPartySectorType2Code")
@XmlEnum
public enum FinancialPartySectorType2Code {

    AIFD,
    CSDS,
    CCPS,
    CDTI,
    INUN,
    ORPI,
    INVF,
    REIN,
    UCIT;

    public String value() {
        return name();
    }

    public static FinancialPartySectorType2Code fromValue(String v) {
        return valueOf(v);
    }

}
