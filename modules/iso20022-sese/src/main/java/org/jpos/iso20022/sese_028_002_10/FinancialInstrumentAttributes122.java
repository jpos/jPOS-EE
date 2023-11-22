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

package org.jpos.iso20022.sese_028_002_10;

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
 * <p>Java class for FinancialInstrumentAttributes122 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAttributes122">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlcOfListg" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}MarketIdentification4Choice" minOccurs="0"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}InterestComputationMethodFormat5Choice" minOccurs="0"/>
 *         <element name="RegnForm" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}FormOfSecurity7Choice" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}Frequency27Choice" minOccurs="0"/>
 *         <element name="PmtSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SecuritiesPaymentStatus6Choice" minOccurs="0"/>
 *         <element name="VarblRateChngFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}Frequency27Choice" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ClassificationType33Choice" minOccurs="0"/>
 *         <element name="OptnStyle" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}OptionStyle9Choice" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}OptionType7Choice" minOccurs="0"/>
 *         <element name="DnmtnCcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="CpnDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ISODate" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ISODate" minOccurs="0"/>
 *         <element name="FltgRateFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ISODate" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ISODate" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ISODate" minOccurs="0"/>
 *         <element name="NxtCllblDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ISODate" minOccurs="0"/>
 *         <element name="PutblDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ISODate" minOccurs="0"/>
 *         <element name="DtdDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ISODate" minOccurs="0"/>
 *         <element name="FrstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}ISODate" minOccurs="0"/>
 *         <element name="PrvsFctr" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}BaseOneRate" minOccurs="0"/>
 *         <element name="CurFctr" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}BaseOneRate" minOccurs="0"/>
 *         <element name="NxtFctr" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}BaseOneRate" minOccurs="0"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PercentageRate" minOccurs="0"/>
 *         <element name="YldToMtrtyRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PercentageRate" minOccurs="0"/>
 *         <element name="NxtIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PercentageRate" minOccurs="0"/>
 *         <element name="IndxRateBsis" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PercentageRate" minOccurs="0"/>
 *         <element name="CpnAttchdNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}Number23Choice" minOccurs="0"/>
 *         <element name="PoolNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}GenericIdentification39" minOccurs="0"/>
 *         <element name="VarblRateInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="CllblInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="PutblInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="MktOrIndctvPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}PriceType5Choice" minOccurs="0"/>
 *         <element name="ExrcPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}Price3" minOccurs="0"/>
 *         <element name="SbcptPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}Price3" minOccurs="0"/>
 *         <element name="ConvsPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}Price3" minOccurs="0"/>
 *         <element name="StrkPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}Price3" minOccurs="0"/>
 *         <element name="MinNmnlQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}FinancialInstrumentQuantity36Choice" minOccurs="0"/>
 *         <element name="CtrctSz" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}FinancialInstrumentQuantity36Choice" minOccurs="0"/>
 *         <element name="UndrlygFinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}SecurityIdentification20" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmAttrAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.028.002.10}RestrictedFINXMax350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes122", propOrder = {
    "plcOfListg",
    "dayCntBsis",
    "regnForm",
    "pmtFrqcy",
    "pmtSts",
    "varblRateChngFrqcy",
    "clssfctnTp",
    "optnStyle",
    "optnTp",
    "dnmtnCcy",
    "cpnDt",
    "xpryDt",
    "fltgRateFxgDt",
    "mtrtyDt",
    "isseDt",
    "nxtCllblDt",
    "putblDt",
    "dtdDt",
    "frstPmtDt",
    "prvsFctr",
    "curFctr",
    "nxtFctr",
    "intrstRate",
    "yldToMtrtyRate",
    "nxtIntrstRate",
    "indxRateBsis",
    "cpnAttchdNb",
    "poolNb",
    "varblRateInd",
    "cllblInd",
    "putblInd",
    "mktOrIndctvPric",
    "exrcPric",
    "sbcptPric",
    "convsPric",
    "strkPric",
    "minNmnlQty",
    "ctrctSz",
    "undrlygFinInstrmId",
    "finInstrmAttrAddtlDtls"
})
public class FinancialInstrumentAttributes122 {

    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification4Choice plcOfListg;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat5Choice dayCntBsis;
    @XmlElement(name = "RegnForm")
    protected FormOfSecurity7Choice regnForm;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency27Choice pmtFrqcy;
    @XmlElement(name = "PmtSts")
    protected SecuritiesPaymentStatus6Choice pmtSts;
    @XmlElement(name = "VarblRateChngFrqcy")
    protected Frequency27Choice varblRateChngFrqcy;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType33Choice clssfctnTp;
    @XmlElement(name = "OptnStyle")
    protected OptionStyle9Choice optnStyle;
    @XmlElement(name = "OptnTp")
    protected OptionType7Choice optnTp;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "CpnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cpnDt;
    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "FltgRateFxgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fltgRateFxgDt;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "NxtCllblDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nxtCllblDt;
    @XmlElement(name = "PutblDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar putblDt;
    @XmlElement(name = "DtdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtdDt;
    @XmlElement(name = "FrstPmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frstPmtDt;
    @XmlElement(name = "PrvsFctr")
    protected BigDecimal prvsFctr;
    @XmlElement(name = "CurFctr")
    protected BigDecimal curFctr;
    @XmlElement(name = "NxtFctr")
    protected BigDecimal nxtFctr;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "YldToMtrtyRate")
    protected BigDecimal yldToMtrtyRate;
    @XmlElement(name = "NxtIntrstRate")
    protected BigDecimal nxtIntrstRate;
    @XmlElement(name = "IndxRateBsis")
    protected BigDecimal indxRateBsis;
    @XmlElement(name = "CpnAttchdNb")
    protected Number23Choice cpnAttchdNb;
    @XmlElement(name = "PoolNb")
    protected GenericIdentification39 poolNb;
    @XmlElement(name = "VarblRateInd")
    protected Boolean varblRateInd;
    @XmlElement(name = "CllblInd")
    protected Boolean cllblInd;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
    @XmlElement(name = "MktOrIndctvPric")
    protected PriceType5Choice mktOrIndctvPric;
    @XmlElement(name = "ExrcPric")
    protected Price3 exrcPric;
    @XmlElement(name = "SbcptPric")
    protected Price3 sbcptPric;
    @XmlElement(name = "ConvsPric")
    protected Price3 convsPric;
    @XmlElement(name = "StrkPric")
    protected Price3 strkPric;
    @XmlElement(name = "MinNmnlQty")
    protected FinancialInstrumentQuantity36Choice minNmnlQty;
    @XmlElement(name = "CtrctSz")
    protected FinancialInstrumentQuantity36Choice ctrctSz;
    @XmlElement(name = "UndrlygFinInstrmId")
    protected List<SecurityIdentification20> undrlygFinInstrmId;
    @XmlElement(name = "FinInstrmAttrAddtlDtls")
    protected String finInstrmAttrAddtlDtls;

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification4Choice }
     *     
     */
    public MarketIdentification4Choice getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification4Choice }
     *     
     */
    public void setPlcOfListg(MarketIdentification4Choice value) {
        this.plcOfListg = value;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat5Choice }
     *     
     */
    public InterestComputationMethodFormat5Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat5Choice }
     *     
     */
    public void setDayCntBsis(InterestComputationMethodFormat5Choice value) {
        this.dayCntBsis = value;
    }

    /**
     * Gets the value of the regnForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity7Choice }
     *     
     */
    public FormOfSecurity7Choice getRegnForm() {
        return regnForm;
    }

    /**
     * Sets the value of the regnForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity7Choice }
     *     
     */
    public void setRegnForm(FormOfSecurity7Choice value) {
        this.regnForm = value;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency27Choice }
     *     
     */
    public Frequency27Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency27Choice }
     *     
     */
    public void setPmtFrqcy(Frequency27Choice value) {
        this.pmtFrqcy = value;
    }

    /**
     * Gets the value of the pmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesPaymentStatus6Choice }
     *     
     */
    public SecuritiesPaymentStatus6Choice getPmtSts() {
        return pmtSts;
    }

    /**
     * Sets the value of the pmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesPaymentStatus6Choice }
     *     
     */
    public void setPmtSts(SecuritiesPaymentStatus6Choice value) {
        this.pmtSts = value;
    }

    /**
     * Gets the value of the varblRateChngFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency27Choice }
     *     
     */
    public Frequency27Choice getVarblRateChngFrqcy() {
        return varblRateChngFrqcy;
    }

    /**
     * Sets the value of the varblRateChngFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency27Choice }
     *     
     */
    public void setVarblRateChngFrqcy(Frequency27Choice value) {
        this.varblRateChngFrqcy = value;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType33Choice }
     *     
     */
    public ClassificationType33Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType33Choice }
     *     
     */
    public void setClssfctnTp(ClassificationType33Choice value) {
        this.clssfctnTp = value;
    }

    /**
     * Gets the value of the optnStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle9Choice }
     *     
     */
    public OptionStyle9Choice getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle9Choice }
     *     
     */
    public void setOptnStyle(OptionStyle9Choice value) {
        this.optnStyle = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType7Choice }
     *     
     */
    public OptionType7Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType7Choice }
     *     
     */
    public void setOptnTp(OptionType7Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the dnmtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnCcy() {
        return dnmtnCcy;
    }

    /**
     * Sets the value of the dnmtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
    }

    /**
     * Gets the value of the cpnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCpnDt() {
        return cpnDt;
    }

    /**
     * Sets the value of the cpnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCpnDt(XMLGregorianCalendar value) {
        this.cpnDt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the fltgRateFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFltgRateFxgDt() {
        return fltgRateFxgDt;
    }

    /**
     * Sets the value of the fltgRateFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFltgRateFxgDt(XMLGregorianCalendar value) {
        this.fltgRateFxgDt = value;
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
     * Gets the value of the yldToMtrtyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYldToMtrtyRate() {
        return yldToMtrtyRate;
    }

    /**
     * Sets the value of the yldToMtrtyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYldToMtrtyRate(BigDecimal value) {
        this.yldToMtrtyRate = value;
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
     * Gets the value of the indxRateBsis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndxRateBsis() {
        return indxRateBsis;
    }

    /**
     * Sets the value of the indxRateBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndxRateBsis(BigDecimal value) {
        this.indxRateBsis = value;
    }

    /**
     * Gets the value of the cpnAttchdNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number23Choice }
     *     
     */
    public Number23Choice getCpnAttchdNb() {
        return cpnAttchdNb;
    }

    /**
     * Sets the value of the cpnAttchdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number23Choice }
     *     
     */
    public void setCpnAttchdNb(Number23Choice value) {
        this.cpnAttchdNb = value;
    }

    /**
     * Gets the value of the poolNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification39 }
     *     
     */
    public GenericIdentification39 getPoolNb() {
        return poolNb;
    }

    /**
     * Sets the value of the poolNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification39 }
     *     
     */
    public void setPoolNb(GenericIdentification39 value) {
        this.poolNb = value;
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
     * Gets the value of the mktOrIndctvPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType5Choice }
     *     
     */
    public PriceType5Choice getMktOrIndctvPric() {
        return mktOrIndctvPric;
    }

    /**
     * Sets the value of the mktOrIndctvPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType5Choice }
     *     
     */
    public void setMktOrIndctvPric(PriceType5Choice value) {
        this.mktOrIndctvPric = value;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public void setExrcPric(Price3 value) {
        this.exrcPric = value;
    }

    /**
     * Gets the value of the sbcptPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getSbcptPric() {
        return sbcptPric;
    }

    /**
     * Sets the value of the sbcptPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public void setSbcptPric(Price3 value) {
        this.sbcptPric = value;
    }

    /**
     * Gets the value of the convsPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getConvsPric() {
        return convsPric;
    }

    /**
     * Sets the value of the convsPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public void setConvsPric(Price3 value) {
        this.convsPric = value;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public void setStrkPric(Price3 value) {
        this.strkPric = value;
    }

    /**
     * Gets the value of the minNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getMinNmnlQty() {
        return minNmnlQty;
    }

    /**
     * Sets the value of the minNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setMinNmnlQty(FinancialInstrumentQuantity36Choice value) {
        this.minNmnlQty = value;
    }

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setCtrctSz(FinancialInstrumentQuantity36Choice value) {
        this.ctrctSz = value;
    }

    /**
     * Gets the value of the undrlygFinInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygFinInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification20 }
     * 
     * 
     * @return
     *     The value of the undrlygFinInstrmId property.
     */
    public List<SecurityIdentification20> getUndrlygFinInstrmId() {
        if (undrlygFinInstrmId == null) {
            undrlygFinInstrmId = new ArrayList<>();
        }
        return this.undrlygFinInstrmId;
    }

    /**
     * Gets the value of the finInstrmAttrAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrmAttrAddtlDtls() {
        return finInstrmAttrAddtlDtls;
    }

    /**
     * Sets the value of the finInstrmAttrAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrmAttrAddtlDtls(String value) {
        this.finInstrmAttrAddtlDtls = value;
    }

}
