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

package org.jpos.iso20022.semt_041_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceType14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SecuritiesBalanceType14Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWAS"/>
 *     <enumeration value="BTRA"/>
 *     <enumeration value="BLOK"/>
 *     <enumeration value="BLOV"/>
 *     <enumeration value="BLCA"/>
 *     <enumeration value="BLOT"/>
 *     <enumeration value="BORR"/>
 *     <enumeration value="OPNT"/>
 *     <enumeration value="PNET"/>
 *     <enumeration value="COLI"/>
 *     <enumeration value="COLO"/>
 *     <enumeration value="MARG"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="LOAN"/>
 *     <enumeration value="REGO"/>
 *     <enumeration value="BODE"/>
 *     <enumeration value="BORE"/>
 *     <enumeration value="PEDA"/>
 *     <enumeration value="PECA"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="LODE"/>
 *     <enumeration value="LORE"/>
 *     <enumeration value="PENR"/>
 *     <enumeration value="PLED"/>
 *     <enumeration value="RSTR"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="WDOC"/>
 *     <enumeration value="GRP1"/>
 *     <enumeration value="GRP2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SecuritiesBalanceType14Code")
@XmlEnum
public enum SecuritiesBalanceType14Code {

    AWAS("AWAS"),
    BTRA("BTRA"),
    BLOK("BLOK"),
    BLOV("BLOV"),
    BLCA("BLCA"),
    BLOT("BLOT"),
    BORR("BORR"),
    OPNT("OPNT"),
    PNET("PNET"),
    COLI("COLI"),
    COLO("COLO"),
    MARG("MARG"),
    DRAW("DRAW"),
    TRAN("TRAN"),
    LOAN("LOAN"),
    REGO("REGO"),
    BODE("BODE"),
    BORE("BORE"),
    PEDA("PEDA"),
    PECA("PECA"),
    PEND("PEND"),
    LODE("LODE"),
    LORE("LORE"),
    PENR("PENR"),
    PLED("PLED"),
    RSTR("RSTR"),
    OTHR("OTHR"),
    WDOC("WDOC"),
    @XmlEnumValue("GRP1")
    GRP_1("GRP1"),
    @XmlEnumValue("GRP2")
    GRP_2("GRP2");
    private final String value;

    SecuritiesBalanceType14Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecuritiesBalanceType14Code fromValue(String v) {
        for (SecuritiesBalanceType14Code c: SecuritiesBalanceType14Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
