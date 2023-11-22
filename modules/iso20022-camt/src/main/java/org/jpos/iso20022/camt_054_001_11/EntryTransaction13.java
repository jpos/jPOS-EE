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

package org.jpos.iso20022.camt_054_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryTransaction13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EntryTransaction13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TransactionReferences6" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}CreditDebitCode" minOccurs="0"/>
 *         <element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}AmountAndCurrencyExchange4" minOccurs="0"/>
 *         <element name="Avlbty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}CashAvailability1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}BankTransactionCodeStructure4" minOccurs="0"/>
 *         <element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Charges6" minOccurs="0"/>
 *         <element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TransactionInterest4" minOccurs="0"/>
 *         <element name="RltdPties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TransactionParties9" minOccurs="0"/>
 *         <element name="RltdAgts" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TransactionAgents5" minOccurs="0"/>
 *         <element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}LocalInstrument2Choice" minOccurs="0"/>
 *         <element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}PaymentTypeInformation27" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Purpose2Choice" minOccurs="0"/>
 *         <element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}RemittanceLocation7" maxOccurs="10" minOccurs="0"/>
 *         <element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}RemittanceInformation21" minOccurs="0"/>
 *         <element name="RltdDts" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TransactionDates3" minOccurs="0"/>
 *         <element name="RltdPric" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TransactionPrice4Choice" minOccurs="0"/>
 *         <element name="RltdQties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TransactionQuantities3Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}SecurityIdentification19" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TaxInformation10" minOccurs="0"/>
 *         <element name="RtrInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}PaymentReturnReason5" minOccurs="0"/>
 *         <element name="CorpActn" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}CorporateAction9" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="CshDpst" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}CashDeposit1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CardTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}CardTransaction18" minOccurs="0"/>
 *         <element name="AddtlTxInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Max500Text" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryTransaction13", propOrder = {
    "refs",
    "amt",
    "cdtDbtInd",
    "amtDtls",
    "avlbty",
    "bkTxCd",
    "chrgs",
    "intrst",
    "rltdPties",
    "rltdAgts",
    "lclInstrm",
    "pmtTpInf",
    "purp",
    "rltdRmtInf",
    "rmtInf",
    "rltdDts",
    "rltdPric",
    "rltdQties",
    "finInstrmId",
    "tax",
    "rtrInf",
    "corpActn",
    "sfkpgAcct",
    "cshDpst",
    "cardTx",
    "addtlTxInf",
    "splmtryData"
})
public class EntryTransaction13 {

