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

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditTransferTransaction53 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreditTransferTransaction53">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdtId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}Max35Text"/>
 *         <element name="BtchBookg" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BatchBookingIndicator" minOccurs="0"/>
 *         <element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}PaymentTypeInformation28" minOccurs="0"/>
 *         <element name="TtlIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}ISODate" minOccurs="0"/>
 *         <element name="SttlmTmIndctn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}SettlementDateTimeIndication1" minOccurs="0"/>
 *         <element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt1" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt1Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}CashAccount40" minOccurs="0"/>
 *         <element name="IntrmyAgt2" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt2Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}CashAccount40" minOccurs="0"/>
 *         <element name="IntrmyAgt3" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt3Acct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}CashAccount40" minOccurs="0"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="CdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}CashAccount40" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}CashAccount40" minOccurs="0"/>
 *         <element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="InstrForCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}InstructionForCreditorAgent3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DrctDbtTxInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}DirectDebitTransactionInformation27" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pacs.010.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransaction53", propOrder = {
    "cdtId",
    "btchBookg",
    "pmtTpInf",
    "ttlIntrBkSttlmAmt",
    "intrBkSttlmDt",
    "sttlmTmIndctn",
    "instgAgt",
    "instdAgt",
    "intrmyAgt1",
    "intrmyAgt1Acct",
    "intrmyAgt2",
    "intrmyAgt2Acct",
    "intrmyAgt3",
    "intrmyAgt3Acct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "instrForCdtrAgt",
    "drctDbtTxInf",
    "splmtryData"
})
public class CreditTransferTransaction53 {

    @XmlElement(name = "CdtId", required = true)
    protected String cdtId;
    @XmlElement(name = "BtchBookg")
    protected Boolean btchBookg;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation28 pmtTpInf;
    @XmlElement(name = "TtlIntrBkSttlmAmt")
    protected ActiveCurrencyAndAmount ttlIntrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "SttlmTmIndctn")
    protected SettlementDateTimeIndication1 sttlmTmIndctn;
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
    @XmlElement(name = "DrctDbtTxInf", required = true)
    protected List<DirectDebitTransactionInformation27> drctDbtTxInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the cdtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtId() {
        return cdtId;
    }

    /**
     * Sets the value of the cdtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtId(String value) {
        this.cdtId = value;
    }

    /**
     * Gets the value of the btchBookg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBtchBookg() {
        return btchBookg;
    }

    /**
     * Sets the value of the btchBookg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBtchBookg(Boolean value) {
        this.btchBookg = value;
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
     * Gets the value of the ttlIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlIntrBkSttlmAmt() {
        return ttlIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the ttlIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlIntrBkSttlmAmt(ActiveCurrencyAndAmount value) {
        this.ttlIntrBkSttlmAmt = value;
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
     * Gets the value of the drctDbtTxInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the drctDbtTxInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrctDbtTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectDebitTransactionInformation27 }
     * 
     * 
     * @return
     *     The value of the drctDbtTxInf property.
     */
    public List<DirectDebitTransactionInformation27> getDrctDbtTxInf() {
        if (drctDbtTxInf == null) {
            drctDbtTxInf = new ArrayList<>();
        }
        return this.drctDbtTxInf;
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
