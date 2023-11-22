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

package org.jpos.iso20022.auth_080_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanMatchingCriteria9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoanMatchingCriteria9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnqTradIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareText2" minOccurs="0"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="CtrctTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareExposureType3" minOccurs="0"/>
 *         <element name="ClrSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareClearingStatus3" minOccurs="0"/>
 *         <element name="ClrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDateTime3" minOccurs="0"/>
 *         <element name="CCP" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareOrganisationIdentification6" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareMICIdentifier3" minOccurs="0"/>
 *         <element name="MstrAgrmtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareAgreementType2" minOccurs="0"/>
 *         <element name="ExctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDateTime3" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="MinNtcePrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="EarlstCallBckDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="GnlColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareSpecialCollateral3" minOccurs="0"/>
 *         <element name="DlvryByVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareTrueFalseIndicator3" minOccurs="0"/>
 *         <element name="CollDlvryMtd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDeliveryMethod3" minOccurs="0"/>
 *         <element name="OpnTerm" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareTrueFalseIndicator3" minOccurs="0"/>
 *         <element name="TermntnOptn" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareTerminationOption3" minOccurs="0"/>
 *         <element name="FxdIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ComparePercentageRate3" minOccurs="0"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareInterestComputationMethod3" minOccurs="0"/>
 *         <element name="FltgIntrstRefRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareBenchmarkCurveName3" minOccurs="0"/>
 *         <element name="FltgIntrstRateTermUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareRateBasis3" minOccurs="0"/>
 *         <element name="FltgIntrstRateTermVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="FltgIntrstRatePmtFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareRateBasis3" minOccurs="0"/>
 *         <element name="FltgIntrstRatePmtFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber5" minOccurs="0"/>
 *         <element name="FltgIntrstRateRstFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareRateBasis3" minOccurs="0"/>
 *         <element name="FltgIntrstRateRstFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber6" minOccurs="0"/>
 *         <element name="BsisPtSprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDecimalNumber3" minOccurs="0"/>
 *         <element name="MrgnLnAttr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareInterestRate1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrncplAmtValDtAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareActiveOrHistoricCurrencyAndAmount3" minOccurs="0"/>
 *         <element name="PrncplAmtMtrtyDtAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareActiveOrHistoricCurrencyAndAmount3" minOccurs="0"/>
 *         <element name="AsstTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}SecurityCommodity7Choice" minOccurs="0"/>
 *         <element name="LnVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareActiveOrHistoricCurrencyAndAmount3" minOccurs="0"/>
 *         <element name="FxdRbtRefRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ComparePercentageRate3" minOccurs="0"/>
 *         <element name="FltgRbtRefRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareBenchmarkCurveName3" minOccurs="0"/>
 *         <element name="FltgRbtRateTermUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareRateBasis3" minOccurs="0"/>
 *         <element name="FltgRbtRateTermVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber6" minOccurs="0"/>
 *         <element name="FltgRbtRatePmtFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareRateBasis3" minOccurs="0"/>
 *         <element name="FltgRbtRatePmtFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber6" minOccurs="0"/>
 *         <element name="FltgRbtRateRstFrqcyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareRateBasis3" minOccurs="0"/>
 *         <element name="FltgRbtRateRstFrqcyVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareNumber6" minOccurs="0"/>
 *         <element name="RbtRateBsisPtSprd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDecimalNumber3" minOccurs="0"/>
 *         <element name="FltgRateAdjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ComparePercentageRate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FltgRateAdjstmntDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDate3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LndgFee" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ComparePercentageRate3" minOccurs="0"/>
 *         <element name="OutsdngMrgnLnAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareActiveOrHistoricCurrencyAndAmount3" minOccurs="0"/>
 *         <element name="ShrtMktValAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareActiveOrHistoricCurrencyAndAmount3" minOccurs="0"/>
 *         <element name="LvlTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareReportingLevelType3" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareUnitOfMeasure3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanMatchingCriteria9", propOrder = {
    "unqTradIdr",
    "termntnDt",
    "ctrctTp",
    "clrSts",
    "clrDtTm",
    "ccp",
    "tradgVn",
    "mstrAgrmtTp",
    "exctnDtTm",
    "valDt",
    "mtrtyDt",
    "minNtcePrd",
    "earlstCallBckDt",
    "gnlColl",
    "dlvryByVal",
    "collDlvryMtd",
    "opnTerm",
    "termntnOptn",
    "fxdIntrstRate",
    "dayCntBsis",
    "fltgIntrstRefRate",
    "fltgIntrstRateTermUnit",
    "fltgIntrstRateTermVal",
    "fltgIntrstRatePmtFrqcyUnit",
    "fltgIntrstRatePmtFrqcyVal",
    "fltgIntrstRateRstFrqcyUnit",
    "fltgIntrstRateRstFrqcyVal",
    "bsisPtSprd",
    "mrgnLnAttr",
    "prncplAmtValDtAmt",
    "prncplAmtMtrtyDtAmt",
    "asstTp",
    "lnVal",
    "fxdRbtRefRate",
    "fltgRbtRefRate",
    "fltgRbtRateTermUnit",
    "fltgRbtRateTermVal",
    "fltgRbtRatePmtFrqcyUnit",
    "fltgRbtRatePmtFrqcyVal",
    "fltgRbtRateRstFrqcyUnit",
    "fltgRbtRateRstFrqcyVal",
    "rbtRateBsisPtSprd",
    "fltgRateAdjstmnt",
    "fltgRateAdjstmntDt",
    "lndgFee",
    "outsdngMrgnLnAmt",
    "shrtMktValAmt",
    "lvlTp",
    "unitOfMeasr"
})
public class LoanMatchingCriteria9 {

