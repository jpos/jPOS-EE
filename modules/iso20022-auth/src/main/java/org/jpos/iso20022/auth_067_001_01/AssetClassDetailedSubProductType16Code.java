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

package org.jpos.iso20022.auth_067_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassDetailedSubProductType16Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetClassDetailedSubProductType16Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FXCR"/>
 *     <enumeration value="FXEM"/>
 *     <enumeration value="FXMJ"/>
 *     <enumeration value="FUEL"/>
 *     <enumeration value="FOIL"/>
 *     <enumeration value="GOIL"/>
 *     <enumeration value="GSLN"/>
 *     <enumeration value="GASP"/>
 *     <enumeration value="HEAT"/>
 *     <enumeration value="IRON"/>
 *     <enumeration value="JTFL"/>
 *     <enumeration value="KERO"/>
 *     <enumeration value="LAMP"/>
 *     <enumeration value="LEAD"/>
 *     <enumeration value="LLSO"/>
 *     <enumeration value="LNGG"/>
 *     <enumeration value="CORN"/>
 *     <enumeration value="MARS"/>
 *     <enumeration value="MWHT"/>
 *     <enumeration value="MOLY"/>
 *     <enumeration value="NAPH"/>
 *     <enumeration value="NBPG"/>
 *     <enumeration value="NASC"/>
 *     <enumeration value="NCGG"/>
 *     <enumeration value="NGLO"/>
 *     <enumeration value="NICK"/>
 *     <enumeration value="OFFP"/>
 *     <enumeration value="ALUM"/>
 *     <enumeration value="ALUA"/>
 *     <enumeration value="BAKK"/>
 *     <enumeration value="BSLD"/>
 *     <enumeration value="BDSL"/>
 *     <enumeration value="BRNT"/>
 *     <enumeration value="BRNX"/>
 *     <enumeration value="CNDA"/>
 *     <enumeration value="CERE"/>
 *     <enumeration value="CBLT"/>
 *     <enumeration value="CCOA"/>
 *     <enumeration value="COND"/>
 *     <enumeration value="CSHP"/>
 *     <enumeration value="COPR"/>
 *     <enumeration value="DSEL"/>
 *     <enumeration value="DBCR"/>
 *     <enumeration value="DUBA"/>
 *     <enumeration value="ERUE"/>
 *     <enumeration value="ESPO"/>
 *     <enumeration value="ETHA"/>
 *     <enumeration value="EUAE"/>
 *     <enumeration value="EUAA"/>
 *     <enumeration value="FWHT"/>
 *     <enumeration value="FITR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PLDM"/>
 *     <enumeration value="PKLD"/>
 *     <enumeration value="PTNM"/>
 *     <enumeration value="POTA"/>
 *     <enumeration value="RPSD"/>
 *     <enumeration value="BRWN"/>
 *     <enumeration value="RICE"/>
 *     <enumeration value="ROBU"/>
 *     <enumeration value="SLVR"/>
 *     <enumeration value="SOYB"/>
 *     <enumeration value="STEL"/>
 *     <enumeration value="TNKR"/>
 *     <enumeration value="TAPI"/>
 *     <enumeration value="TINN"/>
 *     <enumeration value="TTFG"/>
 *     <enumeration value="URAL"/>
 *     <enumeration value="WHSG"/>
 *     <enumeration value="WTIO"/>
 *     <enumeration value="ZINC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType16Code")
@XmlEnum
public enum AssetClassDetailedSubProductType16Code {

    FXCR,
    FXEM,
    FXMJ,
    FUEL,
    FOIL,
    GOIL,
    GSLN,
    GASP,
    HEAT,
    IRON,
    JTFL,
    KERO,
    LAMP,
    LEAD,
    LLSO,
    LNGG,
    CORN,
    MARS,
    MWHT,
    MOLY,
    NAPH,
    NBPG,
    NASC,
    NCGG,
    NGLO,
    NICK,
    OFFP,
    ALUM,
    ALUA,
    BAKK,
    BSLD,
    BDSL,
    BRNT,
    BRNX,
    CNDA,
    CERE,
    CBLT,
    CCOA,
    COND,
    CSHP,
    COPR,
    DSEL,
    DBCR,
    DUBA,
    ERUE,
    ESPO,
    ETHA,
    EUAE,
    EUAA,
    FWHT,
    FITR,
    OTHR,
    PLDM,
    PKLD,
    PTNM,
    POTA,
    RPSD,
    BRWN,
    RICE,
    ROBU,
    SLVR,
    SOYB,
    STEL,
    TNKR,
    TAPI,
    TINN,
    TTFG,
    URAL,
    WHSG,
    WTIO,
    ZINC;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType16Code fromValue(String v) {
        return valueOf(v);
    }

}
