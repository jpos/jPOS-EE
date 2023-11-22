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

package org.jpos.iso20022.camt_006_001_10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInstruction32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentInstruction32">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max35Text" minOccurs="0"/>
 *         <element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PaymentStatus6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Amount3Choice" minOccurs="0"/>
 *         <element name="IntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Amount2Choice" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max10Text" minOccurs="0"/>
 *         <element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PaymentOrigin1Choice" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Priority1Choice" minOccurs="0"/>
 *         <element name="PrcgVldtyTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}DateTimePeriod1Choice" minOccurs="0"/>
 *         <element name="InstrCpy" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max20000Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PaymentType4Choice" minOccurs="0"/>
 *         <element name="GnrtdOrdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max35Text" minOccurs="0"/>
 *         <element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}ISODate" minOccurs="0"/>
 *         <element name="EndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max35Text" minOccurs="0"/>
 *         <element name="Pties" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PaymentTransactionParty3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction32", propOrder = {
    "msgId",
    "reqdExctnDt",
    "sts",
    "instdAmt",
    "intrBkSttlmAmt",
    "purp",
    "pmtMtd",
    "prty",
    "prcgVldtyTm",
    "instrCpy",
    "tp",
    "gnrtdOrdr",
    "txId",
    "intrBkSttlmDt",
    "endToEndId",
    "pties"
})
public class PaymentInstruction32 {

    @XmlElement(name = "MsgId")
    protected String msgId;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "Sts")
    protected List<PaymentStatus6> sts;
    @XmlElement(name = "InstdAmt")
    protected Amount3Choice instdAmt;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected Amount2Choice intrBkSttlmAmt;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "PmtMtd")
    protected PaymentOrigin1Choice pmtMtd;
    @XmlElement(name = "Prty")
    protected Priority1Choice prty;
    @XmlElement(name = "PrcgVldtyTm")
    protected DateTimePeriod1Choice prcgVldtyTm;
    @XmlElement(name = "InstrCpy")
    protected String instrCpy;
    @XmlElement(name = "Tp")
    protected PaymentType4Choice tp;
    @XmlElement(name = "GnrtdOrdr")
    protected Boolean gnrtdOrdr;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "EndToEndId")
    protected String endToEndId;
    @XmlElement(name = "Pties")
    protected PaymentTransactionParty3 pties;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatus6 }
     * 
     * 
     * @return
     *     The value of the sts property.
     */
    public List<PaymentStatus6> getSts() {
        if (sts == null) {
            sts = new ArrayList<>();
        }
        return this.sts;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount3Choice }
     *     
     */
    public Amount3Choice getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount3Choice }
     *     
     */
    public void setInstdAmt(Amount3Choice value) {
        this.instdAmt = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setIntrBkSttlmAmt(Amount2Choice value) {
        this.intrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurp(String value) {
        this.purp = value;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentOrigin1Choice getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public void setPmtMtd(PaymentOrigin1Choice value) {
        this.pmtMtd = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority1Choice }
     *     
     */
    public Priority1Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority1Choice }
     *     
     */
    public void setPrty(Priority1Choice value) {
        this.prty = value;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getPrcgVldtyTm() {
        return prcgVldtyTm;
    }

    /**
     * Sets the value of the prcgVldtyTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setPrcgVldtyTm(DateTimePeriod1Choice value) {
        this.prcgVldtyTm = value;
    }

    /**
     * Gets the value of the instrCpy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrCpy() {
        return instrCpy;
    }

    /**
     * Sets the value of the instrCpy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrCpy(String value) {
        this.instrCpy = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType4Choice }
     *     
     */
    public PaymentType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType4Choice }
     *     
     */
    public void setTp(PaymentType4Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the gnrtdOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGnrtdOrdr() {
        return gnrtdOrdr;
    }

    /**
     * Sets the value of the gnrtdOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGnrtdOrdr(Boolean value) {
        this.gnrtdOrdr = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

    /**
     * Gets the value of the pties property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionParty3 }
     *     
     */
    public PaymentTransactionParty3 getPties() {
        return pties;
    }

    /**
     * Sets the value of the pties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionParty3 }
     *     
     */
    public void setPties(PaymentTransactionParty3 value) {
        this.pties = value;
    }

}
