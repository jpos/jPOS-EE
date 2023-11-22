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

package org.jpos.iso20022.camt_078_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceQueryCriteria9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceQueryCriteria9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}References36Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}IntraBalanceQueryStatus3" minOccurs="0"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}AccountIdentificationSearchCriteria2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}SystemPartyIdentification8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshAcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="BalTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}IntraBalanceType3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshSubBalId" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}GenericIdentification37" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}ImpliedCurrencyAmountRange1Choice" minOccurs="0"/>
 *         <element name="SttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}ImpliedCurrencyAmountRange1Choice" minOccurs="0"/>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}ActiveOrHistoricCurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntnddSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}DateAndDateTimeSearch5Choice" minOccurs="0"/>
 *         <element name="FctvSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}DateAndDateTimeSearch5Choice" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}PriorityNumeric4Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MsgOrgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}SystemPartyIdentification8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}DateAndDateTimeSearch5Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceQueryCriteria9", propOrder = {
    "refs",
    "sts",
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "balTp",
    "cshSubBalId",
    "sttlmAmt",
    "sttldAmt",
    "sttlmCcy",
    "intnddSttlmDt",
    "fctvSttlmDt",
    "prty",
    "msgOrgtr",
    "creDtTm"
})
public class IntraBalanceQueryCriteria9 {

    @XmlElement(name = "Refs")
    protected List<References36Choice> refs;
    @XmlElement(name = "Sts")
    protected IntraBalanceQueryStatus3 sts;
    @XmlElement(name = "CshAcct")
    protected List<AccountIdentificationSearchCriteria2Choice> cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected List<SystemPartyIdentification8> cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 cshAcctSvcr;
    @XmlElement(name = "BalTp")
    protected List<IntraBalanceType3> balTp;
    @XmlElement(name = "CshSubBalId")
    protected List<GenericIdentification37> cshSubBalId;
    @XmlElement(name = "SttlmAmt")
    protected ImpliedCurrencyAmountRange1Choice sttlmAmt;
    @XmlElement(name = "SttldAmt")
    protected ImpliedCurrencyAmountRange1Choice sttldAmt;
    @XmlElement(name = "SttlmCcy")
    protected List<String> sttlmCcy;
    @XmlElement(name = "IntnddSttlmDt")
    protected DateAndDateTimeSearch5Choice intnddSttlmDt;
    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTimeSearch5Choice fctvSttlmDt;
    @XmlElement(name = "Prty")
    protected List<PriorityNumeric4Choice> prty;
    @XmlElement(name = "MsgOrgtr")
    protected List<SystemPartyIdentification8> msgOrgtr;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeSearch5Choice creDtTm;

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link References36Choice }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<References36Choice> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceQueryStatus3 }
     *     
     */
    public IntraBalanceQueryStatus3 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceQueryStatus3 }
     *     
     */
    public void setSts(IntraBalanceQueryStatus3 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentificationSearchCriteria2Choice }
     * 
     * 
     * @return
     *     The value of the cshAcct property.
     */
    public List<AccountIdentificationSearchCriteria2Choice> getCshAcct() {
        if (cshAcct == null) {
            cshAcct = new ArrayList<>();
        }
        return this.cshAcct;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshAcctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyIdentification8 }
     * 
     * 
     * @return
     *     The value of the cshAcctOwnr property.
     */
    public List<SystemPartyIdentification8> getCshAcctOwnr() {
        if (cshAcctOwnr == null) {
            cshAcctOwnr = new ArrayList<>();
        }
        return this.cshAcctOwnr;
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
     * Gets the value of the balTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraBalanceType3 }
     * 
     * 
     * @return
     *     The value of the balTp property.
     */
    public List<IntraBalanceType3> getBalTp() {
        if (balTp == null) {
            balTp = new ArrayList<>();
        }
        return this.balTp;
    }

    /**
     * Gets the value of the cshSubBalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshSubBalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSubBalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification37 }
     * 
     * 
     * @return
     *     The value of the cshSubBalId property.
     */
    public List<GenericIdentification37> getCshSubBalId() {
        if (cshSubBalId == null) {
            cshSubBalId = new ArrayList<>();
        }
        return this.cshSubBalId;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public void setSttlmAmt(ImpliedCurrencyAmountRange1Choice value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public ImpliedCurrencyAmountRange1Choice getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpliedCurrencyAmountRange1Choice }
     *     
     */
    public void setSttldAmt(ImpliedCurrencyAmountRange1Choice value) {
        this.sttldAmt = value;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the sttlmCcy property.
     */
    public List<String> getSttlmCcy() {
        if (sttlmCcy == null) {
            sttlmCcy = new ArrayList<>();
        }
        return this.sttlmCcy;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public void setIntnddSttlmDt(DateAndDateTimeSearch5Choice value) {
        this.intnddSttlmDt = value;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public void setFctvSttlmDt(DateAndDateTimeSearch5Choice value) {
        this.fctvSttlmDt = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityNumeric4Choice }
     * 
     * 
     * @return
     *     The value of the prty property.
     */
    public List<PriorityNumeric4Choice> getPrty() {
        if (prty == null) {
            prty = new ArrayList<>();
        }
        return this.prty;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgOrgtr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgOrgtr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPartyIdentification8 }
     * 
     * 
     * @return
     *     The value of the msgOrgtr property.
     */
    public List<SystemPartyIdentification8> getMsgOrgtr() {
        if (msgOrgtr == null) {
            msgOrgtr = new ArrayList<>();
        }
        return this.msgOrgtr;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public DateAndDateTimeSearch5Choice getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeSearch5Choice }
     *     
     */
    public void setCreDtTm(DateAndDateTimeSearch5Choice value) {
        this.creDtTm = value;
    }

}
