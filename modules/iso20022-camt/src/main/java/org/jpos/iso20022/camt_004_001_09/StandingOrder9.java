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

package org.jpos.iso20022.camt_004_001_09;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrder9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingOrder9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}Amount2Choice"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}CreditDebitCode"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}StandingOrderType1Choice" minOccurs="0"/>
 *         <element name="AssoctdPoolAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}Max35Text" minOccurs="0"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}Frequency2Code" minOccurs="0"/>
 *         <element name="VldtyPrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}DatePeriod3" minOccurs="0"/>
 *         <element name="SysMmb" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="RspnsblPty" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="LkSetId" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}Max35Text" minOccurs="0"/>
 *         <element name="LkSetOrdrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}Max35Text" minOccurs="0"/>
 *         <element name="LkSetOrdrSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}Number" minOccurs="0"/>
 *         <element name="ExctnTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}ExecutionType1Choice" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}CashAccount40" minOccurs="0"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}CashAccount40" minOccurs="0"/>
 *         <element name="TtlsPerStgOrdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}StandingOrderTotalAmount1" minOccurs="0"/>
 *         <element name="ZeroSweepInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.004.001.09}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrder9", propOrder = {
    "amt",
    "cdtDbtInd",
    "ccy",
    "tp",
    "assoctdPoolAcct",
    "ref",
    "frqcy",
    "vldtyPrd",
    "sysMmb",
    "rspnsblPty",
    "lkSetId",
    "lkSetOrdrId",
    "lkSetOrdrSeq",
    "exctnTp",
    "cdtr",
    "cdtrAcct",
    "dbtr",
    "dbtrAcct",
    "ttlsPerStgOrdr",
    "zeroSweepInd"
})
public class StandingOrder9 {

    @XmlElement(name = "Amt", required = true)
    protected Amount2Choice amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Tp")
    protected StandingOrderType1Choice tp;
    @XmlElement(name = "AssoctdPoolAcct")
    protected AccountIdentification4Choice assoctdPoolAcct;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected Frequency2Code frqcy;
    @XmlElement(name = "VldtyPrd")
    protected DatePeriod3 vldtyPrd;
    @XmlElement(name = "SysMmb")
    protected BranchAndFinancialInstitutionIdentification6 sysMmb;
    @XmlElement(name = "RspnsblPty")
    protected BranchAndFinancialInstitutionIdentification6 rspnsblPty;
    @XmlElement(name = "LkSetId")
    protected String lkSetId;
    @XmlElement(name = "LkSetOrdrId")
    protected String lkSetOrdrId;
    @XmlElement(name = "LkSetOrdrSeq")
    protected BigDecimal lkSetOrdrSeq;
    @XmlElement(name = "ExctnTp")
    protected ExecutionType1Choice exctnTp;
    @XmlElement(name = "Cdtr")
    protected BranchAndFinancialInstitutionIdentification6 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "Dbtr")
    protected BranchAndFinancialInstitutionIdentification6 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "TtlsPerStgOrdr")
    protected StandingOrderTotalAmount1 ttlsPerStgOrdr;
    @XmlElement(name = "ZeroSweepInd")
    protected Boolean zeroSweepInd;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setAmt(Amount2Choice value) {
        this.amt = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
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
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency2Code }
     *     
     */
    public Frequency2Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency2Code }
     *     
     */
    public void setFrqcy(Frequency2Code value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod3 }
     *     
     */
    public DatePeriod3 getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod3 }
     *     
     */
    public void setVldtyPrd(DatePeriod3 value) {
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
     * Gets the value of the exctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionType1Choice }
     *     
     */
    public ExecutionType1Choice getExctnTp() {
        return exctnTp;
    }

    /**
     * Sets the value of the exctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionType1Choice }
     *     
     */
    public void setExctnTp(ExecutionType1Choice value) {
        this.exctnTp = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCdtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setCdtrAcct(CashAccount40 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the ttlsPerStgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderTotalAmount1 }
     *     
     */
    public StandingOrderTotalAmount1 getTtlsPerStgOrdr() {
        return ttlsPerStgOrdr;
    }

    /**
     * Sets the value of the ttlsPerStgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderTotalAmount1 }
     *     
     */
    public void setTtlsPerStgOrdr(StandingOrderTotalAmount1 value) {
        this.ttlsPerStgOrdr = value;
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
