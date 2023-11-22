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

package org.jpos.iso20022.acmt_002_001_08;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccount204 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashAccount204">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ActiveCurrencyCode"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}AccountIdentificationAndName5"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}FinancialInstitutionIdentification11Choice" minOccurs="0"/>
 *         <element name="AcctSvcrBrnch" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}BranchData4" minOccurs="0"/>
 *         <element name="AcctOwnrOthrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}GenericIdentification82" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InvstmtAcctTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}AccountType2Choice" minOccurs="0"/>
 *         <element name="CdtDbt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}CreditDebit3Code" minOccurs="0"/>
 *         <element name="SttlmInstrRsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}SettlementInstructionReason1Choice" minOccurs="0"/>
 *         <element name="CshAcctPurp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}CashAccountType3Choice" minOccurs="0"/>
 *         <element name="CshAcctDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}AccountDesignation1Choice" minOccurs="0"/>
 *         <element name="DvddPctg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PercentageBoundedRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount204", propOrder = {
    "sttlmCcy",
    "id",
    "acctOwnr",
    "acctSvcr",
    "acctSvcrBrnch",
    "acctOwnrOthrId",
    "invstmtAcctTp",
    "cdtDbt",
    "sttlmInstrRsn",
    "cshAcctPurp",
    "cshAcctDsgnt",
    "dvddPctg"
})
public class CashAccount204 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "Id", required = true)
    protected AccountIdentificationAndName5 id;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification125Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected FinancialInstitutionIdentification11Choice acctSvcr;
    @XmlElement(name = "AcctSvcrBrnch")
    protected BranchData4 acctSvcrBrnch;
    @XmlElement(name = "AcctOwnrOthrId")
    protected List<GenericIdentification82> acctOwnrOthrId;
    @XmlElement(name = "InvstmtAcctTp")
    protected AccountType2Choice invstmtAcctTp;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "SttlmInstrRsn")
    protected SettlementInstructionReason1Choice sttlmInstrRsn;
    @XmlElement(name = "CshAcctPurp")
    protected CashAccountType3Choice cshAcctPurp;
    @XmlElement(name = "CshAcctDsgnt")
    protected AccountDesignation1Choice cshAcctDsgnt;
    @XmlElement(name = "DvddPctg")
    protected BigDecimal dvddPctg;

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcy(String value) {
        this.sttlmCcy = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public void setId(AccountIdentificationAndName5 value) {
        this.id = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setAcctOwnr(PartyIdentification125Choice value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public FinancialInstitutionIdentification11Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public void setAcctSvcr(FinancialInstitutionIdentification11Choice value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the acctSvcrBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData4 }
     *     
     */
    public BranchData4 getAcctSvcrBrnch() {
        return acctSvcrBrnch;
    }

    /**
     * Sets the value of the acctSvcrBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData4 }
     *     
     */
    public void setAcctSvcrBrnch(BranchData4 value) {
        this.acctSvcrBrnch = value;
    }

    /**
     * Gets the value of the acctOwnrOthrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctOwnrOthrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctOwnrOthrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification82 }
     * 
     * 
     * @return
     *     The value of the acctOwnrOthrId property.
     */
    public List<GenericIdentification82> getAcctOwnrOthrId() {
        if (acctOwnrOthrId == null) {
            acctOwnrOthrId = new ArrayList<>();
        }
        return this.acctOwnrOthrId;
    }

    /**
     * Gets the value of the invstmtAcctTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType2Choice }
     *     
     */
    public AccountType2Choice getInvstmtAcctTp() {
        return invstmtAcctTp;
    }

    /**
     * Sets the value of the invstmtAcctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType2Choice }
     *     
     */
    public void setInvstmtAcctTp(AccountType2Choice value) {
        this.invstmtAcctTp = value;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public void setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
    }

    /**
     * Gets the value of the sttlmInstrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstructionReason1Choice }
     *     
     */
    public SettlementInstructionReason1Choice getSttlmInstrRsn() {
        return sttlmInstrRsn;
    }

    /**
     * Sets the value of the sttlmInstrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstructionReason1Choice }
     *     
     */
    public void setSttlmInstrRsn(SettlementInstructionReason1Choice value) {
        this.sttlmInstrRsn = value;
    }

    /**
     * Gets the value of the cshAcctPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType3Choice }
     *     
     */
    public CashAccountType3Choice getCshAcctPurp() {
        return cshAcctPurp;
    }

    /**
     * Sets the value of the cshAcctPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType3Choice }
     *     
     */
    public void setCshAcctPurp(CashAccountType3Choice value) {
        this.cshAcctPurp = value;
    }

    /**
     * Gets the value of the cshAcctDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDesignation1Choice }
     *     
     */
    public AccountDesignation1Choice getCshAcctDsgnt() {
        return cshAcctDsgnt;
    }

    /**
     * Sets the value of the cshAcctDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDesignation1Choice }
     *     
     */
    public void setCshAcctDsgnt(AccountDesignation1Choice value) {
        this.cshAcctDsgnt = value;
    }

    /**
     * Gets the value of the dvddPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDvddPctg() {
        return dvddPctg;
    }

    /**
     * Sets the value of the dvddPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDvddPctg(BigDecimal value) {
        this.dvddPctg = value;
    }

}
