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

package org.jpos.iso20022.sese_011_001_09;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingSettlementStatusReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PendingSettlementStatusReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AWSH"/>
 *     <enumeration value="BLOC"/>
 *     <enumeration value="CAIS"/>
 *     <enumeration value="CLAC"/>
 *     <enumeration value="DOCC"/>
 *     <enumeration value="DOCY"/>
 *     <enumeration value="IAAD"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="PHCK"/>
 *     <enumeration value="PHSE"/>
 *     <enumeration value="SBLO"/>
 *     <enumeration value="MINF"/>
 *     <enumeration value="ACOP"/>
 *     <enumeration value="IINV"/>
 *     <enumeration value="CINV"/>
 *     <enumeration value="AINV"/>
 *     <enumeration value="WTRF"/>
 *     <enumeration value="USUA"/>
 *     <enumeration value="ASTA"/>
 *     <enumeration value="AFST"/>
 *     <enumeration value="STST"/>
 *     <enumeration value="LPRO"/>
 *     <enumeration value="ADRQ"/>
 *     <enumeration value="ADS1"/>
 *     <enumeration value="ADS2"/>
 *     <enumeration value="DRJC"/>
 *     <enumeration value="CYIN"/>
 *     <enumeration value="CYDV"/>
 *     <enumeration value="OVER"/>
 *     <enumeration value="WCPA"/>
 *     <enumeration value="SDUT"/>
 *     <enumeration value="TAPR"/>
 *     <enumeration value="XCNF"/>
 *     <enumeration value="ESCA"/>
 *     <enumeration value="NRCP"/>
 *     <enumeration value="FVER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PendingSettlementStatusReason2Code")
@XmlEnum
public enum PendingSettlementStatusReason2Code {

    AWSH("AWSH"),
    BLOC("BLOC"),
    CAIS("CAIS"),
    CLAC("CLAC"),
    DOCC("DOCC"),
    DOCY("DOCY"),
    IAAD("IAAD"),
    LACK("LACK"),
    LINK("LINK"),
    PHCK("PHCK"),
    PHSE("PHSE"),
    SBLO("SBLO"),
    MINF("MINF"),
    ACOP("ACOP"),
    IINV("IINV"),
    CINV("CINV"),
    AINV("AINV"),
    WTRF("WTRF"),
    USUA("USUA"),
    ASTA("ASTA"),
    AFST("AFST"),
    STST("STST"),
    LPRO("LPRO"),
    ADRQ("ADRQ"),
    @XmlEnumValue("ADS1")
    ADS_1("ADS1"),
    @XmlEnumValue("ADS2")
    ADS_2("ADS2"),
    DRJC("DRJC"),
    CYIN("CYIN"),
    CYDV("CYDV"),
    OVER("OVER"),
    WCPA("WCPA"),
    SDUT("SDUT"),
    TAPR("TAPR"),
    XCNF("XCNF"),
    ESCA("ESCA"),
    NRCP("NRCP"),
    FVER("FVER");
    private final String value;

    PendingSettlementStatusReason2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PendingSettlementStatusReason2Code fromValue(String v) {
        for (PendingSettlementStatusReason2Code c: PendingSettlementStatusReason2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
