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

package org.jpos.iso20022.camt_079_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceMovement5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceMovement5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}CashAccount38" minOccurs="0"/>
 *         <element name="CshAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}SystemPartyIdentification8" minOccurs="0"/>
 *         <element name="CshAcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="StsAndRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}IntraBalanceStatusAndReason2" minOccurs="0"/>
 *         <element name="AcctOwnrTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Max35Text"/>
 *         <element name="AcctSvcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Max35Text" minOccurs="0"/>
 *         <element name="MktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PrcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Max35Text" minOccurs="0"/>
 *         <element name="MvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}IntraBalanceMovement6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceMovement5", propOrder = {
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "stsAndRsn",
    "acctOwnrTxId",
    "acctSvcrTxId",
    "mktInfrstrctrTxId",
    "prcrTxId",
    "poolId",
    "corpActnEvtId",
    "mvmntDtls"
})
public class IntraBalanceMovement5 {

    @XmlElement(name = "CshAcct")
    protected CashAccount38 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification8 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 cshAcctSvcr;
    @XmlElement(name = "StsAndRsn")
    protected IntraBalanceStatusAndReason2 stsAndRsn;
    @XmlElement(name = "AcctOwnrTxId", required = true)
    protected String acctOwnrTxId;
    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "PrcrTxId")
    protected String prcrTxId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "MvmntDtls")
    protected IntraBalanceMovement6 mvmntDtls;

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setCshAcct(CashAccount38 value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public void setCshAcctOwnr(SystemPartyIdentification8 value) {
        this.cshAcctOwnr = value;
    }

    /**
     * Gets the value of the cshAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCshAcctSvcr() {
        return cshAcctSvcr;
    }

    /**
     * Sets the value of the cshAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCshAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.cshAcctSvcr = value;
    }

    /**
     * Gets the value of the stsAndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceStatusAndReason2 }
     *     
     */
    public IntraBalanceStatusAndReason2 getStsAndRsn() {
        return stsAndRsn;
    }

    /**
     * Sets the value of the stsAndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceStatusAndReason2 }
     *     
     */
    public void setStsAndRsn(IntraBalanceStatusAndReason2 value) {
        this.stsAndRsn = value;
    }

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
    }

    /**
     * Gets the value of the acctSvcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrTxId() {
        return acctSvcrTxId;
    }

    /**
     * Sets the value of the acctSvcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcrTxId(String value) {
        this.acctSvcrTxId = value;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
    }

    /**
     * Gets the value of the prcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Sets the value of the prcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcrTxId(String value) {
        this.prcrTxId = value;
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolId(String value) {
        this.poolId = value;
    }

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
    }

    /**
     * Gets the value of the mvmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceMovement6 }
     *     
     */
    public IntraBalanceMovement6 getMvmntDtls() {
        return mvmntDtls;
    }

    /**
     * Sets the value of the mvmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceMovement6 }
     *     
     */
    public void setMvmntDtls(IntraBalanceMovement6 value) {
        this.mvmntDtls = value;
    }

}
