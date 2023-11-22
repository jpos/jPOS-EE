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

package org.jpos.iso20022.camt_053_001_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatement12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountStatement12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}Max35Text"/>
 *         <element name="StmtPgntn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}Pagination1" minOccurs="0"/>
 *         <element name="ElctrncSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}Number" minOccurs="0"/>
 *         <element name="RptgSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}SequenceRange1Choice" minOccurs="0"/>
 *         <element name="LglSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}Number" minOccurs="0"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}ISODateTime" minOccurs="0"/>
 *         <element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}DateTimePeriod1" minOccurs="0"/>
 *         <element name="CpyDplctInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}CopyDuplicate1Code" minOccurs="0"/>
 *         <element name="RptgSrc" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}ReportingSource1Choice" minOccurs="0"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}CashAccount41"/>
 *         <element name="RltdAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}CashAccount40" minOccurs="0"/>
 *         <element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}AccountInterest4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}CashBalance8" maxOccurs="unbounded"/>
 *         <element name="TxsSummry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}TotalTransactions6" minOccurs="0"/>
 *         <element name="Ntry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}ReportEntry13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlStmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}Max500Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatement12", propOrder = {
    "id",
    "stmtPgntn",
    "elctrncSeqNb",
    "rptgSeq",
    "lglSeqNb",
    "creDtTm",
    "frToDt",
    "cpyDplctInd",
    "rptgSrc",
    "acct",
    "rltdAcct",
    "intrst",
    "bal",
    "txsSummry",
    "ntry",
    "addtlStmtInf"
})
public class AccountStatement12 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "StmtPgntn")
    protected Pagination1 stmtPgntn;
    @XmlElement(name = "ElctrncSeqNb")
    protected BigDecimal elctrncSeqNb;
    @XmlElement(name = "RptgSeq")
    protected SequenceRange1Choice rptgSeq;
    @XmlElement(name = "LglSeqNb")
    protected BigDecimal lglSeqNb;
    @XmlElement(name = "CreDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "FrToDt")
    protected DateTimePeriod1 frToDt;
    @XmlElement(name = "CpyDplctInd")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplctInd;
    @XmlElement(name = "RptgSrc")
    protected ReportingSource1Choice rptgSrc;
    @XmlElement(name = "Acct", required = true)
    protected CashAccount41 acct;
    @XmlElement(name = "RltdAcct")
    protected CashAccount40 rltdAcct;
    @XmlElement(name = "Intrst")
    protected List<AccountInterest4> intrst;
    @XmlElement(name = "Bal", required = true)
    protected List<CashBalance8> bal;
    @XmlElement(name = "TxsSummry")
    protected TotalTransactions6 txsSummry;
    @XmlElement(name = "Ntry")
    protected List<ReportEntry13> ntry;
    @XmlElement(name = "AddtlStmtInf")
    protected String addtlStmtInf;

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
     * Gets the value of the stmtPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getStmtPgntn() {
        return stmtPgntn;
    }

    /**
     * Sets the value of the stmtPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setStmtPgntn(Pagination1 value) {
        this.stmtPgntn = value;
    }

    /**
     * Gets the value of the elctrncSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElctrncSeqNb() {
        return elctrncSeqNb;
    }

    /**
     * Sets the value of the elctrncSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElctrncSeqNb(BigDecimal value) {
        this.elctrncSeqNb = value;
    }

    /**
     * Gets the value of the rptgSeq property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRange1Choice }
     *     
     */
    public SequenceRange1Choice getRptgSeq() {
        return rptgSeq;
    }

    /**
     * Sets the value of the rptgSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRange1Choice }
     *     
     */
    public void setRptgSeq(SequenceRange1Choice value) {
        this.rptgSeq = value;
    }

    /**
     * Gets the value of the lglSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLglSeqNb() {
        return lglSeqNb;
    }

    /**
     * Sets the value of the lglSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLglSeqNb(BigDecimal value) {
        this.lglSeqNb = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setFrToDt(DateTimePeriod1 value) {
        this.frToDt = value;
    }

    /**
     * Gets the value of the cpyDplctInd property.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyDplctInd() {
        return cpyDplctInd;
    }

    /**
     * Sets the value of the cpyDplctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public void setCpyDplctInd(CopyDuplicate1Code value) {
        this.cpyDplctInd = value;
    }

    /**
     * Gets the value of the rptgSrc property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingSource1Choice }
     *     
     */
    public ReportingSource1Choice getRptgSrc() {
        return rptgSrc;
    }

    /**
     * Sets the value of the rptgSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingSource1Choice }
     *     
     */
    public void setRptgSrc(ReportingSource1Choice value) {
        this.rptgSrc = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount41 }
     *     
     */
    public CashAccount41 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount41 }
     *     
     */
    public void setAcct(CashAccount41 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the rltdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getRltdAcct() {
        return rltdAcct;
    }

    /**
     * Sets the value of the rltdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setRltdAcct(CashAccount40 value) {
        this.rltdAcct = value;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountInterest4 }
     * 
     * 
     * @return
     *     The value of the intrst property.
     */
    public List<AccountInterest4> getIntrst() {
        if (intrst == null) {
            intrst = new ArrayList<>();
        }
        return this.intrst;
    }

    /**
     * Gets the value of the bal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance8 }
     * 
     * 
     * @return
     *     The value of the bal property.
     */
    public List<CashBalance8> getBal() {
        if (bal == null) {
            bal = new ArrayList<>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the txsSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTransactions6 }
     *     
     */
    public TotalTransactions6 getTxsSummry() {
        return txsSummry;
    }

    /**
     * Sets the value of the txsSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTransactions6 }
     *     
     */
    public void setTxsSummry(TotalTransactions6 value) {
        this.txsSummry = value;
    }

    /**
     * Gets the value of the ntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportEntry13 }
     * 
     * 
     * @return
     *     The value of the ntry property.
     */
    public List<ReportEntry13> getNtry() {
        if (ntry == null) {
            ntry = new ArrayList<>();
        }
        return this.ntry;
    }

    /**
     * Gets the value of the addtlStmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlStmtInf() {
        return addtlStmtInf;
    }

    /**
     * Sets the value of the addtlStmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlStmtInf(String value) {
        this.addtlStmtInf = value;
    }

}
