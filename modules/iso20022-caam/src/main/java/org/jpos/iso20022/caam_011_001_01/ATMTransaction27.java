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

package org.jpos.iso20022.caam_011_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction27 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction27">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}TransactionIdentifier1" minOccurs="0"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Xcptn" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}FailureReason8Code" maxOccurs="unbounded"/>
 *         <element name="XcptnDtl" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ElctrncPrsBal" type="{urn:iso:std:iso:20022:tech:xsd:caam.011.001.01}CurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction27", propOrder = {
    "txId",
    "rcncltnId",
    "xcptn",
    "xcptnDtl",
    "elctrncPrsBal"
})
public class ATMTransaction27 {

    @XmlElement(name = "TxId")
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "Xcptn", required = true)
    @XmlSchemaType(name = "string")
    protected List<FailureReason8Code> xcptn;
    @XmlElement(name = "XcptnDtl")
    protected List<String> xcptnDtl;
    @XmlElement(name = "ElctrncPrsBal")
    protected CurrencyAndAmount elctrncPrsBal;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setTxId(TransactionIdentifier1 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcncltnId(String value) {
        this.rcncltnId = value;
    }

    /**
     * Gets the value of the xcptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xcptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXcptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureReason8Code }
     * 
     * 
     * @return
     *     The value of the xcptn property.
     */
    public List<FailureReason8Code> getXcptn() {
        if (xcptn == null) {
            xcptn = new ArrayList<>();
        }
        return this.xcptn;
    }

    /**
     * Gets the value of the xcptnDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xcptnDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXcptnDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the xcptnDtl property.
     */
    public List<String> getXcptnDtl() {
        if (xcptnDtl == null) {
            xcptnDtl = new ArrayList<>();
        }
        return this.xcptnDtl;
    }

    /**
     * Gets the value of the elctrncPrsBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getElctrncPrsBal() {
        return elctrncPrsBal;
    }

    /**
     * Sets the value of the elctrncPrsBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setElctrncPrsBal(CurrencyAndAmount value) {
        this.elctrncPrsBal = value;
    }

}
