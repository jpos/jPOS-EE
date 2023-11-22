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

package org.jpos.iso20022.caad_005_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationMessageType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationMessageType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BATR"/>
 *     <enumeration value="CAMI"/>
 *     <enumeration value="CAMR"/>
 *     <enumeration value="CGBI"/>
 *     <enumeration value="CGBR"/>
 *     <enumeration value="EROR"/>
 *     <enumeration value="FECI"/>
 *     <enumeration value="FECR"/>
 *     <enumeration value="FIAI"/>
 *     <enumeration value="FIAR"/>
 *     <enumeration value="FINR"/>
 *     <enumeration value="FINI"/>
 *     <enumeration value="FRDI"/>
 *     <enumeration value="FRDR"/>
 *     <enumeration value="FRRI"/>
 *     <enumeration value="FRRR"/>
 *     <enumeration value="INQI"/>
 *     <enumeration value="INQR"/>
 *     <enumeration value="KYEI"/>
 *     <enumeration value="KYER"/>
 *     <enumeration value="NWMI"/>
 *     <enumeration value="NWMR"/>
 *     <enumeration value="RECI"/>
 *     <enumeration value="RECR"/>
 *     <enumeration value="RTFI"/>
 *     <enumeration value="RTFR"/>
 *     <enumeration value="RTRI"/>
 *     <enumeration value="REVI"/>
 *     <enumeration value="REVR"/>
 *     <enumeration value="SERI"/>
 *     <enumeration value="SERR"/>
 *     <enumeration value="VERI"/>
 *     <enumeration value="VERR"/>
 *     <enumeration value="AMDT"/>
 *     <enumeration value="ATHI"/>
 *     <enumeration value="ATHR"/>
 *     <enumeration value="BAMI"/>
 *     <enumeration value="BAMR"/>
 *     <enumeration value="BATI"/>
 *     <enumeration value="ADDI"/>
 *     <enumeration value="ADDR"/>
 *     <enumeration value="RTVI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationMessageType2Code")
@XmlEnum
public enum ReconciliationMessageType2Code {

    BATR,
    CAMI,
    CAMR,
    CGBI,
    CGBR,
    EROR,
    FECI,
    FECR,
    FIAI,
    FIAR,
    FINR,
    FINI,
    FRDI,
    FRDR,
    FRRI,
    FRRR,
    INQI,
    INQR,
    KYEI,
    KYER,
    NWMI,
    NWMR,
    RECI,
    RECR,
    RTFI,
    RTFR,
    RTRI,
    REVI,
    REVR,
    SERI,
    SERR,
    VERI,
    VERR,
    AMDT,
    ATHI,
    ATHR,
    BAMI,
    BAMR,
    BATI,
    ADDI,
    ADDR,
    RTVI;

    public String value() {
        return name();
    }

    public static ReconciliationMessageType2Code fromValue(String v) {
        return valueOf(v);
    }

}
