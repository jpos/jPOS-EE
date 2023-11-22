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

package org.jpos.iso20022.reda_012_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentSubStructureType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstrumentSubStructureType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABSE"/>
 *     <enumeration value="AIRT"/>
 *     <enumeration value="AUTT"/>
 *     <enumeration value="CBOB"/>
 *     <enumeration value="CDOB"/>
 *     <enumeration value="CLNO"/>
 *     <enumeration value="CLOB"/>
 *     <enumeration value="CMBS"/>
 *     <enumeration value="CSMR"/>
 *     <enumeration value="CRCT"/>
 *     <enumeration value="HELO"/>
 *     <enumeration value="LPNO"/>
 *     <enumeration value="PFAB"/>
 *     <enumeration value="PYRT"/>
 *     <enumeration value="REPK"/>
 *     <enumeration value="RMBS"/>
 *     <enumeration value="SCBO"/>
 *     <enumeration value="STRB"/>
 *     <enumeration value="STUT"/>
 *     <enumeration value="WBSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstrumentSubStructureType1Code")
@XmlEnum
public enum InstrumentSubStructureType1Code {

    ABSE,
    AIRT,
    AUTT,
    CBOB,
    CDOB,
    CLNO,
    CLOB,
    CMBS,
    CSMR,
    CRCT,
    HELO,
    LPNO,
    PFAB,
    PYRT,
    REPK,
    RMBS,
    SCBO,
    STRB,
    STUT,
    WBSE;

    public String value() {
        return name();
    }

    public static InstrumentSubStructureType1Code fromValue(String v) {
        return valueOf(v);
    }

}
