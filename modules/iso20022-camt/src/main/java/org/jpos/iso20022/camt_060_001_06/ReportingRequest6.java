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

package org.jpos.iso20022.camt_060_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingRequest6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportingRequest6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}Max35Text" minOccurs="0"/>
 *         <element name="ReqdMsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}Max35Text"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}CashAccount40" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}Party40Choice"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}ReportingPeriod5" minOccurs="0"/>
 *         <element name="RptgSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}SequenceRange1Choice" minOccurs="0"/>
 *         <element name="ReqdTxTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}TransactionType2" minOccurs="0"/>
 *         <element name="ReqdBalTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.06}BalanceType13" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRequest6", propOrder = {
    "id",
    "reqdMsgNmId",
    "acct",
    "acctOwnr",
    "acctSvcr",
    "rptgPrd",
    "rptgSeq",
    "reqdTxTp",
    "reqdBalTp"
})
public class ReportingRequest6 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ReqdMsgNmId", required = true)
    protected String reqdMsgNmId;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "AcctOwnr", required = true)
    protected Party40Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;
    @XmlElement(name = "RptgPrd")
    protected ReportingPeriod5 rptgPrd;
    @XmlElement(name = "RptgSeq")
    protected SequenceRange1Choice rptgSeq;
    @XmlElement(name = "ReqdTxTp")
    protected TransactionType2 reqdTxTp;
    @XmlElement(name = "ReqdBalTp")
    protected List<BalanceType13> reqdBalTp;

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
     * Gets the value of the reqdMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdMsgNmId() {
        return reqdMsgNmId;
    }

    /**
     * Sets the value of the reqdMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdMsgNmId(String value) {
        this.reqdMsgNmId = value;
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
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setAcctOwnr(Party40Choice value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriod5 }
     *     
     */
    public ReportingPeriod5 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriod5 }
     *     
     */
    public void setRptgPrd(ReportingPeriod5 value) {
        this.rptgPrd = value;
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
     * Gets the value of the reqdTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType2 }
     *     
     */
    public TransactionType2 getReqdTxTp() {
        return reqdTxTp;
    }

    /**
     * Sets the value of the reqdTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType2 }
     *     
     */
    public void setReqdTxTp(TransactionType2 value) {
        this.reqdTxTp = value;
    }

    /**
     * Gets the value of the reqdBalTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdBalTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdBalTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceType13 }
     * 
     * 
     * @return
     *     The value of the reqdBalTp property.
     */
    public List<BalanceType13> getReqdBalTp() {
        if (reqdBalTp == null) {
            reqdBalTp = new ArrayList<>();
        }
        return this.reqdBalTp;
    }

}
