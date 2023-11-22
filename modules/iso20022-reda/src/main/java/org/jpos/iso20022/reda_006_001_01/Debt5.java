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

package org.jpos.iso20022.reda_006_001_01;

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
 * <p>Java class for Debt5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Debt5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtCcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="FaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Frequency35Choice" minOccurs="0"/>
 *         <element name="IntrstFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="DtdDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="FrstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="NxtCpnDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="PutblDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="NxtCllblDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="NxtFctrDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="XprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="PmtDrctnInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PaymentDirectionIndicator" minOccurs="0"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="NxtIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="OddCpnInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="CllblInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="CPPrgm" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Number" minOccurs="0"/>
 *         <element name="CPRegnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max350Text" minOccurs="0"/>
 *         <element name="IntrstAcrlDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="PutblInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PreFnddInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="EscrwdInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PerptlInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="SubrdntdInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="XtndblInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="XtndblPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DateTimePeriod1Choice" minOccurs="0"/>
 *         <element name="VarblRateInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="OverAlltmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OverAlltmtRate" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="AmtsblInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="IntrstClctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max70Text" minOccurs="0"/>
 *         <element name="CptlsdIntrst" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DistributionPolicy2Choice" minOccurs="0"/>
 *         <element name="ActlDnmtnAmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ActiveCurrencyAndAmount" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CurFctr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="NxtFctr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="PrvsFctr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="Pcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="PlsMax" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="PlsPerMln" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="PlsPerLot" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="PlsPerTrad" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="CstPrePmtPnltyInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="LotId" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CstPrePmtYld" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="WghtdAvrgCpn" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="WghtdAvrgLife" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="WghtdAvrgLn" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="WghtdAvrgMtrty" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="InsrdInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="BkQlfdInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="YldClctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YieldCalculation6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrstTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}InterestType3Code" minOccurs="0"/>
 *         <element name="InstrmStrTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}InstrumentSubStructureType2Choice" minOccurs="0"/>
 *         <element name="GblTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}GlobalNote2Choice" minOccurs="0"/>
 *         <element name="PotntlEuroSysElgblty" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="Geogcs" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="YldRg" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}AmountOrPercentageRange1" minOccurs="0"/>
 *         <element name="CpnRg" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}AmountOrPercentageRange1" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max256Text" minOccurs="0"/>
 *         <element name="AltrntvMinTaxInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="AutoRinvstmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="Hrcut" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="TxConds" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}TradeTransactionCondition7Choice" minOccurs="0"/>
 *         <element name="LookBck" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Number" minOccurs="0"/>
 *         <element name="MaxSbstitn" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Number" minOccurs="0"/>
 *         <element name="MinIncrmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="MinQty" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="Pdctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RstrctdInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PricFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Frequency35Choice" minOccurs="0"/>
 *         <element name="Sctr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SbstitnFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Frequency35Choice" minOccurs="0"/>
 *         <element name="SbstitnLft" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Number" minOccurs="0"/>
 *         <element name="WhlPoolInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PricSrc" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PricRg" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}AmountOrPercentageRange1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Debt5", propOrder = {
    "pmtCcy",
    "faceAmt",
    "pmtFrqcy",
    "intrstFxgDt",
    "dtdDt",
    "frstPmtDt",
    "mtrtyDt",
    "nxtCpnDt",
    "putblDt",
    "nxtCllblDt",
    "nxtFctrDt",
    "xprtnDt",
    "pmtDrctnInd",
    "intrstRate",
    "nxtIntrstRate",
    "oddCpnInd",
    "cllblInd",
    "cpPrgm",
    "cpRegnTp",
    "intrstAcrlDt",
    "putblInd",
    "preFnddInd",
    "escrwdInd",
    "perptlInd",
    "subrdntdInd",
    "xtndblInd",
    "xtndblPrd",
    "varblRateInd",
    "overAlltmtAmt",
    "overAlltmtRate",
    "amtsblInd",
    "intrstClctnMtd",
    "cptlsdIntrst",
    "actlDnmtnAmt",
    "curFctr",
    "nxtFctr",
    "prvsFctr",
    "pcs",
    "plsMax",
    "plsPerMln",
    "plsPerLot",
    "plsPerTrad",
    "cstPrePmtPnltyInd",
    "lotId",
    "cstPrePmtYld",
    "wghtdAvrgCpn",
    "wghtdAvrgLife",
    "wghtdAvrgLn",
    "wghtdAvrgMtrty",
    "insrdInd",
    "bkQlfdInd",
    "yldClctn",
    "intrstTp",
    "instrmStrTp",
    "gblTp",
    "potntlEuroSysElgblty",
    "geogcs",
    "yldRg",
    "cpnRg",
    "purp",
    "altrntvMinTaxInd",
    "autoRinvstmt",
    "hrcut",
    "txConds",
    "lookBck",
    "maxSbstitn",
    "minIncrmt",
    "minQty",
    "pdctn",
    "rstrctdInd",
    "pricFrqcy",
    "sctr",
    "sbstitnFrqcy",
    "sbstitnLft",
    "whlPoolInd",
    "pricSrc",
    "pricRg"
})
public class Debt5 {

