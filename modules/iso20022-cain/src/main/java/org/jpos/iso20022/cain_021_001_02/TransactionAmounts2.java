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

package org.jpos.iso20022.cain_021_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionAmounts2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionAmounts2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmtQlfr" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TypeOfAmount22Code" minOccurs="0"/>
 *         <element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}TransactionAmount1"/>
 *         <element name="CrdhldrBllgAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Amount15" minOccurs="0"/>
 *         <element name="RcncltnAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Amount15" minOccurs="0"/>
 *         <element name="DtldAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}DetailedAmount22" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrgnlTxAmts" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}OriginalTransactionAmount2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAmounts2", propOrder = {
    "amtQlfr",
    "txAmt",
    "crdhldrBllgAmt",
    "rcncltnAmt",
    "dtldAmt",
    "orgnlTxAmts"
})
public class TransactionAmounts2 {

    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount22Code amtQlfr;
    @XmlElement(name = "TxAmt", required = true)
    protected TransactionAmount1 txAmt;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected Amount15 crdhldrBllgAmt;
    @XmlElement(name = "RcncltnAmt")
    protected Amount15 rcncltnAmt;
    @XmlElement(name = "DtldAmt")
    protected List<DetailedAmount22> dtldAmt;
    @XmlElement(name = "OrgnlTxAmts")
    protected OriginalTransactionAmount2 orgnlTxAmts;

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

    /**
     * Gets the value of the dtldAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtldAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount22 }
     * 
     * 
     * @return
     *     The value of the dtldAmt property.
     */
    public List<DetailedAmount22> getDtldAmt() {
        if (dtldAmt == null) {
            dtldAmt = new ArrayList<>();
        }
        return this.dtldAmt;
    }

    /**
     * Gets the value of the orgnlTxAmts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionAmount2 }
     *     
     */
    public OriginalTransactionAmount2 getOrgnlTxAmts() {
        return orgnlTxAmts;
    }

    /**
     * Sets the value of the orgnlTxAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionAmount2 }
     *     
     */
    public void setOrgnlTxAmts(OriginalTransactionAmount2 value) {
        this.orgnlTxAmts = value;
    }

}
