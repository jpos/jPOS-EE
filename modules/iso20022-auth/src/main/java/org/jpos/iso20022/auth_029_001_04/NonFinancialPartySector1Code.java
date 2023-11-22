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

package org.jpos.iso20022.auth_029_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFinancialPartySector1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonFinancialPartySector1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WTER"/>
 *     <enumeration value="MING"/>
 *     <enumeration value="MAFG"/>
 *     <enumeration value="SPLY"/>
 *     <enumeration value="CSTR"/>
 *     <enumeration value="AGRI"/>
 *     <enumeration value="ACAF"/>
 *     <enumeration value="EDUC"/>
 *     <enumeration value="AEAR"/>
 *     <enumeration value="FINA"/>
 *     <enumeration value="HHSW"/>
 *     <enumeration value="INCO"/>
 *     <enumeration value="WRRM"/>
 *     <enumeration value="OTSA"/>
 *     <enumeration value="PSTA"/>
 *     <enumeration value="PADS"/>
 *     <enumeration value="RESA"/>
 *     <enumeration value="TRAS"/>
 *     <enumeration value="ASSA"/>
 *     <enumeration value="AHAE"/>
 *     <enumeration value="AEOB"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonFinancialPartySector1Code")
@XmlEnum
public enum NonFinancialPartySector1Code {

    WTER,
    MING,
    MAFG,
    SPLY,
    CSTR,
    AGRI,
    ACAF,
    EDUC,
    AEAR,
    FINA,
    HHSW,
    INCO,
    WRRM,
    OTSA,
    PSTA,
    PADS,
    RESA,
    TRAS,
    ASSA,
    AHAE,
    AEOB;

    public String value() {
        return name();
    }

    public static NonFinancialPartySector1Code fromValue(String v) {
        return valueOf(v);
    }

}
