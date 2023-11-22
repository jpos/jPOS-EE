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

package org.jpos.iso20022.semt_021_002_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstructionProcessingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAN1"/>
 *     <enumeration value="CAN2"/>
 *     <enumeration value="CAN3"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="CANO"/>
 *     <enumeration value="CANP"/>
 *     <enumeration value="CGEN"/>
 *     <enumeration value="COSE"/>
 *     <enumeration value="CPRC"/>
 *     <enumeration value="DFLA"/>
 *     <enumeration value="DONE"/>
 *     <enumeration value="DONF"/>
 *     <enumeration value="EXCH"/>
 *     <enumeration value="EXSE"/>
 *     <enumeration value="FORC"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="NOTC"/>
 *     <enumeration value="OPOD"/>
 *     <enumeration value="OVER"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="PAFI"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PPRC"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="REPR"/>
 *     <enumeration value="SESE"/>
 *     <enumeration value="STIN"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="TREA"/>
 *     <enumeration value="UNDE"/>
 *     <enumeration value="MPRC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstructionProcessingStatus1Code")
@XmlEnum
public enum InstructionProcessingStatus1Code {

    @XmlEnumValue("CAN1")
    CAN_1("CAN1"),
    @XmlEnumValue("CAN2")
    CAN_2("CAN2"),
    @XmlEnumValue("CAN3")
    CAN_3("CAN3"),
    CAND("CAND"),
    CANO("CANO"),
    CANP("CANP"),
    CGEN("CGEN"),
    COSE("COSE"),
    CPRC("CPRC"),
    DFLA("DFLA"),
    DONE("DONE"),
    DONF("DONF"),
    EXCH("EXCH"),
    EXSE("EXSE"),
    FORC("FORC"),
    FUTU("FUTU"),
    INTE("INTE"),
    NOTC("NOTC"),
    OPOD("OPOD"),
    OVER("OVER"),
    PACK("PACK"),
    PAFI("PAFI"),
    PART("PART"),
    PPRC("PPRC"),
    REJT("REJT"),
    REPR("REPR"),
    SESE("SESE"),
    STIN("STIN"),
    SUSP("SUSP"),
    TREA("TREA"),
    UNDE("UNDE"),
    MPRC("MPRC");
    private final String value;

    InstructionProcessingStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstructionProcessingStatus1Code fromValue(String v) {
        for (InstructionProcessingStatus1Code c: InstructionProcessingStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
