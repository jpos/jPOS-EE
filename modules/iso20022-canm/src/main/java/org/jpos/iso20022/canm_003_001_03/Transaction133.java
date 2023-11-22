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

package org.jpos.iso20022.canm_003_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction133 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction133">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyXchgFctn" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}CardServiceType5Code"/>
 *         <element name="OthrKeyXchgFctn" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}Max256Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}TransactionIdentification12"/>
 *         <element name="KeyXchgTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}KeyType1Code" minOccurs="0"/>
 *         <element name="OthrKeyXchgTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="KeyXchgData" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}KeyExchangeData1" minOccurs="0"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction133", propOrder = {
    "keyXchgFctn",
    "othrKeyXchgFctn",
    "msgRsn",
    "altrnMsgRsn",
    "txId",
    "keyXchgTp",
    "othrKeyXchgTp",
    "keyXchgData",
    "addtlFee",
    "addtlData"
})
public class Transaction133 {

    @XmlElement(name = "KeyXchgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType5Code keyXchgFctn;
    @XmlElement(name = "OthrKeyXchgFctn")
    protected String othrKeyXchgFctn;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification12 txId;
    @XmlElement(name = "KeyXchgTp")
    @XmlSchemaType(name = "string")
    protected KeyType1Code keyXchgTp;
    @XmlElement(name = "OthrKeyXchgTp")
    protected String othrKeyXchgTp;
    @XmlElement(name = "KeyXchgData")
    protected KeyExchangeData1 keyXchgData;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the keyXchgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link CardServiceType5Code }
     *     
     */
    public CardServiceType5Code getKeyXchgFctn() {
        return keyXchgFctn;
    }

    /**
     * Sets the value of the keyXchgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardServiceType5Code }
     *     
     */
    public void setKeyXchgFctn(CardServiceType5Code value) {
        this.keyXchgFctn = value;
    }

    /**
     * Gets the value of the othrKeyXchgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrKeyXchgFctn() {
        return othrKeyXchgFctn;
    }

    /**
     * Sets the value of the othrKeyXchgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrKeyXchgFctn(String value) {
        this.othrKeyXchgFctn = value;
    }

    /**
     * Gets the value of the msgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the msgRsn property.
     */
    public List<String> getMsgRsn() {
        if (msgRsn == null) {
            msgRsn = new ArrayList<>();
        }
        return this.msgRsn;
    }

    /**
     * Gets the value of the altrnMsgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnMsgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the altrnMsgRsn property.
     */
    public List<String> getAltrnMsgRsn() {
        if (altrnMsgRsn == null) {
            altrnMsgRsn = new ArrayList<>();
        }
        return this.altrnMsgRsn;
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
     * Gets the value of the keyXchgTp property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType1Code }
     *     
     */
    public KeyType1Code getKeyXchgTp() {
        return keyXchgTp;
    }

    /**
     * Sets the value of the keyXchgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType1Code }
     *     
     */
    public void setKeyXchgTp(KeyType1Code value) {
        this.keyXchgTp = value;
    }

    /**
     * Gets the value of the othrKeyXchgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrKeyXchgTp() {
        return othrKeyXchgTp;
    }

    /**
     * Sets the value of the othrKeyXchgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrKeyXchgTp(String value) {
        this.othrKeyXchgTp = value;
    }

    /**
     * Gets the value of the keyXchgData property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangeData1 }
     *     
     */
    public KeyExchangeData1 getKeyXchgData() {
        return keyXchgData;
    }

    /**
     * Sets the value of the keyXchgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangeData1 }
     *     
     */
    public void setKeyXchgData(KeyExchangeData1 value) {
        this.keyXchgData = value;
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
