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

package org.jpos.iso20022.catm_002_001_11;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationQualify1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InformationQualify1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CUSA"/>
 *     <enumeration value="DISP"/>
 *     <enumeration value="DOCT"/>
 *     <enumeration value="ERRO"/>
 *     <enumeration value="INPT"/>
 *     <enumeration value="POIR"/>
 *     <enumeration value="RCPT"/>
 *     <enumeration value="SOND"/>
 *     <enumeration value="STAT"/>
 *     <enumeration value="VCHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InformationQualify1Code")
@XmlEnum
public enum InformationQualify1Code {

    CUSA,
    DISP,
    DOCT,
    ERRO,
    INPT,
    POIR,
    RCPT,
    SOND,
    STAT,
    VCHR;

    public String value() {
        return name();
    }

    public static InformationQualify1Code fromValue(String v) {
        return valueOf(v);
    }

}
