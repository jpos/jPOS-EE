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

package org.jpos.iso20022.setr_027_001_04;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentStipulations4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentStipulations4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Geogcs" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="YldRg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountOrPercentageRange1" minOccurs="0"/>
 *         <element name="Ratg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rating1" minOccurs="0"/>
 *         <element name="CpnRg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountOrPercentageRange1" minOccurs="0"/>
 *         <element name="AmtsblInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max256Text" minOccurs="0"/>
 *         <element name="AltrntvMinTaxInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="AutoRinvstmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="TxConds" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}TradeTransactionCondition2Code" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="CstmDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}DateTimePeriod2" minOccurs="0"/>
 *         <element name="Hrcut" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="InsrdInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="LookBck" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISOYearMonth" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISOYearMonth" minOccurs="0"/>
 *         <element name="IssrId" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}BICNonFIDec2014Identifier" minOccurs="0"/>
 *         <element name="IsseSz" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number" minOccurs="0"/>
 *         <element name="MinDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="MaxSbstitn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number" minOccurs="0"/>
 *         <element name="MinIncrmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Frequency1Code" minOccurs="0"/>
 *         <element name="MinQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="Pdctn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="RstrctdInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="PricFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Frequency1Code" minOccurs="0"/>
 *         <element name="Sctr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="SbstitnFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Frequency1Code" minOccurs="0"/>
 *         <element name="SbstitnLft" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number" minOccurs="0"/>
 *         <element name="WhlPoolInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="PricSrc" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="XprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="OverAlltmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OverAlltmtRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="PricRg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountOrPercentageRange1" minOccurs="0"/>
 *         <element name="CllblInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="ConvtblInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="PutblInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="PreFnddInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="EscrwdInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="PerptlInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentStipulations4", propOrder = {
    "geogcs",
    "yldRg",
    "ratg",
    "cpnRg",
    "amtsblInd",
    "purp",
    "altrntvMinTaxInd",
    "autoRinvstmt",
    "txConds",
    "ccy",
    "cstmDt",
    "hrcut",
    "insrdInd",
    "lookBck",
    "mtrtyDt",
    "isseDt",
    "issrId",
    "isseSz",
    "minDnmtn",
    "maxSbstitn",
    "minIncrmt",
    "pmtFrqcy",
    "minQty",
    "pdctn",
    "rstrctdInd",
    "pricFrqcy",
    "sctr",
    "sbstitnFrqcy",
    "sbstitnLft",
    "whlPoolInd",
    "pricSrc",
    "xprtnDt",
    "overAlltmtAmt",
    "overAlltmtRate",
    "pricRg",
    "cllblInd",
    "convtblInd",
    "putblInd",
    "preFnddInd",
    "escrwdInd",
    "perptlInd"
})
public class FinancialInstrumentStipulations4 {

