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

package org.jpos.iso20022.fxtr_037_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInformationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountInformationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IBND"/>
 *     <enumeration value="IBCC"/>
 *     <enumeration value="IBDC"/>
 *     <enumeration value="BIBC"/>
 *     <enumeration value="BIBD"/>
 *     <enumeration value="BINC"/>
 *     <enumeration value="BIND"/>
 *     <enumeration value="BICC"/>
 *     <enumeration value="BIDC"/>
 *     <enumeration value="CMSA"/>
 *     <enumeration value="CBBC"/>
 *     <enumeration value="CBBD"/>
 *     <enumeration value="CBNC"/>
 *     <enumeration value="CBND"/>
 *     <enumeration value="CBCC"/>
 *     <enumeration value="CBDC"/>
 *     <enumeration value="CUAC"/>
 *     <enumeration value="DEAC"/>
 *     <enumeration value="FCAA"/>
 *     <enumeration value="FCAN"/>
 *     <enumeration value="FCBN"/>
 *     <enumeration value="IBBC"/>
 *     <enumeration value="IBBD"/>
 *     <enumeration value="IBNC"/>
 *     <enumeration value="MCAA"/>
 *     <enumeration value="MCAN"/>
 *     <enumeration value="MCIC"/>
 *     <enumeration value="MCIN"/>
 *     <enumeration value="MSAA"/>
 *     <enumeration value="MSBN"/>
 *     <enumeration value="MCAD"/>
 *     <enumeration value="NODC"/>
 *     <enumeration value="SCAC"/>
 *     <enumeration value="SCAA"/>
 *     <enumeration value="OMSA"/>
 *     <enumeration value="NOCC"/>
 *     <enumeration value="MSBS"/>
 *     <enumeration value="MSAN"/>
 *     <enumeration value="SCAN"/>
 *     <enumeration value="SCIC"/>
 *     <enumeration value="SCIN"/>
 *     <enumeration value="SOCA"/>
 *     <enumeration value="SSCA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountInformationType1Code")
@XmlEnum
public enum AccountInformationType1Code {

    IBND,
    IBCC,
    IBDC,
    BIBC,
    BIBD,
    BINC,
    BIND,
    BICC,
    BIDC,
    CMSA,
    CBBC,
    CBBD,
    CBNC,
    CBND,
    CBCC,
    CBDC,
    CUAC,
    DEAC,
    FCAA,
    FCAN,
    FCBN,
    IBBC,
    IBBD,
    IBNC,
    MCAA,
    MCAN,
    MCIC,
    MCIN,
    MSAA,
    MSBN,
    MCAD,
    NODC,
    SCAC,
    SCAA,
    OMSA,
    NOCC,
    MSBS,
    MSAN,
    SCAN,
    SCIC,
    SCIN,
    SOCA,
    SSCA;

    public String value() {
        return name();
    }

    public static AccountInformationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
