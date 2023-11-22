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

package org.jpos.iso20022.colr_019_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralParameters10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralParameters10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollInstrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}CollateralTransactionType1Choice"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}ExposureType23Choice"/>
 *         <element name="CollSd" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}CollateralRole1Code"/>
 *         <element name="ValSghtMrgnRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}RateOrType1Choice" minOccurs="0"/>
 *         <element name="TrfTitl" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="SttlmPrc" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}GenericIdentification30" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}GenericIdentification30" minOccurs="0"/>
 *         <element name="AutomtcAllcn" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="FaildSttlmSlvtn" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="MainTradgAcctCollstn" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="BsktIdAndElgbltySetPrfl" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}BasketIdentificationAndEligibilitySetProfile1" minOccurs="0"/>
 *         <element name="RspnSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}ResponseStatus9Choice" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:colr.019.001.01}AdditionalInformation24" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParameters10", propOrder = {
    "collInstrTp",
    "xpsrTp",
    "collSd",
    "valSghtMrgnRate",
    "trfTitl",
    "sttlmPrc",
    "prty",
    "automtcAllcn",
    "faildSttlmSlvtn",
    "mainTradgAcctCollstn",
    "bsktIdAndElgbltySetPrfl",
    "rspnSts",
    "addtlInf"
})
public class CollateralParameters10 {

    @XmlElement(name = "CollInstrTp", required = true)
    protected CollateralTransactionType1Choice collInstrTp;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "ValSghtMrgnRate")
    protected RateOrType1Choice valSghtMrgnRate;
    @XmlElement(name = "TrfTitl")
    protected Boolean trfTitl;
    @XmlElement(name = "SttlmPrc")
    protected GenericIdentification30 sttlmPrc;
    @XmlElement(name = "Prty")
    protected GenericIdentification30 prty;
    @XmlElement(name = "AutomtcAllcn")
    protected Boolean automtcAllcn;
    @XmlElement(name = "FaildSttlmSlvtn")
    protected Boolean faildSttlmSlvtn;
    @XmlElement(name = "MainTradgAcctCollstn")
    protected Boolean mainTradgAcctCollstn;
    @XmlElement(name = "BsktIdAndElgbltySetPrfl")
    protected BasketIdentificationAndEligibilitySetProfile1 bsktIdAndElgbltySetPrfl;
    @XmlElement(name = "RspnSts")
    protected ResponseStatus9Choice rspnSts;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation24 addtlInf;

    /**
     * Gets the value of the collInstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralTransactionType1Choice getCollInstrTp() {
        return collInstrTp;
    }

    /**
     * Sets the value of the collInstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public void setCollInstrTp(CollateralTransactionType1Choice value) {
        this.collInstrTp = value;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public void setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setCollSd(CollateralRole1Code value) {
        this.collSd = value;
    }

    /**
     * Gets the value of the valSghtMrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrType1Choice }
     *     
     */
    public RateOrType1Choice getValSghtMrgnRate() {
        return valSghtMrgnRate;
    }

    /**
     * Sets the value of the valSghtMrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrType1Choice }
     *     
     */
    public void setValSghtMrgnRate(RateOrType1Choice value) {
        this.valSghtMrgnRate = value;
    }

    /**
     * Gets the value of the trfTitl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrfTitl() {
        return trfTitl;
    }

    /**
     * Sets the value of the trfTitl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrfTitl(Boolean value) {
        this.trfTitl = value;
    }

    /**
     * Gets the value of the sttlmPrc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getSttlmPrc() {
        return sttlmPrc;
    }

    /**
     * Sets the value of the sttlmPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setSttlmPrc(GenericIdentification30 value) {
        this.sttlmPrc = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrty(GenericIdentification30 value) {
        this.prty = value;
    }

    /**
     * Gets the value of the automtcAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomtcAllcn() {
        return automtcAllcn;
    }

    /**
     * Sets the value of the automtcAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomtcAllcn(Boolean value) {
        this.automtcAllcn = value;
    }

    /**
     * Gets the value of the faildSttlmSlvtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaildSttlmSlvtn() {
        return faildSttlmSlvtn;
    }

    /**
     * Sets the value of the faildSttlmSlvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaildSttlmSlvtn(Boolean value) {
        this.faildSttlmSlvtn = value;
    }

    /**
     * Gets the value of the mainTradgAcctCollstn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainTradgAcctCollstn() {
        return mainTradgAcctCollstn;
    }

    /**
     * Sets the value of the mainTradgAcctCollstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainTradgAcctCollstn(Boolean value) {
        this.mainTradgAcctCollstn = value;
    }

    /**
     * Gets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 getBsktIdAndElgbltySetPrfl() {
        return bsktIdAndElgbltySetPrfl;
    }

    /**
     * Sets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public void setBsktIdAndElgbltySetPrfl(BasketIdentificationAndEligibilitySetProfile1 value) {
        this.bsktIdAndElgbltySetPrfl = value;
    }

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus9Choice }
     *     
     */
    public ResponseStatus9Choice getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus9Choice }
     *     
     */
    public void setRspnSts(ResponseStatus9Choice value) {
        this.rspnSts = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation24 }
     *     
     */
    public AdditionalInformation24 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation24 }
     *     
     */
    public void setAddtlInf(AdditionalInformation24 value) {
        this.addtlInf = value;
    }

}
