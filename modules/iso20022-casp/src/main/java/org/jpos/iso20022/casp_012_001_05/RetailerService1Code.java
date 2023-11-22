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

package org.jpos.iso20022.casp_012_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RetailerService1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCAQ"/>
 *     <enumeration value="ADAQ"/>
 *     <enumeration value="ADAP"/>
 *     <enumeration value="RPAP"/>
 *     <enumeration value="RPAQ"/>
 *     <enumeration value="RPTQ"/>
 *     <enumeration value="RPTP"/>
 *     <enumeration value="SMDQ"/>
 *     <enumeration value="SMDP"/>
 *     <enumeration value="SMIQ"/>
 *     <enumeration value="SMIP"/>
 *     <enumeration value="SMOQ"/>
 *     <enumeration value="SMOP"/>
 *     <enumeration value="DDYQ"/>
 *     <enumeration value="DDYP"/>
 *     <enumeration value="DCIQ"/>
 *     <enumeration value="DCIP"/>
 *     <enumeration value="DINO"/>
 *     <enumeration value="DINQ"/>
 *     <enumeration value="DINP"/>
 *     <enumeration value="DSOQ"/>
 *     <enumeration value="DSOP"/>
 *     <enumeration value="DCPQ"/>
 *     <enumeration value="DCPP"/>
 *     <enumeration value="DPRQ"/>
 *     <enumeration value="DPRP"/>
 *     <enumeration value="DSIQ"/>
 *     <enumeration value="DSIP"/>
 *     <enumeration value="DCAP"/>
 *     <enumeration value="DCOQ"/>
 *     <enumeration value="DCOP"/>
 *     <enumeration value="FSIQ"/>
 *     <enumeration value="FSIP"/>
 *     <enumeration value="FSBQ"/>
 *     <enumeration value="FSBP"/>
 *     <enumeration value="FSAQ"/>
 *     <enumeration value="FSAP"/>
 *     <enumeration value="FSEQ"/>
 *     <enumeration value="FSEP"/>
 *     <enumeration value="FSLQ"/>
 *     <enumeration value="FSLP"/>
 *     <enumeration value="FSPQ"/>
 *     <enumeration value="FSPP"/>
 *     <enumeration value="FSCQ"/>
 *     <enumeration value="FSCP"/>
 *     <enumeration value="FSRQ"/>
 *     <enumeration value="FSRP"/>
 *     <enumeration value="FSVQ"/>
 *     <enumeration value="FSVP"/>
 *     <enumeration value="SSAB"/>
 *     <enumeration value="SSEN"/>
 *     <enumeration value="SSRR"/>
 *     <enumeration value="SSSQ"/>
 *     <enumeration value="SSSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RetailerService1Code")
@XmlEnum
public enum RetailerService1Code {

    DCAQ,
    ADAQ,
    ADAP,
    RPAP,
    RPAQ,
    RPTQ,
    RPTP,
    SMDQ,
    SMDP,
    SMIQ,
    SMIP,
    SMOQ,
    SMOP,
    DDYQ,
    DDYP,
    DCIQ,
    DCIP,
    DINO,
    DINQ,
    DINP,
    DSOQ,
    DSOP,
    DCPQ,
    DCPP,
    DPRQ,
    DPRP,
    DSIQ,
    DSIP,
    DCAP,
    DCOQ,
    DCOP,
    FSIQ,
    FSIP,
    FSBQ,
    FSBP,
    FSAQ,
    FSAP,
    FSEQ,
    FSEP,
    FSLQ,
    FSLP,
    FSPQ,
    FSPP,
    FSCQ,
    FSCP,
    FSRQ,
    FSRP,
    FSVQ,
    FSVP,
    SSAB,
    SSEN,
    SSRR,
    SSSQ,
    SSSP;

    public String value() {
        return name();
    }

    public static RetailerService1Code fromValue(String v) {
        return valueOf(v);
    }

}
