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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingFailingSettlement1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingFailingSettlement1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWMO"/>
 *     <enumeration value="AWSH"/>
 *     <enumeration value="LAAW"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="CLAT"/>
 *     <enumeration value="CERT"/>
 *     <enumeration value="MINO"/>
 *     <enumeration value="PHSE"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="DKNY"/>
 *     <enumeration value="STCD"/>
 *     <enumeration value="BENO"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LATE"/>
 *     <enumeration value="CANR"/>
 *     <enumeration value="MLAT"/>
 *     <enumeration value="OBJT"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="CHAS"/>
 *     <enumeration value="NEWI"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="CMON"/>
 *     <enumeration value="COLL"/>
 *     <enumeration value="DEPO"/>
 *     <enumeration value="FLIM"/>
 *     <enumeration value="NOFX"/>
 *     <enumeration value="INCA"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="BYIY"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="LALO"/>
 *     <enumeration value="MONY"/>
 *     <enumeration value="NCON"/>
 *     <enumeration value="YCOL"/>
 *     <enumeration value="REFS"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="CYCL"/>
 *     <enumeration value="BATC"/>
 *     <enumeration value="GUAD"/>
 *     <enumeration value="PREA"/>
 *     <enumeration value="GLOB"/>
 *     <enumeration value="CPEC"/>
 *     <enumeration value="MUNO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingFailingSettlement1Code")
@XmlEnum
public enum PendingFailingSettlement1Code {

    AWMO,
    AWSH,
    LAAW,
    DOCY,
    CLAT,
    CERT,
    MINO,
    PHSE,
    SBLO,
    DKNY,
    STCD,
    BENO,
    LACK,
    LATE,
    CANR,
    MLAT,
    OBJT,
    DOCC,
    BLOC,
    CHAS,
    NEWI,
    CLAC,
    PART,
    CMON,
    COLL,
    DEPO,
    FLIM,
    NOFX,
    INCA,
    LINK,
    BYIY,
    CAIS,
    LALO,
    MONY,
    NCON,
    YCOL,
    REFS,
    SDUT,
    CYCL,
    BATC,
    GUAD,
    PREA,
    GLOB,
    CPEC,
    MUNO;

    public String value() {
        return name();
    }

    public static PendingFailingSettlement1Code fromValue(String v) {
        return valueOf(v);
    }

}
