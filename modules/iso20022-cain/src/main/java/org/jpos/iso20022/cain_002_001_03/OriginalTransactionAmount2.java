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

package org.jpos.iso20022.cain_002_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalTransactionAmount2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalTransactionAmount2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmtQlfr" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}TypeOfAmount22Code" minOccurs="0"/>
 *         <element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}TransactionAmount1"/>
 *         <element name="CrdhldrBllgAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}Amount15" minOccurs="0"/>
 *         <element name="RcncltnAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.002.001.03}Amount15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalTransactionAmount2", propOrder = {
    "amtQlfr",
    "txAmt",
    "crdhldrBllgAmt",
    "rcncltnAmt"
})
public class OriginalTransactionAmount2 {

    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount22Code amtQlfr;
    @XmlElement(name = "TxAmt", required = true)
    protected TransactionAmount1 txAmt;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected Amount15 crdhldrBllgAmt;
    @XmlElement(name = "RcncltnAmt")
    protected Amount15 rcncltnAmt;

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount22Code }
     *     
     */
    public TypeOfAmount22Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount22Code }
     *     
     */
    public void setAmtQlfr(TypeOfAmount22Code value) {
        this.amtQlfr = value;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmount1 }
     *     
     */
    public TransactionAmount1 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmount1 }
     *     
     */
    public void setTxAmt(TransactionAmount1 value) {
        this.txAmt = value;
    }

    /**
     * Gets the value of the crdhldrBllgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount15 }
     *     
     */
    public Amount15 getCrdhldrBllgAmt() {
        return crdhldrBllgAmt;
    }

    /**
     * Sets the value of the crdhldrBllgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount15 }
     *     
     */
    public void setCrdhldrBllgAmt(Amount15 value) {
        this.crdhldrBllgAmt = value;
    }

    /**
     * Gets the value of the rcncltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount15 }
     *     
     */
    public Amount15 getRcncltnAmt() {
        return rcncltnAmt;
    }

    /**
     * Sets the value of the rcncltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount15 }
     *     
     */
    public void setRcncltnAmt(Amount15 value) {
        this.rcncltnAmt = value;
    }

}
