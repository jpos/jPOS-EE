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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentIdentification7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentIdentification7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max35Text"/>
 *         <element name="UETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}UUIDv4Identifier"/>
 *         <element name="QId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}QueueTransactionIdentification1"/>
 *         <element name="LngBizId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}LongPaymentIdentification3"/>
 *         <element name="ShrtBizId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}ShortPaymentIdentification3"/>
 *         <element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max70Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification7Choice", propOrder = {
    "txId",
    "uetr",
    "qId",
    "lngBizId",
    "shrtBizId",
    "prtryId"
})
public class PaymentIdentification7Choice {

    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "UETR")
    protected String uetr;
    @XmlElement(name = "QId")
    protected QueueTransactionIdentification1 qId;
    @XmlElement(name = "LngBizId")
    protected LongPaymentIdentification3 lngBizId;
    @XmlElement(name = "ShrtBizId")
    protected ShortPaymentIdentification3 shrtBizId;
    @XmlElement(name = "PrtryId")
    protected String prtryId;

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
     * Gets the value of the uetr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUETR() {
        return uetr;
    }

    /**
     * Sets the value of the uetr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUETR(String value) {
        this.uetr = value;
    }

    /**
     * Gets the value of the qId property.
     * 
     * @return
     *     possible object is
     *     {@link QueueTransactionIdentification1 }
     *     
     */
    public QueueTransactionIdentification1 getQId() {
        return qId;
    }

    /**
     * Sets the value of the qId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueTransactionIdentification1 }
     *     
     */
    public void setQId(QueueTransactionIdentification1 value) {
        this.qId = value;
    }

    /**
     * Gets the value of the lngBizId property.
     * 
     * @return
     *     possible object is
     *     {@link LongPaymentIdentification3 }
     *     
     */
    public LongPaymentIdentification3 getLngBizId() {
        return lngBizId;
    }

    /**
     * Sets the value of the lngBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongPaymentIdentification3 }
     *     
     */
    public void setLngBizId(LongPaymentIdentification3 value) {
        this.lngBizId = value;
    }

    /**
     * Gets the value of the shrtBizId property.
     * 
     * @return
     *     possible object is
     *     {@link ShortPaymentIdentification3 }
     *     
     */
    public ShortPaymentIdentification3 getShrtBizId() {
        return shrtBizId;
    }

    /**
     * Sets the value of the shrtBizId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortPaymentIdentification3 }
     *     
     */
    public void setShrtBizId(ShortPaymentIdentification3 value) {
        this.shrtBizId = value;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtryId(String value) {
        this.prtryId = value;
    }

}
