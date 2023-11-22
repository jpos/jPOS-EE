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

package org.jpos.iso20022.auth_045_001_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonEquitySubClassSegmentationCriteria1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NonEquitySubClassSegmentationCriteria1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASCL"/>
 *     <enumeration value="BSPD"/>
 *     <enumeration value="CNC1"/>
 *     <enumeration value="CNC2"/>
 *     <enumeration value="NCCO"/>
 *     <enumeration value="CTYP"/>
 *     <enumeration value="NCCR"/>
 *     <enumeration value="DCSL"/>
 *     <enumeration value="DTYP"/>
 *     <enumeration value="EQUT"/>
 *     <enumeration value="FNC1"/>
 *     <enumeration value="FNC2"/>
 *     <enumeration value="FSPD"/>
 *     <enumeration value="IIND"/>
 *     <enumeration value="IRTC"/>
 *     <enumeration value="INC1"/>
 *     <enumeration value="INC2"/>
 *     <enumeration value="ISIN"/>
 *     <enumeration value="TTMO"/>
 *     <enumeration value="PRMT"/>
 *     <enumeration value="SSRF"/>
 *     <enumeration value="ISPT"/>
 *     <enumeration value="SRTC"/>
 *     <enumeration value="SACL"/>
 *     <enumeration value="SBPD"/>
 *     <enumeration value="TTMS"/>
 *     <enumeration value="NCSW"/>
 *     <enumeration value="TTMB"/>
 *     <enumeration value="IOUB"/>
 *     <enumeration value="TOUB"/>
 *     <enumeration value="UISC"/>
 *     <enumeration value="UIDX"/>
 *     <enumeration value="UINS"/>
 *     <enumeration value="UIRT"/>
 *     <enumeration value="REOU"/>
 *     <enumeration value="UTYP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonEquitySubClassSegmentationCriteria1Code")
@XmlEnum
public enum NonEquitySubClassSegmentationCriteria1Code {

    ASCL("ASCL"),
    BSPD("BSPD"),
    @XmlEnumValue("CNC1")
    CNC_1("CNC1"),
    @XmlEnumValue("CNC2")
    CNC_2("CNC2"),
    NCCO("NCCO"),
    CTYP("CTYP"),
    NCCR("NCCR"),
    DCSL("DCSL"),
    DTYP("DTYP"),
    EQUT("EQUT"),
    @XmlEnumValue("FNC1")
    FNC_1("FNC1"),
    @XmlEnumValue("FNC2")
    FNC_2("FNC2"),
    FSPD("FSPD"),
    IIND("IIND"),
    IRTC("IRTC"),
    @XmlEnumValue("INC1")
    INC_1("INC1"),
    @XmlEnumValue("INC2")
    INC_2("INC2"),
    ISIN("ISIN"),
    TTMO("TTMO"),
    PRMT("PRMT"),
    SSRF("SSRF"),
    ISPT("ISPT"),
    SRTC("SRTC"),
    SACL("SACL"),
    SBPD("SBPD"),
    TTMS("TTMS"),
    NCSW("NCSW"),
    TTMB("TTMB"),
    IOUB("IOUB"),
    TOUB("TOUB"),
    UISC("UISC"),
    UIDX("UIDX"),
    UINS("UINS"),
    UIRT("UIRT"),
    REOU("REOU"),
    UTYP("UTYP");
    private final String value;

    NonEquitySubClassSegmentationCriteria1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonEquitySubClassSegmentationCriteria1Code fromValue(String v) {
        for (NonEquitySubClassSegmentationCriteria1Code c: NonEquitySubClassSegmentationCriteria1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
