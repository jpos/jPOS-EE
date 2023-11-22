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

package org.jpos.iso20022.sese_035_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingSettlementInstruction18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingSettlementInstruction18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttlmStgInstrDB" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}SettlementStandingInstructionDatabase4Choice"/>
 *         <element name="CtrPty" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}Counterparty15Choice"/>
 *         <element name="Vndr" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}PartyIdentification136" minOccurs="0"/>
 *         <element name="OthrDlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}SettlementParties100" minOccurs="0"/>
 *         <element name="OthrRcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.001.11}SettlementParties100" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingSettlementInstruction18", propOrder = {
    "sttlmStgInstrDB",
    "ctrPty",
    "vndr",
    "othrDlvrgSttlmPties",
    "othrRcvgSttlmPties"
})
public class StandingSettlementInstruction18 {

    @XmlElement(name = "SttlmStgInstrDB", required = true)
    protected SettlementStandingInstructionDatabase4Choice sttlmStgInstrDB;
    @XmlElement(name = "CtrPty", required = true)
    protected Counterparty15Choice ctrPty;
    @XmlElement(name = "Vndr")
    protected PartyIdentification136 vndr;
    @XmlElement(name = "OthrDlvrgSttlmPties")
    protected SettlementParties100 othrDlvrgSttlmPties;
    @XmlElement(name = "OthrRcvgSttlmPties")
    protected SettlementParties100 othrRcvgSttlmPties;

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
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty15Choice }
     *     
     */
    public Counterparty15Choice getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty15Choice }
     *     
     */
    public void setCtrPty(Counterparty15Choice value) {
        this.ctrPty = value;
    }

    /**
     * Gets the value of the vndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getVndr() {
        return vndr;
    }

    /**
     * Sets the value of the vndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setVndr(PartyIdentification136 value) {
        this.vndr = value;
    }

    /**
     * Gets the value of the othrDlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties100 }
     *     
     */
    public SettlementParties100 getOthrDlvrgSttlmPties() {
        return othrDlvrgSttlmPties;
    }

    /**
     * Sets the value of the othrDlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties100 }
     *     
     */
    public void setOthrDlvrgSttlmPties(SettlementParties100 value) {
        this.othrDlvrgSttlmPties = value;
    }

    /**
     * Gets the value of the othrRcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties100 }
     *     
     */
    public SettlementParties100 getOthrRcvgSttlmPties() {
        return othrRcvgSttlmPties;
    }

    /**
     * Sets the value of the othrRcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties100 }
     *     
     */
    public void setOthrRcvgSttlmPties(SettlementParties100 value) {
        this.othrRcvgSttlmPties = value;
    }

}
