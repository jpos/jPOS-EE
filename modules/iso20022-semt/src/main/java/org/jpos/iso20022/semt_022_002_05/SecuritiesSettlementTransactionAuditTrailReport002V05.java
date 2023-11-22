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

package org.jpos.iso20022.semt_022_002_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementTransactionAuditTrailReport002V05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementTransactionAuditTrailReport002V05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}Pagination1"/>
 *         <element name="QryRef" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}TransactionIdentifications34" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}SecuritiesAccount37" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}BlockChainAddressWallet7" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}PartyIdentification156" minOccurs="0"/>
 *         <element name="StsTrl" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}StatusTrail11" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactionAuditTrailReport002V05", propOrder = {
    "pgntn",
    "qryRef",
    "txId",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "acctOwnr",
    "stsTrl"
})
public class SecuritiesSettlementTransactionAuditTrailReport002V05 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "QryRef")
    protected String qryRef;
    @XmlElement(name = "TxId")
    protected TransactionIdentifications34 txId;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount37 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet7 blckChainAdrOrWllt;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification156 acctOwnr;
    @XmlElement(name = "StsTrl")
    protected List<StatusTrail11> stsTrl;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setPgntn(Pagination1 value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the qryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRef() {
        return qryRef;
    }

    /**
     * Sets the value of the qryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryRef(String value) {
        this.qryRef = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications34 }
     *     
     */
    public TransactionIdentifications34 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications34 }
     *     
     */
    public void setTxId(TransactionIdentifications34 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount37 }
     *     
     */
    public SecuritiesAccount37 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount37 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount37 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public BlockChainAddressWallet7 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet7 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification156 }
     *     
     */
    public PartyIdentification156 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification156 }
     *     
     */
    public void setAcctOwnr(PartyIdentification156 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the stsTrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsTrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsTrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusTrail11 }
     * 
     * 
     * @return
     *     The value of the stsTrl property.
     */
    public List<StatusTrail11> getStsTrl() {
        if (stsTrl == null) {
            stsTrl = new ArrayList<>();
        }
        return this.stsTrl;
    }

}
