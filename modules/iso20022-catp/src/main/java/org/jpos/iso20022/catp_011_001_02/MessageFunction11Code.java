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

package org.jpos.iso20022.catp_011_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunction11Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MessageFunction11Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BALN"/>
 *     <enumeration value="CMPA"/>
 *     <enumeration value="CMPD"/>
 *     <enumeration value="ACMD"/>
 *     <enumeration value="DVCC"/>
 *     <enumeration value="DIAQ"/>
 *     <enumeration value="DIAP"/>
 *     <enumeration value="GSTS"/>
 *     <enumeration value="INQQ"/>
 *     <enumeration value="INQP"/>
 *     <enumeration value="KYAQ"/>
 *     <enumeration value="KYAP"/>
 *     <enumeration value="PINQ"/>
 *     <enumeration value="PINP"/>
 *     <enumeration value="RJAQ"/>
 *     <enumeration value="RJAP"/>
 *     <enumeration value="WITV"/>
 *     <enumeration value="WITK"/>
 *     <enumeration value="WITQ"/>
 *     <enumeration value="WITP"/>
 *     <enumeration value="INQC"/>
 *     <enumeration value="H2AP"/>
 *     <enumeration value="H2AQ"/>
 *     <enumeration value="TMOP"/>
 *     <enumeration value="CSEC"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="SKSC"/>
 *     <enumeration value="SSTS"/>
 *     <enumeration value="DPSK"/>
 *     <enumeration value="DPSV"/>
 *     <enumeration value="DPSQ"/>
 *     <enumeration value="DPSP"/>
 *     <enumeration value="EXPK"/>
 *     <enumeration value="EXPV"/>
 *     <enumeration value="TRFQ"/>
 *     <enumeration value="TRFP"/>
 *     <enumeration value="RPTC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageFunction11Code")
@XmlEnum
public enum MessageFunction11Code {

    BALN("BALN"),
    CMPA("CMPA"),
    CMPD("CMPD"),
    ACMD("ACMD"),
    DVCC("DVCC"),
    DIAQ("DIAQ"),
    DIAP("DIAP"),
    GSTS("GSTS"),
    INQQ("INQQ"),
    INQP("INQP"),
    KYAQ("KYAQ"),
    KYAP("KYAP"),
    PINQ("PINQ"),
    PINP("PINP"),
    RJAQ("RJAQ"),
    RJAP("RJAP"),
    WITV("WITV"),
    WITK("WITK"),
    WITQ("WITQ"),
    WITP("WITP"),
    INQC("INQC"),
    @XmlEnumValue("H2AP")
    H_2_AP("H2AP"),
    @XmlEnumValue("H2AQ")
    H_2_AQ("H2AQ"),
    TMOP("TMOP"),
    CSEC("CSEC"),
    DSEC("DSEC"),
    SKSC("SKSC"),
    SSTS("SSTS"),
    DPSK("DPSK"),
    DPSV("DPSV"),
    DPSQ("DPSQ"),
    DPSP("DPSP"),
    EXPK("EXPK"),
    EXPV("EXPV"),
    TRFQ("TRFQ"),
    TRFP("TRFP"),
    RPTC("RPTC");
    private final String value;

    MessageFunction11Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageFunction11Code fromValue(String v) {
        for (MessageFunction11Code c: MessageFunction11Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
