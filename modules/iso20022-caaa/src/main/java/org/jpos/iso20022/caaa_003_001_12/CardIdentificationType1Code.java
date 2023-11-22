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

package org.jpos.iso20022.caaa_003_001_12;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardIdentificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardIdentificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCT"/>
 *     <enumeration value="BARC"/>
 *     <enumeration value="ISO2"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="CPAN"/>
 *     <enumeration value="PRIV"/>
 *     <enumeration value="UUID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardIdentificationType1Code")
@XmlEnum
public enum CardIdentificationType1Code {

    ACCT("ACCT"),
    BARC("BARC"),
    @XmlEnumValue("ISO2")
    ISO_2("ISO2"),
    PHON("PHON"),
    CPAN("CPAN"),
    PRIV("PRIV"),
    UUID("UUID");
    private final String value;

    CardIdentificationType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardIdentificationType1Code fromValue(String v) {
        for (CardIdentificationType1Code c: CardIdentificationType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
