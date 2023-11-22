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

package org.jpos.iso20022.catp_007_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction21">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}TransactionIdentifier1"/>
 *         <element name="TxRspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ResponseType7"/>
 *         <element name="Actn" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Action7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CstmrSvcPrfl" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMCustomerProfile5" minOccurs="0"/>
 *         <element name="CcyConvs" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}CurrencyConversion10" minOccurs="0"/>
 *         <element name="AcctInf" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}CardAccount12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctStmtData" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMAccountStatement1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CcyXchg" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}CurrencyConversion5" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max10000Binary" minOccurs="0"/>
 *         <element name="Cmd" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMCommand7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction21", propOrder = {
    "txId",
    "txRspn",
    "actn",
    "cstmrSvcPrfl",
    "ccyConvs",
    "acctInf",
    "acctStmtData",
    "ccyXchg",
    "iccRltdData",
    "cmd"
})
public class ATMTransaction21 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType7 txRspn;
    @XmlElement(name = "Actn")
    protected List<Action7> actn;
    @XmlElement(name = "CstmrSvcPrfl")
    protected ATMCustomerProfile5 cstmrSvcPrfl;
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion10 ccyConvs;
    @XmlElement(name = "AcctInf")
    protected List<CardAccount12> acctInf;
    @XmlElement(name = "AcctStmtData")
    protected List<ATMAccountStatement1> acctStmtData;
    @XmlElement(name = "CcyXchg")
    protected CurrencyConversion5 ccyXchg;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;

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
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType7 }
     *     
     */
    public ResponseType7 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType7 }
     *     
     */
    public void setTxRspn(ResponseType7 value) {
        this.txRspn = value;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action7 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action7> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the cstmrSvcPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomerProfile5 }
     *     
     */
    public ATMCustomerProfile5 getCstmrSvcPrfl() {
        return cstmrSvcPrfl;
    }

    /**
     * Sets the value of the cstmrSvcPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile5 }
     *     
     */
    public void setCstmrSvcPrfl(ATMCustomerProfile5 value) {
        this.cstmrSvcPrfl = value;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion10 }
     *     
     */
    public CurrencyConversion10 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion10 }
     *     
     */
    public void setCcyConvs(CurrencyConversion10 value) {
        this.ccyConvs = value;
    }

    /**
     * Gets the value of the acctInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAccount12 }
     * 
     * 
     * @return
     *     The value of the acctInf property.
     */
    public List<CardAccount12> getAcctInf() {
        if (acctInf == null) {
            acctInf = new ArrayList<>();
        }
        return this.acctInf;
    }

    /**
     * Gets the value of the acctStmtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctStmtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctStmtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMAccountStatement1 }
     * 
     * 
     * @return
     *     The value of the acctStmtData property.
     */
    public List<ATMAccountStatement1> getAcctStmtData() {
        if (acctStmtData == null) {
            acctStmtData = new ArrayList<>();
        }
        return this.acctStmtData;
    }

    /**
     * Gets the value of the ccyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion5 }
     *     
     */
    public CurrencyConversion5 getCcyXchg() {
        return ccyXchg;
    }

    /**
     * Sets the value of the ccyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion5 }
     *     
     */
    public void setCcyXchg(CurrencyConversion5 value) {
        this.ccyXchg = value;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setICCRltdData(byte[] value) {
        this.iccRltdData = value;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand7 }
     * 
     * 
     * @return
     *     The value of the cmd property.
     */
    public List<ATMCommand7> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<>();
        }
        return this.cmd;
    }

}
