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

package org.jpos.iso20022.pacs_010_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectDebitTransactionInformation27 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DirectDebitTransactionInformation27">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}PaymentIdentification13"/>
 *         <element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}PaymentTypeInformation28" minOccurs="0"/>
 *         <element name="IntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}ISODate" minOccurs="0"/>
 *         <element name="SttlmPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}Priority3Code" minOccurs="0"/>
 *         <element name="SttlmTmIndctn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}SettlementDateTimeIndication1" minOccurs="0"/>
 *         <element name="SttlmTmReq" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}SettlementTimeRequest2" minOccurs="0"/>
 *         <element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}CashAccount40" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}CashAccount40" minOccurs="0"/>
 *         <element name="InstrForDbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}Max210Text" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}Purpose2Choice" minOccurs="0"/>
 *         <element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}RemittanceInformation2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransactionInformation27", propOrder = {
    "pmtId",
    "pmtTpInf",
    "intrBkSttlmAmt",
    "intrBkSttlmDt",
    "sttlmPrty",
    "sttlmTmIndctn",
    "sttlmTmReq",
    "ultmtDbtr",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "instrForDbtrAgt",
    "purp",
    "rmtInf"
})
public class DirectDebitTransactionInformation27 {

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
    @XmlElement(name = "InstrForDbtrAgt")
    protected String instrForDbtrAgt;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation2 rmtInf;

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
     * Gets the value of the instrForDbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrForDbtrAgt() {
        return instrForDbtrAgt;
    }

    /**
     * Sets the value of the instrForDbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrForDbtrAgt(String value) {
        this.instrForDbtrAgt = value;
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

}
