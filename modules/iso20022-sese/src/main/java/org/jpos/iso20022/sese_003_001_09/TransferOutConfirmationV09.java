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

package org.jpos.iso20022.sese_003_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferOutConfirmationV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransferOutConfirmationV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}MessageIdentification1"/>
 *         <element name="PoolRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}AdditionalReference11" minOccurs="0"/>
 *         <element name="PrvsRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="RltdRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}Max35Text" minOccurs="0"/>
 *         <element name="TrfDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}Transfer37" maxOccurs="unbounded"/>
 *         <element name="AcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}InvestmentAccount70"/>
 *         <element name="SttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}ReceiveInformation20" minOccurs="0"/>
 *         <element name="MktPrctcVrsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}MarketPracticeVersion1" minOccurs="0"/>
 *         <element name="CpyDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}CopyInformation5" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferOutConfirmationV09", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "mstrRef",
    "trfDtls",
    "acctDtls",
    "sttlmDtls",
    "mktPrctcVrsn",
    "cpyDtls",
    "xtnsn"
})
public class TransferOutConfirmationV09 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference11 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference10 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfDtls", required = true)
    protected List<Transfer37> trfDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected InvestmentAccount70 acctDtls;
    @XmlElement(name = "SttlmDtls")
    protected ReceiveInformation20 sttlmDtls;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation5 cpyDtls;
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
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Gets the value of the trfDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trfDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrfDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transfer37 }
     * 
     * 
     * @return
     *     The value of the trfDtls property.
     */
    public List<Transfer37> getTrfDtls() {
        if (trfDtls == null) {
            trfDtls = new ArrayList<>();
        }
        return this.trfDtls;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount70 }
     *     
     */
    public InvestmentAccount70 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount70 }
     *     
     */
    public void setAcctDtls(InvestmentAccount70 value) {
        this.acctDtls = value;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveInformation20 }
     *     
     */
    public ReceiveInformation20 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveInformation20 }
     *     
     */
    public void setSttlmDtls(ReceiveInformation20 value) {
        this.sttlmDtls = value;
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
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation5 }
     *     
     */
    public CopyInformation5 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation5 }
     *     
     */
    public void setCpyDtls(CopyInformation5 value) {
        this.cpyDtls = value;
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
