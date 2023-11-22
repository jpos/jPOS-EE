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

package org.jpos.iso20022.camt_004_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemBalanceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SystemBalanceType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPNG"/>
 *     <enumeration value="INTM"/>
 *     <enumeration value="CLSG"/>
 *     <enumeration value="BOOK"/>
 *     <enumeration value="CRRT"/>
 *     <enumeration value="PDNG"/>
 *     <enumeration value="LRLD"/>
 *     <enumeration value="AVLB"/>
 *     <enumeration value="LTSF"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="EAST"/>
 *     <enumeration value="PYMT"/>
 *     <enumeration value="BLCK"/>
 *     <enumeration value="XPCD"/>
 *     <enumeration value="DLOD"/>
 *     <enumeration value="XCRD"/>
 *     <enumeration value="XDBT"/>
 *     <enumeration value="ADJT"/>
 *     <enumeration value="PRAV"/>
 *     <enumeration value="DBIT"/>
 *     <enumeration value="THRE"/>
 *     <enumeration value="NOTE"/>
 *     <enumeration value="FSET"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="OTHB"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="FORC"/>
 *     <enumeration value="COLC"/>
 *     <enumeration value="FUND"/>
 *     <enumeration value="PIPO"/>
 *     <enumeration value="XCHG"/>
 *     <enumeration value="CCPS"/>
 *     <enumeration value="TOHB"/>
 *     <enumeration value="COHB"/>
 *     <enumeration value="DOHB"/>
 *     <enumeration value="TPBL"/>
 *     <enumeration value="CPBL"/>
 *     <enumeration value="DPBL"/>
 *     <enumeration value="FUTB"/>
 *     <enumeration value="REJB"/>
 *     <enumeration value="FCOL"/>
 *     <enumeration value="FCOU"/>
 *     <enumeration value="SCOL"/>
 *     <enumeration value="SCOU"/>
 *     <enumeration value="CUSA"/>
 *     <enumeration value="XCHC"/>
 *     <enumeration value="XCHN"/>
 *     <enumeration value="DSET"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="NSET"/>
 *     <enumeration value="OTCC"/>
 *     <enumeration value="OTCG"/>
 *     <enumeration value="OTCN"/>
 *     <enumeration value="SAPD"/>
 *     <enumeration value="SAPC"/>
 *     <enumeration value="REPD"/>
 *     <enumeration value="REPC"/>
 *     <enumeration value="BSCD"/>
 *     <enumeration value="BSCC"/>
 *     <enumeration value="SAPP"/>
 *     <enumeration value="IRLT"/>
 *     <enumeration value="IRDR"/>
 *     <enumeration value="DWRD"/>
 *     <enumeration value="ADWR"/>
 *     <enumeration value="AIDR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SystemBalanceType2Code")
@XmlEnum
public enum SystemBalanceType2Code {

    OPNG,
    INTM,
    CLSG,
    BOOK,
    CRRT,
    PDNG,
    LRLD,
    AVLB,
    LTSF,
    CRDT,
    EAST,
    PYMT,
    BLCK,
    XPCD,
    DLOD,
    XCRD,
    XDBT,
    ADJT,
    PRAV,
    DBIT,
    THRE,
    NOTE,
    FSET,
    BLOC,
    OTHB,
    CUST,
    FORC,
    COLC,
    FUND,
    PIPO,
    XCHG,
    CCPS,
    TOHB,
    COHB,
    DOHB,
    TPBL,
    CPBL,
    DPBL,
    FUTB,
    REJB,
    FCOL,
    FCOU,
    SCOL,
    SCOU,
    CUSA,
    XCHC,
    XCHN,
    DSET,
    LACK,
    NSET,
    OTCC,
    OTCG,
    OTCN,
    SAPD,
    SAPC,
    REPD,
    REPC,
    BSCD,
    BSCC,
    SAPP,
    IRLT,
    IRDR,
    DWRD,
    ADWR,
    AIDR;

    public String value() {
        return name();
    }

    public static SystemBalanceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
