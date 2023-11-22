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

package org.jpos.iso20022.auth_054_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditQuality1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CreditQuality1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DFIM"/>
 *     <enumeration value="EXSP"/>
 *     <enumeration value="HIGR"/>
 *     <enumeration value="HISP"/>
 *     <enumeration value="INDF"/>
 *     <enumeration value="LMGR"/>
 *     <enumeration value="NIGS"/>
 *     <enumeration value="PRIM"/>
 *     <enumeration value="SURI"/>
 *     <enumeration value="UMGR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CreditQuality1Code")
@XmlEnum
public enum CreditQuality1Code {

    DFIM,
    EXSP,
    HIGR,
    HISP,
    INDF,
    LMGR,
    NIGS,
    PRIM,
    SURI,
    UMGR;

    public String value() {
        return name();
    }

    public static CreditQuality1Code fromValue(String v) {
        return valueOf(v);
    }

}
