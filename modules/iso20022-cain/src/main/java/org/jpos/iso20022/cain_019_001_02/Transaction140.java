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

package org.jpos.iso20022.cain_019_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction140 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction140">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}ISO8583TransactionTypeCode"/>
 *         <element name="TxSubTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}AdditionalService2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SpclPrgrmmQlfctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}SpecialProgrammeQualification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}TransactionIdentification18"/>
 *         <element name="RcncltnAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}Amount15" minOccurs="0"/>
 *         <element name="AddtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}AdditionalAmounts3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctBal" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}AccountBalance2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctFr" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}AccountDetails3" minOccurs="0"/>
 *         <element name="TxDesc" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}Max1000Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction140", propOrder = {
    "txTp",
    "txSubTp",
    "addtlSvc",
    "spclPrgrmmQlfctn",
    "txId",
    "rcncltnAmt",
    "addtlAmt",
    "addtlFee",
    "acctBal",
    "acctFr",
    "txDesc",
    "addtlData"
})
public class Transaction140 {

    @XmlElement(name = "TxTp", required = true)
    protected String txTp;
    @XmlElement(name = "TxSubTp")
    protected String txSubTp;
    @XmlElement(name = "AddtlSvc")
    protected List<AdditionalService2> addtlSvc;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification1> spclPrgrmmQlfctn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification18 txId;
    @XmlElement(name = "RcncltnAmt")
    protected Amount15 rcncltnAmt;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts3> addtlAmt;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AcctBal")
    protected List<AccountBalance2> acctBal;
    @XmlElement(name = "AcctFr")
    protected AccountDetails3 acctFr;
    @XmlElement(name = "TxDesc")
    protected String txDesc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTp(String value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the txSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSubTp() {
        return txSubTp;
    }

    /**
     * Sets the value of the txSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxSubTp(String value) {
        this.txSubTp = value;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalService2 }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<AdditionalService2> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the spclPrgrmmQlfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spclPrgrmmQlfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpclPrgrmmQlfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProgrammeQualification1 }
     * 
     * 
     * @return
     *     The value of the spclPrgrmmQlfctn property.
     */
    public List<SpecialProgrammeQualification1> getSpclPrgrmmQlfctn() {
        if (spclPrgrmmQlfctn == null) {
            spclPrgrmmQlfctn = new ArrayList<>();
        }
        return this.spclPrgrmmQlfctn;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification18 }
     *     
     */
    public TransactionIdentification18 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification18 }
     *     
     */
    public void setTxId(TransactionIdentification18 value) {
        this.txId = value;
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
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAmounts3 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<AdditionalAmounts3> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
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
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBalance2 }
     * 
     * 
     * @return
     *     The value of the acctBal property.
     */
    public List<AccountBalance2> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetails3 }
     *     
     */
    public AccountDetails3 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetails3 }
     *     
     */
    public void setAcctFr(AccountDetails3 value) {
        this.acctFr = value;
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
