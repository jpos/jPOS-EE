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

package org.jpos.iso20022.acmt_001_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountOpeningInstructionV08 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountOpeningInstructionV08">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}MessageIdentification1"/>
 *         <element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}InvestmentFundOrder4" minOccurs="0"/>
 *         <element name="PrvsRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}AdditionalReference13" minOccurs="0"/>
 *         <element name="InstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}InvestmentAccountOpening4"/>
 *         <element name="InvstmtAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}InvestmentAccount73"/>
 *         <element name="AcctPties" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}AccountParties17"/>
 *         <element name="Intrmies" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Intermediary46" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Plcmnt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}ReferredAgent3" minOccurs="0"/>
 *         <element name="NewIsseAllcn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}NewIssueAllocation2" minOccurs="0"/>
 *         <element name="SvgsInvstmtPlan" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}InvestmentPlan17" maxOccurs="50" minOccurs="0"/>
 *         <element name="WdrwlInvstmtPlan" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}InvestmentPlan17" maxOccurs="10" minOccurs="0"/>
 *         <element name="CshSttlm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}CashSettlement3" maxOccurs="8" minOccurs="0"/>
 *         <element name="SvcLvlAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}DocumentToSend4" maxOccurs="30" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}AdditiononalInformation13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MktPrctcVrsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}MarketPracticeVersion1" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOpeningInstructionV08", propOrder = {
    "msgId",
    "ordrRef",
    "prvsRef",
    "instrDtls",
    "invstmtAcct",
    "acctPties",
    "intrmies",
    "plcmnt",
    "newIsseAllcn",
    "svgsInvstmtPlan",
    "wdrwlInvstmtPlan",
    "cshSttlm",
    "svcLvlAgrmt",
    "addtlInf",
    "mktPrctcVrsn",
    "xtnsn"
})
public class AccountOpeningInstructionV08 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "OrdrRef")
    protected InvestmentFundOrder4 ordrRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference13 prvsRef;
    @XmlElement(name = "InstrDtls", required = true)
    protected InvestmentAccountOpening4 instrDtls;
    @XmlElement(name = "InvstmtAcct", required = true)
    protected InvestmentAccount73 invstmtAcct;
    @XmlElement(name = "AcctPties", required = true)
    protected AccountParties17 acctPties;
    @XmlElement(name = "Intrmies")
    protected List<Intermediary46> intrmies;
    @XmlElement(name = "Plcmnt")
    protected ReferredAgent3 plcmnt;
    @XmlElement(name = "NewIsseAllcn")
    protected NewIssueAllocation2 newIsseAllcn;
    @XmlElement(name = "SvgsInvstmtPlan")
    protected List<InvestmentPlan17> svgsInvstmtPlan;
    @XmlElement(name = "WdrwlInvstmtPlan")
    protected List<InvestmentPlan17> wdrwlInvstmtPlan;
    @XmlElement(name = "CshSttlm")
    protected List<CashSettlement3> cshSttlm;
    @XmlElement(name = "SvcLvlAgrmt")
    protected List<DocumentToSend4> svcLvlAgrmt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditiononalInformation13> addtlInf;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundOrder4 }
     *     
     */
    public InvestmentFundOrder4 getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundOrder4 }
     *     
     */
    public void setOrdrRef(InvestmentFundOrder4 value) {
        this.ordrRef = value;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference13 }
     *     
     */
    public AdditionalReference13 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference13 }
     *     
     */
    public void setPrvsRef(AdditionalReference13 value) {
        this.prvsRef = value;
    }

    /**
     * Gets the value of the instrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOpening4 }
     *     
     */
    public InvestmentAccountOpening4 getInstrDtls() {
        return instrDtls;
    }

    /**
     * Sets the value of the instrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOpening4 }
     *     
     */
    public void setInstrDtls(InvestmentAccountOpening4 value) {
        this.instrDtls = value;
    }

    /**
     * Gets the value of the invstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount73 }
     *     
     */
    public InvestmentAccount73 getInvstmtAcct() {
        return invstmtAcct;
    }

    /**
     * Sets the value of the invstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount73 }
     *     
     */
    public void setInvstmtAcct(InvestmentAccount73 value) {
        this.invstmtAcct = value;
    }

    /**
     * Gets the value of the acctPties property.
     * 
     * @return
     *     possible object is
     *     {@link AccountParties17 }
     *     
     */
    public AccountParties17 getAcctPties() {
        return acctPties;
    }

    /**
     * Sets the value of the acctPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountParties17 }
     *     
     */
    public void setAcctPties(AccountParties17 value) {
        this.acctPties = value;
    }

    /**
     * Gets the value of the intrmies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary46 }
     * 
     * 
     * @return
     *     The value of the intrmies property.
     */
    public List<Intermediary46> getIntrmies() {
        if (intrmies == null) {
            intrmies = new ArrayList<>();
        }
        return this.intrmies;
    }

    /**
     * Gets the value of the plcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredAgent3 }
     *     
     */
    public ReferredAgent3 getPlcmnt() {
        return plcmnt;
    }

    /**
     * Sets the value of the plcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredAgent3 }
     *     
     */
    public void setPlcmnt(ReferredAgent3 value) {
        this.plcmnt = value;
    }

    /**
     * Gets the value of the newIsseAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link NewIssueAllocation2 }
     *     
     */
    public NewIssueAllocation2 getNewIsseAllcn() {
        return newIsseAllcn;
    }

    /**
     * Sets the value of the newIsseAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewIssueAllocation2 }
     *     
     */
    public void setNewIsseAllcn(NewIssueAllocation2 value) {
        this.newIsseAllcn = value;
    }

    /**
     * Gets the value of the svgsInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svgsInvstmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvgsInvstmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentPlan17 }
     * 
     * 
     * @return
     *     The value of the svgsInvstmtPlan property.
     */
    public List<InvestmentPlan17> getSvgsInvstmtPlan() {
        if (svgsInvstmtPlan == null) {
            svgsInvstmtPlan = new ArrayList<>();
        }
        return this.svgsInvstmtPlan;
    }

    /**
     * Gets the value of the wdrwlInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wdrwlInvstmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWdrwlInvstmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentPlan17 }
     * 
     * 
     * @return
     *     The value of the wdrwlInvstmtPlan property.
     */
    public List<InvestmentPlan17> getWdrwlInvstmtPlan() {
        if (wdrwlInvstmtPlan == null) {
            wdrwlInvstmtPlan = new ArrayList<>();
        }
        return this.wdrwlInvstmtPlan;
    }

    /**
     * Gets the value of the cshSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshSttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashSettlement3 }
     * 
     * 
     * @return
     *     The value of the cshSttlm property.
     */
    public List<CashSettlement3> getCshSttlm() {
        if (cshSttlm == null) {
            cshSttlm = new ArrayList<>();
        }
        return this.cshSttlm;
    }

    /**
     * Gets the value of the svcLvlAgrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcLvlAgrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcLvlAgrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentToSend4 }
     * 
     * 
     * @return
     *     The value of the svcLvlAgrmt property.
     */
    public List<DocumentToSend4> getSvcLvlAgrmt() {
        if (svcLvlAgrmt == null) {
            svcLvlAgrmt = new ArrayList<>();
        }
        return this.svcLvlAgrmt;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditiononalInformation13 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditiononalInformation13> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the mktPrctcVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public MarketPracticeVersion1 getMktPrctcVrsn() {
        return mktPrctcVrsn;
    }

    /**
     * Sets the value of the mktPrctcVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public void setMktPrctcVrsn(MarketPracticeVersion1 value) {
        this.mktPrctcVrsn = value;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
    }

}
