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

package org.jpos.iso20022.tsmt_041_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReportItems3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionReportItems3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}Max35Text"/>
 *         <element name="EstblishdBaselnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}DocumentIdentification3" minOccurs="0"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}TransactionStatus4"/>
 *         <element name="UsrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}DocumentIdentification5" maxOccurs="2" minOccurs="0"/>
 *         <element name="PurchsOrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}DocumentIdentification7"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}PartyIdentification26"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}PartyIdentification26"/>
 *         <element name="BuyrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}BICIdentification1"/>
 *         <element name="BuyrBkCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}CountryCode"/>
 *         <element name="SellrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}BICIdentification1"/>
 *         <element name="SellrBkCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}CountryCode"/>
 *         <element name="OblgrBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}BICIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubmitgBk" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}BICIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OutsdngAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}CurrencyAndAmount"/>
 *         <element name="TtlNetAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}CurrencyAndAmount"/>
 *         <element name="PdgReqForActn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.041.001.03}PendingActivity2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReportItems3", propOrder = {
    "txId",
    "estblishdBaselnId",
    "txSts",
    "usrTxRef",
    "purchsOrdrRef",
    "buyr",
    "sellr",
    "buyrBk",
    "buyrBkCtry",
    "sellrBk",
    "sellrBkCtry",
    "oblgrBk",
    "submitgBk",
    "outsdngAmt",
    "ttlNetAmt",
    "pdgReqForActn"
})
public class TransactionReportItems3 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "EstblishdBaselnId")
    protected DocumentIdentification3 estblishdBaselnId;
    @XmlElement(name = "TxSts", required = true)
    protected TransactionStatus4 txSts;
    @XmlElement(name = "UsrTxRef")
    protected List<DocumentIdentification5> usrTxRef;
    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification26 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification26 sellr;
    @XmlElement(name = "BuyrBk", required = true)
    protected BICIdentification1 buyrBk;
    @XmlElement(name = "BuyrBkCtry", required = true)
    protected String buyrBkCtry;
    @XmlElement(name = "SellrBk", required = true)
    protected BICIdentification1 sellrBk;
    @XmlElement(name = "SellrBkCtry", required = true)
    protected String sellrBkCtry;
    @XmlElement(name = "OblgrBk")
    protected List<BICIdentification1> oblgrBk;
    @XmlElement(name = "SubmitgBk")
    protected List<BICIdentification1> submitgBk;
    @XmlElement(name = "OutsdngAmt", required = true)
    protected CurrencyAndAmount outsdngAmt;
    @XmlElement(name = "TtlNetAmt", required = true)
    protected CurrencyAndAmount ttlNetAmt;
    @XmlElement(name = "PdgReqForActn")
    protected List<PendingActivity2> pdgReqForActn;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the estblishdBaselnId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public DocumentIdentification3 getEstblishdBaselnId() {
        return estblishdBaselnId;
    }

    /**
     * Sets the value of the estblishdBaselnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification3 }
     *     
     */
    public void setEstblishdBaselnId(DocumentIdentification3 value) {
        this.estblishdBaselnId = value;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus4 }
     *     
     */
    public TransactionStatus4 getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus4 }
     *     
     */
    public void setTxSts(TransactionStatus4 value) {
        this.txSts = value;
    }

    /**
     * Gets the value of the usrTxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the usrTxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsrTxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification5 }
     * 
     * 
     * @return
     *     The value of the usrTxRef property.
     */
    public List<DocumentIdentification5> getUsrTxRef() {
        if (usrTxRef == null) {
            usrTxRef = new ArrayList<>();
        }
        return this.usrTxRef;
    }

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public void setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setBuyr(PartyIdentification26 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public void setSellr(PartyIdentification26 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the buyrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getBuyrBk() {
        return buyrBk;
    }

    /**
     * Sets the value of the buyrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setBuyrBk(BICIdentification1 value) {
        this.buyrBk = value;
    }

    /**
     * Gets the value of the buyrBkCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrBkCtry() {
        return buyrBkCtry;
    }

    /**
     * Sets the value of the buyrBkCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyrBkCtry(String value) {
        this.buyrBkCtry = value;
    }

    /**
     * Gets the value of the sellrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSellrBk() {
        return sellrBk;
    }

    /**
     * Sets the value of the sellrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public void setSellrBk(BICIdentification1 value) {
        this.sellrBk = value;
    }

    /**
     * Gets the value of the sellrBkCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellrBkCtry() {
        return sellrBkCtry;
    }

    /**
     * Sets the value of the sellrBkCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellrBkCtry(String value) {
        this.sellrBkCtry = value;
    }

    /**
     * Gets the value of the oblgrBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the oblgrBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOblgrBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the oblgrBk property.
     */
    public List<BICIdentification1> getOblgrBk() {
        if (oblgrBk == null) {
            oblgrBk = new ArrayList<>();
        }
        return this.oblgrBk;
    }

    /**
     * Gets the value of the submitgBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the submitgBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitgBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the submitgBk property.
     */
    public List<BICIdentification1> getSubmitgBk() {
        if (submitgBk == null) {
            submitgBk = new ArrayList<>();
        }
        return this.submitgBk;
    }

    /**
     * Gets the value of the outsdngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getOutsdngAmt() {
        return outsdngAmt;
    }

    /**
     * Sets the value of the outsdngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setOutsdngAmt(CurrencyAndAmount value) {
        this.outsdngAmt = value;
    }

    /**
     * Gets the value of the ttlNetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlNetAmt() {
        return ttlNetAmt;
    }

    /**
     * Sets the value of the ttlNetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTtlNetAmt(CurrencyAndAmount value) {
        this.ttlNetAmt = value;
    }

    /**
     * Gets the value of the pdgReqForActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdgReqForActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgReqForActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingActivity2 }
     * 
     * 
     * @return
     *     The value of the pdgReqForActn property.
     */
    public List<PendingActivity2> getPdgReqForActn() {
        if (pdgReqForActn == null) {
            pdgReqForActn = new ArrayList<>();
        }
        return this.pdgReqForActn;
    }

}
