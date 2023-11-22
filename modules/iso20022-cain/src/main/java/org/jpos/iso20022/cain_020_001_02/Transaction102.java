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

package org.jpos.iso20022.cain_020_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction102 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction102">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmddData" type="{urn:iso:std:iso:20022:tech:xsd:cain.020.001.02}DetailedError1" maxOccurs="unbounded"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:cain.020.001.02}TransactionIdentification10"/>
 *         <element name="OrgnlMsg" type="{urn:iso:std:iso:20022:tech:xsd:cain.020.001.02}Max100KBinary" minOccurs="0"/>
 *         <element name="MsgAmdd" type="{urn:iso:std:iso:20022:tech:xsd:cain.020.001.02}Max100KBinary" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.020.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction102", propOrder = {
    "amddData",
    "txId",
    "orgnlMsg",
    "msgAmdd",
    "addtlData"
})
public class Transaction102 {

    @XmlElement(name = "AmddData", required = true)
    protected List<DetailedError1> amddData;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification10 txId;
    @XmlElement(name = "OrgnlMsg")
    protected byte[] orgnlMsg;
    @XmlElement(name = "MsgAmdd")
    protected byte[] msgAmdd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the amddData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amddData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmddData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedError1 }
     * 
     * 
     * @return
     *     The value of the amddData property.
     */
    public List<DetailedError1> getAmddData() {
        if (amddData == null) {
            amddData = new ArrayList<>();
        }
        return this.amddData;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification10 }
     *     
     */
    public TransactionIdentification10 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification10 }
     *     
     */
    public void setTxId(TransactionIdentification10 value) {
        this.txId = value;
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
     * Gets the value of the msgAmdd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgAmdd() {
        return msgAmdd;
    }

    /**
     * Sets the value of the msgAmdd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMsgAmdd(byte[] value) {
        this.msgAmdd = value;
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
