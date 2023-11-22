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

package org.jpos.iso20022.seev_020_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOptionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionOptionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BSPL"/>
 *     <enumeration value="BUYA"/>
 *     <enumeration value="CASE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CEXC"/>
 *     <enumeration value="CTEN"/>
 *     <enumeration value="CONN"/>
 *     <enumeration value="CONY"/>
 *     <enumeration value="EXER"/>
 *     <enumeration value="LAPS"/>
 *     <enumeration value="MPUT"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="OFFR"/>
 *     <enumeration value="OVER"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="SLLE"/>
 *     <enumeration value="SPLI"/>
 *     <enumeration value="NOQU"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="QINV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionOptionType1Code")
@XmlEnum
public enum CorporateActionOptionType1Code {

    BSPL,
    BUYA,
    CASE,
    CASH,
    CEXC,
    CTEN,
    CONN,
    CONY,
    EXER,
    LAPS,
    MPUT,
    NOAC,
    OFFR,
    OVER,
    SECU,
    SLLE,
    SPLI,
    NOQU,
    OTHR,
    QINV;

    public String value() {
        return name();
    }

    public static CorporateActionOptionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
