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

package org.jpos.iso20022.setr_001_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedemptionOrder15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RedemptionOrder15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}Max35Text"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}Max35Text" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}InvestmentAccount58"/>
 *         <element name="OrdrTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}FundOrderType4Choice" maxOccurs="10" minOccurs="0"/>
 *         <element name="BnfcryDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}IndividualPerson32" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AmtOrUnitsOrPctg" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}FinancialInstrumentQuantity28Choice"/>
 *         <element name="Rndg" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}RoundingDirection2Code" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}ISODate" minOccurs="0"/>
 *         <element name="SttlmMtd" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}DeliveryReceiptType2Code" minOccurs="0"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}ForeignExchangeTerms32" minOccurs="0"/>
 *         <element name="IncmPref" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}IncomePreference1Code" minOccurs="0"/>
 *         <element name="Grp1Or2Units" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}UKTaxGroupUnit1Code" minOccurs="0"/>
 *         <element name="TxOvrhd" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}FeeAndTax1" minOccurs="0"/>
 *         <element name="SttlmAndCtdyDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}FundSettlementParameters12" minOccurs="0"/>
 *         <element name="PhysDlvryInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}YesNoIndicator"/>
 *         <element name="PhysDlvryDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}DeliveryParameters3" minOccurs="0"/>
 *         <element name="CshSttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}PaymentTransaction72" minOccurs="0"/>
 *         <element name="NonStdSttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}Max350Text" minOccurs="0"/>
 *         <element name="StffClntBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}InvestmentFundsOrderBreakdown2" maxOccurs="4" minOccurs="0"/>
 *         <element name="FinAdvc" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}FinancialAdvice1Code" minOccurs="0"/>
 *         <element name="NgtdTrad" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}NegotiatedTrade1Code" minOccurs="0"/>
 *         <element name="RltdPtyDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}Intermediary40" maxOccurs="10" minOccurs="0"/>
 *         <element name="Equlstn" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}Equalisation1" minOccurs="0"/>
 *         <element name="CstmrCndctClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}CustomerConductClassification1Choice" minOccurs="0"/>
 *         <element name="TxChanlTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}TransactionChannelType1Choice" minOccurs="0"/>
 *         <element name="SgntrTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}SignatureType1Choice" minOccurs="0"/>
 *         <element name="OrdrWvrDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}OrderWaiver1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionOrder15", propOrder = {
    "ordrRef",
    "clntRef",
    "invstmtAcctDtls",
    "ordrTp",
    "bnfcryDtls",
    "amtOrUnitsOrPctg",
    "rndg",
    "sttlmAmt",
    "cshSttlmDt",
    "sttlmMtd",
    "fxDtls",
    "incmPref",
    "grp1Or2Units",
    "txOvrhd",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls",
    "cshSttlmDtls",
    "nonStdSttlmInf",
    "stffClntBrkdwn",
    "finAdvc",
    "ngtdTrad",
    "rltdPtyDtls",
    "equlstn",
    "cstmrCndctClssfctn",
    "txChanlTp",
    "sgntrTp",
    "ordrWvrDtls"
})
public class RedemptionOrder15 {

    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "OrdrTp")
    protected List<FundOrderType4Choice> ordrTp;
    @XmlElement(name = "BnfcryDtls")
    protected List<IndividualPerson32> bnfcryDtls;
    @XmlElement(name = "AmtOrUnitsOrPctg", required = true)
    protected FinancialInstrumentQuantity28Choice amtOrUnitsOrPctg;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "CshSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "SttlmMtd")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code sttlmMtd;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms32 fxDtls;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "Grp1Or2Units")
    @XmlSchemaType(name = "string")
    protected UKTaxGroupUnit1Code grp1Or2Units;
    @XmlElement(name = "TxOvrhd")
    protected FeeAndTax1 txOvrhd;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters12 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected DeliveryParameters3 physDlvryDtls;
    @XmlElement(name = "CshSttlmDtls")
    protected PaymentTransaction72 cshSttlmDtls;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "StffClntBrkdwn")
    protected List<InvestmentFundsOrderBreakdown2> stffClntBrkdwn;
    @XmlElement(name = "FinAdvc")
    @XmlSchemaType(name = "string")
    protected FinancialAdvice1Code finAdvc;
    @XmlElement(name = "NgtdTrad")
    @XmlSchemaType(name = "string")
    protected NegotiatedTrade1Code ngtdTrad;
    @XmlElement(name = "RltdPtyDtls")
    protected List<Intermediary40> rltdPtyDtls;
    @XmlElement(name = "Equlstn")
    protected Equalisation1 equlstn;
    @XmlElement(name = "CstmrCndctClssfctn")
    protected CustomerConductClassification1Choice cstmrCndctClssfctn;
    @XmlElement(name = "TxChanlTp")
    protected TransactionChannelType1Choice txChanlTp;
    @XmlElement(name = "SgntrTp")
    protected SignatureType1Choice sgntrTp;
    @XmlElement(name = "OrdrWvrDtls")
    protected OrderWaiver1 ordrWvrDtls;

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrRef(String value) {
        this.ordrRef = value;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntRef(String value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public InvestmentAccount58 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public void setInvstmtAcctDtls(InvestmentAccount58 value) {
        this.invstmtAcctDtls = value;
    }

    /**
     * Gets the value of the ordrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordrTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundOrderType4Choice }
     * 
     * 
     * @return
     *     The value of the ordrTp property.
     */
    public List<FundOrderType4Choice> getOrdrTp() {
        if (ordrTp == null) {
            ordrTp = new ArrayList<>();
        }
        return this.ordrTp;
    }

    /**
     * Gets the value of the bnfcryDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnfcryDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfcryDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPerson32 }
     * 
     * 
     * @return
     *     The value of the bnfcryDtls property.
     */
    public List<IndividualPerson32> getBnfcryDtls() {
        if (bnfcryDtls == null) {
            bnfcryDtls = new ArrayList<>();
        }
        return this.bnfcryDtls;
    }

    /**
     * Gets the value of the amtOrUnitsOrPctg property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity28Choice }
     *     
     */
    public FinancialInstrumentQuantity28Choice getAmtOrUnitsOrPctg() {
        return amtOrUnitsOrPctg;
    }

    /**
     * Sets the value of the amtOrUnitsOrPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity28Choice }
     *     
     */
    public void setAmtOrUnitsOrPctg(FinancialInstrumentQuantity28Choice value) {
        this.amtOrUnitsOrPctg = value;
    }

    /**
     * Gets the value of the rndg property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public RoundingDirection2Code getRndg() {
        return rndg;
    }

    /**
     * Sets the value of the rndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public void setRndg(RoundingDirection2Code value) {
        this.rndg = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
    }

    /**
     * Gets the value of the sttlmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getSttlmMtd() {
        return sttlmMtd;
    }

    /**
     * Sets the value of the sttlmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public void setSttlmMtd(DeliveryReceiptType2Code value) {
        this.sttlmMtd = value;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms32 }
     *     
     */
    public ForeignExchangeTerms32 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms32 }
     *     
     */
    public void setFXDtls(ForeignExchangeTerms32 value) {
        this.fxDtls = value;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference1Code }
     *     
     */
    public IncomePreference1Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference1Code }
     *     
     */
    public void setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
    }

    /**
     * Gets the value of the grp1Or2Units property.
     * 
     * @return
     *     possible object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public UKTaxGroupUnit1Code getGrp1Or2Units() {
        return grp1Or2Units;
    }

    /**
     * Sets the value of the grp1Or2Units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKTaxGroupUnit1Code }
     *     
     */
    public void setGrp1Or2Units(UKTaxGroupUnit1Code value) {
        this.grp1Or2Units = value;
    }

    /**
     * Gets the value of the txOvrhd property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAndTax1 }
     *     
     */
    public FeeAndTax1 getTxOvrhd() {
        return txOvrhd;
    }

    /**
     * Sets the value of the txOvrhd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAndTax1 }
     *     
     */
    public void setTxOvrhd(FeeAndTax1 value) {
        this.txOvrhd = value;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters12 }
     *     
     */
    public FundSettlementParameters12 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters12 }
     *     
     */
    public void setSttlmAndCtdyDtls(FundSettlementParameters12 value) {
        this.sttlmAndCtdyDtls = value;
    }

    /**
     * Gets the value of the physDlvryInd property.
     * 
     */
    public boolean isPhysDlvryInd() {
        return physDlvryInd;
    }

    /**
     * Sets the value of the physDlvryInd property.
     * 
     */
    public void setPhysDlvryInd(boolean value) {
        this.physDlvryInd = value;
    }

    /**
     * Gets the value of the physDlvryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public DeliveryParameters3 getPhysDlvryDtls() {
        return physDlvryDtls;
    }

    /**
     * Sets the value of the physDlvryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public void setPhysDlvryDtls(DeliveryParameters3 value) {
        this.physDlvryDtls = value;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction72 }
     *     
     */
    public PaymentTransaction72 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction72 }
     *     
     */
    public void setCshSttlmDtls(PaymentTransaction72 value) {
        this.cshSttlmDtls = value;
    }

    /**
     * Gets the value of the nonStdSttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStdSttlmInf() {
        return nonStdSttlmInf;
    }

    /**
     * Sets the value of the nonStdSttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonStdSttlmInf(String value) {
        this.nonStdSttlmInf = value;
    }

    /**
     * Gets the value of the stffClntBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stffClntBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStffClntBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundsOrderBreakdown2 }
     * 
     * 
     * @return
     *     The value of the stffClntBrkdwn property.
     */
    public List<InvestmentFundsOrderBreakdown2> getStffClntBrkdwn() {
        if (stffClntBrkdwn == null) {
            stffClntBrkdwn = new ArrayList<>();
        }
        return this.stffClntBrkdwn;
    }

    /**
     * Gets the value of the finAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAdvice1Code }
     *     
     */
    public FinancialAdvice1Code getFinAdvc() {
        return finAdvc;
    }

    /**
     * Sets the value of the finAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAdvice1Code }
     *     
     */
    public void setFinAdvc(FinancialAdvice1Code value) {
        this.finAdvc = value;
    }

    /**
     * Gets the value of the ngtdTrad property.
     * 
     * @return
     *     possible object is
     *     {@link NegotiatedTrade1Code }
     *     
     */
    public NegotiatedTrade1Code getNgtdTrad() {
        return ngtdTrad;
    }

    /**
     * Sets the value of the ngtdTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiatedTrade1Code }
     *     
     */
    public void setNgtdTrad(NegotiatedTrade1Code value) {
        this.ngtdTrad = value;
    }

    /**
     * Gets the value of the rltdPtyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdPtyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPtyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary40 }
     * 
     * 
     * @return
     *     The value of the rltdPtyDtls property.
     */
    public List<Intermediary40> getRltdPtyDtls() {
        if (rltdPtyDtls == null) {
            rltdPtyDtls = new ArrayList<>();
        }
        return this.rltdPtyDtls;
    }

    /**
     * Gets the value of the equlstn property.
     * 
     * @return
     *     possible object is
     *     {@link Equalisation1 }
     *     
     */
    public Equalisation1 getEqulstn() {
        return equlstn;
    }

    /**
     * Sets the value of the equlstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equalisation1 }
     *     
     */
    public void setEqulstn(Equalisation1 value) {
        this.equlstn = value;
    }

    /**
     * Gets the value of the cstmrCndctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public CustomerConductClassification1Choice getCstmrCndctClssfctn() {
        return cstmrCndctClssfctn;
    }

    /**
     * Sets the value of the cstmrCndctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public void setCstmrCndctClssfctn(CustomerConductClassification1Choice value) {
        this.cstmrCndctClssfctn = value;
    }

    /**
     * Gets the value of the txChanlTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionChannelType1Choice }
     *     
     */
    public TransactionChannelType1Choice getTxChanlTp() {
        return txChanlTp;
    }

    /**
     * Sets the value of the txChanlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionChannelType1Choice }
     *     
     */
    public void setTxChanlTp(TransactionChannelType1Choice value) {
        this.txChanlTp = value;
    }

    /**
     * Gets the value of the sgntrTp property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType1Choice }
     *     
     */
    public SignatureType1Choice getSgntrTp() {
        return sgntrTp;
    }

    /**
     * Sets the value of the sgntrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType1Choice }
     *     
     */
    public void setSgntrTp(SignatureType1Choice value) {
        this.sgntrTp = value;
    }

    /**
     * Gets the value of the ordrWvrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderWaiver1 }
     *     
     */
    public OrderWaiver1 getOrdrWvrDtls() {
        return ordrWvrDtls;
    }

    /**
     * Sets the value of the ordrWvrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderWaiver1 }
     *     
     */
    public void setOrdrWvrDtls(OrderWaiver1 value) {
        this.ordrWvrDtls = value;
    }

}