    @XmlElement(name = "PmtCcy")
    protected String pmtCcy;
    @XmlElement(name = "FaceAmt")
    protected ActiveCurrencyAndAmount faceAmt;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency35Choice pmtFrqcy;
    @XmlElement(name = "IntrstFxgDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar intrstFxgDt;
    @XmlElement(name = "DtdDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtdDt;
    @XmlElement(name = "FrstPmtDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frstPmtDt;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "NxtCpnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nxtCpnDt;
    @XmlElement(name = "PutblDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar putblDt;
    @XmlElement(name = "NxtCllblDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nxtCllblDt;
    @XmlElement(name = "NxtFctrDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nxtFctrDt;
    @XmlElement(name = "XprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "PmtDrctnInd")
    protected Boolean pmtDrctnInd;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "NxtIntrstRate")
    protected BigDecimal nxtIntrstRate;
    @XmlElement(name = "OddCpnInd")
    protected Boolean oddCpnInd;
    @XmlElement(name = "CllblInd")
    protected Boolean cllblInd;
    @XmlElement(name = "CPPrgm")
    protected BigDecimal cpPrgm;
    @XmlElement(name = "CPRegnTp")
    protected String cpRegnTp;
    @XmlElement(name = "IntrstAcrlDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar intrstAcrlDt;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
    @XmlElement(name = "PreFnddInd")
    protected Boolean preFnddInd;
    @XmlElement(name = "EscrwdInd")
    protected Boolean escrwdInd;
    @XmlElement(name = "PerptlInd")
    protected Boolean perptlInd;
    @XmlElement(name = "SubrdntdInd")
    protected Boolean subrdntdInd;
    @XmlElement(name = "XtndblInd")
    protected Boolean xtndblInd;
    @XmlElement(name = "XtndblPrd")
    protected DateTimePeriod1Choice xtndblPrd;
    @XmlElement(name = "VarblRateInd")
    protected Boolean varblRateInd;
    @XmlElement(name = "OverAlltmtAmt")
    protected ActiveCurrencyAndAmount overAlltmtAmt;
    @XmlElement(name = "OverAlltmtRate")
    protected BigDecimal overAlltmtRate;
    @XmlElement(name = "AmtsblInd")
    protected Boolean amtsblInd;
    @XmlElement(name = "IntrstClctnMtd")
    protected String intrstClctnMtd;
    @XmlElement(name = "CptlsdIntrst")
    protected DistributionPolicy2Choice cptlsdIntrst;
    @XmlElement(name = "ActlDnmtnAmt")
    protected List<ActiveCurrencyAndAmount> actlDnmtnAmt;
    @XmlElement(name = "CurFctr")
    protected BigDecimal curFctr;
    @XmlElement(name = "NxtFctr")
    protected BigDecimal nxtFctr;
    @XmlElement(name = "PrvsFctr")
    protected BigDecimal prvsFctr;
    @XmlElement(name = "Pcs")
    protected BigDecimal pcs;
    @XmlElement(name = "PlsMax")
    protected BigDecimal plsMax;
    @XmlElement(name = "PlsPerMln")
    protected BigDecimal plsPerMln;
    @XmlElement(name = "PlsPerLot")
    protected BigDecimal plsPerLot;
    @XmlElement(name = "PlsPerTrad")
    protected BigDecimal plsPerTrad;
    @XmlElement(name = "CstPrePmtPnltyInd")
    protected Boolean cstPrePmtPnltyInd;
    @XmlElement(name = "LotId")
    protected String lotId;
    @XmlElement(name = "CstPrePmtYld")
    protected BigDecimal cstPrePmtYld;
    @XmlElement(name = "WghtdAvrgCpn")
    protected BigDecimal wghtdAvrgCpn;
    @XmlElement(name = "WghtdAvrgLife")
    protected BigDecimal wghtdAvrgLife;
    @XmlElement(name = "WghtdAvrgLn")
    protected BigDecimal wghtdAvrgLn;
    @XmlElement(name = "WghtdAvrgMtrty")
    protected BigDecimal wghtdAvrgMtrty;
    @XmlElement(name = "InsrdInd")
    protected Boolean insrdInd;
    @XmlElement(name = "BkQlfdInd")
    protected Boolean bkQlfdInd;
    @XmlElement(name = "YldClctn")
    protected List<YieldCalculation6> yldClctn;
    @XmlElement(name = "IntrstTp")
    @XmlSchemaType(name = "string")
    protected InterestType3Code intrstTp;
    @XmlElement(name = "InstrmStrTp")
    protected InstrumentSubStructureType2Choice instrmStrTp;
    @XmlElement(name = "GblTp")
    protected GlobalNote2Choice gblTp;
    @XmlElement(name = "PotntlEuroSysElgblty")
    protected Boolean potntlEuroSysElgblty;
    @XmlElement(name = "Geogcs")
    protected String geogcs;
    @XmlElement(name = "YldRg")
    protected AmountOrPercentageRange1 yldRg;
    @XmlElement(name = "CpnRg")
    protected AmountOrPercentageRange1 cpnRg;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "AltrntvMinTaxInd")
    protected Boolean altrntvMinTaxInd;
    @XmlElement(name = "AutoRinvstmt")
    protected BigDecimal autoRinvstmt;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "TxConds")
    protected TradeTransactionCondition7Choice txConds;
    @XmlElement(name = "LookBck")
    protected BigDecimal lookBck;
    @XmlElement(name = "MaxSbstitn")
    protected BigDecimal maxSbstitn;
    @XmlElement(name = "MinIncrmt")
    protected FinancialInstrumentQuantity1Choice minIncrmt;
    @XmlElement(name = "MinQty")
    protected FinancialInstrumentQuantity1Choice minQty;
    @XmlElement(name = "Pdctn")
    protected String pdctn;
    @XmlElement(name = "RstrctdInd")
    protected Boolean rstrctdInd;
    @XmlElement(name = "PricFrqcy")
    protected Frequency35Choice pricFrqcy;
    @XmlElement(name = "Sctr")
    protected String sctr;
    @XmlElement(name = "SbstitnFrqcy")
    protected Frequency35Choice sbstitnFrqcy;
    @XmlElement(name = "SbstitnLft")
    protected BigDecimal sbstitnLft;
    @XmlElement(name = "WhlPoolInd")
    protected Boolean whlPoolInd;
    @XmlElement(name = "PricSrc")
    protected String pricSrc;
    @XmlElement(name = "PricRg")
    protected AmountOrPercentageRange1 pricRg;

    /**
     * Gets the value of the pmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCcy() {
        return pmtCcy;
    }

    /**
     * Sets the value of the pmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtCcy(String value) {
        this.pmtCcy = value;
    }

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setFaceAmt(ActiveCurrencyAndAmount value) {
        this.faceAmt = value;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency35Choice }
     *     
     */
    public Frequency35Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency35Choice }
     *     
     */
    public void setPmtFrqcy(Frequency35Choice value) {
        this.pmtFrqcy = value;
    }

    /**
     * Gets the value of the intrstFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrstFxgDt() {
        return intrstFxgDt;
    }

    /**
     * Sets the value of the intrstFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrstFxgDt(XMLGregorianCalendar value) {
        this.intrstFxgDt = value;
    }

    /**
     * Gets the value of the dtdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtdDt() {
        return dtdDt;
    }

    /**
     * Sets the value of the dtdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtdDt(XMLGregorianCalendar value) {
        this.dtdDt = value;
    }

    /**
     * Gets the value of the frstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstPmtDt() {
        return frstPmtDt;
    }

    /**
     * Sets the value of the frstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrstPmtDt(XMLGregorianCalendar value) {
        this.frstPmtDt = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the nxtCpnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNxtCpnDt() {
        return nxtCpnDt;
    }

    /**
     * Sets the value of the nxtCpnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNxtCpnDt(XMLGregorianCalendar value) {
        this.nxtCpnDt = value;
    }

    /**
     * Gets the value of the putblDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPutblDt() {
        return putblDt;
    }

    /**
     * Sets the value of the putblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPutblDt(XMLGregorianCalendar value) {
        this.putblDt = value;
    }

    /**
     * Gets the value of the nxtCllblDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNxtCllblDt() {
        return nxtCllblDt;
    }

    /**
     * Sets the value of the nxtCllblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNxtCllblDt(XMLGregorianCalendar value) {
        this.nxtCllblDt = value;
    }

    /**
     * Gets the value of the nxtFctrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNxtFctrDt() {
        return nxtFctrDt;
    }

    /**
     * Sets the value of the nxtFctrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNxtFctrDt(XMLGregorianCalendar value) {
        this.nxtFctrDt = value;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXprtnDt(XMLGregorianCalendar value) {
        this.xprtnDt = value;
    }

    /**
     * Gets the value of the pmtDrctnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtDrctnInd() {
        return pmtDrctnInd;
    }

    /**
     * Sets the value of the pmtDrctnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtDrctnInd(Boolean value) {
        this.pmtDrctnInd = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the nxtIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNxtIntrstRate() {
        return nxtIntrstRate;
    }

    /**
     * Sets the value of the nxtIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNxtIntrstRate(BigDecimal value) {
        this.nxtIntrstRate = value;
    }

    /**
     * Gets the value of the oddCpnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOddCpnInd() {
        return oddCpnInd;
    }

    /**
     * Sets the value of the oddCpnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOddCpnInd(Boolean value) {
        this.oddCpnInd = value;
    }

    /**
     * Gets the value of the cllblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCllblInd() {
        return cllblInd;
    }

    /**
     * Sets the value of the cllblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCllblInd(Boolean value) {
        this.cllblInd = value;
    }

    /**
     * Gets the value of the cpPrgm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCPPrgm() {
        return cpPrgm;
    }

    /**
     * Sets the value of the cpPrgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCPPrgm(BigDecimal value) {
        this.cpPrgm = value;
    }

    /**
     * Gets the value of the cpRegnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPRegnTp() {
        return cpRegnTp;
    }

    /**
     * Sets the value of the cpRegnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPRegnTp(String value) {
        this.cpRegnTp = value;
    }

    /**
     * Gets the value of the intrstAcrlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrstAcrlDt() {
        return intrstAcrlDt;
    }

    /**
     * Sets the value of the intrstAcrlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrstAcrlDt(XMLGregorianCalendar value) {
        this.intrstAcrlDt = value;
    }

    /**
     * Gets the value of the putblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPutblInd() {
        return putblInd;
    }

    /**
     * Sets the value of the putblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPutblInd(Boolean value) {
        this.putblInd = value;
    }

    /**
     * Gets the value of the preFnddInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreFnddInd() {
        return preFnddInd;
    }

    /**
     * Sets the value of the preFnddInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreFnddInd(Boolean value) {
        this.preFnddInd = value;
    }

    /**
     * Gets the value of the escrwdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscrwdInd() {
        return escrwdInd;
    }

    /**
     * Sets the value of the escrwdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscrwdInd(Boolean value) {
        this.escrwdInd = value;
    }

    /**
     * Gets the value of the perptlInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerptlInd() {
        return perptlInd;
    }

    /**
     * Sets the value of the perptlInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerptlInd(Boolean value) {
        this.perptlInd = value;
    }

    /**
     * Gets the value of the subrdntdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubrdntdInd() {
        return subrdntdInd;
    }

    /**
     * Sets the value of the subrdntdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubrdntdInd(Boolean value) {
        this.subrdntdInd = value;
    }

    /**
     * Gets the value of the xtndblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXtndblInd() {
        return xtndblInd;
    }

    /**
     * Sets the value of the xtndblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXtndblInd(Boolean value) {
        this.xtndblInd = value;
    }

    /**
     * Gets the value of the xtndblPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getXtndblPrd() {
        return xtndblPrd;
    }

    /**
     * Sets the value of the xtndblPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setXtndblPrd(DateTimePeriod1Choice value) {
        this.xtndblPrd = value;
    }

    /**
     * Gets the value of the varblRateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVarblRateInd() {
        return varblRateInd;
    }

    /**
     * Sets the value of the varblRateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVarblRateInd(Boolean value) {
        this.varblRateInd = value;
    }

    /**
     * Gets the value of the overAlltmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOverAlltmtAmt() {
        return overAlltmtAmt;
    }

    /**
     * Sets the value of the overAlltmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setOverAlltmtAmt(ActiveCurrencyAndAmount value) {
        this.overAlltmtAmt = value;
    }

    /**
     * Gets the value of the overAlltmtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverAlltmtRate() {
        return overAlltmtRate;
    }

    /**
     * Sets the value of the overAlltmtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverAlltmtRate(BigDecimal value) {
        this.overAlltmtRate = value;
    }

    /**
     * Gets the value of the amtsblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmtsblInd() {
        return amtsblInd;
    }

    /**
     * Sets the value of the amtsblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmtsblInd(Boolean value) {
        this.amtsblInd = value;
    }

    /**
     * Gets the value of the intrstClctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstClctnMtd() {
        return intrstClctnMtd;
    }

    /**
     * Sets the value of the intrstClctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrstClctnMtd(String value) {
        this.intrstClctnMtd = value;
    }

    /**
     * Gets the value of the cptlsdIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy2Choice }
     *     
     */
    public DistributionPolicy2Choice getCptlsdIntrst() {
        return cptlsdIntrst;
    }

    /**
     * Sets the value of the cptlsdIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy2Choice }
     *     
     */
    public void setCptlsdIntrst(DistributionPolicy2Choice value) {
        this.cptlsdIntrst = value;
    }

    /**
     * Gets the value of the actlDnmtnAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actlDnmtnAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActlDnmtnAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveCurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the actlDnmtnAmt property.
     */
    public List<ActiveCurrencyAndAmount> getActlDnmtnAmt() {
        if (actlDnmtnAmt == null) {
            actlDnmtnAmt = new ArrayList<>();
        }
        return this.actlDnmtnAmt;
    }

    /**
     * Gets the value of the curFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurFctr() {
        return curFctr;
    }

    /**
     * Sets the value of the curFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurFctr(BigDecimal value) {
        this.curFctr = value;
    }

    /**
     * Gets the value of the nxtFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNxtFctr() {
        return nxtFctr;
    }

    /**
     * Sets the value of the nxtFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNxtFctr(BigDecimal value) {
        this.nxtFctr = value;
    }

    /**
     * Gets the value of the prvsFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrvsFctr() {
        return prvsFctr;
    }

    /**
     * Sets the value of the prvsFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrvsFctr(BigDecimal value) {
        this.prvsFctr = value;
    }

    /**
     * Gets the value of the pcs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPcs() {
        return pcs;
    }

    /**
     * Sets the value of the pcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPcs(BigDecimal value) {
        this.pcs = value;
    }

    /**
     * Gets the value of the plsMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlsMax() {
        return plsMax;
    }

    /**
     * Sets the value of the plsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlsMax(BigDecimal value) {
        this.plsMax = value;
    }

    /**
     * Gets the value of the plsPerMln property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlsPerMln() {
        return plsPerMln;
    }

    /**
     * Sets the value of the plsPerMln property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlsPerMln(BigDecimal value) {
        this.plsPerMln = value;
    }

    /**
     * Gets the value of the plsPerLot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlsPerLot() {
        return plsPerLot;
    }

    /**
     * Sets the value of the plsPerLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlsPerLot(BigDecimal value) {
        this.plsPerLot = value;
    }

    /**
     * Gets the value of the plsPerTrad property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlsPerTrad() {
        return plsPerTrad;
    }

    /**
     * Sets the value of the plsPerTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlsPerTrad(BigDecimal value) {
        this.plsPerTrad = value;
    }

    /**
     * Gets the value of the cstPrePmtPnltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstPrePmtPnltyInd() {
        return cstPrePmtPnltyInd;
    }

    /**
     * Sets the value of the cstPrePmtPnltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCstPrePmtPnltyInd(Boolean value) {
        this.cstPrePmtPnltyInd = value;
    }

    /**
     * Gets the value of the lotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotId() {
        return lotId;
    }

    /**
     * Sets the value of the lotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotId(String value) {
        this.lotId = value;
    }

    /**
     * Gets the value of the cstPrePmtYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCstPrePmtYld() {
        return cstPrePmtYld;
    }

    /**
     * Sets the value of the cstPrePmtYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCstPrePmtYld(BigDecimal value) {
        this.cstPrePmtYld = value;
    }

    /**
     * Gets the value of the wghtdAvrgCpn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgCpn() {
        return wghtdAvrgCpn;
    }

    /**
     * Sets the value of the wghtdAvrgCpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWghtdAvrgCpn(BigDecimal value) {
        this.wghtdAvrgCpn = value;
    }

    /**
     * Gets the value of the wghtdAvrgLife property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgLife() {
        return wghtdAvrgLife;
    }

    /**
     * Sets the value of the wghtdAvrgLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWghtdAvrgLife(BigDecimal value) {
        this.wghtdAvrgLife = value;
    }

    /**
     * Gets the value of the wghtdAvrgLn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgLn() {
        return wghtdAvrgLn;
    }

    /**
     * Sets the value of the wghtdAvrgLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWghtdAvrgLn(BigDecimal value) {
        this.wghtdAvrgLn = value;
    }

    /**
     * Gets the value of the wghtdAvrgMtrty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgMtrty() {
        return wghtdAvrgMtrty;
    }

    /**
     * Sets the value of the wghtdAvrgMtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWghtdAvrgMtrty(BigDecimal value) {
        this.wghtdAvrgMtrty = value;
    }

    /**
     * Gets the value of the insrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrdInd() {
        return insrdInd;
    }

    /**
     * Sets the value of the insrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsrdInd(Boolean value) {
        this.insrdInd = value;
    }

    /**
     * Gets the value of the bkQlfdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBkQlfdInd() {
        return bkQlfdInd;
    }

    /**
     * Sets the value of the bkQlfdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBkQlfdInd(Boolean value) {
        this.bkQlfdInd = value;
    }

    /**
     * Gets the value of the yldClctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the yldClctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYldClctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YieldCalculation6 }
     * 
     * 
     * @return
     *     The value of the yldClctn property.
     */
    public List<YieldCalculation6> getYldClctn() {
        if (yldClctn == null) {
            yldClctn = new ArrayList<>();
        }
        return this.yldClctn;
    }

    /**
     * Gets the value of the intrstTp property.
     * 
     * @return
     *     possible object is
     *     {@link InterestType3Code }
     *     
     */
    public InterestType3Code getIntrstTp() {
        return intrstTp;
    }

    /**
     * Sets the value of the intrstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestType3Code }
     *     
     */
    public void setIntrstTp(InterestType3Code value) {
        this.intrstTp = value;
    }

    /**
     * Gets the value of the instrmStrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentSubStructureType2Choice }
     *     
     */
    public InstrumentSubStructureType2Choice getInstrmStrTp() {
        return instrmStrTp;
    }

    /**
     * Sets the value of the instrmStrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentSubStructureType2Choice }
     *     
     */
    public void setInstrmStrTp(InstrumentSubStructureType2Choice value) {
        this.instrmStrTp = value;
    }

    /**
     * Gets the value of the gblTp property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalNote2Choice }
     *     
     */
    public GlobalNote2Choice getGblTp() {
        return gblTp;
    }

    /**
     * Sets the value of the gblTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalNote2Choice }
     *     
     */
    public void setGblTp(GlobalNote2Choice value) {
        this.gblTp = value;
    }

    /**
     * Gets the value of the potntlEuroSysElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPotntlEuroSysElgblty() {
        return potntlEuroSysElgblty;
    }

    /**
     * Sets the value of the potntlEuroSysElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPotntlEuroSysElgblty(Boolean value) {
        this.potntlEuroSysElgblty = value;
    }

    /**
     * Gets the value of the geogcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcs() {
        return geogcs;
    }

    /**
     * Sets the value of the geogcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeogcs(String value) {
        this.geogcs = value;
    }

    /**
     * Gets the value of the yldRg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public AmountOrPercentageRange1 getYldRg() {
        return yldRg;
    }

    /**
     * Sets the value of the yldRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public void setYldRg(AmountOrPercentageRange1 value) {
        this.yldRg = value;
    }

    /**
     * Gets the value of the cpnRg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public AmountOrPercentageRange1 getCpnRg() {
        return cpnRg;
    }

    /**
     * Sets the value of the cpnRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public void setCpnRg(AmountOrPercentageRange1 value) {
        this.cpnRg = value;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurp(String value) {
        this.purp = value;
    }

    /**
     * Gets the value of the altrntvMinTaxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAltrntvMinTaxInd() {
        return altrntvMinTaxInd;
    }

    /**
     * Sets the value of the altrntvMinTaxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAltrntvMinTaxInd(Boolean value) {
        this.altrntvMinTaxInd = value;
    }

    /**
     * Gets the value of the autoRinvstmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAutoRinvstmt() {
        return autoRinvstmt;
    }

    /**
     * Sets the value of the autoRinvstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAutoRinvstmt(BigDecimal value) {
        this.autoRinvstmt = value;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHrcut(BigDecimal value) {
        this.hrcut = value;
    }

    /**
     * Gets the value of the txConds property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCondition7Choice }
     *     
     */
    public TradeTransactionCondition7Choice getTxConds() {
        return txConds;
    }

    /**
     * Sets the value of the txConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCondition7Choice }
     *     
     */
    public void setTxConds(TradeTransactionCondition7Choice value) {
        this.txConds = value;
    }

    /**
     * Gets the value of the lookBck property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLookBck() {
        return lookBck;
    }

    /**
     * Sets the value of the lookBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLookBck(BigDecimal value) {
        this.lookBck = value;
    }

    /**
     * Gets the value of the maxSbstitn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSbstitn() {
        return maxSbstitn;
    }

    /**
     * Sets the value of the maxSbstitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxSbstitn(BigDecimal value) {
        this.maxSbstitn = value;
    }

    /**
     * Gets the value of the minIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinIncrmt() {
        return minIncrmt;
    }

    /**
     * Sets the value of the minIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinIncrmt(FinancialInstrumentQuantity1Choice value) {
        this.minIncrmt = value;
    }

    /**
     * Gets the value of the minQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinQty() {
        return minQty;
    }

    /**
     * Sets the value of the minQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinQty(FinancialInstrumentQuantity1Choice value) {
        this.minQty = value;
    }

    /**
     * Gets the value of the pdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctn() {
        return pdctn;
    }

    /**
     * Sets the value of the pdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctn(String value) {
        this.pdctn = value;
    }

    /**
     * Gets the value of the rstrctdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctdInd() {
        return rstrctdInd;
    }

    /**
     * Sets the value of the rstrctdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRstrctdInd(Boolean value) {
        this.rstrctdInd = value;
    }

    /**
     * Gets the value of the pricFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency35Choice }
     *     
     */
    public Frequency35Choice getPricFrqcy() {
        return pricFrqcy;
    }

    /**
     * Sets the value of the pricFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency35Choice }
     *     
     */
    public void setPricFrqcy(Frequency35Choice value) {
        this.pricFrqcy = value;
    }

    /**
     * Gets the value of the sctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctr() {
        return sctr;
    }

    /**
     * Sets the value of the sctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctr(String value) {
        this.sctr = value;
    }

    /**
     * Gets the value of the sbstitnFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency35Choice }
     *     
     */
    public Frequency35Choice getSbstitnFrqcy() {
        return sbstitnFrqcy;
    }

    /**
     * Sets the value of the sbstitnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency35Choice }
     *     
     */
    public void setSbstitnFrqcy(Frequency35Choice value) {
        this.sbstitnFrqcy = value;
    }

    /**
     * Gets the value of the sbstitnLft property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbstitnLft() {
        return sbstitnLft;
    }

    /**
     * Sets the value of the sbstitnLft property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSbstitnLft(BigDecimal value) {
        this.sbstitnLft = value;
    }

    /**
     * Gets the value of the whlPoolInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWhlPoolInd() {
        return whlPoolInd;
    }

    /**
     * Sets the value of the whlPoolInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWhlPoolInd(Boolean value) {
        this.whlPoolInd = value;
    }

    /**
     * Gets the value of the pricSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricSrc() {
        return pricSrc;
    }

    /**
     * Sets the value of the pricSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricSrc(String value) {
        this.pricSrc = value;
    }

    /**
     * Gets the value of the pricRg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public AmountOrPercentageRange1 getPricRg() {
        return pricRg;
    }

    /**
     * Sets the value of the pricRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentageRange1 }
     *     
     */
    public void setPricRg(AmountOrPercentageRange1 value) {
        this.pricRg = value;
    }

}
