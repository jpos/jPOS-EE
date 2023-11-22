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

package org.jpos.iso20022.auth_069_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure8Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UnitOfMeasure8Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="KILO"/>
 *     <enumeration value="KMET"/>
 *     <enumeration value="KWDC"/>
 *     <enumeration value="KWHO"/>
 *     <enumeration value="KWHC"/>
 *     <enumeration value="KMOC"/>
 *     <enumeration value="KWMC"/>
 *     <enumeration value="KWYC"/>
 *     <enumeration value="LITR"/>
 *     <enumeration value="MWDC"/>
 *     <enumeration value="MWHO"/>
 *     <enumeration value="MWHC"/>
 *     <enumeration value="MWMC"/>
 *     <enumeration value="MMOC"/>
 *     <enumeration value="MWYC"/>
 *     <enumeration value="METR"/>
 *     <enumeration value="TONE"/>
 *     <enumeration value="MILE"/>
 *     <enumeration value="MILI"/>
 *     <enumeration value="MMET"/>
 *     <enumeration value="MIBA"/>
 *     <enumeration value="MBTU"/>
 *     <enumeration value="PIEC"/>
 *     <enumeration value="PUND"/>
 *     <enumeration value="PWRD"/>
 *     <enumeration value="SHAS"/>
 *     <enumeration value="SCMT"/>
 *     <enumeration value="SQFO"/>
 *     <enumeration value="SQIN"/>
 *     <enumeration value="SQKI"/>
 *     <enumeration value="SMET"/>
 *     <enumeration value="SQMI"/>
 *     <enumeration value="SMIL"/>
 *     <enumeration value="SQYA"/>
 *     <enumeration value="THMS"/>
 *     <enumeration value="TONS"/>
 *     <enumeration value="TOCD"/>
 *     <enumeration value="OZTR"/>
 *     <enumeration value="USGA"/>
 *     <enumeration value="UCWT"/>
 *     <enumeration value="USOU"/>
 *     <enumeration value="USPI"/>
 *     <enumeration value="USQA"/>
 *     <enumeration value="YARD"/>
 *     <enumeration value="ACRE"/>
 *     <enumeration value="ALOW"/>
 *     <enumeration value="ACCY"/>
 *     <enumeration value="ARES"/>
 *     <enumeration value="BARL"/>
 *     <enumeration value="BCUF"/>
 *     <enumeration value="BDFT"/>
 *     <enumeration value="BUSL"/>
 *     <enumeration value="CELI"/>
 *     <enumeration value="CMET"/>
 *     <enumeration value="CEER"/>
 *     <enumeration value="CLRT"/>
 *     <enumeration value="CBME"/>
 *     <enumeration value="DAYS"/>
 *     <enumeration value="DGEU"/>
 *     <enumeration value="DMET"/>
 *     <enumeration value="ENVC"/>
 *     <enumeration value="ENVO"/>
 *     <enumeration value="FOOT"/>
 *     <enumeration value="GGEU"/>
 *     <enumeration value="GBGA"/>
 *     <enumeration value="GBOU"/>
 *     <enumeration value="GBPI"/>
 *     <enumeration value="GBQA"/>
 *     <enumeration value="GRAM"/>
 *     <enumeration value="HECT"/>
 *     <enumeration value="HUWG"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="IPNT"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="USTN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UnitOfMeasure8Code")
@XmlEnum
public enum UnitOfMeasure8Code {

    KILO,
    KMET,
    KWDC,
    KWHO,
    KWHC,
    KMOC,
    KWMC,
    KWYC,
    LITR,
    MWDC,
    MWHO,
    MWHC,
    MWMC,
    MMOC,
    MWYC,
    METR,
    TONE,
    MILE,
    MILI,
    MMET,
    MIBA,
    MBTU,
    PIEC,
    PUND,
    PWRD,
    SHAS,
    SCMT,
    SQFO,
    SQIN,
    SQKI,
    SMET,
    SQMI,
    SMIL,
    SQYA,
    THMS,
    TONS,
    TOCD,
    OZTR,
    USGA,
    UCWT,
    USOU,
    USPI,
    USQA,
    YARD,
    ACRE,
    ALOW,
    ACCY,
    ARES,
    BARL,
    BCUF,
    BDFT,
    BUSL,
    CELI,
    CMET,
    CEER,
    CLRT,
    CBME,
    DAYS,
    DGEU,
    DMET,
    ENVC,
    ENVO,
    FOOT,
    GGEU,
    GBGA,
    GBOU,
    GBPI,
    GBQA,
    GRAM,
    HECT,
    HUWG,
    INCH,
    IPNT,
    FUTU,
    USTN;

    public String value() {
        return name();
    }

    public static UnitOfMeasure8Code fromValue(String v) {
        return valueOf(v);
    }

}
