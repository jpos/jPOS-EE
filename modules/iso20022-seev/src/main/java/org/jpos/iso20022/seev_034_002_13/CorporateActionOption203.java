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

package org.jpos.iso20022.seev_034_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionOption203 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionOption203">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}OptionNumber1Choice"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}CorporateActionOption42Choice"/>
 *         <element name="OptnFeatrs" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}OptionFeaturesFormat27Choice" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}PartyIdentification136Choice" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}RestrictedFINXMax35Text" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}RestrictedFINXMax140Text" minOccurs="0"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}CashAccountIdentification6Choice" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}SafekeepingPlaceFormat32Choice" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}SecurityIdentification20" minOccurs="0"/>
 *         <element name="TtlElgblBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}SignedQuantityFormat12" minOccurs="0"/>
 *         <element name="InstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}SignedQuantityFormat12" minOccurs="0"/>
 *         <element name="UinstdBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}SignedQuantityFormat12" minOccurs="0"/>
 *         <element name="PrtctBal" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}SignedQuantityFormat11" minOccurs="0"/>
 *         <element name="StsQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}Quantity54Choice" minOccurs="0"/>
 *         <element name="StsCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SlctnDealrFeeInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.034.002.13}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption203", propOrder = {
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
    "stsCshAmt",
    "slctnDealrFeeInd"
})
public class CorporateActionOption203 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption42Choice optnTp;
    @XmlElement(name = "OptnFeatrs")
    protected OptionFeaturesFormat27Choice optnFeatrs;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification136Choice acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected String blckChainAdrOrWllt;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification6Choice cshAcct;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat32Choice sfkpgPlc;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat12 ttlElgblBal;
    @XmlElement(name = "InstdBal")
    protected SignedQuantityFormat12 instdBal;
    @XmlElement(name = "UinstdBal")
    protected SignedQuantityFormat12 uinstdBal;
    @XmlElement(name = "PrtctBal")
    protected SignedQuantityFormat11 prtctBal;
    @XmlElement(name = "StsQty")
    protected Quantity54Choice stsQty;
    @XmlElement(name = "StsCshAmt")
    protected RestrictedFINActiveCurrencyAndAmount stsCshAmt;
    @XmlElement(name = "SlctnDealrFeeInd")
    protected Boolean slctnDealrFeeInd;

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
     *     {@link CorporateActionOption42Choice }
     *     
     */
    public CorporateActionOption42Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption42Choice }
     *     
     */
    public void setOptnTp(CorporateActionOption42Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the optnFeatrs property.
     * 
     * @return
     *     possible object is
     *     {@link OptionFeaturesFormat27Choice }
     *     
     */
    public OptionFeaturesFormat27Choice getOptnFeatrs() {
        return optnFeatrs;
    }

    /**
     * Sets the value of the optnFeatrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionFeaturesFormat27Choice }
     *     
     */
    public void setOptnFeatrs(OptionFeaturesFormat27Choice value) {
        this.optnFeatrs = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136Choice }
     *     
     */
    public PartyIdentification136Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136Choice }
     *     
     */
    public void setAcctOwnr(PartyIdentification136Choice value) {
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
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification6Choice value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat32Choice }
     *     
     */
    public SafekeepingPlaceFormat32Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat32Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat32Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public SignedQuantityFormat12 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public void setTtlElgblBal(SignedQuantityFormat12 value) {
        this.ttlElgblBal = value;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public SignedQuantityFormat12 getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public void setInstdBal(SignedQuantityFormat12 value) {
        this.instdBal = value;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public SignedQuantityFormat12 getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat12 }
     *     
     */
    public void setUinstdBal(SignedQuantityFormat12 value) {
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
     *     {@link Quantity54Choice }
     *     
     */
    public Quantity54Choice getStsQty() {
        return stsQty;
    }

    /**
     * Sets the value of the stsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity54Choice }
     *     
     */
    public void setStsQty(Quantity54Choice value) {
        this.stsQty = value;
    }

    /**
     * Gets the value of the stsCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getStsCshAmt() {
        return stsCshAmt;
    }

    /**
     * Sets the value of the stsCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public void setStsCshAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.stsCshAmt = value;
    }

    /**
     * Gets the value of the slctnDealrFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlctnDealrFeeInd() {
        return slctnDealrFeeInd;
    }

    /**
     * Sets the value of the slctnDealrFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlctnDealrFeeInd(Boolean value) {
        this.slctnDealrFeeInd = value;
    }

}
