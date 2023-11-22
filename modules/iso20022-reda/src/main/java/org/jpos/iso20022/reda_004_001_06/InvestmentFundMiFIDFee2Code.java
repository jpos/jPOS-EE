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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentFundMiFIDFee2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentFundMiFIDFee2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BORF"/>
 *     <enumeration value="DIS2"/>
 *     <enumeration value="FES3"/>
 *     <enumeration value="FEND"/>
 *     <enumeration value="FES2"/>
 *     <enumeration value="GOC1"/>
 *     <enumeration value="GOCS"/>
 *     <enumeration value="INCF"/>
 *     <enumeration value="INCS"/>
 *     <enumeration value="MNF1"/>
 *     <enumeration value="MANS"/>
 *     <enumeration value="NET2"/>
 *     <enumeration value="NESF"/>
 *     <enumeration value="NETO"/>
 *     <enumeration value="NRAM"/>
 *     <enumeration value="OOEA"/>
 *     <enumeration value="OOSF"/>
 *     <enumeration value="OOSS"/>
 *     <enumeration value="BENS"/>
 *     <enumeration value="ENAC"/>
 *     <enumeration value="ENFX"/>
 *     <enumeration value="EXAC"/>
 *     <enumeration value="ENBX"/>
 *     <enumeration value="BEND"/>
 *     <enumeration value="PENO"/>
 *     <enumeration value="OTES"/>
 *     <enumeration value="OCAS"/>
 *     <enumeration value="RPSS"/>
 *     <enumeration value="TRS1"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentFundMiFIDFee2Code")
@XmlEnum
public enum InvestmentFundMiFIDFee2Code {

    BORF("BORF"),
    @XmlEnumValue("DIS2")
    DIS_2("DIS2"),
    @XmlEnumValue("FES3")
    FES_3("FES3"),
    FEND("FEND"),
    @XmlEnumValue("FES2")
    FES_2("FES2"),
    @XmlEnumValue("GOC1")
    GOC_1("GOC1"),
    GOCS("GOCS"),
    INCF("INCF"),
    INCS("INCS"),
    @XmlEnumValue("MNF1")
    MNF_1("MNF1"),
    MANS("MANS"),
    @XmlEnumValue("NET2")
    NET_2("NET2"),
    NESF("NESF"),
    NETO("NETO"),
    NRAM("NRAM"),
    OOEA("OOEA"),
    OOSF("OOSF"),
    OOSS("OOSS"),
    BENS("BENS"),
    ENAC("ENAC"),
    ENFX("ENFX"),
    EXAC("EXAC"),
    ENBX("ENBX"),
    BEND("BEND"),
    PENO("PENO"),
    OTES("OTES"),
    OCAS("OCAS"),
    RPSS("RPSS"),
    @XmlEnumValue("TRS1")
    TRS_1("TRS1");
    private final String value;

    InvestmentFundMiFIDFee2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvestmentFundMiFIDFee2Code fromValue(String v) {
        for (InvestmentFundMiFIDFee2Code c: InvestmentFundMiFIDFee2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
