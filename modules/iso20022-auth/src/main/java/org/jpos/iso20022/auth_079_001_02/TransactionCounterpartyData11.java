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

package org.jpos.iso20022.auth_079_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionCounterpartyData11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionCounterpartyData11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bnfcry" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}PartyIdentification236Choice" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="Brkr" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="ClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="SttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}SettlementParties34Choice" minOccurs="0"/>
 *         <element name="AgtLndr" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCounterpartyData11", propOrder = {
    "bnfcry",
    "trptyAgt",
    "brkr",
    "clrMmb",
    "sttlmPties",
    "agtLndr"
})
public class TransactionCounterpartyData11 {

    @XmlElement(name = "Bnfcry")
    protected PartyIdentification236Choice bnfcry;
    @XmlElement(name = "TrptyAgt")
    protected OrganisationIdentification15Choice trptyAgt;
    @XmlElement(name = "Brkr")
    protected OrganisationIdentification15Choice brkr;
    @XmlElement(name = "ClrMmb")
    protected OrganisationIdentification15Choice clrMmb;
    @XmlElement(name = "SttlmPties")
    protected SettlementParties34Choice sttlmPties;
    @XmlElement(name = "AgtLndr")
    protected OrganisationIdentification15Choice agtLndr;

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public void setBnfcry(PartyIdentification236Choice value) {
        this.bnfcry = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setTrptyAgt(OrganisationIdentification15Choice value) {
        this.trptyAgt = value;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setBrkr(OrganisationIdentification15Choice value) {
        this.brkr = value;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setClrMmb(OrganisationIdentification15Choice value) {
        this.clrMmb = value;
    }

    /**
     * Gets the value of the sttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties34Choice }
     *     
     */
    public SettlementParties34Choice getSttlmPties() {
        return sttlmPties;
    }

    /**
     * Sets the value of the sttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties34Choice }
     *     
     */
    public void setSttlmPties(SettlementParties34Choice value) {
        this.sttlmPties = value;
    }

    /**
     * Gets the value of the agtLndr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getAgtLndr() {
        return agtLndr;
    }

    /**
     * Sets the value of the agtLndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setAgtLndr(OrganisationIdentification15Choice value) {
        this.agtLndr = value;
    }

}
