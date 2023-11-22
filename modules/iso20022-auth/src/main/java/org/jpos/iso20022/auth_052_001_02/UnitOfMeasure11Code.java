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

package org.jpos.iso20022.auth_052_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnitOfMeasure11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALOW"/>
 *     <enumeration value="ACCY"/>
 *     <enumeration value="BARL"/>
 *     <enumeration value="BCUF"/>
 *     <enumeration value="BDFT"/>
 *     <enumeration value="BUSL"/>
 *     <enumeration value="CEER"/>
 *     <enumeration value="CLRT"/>
 *     <enumeration value="KILO"/>
 *     <enumeration value="PIEC"/>
 *     <enumeration value="TONS"/>
 *     <enumeration value="METR"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="YARD"/>
 *     <enumeration value="GBGA"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="CMET"/>
 *     <enumeration value="SMET"/>
 *     <enumeration value="FOOT"/>
 *     <enumeration value="MILE"/>
 *     <enumeration value="SQIN"/>
 *     <enumeration value="SQFO"/>
 *     <enumeration value="SQMI"/>
 *     <enumeration value="GBOU"/>
 *     <enumeration value="USOU"/>
 *     <enumeration value="GBPI"/>
 *     <enumeration value="USPI"/>
 *     <enumeration value="GBQA"/>
 *     <enumeration value="USGA"/>
 *     <enumeration value="MMET"/>
 *     <enumeration value="KMET"/>
 *     <enumeration value="SQYA"/>
 *     <enumeration value="ACRE"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="SMIL"/>
 *     <enumeration value="SCMT"/>
 *     <enumeration value="HECT"/>
 *     <enumeration value="SQKI"/>
 *     <enumeration value="MILI"/>
 *     <enumeration value="CELI"/>
 *     <enumeration value="LITR"/>
 *     <enumeration value="PUND"/>
 *     <enumeration value="CBME"/>
 *     <enumeration value="DAYS"/>
 *     <enumeration value="DMET"/>
 *     <enumeration value="ENVC"/>
 *     <enumeration value="ENVO"/>
 *     <enumeration value="HUWG"/>
 *     <enumeration value="KWDC"/>
 *     <enumeration value="KWHO"/>
 *     <enumeration value="KWHC"/>
 *     <enumeration value="KMOC"/>
 *     <enumeration value="KWMC"/>
 *     <enumeration value="KWYC"/>
 *     <enumeration value="MWDC"/>
 *     <enumeration value="MWHO"/>
 *     <enumeration value="MWHC"/>
 *     <enumeration value="MWMC"/>
 *     <enumeration value="MMOC"/>
 *     <enumeration value="MWYC"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="MIBA"/>
 *     <enumeration value="MBTU"/>
 *     <enumeration value="OZTR"/>
 *     <enumeration value="UCWT"/>
 *     <enumeration value="IPNT"/>
 *     <enumeration value="PWRD"/>
 *     <enumeration value="DGEU"/>
 *     <enumeration value="TOCD"/>
 *     <enumeration value="GGEU"/>
 *     <enumeration value="USQA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnitOfMeasure11Code")
@XmlEnum
public enum UnitOfMeasure11Code {

    ALOW,
    ACCY,
    BARL,
    BCUF,
    BDFT,
    BUSL,
    CEER,
    CLRT,
    KILO,
    PIEC,
    TONS,
    METR,
    INCH,
    YARD,
    GBGA,
    GRAM,
    CMET,
    SMET,
    FOOT,
    MILE,
    SQIN,
    SQFO,
    SQMI,
    GBOU,
    USOU,
    GBPI,
    USPI,
    GBQA,
    USGA,
    MMET,
    KMET,
    SQYA,
    ACRE,
    ARES,
    SMIL,
    SCMT,
    HECT,
    SQKI,
    MILI,
    CELI,
    LITR,
    PUND,
    CBME,
    DAYS,
    DMET,
    ENVC,
    ENVO,
    HUWG,
    KWDC,
    KWHO,
    KWHC,
    KMOC,
    KWMC,
    KWYC,
    MWDC,
    MWHO,
    MWHC,
    MWMC,
    MMOC,
    MWYC,
    TONE,
    MIBA,
    MBTU,
    OZTR,
    UCWT,
    IPNT,
    PWRD,
    DGEU,
    TOCD,
    GGEU,
    USQA;

    public String value() {
        return name();
    }

    public static UnitOfMeasure11Code fromValue(String v) {
        return valueOf(v);
    }

}
