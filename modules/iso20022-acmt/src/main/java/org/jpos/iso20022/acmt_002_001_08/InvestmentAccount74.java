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

package org.jpos.iso20022.acmt_002_001_08;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentAccount74 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentAccount74">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text"/>
 *         <element name="AcctSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}AccountStatus2" minOccurs="0"/>
 *         <element name="BlckdSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}BlockedStatusReason2Choice" minOccurs="0"/>
 *         <element name="StsDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Dsgnt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}AccountType2Choice" minOccurs="0"/>
 *         <element name="OwnrshTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}OwnershipType2Choice" minOccurs="0"/>
 *         <element name="TaxXmptn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}TaxExemptionReason2Choice" minOccurs="0"/>
 *         <element name="StmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}StatementFrequencyReason2Choice" minOccurs="0"/>
 *         <element name="RefCcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}LanguageCode" minOccurs="0"/>
 *         <element name="IncmPref" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}IncomePreference2Code" minOccurs="0"/>
 *         <element name="RinvstmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Reinvestment4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxWhldgMtd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}TaxWithholdingMethod3Code" minOccurs="0"/>
 *         <element name="TaxRptg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}TaxReporting3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LttrInttDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}LetterIntent1" minOccurs="0"/>
 *         <element name="AcmltnRghtRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="ReqrdSgntriesNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Number" minOccurs="0"/>
 *         <element name="FndFmlyNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max350Text" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}FinancialInstrument87" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RndgDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}RoundingParameters1" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *         <element name="AcctUsgTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}AccountUsageType2Choice" minOccurs="0"/>
 *         <element name="FrgnStsCertfctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Provided1Code" minOccurs="0"/>
 *         <element name="AcctSgntrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="TxChanlTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}TransactionChannelType1Choice" minOccurs="0"/>
 *         <element name="InvstmtAcctCtgy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountCategory1Choice" minOccurs="0"/>
 *         <element name="Pldgg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Eligible1Code" minOccurs="0"/>
 *         <element name="Coll" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Collateral1Code" minOccurs="0"/>
 *         <element name="ThrdPtyRghts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ThirdPartyRights2" minOccurs="0"/>
 *         <element name="PwrOfAttnyLvlOfCtrl" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}LevelOfControl1Choice" minOccurs="0"/>
 *         <element name="AcctgSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}AccountingStatus1Choice" minOccurs="0"/>
 *         <element name="OpngDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="NegInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="PrcgOrdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PositionEffect3Code" minOccurs="0"/>
 *         <element name="Lblty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Liability1Choice" minOccurs="0"/>
 *         <element name="InvstrPrfl" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestorProfile2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FsclYr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}FiscalYear1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount74", propOrder = {
    "id",
    "acctSts",
    "blckdSts",
    "stsDt",
    "nm",
    "dsgnt",
    "tp",
    "ownrshTp",
    "taxXmptn",
    "stmtFrqcy",
    "refCcy",
    "lang",
    "incmPref",
    "rinvstmtDtls",
    "taxWhldgMtd",
    "taxRptg",
    "lttrInttDtls",
    "acmltnRghtRef",
    "reqrdSgntriesNb",
    "fndFmlyNm",
    "finInstrmDtls",
    "rndgDtls",
    "acctSvcr",
    "acctUsgTp",
    "frgnStsCertfctn",
    "acctSgntrDtTm",
    "txChanlTp",
    "invstmtAcctCtgy",
    "pldgg",
    "coll",
    "thrdPtyRghts",
    "pwrOfAttnyLvlOfCtrl",
    "acctgSts",
    "opngDt",
    "clsgDt",
    "negInd",
    "prcgOrdr",
    "lblty",
    "invstrPrfl",
    "fsclYr"
})
public class InvestmentAccount74 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AcctSts")
    protected AccountStatus2 acctSts;
    @XmlElement(name = "BlckdSts")
    protected BlockedStatusReason2Choice blckdSts;
    @XmlElement(name = "StsDt")
    protected DateAndDateTime1Choice stsDt;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "Tp")
    protected AccountType2Choice tp;
    @XmlElement(name = "OwnrshTp")
    protected OwnershipType2Choice ownrshTp;
    @XmlElement(name = "TaxXmptn")
    protected TaxExemptionReason2Choice taxXmptn;
    @XmlElement(name = "StmtFrqcy")
    protected StatementFrequencyReason2Choice stmtFrqcy;
    @XmlElement(name = "RefCcy")
    protected String refCcy;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference2Code incmPref;
    @XmlElement(name = "RinvstmtDtls")
    protected List<Reinvestment4> rinvstmtDtls;
    @XmlElement(name = "TaxWhldgMtd")
    @XmlSchemaType(name = "string")
    protected TaxWithholdingMethod3Code taxWhldgMtd;
    @XmlElement(name = "TaxRptg")
    protected List<TaxReporting3> taxRptg;
    @XmlElement(name = "LttrInttDtls")
    protected LetterIntent1 lttrInttDtls;
    @XmlElement(name = "AcmltnRghtRef")
    protected String acmltnRghtRef;
    @XmlElement(name = "ReqrdSgntriesNb")
    protected BigDecimal reqrdSgntriesNb;
    @XmlElement(name = "FndFmlyNm")
    protected String fndFmlyNm;
    @XmlElement(name = "FinInstrmDtls")
    protected List<FinancialInstrument87> finInstrmDtls;
    @XmlElement(name = "RndgDtls")
    protected RoundingParameters1 rndgDtls;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification125Choice acctSvcr;
    @XmlElement(name = "AcctUsgTp")
    protected AccountUsageType2Choice acctUsgTp;
    @XmlElement(name = "FrgnStsCertfctn")
    @XmlSchemaType(name = "string")
    protected Provided1Code frgnStsCertfctn;
    @XmlElement(name = "AcctSgntrDtTm")
    protected DateAndDateTime1Choice acctSgntrDtTm;
    @XmlElement(name = "TxChanlTp")
    protected TransactionChannelType1Choice txChanlTp;
    @XmlElement(name = "InvstmtAcctCtgy")
    protected InvestmentAccountCategory1Choice invstmtAcctCtgy;
    @XmlElement(name = "Pldgg")
    @XmlSchemaType(name = "string")
    protected Eligible1Code pldgg;
    @XmlElement(name = "Coll")
    @XmlSchemaType(name = "string")
    protected Collateral1Code coll;
    @XmlElement(name = "ThrdPtyRghts")
    protected ThirdPartyRights2 thrdPtyRghts;
    @XmlElement(name = "PwrOfAttnyLvlOfCtrl")
    protected LevelOfControl1Choice pwrOfAttnyLvlOfCtrl;
    @XmlElement(name = "AcctgSts")
    protected AccountingStatus1Choice acctgSts;
    @XmlElement(name = "OpngDt")
    protected DateAndDateTime1Choice opngDt;
    @XmlElement(name = "ClsgDt")
    protected DateAndDateTime1Choice clsgDt;
    @XmlElement(name = "NegInd")
    protected Boolean negInd;
    @XmlElement(name = "PrcgOrdr")
    @XmlSchemaType(name = "string")
    protected PositionEffect3Code prcgOrdr;
    @XmlElement(name = "Lblty")
    protected Liability1Choice lblty;
    @XmlElement(name = "InvstrPrfl")
    protected List<InvestorProfile2> invstrPrfl;
    @XmlElement(name = "FsclYr")
    protected FiscalYear1Choice fsclYr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the acctSts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus2 }
     *     
     */
    public AccountStatus2 getAcctSts() {
        return acctSts;
    }

    /**
     * Sets the value of the acctSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus2 }
     *     
     */
    public void setAcctSts(AccountStatus2 value) {
        this.acctSts = value;
    }

    /**
     * Gets the value of the blckdSts property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedStatusReason2Choice }
     *     
     */
    public BlockedStatusReason2Choice getBlckdSts() {
        return blckdSts;
    }

    /**
     * Sets the value of the blckdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedStatusReason2Choice }
     *     
     */
    public void setBlckdSts(BlockedStatusReason2Choice value) {
        this.blckdSts = value;
    }

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setStsDt(DateAndDateTime1Choice value) {
        this.stsDt = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the dsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsgnt() {
        return dsgnt;
    }

    /**
     * Sets the value of the dsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsgnt(String value) {
        this.dsgnt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType2Choice }
     *     
     */
    public AccountType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType2Choice }
     *     
     */
    public void setTp(AccountType2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ownrshTp property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipType2Choice }
     *     
     */
    public OwnershipType2Choice getOwnrshTp() {
        return ownrshTp;
    }

    /**
     * Sets the value of the ownrshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipType2Choice }
     *     
     */
    public void setOwnrshTp(OwnershipType2Choice value) {
        this.ownrshTp = value;
    }

    /**
     * Gets the value of the taxXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReason2Choice }
     *     
     */
    public TaxExemptionReason2Choice getTaxXmptn() {
        return taxXmptn;
    }

    /**
     * Sets the value of the taxXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReason2Choice }
     *     
     */
    public void setTaxXmptn(TaxExemptionReason2Choice value) {
        this.taxXmptn = value;
    }

    /**
     * Gets the value of the stmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link StatementFrequencyReason2Choice }
     *     
     */
    public StatementFrequencyReason2Choice getStmtFrqcy() {
        return stmtFrqcy;
    }

    /**
     * Sets the value of the stmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementFrequencyReason2Choice }
     *     
     */
    public void setStmtFrqcy(StatementFrequencyReason2Choice value) {
        this.stmtFrqcy = value;
    }

    /**
     * Gets the value of the refCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCcy() {
        return refCcy;
    }

    /**
     * Sets the value of the refCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCcy(String value) {
        this.refCcy = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference2Code }
     *     
     */
    public IncomePreference2Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference2Code }
     *     
     */
    public void setIncmPref(IncomePreference2Code value) {
        this.incmPref = value;
    }

    /**
     * Gets the value of the rinvstmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rinvstmtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRinvstmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reinvestment4 }
     * 
     * 
     * @return
     *     The value of the rinvstmtDtls property.
     */
    public List<Reinvestment4> getRinvstmtDtls() {
        if (rinvstmtDtls == null) {
            rinvstmtDtls = new ArrayList<>();
        }
        return this.rinvstmtDtls;
    }

    /**
     * Gets the value of the taxWhldgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxWithholdingMethod3Code }
     *     
     */
    public TaxWithholdingMethod3Code getTaxWhldgMtd() {
        return taxWhldgMtd;
    }

    /**
     * Sets the value of the taxWhldgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxWithholdingMethod3Code }
     *     
     */
    public void setTaxWhldgMtd(TaxWithholdingMethod3Code value) {
        this.taxWhldgMtd = value;
    }

    /**
     * Gets the value of the taxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReporting3 }
     * 
     * 
     * @return
     *     The value of the taxRptg property.
     */
    public List<TaxReporting3> getTaxRptg() {
        if (taxRptg == null) {
            taxRptg = new ArrayList<>();
        }
        return this.taxRptg;
    }

    /**
     * Gets the value of the lttrInttDtls property.
     * 
     * @return
     *     possible object is
     *     {@link LetterIntent1 }
     *     
     */
    public LetterIntent1 getLttrInttDtls() {
        return lttrInttDtls;
    }

    /**
     * Sets the value of the lttrInttDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterIntent1 }
     *     
     */
    public void setLttrInttDtls(LetterIntent1 value) {
        this.lttrInttDtls = value;
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
     * Gets the value of the reqrdSgntriesNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqrdSgntriesNb() {
        return reqrdSgntriesNb;
    }

    /**
     * Sets the value of the reqrdSgntriesNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReqrdSgntriesNb(BigDecimal value) {
        this.reqrdSgntriesNb = value;
    }

    /**
     * Gets the value of the fndFmlyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndFmlyNm() {
        return fndFmlyNm;
    }

    /**
     * Sets the value of the fndFmlyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFndFmlyNm(String value) {
        this.fndFmlyNm = value;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument87 }
     * 
     * 
     * @return
     *     The value of the finInstrmDtls property.
     */
    public List<FinancialInstrument87> getFinInstrmDtls() {
        if (finInstrmDtls == null) {
            finInstrmDtls = new ArrayList<>();
        }
        return this.finInstrmDtls;
    }

    /**
     * Gets the value of the rndgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingParameters1 }
     *     
     */
    public RoundingParameters1 getRndgDtls() {
        return rndgDtls;
    }

    /**
     * Sets the value of the rndgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingParameters1 }
     *     
     */
    public void setRndgDtls(RoundingParameters1 value) {
        this.rndgDtls = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setAcctSvcr(PartyIdentification125Choice value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the acctUsgTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUsageType2Choice }
     *     
     */
    public AccountUsageType2Choice getAcctUsgTp() {
        return acctUsgTp;
    }

    /**
     * Sets the value of the acctUsgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUsageType2Choice }
     *     
     */
    public void setAcctUsgTp(AccountUsageType2Choice value) {
        this.acctUsgTp = value;
    }

    /**
     * Gets the value of the frgnStsCertfctn property.
     * 
     * @return
     *     possible object is
     *     {@link Provided1Code }
     *     
     */
    public Provided1Code getFrgnStsCertfctn() {
        return frgnStsCertfctn;
    }

    /**
     * Sets the value of the frgnStsCertfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provided1Code }
     *     
     */
    public void setFrgnStsCertfctn(Provided1Code value) {
        this.frgnStsCertfctn = value;
    }

    /**
     * Gets the value of the acctSgntrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getAcctSgntrDtTm() {
        return acctSgntrDtTm;
    }

    /**
     * Sets the value of the acctSgntrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setAcctSgntrDtTm(DateAndDateTime1Choice value) {
        this.acctSgntrDtTm = value;
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
     * Gets the value of the invstmtAcctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountCategory1Choice }
     *     
     */
    public InvestmentAccountCategory1Choice getInvstmtAcctCtgy() {
        return invstmtAcctCtgy;
    }

    /**
     * Sets the value of the invstmtAcctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountCategory1Choice }
     *     
     */
    public void setInvstmtAcctCtgy(InvestmentAccountCategory1Choice value) {
        this.invstmtAcctCtgy = value;
    }

    /**
     * Gets the value of the pldgg property.
     * 
     * @return
     *     possible object is
     *     {@link Eligible1Code }
     *     
     */
    public Eligible1Code getPldgg() {
        return pldgg;
    }

    /**
     * Sets the value of the pldgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligible1Code }
     *     
     */
    public void setPldgg(Eligible1Code value) {
        this.pldgg = value;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral1Code }
     *     
     */
    public Collateral1Code getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral1Code }
     *     
     */
    public void setColl(Collateral1Code value) {
        this.coll = value;
    }

    /**
     * Gets the value of the thrdPtyRghts property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyRights2 }
     *     
     */
    public ThirdPartyRights2 getThrdPtyRghts() {
        return thrdPtyRghts;
    }

    /**
     * Sets the value of the thrdPtyRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyRights2 }
     *     
     */
    public void setThrdPtyRghts(ThirdPartyRights2 value) {
        this.thrdPtyRghts = value;
    }

    /**
     * Gets the value of the pwrOfAttnyLvlOfCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link LevelOfControl1Choice }
     *     
     */
    public LevelOfControl1Choice getPwrOfAttnyLvlOfCtrl() {
        return pwrOfAttnyLvlOfCtrl;
    }

    /**
     * Sets the value of the pwrOfAttnyLvlOfCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelOfControl1Choice }
     *     
     */
    public void setPwrOfAttnyLvlOfCtrl(LevelOfControl1Choice value) {
        this.pwrOfAttnyLvlOfCtrl = value;
    }

    /**
     * Gets the value of the acctgSts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingStatus1Choice }
     *     
     */
    public AccountingStatus1Choice getAcctgSts() {
        return acctgSts;
    }

    /**
     * Sets the value of the acctgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingStatus1Choice }
     *     
     */
    public void setAcctgSts(AccountingStatus1Choice value) {
        this.acctgSts = value;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setOpngDt(DateAndDateTime1Choice value) {
        this.opngDt = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setClsgDt(DateAndDateTime1Choice value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the negInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegInd() {
        return negInd;
    }

    /**
     * Sets the value of the negInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegInd(Boolean value) {
        this.negInd = value;
    }

    /**
     * Gets the value of the prcgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffect3Code }
     *     
     */
    public PositionEffect3Code getPrcgOrdr() {
        return prcgOrdr;
    }

    /**
     * Sets the value of the prcgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffect3Code }
     *     
     */
    public void setPrcgOrdr(PositionEffect3Code value) {
        this.prcgOrdr = value;
    }

    /**
     * Gets the value of the lblty property.
     * 
     * @return
     *     possible object is
     *     {@link Liability1Choice }
     *     
     */
    public Liability1Choice getLblty() {
        return lblty;
    }

    /**
     * Sets the value of the lblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liability1Choice }
     *     
     */
    public void setLblty(Liability1Choice value) {
        this.lblty = value;
    }

    /**
     * Gets the value of the invstrPrfl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstrPrfl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstrPrfl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestorProfile2 }
     * 
     * 
     * @return
     *     The value of the invstrPrfl property.
     */
    public List<InvestorProfile2> getInvstrPrfl() {
        if (invstrPrfl == null) {
            invstrPrfl = new ArrayList<>();
        }
        return this.invstrPrfl;
    }

    /**
     * Gets the value of the fsclYr property.
     * 
     * @return
     *     possible object is
     *     {@link FiscalYear1Choice }
     *     
     */
    public FiscalYear1Choice getFsclYr() {
        return fsclYr;
    }

    /**
     * Sets the value of the fsclYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiscalYear1Choice }
     *     
     */
    public void setFsclYr(FiscalYear1Choice value) {
        this.fsclYr = value;
    }

}
