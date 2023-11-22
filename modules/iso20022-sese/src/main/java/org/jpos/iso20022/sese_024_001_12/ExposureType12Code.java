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
 * <p>Java class for ExposureType12Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExposureType12Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BFWD"/>
 *     <enumeration value="PAYM"/>
 *     <enumeration value="CCPC"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="CRTL"/>
 *     <enumeration value="CRSP"/>
 *     <enumeration value="CCIR"/>
 *     <enumeration value="CRPR"/>
 *     <enumeration value="EQPT"/>
 *     <enumeration value="EXTD"/>
 *     <enumeration value="EQUS"/>
 *     <enumeration value="EXPT"/>
 *     <enumeration value="FIXI"/>
 *     <enumeration value="FORX"/>
 *     <enumeration value="FORW"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="OTCD"/>
 *     <enumeration value="REPO"/>
 *     <enumeration value="RVPO"/>
 *     <enumeration value="SLOA"/>
 *     <enumeration value="SBSC"/>
 *     <enumeration value="SCRP"/>
 *     <enumeration value="SLEB"/>
 *     <enumeration value="SHSL"/>
 *     <enumeration value="SCIR"/>
 *     <enumeration value="SCIE"/>
 *     <enumeration value="SWPT"/>
 *     <enumeration value="TBAS"/>
 *     <enumeration value="UDMS"/>
 *     <enumeration value="TRCP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExposureType12Code")
@XmlEnum
public enum ExposureType12Code {

    BFWD,
    PAYM,
    CCPC,
    COMM,
    CRDS,
    CRTL,
    CRSP,
    CCIR,
    CRPR,
    EQPT,
    EXTD,
    EQUS,
    EXPT,
    FIXI,
    FORX,
    FORW,
    FUTR,
    OPTN,
    LIQU,
    OTCD,
    REPO,
    RVPO,
    SLOA,
    SBSC,
    SCRP,
    SLEB,
    SHSL,
    SCIR,
    SCIE,
    SWPT,
    TBAS,
    UDMS,
    TRCP;

    public String value() {
        return name();
    }

    public static ExposureType12Code fromValue(String v) {
        return valueOf(v);
    }

}
