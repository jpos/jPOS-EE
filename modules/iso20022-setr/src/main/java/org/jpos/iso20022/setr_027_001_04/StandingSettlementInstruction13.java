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

package org.jpos.iso20022.setr_027_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingSettlementInstruction13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingSettlementInstruction13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttlmStgInstrDB" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SettlementStandingInstructionDatabase4Choice"/>
 *         <element name="Vndr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PartyIdentification117Choice" minOccurs="0"/>
 *         <element name="OthrDlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SettlementParties59" minOccurs="0"/>
 *         <element name="OthrRcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}SettlementParties59" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingSettlementInstruction13", propOrder = {
    "sttlmStgInstrDB",
    "vndr",
    "othrDlvrgSttlmPties",
    "othrRcvgSttlmPties"
})
public class StandingSettlementInstruction13 {

    @XmlElement(name = "SttlmStgInstrDB", required = true)
    protected SettlementStandingInstructionDatabase4Choice sttlmStgInstrDB;
    @XmlElement(name = "Vndr")
    protected PartyIdentification117Choice vndr;
    @XmlElement(name = "OthrDlvrgSttlmPties")
    protected SettlementParties59 othrDlvrgSttlmPties;
    @XmlElement(name = "OthrRcvgSttlmPties")
    protected SettlementParties59 othrRcvgSttlmPties;

    /**
     * Gets the value of the sttlmStgInstrDB property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStandingInstructionDatabase4Choice }
     *     
     */
    public SettlementStandingInstructionDatabase4Choice getSttlmStgInstrDB() {
        return sttlmStgInstrDB;
    }

    /**
     * Sets the value of the sttlmStgInstrDB property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStandingInstructionDatabase4Choice }
     *     
     */
    public void setSttlmStgInstrDB(SettlementStandingInstructionDatabase4Choice value) {
        this.sttlmStgInstrDB = value;
    }

    /**
     * Gets the value of the vndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification117Choice }
     *     
     */
    public PartyIdentification117Choice getVndr() {
        return vndr;
    }

    /**
     * Sets the value of the vndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification117Choice }
     *     
     */
    public void setVndr(PartyIdentification117Choice value) {
        this.vndr = value;
    }

    /**
     * Gets the value of the othrDlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties59 }
     *     
     */
    public SettlementParties59 getOthrDlvrgSttlmPties() {
        return othrDlvrgSttlmPties;
    }

    /**
     * Sets the value of the othrDlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties59 }
     *     
     */
    public void setOthrDlvrgSttlmPties(SettlementParties59 value) {
        this.othrDlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the othrRcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties59 }
     *     
     */
    public SettlementParties59 getOthrRcvgSttlmPties() {
        return othrRcvgSttlmPties;
    }

    /**
     * Sets the value of the othrRcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties59 }
     *     
     */
    public void setOthrRcvgSttlmPties(SettlementParties59 value) {
        this.othrRcvgSttlmPties = value;
    }

}
