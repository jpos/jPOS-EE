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
 * <p>Java class for MissingValuationsTransactionData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MissingValuationsTransactionData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}TradeTransactionIdentification24"/>
 *         <element name="ValtnAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}AmountAndDirection106" minOccurs="0"/>
 *         <element name="ValtnTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.106.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingValuationsTransactionData2", propOrder = {
    "txId",
    "valtnAmt",
    "valtnTmStmp"
})
public class MissingValuationsTransactionData2 {

    @XmlElement(name = "TxId", required = true)
    protected TradeTransactionIdentification24 txId;
    @XmlElement(name = "ValtnAmt")
    protected AmountAndDirection106 valtnAmt;
    @XmlElement(name = "ValtnTmStmp")
    protected DateAndDateTime2Choice valtnTmStmp;

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
     * Gets the value of the valtnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getValtnAmt() {
        return valtnAmt;
    }

    /**
     * Sets the value of the valtnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public void setValtnAmt(AmountAndDirection106 value) {
        this.valtnAmt = value;
    }

    /**
     * Gets the value of the valtnTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValtnTmStmp() {
        return valtnTmStmp;
    }

    /**
     * Sets the value of the valtnTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setValtnTmStmp(DateAndDateTime2Choice value) {
        this.valtnTmStmp = value;
    }

}
