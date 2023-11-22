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

package org.jpos.iso20022.fxtr_015_001_05;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FXAmountType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FXAmountType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ZWIS"/>
 *     <enumeration value="WITH"/>
 *     <enumeration value="VATA"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="TRAX"/>
 *     <enumeration value="STEX"/>
 *     <enumeration value="STAM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="COUN"/>
 *     <enumeration value="LOCL"/>
 *     <enumeration value="LOCO"/>
 *     <enumeration value="LYDT"/>
 *     <enumeration value="LOTE"/>
 *     <enumeration value="LIDT"/>
 *     <enumeration value="EXEC"/>
 *     <enumeration value="EUTR"/>
 *     <enumeration value="EQUL"/>
 *     <enumeration value="COAX"/>
 *     <enumeration value="AKTI"/>
 *     <enumeration value="ERFE"/>
 *     <enumeration value="ENTF"/>
 *     <enumeration value="MARG"/>
 *     <enumeration value="MACO"/>
 *     <enumeration value="ANTO"/>
 *     <enumeration value="CREB"/>
 *     <enumeration value="SPCN"/>
 *     <enumeration value="SUBS"/>
 *     <enumeration value="TOTL"/>
 *     <enumeration value="DEAL"/>
 *     <enumeration value="ACRU"/>
 *     <enumeration value="BAKL"/>
 *     <enumeration value="CHAR"/>
 *     <enumeration value="CBCH"/>
 *     <enumeration value="LADT"/>
 *     <enumeration value="DSCA"/>
 *     <enumeration value="HDGE"/>
 *     <enumeration value="ISDI"/>
 *     <enumeration value="LEVY"/>
 *     <enumeration value="OCMT"/>
 *     <enumeration value="PRMA"/>
 *     <enumeration value="OTMG"/>
 *     <enumeration value="REGF"/>
 *     <enumeration value="REMU"/>
 *     <enumeration value="RESU"/>
 *     <enumeration value="SAMG"/>
 *     <enumeration value="SETT"/>
 *     <enumeration value="SHIP"/>
 *     <enumeration value="ACCA"/>
 *     <enumeration value="PRDF"/>
 *     <enumeration value="REFD"/>
 *     <enumeration value="PRWI"/>
 *     <enumeration value="RSCH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FXAmountType1Code")
@XmlEnum
public enum FXAmountType1Code {

    ZWIS,
    WITH,
    VATA,
    TRAN,
    TRAX,
    STEX,
    STAM,
    OTHR,
    COUN,
    LOCL,
    LOCO,
    LYDT,
    LOTE,
    LIDT,
    EXEC,
    EUTR,
    EQUL,
    COAX,
    AKTI,
    ERFE,
    ENTF,
    MARG,
    MACO,
    ANTO,
    CREB,
    SPCN,
    SUBS,
    TOTL,
    DEAL,
    ACRU,
    BAKL,
    CHAR,
    CBCH,
    LADT,
    DSCA,
    HDGE,
    ISDI,
    LEVY,
    OCMT,
    PRMA,
    OTMG,
    REGF,
    REMU,
    RESU,
    SAMG,
    SETT,
    SHIP,
    ACCA,
    PRDF,
    REFD,
    PRWI,
    RSCH;

    public String value() {
        return name();
    }

    public static FXAmountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
