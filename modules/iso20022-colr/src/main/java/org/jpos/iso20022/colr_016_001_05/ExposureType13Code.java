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

package org.jpos.iso20022.colr_016_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureType13Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExposureType13Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CCIR"/>
 *     <enumeration value="CRPR"/>
 *     <enumeration value="EQUI"/>
 *     <enumeration value="EQPT"/>
 *     <enumeration value="EQUS"/>
 *     <enumeration value="EXTD"/>
 *     <enumeration value="EXPT"/>
 *     <enumeration value="FIXI"/>
 *     <enumeration value="FORX"/>
 *     <enumeration value="FORW"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="LIQU"/>
 *     <enumeration value="MGLD"/>
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
 *     <enumeration value="ESCL"/>
 *     <enumeration value="SWPT"/>
 *     <enumeration value="TBAS"/>
 *     <enumeration value="ECRT"/>
 *     <enumeration value="ECFR"/>
 *     <enumeration value="EMLO"/>
 *     <enumeration value="EMLI"/>
 *     <enumeration value="EOIM"/>
 *     <enumeration value="EOMI"/>
 *     <enumeration value="TRBD"/>
 *     <enumeration value="BFWD"/>
 *     <enumeration value="PAYM"/>
 *     <enumeration value="CCPC"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="CRTL"/>
 *     <enumeration value="CRSP"/>
 *     <enumeration value="EOMO"/>
 *     <enumeration value="CBCO"/>
 *     <enumeration value="TRCP"/>
 *     <enumeration value="UDMS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExposureType13Code")
@XmlEnum
public enum ExposureType13Code {

    CCIR,
    CRPR,
    EQUI,
    EQPT,
    EQUS,
    EXTD,
    EXPT,
    FIXI,
    FORX,
    FORW,
    FUTR,
    OPTN,
    LIQU,
    MGLD,
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
    ESCL,
    SWPT,
    TBAS,
    ECRT,
    ECFR,
    EMLO,
    EMLI,
    EOIM,
    EOMI,
    TRBD,
    BFWD,
    PAYM,
    CCPC,
    COMM,
    CRDS,
    CRTL,
    CRSP,
    EOMO,
    CBCO,
    TRCP,
    UDMS;

    public String value() {
        return name();
    }

    public static ExposureType13Code fromValue(String v) {
        return valueOf(v);
    }

}
