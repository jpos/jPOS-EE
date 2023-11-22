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

package org.jpos.iso20022.auth_094_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradePartyQueryCriteria5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradePartyQueryCriteria5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Oprtr" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}Operation3Code"/>
 *         <element name="RptgCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery8" minOccurs="0"/>
 *         <element name="RptgCtrPtyBrnch" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery9" minOccurs="0"/>
 *         <element name="OthrCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery8" minOccurs="0"/>
 *         <element name="OthrCtrPtyBrnch" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery9" minOccurs="0"/>
 *         <element name="Bnfcry" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery8" minOccurs="0"/>
 *         <element name="SubmitgAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery8" minOccurs="0"/>
 *         <element name="Brkr" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery8" minOccurs="0"/>
 *         <element name="CCP" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery8" minOccurs="0"/>
 *         <element name="AgtLndr" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery8" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyIdentificationQuery8" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyQueryCriteria5", propOrder = {
    "oprtr",
    "rptgCtrPty",
    "rptgCtrPtyBrnch",
    "othrCtrPty",
    "othrCtrPtyBrnch",
    "bnfcry",
    "submitgAgt",
    "brkr",
    "ccp",
    "agtLndr",
    "trptyAgt"
})
public class TradePartyQueryCriteria5 {

    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operation3Code oprtr;
    @XmlElement(name = "RptgCtrPty")
    protected TradePartyIdentificationQuery8 rptgCtrPty;
    @XmlElement(name = "RptgCtrPtyBrnch")
    protected TradePartyIdentificationQuery9 rptgCtrPtyBrnch;
    @XmlElement(name = "OthrCtrPty")
    protected TradePartyIdentificationQuery8 othrCtrPty;
    @XmlElement(name = "OthrCtrPtyBrnch")
    protected TradePartyIdentificationQuery9 othrCtrPtyBrnch;
    @XmlElement(name = "Bnfcry")
    protected TradePartyIdentificationQuery8 bnfcry;
    @XmlElement(name = "SubmitgAgt")
    protected TradePartyIdentificationQuery8 submitgAgt;
    @XmlElement(name = "Brkr")
    protected TradePartyIdentificationQuery8 brkr;
    @XmlElement(name = "CCP")
    protected TradePartyIdentificationQuery8 ccp;
    @XmlElement(name = "AgtLndr")
    protected TradePartyIdentificationQuery8 agtLndr;
    @XmlElement(name = "TrptyAgt")
    protected TradePartyIdentificationQuery8 trptyAgt;

    /**
     * Gets the value of the oprtr property.
     * 
     * @return
     *     possible object is
     *     {@link Operation3Code }
     *     
     */
    public Operation3Code getOprtr() {
        return oprtr;
    }

    /**
     * Sets the value of the oprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation3Code }
     *     
     */
    public void setOprtr(Operation3Code value) {
        this.oprtr = value;
    }

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public void setRptgCtrPty(TradePartyIdentificationQuery8 value) {
        this.rptgCtrPty = value;
    }

    /**
     * Gets the value of the rptgCtrPtyBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery9 }
     *     
     */
    public TradePartyIdentificationQuery9 getRptgCtrPtyBrnch() {
        return rptgCtrPtyBrnch;
    }

    /**
     * Sets the value of the rptgCtrPtyBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery9 }
     *     
     */
    public void setRptgCtrPtyBrnch(TradePartyIdentificationQuery9 value) {
        this.rptgCtrPtyBrnch = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public void setOthrCtrPty(TradePartyIdentificationQuery8 value) {
        this.othrCtrPty = value;
    }

    /**
     * Gets the value of the othrCtrPtyBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery9 }
     *     
     */
    public TradePartyIdentificationQuery9 getOthrCtrPtyBrnch() {
        return othrCtrPtyBrnch;
    }

    /**
     * Sets the value of the othrCtrPtyBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery9 }
     *     
     */
    public void setOthrCtrPtyBrnch(TradePartyIdentificationQuery9 value) {
        this.othrCtrPtyBrnch = value;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public void setBnfcry(TradePartyIdentificationQuery8 value) {
        this.bnfcry = value;
    }

    /**
     * Gets the value of the submitgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getSubmitgAgt() {
        return submitgAgt;
    }

    /**
     * Sets the value of the submitgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public void setSubmitgAgt(TradePartyIdentificationQuery8 value) {
        this.submitgAgt = value;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public void setBrkr(TradePartyIdentificationQuery8 value) {
        this.brkr = value;
    }

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public void setCCP(TradePartyIdentificationQuery8 value) {
        this.ccp = value;
    }

    /**
     * Gets the value of the agtLndr property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getAgtLndr() {
        return agtLndr;
    }

    /**
     * Sets the value of the agtLndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public void setAgtLndr(TradePartyIdentificationQuery8 value) {
        this.agtLndr = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public TradePartyIdentificationQuery8 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery8 }
     *     
     */
    public void setTrptyAgt(TradePartyIdentificationQuery8 value) {
        this.trptyAgt = value;
    }

}
