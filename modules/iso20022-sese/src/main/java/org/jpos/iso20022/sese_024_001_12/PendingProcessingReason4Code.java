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

package org.jpos.iso20022.sese_024_001_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingProcessingReason4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingProcessingReason4Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADEA"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="NOFX"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="MUNO"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="YCOL"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="FLIM"/>
 *     <enumeration value="NEXT"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LALO"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="DENO"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="CSDH"/>
 *     <enumeration value="CVAL"/>
 *     <enumeration value="CDEL"/>
 *     <enumeration value="CDLR"/>
 *     <enumeration value="CDAC"/>
 *     <enumeration value="INBC"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="PRSY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingProcessingReason4Code")
@XmlEnum
public enum PendingProcessingReason4Code {

    ADEA,
    CAIS,
    DOCY,
    NOFX,
    BLOC,
    MUNO,
    GLOB,
    YCOL,
    COLL,
    FLIM,
    NEXT,
    LACK,
    LALO,
    MONY,
    MINO,
    OTHR,
    DENO,
    LIQU,
    CERT,
    CSDH,
    CVAL,
    CDEL,
    CDLR,
    CDAC,
    INBC,
    PREA,
    PRSY;

    public String value() {
        return name();
    }

    public static PendingProcessingReason4Code fromValue(String v) {
        return valueOf(v);
    }

}