    @XmlElement(name = "UnqTradIdr")
    protected CompareText2 unqTradIdr;
    @XmlElement(name = "TermntnDt")
    protected CompareDate3 termntnDt;
    @XmlElement(name = "CtrctTp")
    protected CompareExposureType3 ctrctTp;
    @XmlElement(name = "ClrSts")
    protected CompareClearingStatus3 clrSts;
    @XmlElement(name = "ClrDtTm")
    protected CompareDateTime3 clrDtTm;
    @XmlElement(name = "CCP")
    protected CompareOrganisationIdentification6 ccp;
    @XmlElement(name = "TradgVn")
    protected CompareMICIdentifier3 tradgVn;
    @XmlElement(name = "MstrAgrmtTp")
    protected CompareAgreementType2 mstrAgrmtTp;
    @XmlElement(name = "ExctnDtTm")
    protected CompareDateTime3 exctnDtTm;
    @XmlElement(name = "ValDt")
    protected CompareDate3 valDt;
    @XmlElement(name = "MtrtyDt")
    protected CompareDate3 mtrtyDt;
    @XmlElement(name = "MinNtcePrd")
    protected CompareNumber5 minNtcePrd;
    @XmlElement(name = "EarlstCallBckDt")
    protected CompareDate3 earlstCallBckDt;
    @XmlElement(name = "GnlColl")
    protected CompareSpecialCollateral3 gnlColl;
    @XmlElement(name = "DlvryByVal")
    protected CompareTrueFalseIndicator3 dlvryByVal;
    @XmlElement(name = "CollDlvryMtd")
    protected CompareDeliveryMethod3 collDlvryMtd;
    @XmlElement(name = "OpnTerm")
    protected CompareTrueFalseIndicator3 opnTerm;
    @XmlElement(name = "TermntnOptn")
    protected CompareTerminationOption3 termntnOptn;
    @XmlElement(name = "FxdIntrstRate")
    protected ComparePercentageRate3 fxdIntrstRate;
    @XmlElement(name = "DayCntBsis")
    protected CompareInterestComputationMethod3 dayCntBsis;
    @XmlElement(name = "FltgIntrstRefRate")
    protected CompareBenchmarkCurveName3 fltgIntrstRefRate;
    @XmlElement(name = "FltgIntrstRateTermUnit")
    protected CompareRateBasis3 fltgIntrstRateTermUnit;
    @XmlElement(name = "FltgIntrstRateTermVal")
    protected CompareNumber5 fltgIntrstRateTermVal;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyUnit")
    protected CompareRateBasis3 fltgIntrstRatePmtFrqcyUnit;
    @XmlElement(name = "FltgIntrstRatePmtFrqcyVal")
    protected CompareNumber5 fltgIntrstRatePmtFrqcyVal;
    @XmlElement(name = "FltgIntrstRateRstFrqcyUnit")
    protected CompareRateBasis3 fltgIntrstRateRstFrqcyUnit;
    @XmlElement(name = "FltgIntrstRateRstFrqcyVal")
    protected CompareNumber6 fltgIntrstRateRstFrqcyVal;
    @XmlElement(name = "BsisPtSprd")
    protected CompareDecimalNumber3 bsisPtSprd;
    @XmlElement(name = "MrgnLnAttr")
    protected List<CompareInterestRate1> mrgnLnAttr;
    @XmlElement(name = "PrncplAmtValDtAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount3 prncplAmtValDtAmt;
    @XmlElement(name = "PrncplAmtMtrtyDtAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount3 prncplAmtMtrtyDtAmt;
    @XmlElement(name = "AsstTp")
    protected SecurityCommodity7Choice asstTp;
    @XmlElement(name = "LnVal")
    protected CompareActiveOrHistoricCurrencyAndAmount3 lnVal;
    @XmlElement(name = "FxdRbtRefRate")
    protected ComparePercentageRate3 fxdRbtRefRate;
    @XmlElement(name = "FltgRbtRefRate")
    protected CompareBenchmarkCurveName3 fltgRbtRefRate;
    @XmlElement(name = "FltgRbtRateTermUnit")
    protected CompareRateBasis3 fltgRbtRateTermUnit;
    @XmlElement(name = "FltgRbtRateTermVal")
    protected CompareNumber6 fltgRbtRateTermVal;
    @XmlElement(name = "FltgRbtRatePmtFrqcyUnit")
    protected CompareRateBasis3 fltgRbtRatePmtFrqcyUnit;
    @XmlElement(name = "FltgRbtRatePmtFrqcyVal")
    protected CompareNumber6 fltgRbtRatePmtFrqcyVal;
    @XmlElement(name = "FltgRbtRateRstFrqcyUnit")
    protected CompareRateBasis3 fltgRbtRateRstFrqcyUnit;
    @XmlElement(name = "FltgRbtRateRstFrqcyVal")
    protected CompareNumber6 fltgRbtRateRstFrqcyVal;
    @XmlElement(name = "RbtRateBsisPtSprd")
    protected CompareDecimalNumber3 rbtRateBsisPtSprd;
    @XmlElement(name = "FltgRateAdjstmnt")
    protected List<ComparePercentageRate3> fltgRateAdjstmnt;
    @XmlElement(name = "FltgRateAdjstmntDt")
    protected List<CompareDate3> fltgRateAdjstmntDt;
    @XmlElement(name = "LndgFee")
    protected ComparePercentageRate3 lndgFee;
    @XmlElement(name = "OutsdngMrgnLnAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount3 outsdngMrgnLnAmt;
    @XmlElement(name = "ShrtMktValAmt")
    protected CompareActiveOrHistoricCurrencyAndAmount3 shrtMktValAmt;
    @XmlElement(name = "LvlTp")
    protected CompareReportingLevelType3 lvlTp;
    @XmlElement(name = "UnitOfMeasr")
    protected CompareUnitOfMeasure3 unitOfMeasr;

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareText2 }
     *     
     */
    public CompareText2 getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareText2 }
     *     
     */
    public void setUnqTradIdr(CompareText2 value) {
        this.unqTradIdr = value;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setTermntnDt(CompareDate3 value) {
        this.termntnDt = value;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareExposureType3 }
     *     
     */
    public CompareExposureType3 getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareExposureType3 }
     *     
     */
    public void setCtrctTp(CompareExposureType3 value) {
        this.ctrctTp = value;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link CompareClearingStatus3 }
     *     
     */
    public CompareClearingStatus3 getClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareClearingStatus3 }
     *     
     */
    public void setClrSts(CompareClearingStatus3 value) {
        this.clrSts = value;
    }

