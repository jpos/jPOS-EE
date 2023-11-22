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

package org.jpos.iso20022.sese_035_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionTypeAndAdditionalParameters19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionTypeAndAdditionalParameters19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctOwnrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}RestrictedFINXMax16Text"/>
 *         <element name="AcctSvcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="SctiesFincgTxTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}SecuritiesFinancingTransactionType2Code"/>
 *         <element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}ReceiveDelivery1Code"/>
 *         <element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}DeliveryReceiptType2Code"/>
 *         <element name="CmonId" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="CorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}RestrictedFINXMax16Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTypeAndAdditionalParameters19", propOrder = {
    "acctOwnrTxId",
    "acctSvcrTxId",
    "sctiesFincgTxTp",
    "sctiesMvmntTp",
    "pmt",
    "cmonId",
    "poolId",
    "corpActnEvtId"
})
public class TransactionTypeAndAdditionalParameters19 {

    @XmlElement(name = "AcctOwnrTxId", required = true)
    protected String acctOwnrTxId;
    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "SctiesFincgTxTp", required = true)
    @XmlSchemaType(name = "string")
    protected SecuritiesFinancingTransactionType2Code sctiesFincgTxTp;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;

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
     * Gets the value of the sctiesFincgTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingTransactionType2Code }
     *     
     */
    public SecuritiesFinancingTransactionType2Code getSctiesFincgTxTp() {
        return sctiesFincgTxTp;
    }

    /**
     * Sets the value of the sctiesFincgTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingTransactionType2Code }
     *     
     */
    public void setSctiesFincgTxTp(SecuritiesFinancingTransactionType2Code value) {
        this.sctiesFincgTxTp = value;
    }

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public void setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public void setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
    }

    /**
     * Gets the value of the cmonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Sets the value of the cmonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonId(String value) {
        this.cmonId = value;
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

}
