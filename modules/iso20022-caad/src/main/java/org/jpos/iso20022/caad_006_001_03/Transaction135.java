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

package org.jpos.iso20022.caad_006_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction135 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction135">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RcncltnFctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}ReconciliationFunction1Code"/>
 *         <element name="RcncltnActvtyTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}ReconciliationActivityType1Code" minOccurs="0"/>
 *         <element name="OthrRcncltnActvtyTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="RcncltnTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}CardServiceType4Code"/>
 *         <element name="OthrRcncltnTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}TransactionIdentification12" minOccurs="0"/>
 *         <element name="ReqdCcy" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}Exact3NumericText" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RcncltnTtls" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}TransactionTotals13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction135", propOrder = {
    "rcncltnFctn",
    "rcncltnActvtyTp",
    "othrRcncltnActvtyTp",
    "rcncltnTp",
    "othrRcncltnTp",
    "txId",
    "reqdCcy",
    "rcncltnTtls",
    "addtlFee",
    "addtlData"
})
public class Transaction135 {

    @XmlElement(name = "RcncltnFctn", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationFunction1Code rcncltnFctn;
    @XmlElement(name = "RcncltnActvtyTp")
    @XmlSchemaType(name = "string")
    protected ReconciliationActivityType1Code rcncltnActvtyTp;
    @XmlElement(name = "OthrRcncltnActvtyTp")
    protected String othrRcncltnActvtyTp;
    @XmlElement(name = "RcncltnTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType4Code rcncltnTp;
    @XmlElement(name = "OthrRcncltnTp")
    protected String othrRcncltnTp;
    @XmlElement(name = "TxId")
    protected TransactionIdentification12 txId;
    @XmlElement(name = "ReqdCcy")
    protected List<String> reqdCcy;
    @XmlElement(name = "RcncltnTtls")
    protected List<TransactionTotals13> rcncltnTtls;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the rcncltnFctn property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationFunction1Code }
     *     
     */
    public ReconciliationFunction1Code getRcncltnFctn() {
        return rcncltnFctn;
    }

    /**
     * Sets the value of the rcncltnFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationFunction1Code }
     *     
     */
    public void setRcncltnFctn(ReconciliationFunction1Code value) {
        this.rcncltnFctn = value;
    }

    /**
     * Gets the value of the rcncltnActvtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationActivityType1Code }
     *     
     */
    public ReconciliationActivityType1Code getRcncltnActvtyTp() {
        return rcncltnActvtyTp;
    }

    /**
     * Sets the value of the rcncltnActvtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationActivityType1Code }
     *     
     */
    public void setRcncltnActvtyTp(ReconciliationActivityType1Code value) {
        this.rcncltnActvtyTp = value;
    }

    /**
     * Gets the value of the othrRcncltnActvtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRcncltnActvtyTp() {
        return othrRcncltnActvtyTp;
    }

    /**
     * Sets the value of the othrRcncltnActvtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRcncltnActvtyTp(String value) {
        this.othrRcncltnActvtyTp = value;
    }

    /**
     * Gets the value of the rcncltnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardServiceType4Code }
     *     
     */
    public CardServiceType4Code getRcncltnTp() {
        return rcncltnTp;
    }

    /**
     * Sets the value of the rcncltnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardServiceType4Code }
     *     
     */
    public void setRcncltnTp(CardServiceType4Code value) {
        this.rcncltnTp = value;
    }

    /**
     * Gets the value of the othrRcncltnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRcncltnTp() {
        return othrRcncltnTp;
    }

    /**
     * Sets the value of the othrRcncltnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRcncltnTp(String value) {
        this.othrRcncltnTp = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification12 }
     *     
     */
    public TransactionIdentification12 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification12 }
     *     
     */
    public void setTxId(TransactionIdentification12 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the reqdCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the reqdCcy property.
     */
    public List<String> getReqdCcy() {
        if (reqdCcy == null) {
            reqdCcy = new ArrayList<>();
        }
        return this.reqdCcy;
    }

    /**
     * Gets the value of the rcncltnTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcncltnTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcncltnTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotals13 }
     * 
     * 
     * @return
     *     The value of the rcncltnTtls property.
     */
    public List<TransactionTotals13> getRcncltnTtls() {
        if (rcncltnTtls == null) {
            rcncltnTtls = new ArrayList<>();
        }
        return this.rcncltnTtls;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee2 }
     * 
     * 
     * @return
     *     The value of the addtlFee property.
     */
    public List<AdditionalFee2> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<>();
        }
        return this.addtlFee;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
