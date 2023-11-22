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
 * <p>Java class for FinancialInstrumentAttributes124 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAttributes124">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlcOfListg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}MarketIdentification3Choice" minOccurs="0"/>
 *         <element name="Ratg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rating1" minOccurs="0"/>
 *         <element name="CertNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}InterestComputationMethodFormat4Choice" minOccurs="0"/>
 *         <element name="RegnForm" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FormOfSecurity6Choice" minOccurs="0"/>
 *         <element name="PmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Frequency23Choice" minOccurs="0"/>
 *         <element name="VarblRateChngFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Frequency23Choice" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ClassificationType32Choice" minOccurs="0"/>
 *         <element name="OptnStyle" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}OptionStyle10Choice" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}OptionType6Choice" minOccurs="0"/>
 *         <element name="DnmtnCcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="CpnDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="FltgRateFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="NxtCllblDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="ConvsDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="PutblDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="DtdDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="FrstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="NxtFctrDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="PrvsFctr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}BaseOneRate" minOccurs="0"/>
 *         <element name="CurFctr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}BaseOneRate" minOccurs="0"/>
 *         <element name="NxtFctr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}BaseOneRate" minOccurs="0"/>
 *         <element name="EndFctr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}BaseOneRate" minOccurs="0"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="NxtIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="IndxRateBsis" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="PctgOfDebtClms" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="CpnAttchdNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number1Choice" minOccurs="0"/>
 *         <element name="PoolNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}GenericIdentification37" minOccurs="0"/>
 *         <element name="VrsnNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number1Choice" minOccurs="0"/>
 *         <element name="ConvtblInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="VarblRateInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="CvrdInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="CllblInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="PutblInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="WarrtAttchdOnDlvry" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="OddCpnInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="RedYldImpct" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="YldVar" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="ExrcPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="SbcptPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="ConvsPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="TaxblIncmPerShr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="MinNmnlQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="MinExrcblQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="MinExrcblMltplQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="FaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CtrctSz" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FinancialInstrumentQuantity18Choice" minOccurs="0"/>
 *         <element name="FinInstrmAttrAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes124", propOrder = {
    "plcOfListg",
    "ratg",
    "certNb",
    "dayCntBsis",
    "regnForm",
    "pmtFrqcy",
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
    "convsDt",
    "putblDt",
    "dtdDt",
    "frstPmtDt",
    "nxtFctrDt",
    "prvsFctr",
    "curFctr",
    "nxtFctr",
    "endFctr",
    "intrstRate",
    "nxtIntrstRate",
    "indxRateBsis",
    "pctgOfDebtClms",
    "cpnAttchdNb",
    "poolNb",
    "vrsnNb",
    "convtblInd",
    "varblRateInd",
    "cvrdInd",
    "cllblInd",
    "putblInd",
    "warrtAttchdOnDlvry",
    "oddCpnInd",
    "redYldImpct",
    "yldVar",
    "exrcPric",
    "sbcptPric",
    "convsPric",
    "taxblIncmPerShr",
    "minNmnlQty",
    "minExrcblQty",
    "minExrcblMltplQty",
    "faceAmt",
    "ctrctSz",
    "finInstrmAttrAddtlDtls"
})
public class FinancialInstrumentAttributes124 {

    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification3Choice plcOfListg;
    @XmlElement(name = "Ratg")
    protected Rating1 ratg;
    @XmlElement(name = "CertNb")
    protected String certNb;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat4Choice dayCntBsis;
    @XmlElement(name = "RegnForm")
    protected FormOfSecurity6Choice regnForm;
    @XmlElement(name = "PmtFrqcy")
    protected Frequency23Choice pmtFrqcy;
    @XmlElement(name = "VarblRateChngFrqcy")
    protected Frequency23Choice varblRateChngFrqcy;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType32Choice clssfctnTp;
    @XmlElement(name = "OptnStyle")
    protected OptionStyle10Choice optnStyle;
    @XmlElement(name = "OptnTp")
    protected OptionType6Choice optnTp;
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
    @XmlElement(name = "ConvsDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar convsDt;
    @XmlElement(name = "PutblDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar putblDt;
    @XmlElement(name = "DtdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtdDt;
    @XmlElement(name = "FrstPmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frstPmtDt;
    @XmlElement(name = "NxtFctrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nxtFctrDt;
    @XmlElement(name = "PrvsFctr")
    protected BigDecimal prvsFctr;
    @XmlElement(name = "CurFctr")
    protected BigDecimal curFctr;
    @XmlElement(name = "NxtFctr")
    protected BigDecimal nxtFctr;
    @XmlElement(name = "EndFctr")
    protected BigDecimal endFctr;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "NxtIntrstRate")
    protected BigDecimal nxtIntrstRate;
    @XmlElement(name = "IndxRateBsis")
    protected BigDecimal indxRateBsis;
    @XmlElement(name = "PctgOfDebtClms")
    protected BigDecimal pctgOfDebtClms;
    @XmlElement(name = "CpnAttchdNb")
    protected Number1Choice cpnAttchdNb;
    @XmlElement(name = "PoolNb")
    protected GenericIdentification37 poolNb;
    @XmlElement(name = "VrsnNb")
    protected Number1Choice vrsnNb;
    @XmlElement(name = "ConvtblInd")
    protected Boolean convtblInd;
    @XmlElement(name = "VarblRateInd")
    protected Boolean varblRateInd;
    @XmlElement(name = "CvrdInd")
    protected Boolean cvrdInd;
    @XmlElement(name = "CllblInd")
    protected Boolean cllblInd;
    @XmlElement(name = "PutblInd")
    protected Boolean putblInd;
    @XmlElement(name = "WarrtAttchdOnDlvry")
    protected Boolean warrtAttchdOnDlvry;
    @XmlElement(name = "OddCpnInd")
    protected Boolean oddCpnInd;
    @XmlElement(name = "RedYldImpct")
    protected Boolean redYldImpct;
    @XmlElement(name = "YldVar")
    protected Boolean yldVar;
    @XmlElement(name = "ExrcPric")
    protected Price14 exrcPric;
    @XmlElement(name = "SbcptPric")
    protected Price14 sbcptPric;
    @XmlElement(name = "ConvsPric")
    protected Price14 convsPric;
    @XmlElement(name = "TaxblIncmPerShr")
    protected Price14 taxblIncmPerShr;
    @XmlElement(name = "MinNmnlQty")
    protected FinancialInstrumentQuantity1Choice minNmnlQty;
    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantity1Choice minExrcblQty;
    @XmlElement(name = "MinExrcblMltplQty")
    protected FinancialInstrumentQuantity1Choice minExrcblMltplQty;
    @XmlElement(name = "FaceAmt")
    protected BigDecimal faceAmt;
    @XmlElement(name = "CtrctSz")
    protected FinancialInstrumentQuantity18Choice ctrctSz;
    @XmlElement(name = "FinInstrmAttrAddtlDtls")
    protected String finInstrmAttrAddtlDtls;

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
     * Gets the value of the certNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertNb() {
        return certNb;
    }

    /**
     * Sets the value of the certNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertNb(String value) {
        this.certNb = value;
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
     * Gets the value of the regnForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity6Choice }
     *     
     */
    public FormOfSecurity6Choice getRegnForm() {
        return regnForm;
    }

    /**
     * Sets the value of the regnForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity6Choice }
     *     
     */
    public void setRegnForm(FormOfSecurity6Choice value) {
        this.regnForm = value;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency23Choice }
     *     
     */
    public Frequency23Choice getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency23Choice }
     *     
     */
    public void setPmtFrqcy(Frequency23Choice value) {
        this.pmtFrqcy = value;
    }

    /**
     * Gets the value of the varblRateChngFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency23Choice }
     *     
     */
    public Frequency23Choice getVarblRateChngFrqcy() {
        return varblRateChngFrqcy;
    }

    /**
     * Sets the value of the varblRateChngFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency23Choice }
     *     
     */
    public void setVarblRateChngFrqcy(Frequency23Choice value) {
        this.varblRateChngFrqcy = value;
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
     *     {@link OptionStyle10Choice }
     *     
     */
    public OptionStyle10Choice getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle10Choice }
     *     
     */
    public void setOptnStyle(OptionStyle10Choice value) {
        this.optnStyle = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType6Choice }
     *     
     */
    public OptionType6Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType6Choice }
     *     
     */
    public void setOptnTp(OptionType6Choice value) {
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
     * Gets the value of the endFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndFctr() {
        return endFctr;
    }

    /**
     * Sets the value of the endFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndFctr(BigDecimal value) {
        this.endFctr = value;
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
     * Gets the value of the pctgOfDebtClms property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfDebtClms() {
        return pctgOfDebtClms;
    }

    /**
     * Sets the value of the pctgOfDebtClms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfDebtClms(BigDecimal value) {
        this.pctgOfDebtClms = value;
    }

    /**
     * Gets the value of the cpnAttchdNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number1Choice }
     *     
     */
    public Number1Choice getCpnAttchdNb() {
        return cpnAttchdNb;
    }

    /**
     * Sets the value of the cpnAttchdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number1Choice }
     *     
     */
    public void setCpnAttchdNb(Number1Choice value) {
        this.cpnAttchdNb = value;
    }

    /**
     * Gets the value of the poolNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getPoolNb() {
        return poolNb;
    }

    /**
     * Sets the value of the poolNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setPoolNb(GenericIdentification37 value) {
        this.poolNb = value;
    }

    /**
     * Gets the value of the vrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link Number1Choice }
     *     
     */
    public Number1Choice getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Sets the value of the vrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number1Choice }
     *     
     */
    public void setVrsnNb(Number1Choice value) {
        this.vrsnNb = value;
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
     * Gets the value of the cvrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCvrdInd() {
        return cvrdInd;
    }

    /**
     * Sets the value of the cvrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCvrdInd(Boolean value) {
        this.cvrdInd = value;
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
     * Gets the value of the warrtAttchdOnDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarrtAttchdOnDlvry() {
        return warrtAttchdOnDlvry;
    }

    /**
     * Sets the value of the warrtAttchdOnDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarrtAttchdOnDlvry(Boolean value) {
        this.warrtAttchdOnDlvry = value;
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
     * Gets the value of the redYldImpct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedYldImpct() {
        return redYldImpct;
    }

    /**
     * Sets the value of the redYldImpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedYldImpct(Boolean value) {
        this.redYldImpct = value;
    }

    /**
     * Gets the value of the yldVar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYldVar() {
        return yldVar;
    }

    /**
     * Sets the value of the yldVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYldVar(Boolean value) {
        this.yldVar = value;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setExrcPric(Price14 value) {
        this.exrcPric = value;
    }

    /**
     * Gets the value of the sbcptPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getSbcptPric() {
        return sbcptPric;
    }

    /**
     * Sets the value of the sbcptPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setSbcptPric(Price14 value) {
        this.sbcptPric = value;
    }

    /**
     * Gets the value of the convsPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getConvsPric() {
        return convsPric;
    }

    /**
     * Sets the value of the convsPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setConvsPric(Price14 value) {
        this.convsPric = value;
    }

    /**
     * Gets the value of the taxblIncmPerShr property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getTaxblIncmPerShr() {
        return taxblIncmPerShr;
    }

    /**
     * Sets the value of the taxblIncmPerShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setTaxblIncmPerShr(Price14 value) {
        this.taxblIncmPerShr = value;
    }

    /**
     * Gets the value of the minNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinNmnlQty() {
        return minNmnlQty;
    }

    /**
     * Sets the value of the minNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinNmnlQty(FinancialInstrumentQuantity1Choice value) {
        this.minNmnlQty = value;
    }

    /**
     * Gets the value of the minExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinExrcblQty() {
        return minExrcblQty;
    }

    /**
     * Sets the value of the minExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinExrcblQty(FinancialInstrumentQuantity1Choice value) {
        this.minExrcblQty = value;
    }

    /**
     * Gets the value of the minExrcblMltplQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinExrcblMltplQty() {
        return minExrcblMltplQty;
    }

    /**
     * Sets the value of the minExrcblMltplQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinExrcblMltplQty(FinancialInstrumentQuantity1Choice value) {
        this.minExrcblMltplQty = value;
    }

    /**
     * Gets the value of the faceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaceAmt() {
        return faceAmt;
    }

    /**
     * Sets the value of the faceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFaceAmt(BigDecimal value) {
        this.faceAmt = value;
    }

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public FinancialInstrumentQuantity18Choice getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity18Choice }
     *     
     */
    public void setCtrctSz(FinancialInstrumentQuantity18Choice value) {
        this.ctrctSz = value;
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