    /**
     * Gets the value of the clrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime3 }
     *     
     */
    public CompareDateTime3 getClrDtTm() {
        return clrDtTm;
    }

    /**
     * Sets the value of the clrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime3 }
     *     
     */
    public void setClrDtTm(CompareDateTime3 value) {
        this.clrDtTm = value;
    }

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public CompareOrganisationIdentification6 getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public void setCCP(CompareOrganisationIdentification6 value) {
        this.ccp = value;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareMICIdentifier3 }
     *     
     */
    public CompareMICIdentifier3 getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareMICIdentifier3 }
     *     
     */
    public void setTradgVn(CompareMICIdentifier3 value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the mstrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAgreementType2 }
     *     
     */
    public CompareAgreementType2 getMstrAgrmtTp() {
        return mstrAgrmtTp;
    }

    /**
     * Sets the value of the mstrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAgreementType2 }
     *     
     */
    public void setMstrAgrmtTp(CompareAgreementType2 value) {
        this.mstrAgrmtTp = value;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDateTime3 }
     *     
     */
    public CompareDateTime3 getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDateTime3 }
     *     
     */
    public void setExctnDtTm(CompareDateTime3 value) {
        this.exctnDtTm = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setValDt(CompareDate3 value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setMtrtyDt(CompareDate3 value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the minNtcePrd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getMinNtcePrd() {
        return minNtcePrd;
    }

    /**
     * Sets the value of the minNtcePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setMinNtcePrd(CompareNumber5 value) {
        this.minNtcePrd = value;
    }

    /**
     * Gets the value of the earlstCallBckDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getEarlstCallBckDt() {
        return earlstCallBckDt;
    }

    /**
     * Sets the value of the earlstCallBckDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setEarlstCallBckDt(CompareDate3 value) {
        this.earlstCallBckDt = value;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSpecialCollateral3 }
     *     
     */
    public CompareSpecialCollateral3 getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSpecialCollateral3 }
     *     
     */
    public void setGnlColl(CompareSpecialCollateral3 value) {
        this.gnlColl = value;
    }

    /**
     * Gets the value of the dlvryByVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getDlvryByVal() {
        return dlvryByVal;
    }

    /**
     * Sets the value of the dlvryByVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public void setDlvryByVal(CompareTrueFalseIndicator3 value) {
        this.dlvryByVal = value;
    }

    /**
     * Gets the value of the collDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDeliveryMethod3 }
     *     
     */
    public CompareDeliveryMethod3 getCollDlvryMtd() {
        return collDlvryMtd;
    }

    /**
     * Sets the value of the collDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDeliveryMethod3 }
     *     
     */
    public void setCollDlvryMtd(CompareDeliveryMethod3 value) {
        this.collDlvryMtd = value;
    }

    /**
     * Gets the value of the opnTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getOpnTerm() {
        return opnTerm;
    }

    /**
     * Sets the value of the opnTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public void setOpnTerm(CompareTrueFalseIndicator3 value) {
        this.opnTerm = value;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTerminationOption3 }
     *     
     */
    public CompareTerminationOption3 getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTerminationOption3 }
     *     
     */
    public void setTermntnOptn(CompareTerminationOption3 value) {
        this.termntnOptn = value;
    }

    /**
     * Gets the value of the fxdIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getFxdIntrstRate() {
        return fxdIntrstRate;
    }

    /**
     * Sets the value of the fxdIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public void setFxdIntrstRate(ComparePercentageRate3 value) {
        this.fxdIntrstRate = value;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CompareInterestComputationMethod3 }
     *     
     */
    public CompareInterestComputationMethod3 getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareInterestComputationMethod3 }
     *     
     */
    public void setDayCntBsis(CompareInterestComputationMethod3 value) {
        this.dayCntBsis = value;
    }

    /**
     * Gets the value of the fltgIntrstRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public CompareBenchmarkCurveName3 getFltgIntrstRefRate() {
        return fltgIntrstRefRate;
    }

    /**
     * Sets the value of the fltgIntrstRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public void setFltgIntrstRefRate(CompareBenchmarkCurveName3 value) {
        this.fltgIntrstRefRate = value;
    }

    /**
     * Gets the value of the fltgIntrstRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRateTermUnit() {
        return fltgIntrstRateTermUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public void setFltgIntrstRateTermUnit(CompareRateBasis3 value) {
        this.fltgIntrstRateTermUnit = value;
    }

    /**
     * Gets the value of the fltgIntrstRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getFltgIntrstRateTermVal() {
        return fltgIntrstRateTermVal;
    }

    /**
     * Sets the value of the fltgIntrstRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setFltgIntrstRateTermVal(CompareNumber5 value) {
        this.fltgIntrstRateTermVal = value;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRatePmtFrqcyUnit() {
        return fltgIntrstRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public void setFltgIntrstRatePmtFrqcyUnit(CompareRateBasis3 value) {
        this.fltgIntrstRatePmtFrqcyUnit = value;
    }

    /**
     * Gets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber5 }
     *     
     */
    public CompareNumber5 getFltgIntrstRatePmtFrqcyVal() {
        return fltgIntrstRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber5 }
     *     
     */
    public void setFltgIntrstRatePmtFrqcyVal(CompareNumber5 value) {
        this.fltgIntrstRatePmtFrqcyVal = value;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgIntrstRateRstFrqcyUnit() {
        return fltgIntrstRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public void setFltgIntrstRateRstFrqcyUnit(CompareRateBasis3 value) {
        this.fltgIntrstRateRstFrqcyUnit = value;
    }

    /**
     * Gets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgIntrstRateRstFrqcyVal() {
        return fltgIntrstRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgIntrstRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public void setFltgIntrstRateRstFrqcyVal(CompareNumber6 value) {
        this.fltgIntrstRateRstFrqcyVal = value;
    }

    /**
     * Gets the value of the bsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Sets the value of the bsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public void setBsisPtSprd(CompareDecimalNumber3 value) {
        this.bsisPtSprd = value;
    }

    /**
     * Gets the value of the mrgnLnAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgnLnAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnLnAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareInterestRate1 }
     * 
     * 
     * @return
     *     The value of the mrgnLnAttr property.
     */
    public List<CompareInterestRate1> getMrgnLnAttr() {
        if (mrgnLnAttr == null) {
            mrgnLnAttr = new ArrayList<>();
        }
        return this.mrgnLnAttr;
    }

    /**
     * Gets the value of the prncplAmtValDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getPrncplAmtValDtAmt() {
        return prncplAmtValDtAmt;
    }

    /**
     * Sets the value of the prncplAmtValDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public void setPrncplAmtValDtAmt(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.prncplAmtValDtAmt = value;
    }

    /**
     * Gets the value of the prncplAmtMtrtyDtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getPrncplAmtMtrtyDtAmt() {
        return prncplAmtMtrtyDtAmt;
    }

    /**
     * Sets the value of the prncplAmtMtrtyDtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public void setPrncplAmtMtrtyDtAmt(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.prncplAmtMtrtyDtAmt = value;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCommodity7Choice }
     *     
     */
    public SecurityCommodity7Choice getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCommodity7Choice }
     *     
     */
    public void setAsstTp(SecurityCommodity7Choice value) {
        this.asstTp = value;
    }

    /**
     * Gets the value of the lnVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getLnVal() {
        return lnVal;
    }

    /**
     * Sets the value of the lnVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public void setLnVal(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.lnVal = value;
    }

    /**
     * Gets the value of the fxdRbtRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getFxdRbtRefRate() {
        return fxdRbtRefRate;
    }

    /**
     * Sets the value of the fxdRbtRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public void setFxdRbtRefRate(ComparePercentageRate3 value) {
        this.fxdRbtRefRate = value;
    }

    /**
     * Gets the value of the fltgRbtRefRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public CompareBenchmarkCurveName3 getFltgRbtRefRate() {
        return fltgRbtRefRate;
    }

    /**
     * Sets the value of the fltgRbtRefRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareBenchmarkCurveName3 }
     *     
     */
    public void setFltgRbtRefRate(CompareBenchmarkCurveName3 value) {
        this.fltgRbtRefRate = value;
    }

    /**
     * Gets the value of the fltgRbtRateTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgRbtRateTermUnit() {
        return fltgRbtRateTermUnit;
    }

    /**
     * Sets the value of the fltgRbtRateTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public void setFltgRbtRateTermUnit(CompareRateBasis3 value) {
        this.fltgRbtRateTermUnit = value;
    }

    /**
     * Gets the value of the fltgRbtRateTermVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgRbtRateTermVal() {
        return fltgRbtRateTermVal;
    }

    /**
     * Sets the value of the fltgRbtRateTermVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public void setFltgRbtRateTermVal(CompareNumber6 value) {
        this.fltgRbtRateTermVal = value;
    }

    /**
     * Gets the value of the fltgRbtRatePmtFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgRbtRatePmtFrqcyUnit() {
        return fltgRbtRatePmtFrqcyUnit;
    }

    /**
     * Sets the value of the fltgRbtRatePmtFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public void setFltgRbtRatePmtFrqcyUnit(CompareRateBasis3 value) {
        this.fltgRbtRatePmtFrqcyUnit = value;
    }

    /**
     * Gets the value of the fltgRbtRatePmtFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgRbtRatePmtFrqcyVal() {
        return fltgRbtRatePmtFrqcyVal;
    }

    /**
     * Sets the value of the fltgRbtRatePmtFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public void setFltgRbtRatePmtFrqcyVal(CompareNumber6 value) {
        this.fltgRbtRatePmtFrqcyVal = value;
    }

    /**
     * Gets the value of the fltgRbtRateRstFrqcyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public CompareRateBasis3 getFltgRbtRateRstFrqcyUnit() {
        return fltgRbtRateRstFrqcyUnit;
    }

    /**
     * Sets the value of the fltgRbtRateRstFrqcyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareRateBasis3 }
     *     
     */
    public void setFltgRbtRateRstFrqcyUnit(CompareRateBasis3 value) {
        this.fltgRbtRateRstFrqcyUnit = value;
    }

    /**
     * Gets the value of the fltgRbtRateRstFrqcyVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareNumber6 }
     *     
     */
    public CompareNumber6 getFltgRbtRateRstFrqcyVal() {
        return fltgRbtRateRstFrqcyVal;
    }

    /**
     * Sets the value of the fltgRbtRateRstFrqcyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareNumber6 }
     *     
     */
    public void setFltgRbtRateRstFrqcyVal(CompareNumber6 value) {
        this.fltgRbtRateRstFrqcyVal = value;
    }

    /**
     * Gets the value of the rbtRateBsisPtSprd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getRbtRateBsisPtSprd() {
        return rbtRateBsisPtSprd;
    }

    /**
     * Sets the value of the rbtRateBsisPtSprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public void setRbtRateBsisPtSprd(CompareDecimalNumber3 value) {
        this.rbtRateBsisPtSprd = value;
    }

    /**
     * Gets the value of the fltgRateAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fltgRateAdjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFltgRateAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparePercentageRate3 }
     * 
     * 
     * @return
     *     The value of the fltgRateAdjstmnt property.
     */
    public List<ComparePercentageRate3> getFltgRateAdjstmnt() {
        if (fltgRateAdjstmnt == null) {
            fltgRateAdjstmnt = new ArrayList<>();
        }
        return this.fltgRateAdjstmnt;
    }

    /**
     * Gets the value of the fltgRateAdjstmntDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fltgRateAdjstmntDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFltgRateAdjstmntDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareDate3 }
     * 
     * 
     * @return
     *     The value of the fltgRateAdjstmntDt property.
     */
    public List<CompareDate3> getFltgRateAdjstmntDt() {
        if (fltgRateAdjstmntDt == null) {
            fltgRateAdjstmntDt = new ArrayList<>();
        }
        return this.fltgRateAdjstmntDt;
    }

    /**
     * Gets the value of the lndgFee property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getLndgFee() {
        return lndgFee;
    }

    /**
     * Sets the value of the lndgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public void setLndgFee(ComparePercentageRate3 value) {
        this.lndgFee = value;
    }

    /**
     * Gets the value of the outsdngMrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getOutsdngMrgnLnAmt() {
        return outsdngMrgnLnAmt;
    }

    /**
     * Sets the value of the outsdngMrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public void setOutsdngMrgnLnAmt(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.outsdngMrgnLnAmt = value;
    }

    /**
     * Gets the value of the shrtMktValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public CompareActiveOrHistoricCurrencyAndAmount3 getShrtMktValAmt() {
        return shrtMktValAmt;
    }

    /**
     * Sets the value of the shrtMktValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareActiveOrHistoricCurrencyAndAmount3 }
     *     
     */
    public void setShrtMktValAmt(CompareActiveOrHistoricCurrencyAndAmount3 value) {
        this.shrtMktValAmt = value;
    }

    /**
     * Gets the value of the lvlTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareReportingLevelType3 }
     *     
     */
    public CompareReportingLevelType3 getLvlTp() {
        return lvlTp;
    }

    /**
     * Sets the value of the lvlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareReportingLevelType3 }
     *     
     */
    public void setLvlTp(CompareReportingLevelType3 value) {
        this.lvlTp = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitOfMeasure3 }
     *     
     */
    public CompareUnitOfMeasure3 getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitOfMeasure3 }
     *     
     */
    public void setUnitOfMeasr(CompareUnitOfMeasure3 value) {
        this.unitOfMeasr = value;
    }

}
