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

package org.jpos.iso20022.camt_069_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrderSearchCriteria4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingOrderSearchCriteria4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyAttrbtsInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="StgOrdrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}Max35Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}StandingOrderType1Choice" minOccurs="0"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}CashAccount40" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="VldtyPrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}DatePeriod2Choice" minOccurs="0"/>
 *         <element name="SysMmb" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="RspnsblPty" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="AssoctdPoolAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="LkSetId" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}Max35Text" minOccurs="0"/>
 *         <element name="LkSetOrdrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}Max35Text" minOccurs="0"/>
 *         <element name="LkSetOrdrSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}Number" minOccurs="0"/>
 *         <element name="ZeroSweepInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.069.001.04}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderSearchCriteria4", propOrder = {
    "keyAttrbtsInd",
    "stgOrdrId",
    "tp",
    "acct",
    "ccy",
    "vldtyPrd",
    "sysMmb",
    "rspnsblPty",
    "assoctdPoolAcct",
    "lkSetId",
    "lkSetOrdrId",
    "lkSetOrdrSeq",
    "zeroSweepInd"
})
public class StandingOrderSearchCriteria4 {

    @XmlElement(name = "KeyAttrbtsInd")
    protected Boolean keyAttrbtsInd;
    @XmlElement(name = "StgOrdrId")
    protected String stgOrdrId;
    @XmlElement(name = "Tp")
    protected StandingOrderType1Choice tp;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "VldtyPrd")
    protected DatePeriod2Choice vldtyPrd;
    @XmlElement(name = "SysMmb")
    protected BranchAndFinancialInstitutionIdentification6 sysMmb;
    @XmlElement(name = "RspnsblPty")
    protected BranchAndFinancialInstitutionIdentification6 rspnsblPty;
    @XmlElement(name = "AssoctdPoolAcct")
    protected AccountIdentification4Choice assoctdPoolAcct;
    @XmlElement(name = "LkSetId")
    protected String lkSetId;
    @XmlElement(name = "LkSetOrdrId")
    protected String lkSetOrdrId;
    @XmlElement(name = "LkSetOrdrSeq")
    protected BigDecimal lkSetOrdrSeq;
    @XmlElement(name = "ZeroSweepInd")
    protected Boolean zeroSweepInd;

    /**
     * Gets the value of the keyAttrbtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyAttrbtsInd() {
        return keyAttrbtsInd;
    }

    /**
     * Sets the value of the keyAttrbtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyAttrbtsInd(Boolean value) {
        this.keyAttrbtsInd = value;
    }

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStgOrdrId(String value) {
        this.stgOrdrId = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderType1Choice }
     *     
     */
    public StandingOrderType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderType1Choice }
     *     
     */
    public void setTp(StandingOrderType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setAcct(CashAccount40 value) {
        this.acct = value;
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
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2Choice }
     *     
     */
    public DatePeriod2Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2Choice }
     *     
     */
    public void setVldtyPrd(DatePeriod2Choice value) {
        this.vldtyPrd = value;
    }

    /**
     * Gets the value of the sysMmb property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getSysMmb() {
        return sysMmb;
    }

    /**
     * Sets the value of the sysMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setSysMmb(BranchAndFinancialInstitutionIdentification6 value) {
        this.sysMmb = value;
    }

    /**
     * Gets the value of the rspnsblPty property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getRspnsblPty() {
        return rspnsblPty;
    }

    /**
     * Sets the value of the rspnsblPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setRspnsblPty(BranchAndFinancialInstitutionIdentification6 value) {
        this.rspnsblPty = value;
    }

    /**
     * Gets the value of the assoctdPoolAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAssoctdPoolAcct() {
        return assoctdPoolAcct;
    }

    /**
     * Sets the value of the assoctdPoolAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setAssoctdPoolAcct(AccountIdentification4Choice value) {
        this.assoctdPoolAcct = value;
    }

    /**
     * Gets the value of the lkSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkSetId() {
        return lkSetId;
    }

    /**
     * Sets the value of the lkSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkSetId(String value) {
        this.lkSetId = value;
    }

    /**
     * Gets the value of the lkSetOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkSetOrdrId() {
        return lkSetOrdrId;
    }

    /**
     * Sets the value of the lkSetOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkSetOrdrId(String value) {
        this.lkSetOrdrId = value;
    }

    /**
     * Gets the value of the lkSetOrdrSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLkSetOrdrSeq() {
        return lkSetOrdrSeq;
    }

    /**
     * Sets the value of the lkSetOrdrSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLkSetOrdrSeq(BigDecimal value) {
        this.lkSetOrdrSeq = value;
    }

    /**
     * Gets the value of the zeroSweepInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroSweepInd() {
        return zeroSweepInd;
    }

    /**
     * Sets the value of the zeroSweepInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroSweepInd(Boolean value) {
        this.zeroSweepInd = value;
    }

}
