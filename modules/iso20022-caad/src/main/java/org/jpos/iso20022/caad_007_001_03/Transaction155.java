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

package org.jpos.iso20022.caad_007_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction155 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction155">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caad.007.001.03}TransactionIdentification12"/>
 *         <element name="ErrDtl" type="{urn:iso:std:iso:20022:tech:xsd:caad.007.001.03}ErrorDetails2" maxOccurs="unbounded"/>
 *         <element name="OrgnlMsg" type="{urn:iso:std:iso:20022:tech:xsd:caad.007.001.03}Max100KBinary" minOccurs="0"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:caad.007.001.03}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.007.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction155", propOrder = {
    "txId",
    "errDtl",
    "orgnlMsg",
    "addtlFee",
    "addtlData"
})
public class Transaction155 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification12 txId;
    @XmlElement(name = "ErrDtl", required = true)
    protected List<ErrorDetails2> errDtl;
    @XmlElement(name = "OrgnlMsg")
    protected byte[] orgnlMsg;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
     * Gets the value of the errDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDetails2 }
     * 
     * 
     * @return
     *     The value of the errDtl property.
     */
    public List<ErrorDetails2> getErrDtl() {
        if (errDtl == null) {
            errDtl = new ArrayList<>();
        }
        return this.errDtl;
    }

    /**
     * Gets the value of the orgnlMsg property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOrgnlMsg() {
        return orgnlMsg;
    }

    /**
     * Sets the value of the orgnlMsg property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOrgnlMsg(byte[] value) {
        this.orgnlMsg = value;
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
