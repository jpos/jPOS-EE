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

package org.jpos.iso20022.seev_031_001_13;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentAttributes108 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAttributes108">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}SecurityIdentification19"/>
 *         <element name="PlcOfListg" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}MarketIdentification3Choice" minOccurs="0"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}InterestComputationMethodFormat4Choice" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ClassificationType32Choice" minOccurs="0"/>
 *         <element name="OptnStyle" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}OptionStyle8Choice" minOccurs="0"/>
 *         <element name="DnmtnCcy" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="NxtCpnDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ISODate" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ISODate" minOccurs="0"/>
 *         <element name="FltgRateFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ISODate" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ISODate" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ISODate" minOccurs="0"/>
 *         <element name="NxtCllblDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ISODate" minOccurs="0"/>
 *         <element name="PutblDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ISODate" minOccurs="0"/>
 *         <element name="DtdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ISODate" minOccurs="0"/>
 *         <element name="ConvsDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}ISODate" minOccurs="0"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}RateFormat3Choice" minOccurs="0"/>
 *         <element name="NxtIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}RateFormat3Choice" minOccurs="0"/>
 *         <element name="PctgOfDebtClm" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}RateFormat3Choice" minOccurs="0"/>
 *         <element name="PrvsFctr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}RateFormat12Choice" minOccurs="0"/>
 *         <element name="NxtFctr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}RateFormat12Choice" minOccurs="0"/>
 *         <element name="WarrtParity" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}QuantityToQuantityRatio1" minOccurs="0"/>
 *         <element name="MinNmnlQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *         <element name="CtrctSz" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes108", propOrder = {
    "finInstrmId",
    "plcOfListg",
    "dayCntBsis",
    "clssfctnTp",
    "optnStyle",
    "dnmtnCcy",
    "nxtCpnDt",
    "xpryDt",
    "fltgRateFxgDt",
    "mtrtyDt",
    "isseDt",
    "nxtCllblDt",
    "putblDt",
    "dtdDt",
    "convsDt",
    "intrstRate",
    "nxtIntrstRate",
    "pctgOfDebtClm",
    "prvsFctr",
    "nxtFctr",
    "warrtParity",
    "minNmnlQty",
    "ctrctSz"
})
public class FinancialInstrumentAttributes108 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification3Choice plcOfListg;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat4Choice dayCntBsis;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType32Choice clssfctnTp;
    @XmlElement(name = "OptnStyle")
    protected OptionStyle8Choice optnStyle;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "NxtCpnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nxtCpnDt;
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
    @XmlElement(name = "ConvsDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar convsDt;
    @XmlElement(name = "IntrstRate")
    protected RateFormat3Choice intrstRate;
    @XmlElement(name = "NxtIntrstRate")
    protected RateFormat3Choice nxtIntrstRate;
    @XmlElement(name = "PctgOfDebtClm")
    protected RateFormat3Choice pctgOfDebtClm;
    @XmlElement(name = "PrvsFctr")
    protected RateFormat12Choice prvsFctr;
    @XmlElement(name = "NxtFctr")
    protected RateFormat12Choice nxtFctr;
    @XmlElement(name = "WarrtParity")
    protected QuantityToQuantityRatio1 warrtParity;
    @XmlElement(name = "MinNmnlQty")
    protected FinancialInstrumentQuantity33Choice minNmnlQty;
    @XmlElement(name = "CtrctSz")
    protected FinancialInstrumentQuantity33Choice ctrctSz;

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
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public MarketIdentification3Choice getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public void setPlcOfListg(MarketIdentification3Choice value) {
        this.plcOfListg = value;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public InterestComputationMethodFormat4Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public void setDayCntBsis(InterestComputationMethodFormat4Choice value) {
        this.dayCntBsis = value;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public ClassificationType32Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public void setClssfctnTp(ClassificationType32Choice value) {
        this.clssfctnTp = value;
    }

    /**
     * Gets the value of the optnStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle8Choice }
     *     
     */
    public OptionStyle8Choice getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle8Choice }
     *     
     */
    public void setOptnStyle(OptionStyle8Choice value) {
        this.optnStyle = value;
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
     * Gets the value of the convsDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvsDt() {
        return convsDt;
    }

    /**
     * Sets the value of the convsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvsDt(XMLGregorianCalendar value) {
        this.convsDt = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setIntrstRate(RateFormat3Choice value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the nxtIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getNxtIntrstRate() {
        return nxtIntrstRate;
    }

    /**
     * Sets the value of the nxtIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setNxtIntrstRate(RateFormat3Choice value) {
        this.nxtIntrstRate = value;
    }

    /**
     * Gets the value of the pctgOfDebtClm property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getPctgOfDebtClm() {
        return pctgOfDebtClm;
    }

    /**
     * Sets the value of the pctgOfDebtClm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setPctgOfDebtClm(RateFormat3Choice value) {
        this.pctgOfDebtClm = value;
    }

    /**
     * Gets the value of the prvsFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat12Choice }
     *     
     */
    public RateFormat12Choice getPrvsFctr() {
        return prvsFctr;
    }

    /**
     * Sets the value of the prvsFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat12Choice }
     *     
     */
    public void setPrvsFctr(RateFormat12Choice value) {
        this.prvsFctr = value;
    }

    /**
     * Gets the value of the nxtFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat12Choice }
     *     
     */
    public RateFormat12Choice getNxtFctr() {
        return nxtFctr;
    }

    /**
     * Sets the value of the nxtFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat12Choice }
     *     
     */
    public void setNxtFctr(RateFormat12Choice value) {
        this.nxtFctr = value;
    }

    /**
     * Gets the value of the warrtParity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getWarrtParity() {
        return warrtParity;
    }

    /**
     * Sets the value of the warrtParity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public void setWarrtParity(QuantityToQuantityRatio1 value) {
        this.warrtParity = value;
    }

    /**
     * Gets the value of the minNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getMinNmnlQty() {
        return minNmnlQty;
    }

    /**
     * Sets the value of the minNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setMinNmnlQty(FinancialInstrumentQuantity33Choice value) {
        this.minNmnlQty = value;
    }

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setCtrctSz(FinancialInstrumentQuantity33Choice value) {
        this.ctrctSz = value;
    }

}
