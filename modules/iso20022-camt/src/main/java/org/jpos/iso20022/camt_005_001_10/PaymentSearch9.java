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

package org.jpos.iso20022.camt_005_001_10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentSearch9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentSearch9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}DateAndDateTimeSearch3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PaymentIdentification7Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}InstructionStatusSearch5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ActiveOrHistoricAmountRange2Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InstdAmtCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ActiveOrHistoricCurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}CreditDebitCode" minOccurs="0"/>
 *         <element name="IntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ActiveAmountRange3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrBkSttlmAmtCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ActiveCurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PaymentOrigin1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmtTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PaymentType4Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}Priority1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrcgVldtyTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}DateTimePeriod1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Instr" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}Instruction1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}UUIDv4Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ISODate" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Pties" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PaymentTransactionParty3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSearch9", propOrder = {
    "msgId",
    "reqdExctnDt",
    "pmtId",
    "sts",
    "instdAmt",
    "instdAmtCcy",
    "cdtDbtInd",
    "intrBkSttlmAmt",
    "intrBkSttlmAmtCcy",
    "pmtMtd",
    "pmtTp",
    "prty",
    "prcgVldtyTm",
    "instr",
    "txId",
    "uetr",
    "intrBkSttlmDt",
    "endToEndId",
    "pties"
})
public class PaymentSearch9 {

    @XmlElement(name = "MsgId")
    protected List<String> msgId;
    @XmlElement(name = "ReqdExctnDt")
    protected List<DateAndDateTimeSearch3Choice> reqdExctnDt;
    @XmlElement(name = "PmtId")
    protected List<PaymentIdentification7Choice> pmtId;
    @XmlElement(name = "Sts")
    protected List<InstructionStatusSearch5> sts;
    @XmlElement(name = "InstdAmt")
    protected List<ActiveOrHistoricAmountRange2Choice> instdAmt;
    @XmlElement(name = "InstdAmtCcy")
    protected List<String> instdAmtCcy;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected List<ActiveAmountRange3Choice> intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmAmtCcy")
    protected List<String> intrBkSttlmAmtCcy;
    @XmlElement(name = "PmtMtd")
    protected List<PaymentOrigin1Choice> pmtMtd;
    @XmlElement(name = "PmtTp")
    protected List<PaymentType4Choice> pmtTp;
    @XmlElement(name = "Prty")
    protected List<Priority1Choice> prty;
    @XmlElement(name = "PrcgVldtyTm")
    protected List<DateTimePeriod1Choice> prcgVldtyTm;
    @XmlElement(name = "Instr")
    @XmlSchemaType(name = "string")
    protected List<Instruction1Code> instr;
    @XmlElement(name = "TxId")
    protected List<String> txId;
    @XmlElement(name = "UETR")
    protected List<String> uetr;
    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> intrBkSttlmDt;
    @XmlElement(name = "EndToEndId")
    protected List<String> endToEndId;
    @XmlElement(name = "Pties")
    protected PaymentTransactionParty3 pties;

