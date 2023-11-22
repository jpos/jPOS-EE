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

package org.jpos.iso20022.catp_016_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction23">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}TransactionIdentifier1"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CdtrLabl" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}Max35Text" minOccurs="0"/>
 *         <element name="DbtrLabl" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PmtRef" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}Max35Text" minOccurs="0"/>
 *         <element name="AcctFr" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}CardAccount7" minOccurs="0"/>
 *         <element name="PrtctdAcctFr" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}ContentInformationType10" minOccurs="0"/>
 *         <element name="AcctTo" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}CardAccount7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrtctdAcctTo" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}ContentInformationType10" minOccurs="0"/>
 *         <element name="TtlReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DtldReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}DetailedAmount17" minOccurs="0"/>
 *         <element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}ISODate" minOccurs="0"/>
 *         <element name="InstntTrfPrgm" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RcrngTrf" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}RecurringTransaction3" minOccurs="0"/>
 *         <element name="ReqdRct" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}Max10000Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction23", propOrder = {
    "txId",
    "rcncltnId",
    "cdtrLabl",
    "dbtrLabl",
    "pmtRef",
    "acctFr",
    "prtctdAcctFr",
    "acctTo",
    "prtctdAcctTo",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "reqdExctnDt",
    "instntTrfPrgm",
    "rcrngTrf",
    "reqdRct",
    "iccRltdData"
})
public class ATMTransaction23 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "CdtrLabl")
    protected String cdtrLabl;
    @XmlElement(name = "DbtrLabl")
    protected String dbtrLabl;
    @XmlElement(name = "PmtRef")
    protected String pmtRef;
    @XmlElement(name = "AcctFr")
    protected CardAccount7 acctFr;
    @XmlElement(name = "PrtctdAcctFr")
    protected ContentInformationType10 prtctdAcctFr;
    @XmlElement(name = "AcctTo")
    protected List<CardAccount7> acctTo;
    @XmlElement(name = "PrtctdAcctTo")
    protected ContentInformationType10 prtctdAcctTo;
    @XmlElement(name = "TtlReqdAmt")
    protected BigDecimal ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount17 dtldReqdAmt;
    @XmlElement(name = "ReqdExctnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "InstntTrfPrgm")
    protected String instntTrfPrgm;
    @XmlElement(name = "RcrngTrf")
    protected RecurringTransaction3 rcrngTrf;
    @XmlElement(name = "ReqdRct")
    protected Boolean reqdRct;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

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
     * Gets the value of the cdtrLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrLabl() {
        return cdtrLabl;
    }

    /**
     * Sets the value of the cdtrLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtrLabl(String value) {
        this.cdtrLabl = value;
    }

    /**
     * Gets the value of the dbtrLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrLabl() {
        return dbtrLabl;
    }

    /**
     * Sets the value of the dbtrLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrLabl(String value) {
        this.dbtrLabl = value;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtRef(String value) {
        this.pmtRef = value;
    }

    /**
     * Gets the value of the acctFr property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount7 }
     *     
     */
    public CardAccount7 getAcctFr() {
        return acctFr;
    }

    /**
     * Sets the value of the acctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount7 }
     *     
     */
    public void setAcctFr(CardAccount7 value) {
        this.acctFr = value;
    }

    /**
     * Gets the value of the prtctdAcctFr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctFr() {
        return prtctdAcctFr;
    }

    /**
     * Sets the value of the prtctdAcctFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdAcctFr(ContentInformationType10 value) {
        this.prtctdAcctFr = value;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAccount7 }
     * 
     * 
     * @return
     *     The value of the acctTo property.
     */
    public List<CardAccount7> getAcctTo() {
        if (acctTo == null) {
            acctTo = new ArrayList<>();
        }
        return this.acctTo;
    }

    /**
     * Gets the value of the prtctdAcctTo property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctTo() {
        return prtctdAcctTo;
    }

    /**
     * Sets the value of the prtctdAcctTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdAcctTo(ContentInformationType10 value) {
        this.prtctdAcctTo = value;
    }

    /**
     * Gets the value of the ttlReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlReqdAmt() {
        return ttlReqdAmt;
    }

    /**
     * Sets the value of the ttlReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlReqdAmt(BigDecimal value) {
        this.ttlReqdAmt = value;
    }

    /**
     * Gets the value of the dtldReqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount17 }
     *     
     */
    public DetailedAmount17 getDtldReqdAmt() {
        return dtldReqdAmt;
    }

    /**
     * Sets the value of the dtldReqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount17 }
     *     
     */
    public void setDtldReqdAmt(DetailedAmount17 value) {
        this.dtldReqdAmt = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the instntTrfPrgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstntTrfPrgm() {
        return instntTrfPrgm;
    }

    /**
     * Sets the value of the instntTrfPrgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstntTrfPrgm(String value) {
        this.instntTrfPrgm = value;
    }

    /**
     * Gets the value of the rcrngTrf property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringTransaction3 }
     *     
     */
    public RecurringTransaction3 getRcrngTrf() {
        return rcrngTrf;
    }

    /**
     * Sets the value of the rcrngTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringTransaction3 }
     *     
     */
    public void setRcrngTrf(RecurringTransaction3 value) {
        this.rcrngTrf = value;
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
