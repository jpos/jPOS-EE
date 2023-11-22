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

package org.jpos.iso20022.seev_041_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption197 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionOption197">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}OptionNumber1Choice"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}CorporateActionOption41Choice"/>
 *         <element name="OptnFeatrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}OptionFeaturesFormat25Choice" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}PartyIdentification127Choice" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}Max35Text" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}Max140Text" minOccurs="0"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}SafekeepingPlaceFormat28Choice" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}SecurityIdentification19" minOccurs="0"/>
 *         <element name="TtlElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}SignedQuantityFormat11" minOccurs="0"/>
 *         <element name="InstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}SignedQuantityFormat11" minOccurs="0"/>
 *         <element name="UinstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}SignedQuantityFormat11" minOccurs="0"/>
 *         <element name="PrtctBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}SignedQuantityFormat11" minOccurs="0"/>
 *         <element name="StsQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}Quantity51Choice" minOccurs="0"/>
 *         <element name="StsCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.041.001.13}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption197", propOrder = {
    "optnNb",
    "optnTp",
    "optnFeatrs",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "cshAcct",
    "sfkpgPlc",
    "finInstrmId",
    "ttlElgblBal",
    "instdBal",
    "uinstdBal",
    "prtctBal",
    "stsQty",
    "stsCshAmt"
})
public class CorporateActionOption197 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption41Choice optnTp;
    @XmlElement(name = "OptnFeatrs")
    protected OptionFeaturesFormat25Choice optnFeatrs;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification127Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected String blckChainAdrOrWllt;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat28Choice sfkpgPlc;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat11 ttlElgblBal;
    @XmlElement(name = "InstdBal")
    protected SignedQuantityFormat11 instdBal;
    @XmlElement(name = "UinstdBal")
    protected SignedQuantityFormat11 uinstdBal;
    @XmlElement(name = "PrtctBal")
    protected SignedQuantityFormat11 prtctBal;
    @XmlElement(name = "StsQty")
    protected Quantity51Choice stsQty;
    @XmlElement(name = "StsCshAmt")
    protected ActiveCurrencyAndAmount stsCshAmt;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public void setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption41Choice }
     *     
     */
    public CorporateActionOption41Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption41Choice }
     *     
     */
    public void setOptnTp(CorporateActionOption41Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the optnFeatrs property.
     * 
     * @return
     *     possible object is
     *     {@link OptionFeaturesFormat25Choice }
     *     
     */
    public OptionFeaturesFormat25Choice getOptnFeatrs() {
        return optnFeatrs;
    }

    /**
     * Sets the value of the optnFeatrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionFeaturesFormat25Choice }
     *     
     */
    public void setOptnFeatrs(OptionFeaturesFormat25Choice value) {
        this.optnFeatrs = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public PartyIdentification127Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public void setAcctOwnr(PartyIdentification127Choice value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlckChainAdrOrWllt(String value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public SafekeepingPlaceFormat28Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat28Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat28Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public SignedQuantityFormat11 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public void setTtlElgblBal(SignedQuantityFormat11 value) {
        this.ttlElgblBal = value;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public SignedQuantityFormat11 getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public void setInstdBal(SignedQuantityFormat11 value) {
        this.instdBal = value;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public SignedQuantityFormat11 getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public void setUinstdBal(SignedQuantityFormat11 value) {
        this.uinstdBal = value;
    }

    /**
     * Gets the value of the prtctBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public SignedQuantityFormat11 getPrtctBal() {
        return prtctBal;
    }

    /**
     * Sets the value of the prtctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat11 }
     *     
     */
    public void setPrtctBal(SignedQuantityFormat11 value) {
        this.prtctBal = value;
    }

    /**
     * Gets the value of the stsQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getStsQty() {
        return stsQty;
    }

    /**
     * Sets the value of the stsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public void setStsQty(Quantity51Choice value) {
        this.stsQty = value;
    }

    /**
     * Gets the value of the stsCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStsCshAmt() {
        return stsCshAmt;
    }

    /**
     * Sets the value of the stsCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setStsCshAmt(ActiveCurrencyAndAmount value) {
        this.stsCshAmt = value;
    }

}
