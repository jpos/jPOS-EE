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

package org.jpos.iso20022.fxtr_031_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PartyIdentificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FXID"/>
 *     <enumeration value="FXSN"/>
 *     <enumeration value="INGN"/>
 *     <enumeration value="IICS"/>
 *     <enumeration value="IGBT"/>
 *     <enumeration value="MAMA"/>
 *     <enumeration value="MEOC"/>
 *     <enumeration value="METY"/>
 *     <enumeration value="NOMM"/>
 *     <enumeration value="OSCO"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="PONU"/>
 *     <enumeration value="POAD"/>
 *     <enumeration value="RMID"/>
 *     <enumeration value="SLCN"/>
 *     <enumeration value="SLNF"/>
 *     <enumeration value="TACN"/>
 *     <enumeration value="TRCO"/>
 *     <enumeration value="TANA"/>
 *     <enumeration value="USIT"/>
 *     <enumeration value="USNA"/>
 *     <enumeration value="AUIT"/>
 *     <enumeration value="BRID"/>
 *     <enumeration value="CLIN"/>
 *     <enumeration value="CMID"/>
 *     <enumeration value="COIN"/>
 *     <enumeration value="CMOT"/>
 *     <enumeration value="CONU"/>
 *     <enumeration value="CMIN"/>
 *     <enumeration value="DECN"/>
 *     <enumeration value="DEPA"/>
 *     <enumeration value="ELCO"/>
 *     <enumeration value="EXVE"/>
 *     <enumeration value="FICO"/>
 *     <enumeration value="FIID"/>
 *     <enumeration value="FLCN"/>
 *     <enumeration value="FLNF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PartyIdentificationType1Code")
@XmlEnum
public enum PartyIdentificationType1Code {

    FXID,
    FXSN,
    INGN,
    IICS,
    IGBT,
    MAMA,
    MEOC,
    METY,
    NOMM,
    OSCO,
    PASS,
    PONU,
    POAD,
    RMID,
    SLCN,
    SLNF,
    TACN,
    TRCO,
    TANA,
    USIT,
    USNA,
    AUIT,
    BRID,
    CLIN,
    CMID,
    COIN,
    CMOT,
    CONU,
    CMIN,
    DECN,
    DEPA,
    ELCO,
    EXVE,
    FICO,
    FIID,
    FLCN,
    FLNF;

    public String value() {
        return name();
    }

    public static PartyIdentificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
