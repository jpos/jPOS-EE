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

package org.jpos.iso20022.pain_001_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditTransferTransaction54 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreditTransferTransaction54">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}PaymentIdentification6"/>
 *         <element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}PaymentTypeInformation26" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}AmountType4Choice"/>
 *         <element name="XchgRateInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}ExchangeRate1" minOccurs="0"/>
 *         <element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}ChargeBearerType1Code" minOccurs="0"/>
 *         <element name="MndtRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}CreditTransferMandateData1" minOccurs="0"/>
 *         <element name="ChqInstr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}Cheque11" minOccurs="0"/>
 *         <element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}PartyIdentification135" minOccurs="0"/>
 *         <element name="IntrmyAgt1" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt1Acct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}CashAccount40" minOccurs="0"/>
 *         <element name="IntrmyAgt2" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt2Acct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}CashAccount40" minOccurs="0"/>
 *         <element name="IntrmyAgt3" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt3Acct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}CashAccount40" minOccurs="0"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="CdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}CashAccount40" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}PartyIdentification135" minOccurs="0"/>
 *         <element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}CashAccount40" minOccurs="0"/>
 *         <element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}PartyIdentification135" minOccurs="0"/>
 *         <element name="InstrForCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}InstructionForCreditorAgent3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InstrForDbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}InstructionForDebtorAgent1" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}Purpose2Choice" minOccurs="0"/>
 *         <element name="RgltryRptg" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}RegulatoryReporting3" maxOccurs="10" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}TaxInformation10" minOccurs="0"/>
 *         <element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}RemittanceLocation7" maxOccurs="10" minOccurs="0"/>
 *         <element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}RemittanceInformation21" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransferTransaction54", propOrder = {
    "pmtId",
    "pmtTpInf",
    "amt",
    "xchgRateInf",
    "chrgBr",
    "mndtRltdInf",
    "chqInstr",
    "ultmtDbtr",
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
    "instrForDbtrAgt",
    "purp",
    "rgltryRptg",
    "tax",
    "rltdRmtInf",
    "rmtInf",
    "splmtryData"
})
public class CreditTransferTransaction54 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification6 pmtId;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation26 pmtTpInf;
    @XmlElement(name = "Amt", required = true)
    protected AmountType4Choice amt;
    @XmlElement(name = "XchgRateInf")
    protected ExchangeRate1 xchgRateInf;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "MndtRltdInf")
    protected CreditTransferMandateData1 mndtRltdInf;
    @XmlElement(name = "ChqInstr")
    protected Cheque11 chqInstr;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification135 ultmtDbtr;
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
    @XmlElement(name = "Cdtr")
    protected PartyIdentification135 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification135 ultmtCdtr;
    @XmlElement(name = "InstrForCdtrAgt")
    protected List<InstructionForCreditorAgent3> instrForCdtrAgt;
    @XmlElement(name = "InstrForDbtrAgt")
    protected InstructionForDebtorAgent1 instrForDbtrAgt;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RgltryRptg")
    protected List<RegulatoryReporting3> rgltryRptg;
    @XmlElement(name = "Tax")
    protected TaxInformation10 tax;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation7> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation21 rmtInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification6 }
     *     
     */
    public PaymentIdentification6 getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification6 }
     *     
     */
    public void setPmtId(PaymentIdentification6 value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation26 }
     *     
     */
    public PaymentTypeInformation26 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation26 }
     *     
     */
    public void setPmtTpInf(PaymentTypeInformation26 value) {
        this.pmtTpInf = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType4Choice }
     *     
     */
    public AmountType4Choice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType4Choice }
     *     
     */
    public void setAmt(AmountType4Choice value) {
        this.amt = value;
    }

    /**
     * Gets the value of the xchgRateInf property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRate1 }
     *     
     */
    public ExchangeRate1 getXchgRateInf() {
        return xchgRateInf;
    }

    /**
     * Sets the value of the xchgRateInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRate1 }
     *     
     */
    public void setXchgRateInf(ExchangeRate1 value) {
        this.xchgRateInf = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public CreditTransferMandateData1 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public void setMndtRltdInf(CreditTransferMandateData1 value) {
        this.mndtRltdInf = value;
    }

    /**
     * Gets the value of the chqInstr property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque11 }
     *     
     */
    public Cheque11 getChqInstr() {
        return chqInstr;
    }

    /**
     * Sets the value of the chqInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque11 }
     *     
     */
    public void setChqInstr(Cheque11 value) {
        this.chqInstr = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setUltmtDbtr(PartyIdentification135 value) {
        this.ultmtDbtr = value;
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
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setCdtr(PartyIdentification135 value) {
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
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setUltmtCdtr(PartyIdentification135 value) {
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
     * Gets the value of the instrForDbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionForDebtorAgent1 }
     *     
     */
    public InstructionForDebtorAgent1 getInstrForDbtrAgt() {
        return instrForDbtrAgt;
    }

    /**
     * Sets the value of the instrForDbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionForDebtorAgent1 }
     *     
     */
    public void setInstrForDbtrAgt(InstructionForDebtorAgent1 value) {
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
     * Gets the value of the rgltryRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rgltryRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryReporting3 }
     * 
     * 
     * @return
     *     The value of the rgltryRptg property.
     */
    public List<RegulatoryReporting3> getRgltryRptg() {
        if (rgltryRptg == null) {
            rgltryRptg = new ArrayList<>();
        }
        return this.rgltryRptg;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInformation10 }
     *     
     */
    public TaxInformation10 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInformation10 }
     *     
     */
    public void setTax(TaxInformation10 value) {
        this.tax = value;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation7 }
     * 
     * 
     * @return
     *     The value of the rltdRmtInf property.
     */
    public List<RemittanceLocation7> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation21 }
     *     
     */
    public RemittanceInformation21 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation21 }
     *     
     */
    public void setRmtInf(RemittanceInformation21 value) {
        this.rmtInf = value;
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
