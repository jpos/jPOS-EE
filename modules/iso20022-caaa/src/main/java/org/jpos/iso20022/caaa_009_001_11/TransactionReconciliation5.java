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

package org.jpos.iso20022.caaa_009_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReconciliation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionReconciliation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClsPrd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.009.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RcncltnTxId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.009.001.11}TransactionIdentifier1"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.009.001.11}Max35Text"/>
 *         <element name="TxTtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.009.001.11}TransactionTotals12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlTxData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.009.001.11}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReconciliation5", propOrder = {
    "clsPrd",
    "rcncltnTxId",
    "rcncltnId",
    "txTtls",
    "addtlTxData"
})
public class TransactionReconciliation5 {

    @XmlElement(name = "ClsPrd")
    protected Boolean clsPrd;
    @XmlElement(name = "RcncltnTxId", required = true)
    protected TransactionIdentifier1 rcncltnTxId;
    @XmlElement(name = "RcncltnId", required = true)
    protected String rcncltnId;
    @XmlElement(name = "TxTtls")
    protected List<TransactionTotals12> txTtls;
    @XmlElement(name = "AddtlTxData")
    protected String addtlTxData;

    /**
     * Gets the value of the clsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsPrd() {
        return clsPrd;
    }

    /**
     * Sets the value of the clsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClsPrd(Boolean value) {
        this.clsPrd = value;
    }

    /**
     * Gets the value of the rcncltnTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getRcncltnTxId() {
        return rcncltnTxId;
    }

    /**
     * Sets the value of the rcncltnTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setRcncltnTxId(TransactionIdentifier1 value) {
        this.rcncltnTxId = value;
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
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotals12 }
     * 
     * 
     * @return
     *     The value of the txTtls property.
     */
    public List<TransactionTotals12> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the addtlTxData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxData() {
        return addtlTxData;
    }

    /**
     * Sets the value of the addtlTxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlTxData(String value) {
        this.addtlTxData = value;
    }

}