    @XmlElement(name = "Refs")
    protected TransactionReferences6 refs;
    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "AmtDtls")
    protected AmountAndCurrencyExchange4 amtDtls;
    @XmlElement(name = "Avlbty")
    protected List<CashAvailability1> avlbty;
    @XmlElement(name = "BkTxCd")
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "Chrgs")
    protected Charges6 chrgs;
    @XmlElement(name = "Intrst")
    protected TransactionInterest4 intrst;
    @XmlElement(name = "RltdPties")
    protected TransactionParties9 rltdPties;
    @XmlElement(name = "RltdAgts")
    protected TransactionAgents5 rltdAgts;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrument2Choice lclInstrm;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation27 pmtTpInf;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation7> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation21 rmtInf;
    @XmlElement(name = "RltdDts")
    protected TransactionDates3 rltdDts;
    @XmlElement(name = "RltdPric")
    protected TransactionPrice4Choice rltdPric;
    @XmlElement(name = "RltdQties")
    protected List<TransactionQuantities3Choice> rltdQties;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Tax")
    protected TaxInformation10 tax;
    @XmlElement(name = "RtrInf")
    protected PaymentReturnReason5 rtrInf;
    @XmlElement(name = "CorpActn")
    protected CorporateAction9 corpActn;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "CshDpst")
    protected List<CashDeposit1> cshDpst;
    @XmlElement(name = "CardTx")
    protected CardTransaction18 cardTx;
    @XmlElement(name = "AddtlTxInf")
    protected String addtlTxInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferences6 }
     *     
     */
    public TransactionReferences6 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferences6 }
     *     
     */
    public void setRefs(TransactionReferences6 value) {
        this.refs = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
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
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrencyExchange4 }
     *     
     */
    public AmountAndCurrencyExchange4 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrencyExchange4 }
     *     
     */
    public void setAmtDtls(AmountAndCurrencyExchange4 value) {
        this.amtDtls = value;
    }

    /**
     * Gets the value of the avlbty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the avlbty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlbty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAvailability1 }
     * 
     * 
     * @return
     *     The value of the avlbty property.
     */
    public List<CashAvailability1> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<>();
        }
        return this.avlbty;
    }

    /**
     * Gets the value of the bkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * Sets the value of the bkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charges6 }
     *     
     */
    public Charges6 getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges6 }
     *     
     */
    public void setChrgs(Charges6 value) {
        this.chrgs = value;
    }

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInterest4 }
     *     
     */
    public TransactionInterest4 getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInterest4 }
     *     
     */
    public void setIntrst(TransactionInterest4 value) {
        this.intrst = value;
    }

    /**
     * Gets the value of the rltdPties property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionParties9 }
     *     
     */
    public TransactionParties9 getRltdPties() {
        return rltdPties;
    }

    /**
     * Sets the value of the rltdPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionParties9 }
     *     
     */
    public void setRltdPties(TransactionParties9 value) {
        this.rltdPties = value;
    }

    /**
     * Gets the value of the rltdAgts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAgents5 }
     *     
     */
    public TransactionAgents5 getRltdAgts() {
        return rltdAgts;
    }

    /**
     * Sets the value of the rltdAgts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAgents5 }
     *     
     */
    public void setRltdAgts(TransactionAgents5 value) {
        this.rltdAgts = value;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public LocalInstrument2Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument2Choice value) {
        this.lclInstrm = value;
    }

    /**
     * Gets the value of the pmtTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation27 }
     *     
     */
    public PaymentTypeInformation27 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Sets the value of the pmtTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation27 }
     *     
     */
    public void setPmtTpInf(PaymentTypeInformation27 value) {
        this.pmtTpInf = value;
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
     * Gets the value of the rltdDts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDates3 }
     *     
     */
    public TransactionDates3 getRltdDts() {
        return rltdDts;
    }

    /**
     * Sets the value of the rltdDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDates3 }
     *     
     */
    public void setRltdDts(TransactionDates3 value) {
        this.rltdDts = value;
    }

    /**
     * Gets the value of the rltdPric property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPrice4Choice }
     *     
     */
    public TransactionPrice4Choice getRltdPric() {
        return rltdPric;
    }

    /**
     * Sets the value of the rltdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPrice4Choice }
     *     
     */
    public void setRltdPric(TransactionPrice4Choice value) {
        this.rltdPric = value;
    }

    /**
     * Gets the value of the rltdQties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdQties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdQties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionQuantities3Choice }
     * 
     * 
     * @return
     *     The value of the rltdQties property.
     */
    public List<TransactionQuantities3Choice> getRltdQties() {
        if (rltdQties == null) {
            rltdQties = new ArrayList<>();
        }
        return this.rltdQties;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
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
     * Gets the value of the rtrInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnReason5 }
     *     
     */
    public PaymentReturnReason5 getRtrInf() {
        return rtrInf;
    }

    /**
     * Sets the value of the rtrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnReason5 }
     *     
     */
    public void setRtrInf(PaymentReturnReason5 value) {
        this.rtrInf = value;
    }

    /**
     * Gets the value of the corpActn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction9 }
     *     
     */
    public CorporateAction9 getCorpActn() {
        return corpActn;
    }

    /**
     * Sets the value of the corpActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction9 }
     *     
     */
    public void setCorpActn(CorporateAction9 value) {
        this.corpActn = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the cshDpst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshDpst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshDpst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashDeposit1 }
     * 
     * 
     * @return
     *     The value of the cshDpst property.
     */
    public List<CashDeposit1> getCshDpst() {
        if (cshDpst == null) {
            cshDpst = new ArrayList<>();
        }
        return this.cshDpst;
    }

    /**
     * Gets the value of the cardTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransaction18 }
     *     
     */
    public CardTransaction18 getCardTx() {
        return cardTx;
    }

    /**
     * Sets the value of the cardTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransaction18 }
     *     
     */
    public void setCardTx(CardTransaction18 value) {
        this.cardTx = value;
    }

    /**
     * Gets the value of the addtlTxInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxInf() {
        return addtlTxInf;
    }

    /**
     * Sets the value of the addtlTxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlTxInf(String value) {
        this.addtlTxInf = value;
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
