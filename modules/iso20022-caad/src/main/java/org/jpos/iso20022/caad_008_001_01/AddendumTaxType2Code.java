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

package org.jpos.iso20022.caad_008_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddendumTaxType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AddendumTaxType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TOTL"/>
 *     <enumeration value="ALMI"/>
 *     <enumeration value="ASNT"/>
 *     <enumeration value="BPTX"/>
 *     <enumeration value="KAPA"/>
 *     <enumeration value="NKAP"/>
 *     <enumeration value="CRTX"/>
 *     <enumeration value="CSTX"/>
 *     <enumeration value="CITX"/>
 *     <enumeration value="COAX"/>
 *     <enumeration value="CPST"/>
 *     <enumeration value="CORT"/>
 *     <enumeration value="COTX"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="DLTX"/>
 *     <enumeration value="DUTY"/>
 *     <enumeration value="EMIT"/>
 *     <enumeration value="EMUT"/>
 *     <enumeration value="EMET"/>
 *     <enumeration value="EMST"/>
 *     <enumeration value="EMRT"/>
 *     <enumeration value="ENTX"/>
 *     <enumeration value="ESET"/>
 *     <enumeration value="ENVT"/>
 *     <enumeration value="EQUL"/>
 *     <enumeration value="EQTX"/>
 *     <enumeration value="EUTR"/>
 *     <enumeration value="EXEC"/>
 *     <enumeration value="FEXT"/>
 *     <enumeration value="FNST"/>
 *     <enumeration value="FETX"/>
 *     <enumeration value="FVAT"/>
 *     <enumeration value="FVTS"/>
 *     <enumeration value="FIMT"/>
 *     <enumeration value="FSST"/>
 *     <enumeration value="FICA"/>
 *     <enumeration value="FRTX"/>
 *     <enumeration value="FSTX"/>
 *     <enumeration value="FSFT"/>
 *     <enumeration value="FUVT"/>
 *     <enumeration value="GIFT"/>
 *     <enumeration value="GCAT"/>
 *     <enumeration value="GRTX"/>
 *     <enumeration value="HVAT"/>
 *     <enumeration value="HATX"/>
 *     <enumeration value="HSTX"/>
 *     <enumeration value="HWTX"/>
 *     <enumeration value="INHT"/>
 *     <enumeration value="INPO"/>
 *     <enumeration value="LTTX"/>
 *     <enumeration value="FLST"/>
 *     <enumeration value="LITX"/>
 *     <enumeration value="LOCO"/>
 *     <enumeration value="LSTX"/>
 *     <enumeration value="LOCL"/>
 *     <enumeration value="LUTX"/>
 *     <enumeration value="MATX"/>
 *     <enumeration value="METX"/>
 *     <enumeration value="MITX"/>
 *     <enumeration value="MUTX"/>
 *     <enumeration value="MUDE"/>
 *     <enumeration value="COUN"/>
 *     <enumeration value="NATI"/>
 *     <enumeration value="OCTX"/>
 *     <enumeration value="OPTX"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OTTX"/>
 *     <enumeration value="LEVY"/>
 *     <enumeration value="POTX"/>
 *     <enumeration value="PRTX"/>
 *     <enumeration value="PSTX"/>
 *     <enumeration value="PPTX"/>
 *     <enumeration value="PROV"/>
 *     <enumeration value="PHET"/>
 *     <enumeration value="QUST"/>
 *     <enumeration value="ROCI"/>
 *     <enumeration value="RCSB"/>
 *     <enumeration value="RCSD"/>
 *     <enumeration value="ROTX"/>
 *     <enumeration value="RVAT"/>
 *     <enumeration value="ROVI"/>
 *     <enumeration value="SAUT"/>
 *     <enumeration value="SCTX"/>
 *     <enumeration value="SPTX"/>
 *     <enumeration value="STTA"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="SLST"/>
 *     <enumeration value="SLTX"/>
 *     <enumeration value="SETX"/>
 *     <enumeration value="STPT"/>
 *     <enumeration value="SPTS"/>
 *     <enumeration value="SPFT"/>
 *     <enumeration value="SPTG"/>
 *     <enumeration value="SRTX"/>
 *     <enumeration value="SSTX"/>
 *     <enumeration value="STAT"/>
 *     <enumeration value="STSL"/>
 *     <enumeration value="STEX"/>
 *     <enumeration value="SUTX"/>
 *     <enumeration value="CTAX"/>
 *     <enumeration value="TDDT"/>
 *     <enumeration value="TELT"/>
 *     <enumeration value="THTX"/>
 *     <enumeration value="TRAX"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="UNSP"/>
 *     <enumeration value="UUTX"/>
 *     <enumeration value="VATA"/>
 *     <enumeration value="VATB"/>
 *     <enumeration value="WTAX"/>
 *     <enumeration value="WESV"/>
 *     <enumeration value="WITF"/>
 *     <enumeration value="WITL"/>
 *     <enumeration value="WITH"/>
 *     <enumeration value="TNRT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AddendumTaxType2Code")
@XmlEnum
public enum AddendumTaxType2Code {

    TOTL,
    ALMI,
    ASNT,
    BPTX,
    KAPA,
    NKAP,
    CRTX,
    CSTX,
    CITX,
    COAX,
    CPST,
    CORT,
    COTX,
    CUST,
    DLTX,
    DUTY,
    EMIT,
    EMUT,
    EMET,
    EMST,
    EMRT,
    ENTX,
    ESET,
    ENVT,
    EQUL,
    EQTX,
    EUTR,
    EXEC,
    FEXT,
    FNST,
    FETX,
    FVAT,
    FVTS,
    FIMT,
    FSST,
    FICA,
    FRTX,
    FSTX,
    FSFT,
    FUVT,
    GIFT,
    GCAT,
    GRTX,
    HVAT,
    HATX,
    HSTX,
    HWTX,
    INHT,
    INPO,
    LTTX,
    FLST,
    LITX,
    LOCO,
    LSTX,
    LOCL,
    LUTX,
    MATX,
    METX,
    MITX,
    MUTX,
    MUDE,
    COUN,
    NATI,
    OCTX,
    OPTX,
    OTHR,
    OTHN,
    OTHP,
    OTTX,
    LEVY,
    POTX,
    PRTX,
    PSTX,
    PPTX,
    PROV,
    PHET,
    QUST,
    ROCI,
    RCSB,
    RCSD,
    ROTX,
    RVAT,
    ROVI,
    SAUT,
    SCTX,
    SPTX,
    STTA,
    STAM,
    SLST,
    SLTX,
    SETX,
    STPT,
    SPTS,
    SPFT,
    SPTG,
    SRTX,
    SSTX,
    STAT,
    STSL,
    STEX,
    SUTX,
    CTAX,
    TDDT,
    TELT,
    THTX,
    TRAX,
    TRAN,
    UNSP,
    UUTX,
    VATA,
    VATB,
    WTAX,
    WESV,
    WITF,
    WITL,
    WITH,
    TNRT;

    public String value() {
        return name();
    }

    public static AddendumTaxType2Code fromValue(String v) {
        return valueOf(v);
    }

}
