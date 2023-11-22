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

package org.jpos.iso20022.acmt_003_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountModificationInstructionV08 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountModificationInstructionV08">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}MessageIdentification1"/>
 *         <element name="PrvsRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}AdditionalReference13" minOccurs="0"/>
 *         <element name="InstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}InvestmentAccountModification4" minOccurs="0"/>
 *         <element name="InvstmtAcctSelctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}AccountSelection3Choice"/>
 *         <element name="ModfdInvstmtAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}InvestmentAccount75" minOccurs="0"/>
 *         <element name="ModfdAcctPties" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}AccountParties18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ModfdIntrmies" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ModificationScope40" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ModfdPlcmnt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ModificationScope43" minOccurs="0"/>
 *         <element name="ModfdIsseAllcn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ModificationScope21" minOccurs="0"/>
 *         <element name="ModfdSvgsInvstmtPlan" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ModificationScope41" maxOccurs="50" minOccurs="0"/>
 *         <element name="ModfdWdrwlInvstmtPlan" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ModificationScope41" maxOccurs="10" minOccurs="0"/>
 *         <element name="ModfdCshSttlm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}CashSettlement4" maxOccurs="8" minOccurs="0"/>
 *         <element name="ModfdSvcLvlAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ModificationScope44" maxOccurs="30" minOccurs="0"/>
 *         <element name="ModfdAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ModificationScope45" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MktPrctcVrsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}MarketPracticeVersion1" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountModificationInstructionV08", propOrder = {
    "msgId",
    "prvsRef",
    "instrDtls",
    "invstmtAcctSelctn",
    "modfdInvstmtAcct",
    "modfdAcctPties",
    "modfdIntrmies",
    "modfdPlcmnt",
    "modfdIsseAllcn",
    "modfdSvgsInvstmtPlan",
    "modfdWdrwlInvstmtPlan",
    "modfdCshSttlm",
    "modfdSvcLvlAgrmt",
    "modfdAddtlInf",
    "mktPrctcVrsn",
    "xtnsn"
})
public class AccountModificationInstructionV08 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference13 prvsRef;
    @XmlElement(name = "InstrDtls")
    protected InvestmentAccountModification4 instrDtls;
    @XmlElement(name = "InvstmtAcctSelctn", required = true)
    protected AccountSelection3Choice invstmtAcctSelctn;
    @XmlElement(name = "ModfdInvstmtAcct")
    protected InvestmentAccount75 modfdInvstmtAcct;
    @XmlElement(name = "ModfdAcctPties")
    protected List<AccountParties18> modfdAcctPties;
    @XmlElement(name = "ModfdIntrmies")
    protected List<ModificationScope40> modfdIntrmies;
    @XmlElement(name = "ModfdPlcmnt")
    protected ModificationScope43 modfdPlcmnt;
    @XmlElement(name = "ModfdIsseAllcn")
    protected ModificationScope21 modfdIsseAllcn;
    @XmlElement(name = "ModfdSvgsInvstmtPlan")
    protected List<ModificationScope41> modfdSvgsInvstmtPlan;
    @XmlElement(name = "ModfdWdrwlInvstmtPlan")
    protected List<ModificationScope41> modfdWdrwlInvstmtPlan;
    @XmlElement(name = "ModfdCshSttlm")
    protected List<CashSettlement4> modfdCshSttlm;
    @XmlElement(name = "ModfdSvcLvlAgrmt")
    protected List<ModificationScope44> modfdSvcLvlAgrmt;
    @XmlElement(name = "ModfdAddtlInf")
    protected List<ModificationScope45> modfdAddtlInf;
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
     *     {@link InvestmentAccountModification4 }
     *     
     */
    public InvestmentAccountModification4 getInstrDtls() {
        return instrDtls;
    }

    /**
     * Sets the value of the instrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountModification4 }
     *     
     */
    public void setInstrDtls(InvestmentAccountModification4 value) {
        this.instrDtls = value;
    }

    /**
     * Gets the value of the invstmtAcctSelctn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSelection3Choice }
     *     
     */
    public AccountSelection3Choice getInvstmtAcctSelctn() {
        return invstmtAcctSelctn;
    }

    /**
     * Sets the value of the invstmtAcctSelctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSelection3Choice }
     *     
     */
    public void setInvstmtAcctSelctn(AccountSelection3Choice value) {
        this.invstmtAcctSelctn = value;
    }

    /**
     * Gets the value of the modfdInvstmtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount75 }
     *     
     */
    public InvestmentAccount75 getModfdInvstmtAcct() {
        return modfdInvstmtAcct;
    }

    /**
     * Sets the value of the modfdInvstmtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount75 }
     *     
     */
    public void setModfdInvstmtAcct(InvestmentAccount75 value) {
        this.modfdInvstmtAcct = value;
    }

    /**
     * Gets the value of the modfdAcctPties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdAcctPties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdAcctPties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountParties18 }
     * 
     * 
     * @return
     *     The value of the modfdAcctPties property.
     */
    public List<AccountParties18> getModfdAcctPties() {
        if (modfdAcctPties == null) {
            modfdAcctPties = new ArrayList<>();
        }
        return this.modfdAcctPties;
    }

    /**
     * Gets the value of the modfdIntrmies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdIntrmies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdIntrmies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope40 }
     * 
     * 
     * @return
     *     The value of the modfdIntrmies property.
     */
    public List<ModificationScope40> getModfdIntrmies() {
        if (modfdIntrmies == null) {
            modfdIntrmies = new ArrayList<>();
        }
        return this.modfdIntrmies;
    }

    /**
     * Gets the value of the modfdPlcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationScope43 }
     *     
     */
    public ModificationScope43 getModfdPlcmnt() {
        return modfdPlcmnt;
    }

    /**
     * Sets the value of the modfdPlcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationScope43 }
     *     
     */
    public void setModfdPlcmnt(ModificationScope43 value) {
        this.modfdPlcmnt = value;
    }

    /**
     * Gets the value of the modfdIsseAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationScope21 }
     *     
     */
    public ModificationScope21 getModfdIsseAllcn() {
        return modfdIsseAllcn;
    }

    /**
     * Sets the value of the modfdIsseAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationScope21 }
     *     
     */
    public void setModfdIsseAllcn(ModificationScope21 value) {
        this.modfdIsseAllcn = value;
    }

    /**
     * Gets the value of the modfdSvgsInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdSvgsInvstmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdSvgsInvstmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope41 }
     * 
     * 
     * @return
     *     The value of the modfdSvgsInvstmtPlan property.
     */
    public List<ModificationScope41> getModfdSvgsInvstmtPlan() {
        if (modfdSvgsInvstmtPlan == null) {
            modfdSvgsInvstmtPlan = new ArrayList<>();
        }
        return this.modfdSvgsInvstmtPlan;
    }

    /**
     * Gets the value of the modfdWdrwlInvstmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdWdrwlInvstmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdWdrwlInvstmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope41 }
     * 
     * 
     * @return
     *     The value of the modfdWdrwlInvstmtPlan property.
     */
    public List<ModificationScope41> getModfdWdrwlInvstmtPlan() {
        if (modfdWdrwlInvstmtPlan == null) {
            modfdWdrwlInvstmtPlan = new ArrayList<>();
        }
        return this.modfdWdrwlInvstmtPlan;
    }

    /**
     * Gets the value of the modfdCshSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdCshSttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdCshSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashSettlement4 }
     * 
     * 
     * @return
     *     The value of the modfdCshSttlm property.
     */
    public List<CashSettlement4> getModfdCshSttlm() {
        if (modfdCshSttlm == null) {
            modfdCshSttlm = new ArrayList<>();
        }
        return this.modfdCshSttlm;
    }

    /**
     * Gets the value of the modfdSvcLvlAgrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdSvcLvlAgrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdSvcLvlAgrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope44 }
     * 
     * 
     * @return
     *     The value of the modfdSvcLvlAgrmt property.
     */
    public List<ModificationScope44> getModfdSvcLvlAgrmt() {
        if (modfdSvcLvlAgrmt == null) {
            modfdSvcLvlAgrmt = new ArrayList<>();
        }
        return this.modfdSvcLvlAgrmt;
    }

    /**
     * Gets the value of the modfdAddtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the modfdAddtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope45 }
     * 
     * 
     * @return
     *     The value of the modfdAddtlInf property.
     */
    public List<ModificationScope45> getModfdAddtlInf() {
        if (modfdAddtlInf == null) {
            modfdAddtlInf = new ArrayList<>();
        }
        return this.modfdAddtlInf;
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
