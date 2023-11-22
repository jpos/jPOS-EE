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

package org.jpos.iso20022.auth_029_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradePartyQueryCriteria7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradePartyQueryCriteria7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Oprtr" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}Operation3Code"/>
 *         <element name="RptgCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradePartyIdentificationQuery10Choice" minOccurs="0"/>
 *         <element name="OthrCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradePartyIdentificationQuery10Choice" minOccurs="0"/>
 *         <element name="Bnfcry" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradePartyIdentificationQuery10Choice" minOccurs="0"/>
 *         <element name="NttyRspnsblForRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradePartyIdentificationQuery11Choice" minOccurs="0"/>
 *         <element name="SubmitgAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradePartyIdentificationQuery11Choice" minOccurs="0"/>
 *         <element name="Brkr" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradePartyIdentificationQuery11Choice" minOccurs="0"/>
 *         <element name="CCP" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradePartyIdentificationQuery11Choice" minOccurs="0"/>
 *         <element name="ClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradePartyIdentificationQuery10Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyQueryCriteria7", propOrder = {
    "oprtr",
    "rptgCtrPty",
    "othrCtrPty",
    "bnfcry",
    "nttyRspnsblForRpt",
    "submitgAgt",
    "brkr",
    "ccp",
    "clrMmb"
})
public class TradePartyQueryCriteria7 {

    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operation3Code oprtr;
    @XmlElement(name = "RptgCtrPty")
    protected TradePartyIdentificationQuery10Choice rptgCtrPty;
    @XmlElement(name = "OthrCtrPty")
    protected TradePartyIdentificationQuery10Choice othrCtrPty;
    @XmlElement(name = "Bnfcry")
    protected TradePartyIdentificationQuery10Choice bnfcry;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected TradePartyIdentificationQuery11Choice nttyRspnsblForRpt;
    @XmlElement(name = "SubmitgAgt")
    protected TradePartyIdentificationQuery11Choice submitgAgt;
    @XmlElement(name = "Brkr")
    protected TradePartyIdentificationQuery11Choice brkr;
    @XmlElement(name = "CCP")
    protected TradePartyIdentificationQuery11Choice ccp;
    @XmlElement(name = "ClrMmb")
    protected TradePartyIdentificationQuery10Choice clrMmb;

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
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyIdentificationQuery10Choice getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public void setRptgCtrPty(TradePartyIdentificationQuery10Choice value) {
        this.rptgCtrPty = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyIdentificationQuery10Choice getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public void setOthrCtrPty(TradePartyIdentificationQuery10Choice value) {
        this.othrCtrPty = value;
    }

    /**
     * Gets the value of the bnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyIdentificationQuery10Choice getBnfcry() {
        return bnfcry;
    }

    /**
     * Sets the value of the bnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public void setBnfcry(TradePartyIdentificationQuery10Choice value) {
        this.bnfcry = value;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyIdentificationQuery11Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public void setNttyRspnsblForRpt(TradePartyIdentificationQuery11Choice value) {
        this.nttyRspnsblForRpt = value;
    }

    /**
     * Gets the value of the submitgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyIdentificationQuery11Choice getSubmitgAgt() {
        return submitgAgt;
    }

    /**
     * Sets the value of the submitgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public void setSubmitgAgt(TradePartyIdentificationQuery11Choice value) {
        this.submitgAgt = value;
    }

    /**
     * Gets the value of the brkr property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyIdentificationQuery11Choice getBrkr() {
        return brkr;
    }

    /**
     * Sets the value of the brkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public void setBrkr(TradePartyIdentificationQuery11Choice value) {
        this.brkr = value;
    }

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public TradePartyIdentificationQuery11Choice getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery11Choice }
     *     
     */
    public void setCCP(TradePartyIdentificationQuery11Choice value) {
        this.ccp = value;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public TradePartyIdentificationQuery10Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentificationQuery10Choice }
     *     
     */
    public void setClrMmb(TradePartyIdentificationQuery10Choice value) {
        this.clrMmb = value;
    }

}
