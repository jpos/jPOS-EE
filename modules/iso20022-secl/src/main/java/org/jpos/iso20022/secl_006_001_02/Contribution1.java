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

package org.jpos.iso20022.secl_006_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contribution1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Contribution1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="ReqrdAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}ActiveCurrencyAndAmount"/>
 *         <element name="IncrCvrgAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NonClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.006.001.02}PartyIdentificationAndAccount31" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contribution1", propOrder = {
    "acct",
    "reqrdAmt",
    "incrCvrgAmt",
    "nonClrMmb"
})
public class Contribution1 {

    @XmlElement(name = "Acct")
    protected AccountIdentification4Choice acct;
    @XmlElement(name = "ReqrdAmt", required = true)
    protected ActiveCurrencyAndAmount reqrdAmt;
    @XmlElement(name = "IncrCvrgAmt")
    protected ActiveCurrencyAndAmount incrCvrgAmt;
    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setAcct(AccountIdentification4Choice value) {
        this.acct = value;
    }

    /**
     * Gets the value of the reqrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getReqrdAmt() {
        return reqrdAmt;
    }

    /**
     * Sets the value of the reqrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setReqrdAmt(ActiveCurrencyAndAmount value) {
        this.reqrdAmt = value;
    }

    /**
     * Gets the value of the incrCvrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncrCvrgAmt() {
        return incrCvrgAmt;
    }

    /**
     * Sets the value of the incrCvrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIncrCvrgAmt(ActiveCurrencyAndAmount value) {
        this.incrCvrgAmt = value;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public PartyIdentificationAndAccount31 getNonClrMmb() {
        return nonClrMmb;
    }

    /**
     * Sets the value of the nonClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public void setNonClrMmb(PartyIdentificationAndAccount31 value) {
        this.nonClrMmb = value;
    }

}
