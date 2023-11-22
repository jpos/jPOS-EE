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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractMatchingCriteria3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractMatchingCriteria3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareISINIdentifier2" minOccurs="0"/>
 *         <element name="UnqPdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUniqueProductIdentifier2" minOccurs="0"/>
 *         <element name="AltrntvInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareText1" minOccurs="0"/>
 *         <element name="PdctClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareCFIIdentifier3" minOccurs="0"/>
 *         <element name="CtrctTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareFinancialInstrumentContractType1" minOccurs="0"/>
 *         <element name="AsstClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareAssetClass1" minOccurs="0"/>
 *         <element name="DerivBasedOnCrptAsst" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareTrueFalseIndicator3" minOccurs="0"/>
 *         <element name="UndrlygInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareUnderlyingInstrument3" minOccurs="0"/>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareActiveOrHistoricCurrencyCode1" minOccurs="0"/>
 *         <element name="SttlmCcyScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareActiveOrHistoricCurrencyCode1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractMatchingCriteria3", propOrder = {
    "isin",
    "unqPdctIdr",
    "altrntvInstrmId",
    "pdctClssfctn",
    "ctrctTp",
    "asstClss",
    "derivBasedOnCrptAsst",
    "undrlygInstrm",
    "sttlmCcy",
    "sttlmCcyScndLeg"
})
public class ContractMatchingCriteria3 {

    @XmlElement(name = "ISIN")
    protected CompareISINIdentifier2 isin;
    @XmlElement(name = "UnqPdctIdr")
    protected CompareUniqueProductIdentifier2 unqPdctIdr;
    @XmlElement(name = "AltrntvInstrmId")
    protected CompareText1 altrntvInstrmId;
    @XmlElement(name = "PdctClssfctn")
    protected CompareCFIIdentifier3 pdctClssfctn;
    @XmlElement(name = "CtrctTp")
    protected CompareFinancialInstrumentContractType1 ctrctTp;
    @XmlElement(name = "AsstClss")
    protected CompareAssetClass1 asstClss;
    @XmlElement(name = "DerivBasedOnCrptAsst")
    protected CompareTrueFalseIndicator3 derivBasedOnCrptAsst;
    @XmlElement(name = "UndrlygInstrm")
    protected CompareUnderlyingInstrument3 undrlygInstrm;
    @XmlElement(name = "SttlmCcy")
    protected CompareActiveOrHistoricCurrencyCode1 sttlmCcy;
    @XmlElement(name = "SttlmCcyScndLeg")
    protected CompareActiveOrHistoricCurrencyCode1 sttlmCcyScndLeg;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier2 }
     *     
     */
    public CompareISINIdentifier2 getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier2 }
     *     
     */
    public void setISIN(CompareISINIdentifier2 value) {
        this.isin = value;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUniqueProductIdentifier2 }
     *     
     */
    public CompareUniqueProductIdentifier2 getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUniqueProductIdentifier2 }
     *     
     */
    public void setUnqPdctIdr(CompareUniqueProductIdentifier2 value) {
        this.unqPdctIdr = value;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareText1 }
     *     
     */
    public CompareText1 getAltrntvInstrmId() {
        return altrntvInstrmId;
    }

    /**
     * Sets the value of the altrntvInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareText1 }
     *     
     */
    public void setAltrntvInstrmId(CompareText1 value) {
        this.altrntvInstrmId = value;
    }

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCFIIdentifier3 }
     *     
     */
    public CompareCFIIdentifier3 getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCFIIdentifier3 }
     *     
     */
    public void setPdctClssfctn(CompareCFIIdentifier3 value) {
        this.pdctClssfctn = value;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareFinancialInstrumentContractType1 }
     *     
     */
    public CompareFinancialInstrumentContractType1 getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareFinancialInstrumentContractType1 }
     *     
     */
    public void setCtrctTp(CompareFinancialInstrumentContractType1 value) {
        this.ctrctTp = value;
    }

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAssetClass1 }
     *     
     */
    public CompareAssetClass1 getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAssetClass1 }
     *     
     */
    public void setAsstClss(CompareAssetClass1 value) {
        this.asstClss = value;
    }

    /**
     * Gets the value of the derivBasedOnCrptAsst property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getDerivBasedOnCrptAsst() {
        return derivBasedOnCrptAsst;
    }

    /**
     * Sets the value of the derivBasedOnCrptAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public void setDerivBasedOnCrptAsst(CompareTrueFalseIndicator3 value) {
        this.derivBasedOnCrptAsst = value;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnderlyingInstrument3 }
     *     
     */
    public CompareUnderlyingInstrument3 getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnderlyingInstrument3 }
     *     
     */
    public void setUndrlygInstrm(CompareUnderlyingInstrument3 value) {
        this.undrlygInstrm = value;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyCode1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyCode1 getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyCode1 }
     *     
     */
    public void setSttlmCcy(CompareActiveOrHistoricCurrencyCode1 value) {
        this.sttlmCcy = value;
    }

    /**
     * Gets the value of the sttlmCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyCode1 }
     *     
     */
    public CompareActiveOrHistoricCurrencyCode1 getSttlmCcyScndLeg() {
        return sttlmCcyScndLeg;
    }

    /**
     * Sets the value of the sttlmCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyCode1 }
     *     
     */
    public void setSttlmCcyScndLeg(CompareActiveOrHistoricCurrencyCode1 value) {
        this.sttlmCcyScndLeg = value;
    }

}
