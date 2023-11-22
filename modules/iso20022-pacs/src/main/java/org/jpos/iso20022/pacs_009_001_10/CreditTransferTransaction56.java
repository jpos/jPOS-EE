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

package org.jpos.iso20022.pacs_009_001_10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditTransferTransaction56 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreditTransferTransaction56">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}PaymentIdentification13"/>
 *         <element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}PaymentTypeInformation28" minOccurs="0"/>
 *         <element name="IntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}ActiveCurrencyAndAmount"/>
 *         <element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}ISODate" minOccurs="0"/>
 *         <element name="SttlmPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}Priority3Code" minOccurs="0"/>
 *         <element name="SttlmTmIndctn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}SettlementDateTimeIndication1" minOccurs="0"/>
 *         <element name="SttlmTmReq" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}SettlementTimeRequest2" minOccurs="0"/>
 *         <element name="PrvsInstgAgt1" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="PrvsInstgAgt1Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="PrvsInstgAgt2" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="PrvsInstgAgt2Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="PrvsInstgAgt3" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="PrvsInstgAgt3Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt1" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt1Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="IntrmyAgt2" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt2Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="IntrmyAgt3" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt3Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="CdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CashAccount40" minOccurs="0"/>
 *         <element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="InstrForCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}InstructionForCreditorAgent3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InstrForNxtAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}InstructionForNextAgent1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}Purpose2Choice" minOccurs="0"/>
 *         <element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}RemittanceInformation2" minOccurs="0"/>
 *         <element name="UndrlygCstmrCdtTrf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}CreditTransferTransaction52" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransaction56", propOrder = {
    "pmtId",
    "pmtTpInf",
    "intrBkSttlmAmt",
    "intrBkSttlmDt",
    "sttlmPrty",
    "sttlmTmIndctn",
    "sttlmTmReq",
    "prvsInstgAgt1",
    "prvsInstgAgt1Acct",
    "prvsInstgAgt2",
    "prvsInstgAgt2Acct",
    "prvsInstgAgt3",
    "prvsInstgAgt3Acct",
    "instgAgt",
    "instdAgt",
    "intrmyAgt1",
    "intrmyAgt1Acct",
    "intrmyAgt2",
    "intrmyAgt2Acct",
    "intrmyAgt3",
    "intrmyAgt3Acct",
    "ultmtDbtr",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "instrForCdtrAgt",
    "instrForNxtAgt",
    "purp",
    "rmtInf",
    "undrlygCstmrCdtTrf",
    "splmtryData"
})
public class CreditTransferTransaction56 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification13 pmtId;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation28 pmtTpInf;
    @XmlElement(name = "IntrBkSttlmAmt", required = true)
    protected ActiveCurrencyAndAmount intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "SttlmPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code sttlmPrty;
    @XmlElement(name = "SttlmTmIndctn")
    protected SettlementDateTimeIndication1 sttlmTmIndctn;
    @XmlElement(name = "SttlmTmReq")
    protected SettlementTimeRequest2 sttlmTmReq;
    @XmlElement(name = "PrvsInstgAgt1")
    protected BranchAndFinancialInstitutionIdentification6 prvsInstgAgt1;
    @XmlElement(name = "PrvsInstgAgt1Acct")
    protected CashAccount40 prvsInstgAgt1Acct;
    @XmlElement(name = "PrvsInstgAgt2")
    protected BranchAndFinancialInstitutionIdentification6 prvsInstgAgt2;
    @XmlElement(name = "PrvsInstgAgt2Acct")
    protected CashAccount40 prvsInstgAgt2Acct;
    @XmlElement(name = "PrvsInstgAgt3")
    protected BranchAndFinancialInstitutionIdentification6 prvsInstgAgt3;
    @XmlElement(name = "PrvsInstgAgt3Acct")
    protected CashAccount40 prvsInstgAgt3Acct;
    @XmlElement(name = "InstgAgt")
    protected BranchAndFinancialInstitutionIdentification6 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification6 instdAgt;
    @XmlElement(name = "IntrmyAgt1")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt1Acct")
    protected CashAccount40 intrmyAgt1Acct;
    @XmlElement(name = "IntrmyAgt2")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt2Acct")
    protected CashAccount40 intrmyAgt2Acct;
    @XmlElement(name = "IntrmyAgt3")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt3;
    @XmlElement(name = "IntrmyAgt3Acct")
    protected CashAccount40 intrmyAgt3Acct;
    @XmlElement(name = "UltmtDbtr")
    protected BranchAndFinancialInstitutionIdentification6 ultmtDbtr;
    @XmlElement(name = "Dbtr", required = true)
    protected BranchAndFinancialInstitutionIdentification6 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount40 dbtrAgtAcct;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected CashAccount40 cdtrAgtAcct;
    @XmlElement(name = "Cdtr", required = true)
    protected BranchAndFinancialInstitutionIdentification6 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected BranchAndFinancialInstitutionIdentification6 ultmtCdtr;
    @XmlElement(name = "InstrForCdtrAgt")
    protected List<InstructionForCreditorAgent3> instrForCdtrAgt;
    @XmlElement(name = "InstrForNxtAgt")
    protected List<InstructionForNextAgent1> instrForNxtAgt;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation2 rmtInf;
    @XmlElement(name = "UndrlygCstmrCdtTrf")
    protected CreditTransferTransaction52 undrlygCstmrCdtTrf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification13 }
     *     
     */
    public PaymentIdentification13 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification13 }
     *     
     */
    public void setPmtId(PaymentIdentification13 value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation28 }
     *     
     */
    public PaymentTypeInformation28 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation28 }
     *     
     */
    public void setPmtTpInf(PaymentTypeInformation28 value) {
        this.pmtTpInf = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIntrBkSttlmAmt(ActiveCurrencyAndAmount value) {
        this.intrBkSttlmAmt = value;
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
     * Gets the value of the sttlmPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getSttlmPrty() {
        return sttlmPrty;
    }

    /**
     * Sets the value of the sttlmPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public void setSttlmPrty(Priority3Code value) {
        this.sttlmPrty = value;
    }

    /**
     * Gets the value of the sttlmTmIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateTimeIndication1 }
     *     
     */
    public SettlementDateTimeIndication1 getSttlmTmIndctn() {
        return sttlmTmIndctn;
    }

    /**
     * Sets the value of the sttlmTmIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateTimeIndication1 }
     *     
     */
    public void setSttlmTmIndctn(SettlementDateTimeIndication1 value) {
        this.sttlmTmIndctn = value;
    }

    /**
     * Gets the value of the sttlmTmReq property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public SettlementTimeRequest2 getSttlmTmReq() {
        return sttlmTmReq;
    }

    /**
     * Sets the value of the sttlmTmReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public void setSttlmTmReq(SettlementTimeRequest2 value) {
        this.sttlmTmReq = value;
    }

    /**
     * Gets the value of the prvsInstgAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getPrvsInstgAgt1() {
        return prvsInstgAgt1;
    }

    /**
     * Sets the value of the prvsInstgAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setPrvsInstgAgt1(BranchAndFinancialInstitutionIdentification6 value) {
        this.prvsInstgAgt1 = value;
    }

    /**
     * Gets the value of the prvsInstgAgt1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPrvsInstgAgt1Acct() {
        return prvsInstgAgt1Acct;
    }

    /**
     * Sets the value of the prvsInstgAgt1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPrvsInstgAgt1Acct(CashAccount40 value) {
        this.prvsInstgAgt1Acct = value;
    }

    /**
     * Gets the value of the prvsInstgAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getPrvsInstgAgt2() {
        return prvsInstgAgt2;
    }

    /**
     * Sets the value of the prvsInstgAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setPrvsInstgAgt2(BranchAndFinancialInstitutionIdentification6 value) {
        this.prvsInstgAgt2 = value;
    }

    /**
     * Gets the value of the prvsInstgAgt2Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPrvsInstgAgt2Acct() {
        return prvsInstgAgt2Acct;
    }

    /**
     * Sets the value of the prvsInstgAgt2Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPrvsInstgAgt2Acct(CashAccount40 value) {
        this.prvsInstgAgt2Acct = value;
    }

    /**
     * Gets the value of the prvsInstgAgt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getPrvsInstgAgt3() {
        return prvsInstgAgt3;
    }

    /**
     * Sets the value of the prvsInstgAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setPrvsInstgAgt3(BranchAndFinancialInstitutionIdentification6 value) {
        this.prvsInstgAgt3 = value;
    }

    /**
     * Gets the value of the prvsInstgAgt3Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPrvsInstgAgt3Acct() {
        return prvsInstgAgt3Acct;
    }

    /**
     * Sets the value of the prvsInstgAgt3Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPrvsInstgAgt3Acct(CashAccount40 value) {
        this.prvsInstgAgt3Acct = value;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstgAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instgAgt = value;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstdAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instdAgt = value;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setIntrmyAgt1(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt1 = value;
    }

    /**
     * Gets the value of the intrmyAgt1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getIntrmyAgt1Acct() {
        return intrmyAgt1Acct;
    }

    /**
     * Sets the value of the intrmyAgt1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setIntrmyAgt1Acct(CashAccount40 value) {
        this.intrmyAgt1Acct = value;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setIntrmyAgt2(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt2 = value;
    }

    /**
     * Gets the value of the intrmyAgt2Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getIntrmyAgt2Acct() {
        return intrmyAgt2Acct;
    }

    /**
     * Sets the value of the intrmyAgt2Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setIntrmyAgt2Acct(CashAccount40 value) {
        this.intrmyAgt2Acct = value;
    }

    /**
     * Gets the value of the intrmyAgt3 property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt3() {
        return intrmyAgt3;
    }

    /**
     * Sets the value of the intrmyAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setIntrmyAgt3(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt3 = value;
    }

    /**
     * Gets the value of the intrmyAgt3Acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getIntrmyAgt3Acct() {
        return intrmyAgt3Acct;
    }

    /**
     * Sets the value of the intrmyAgt3Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setIntrmyAgt3Acct(CashAccount40 value) {
        this.intrmyAgt3Acct = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setUltmtDbtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAgtAcct(CashAccount40 value) {
        this.dbtrAgtAcct = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCdtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setCdtrAgtAcct(CashAccount40 value) {
        this.cdtrAgtAcct = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCdtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setCdtrAcct(CashAccount40 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setUltmtCdtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.ultmtCdtr = value;
    }

    /**
     * Gets the value of the instrForCdtrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrForCdtrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForCdtrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForCreditorAgent3 }
     * 
     * 
     * @return
     *     The value of the instrForCdtrAgt property.
     */
    public List<InstructionForCreditorAgent3> getInstrForCdtrAgt() {
        if (instrForCdtrAgt == null) {
            instrForCdtrAgt = new ArrayList<>();
        }
        return this.instrForCdtrAgt;
    }

    /**
     * Gets the value of the instrForNxtAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrForNxtAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForNxtAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForNextAgent1 }
     * 
     * 
     * @return
     *     The value of the instrForNxtAgt property.
     */
    public List<InstructionForNextAgent1> getInstrForNxtAgt() {
        if (instrForNxtAgt == null) {
            instrForNxtAgt = new ArrayList<>();
        }
        return this.instrForNxtAgt;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *     
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *     
     */
    public void setPurp(Purpose2Choice value) {
        this.purp = value;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation2 }
     *     
     */
    public RemittanceInformation2 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation2 }
     *     
     */
    public void setRmtInf(RemittanceInformation2 value) {
        this.rmtInf = value;
    }

    /**
     * Gets the value of the undrlygCstmrCdtTrf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction52 }
     *     
     */
    public CreditTransferTransaction52 getUndrlygCstmrCdtTrf() {
        return undrlygCstmrCdtTrf;
    }

    /**
     * Sets the value of the undrlygCstmrCdtTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction52 }
     *     
     */
    public void setUndrlygCstmrCdtTrf(CreditTransferTransaction52 value) {
        this.undrlygCstmrCdtTrf = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
