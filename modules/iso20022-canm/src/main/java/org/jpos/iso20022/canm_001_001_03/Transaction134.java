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

package org.jpos.iso20022.canm_001_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction134 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction134">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtwkMgmtTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}NetworkManagementType1Code" minOccurs="0"/>
 *         <element name="OthrNtwkMgmtTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}Max256Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}TransactionIdentification12"/>
 *         <element name="NbOfMsgs" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}Number" minOccurs="0"/>
 *         <element name="MaxNbOfMsgs" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}Number" minOccurs="0"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxDesc" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}Max1000Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:canm.001.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction134", propOrder = {
    "ntwkMgmtTp",
    "othrNtwkMgmtTp",
    "msgRsn",
    "altrnMsgRsn",
    "txId",
    "nbOfMsgs",
    "maxNbOfMsgs",
    "addtlFee",
    "txDesc",
    "addtlData"
})
public class Transaction134 {

    @XmlElement(name = "NtwkMgmtTp")
    @XmlSchemaType(name = "string")
    protected NetworkManagementType1Code ntwkMgmtTp;
    @XmlElement(name = "OthrNtwkMgmtTp")
    protected String othrNtwkMgmtTp;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification12 txId;
    @XmlElement(name = "NbOfMsgs")
    protected BigDecimal nbOfMsgs;
    @XmlElement(name = "MaxNbOfMsgs")
    protected BigDecimal maxNbOfMsgs;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "TxDesc")
    protected String txDesc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the ntwkMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementType1Code }
     *     
     */
    public NetworkManagementType1Code getNtwkMgmtTp() {
        return ntwkMgmtTp;
    }

    /**
     * Sets the value of the ntwkMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementType1Code }
     *     
     */
    public void setNtwkMgmtTp(NetworkManagementType1Code value) {
        this.ntwkMgmtTp = value;
    }

    /**
     * Gets the value of the othrNtwkMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNtwkMgmtTp() {
        return othrNtwkMgmtTp;
    }

    /**
     * Sets the value of the othrNtwkMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrNtwkMgmtTp(String value) {
        this.othrNtwkMgmtTp = value;
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
     * Gets the value of the nbOfMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMsgs() {
        return nbOfMsgs;
    }

    /**
     * Sets the value of the nbOfMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfMsgs(BigDecimal value) {
        this.nbOfMsgs = value;
    }

    /**
     * Gets the value of the maxNbOfMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNbOfMsgs() {
        return maxNbOfMsgs;
    }

    /**
     * Sets the value of the maxNbOfMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxNbOfMsgs(BigDecimal value) {
        this.maxNbOfMsgs = value;
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
     * Gets the value of the txDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxDesc() {
        return txDesc;
    }

    /**
     * Sets the value of the txDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxDesc(String value) {
        this.txDesc = value;
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
