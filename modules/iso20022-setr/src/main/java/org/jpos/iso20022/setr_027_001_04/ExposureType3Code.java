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

package org.jpos.iso20022.setr_027_001_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExposureType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CCIR"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="CRPR"/>
 *     <enumeration value="CRSP"/>
 *     <enumeration value="CRTL"/>
 *     <enumeration value="EQPT"/>
 *     <enumeration value="EQUS"/>
 *     <enumeration value="EXPT"/>
 *     <enumeration value="EXTD"/>
 *     <enumeration value="FIXI"/>
 *     <enumeration value="FORW"/>
 *     <enumeration value="FORX"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="OTCD"/>
 *     <enumeration value="PAYM"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="SBSC"/>
 *     <enumeration value="SCIE"/>
 *     <enumeration value="SCIR"/>
 *     <enumeration value="SCRP"/>
 *     <enumeration value="SLEB"/>
 *     <enumeration value="SLOA"/>
 *     <enumeration value="SWPT"/>
 *     <enumeration value="TRCP"/>
 *     <enumeration value="BFWD"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="TBAS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExposureType3Code")
@XmlEnum
public enum ExposureType3Code {

    CCIR,
    COMM,
    CRDS,
    CRPR,
    CRSP,
    CRTL,
    EQPT,
    EQUS,
    EXPT,
    EXTD,
    FIXI,
    FORW,
    FORX,
    FUTR,
    LIQU,
    OPTN,
    OTCD,
    PAYM,
    REPO,
    SBSC,
    SCIE,
    SCIR,
    SCRP,
    SLEB,
    SLOA,
    SWPT,
    TRCP,
    BFWD,
    RVPO,
    TBAS;

    public String value() {
        return name();
    }

    public static ExposureType3Code fromValue(String v) {
        return valueOf(v);
    }

}