    @XmlElement(name = "Geogcs")
    protected String geogcs;
    @XmlElement(name = "YldRg")
    protected AmountOrPercentageRange1 yldRg;
    @XmlElement(name = "Ratg")
    protected Rating1 ratg;
    @XmlElement(name = "CpnRg")
    protected AmountOrPercentageRange1 cpnRg;
    @XmlElement(name = "AmtsblInd")
    protected Boolean amtsblInd;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "AltrntvMinTaxInd")
    protected Boolean altrntvMinTaxInd;
    @XmlElement(name = "AutoRinvstmt")
    protected BigDecimal autoRinvstmt;
    @XmlElement(name = "TxConds")
    @XmlSchemaType(name = "string")
    protected TradeTransactionCondition2Code txConds;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CstmDt")
    protected DateTimePeriod2 cstmDt;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "InsrdInd")
    protected Boolean insrdInd;
    @XmlElement(name = "LookBck")
    protected BigDecimal lookBck;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "IssrId")
    protected String issrId;
    @XmlElement(name = "IsseSz")
    protected BigDecimal isseSz;
    @XmlElement(name = "MinDnmtn")
    protected FinancialInstrumentQuantity1Choice minDnmtn;
    @XmlElement(name = "MaxSbstitn")
    protected BigDecimal maxSbstitn;
    @XmlElement(name = "MinIncrmt")
    protected FinancialInstrumentQuantity1Choice minIncrmt;
    @XmlElement(name = "PmtFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code pmtFrqcy;
    @XmlElement(name = "MinQty")
    protected FinancialInstrumentQuantity1Choice minQty;
    @XmlElement(name = "Pdctn")
    protected String pdctn;
    @XmlElement(name = "RstrctdInd")
    protected Boolean rstrctdInd;
    @XmlElement(name = "PricFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code pricFrqcy;
    @XmlElement(name = "Sctr")
    protected String sctr;
    @XmlElement(name = "SbstitnFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency1Code sbstitnFrqcy;
    @XmlElement(name = "SbstitnLft")
    protected BigDecimal sbstitnLft;
    @XmlElement(name = "WhlPoolInd")
    protected Boolean whlPoolInd;
    @XmlElement(name = "PricSrc")
    protected String pricSrc;
    @XmlElement(name = "XprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "OverAlltmtAmt")
    protected ActiveCurrencyAndAmount overAlltmtAmt;
    @XmlElement(name = "OverAlltmtRate")
    protected BigDecimal overAlltmtRate;
    @XmlElement(name = "PricRg")
    protected AmountOrPercentageRange1 pricRg;
    @XmlElement(name = "CllblInd")
    protected Boolean cllblInd;
    @XmlElement(name = "ConvtblInd")
    protected Boolean convtblInd;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
    @XmlElement(name = "PreFnddInd")
    protected Boolean preFnddInd;
    @XmlElement(name = "EscrwdInd")
    protected Boolean escrwdInd;
    @XmlElement(name = "PerptlInd")
    protected Boolean perptlInd;

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
     * Gets the value of the ratg property.
     * 
     * @return
     *     possible object is
     *     {@link Rating1 }
     *     
     */
    public Rating1 getRatg() {
        return ratg;
    }

    /**
     * Sets the value of the ratg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating1 }
     *     
     */
    public void setRatg(Rating1 value) {
        this.ratg = value;
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
     * Gets the value of the txConds property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCondition2Code }
     *     
     */
    public TradeTransactionCondition2Code getTxConds() {
        return txConds;
    }

    /**
     * Sets the value of the txConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCondition2Code }
     *     
     */
    public void setTxConds(TradeTransactionCondition2Code value) {
        this.txConds = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the cstmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public DateTimePeriod2 getCstmDt() {
        return cstmDt;
    }

    /**
     * Sets the value of the cstmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod2 }
     *     
     */
    public void setCstmDt(DateTimePeriod2 value) {
        this.cstmDt = value;
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
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the issrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrId() {
        return issrId;
    }

    /**
     * Sets the value of the issrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrId(String value) {
        this.issrId = value;
    }

    /**
     * Gets the value of the isseSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIsseSz() {
        return isseSz;
    }

    /**
     * Sets the value of the isseSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIsseSz(BigDecimal value) {
        this.isseSz = value;
    }

    /**
     * Gets the value of the minDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinDnmtn() {
        return minDnmtn;
    }

    /**
     * Sets the value of the minDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinDnmtn(FinancialInstrumentQuantity1Choice value) {
        this.minDnmtn = value;
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
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public void setPmtFrqcy(Frequency1Code value) {
        this.pmtFrqcy = value;
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
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getPricFrqcy() {
        return pricFrqcy;
    }

    /**
     * Sets the value of the pricFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public void setPricFrqcy(Frequency1Code value) {
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
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getSbstitnFrqcy() {
        return sbstitnFrqcy;
    }

    /**
     * Sets the value of the sbstitnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public void setSbstitnFrqcy(Frequency1Code value) {
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
     * Gets the value of the convtblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvtblInd() {
        return convtblInd;
    }

    /**
     * Sets the value of the convtblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvtblInd(Boolean value) {
        this.convtblInd = value;
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

}
