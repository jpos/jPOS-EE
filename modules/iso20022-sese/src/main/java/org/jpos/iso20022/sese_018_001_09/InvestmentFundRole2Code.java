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

package org.jpos.iso20022.sese_018_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundRole2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundRole2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FMCO"/>
 *     <enumeration value="REGI"/>
 *     <enumeration value="TRAG"/>
 *     <enumeration value="INTR"/>
 *     <enumeration value="DIST"/>
 *     <enumeration value="CONC"/>
 *     <enumeration value="UCL1"/>
 *     <enumeration value="UCL2"/>
 *     <enumeration value="TRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundRole2Code")
@XmlEnum
public enum InvestmentFundRole2Code {

    FMCO("FMCO"),
    REGI("REGI"),
    TRAG("TRAG"),
    INTR("INTR"),
    DIST("DIST"),
    CONC("CONC"),
    @XmlEnumValue("UCL1")
    UCL_1("UCL1"),
    @XmlEnumValue("UCL2")
    UCL_2("UCL2"),
    TRAN("TRAN");
    private final String value;

    InvestmentFundRole2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestmentFundRole2Code fromValue(String v) {
        for (InvestmentFundRole2Code c: InvestmentFundRole2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
