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

package org.jpos.iso20022.casp_004_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerMessage1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerMessage1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SSAB"/>
 *     <enumeration value="SAAQ"/>
 *     <enumeration value="SAAP"/>
 *     <enumeration value="SDDR"/>
 *     <enumeration value="SDDP"/>
 *     <enumeration value="SSEN"/>
 *     <enumeration value="SSMQ"/>
 *     <enumeration value="SSMR"/>
 *     <enumeration value="SSRJ"/>
 *     <enumeration value="SARQ"/>
 *     <enumeration value="SARP"/>
 *     <enumeration value="SFRP"/>
 *     <enumeration value="SFRQ"/>
 *     <enumeration value="SFSQ"/>
 *     <enumeration value="SFSP"/>
 *     <enumeration value="SASQ"/>
 *     <enumeration value="SASP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerMessage1Code")
@XmlEnum
public enum RetailerMessage1Code {

    SSAB,
    SAAQ,
    SAAP,
    SDDR,
    SDDP,
    SSEN,
    SSMQ,
    SSMR,
    SSRJ,
    SARQ,
    SARP,
    SFRP,
    SFRQ,
    SFSQ,
    SFSP,
    SASQ,
    SASP;

    public String value() {
        return name();
    }

    public static RetailerMessage1Code fromValue(String v) {
        return valueOf(v);
    }

}
