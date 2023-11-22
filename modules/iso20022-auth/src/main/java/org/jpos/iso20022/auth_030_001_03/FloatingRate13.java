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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloatingRate13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FloatingRate13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ISINOct2015Identifier" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Max350Text" minOccurs="0"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}FloatingRateIdentification8Choice" minOccurs="0"/>
 *         <element name="RefPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}InterestRateContractTerm4" minOccurs="0"/>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}SecuritiesTransactionPrice20Choice" minOccurs="0"/>
 *         <element name="DayCnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}InterestComputationMethodFormat7" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}InterestRateFrequency3Choice" minOccurs="0"/>
 *         <element name="RstFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}InterestRateFrequency3Choice" minOccurs="0"/>
 *         <element name="NxtFltgRst" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ResetDateAndValue1" minOccurs="0"/>
 *         <element name="LastFltgRst" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ResetDateAndValue1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRate13", propOrder = {
    "id",
    "nm",
    "rate",
    "refPrd",
    "sprd",
    "dayCnt",
    "pmtFrqcy",
    "rstFrqcy",
    "nxtFltgRst",
    "lastFltgRst"
})
public class FloatingRate13 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Rate")
    protected FloatingRateIdentification8Choice rate;
    @XmlElement(name = "RefPrd")
    protected InterestRateContractTerm4 refPrd;
    @XmlElement(name = "Sprd")
    protected SecuritiesTransactionPrice20Choice sprd;
    @XmlElement(name = "DayCnt")
    protected InterestComputationMethodFormat7 dayCnt;
    @XmlElement(name = "PmtFrqcy")
    protected InterestRateFrequency3Choice pmtFrqcy;
    @XmlElement(name = "RstFrqcy")
    protected InterestRateFrequency3Choice rstFrqcy;
    @XmlElement(name = "NxtFltgRst")
    protected ResetDateAndValue1 nxtFltgRst;
    @XmlElement(name = "LastFltgRst")
    protected ResetDateAndValue1 lastFltgRst;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIdentification8Choice }
     *     
     */
    public FloatingRateIdentification8Choice getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIdentification8Choice }
     *     
     */
    public void setRate(FloatingRateIdentification8Choice value) {
        this.rate = value;
    }

    /**
     * Gets the value of the refPrd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm4 }
     *     
     */
    public InterestRateContractTerm4 getRefPrd() {
        return refPrd;
    }

    /**
     * Sets the value of the refPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm4 }
     *     
     */
    public void setRefPrd(InterestRateContractTerm4 value) {
        this.refPrd = value;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice20Choice }
     *     
     */
    public SecuritiesTransactionPrice20Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice20Choice }
     *     
     */
    public void setSprd(SecuritiesTransactionPrice20Choice value) {
        this.sprd = value;
    }

    /**
     * Gets the value of the dayCnt property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat7 }
     *     
     */
    public InterestComputationMethodFormat7 getDayCnt() {
        return dayCnt;
    }

    /**
     * Sets the value of the dayCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat7 }
     *     
     */
    public void setDayCnt(InterestComputationMethodFormat7 value) {
        this.dayCnt = value;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public InterestRateFrequency3Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public void setPmtFrqcy(InterestRateFrequency3Choice value) {
        this.pmtFrqcy = value;
    }

    /**
     * Gets the value of the rstFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public InterestRateFrequency3Choice getRstFrqcy() {
        return rstFrqcy;
    }

    /**
     * Sets the value of the rstFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateFrequency3Choice }
     *     
     */
    public void setRstFrqcy(InterestRateFrequency3Choice value) {
        this.rstFrqcy = value;
    }

    /**
     * Gets the value of the nxtFltgRst property.
     * 
     * @return
     *     possible object is
     *     {@link ResetDateAndValue1 }
     *     
     */
    public ResetDateAndValue1 getNxtFltgRst() {
        return nxtFltgRst;
    }

    /**
     * Sets the value of the nxtFltgRst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetDateAndValue1 }
     *     
     */
    public void setNxtFltgRst(ResetDateAndValue1 value) {
        this.nxtFltgRst = value;
    }

    /**
     * Gets the value of the lastFltgRst property.
     * 
     * @return
     *     possible object is
     *     {@link ResetDateAndValue1 }
     *     
     */
    public ResetDateAndValue1 getLastFltgRst() {
        return lastFltgRst;
    }

    /**
     * Sets the value of the lastFltgRst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetDateAndValue1 }
     *     
     */
    public void setLastFltgRst(ResetDateAndValue1 value) {
        this.lastFltgRst = value;
    }

}
