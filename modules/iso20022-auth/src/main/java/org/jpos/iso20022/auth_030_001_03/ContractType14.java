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

package org.jpos.iso20022.auth_030_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractType14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractType14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}FinancialInstrumentContractType2Code" minOccurs="0"/>
 *         <element name="AsstClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ProductType4Code" minOccurs="0"/>
 *         <element name="PdctClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}CFIOct2015Identifier" minOccurs="0"/>
 *         <element name="PdctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}SecurityIdentification46" minOccurs="0"/>
 *         <element name="UndrlygInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}SecurityIdentification41Choice" minOccurs="0"/>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}CurrencyExchange23" minOccurs="0"/>
 *         <element name="SttlmCcyScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}CurrencyExchange23" minOccurs="0"/>
 *         <element name="PlcOfSttlm" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}CountryCode" minOccurs="0"/>
 *         <element name="DerivBasedOnCrptAsst" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractType14", propOrder = {
    "ctrctTp",
    "asstClss",
    "pdctClssfctn",
    "pdctId",
    "undrlygInstrm",
    "sttlmCcy",
    "sttlmCcyScndLeg",
    "plcOfSttlm",
    "derivBasedOnCrptAsst"
})
public class ContractType14 {

    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType2Code ctrctTp;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected ProductType4Code asstClss;
    @XmlElement(name = "PdctClssfctn")
    protected String pdctClssfctn;
    @XmlElement(name = "PdctId")
    protected SecurityIdentification46 pdctId;
    @XmlElement(name = "UndrlygInstrm")
    protected SecurityIdentification41Choice undrlygInstrm;
    @XmlElement(name = "SttlmCcy")
    protected CurrencyExchange23 sttlmCcy;
    @XmlElement(name = "SttlmCcyScndLeg")
    protected CurrencyExchange23 sttlmCcyScndLeg;
    @XmlElement(name = "PlcOfSttlm")
    protected String plcOfSttlm;
    @XmlElement(name = "DerivBasedOnCrptAsst")
    protected Boolean derivBasedOnCrptAsst;

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentContractType2Code }
     *     
     */
    public FinancialInstrumentContractType2Code getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentContractType2Code }
     *     
     */
    public void setCtrctTp(FinancialInstrumentContractType2Code value) {
        this.ctrctTp = value;
    }

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType4Code }
     *     
     */
    public ProductType4Code getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType4Code }
     *     
     */
    public void setAsstClss(ProductType4Code value) {
        this.asstClss = value;
    }

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctClssfctn(String value) {
        this.pdctClssfctn = value;
    }

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification46 }
     *     
     */
    public SecurityIdentification46 getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification46 }
     *     
     */
    public void setPdctId(SecurityIdentification46 value) {
        this.pdctId = value;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification41Choice }
     *     
     */
    public SecurityIdentification41Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification41Choice }
     *     
     */
    public void setUndrlygInstrm(SecurityIdentification41Choice value) {
        this.undrlygInstrm = value;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange23 }
     *     
     */
    public CurrencyExchange23 getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange23 }
     *     
     */
    public void setSttlmCcy(CurrencyExchange23 value) {
        this.sttlmCcy = value;
    }

    /**
     * Gets the value of the sttlmCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange23 }
     *     
     */
    public CurrencyExchange23 getSttlmCcyScndLeg() {
        return sttlmCcyScndLeg;
    }

    /**
     * Sets the value of the sttlmCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange23 }
     *     
     */
    public void setSttlmCcyScndLeg(CurrencyExchange23 value) {
        this.sttlmCcyScndLeg = value;
    }

    /**
     * Gets the value of the plcOfSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfSttlm() {
        return plcOfSttlm;
    }

    /**
     * Sets the value of the plcOfSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcOfSttlm(String value) {
        this.plcOfSttlm = value;
    }

    /**
     * Gets the value of the derivBasedOnCrptAsst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDerivBasedOnCrptAsst() {
        return derivBasedOnCrptAsst;
    }

    /**
     * Sets the value of the derivBasedOnCrptAsst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDerivBasedOnCrptAsst(Boolean value) {
        this.derivBasedOnCrptAsst = value;
    }

}
