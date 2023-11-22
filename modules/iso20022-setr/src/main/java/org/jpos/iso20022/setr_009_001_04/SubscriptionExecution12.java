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

package org.jpos.iso20022.setr_009_001_04;

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
 * <p>Java class for SubscriptionExecution12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubscriptionExecution12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Max35Text"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Max35Text" minOccurs="0"/>
 *         <element name="DealRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Max35Text"/>
 *         <element name="OrdrTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}FundOrderType4Choice" maxOccurs="10" minOccurs="0"/>
 *         <element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}InvestmentAccount58"/>
 *         <element name="BnfcryDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}IndividualPerson31" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UnitsNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}DecimalNumber"/>
 *         <element name="Rndg" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}RoundingDirection2Code" minOccurs="0"/>
 *         <element name="NetAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="GrssAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TradDtTm" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}DateAndDateTimeChoice"/>
 *         <element name="DealgPricDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}UnitPrice22"/>
 *         <element name="InftvPricDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}UnitPrice22" maxOccurs="2" minOccurs="0"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ActiveCurrencyAndAmount"/>
 *         <element name="CshSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ISODate" minOccurs="0"/>
 *         <element name="SttlmMtd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}DeliveryReceiptType2Code" minOccurs="0"/>
 *         <element name="PrtlyExctdInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}YesNoIndicator"/>
 *         <element name="BestExctn" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}BestExecution1Code" minOccurs="0"/>
 *         <element name="CumDvddInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}YesNoIndicator"/>
 *         <element name="IntrmPrftAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ProfitAndLoss2Choice" minOccurs="0"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ForeignExchangeTerms33" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IncmPref" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}IncomePreference1Code" minOccurs="0"/>
 *         <element name="LttrInttRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Max35Text" minOccurs="0"/>
 *         <element name="AcmltnRghtRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Max35Text" minOccurs="0"/>
 *         <element name="TxOvrhd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}TotalFeesAndTaxes40" minOccurs="0"/>
 *         <element name="InftvTaxDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}InformativeTax1" minOccurs="0"/>
 *         <element name="SttlmAndCtdyDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}FundSettlementParameters12" minOccurs="0"/>
 *         <element name="PhysDlvryInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}YesNoIndicator"/>
 *         <element name="PhysDlvryDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}DeliveryParameters3" minOccurs="0"/>
 *         <element name="StffClntBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}InvestmentFundsOrderBreakdown2" maxOccurs="4" minOccurs="0"/>
 *         <element name="Rfnd" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SbcptIntrst" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CshSttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PaymentTransaction70" minOccurs="0"/>
 *         <element name="NonStdSttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Max350Text" minOccurs="0"/>
 *         <element name="PrtlSttlmOfUnits" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="FinAdvc" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}FinancialAdvice1Code" minOccurs="0"/>
 *         <element name="NgtdTrad" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}NegotiatedTrade1Code" minOccurs="0"/>
 *         <element name="LateRpt" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}LateReport1Code" minOccurs="0"/>
 *         <element name="PrtlSttlmOfCsh" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="RltdPtyDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Intermediary39" maxOccurs="10" minOccurs="0"/>
 *         <element name="Equlstn" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}Equalisation1" minOccurs="0"/>
 *         <element name="SrcOfCsh" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}SourceOfCash1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CstmrCndctClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}CustomerConductClassification1Choice" minOccurs="0"/>
 *         <element name="TxChanlTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}TransactionChannelType1Choice" minOccurs="0"/>
 *         <element name="SgntrTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}SignatureType1Choice" minOccurs="0"/>
 *         <element name="OrdrWvrDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}OrderWaiver1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionExecution12", propOrder = {
    "ordrRef",
    "clntRef",
    "dealRef",
    "ordrTp",
    "invstmtAcctDtls",
    "bnfcryDtls",
    "unitsNb",
    "rndg",
    "netAmt",
    "grssAmt",
    "tradDtTm",
    "dealgPricDtls",
    "inftvPricDtls",
    "sttlmAmt",
    "cshSttlmDt",
    "sttlmMtd",
    "prtlyExctdInd",
    "bestExctn",
    "cumDvddInd",
    "intrmPrftAmt",
    "fxDtls",
    "incmPref",
    "lttrInttRef",
    "acmltnRghtRef",
    "txOvrhd",
    "inftvTaxDtls",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls",
    "stffClntBrkdwn",
    "rfnd",
    "sbcptIntrst",
    "cshSttlmDtls",
    "nonStdSttlmInf",
    "prtlSttlmOfUnits",
    "finAdvc",
    "ngtdTrad",
    "lateRpt",
    "prtlSttlmOfCsh",
    "rltdPtyDtls",
    "equlstn",
    "srcOfCsh",
    "cstmrCndctClssfctn",
    "txChanlTp",
    "sgntrTp",
    "ordrWvrDtls"
})
public class SubscriptionExecution12 {

    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef", required = true)
    protected String dealRef;
    @XmlElement(name = "OrdrTp")
    protected List<FundOrderType4Choice> ordrTp;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "BnfcryDtls")
    protected List<IndividualPerson31> bnfcryDtls;
    @XmlElement(name = "UnitsNb", required = true)
    protected BigDecimal unitsNb;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "GrssAmt")
    protected ActiveCurrencyAndAmount grssAmt;
    @XmlElement(name = "TradDtTm", required = true)
    protected DateAndDateTimeChoice tradDtTm;
    @XmlElement(name = "DealgPricDtls", required = true)
    protected UnitPrice22 dealgPricDtls;
    @XmlElement(name = "InftvPricDtls")
    protected List<UnitPrice22> inftvPricDtls;
    @XmlElement(name = "SttlmAmt", required = true)
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "CshSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "SttlmMtd")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code sttlmMtd;
    @XmlElement(name = "PrtlyExctdInd")
    protected boolean prtlyExctdInd;
    @XmlElement(name = "BestExctn")
    @XmlSchemaType(name = "string")
    protected BestExecution1Code bestExctn;
    @XmlElement(name = "CumDvddInd")
    protected boolean cumDvddInd;
    @XmlElement(name = "IntrmPrftAmt")
    protected ProfitAndLoss2Choice intrmPrftAmt;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms33> fxDtls;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "LttrInttRef")
    protected String lttrInttRef;
    @XmlElement(name = "AcmltnRghtRef")
    protected String acmltnRghtRef;
    @XmlElement(name = "TxOvrhd")
    protected TotalFeesAndTaxes40 txOvrhd;
    @XmlElement(name = "InftvTaxDtls")
    protected InformativeTax1 inftvTaxDtls;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters12 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected DeliveryParameters3 physDlvryDtls;
    @XmlElement(name = "StffClntBrkdwn")
    protected List<InvestmentFundsOrderBreakdown2> stffClntBrkdwn;
    @XmlElement(name = "Rfnd")
    protected ActiveCurrencyAndAmount rfnd;
    @XmlElement(name = "SbcptIntrst")
    protected ActiveCurrencyAndAmount sbcptIntrst;
    @XmlElement(name = "CshSttlmDtls")
    protected PaymentTransaction70 cshSttlmDtls;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "PrtlSttlmOfUnits")
    protected BigDecimal prtlSttlmOfUnits;
    @XmlElement(name = "FinAdvc")
    @XmlSchemaType(name = "string")
    protected FinancialAdvice1Code finAdvc;
    @XmlElement(name = "NgtdTrad")
    @XmlSchemaType(name = "string")
    protected NegotiatedTrade1Code ngtdTrad;
    @XmlElement(name = "LateRpt")
    @XmlSchemaType(name = "string")
    protected LateReport1Code lateRpt;
    @XmlElement(name = "PrtlSttlmOfCsh")
    protected BigDecimal prtlSttlmOfCsh;
    @XmlElement(name = "RltdPtyDtls")
    protected List<Intermediary39> rltdPtyDtls;
    @XmlElement(name = "Equlstn")
    protected Equalisation1 equlstn;
    @XmlElement(name = "SrcOfCsh")
    protected List<SourceOfCash1Choice> srcOfCsh;
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
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealRef(String value) {
        this.dealRef = value;
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
     * {@link IndividualPerson31 }
     * 
     * 
     * @return
     *     The value of the bnfcryDtls property.
     */
    public List<IndividualPerson31> getBnfcryDtls() {
        if (bnfcryDtls == null) {
            bnfcryDtls = new ArrayList<>();
        }
        return this.bnfcryDtls;
    }

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitsNb(BigDecimal value) {
        this.unitsNb = value;
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
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrssAmt(ActiveCurrencyAndAmount value) {
        this.grssAmt = value;
    }

    /**
     * Gets the value of the tradDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getTradDtTm() {
        return tradDtTm;
    }

    /**
     * Sets the value of the tradDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setTradDtTm(DateAndDateTimeChoice value) {
        this.tradDtTm = value;
    }

    /**
     * Gets the value of the dealgPricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPrice22 }
     *     
     */
    public UnitPrice22 getDealgPricDtls() {
        return dealgPricDtls;
    }

    /**
     * Sets the value of the dealgPricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPrice22 }
     *     
     */
    public void setDealgPricDtls(UnitPrice22 value) {
        this.dealgPricDtls = value;
    }

    /**
     * Gets the value of the inftvPricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the inftvPricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInftvPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPrice22 }
     * 
     * 
     * @return
     *     The value of the inftvPricDtls property.
     */
    public List<UnitPrice22> getInftvPricDtls() {
        if (inftvPricDtls == null) {
            inftvPricDtls = new ArrayList<>();
        }
        return this.inftvPricDtls;
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
     * Gets the value of the prtlyExctdInd property.
     * 
     */
    public boolean isPrtlyExctdInd() {
        return prtlyExctdInd;
    }

    /**
     * Sets the value of the prtlyExctdInd property.
     * 
     */
    public void setPrtlyExctdInd(boolean value) {
        this.prtlyExctdInd = value;
    }

    /**
     * Gets the value of the bestExctn property.
     * 
     * @return
     *     possible object is
     *     {@link BestExecution1Code }
     *     
     */
    public BestExecution1Code getBestExctn() {
        return bestExctn;
    }

    /**
     * Sets the value of the bestExctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestExecution1Code }
     *     
     */
    public void setBestExctn(BestExecution1Code value) {
        this.bestExctn = value;
    }

    /**
     * Gets the value of the cumDvddInd property.
     * 
     */
    public boolean isCumDvddInd() {
        return cumDvddInd;
    }

    /**
     * Sets the value of the cumDvddInd property.
     * 
     */
    public void setCumDvddInd(boolean value) {
        this.cumDvddInd = value;
    }

    /**
     * Gets the value of the intrmPrftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ProfitAndLoss2Choice }
     *     
     */
    public ProfitAndLoss2Choice getIntrmPrftAmt() {
        return intrmPrftAmt;
    }

    /**
     * Sets the value of the intrmPrftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfitAndLoss2Choice }
     *     
     */
    public void setIntrmPrftAmt(ProfitAndLoss2Choice value) {
        this.intrmPrftAmt = value;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms33 }
     * 
     * 
     * @return
     *     The value of the fxDtls property.
     */
    public List<ForeignExchangeTerms33> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<>();
        }
        return this.fxDtls;
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
     * Gets the value of the lttrInttRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLttrInttRef() {
        return lttrInttRef;
    }

    /**
     * Sets the value of the lttrInttRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLttrInttRef(String value) {
        this.lttrInttRef = value;
    }

    /**
     * Gets the value of the acmltnRghtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcmltnRghtRef() {
        return acmltnRghtRef;
    }

    /**
     * Sets the value of the acmltnRghtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcmltnRghtRef(String value) {
        this.acmltnRghtRef = value;
    }

    /**
     * Gets the value of the txOvrhd property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFeesAndTaxes40 }
     *     
     */
    public TotalFeesAndTaxes40 getTxOvrhd() {
        return txOvrhd;
    }

    /**
     * Sets the value of the txOvrhd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFeesAndTaxes40 }
     *     
     */
    public void setTxOvrhd(TotalFeesAndTaxes40 value) {
        this.txOvrhd = value;
    }

    /**
     * Gets the value of the inftvTaxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InformativeTax1 }
     *     
     */
    public InformativeTax1 getInftvTaxDtls() {
        return inftvTaxDtls;
    }

    /**
     * Sets the value of the inftvTaxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformativeTax1 }
     *     
     */
    public void setInftvTaxDtls(InformativeTax1 value) {
        this.inftvTaxDtls = value;
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
     * Gets the value of the rfnd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRfnd() {
        return rfnd;
    }

    /**
     * Sets the value of the rfnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRfnd(ActiveCurrencyAndAmount value) {
        this.rfnd = value;
    }

    /**
     * Gets the value of the sbcptIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSbcptIntrst() {
        return sbcptIntrst;
    }

    /**
     * Sets the value of the sbcptIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setSbcptIntrst(ActiveCurrencyAndAmount value) {
        this.sbcptIntrst = value;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction70 }
     *     
     */
    public PaymentTransaction70 getCshSttlmDtls() {
        return cshSttlmDtls;
    }

    /**
     * Sets the value of the cshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction70 }
     *     
     */
    public void setCshSttlmDtls(PaymentTransaction70 value) {
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
     * Gets the value of the prtlSttlmOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlSttlmOfUnits() {
        return prtlSttlmOfUnits;
    }

    /**
     * Sets the value of the prtlSttlmOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrtlSttlmOfUnits(BigDecimal value) {
        this.prtlSttlmOfUnits = value;
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
     * Gets the value of the lateRpt property.
     * 
     * @return
     *     possible object is
     *     {@link LateReport1Code }
     *     
     */
    public LateReport1Code getLateRpt() {
        return lateRpt;
    }

    /**
     * Sets the value of the lateRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LateReport1Code }
     *     
     */
    public void setLateRpt(LateReport1Code value) {
        this.lateRpt = value;
    }

    /**
     * Gets the value of the prtlSttlmOfCsh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrtlSttlmOfCsh() {
        return prtlSttlmOfCsh;
    }

    /**
     * Sets the value of the prtlSttlmOfCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrtlSttlmOfCsh(BigDecimal value) {
        this.prtlSttlmOfCsh = value;
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
     * {@link Intermediary39 }
     * 
     * 
     * @return
     *     The value of the rltdPtyDtls property.
     */
    public List<Intermediary39> getRltdPtyDtls() {
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
     * Gets the value of the srcOfCsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the srcOfCsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrcOfCsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceOfCash1Choice }
     * 
     * 
     * @return
     *     The value of the srcOfCsh property.
     */
    public List<SourceOfCash1Choice> getSrcOfCsh() {
        if (srcOfCsh == null) {
            srcOfCsh = new ArrayList<>();
        }
        return this.srcOfCsh;
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
