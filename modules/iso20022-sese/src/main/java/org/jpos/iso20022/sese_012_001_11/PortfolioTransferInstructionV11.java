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

package org.jpos.iso20022.sese_012_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioTransferInstructionV11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PortfolioTransferInstructionV11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}MessageIdentification1"/>
 *         <element name="PoolRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}AdditionalReference11" minOccurs="0"/>
 *         <element name="PrvsRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}AdditionalReference10" minOccurs="0"/>
 *         <element name="RltdRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}AdditionalReference10" minOccurs="0"/>
 *         <element name="PmryIndvInvstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}IndividualPerson8" minOccurs="0"/>
 *         <element name="ScndryIndvInvstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}IndividualPerson8" minOccurs="0"/>
 *         <element name="OthrIndvInvstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}IndividualPerson8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmryCorpInvstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Organisation36" minOccurs="0"/>
 *         <element name="ScndryCorpInvstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Organisation36" minOccurs="0"/>
 *         <element name="OthrCorpInvstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Organisation36" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TrfrAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}InvestmentAccount69"/>
 *         <element name="NmneeAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}InvestmentAccount69" minOccurs="0"/>
 *         <element name="Trfee" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}PartyIdentification132"/>
 *         <element name="PdctTrf" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}PortfolioTransfer11" maxOccurs="unbounded"/>
 *         <element name="MktPrctcVrsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}MarketPracticeVersion1" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransferInstructionV11", propOrder = {
    "msgRef",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "pmryIndvInvstr",
    "scndryIndvInvstr",
    "othrIndvInvstr",
    "pmryCorpInvstr",
    "scndryCorpInvstr",
    "othrCorpInvstr",
    "trfrAcct",
    "nmneeAcct",
    "trfee",
    "pdctTrf",
    "mktPrctcVrsn",
    "xtnsn"
})
public class PortfolioTransferInstructionV11 {

    @XmlElement(name = "MsgRef", required = true)
    protected MessageIdentification1 msgRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference11 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference10 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "PmryIndvInvstr")
    protected IndividualPerson8 pmryIndvInvstr;
    @XmlElement(name = "ScndryIndvInvstr")
    protected IndividualPerson8 scndryIndvInvstr;
    @XmlElement(name = "OthrIndvInvstr")
    protected List<IndividualPerson8> othrIndvInvstr;
    @XmlElement(name = "PmryCorpInvstr")
    protected Organisation36 pmryCorpInvstr;
    @XmlElement(name = "ScndryCorpInvstr")
    protected Organisation36 scndryCorpInvstr;
    @XmlElement(name = "OthrCorpInvstr")
    protected List<Organisation36> othrCorpInvstr;
    @XmlElement(name = "TrfrAcct", required = true)
    protected InvestmentAccount69 trfrAcct;
    @XmlElement(name = "NmneeAcct")
    protected InvestmentAccount69 nmneeAcct;
    @XmlElement(name = "Trfee", required = true)
    protected PartyIdentification132 trfee;
    @XmlElement(name = "PdctTrf", required = true)
    protected List<PortfolioTransfer11> pdctTrf;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgRef() {
        return msgRef;
    }

    /**
     * Sets the value of the msgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgRef(MessageIdentification1 value) {
        this.msgRef = value;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference11 }
     *     
     */
    public AdditionalReference11 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference11 }
     *     
     */
    public void setPoolRef(AdditionalReference11 value) {
        this.poolRef = value;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setPrvsRef(AdditionalReference10 value) {
        this.prvsRef = value;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setRltdRef(AdditionalReference10 value) {
        this.rltdRef = value;
    }

    /**
     * Gets the value of the pmryIndvInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson8 }
     *     
     */
    public IndividualPerson8 getPmryIndvInvstr() {
        return pmryIndvInvstr;
    }

    /**
     * Sets the value of the pmryIndvInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson8 }
     *     
     */
    public void setPmryIndvInvstr(IndividualPerson8 value) {
        this.pmryIndvInvstr = value;
    }

    /**
     * Gets the value of the scndryIndvInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson8 }
     *     
     */
    public IndividualPerson8 getScndryIndvInvstr() {
        return scndryIndvInvstr;
    }

    /**
     * Sets the value of the scndryIndvInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson8 }
     *     
     */
    public void setScndryIndvInvstr(IndividualPerson8 value) {
        this.scndryIndvInvstr = value;
    }

    /**
     * Gets the value of the othrIndvInvstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrIndvInvstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrIndvInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPerson8 }
     * 
     * 
     * @return
     *     The value of the othrIndvInvstr property.
     */
    public List<IndividualPerson8> getOthrIndvInvstr() {
        if (othrIndvInvstr == null) {
            othrIndvInvstr = new ArrayList<>();
        }
        return this.othrIndvInvstr;
    }

    /**
     * Gets the value of the pmryCorpInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation36 }
     *     
     */
    public Organisation36 getPmryCorpInvstr() {
        return pmryCorpInvstr;
    }

    /**
     * Sets the value of the pmryCorpInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation36 }
     *     
     */
    public void setPmryCorpInvstr(Organisation36 value) {
        this.pmryCorpInvstr = value;
    }

    /**
     * Gets the value of the scndryCorpInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation36 }
     *     
     */
    public Organisation36 getScndryCorpInvstr() {
        return scndryCorpInvstr;
    }

    /**
     * Sets the value of the scndryCorpInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation36 }
     *     
     */
    public void setScndryCorpInvstr(Organisation36 value) {
        this.scndryCorpInvstr = value;
    }

    /**
     * Gets the value of the othrCorpInvstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCorpInvstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCorpInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation36 }
     * 
     * 
     * @return
     *     The value of the othrCorpInvstr property.
     */
    public List<Organisation36> getOthrCorpInvstr() {
        if (othrCorpInvstr == null) {
            othrCorpInvstr = new ArrayList<>();
        }
        return this.othrCorpInvstr;
    }

    /**
     * Gets the value of the trfrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount69 }
     *     
     */
    public InvestmentAccount69 getTrfrAcct() {
        return trfrAcct;
    }

    /**
     * Sets the value of the trfrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount69 }
     *     
     */
    public void setTrfrAcct(InvestmentAccount69 value) {
        this.trfrAcct = value;
    }

    /**
     * Gets the value of the nmneeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount69 }
     *     
     */
    public InvestmentAccount69 getNmneeAcct() {
        return nmneeAcct;
    }

    /**
     * Sets the value of the nmneeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount69 }
     *     
     */
    public void setNmneeAcct(InvestmentAccount69 value) {
        this.nmneeAcct = value;
    }

    /**
     * Gets the value of the trfee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PartyIdentification132 getTrfee() {
        return trfee;
    }

    /**
     * Sets the value of the trfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification132 }
     *     
     */
    public void setTrfee(PartyIdentification132 value) {
        this.trfee = value;
    }

    /**
     * Gets the value of the pdctTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdctTrf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctTrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortfolioTransfer11 }
     * 
     * 
     * @return
     *     The value of the pdctTrf property.
     */
    public List<PortfolioTransfer11> getPdctTrf() {
        if (pdctTrf == null) {
            pdctTrf = new ArrayList<>();
        }
        return this.pdctTrf;
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