    /**
     * Gets the value of the msgId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the msgId property.
     */
    public List<String> getMsgId() {
        if (msgId == null) {
            msgId = new ArrayList<>();
        }
        return this.msgId;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqdExctnDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdExctnDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearch3Choice }
     * 
     * 
     * @return
     *     The value of the reqdExctnDt property.
     */
    public List<DateAndDateTimeSearch3Choice> getReqdExctnDt() {
        if (reqdExctnDt == null) {
            reqdExctnDt = new ArrayList<>();
        }
        return this.reqdExctnDt;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIdentification7Choice }
     * 
     * 
     * @return
     *     The value of the pmtId property.
     */
    public List<PaymentIdentification7Choice> getPmtId() {
        if (pmtId == null) {
            pmtId = new ArrayList<>();
        }
        return this.pmtId;
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
     * {@link InstructionStatusSearch5 }
     * 
     * 
     * @return
     *     The value of the sts property.
     */
    public List<InstructionStatusSearch5> getSts() {
        if (sts == null) {
            sts = new ArrayList<>();
        }
        return this.sts;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricAmountRange2Choice }
     * 
     * 
     * @return
     *     The value of the instdAmt property.
     */
    public List<ActiveOrHistoricAmountRange2Choice> getInstdAmt() {
        if (instdAmt == null) {
            instdAmt = new ArrayList<>();
        }
        return this.instdAmt;
    }

    /**
     * Gets the value of the instdAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instdAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the instdAmtCcy property.
     */
    public List<String> getInstdAmtCcy() {
        if (instdAmtCcy == null) {
            instdAmtCcy = new ArrayList<>();
        }
        return this.instdAmtCcy;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrBkSttlmAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveAmountRange3Choice }
     * 
     * 
     * @return
     *     The value of the intrBkSttlmAmt property.
     */
    public List<ActiveAmountRange3Choice> getIntrBkSttlmAmt() {
        if (intrBkSttlmAmt == null) {
            intrBkSttlmAmt = new ArrayList<>();
        }
        return this.intrBkSttlmAmt;
    }

    /**
     * Gets the value of the intrBkSttlmAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrBkSttlmAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the intrBkSttlmAmtCcy property.
     */
    public List<String> getIntrBkSttlmAmtCcy() {
        if (intrBkSttlmAmtCcy == null) {
            intrBkSttlmAmtCcy = new ArrayList<>();
        }
        return this.intrBkSttlmAmtCcy;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentOrigin1Choice }
     * 
     * 
     * @return
     *     The value of the pmtMtd property.
     */
    public List<PaymentOrigin1Choice> getPmtMtd() {
        if (pmtMtd == null) {
            pmtMtd = new ArrayList<>();
        }
        return this.pmtMtd;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType4Choice }
     * 
     * 
     * @return
     *     The value of the pmtTp property.
     */
    public List<PaymentType4Choice> getPmtTp() {
        if (pmtTp == null) {
            pmtTp = new ArrayList<>();
        }
        return this.pmtTp;
    }

    /**
     * Gets the value of the prty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Priority1Choice }
     * 
     * 
     * @return
     *     The value of the prty property.
     */
    public List<Priority1Choice> getPrty() {
        if (prty == null) {
            prty = new ArrayList<>();
        }
        return this.prty;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prcgVldtyTm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgVldtyTm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimePeriod1Choice }
     * 
     * 
     * @return
     *     The value of the prcgVldtyTm property.
     */
    public List<DateTimePeriod1Choice> getPrcgVldtyTm() {
        if (prcgVldtyTm == null) {
            prcgVldtyTm = new ArrayList<>();
        }
        return this.prcgVldtyTm;
    }

    /**
     * Gets the value of the instr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instruction1Code }
     * 
     * 
     * @return
     *     The value of the instr property.
     */
    public List<Instruction1Code> getInstr() {
        if (instr == null) {
            instr = new ArrayList<>();
        }
        return this.instr;
    }

    /**
     * Gets the value of the txId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the txId property.
     */
    public List<String> getTxId() {
        if (txId == null) {
            txId = new ArrayList<>();
        }
        return this.txId;
    }

    /**
     * Gets the value of the uetr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the uetr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUETR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the uetr property.
     */
    public List<String> getUETR() {
        if (uetr == null) {
            uetr = new ArrayList<>();
        }
        return this.uetr;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrBkSttlmDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     * @return
     *     The value of the intrBkSttlmDt property.
     */
    public List<XMLGregorianCalendar> getIntrBkSttlmDt() {
        if (intrBkSttlmDt == null) {
            intrBkSttlmDt = new ArrayList<>();
        }
        return this.intrBkSttlmDt;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the endToEndId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndToEndId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the endToEndId property.
     */
    public List<String> getEndToEndId() {
        if (endToEndId == null) {
            endToEndId = new ArrayList<>();
        }
        return this.endToEndId;
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
