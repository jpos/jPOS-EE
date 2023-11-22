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

package org.jpos.iso20022.casp_015_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerResultDetail1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerResultDetail1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABRT"/>
 *     <enumeration value="BUSY"/>
 *     <enumeration value="CANC"/>
 *     <enumeration value="DEVO"/>
 *     <enumeration value="WPIN"/>
 *     <enumeration value="NHOS"/>
 *     <enumeration value="UNVS"/>
 *     <enumeration value="UNVD"/>
 *     <enumeration value="REFU"/>
 *     <enumeration value="PAYR"/>
 *     <enumeration value="TNFD"/>
 *     <enumeration value="NALW"/>
 *     <enumeration value="LOUT"/>
 *     <enumeration value="IVCA"/>
 *     <enumeration value="ICAR"/>
 *     <enumeration value="WIPG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerResultDetail1Code")
@XmlEnum
public enum RetailerResultDetail1Code {

    ABRT,
    BUSY,
    CANC,
    DEVO,
    WPIN,
    NHOS,
    UNVS,
    UNVD,
    REFU,
    PAYR,
    TNFD,
    NALW,
    LOUT,
    IVCA,
    ICAR,
    WIPG;

    public String value() {
        return name();
    }

    public static RetailerResultDetail1Code fromValue(String v) {
        return valueOf(v);
    }

}
