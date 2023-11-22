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

package org.jpos.iso20022.catp_001_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshDspnsd" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}TransactionIdentifier1"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AcctData" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}CardAccount7" minOccurs="0"/>
 *         <element name="PrtctdAcctData" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}ContentInformationType10" minOccurs="0"/>
 *         <element name="TtlReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}AmountAndCurrency1" minOccurs="0"/>
 *         <element name="DtldReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}DetailedAmount12" minOccurs="0"/>
 *         <element name="CcyConvsRslt" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}CurrencyConversion9" minOccurs="0"/>
 *         <element name="SelctdMixTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}Max35Text" minOccurs="0"/>
 *         <element name="SelctdMix" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}ATMMediaMix1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReqdRct" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}Max10000Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction13", propOrder = {
    "cshDspnsd",
    "txId",
    "rcncltnId",
    "acctData",
    "prtctdAcctData",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "ccyConvsRslt",
    "selctdMixTp",
    "selctdMix",
    "reqdRct",
    "iccRltdData"
})
public class ATMTransaction13 {

    @XmlElement(name = "CshDspnsd")
    protected Boolean cshDspnsd;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "AcctData")
    protected CardAccount7 acctData;
    @XmlElement(name = "PrtctdAcctData")
    protected ContentInformationType10 prtctdAcctData;
    @XmlElement(name = "TtlReqdAmt")
    protected AmountAndCurrency1 ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount12 dtldReqdAmt;
    @XmlElement(name = "CcyConvsRslt")
    protected CurrencyConversion9 ccyConvsRslt;
    @XmlElement(name = "SelctdMixTp")
    protected String selctdMixTp;
    @XmlElement(name = "SelctdMix")
    protected List<ATMMediaMix1> selctdMix;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

    /**
     * Gets the value of the cshDspnsd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshDspnsd() {
        return cshDspnsd;
    }

    /**
     * Sets the value of the cshDspnsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCshDspnsd(Boolean value) {
        this.cshDspnsd = value;
    }

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
     * Gets the value of the acctData property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount7 }
     *     
     */
    public CardAccount7 getAcctData() {
        return acctData;
    }

    /**
     * Sets the value of the acctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount7 }
     *     
     */
    public void setAcctData(CardAccount7 value) {
        this.acctData = value;
    }

    /**
     * Gets the value of the prtctdAcctData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctData() {
        return prtctdAcctData;
    }

    /**
     * Sets the value of the prtctdAcctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdAcctData(ContentInformationType10 value) {
        this.prtctdAcctData = value;
    }

    /**
     * Gets the value of the ttlReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlReqdAmt() {
        return ttlReqdAmt;
    }

    /**
     * Sets the value of the ttlReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public void setTtlReqdAmt(AmountAndCurrency1 value) {
        this.ttlReqdAmt = value;
    }

    /**
     * Gets the value of the dtldReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount12 }
     *     
     */
    public DetailedAmount12 getDtldReqdAmt() {
        return dtldReqdAmt;
    }

    /**
     * Sets the value of the dtldReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount12 }
     *     
     */
    public void setDtldReqdAmt(DetailedAmount12 value) {
        this.dtldReqdAmt = value;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion9 }
     *     
     */
    public CurrencyConversion9 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion9 }
     *     
     */
    public void setCcyConvsRslt(CurrencyConversion9 value) {
        this.ccyConvsRslt = value;
    }

    /**
     * Gets the value of the selctdMixTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelctdMixTp() {
        return selctdMixTp;
    }

    /**
     * Sets the value of the selctdMixTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelctdMixTp(String value) {
        this.selctdMixTp = value;
    }

    /**
     * Gets the value of the selctdMix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the selctdMix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelctdMix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMMediaMix1 }
     * 
     * 
     * @return
     *     The value of the selctdMix property.
     */
    public List<ATMMediaMix1> getSelctdMix() {
        if (selctdMix == null) {
            selctdMix = new ArrayList<>();
        }
        return this.selctdMix;
    }

    /**
     * Gets the value of the reqdRct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqdRct() {
        return reqdRct;
    }

    /**
     * Sets the value of the reqdRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqdRct(Boolean value) {
        this.reqdRct = value;
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

}
