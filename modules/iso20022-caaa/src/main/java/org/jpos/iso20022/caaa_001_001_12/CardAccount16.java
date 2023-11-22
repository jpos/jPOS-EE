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

package org.jpos.iso20022.caaa_001_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAccount16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardAccount16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SelctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}AccountChoiceMethod1Code" minOccurs="0"/>
 *         <element name="SelctdAcctTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardAccountType3Code" minOccurs="0"/>
 *         <element name="AcctNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max70Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}NameAndAddress3" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="AcctIdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}AccountIdentification54Choice" minOccurs="0"/>
 *         <element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}PartyIdentification177Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccount16", propOrder = {
    "selctnMtd",
    "selctdAcctTp",
    "acctNm",
    "acctOwnr",
    "ccy",
    "acctIdr",
    "svcr"
})
public class CardAccount16 {

    @XmlElement(name = "SelctnMtd")
    @XmlSchemaType(name = "string")
    protected AccountChoiceMethod1Code selctnMtd;
    @XmlElement(name = "SelctdAcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code selctdAcctTp;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctOwnr")
    protected NameAndAddress3 acctOwnr;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "AcctIdr")
    protected AccountIdentification54Choice acctIdr;
    @XmlElement(name = "Svcr")
    protected PartyIdentification177Choice svcr;

    /**
     * Gets the value of the selctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AccountChoiceMethod1Code }
     *     
     */
    public AccountChoiceMethod1Code getSelctnMtd() {
        return selctnMtd;
    }

    /**
     * Sets the value of the selctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountChoiceMethod1Code }
     *     
     */
    public void setSelctnMtd(AccountChoiceMethod1Code value) {
        this.selctnMtd = value;
    }

    /**
     * Gets the value of the selctdAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccountType3Code getSelctdAcctTp() {
        return selctdAcctTp;
    }

    /**
     * Sets the value of the selctdAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType3Code }
     *     
     */
    public void setSelctdAcctTp(CardAccountType3Code value) {
        this.selctdAcctTp = value;
    }

    /**
     * Gets the value of the acctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Sets the value of the acctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNm(String value) {
        this.acctNm = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress3 }
     *     
     */
    public NameAndAddress3 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress3 }
     *     
     */
    public void setAcctOwnr(NameAndAddress3 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the acctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification54Choice }
     *     
     */
    public AccountIdentification54Choice getAcctIdr() {
        return acctIdr;
    }

    /**
     * Sets the value of the acctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification54Choice }
     *     
     */
    public void setAcctIdr(AccountIdentification54Choice value) {
        this.acctIdr = value;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public PartyIdentification177Choice getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public void setSvcr(PartyIdentification177Choice value) {
        this.svcr = value;
    }

}
