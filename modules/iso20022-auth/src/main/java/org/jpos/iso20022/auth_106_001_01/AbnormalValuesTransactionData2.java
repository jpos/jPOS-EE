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

package org.jpos.iso20022.auth_106_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbnormalValuesTransactionData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AbnormalValuesTransactionData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}TradeTransactionIdentification24"/>
 *         <element name="NtnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}NotionalAmountLegs5" minOccurs="0"/>
 *         <element name="NtnlQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}NotionalQuantityLegs5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalValuesTransactionData2", propOrder = {
    "txId",
    "ntnlAmt",
    "ntnlQty"
})
public class AbnormalValuesTransactionData2 {

    @XmlElement(name = "TxId", required = true)
    protected TradeTransactionIdentification24 txId;
    @XmlElement(name = "NtnlAmt")
    protected NotionalAmountLegs5 ntnlAmt;
    @XmlElement(name = "NtnlQty")
    protected NotionalQuantityLegs5 ntnlQty;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification24 }
     *     
     */
    public TradeTransactionIdentification24 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification24 }
     *     
     */
    public void setTxId(TradeTransactionIdentification24 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the ntnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountLegs5 }
     *     
     */
    public NotionalAmountLegs5 getNtnlAmt() {
        return ntnlAmt;
    }

    /**
     * Sets the value of the ntnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountLegs5 }
     *     
     */
    public void setNtnlAmt(NotionalAmountLegs5 value) {
        this.ntnlAmt = value;
    }

    /**
     * Gets the value of the ntnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalQuantityLegs5 }
     *     
     */
    public NotionalQuantityLegs5 getNtnlQty() {
        return ntnlQty;
    }

    /**
     * Sets the value of the ntnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalQuantityLegs5 }
     *     
     */
    public void setNtnlQty(NotionalQuantityLegs5 value) {
        this.ntnlQty = value;
    }

}
