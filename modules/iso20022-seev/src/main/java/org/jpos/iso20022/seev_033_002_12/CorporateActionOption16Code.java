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

package org.jpos.iso20022.seev_033_002_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionOption16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABST"/>
 *     <enumeration value="BSPL"/>
 *     <enumeration value="BUYA"/>
 *     <enumeration value="CASE"/>
 *     <enumeration value="CASH"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="CEXC"/>
 *     <enumeration value="CONN"/>
 *     <enumeration value="CONY"/>
 *     <enumeration value="CTEN"/>
 *     <enumeration value="EXER"/>
 *     <enumeration value="LAPS"/>
 *     <enumeration value="MKDW"/>
 *     <enumeration value="MKUP"/>
 *     <enumeration value="MPUT"/>
 *     <enumeration value="NOAC"/>
 *     <enumeration value="NOQU"/>
 *     <enumeration value="OFFR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="OVER"/>
 *     <enumeration value="QINV"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="SLLE"/>
 *     <enumeration value="TAXI"/>
 *     <enumeration value="PRUN"/>
 *     <enumeration value="BOBD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionOption16Code")
@XmlEnum
public enum CorporateActionOption16Code {

    ABST,
    BSPL,
    BUYA,
    CASE,
    CASH,
    CERT,
    CEXC,
    CONN,
    CONY,
    CTEN,
    EXER,
    LAPS,
    MKDW,
    MKUP,
    MPUT,
    NOAC,
    NOQU,
    OFFR,
    OTHR,
    OVER,
    QINV,
    SECU,
    SLLE,
    TAXI,
    PRUN,
    BOBD;

    public String value() {
        return name();
    }

    public static CorporateActionOption16Code fromValue(String v) {
        return valueOf(v);
    }

}
