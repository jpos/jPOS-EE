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

package org.jpos.iso20022.caam_011_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCard23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentCard23">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}CardDataReading1Code"/>
 *         <element name="FllbckInd" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}CardFallback1Code" minOccurs="0"/>
 *         <element name="PrtctdCardData" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}ContentInformationType10" minOccurs="0"/>
 *         <element name="PlainCardData" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}PlainCardData19" minOccurs="0"/>
 *         <element name="CardCtryCd" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}Max3Text" minOccurs="0"/>
 *         <element name="CardCcyCd" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}Exact3AlphaNumericText" minOccurs="0"/>
 *         <element name="ElctrncPrsBal" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}CurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard23", propOrder = {
    "cardDataNtryMd",
    "fllbckInd",
    "prtctdCardData",
    "plainCardData",
    "cardCtryCd",
    "cardCcyCd",
    "elctrncPrsBal"
})
public class PaymentCard23 {

    @XmlElement(name = "CardDataNtryMd", required = true)
    @XmlSchemaType(name = "string")
    protected CardDataReading1Code cardDataNtryMd;
    @XmlElement(name = "FllbckInd")
    @XmlSchemaType(name = "string")
    protected CardFallback1Code fllbckInd;
    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType10 prtctdCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData19 plainCardData;
    @XmlElement(name = "CardCtryCd")
    protected String cardCtryCd;
    @XmlElement(name = "CardCcyCd")
    protected String cardCcyCd;
    @XmlElement(name = "ElctrncPrsBal")
    protected CurrencyAndAmount elctrncPrsBal;

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading1Code }
     *     
     */
    public CardDataReading1Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading1Code }
     *     
     */
    public void setCardDataNtryMd(CardDataReading1Code value) {
        this.cardDataNtryMd = value;
    }

    /**
     * Gets the value of the fllbckInd property.
     * 
     * @return
     *     possible object is
     *     {@link CardFallback1Code }
     *     
     */
    public CardFallback1Code getFllbckInd() {
        return fllbckInd;
    }

    /**
     * Sets the value of the fllbckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardFallback1Code }
     *     
     */
    public void setFllbckInd(CardFallback1Code value) {
        this.fllbckInd = value;
    }

    /**
     * Gets the value of the prtctdCardData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdCardData() {
        return prtctdCardData;
    }

    /**
     * Sets the value of the prtctdCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdCardData(ContentInformationType10 value) {
        this.prtctdCardData = value;
    }

    /**
     * Gets the value of the plainCardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData19 }
     *     
     */
    public PlainCardData19 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Sets the value of the plainCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData19 }
     *     
     */
    public void setPlainCardData(PlainCardData19 value) {
        this.plainCardData = value;
    }

    /**
     * Gets the value of the cardCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCtryCd() {
        return cardCtryCd;
    }

    /**
     * Sets the value of the cardCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCtryCd(String value) {
        this.cardCtryCd = value;
    }

    /**
     * Gets the value of the cardCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCcyCd() {
        return cardCcyCd;
    }

    /**
     * Sets the value of the cardCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCcyCd(String value) {
        this.cardCcyCd = value;
    }

    /**
     * Gets the value of the elctrncPrsBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getElctrncPrsBal() {
        return elctrncPrsBal;
    }

    /**
     * Sets the value of the elctrncPrsBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setElctrncPrsBal(CurrencyAndAmount value) {
        this.elctrncPrsBal = value;
    }

}
