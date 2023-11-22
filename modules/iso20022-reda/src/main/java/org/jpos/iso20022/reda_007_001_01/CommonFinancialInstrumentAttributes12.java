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

package org.jpos.iso20022.reda_007_001_01;

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
 * <p>Java class for CommonFinancialInstrumentAttributes12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CommonFinancialInstrumentAttributes12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctySts" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecurityStatus3Choice" minOccurs="0"/>
 *         <element name="ISOSctyLngNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max350Text" minOccurs="0"/>
 *         <element name="ISOSctyShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max35Text" minOccurs="0"/>
 *         <element name="NmVldFr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="DnmtnCcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="CertNb" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CtrctVrsnNb" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Number" minOccurs="0"/>
 *         <element name="CpnAttchdNb" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max3NumericText" minOccurs="0"/>
 *         <element name="TaxLotNb" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max15NumericText" minOccurs="0"/>
 *         <element name="PoolNb" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max15NumericText" minOccurs="0"/>
 *         <element name="CvrdInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="LglRstrctns" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}LegalRestrictions4Choice" minOccurs="0"/>
 *         <element name="PosLmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="NearTermPosLmt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="ListgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ISODate" minOccurs="0"/>
 *         <element name="RcrdDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ISODate" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max256Text" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ClassificationType2" minOccurs="0"/>
 *         <element name="Issnc" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Issuance5" minOccurs="0"/>
 *         <element name="TradgMkt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}TradingParameters2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SprdAndBchmkCrv" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}BenchmarkCurve6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PutTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}PutType3Choice" minOccurs="0"/>
 *         <element name="CallTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}CallType3Choice" minOccurs="0"/>
 *         <element name="FngbInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="Cnfdtl" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PrvtPlcmnt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="ConvtblInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="ConvsPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}DateTimePeriod1" minOccurs="0"/>
 *         <element name="ConvsRatioNmrtr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="ConvsRatioDnmtr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="PmryPlcOfDpst" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}PartyIdentification136" minOccurs="0"/>
 *         <element name="TradgMtd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}UnitOrFaceAmount1Choice" minOccurs="0"/>
 *         <element name="TEFRARule" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}TEFRARules3Choice" minOccurs="0"/>
 *         <element name="SrNb" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max16Text" minOccurs="0"/>
 *         <element name="Clss" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max16Text" minOccurs="0"/>
 *         <element name="WhldgTaxRgm" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecurityWithHoldingTax1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PmtSts" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecuritiesPaymentStatus5Choice" minOccurs="0"/>
 *         <element name="InitlPhysForm" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}InitialPhysicalForm4Choice" minOccurs="0"/>
 *         <element name="AftrXchgPhysForm" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}InitialPhysicalForm3Choice" minOccurs="0"/>
 *         <element name="CmonSfkpr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}PartyIdentification177Choice" minOccurs="0"/>
 *         <element name="RedTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}MaturityRedemptionType3Choice" minOccurs="0"/>
 *         <element name="RedPmtCcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="Rstrctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecurityRestriction3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SecurityIdentification39" minOccurs="0"/>
 *         <element name="SttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SettlementInformation17" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinInstrmForm" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}FinancialInstrumentForm2" minOccurs="0"/>
 *         <element name="CtctNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Organisation38" minOccurs="0"/>
 *         <element name="LeadMgr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Organisation38" minOccurs="0"/>
 *         <element name="PrncplPngAgt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Organisation38" minOccurs="0"/>
 *         <element name="PngAgt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Organisation38" minOccurs="0"/>
 *         <element name="Dpstry" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Organisation38" minOccurs="0"/>
 *         <element name="UndrlygRsk" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Organisation38" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonFinancialInstrumentAttributes12", propOrder = {
    "sctySts",
    "isoSctyLngNm",
    "isoSctyShrtNm",
    "nmVldFr",
    "dnmtnCcy",
    "certNb",
    "ctrctVrsnNb",
    "cpnAttchdNb",
    "taxLotNb",
    "poolNb",
    "cvrdInd",
    "lglRstrctns",
    "posLmt",
    "nearTermPosLmt",
    "listgDt",
    "rcrdDt",
    "xpryDt",
    "purp",
    "clssfctnTp",
    "issnc",
    "tradgMkt",
    "sprdAndBchmkCrv",
    "putTp",
    "callTp",
    "fngbInd",
    "cnfdtl",
    "prvtPlcmnt",
    "convtblInd",
    "convsPrd",
    "convsRatioNmrtr",
    "convsRatioDnmtr",
    "pmryPlcOfDpst",
    "tradgMtd",
    "tefraRule",
    "srNb",
    "clss",
    "whldgTaxRgm",
    "pmtSts",
    "initlPhysForm",
    "aftrXchgPhysForm",
    "cmonSfkpr",
    "redTp",
    "redPmtCcy",
    "rstrctn",
    "finInstrmId",
    "sttlmInf",
    "finInstrmForm",
    "ctctNm",
    "leadMgr",
    "prncplPngAgt",
    "pngAgt",
    "dpstry",
    "undrlygRsk"
})
public class CommonFinancialInstrumentAttributes12 {

    @XmlElement(name = "SctySts")
    protected SecurityStatus3Choice sctySts;
    @XmlElement(name = "ISOSctyLngNm")
    protected String isoSctyLngNm;
    @XmlElement(name = "ISOSctyShrtNm")
    protected String isoSctyShrtNm;
    @XmlElement(name = "NmVldFr")
    protected DateAndDateTime2Choice nmVldFr;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "CertNb")
    protected String certNb;
    @XmlElement(name = "CtrctVrsnNb")
    protected BigDecimal ctrctVrsnNb;
    @XmlElement(name = "CpnAttchdNb")
    protected String cpnAttchdNb;
    @XmlElement(name = "TaxLotNb")
    protected String taxLotNb;
    @XmlElement(name = "PoolNb")
    protected String poolNb;
    @XmlElement(name = "CvrdInd")
    protected Boolean cvrdInd;
    @XmlElement(name = "LglRstrctns")
    protected LegalRestrictions4Choice lglRstrctns;
    @XmlElement(name = "PosLmt")
    protected FinancialInstrumentQuantity1Choice posLmt;
    @XmlElement(name = "NearTermPosLmt")
    protected FinancialInstrumentQuantity1Choice nearTermPosLmt;
    @XmlElement(name = "ListgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar listgDt;
    @XmlElement(name = "RcrdDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rcrdDt;
    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType2 clssfctnTp;
    @XmlElement(name = "Issnc")
    protected Issuance5 issnc;
    @XmlElement(name = "TradgMkt")
    protected List<TradingParameters2> tradgMkt;
    @XmlElement(name = "SprdAndBchmkCrv")
    protected List<BenchmarkCurve6> sprdAndBchmkCrv;
    @XmlElement(name = "PutTp")
    protected PutType3Choice putTp;
    @XmlElement(name = "CallTp")
    protected CallType3Choice callTp;
    @XmlElement(name = "FngbInd")
    protected Boolean fngbInd;
    @XmlElement(name = "Cnfdtl")
    protected Boolean cnfdtl;
    @XmlElement(name = "PrvtPlcmnt")
    protected Boolean prvtPlcmnt;
    @XmlElement(name = "ConvtblInd")
    protected Boolean convtblInd;
    @XmlElement(name = "ConvsPrd")
    protected DateTimePeriod1 convsPrd;
    @XmlElement(name = "ConvsRatioNmrtr")
    protected FinancialInstrumentQuantity1Choice convsRatioNmrtr;
    @XmlElement(name = "ConvsRatioDnmtr")
    protected FinancialInstrumentQuantity1Choice convsRatioDnmtr;
    @XmlElement(name = "PmryPlcOfDpst")
    protected PartyIdentification136 pmryPlcOfDpst;
    @XmlElement(name = "TradgMtd")
    protected UnitOrFaceAmount1Choice tradgMtd;
    @XmlElement(name = "TEFRARule")
    protected TEFRARules3Choice tefraRule;
    @XmlElement(name = "SrNb")
    protected String srNb;
    @XmlElement(name = "Clss")
    protected String clss;
    @XmlElement(name = "WhldgTaxRgm")
    protected List<SecurityWithHoldingTax1> whldgTaxRgm;
    @XmlElement(name = "PmtSts")
    protected SecuritiesPaymentStatus5Choice pmtSts;
    @XmlElement(name = "InitlPhysForm")
    protected InitialPhysicalForm4Choice initlPhysForm;
    @XmlElement(name = "AftrXchgPhysForm")
    protected InitialPhysicalForm3Choice aftrXchgPhysForm;
    @XmlElement(name = "CmonSfkpr")
    protected PartyIdentification177Choice cmonSfkpr;
    @XmlElement(name = "RedTp")
    protected MaturityRedemptionType3Choice redTp;
    @XmlElement(name = "RedPmtCcy")
    protected String redPmtCcy;
    @XmlElement(name = "Rstrctn")
    protected List<SecurityRestriction3> rstrctn;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification39 finInstrmId;
    @XmlElement(name = "SttlmInf")
    protected List<SettlementInformation17> sttlmInf;
    @XmlElement(name = "FinInstrmForm")
    protected FinancialInstrumentForm2 finInstrmForm;
    @XmlElement(name = "CtctNm")
    protected Organisation38 ctctNm;
    @XmlElement(name = "LeadMgr")
    protected Organisation38 leadMgr;
    @XmlElement(name = "PrncplPngAgt")
    protected Organisation38 prncplPngAgt;
    @XmlElement(name = "PngAgt")
    protected Organisation38 pngAgt;
    @XmlElement(name = "Dpstry")
    protected Organisation38 dpstry;
    @XmlElement(name = "UndrlygRsk")
    protected Organisation38 undrlygRsk;

    /**
     * Gets the value of the sctySts property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityStatus3Choice }
     *     
     */
    public SecurityStatus3Choice getSctySts() {
        return sctySts;
    }

    /**
     * Sets the value of the sctySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityStatus3Choice }
     *     
     */
    public void setSctySts(SecurityStatus3Choice value) {
        this.sctySts = value;
    }

    /**
     * Gets the value of the isoSctyLngNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOSctyLngNm() {
        return isoSctyLngNm;
    }

    /**
     * Sets the value of the isoSctyLngNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOSctyLngNm(String value) {
        this.isoSctyLngNm = value;
    }

    /**
     * Gets the value of the isoSctyShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOSctyShrtNm() {
        return isoSctyShrtNm;
    }

    /**
     * Sets the value of the isoSctyShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOSctyShrtNm(String value) {
        this.isoSctyShrtNm = value;
    }

    /**
     * Gets the value of the nmVldFr property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getNmVldFr() {
        return nmVldFr;
    }

    /**
     * Sets the value of the nmVldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setNmVldFr(DateAndDateTime2Choice value) {
        this.nmVldFr = value;
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
     * Gets the value of the ctrctVrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctVrsnNb() {
        return ctrctVrsnNb;
    }

    /**
     * Sets the value of the ctrctVrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrctVrsnNb(BigDecimal value) {
        this.ctrctVrsnNb = value;
    }

    /**
     * Gets the value of the cpnAttchdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnAttchdNb() {
        return cpnAttchdNb;
    }

    /**
     * Sets the value of the cpnAttchdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnAttchdNb(String value) {
        this.cpnAttchdNb = value;
    }

    /**
     * Gets the value of the taxLotNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLotNb() {
        return taxLotNb;
    }

    /**
     * Sets the value of the taxLotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLotNb(String value) {
        this.taxLotNb = value;
    }

    /**
     * Gets the value of the poolNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolNb() {
        return poolNb;
    }

    /**
     * Sets the value of the poolNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolNb(String value) {
        this.poolNb = value;
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
     * Gets the value of the lglRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link LegalRestrictions4Choice }
     *     
     */
    public LegalRestrictions4Choice getLglRstrctns() {
        return lglRstrctns;
    }

    /**
     * Sets the value of the lglRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalRestrictions4Choice }
     *     
     */
    public void setLglRstrctns(LegalRestrictions4Choice value) {
        this.lglRstrctns = value;
    }

    /**
     * Gets the value of the posLmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getPosLmt() {
        return posLmt;
    }

    /**
     * Sets the value of the posLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setPosLmt(FinancialInstrumentQuantity1Choice value) {
        this.posLmt = value;
    }

    /**
     * Gets the value of the nearTermPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getNearTermPosLmt() {
        return nearTermPosLmt;
    }

    /**
     * Sets the value of the nearTermPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setNearTermPosLmt(FinancialInstrumentQuantity1Choice value) {
        this.nearTermPosLmt = value;
    }

    /**
     * Gets the value of the listgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getListgDt() {
        return listgDt;
    }

    /**
     * Sets the value of the listgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setListgDt(XMLGregorianCalendar value) {
        this.listgDt = value;
    }

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRcrdDt(XMLGregorianCalendar value) {
        this.rcrdDt = value;
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
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType2 }
     *     
     */
    public ClassificationType2 getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType2 }
     *     
     */
    public void setClssfctnTp(ClassificationType2 value) {
        this.clssfctnTp = value;
    }

    /**
     * Gets the value of the issnc property.
     * 
     * @return
     *     possible object is
     *     {@link Issuance5 }
     *     
     */
    public Issuance5 getIssnc() {
        return issnc;
    }

    /**
     * Sets the value of the issnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issuance5 }
     *     
     */
    public void setIssnc(Issuance5 value) {
        this.issnc = value;
    }

    /**
     * Gets the value of the tradgMkt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgMkt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgMkt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingParameters2 }
     * 
     * 
     * @return
     *     The value of the tradgMkt property.
     */
    public List<TradingParameters2> getTradgMkt() {
        if (tradgMkt == null) {
            tradgMkt = new ArrayList<>();
        }
        return this.tradgMkt;
    }

    /**
     * Gets the value of the sprdAndBchmkCrv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sprdAndBchmkCrv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSprdAndBchmkCrv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenchmarkCurve6 }
     * 
     * 
     * @return
     *     The value of the sprdAndBchmkCrv property.
     */
    public List<BenchmarkCurve6> getSprdAndBchmkCrv() {
        if (sprdAndBchmkCrv == null) {
            sprdAndBchmkCrv = new ArrayList<>();
        }
        return this.sprdAndBchmkCrv;
    }

    /**
     * Gets the value of the putTp property.
     * 
     * @return
     *     possible object is
     *     {@link PutType3Choice }
     *     
     */
    public PutType3Choice getPutTp() {
        return putTp;
    }

    /**
     * Sets the value of the putTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutType3Choice }
     *     
     */
    public void setPutTp(PutType3Choice value) {
        this.putTp = value;
    }

    /**
     * Gets the value of the callTp property.
     * 
     * @return
     *     possible object is
     *     {@link CallType3Choice }
     *     
     */
    public CallType3Choice getCallTp() {
        return callTp;
    }

    /**
     * Sets the value of the callTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallType3Choice }
     *     
     */
    public void setCallTp(CallType3Choice value) {
        this.callTp = value;
    }

    /**
     * Gets the value of the fngbInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFngbInd() {
        return fngbInd;
    }

    /**
     * Sets the value of the fngbInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFngbInd(Boolean value) {
        this.fngbInd = value;
    }

    /**
     * Gets the value of the cnfdtl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCnfdtl() {
        return cnfdtl;
    }

    /**
     * Sets the value of the cnfdtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCnfdtl(Boolean value) {
        this.cnfdtl = value;
    }

    /**
     * Gets the value of the prvtPlcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrvtPlcmnt() {
        return prvtPlcmnt;
    }

    /**
     * Sets the value of the prvtPlcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrvtPlcmnt(Boolean value) {
        this.prvtPlcmnt = value;
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
     * Gets the value of the convsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getConvsPrd() {
        return convsPrd;
    }

    /**
     * Sets the value of the convsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setConvsPrd(DateTimePeriod1 value) {
        this.convsPrd = value;
    }

    /**
     * Gets the value of the convsRatioNmrtr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getConvsRatioNmrtr() {
        return convsRatioNmrtr;
    }

    /**
     * Sets the value of the convsRatioNmrtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setConvsRatioNmrtr(FinancialInstrumentQuantity1Choice value) {
        this.convsRatioNmrtr = value;
    }

    /**
     * Gets the value of the convsRatioDnmtr property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getConvsRatioDnmtr() {
        return convsRatioDnmtr;
    }

    /**
     * Sets the value of the convsRatioDnmtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setConvsRatioDnmtr(FinancialInstrumentQuantity1Choice value) {
        this.convsRatioDnmtr = value;
    }

    /**
     * Gets the value of the pmryPlcOfDpst property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getPmryPlcOfDpst() {
        return pmryPlcOfDpst;
    }

    /**
     * Sets the value of the pmryPlcOfDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setPmryPlcOfDpst(PartyIdentification136 value) {
        this.pmryPlcOfDpst = value;
    }

    /**
     * Gets the value of the tradgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getTradgMtd() {
        return tradgMtd;
    }

    /**
     * Sets the value of the tradgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setTradgMtd(UnitOrFaceAmount1Choice value) {
        this.tradgMtd = value;
    }

    /**
     * Gets the value of the tefraRule property.
     * 
     * @return
     *     possible object is
     *     {@link TEFRARules3Choice }
     *     
     */
    public TEFRARules3Choice getTEFRARule() {
        return tefraRule;
    }

    /**
     * Sets the value of the tefraRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEFRARules3Choice }
     *     
     */
    public void setTEFRARule(TEFRARules3Choice value) {
        this.tefraRule = value;
    }

    /**
     * Gets the value of the srNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrNb() {
        return srNb;
    }

    /**
     * Sets the value of the srNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrNb(String value) {
        this.srNb = value;
    }

    /**
     * Gets the value of the clss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClss() {
        return clss;
    }

    /**
     * Sets the value of the clss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClss(String value) {
        this.clss = value;
    }

    /**
     * Gets the value of the whldgTaxRgm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the whldgTaxRgm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhldgTaxRgm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityWithHoldingTax1 }
     * 
     * 
     * @return
     *     The value of the whldgTaxRgm property.
     */
    public List<SecurityWithHoldingTax1> getWhldgTaxRgm() {
        if (whldgTaxRgm == null) {
            whldgTaxRgm = new ArrayList<>();
        }
        return this.whldgTaxRgm;
    }

    /**
     * Gets the value of the pmtSts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesPaymentStatus5Choice }
     *     
     */
    public SecuritiesPaymentStatus5Choice getPmtSts() {
        return pmtSts;
    }

    /**
     * Sets the value of the pmtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesPaymentStatus5Choice }
     *     
     */
    public void setPmtSts(SecuritiesPaymentStatus5Choice value) {
        this.pmtSts = value;
    }

    /**
     * Gets the value of the initlPhysForm property.
     * 
     * @return
     *     possible object is
     *     {@link InitialPhysicalForm4Choice }
     *     
     */
    public InitialPhysicalForm4Choice getInitlPhysForm() {
        return initlPhysForm;
    }

    /**
     * Sets the value of the initlPhysForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialPhysicalForm4Choice }
     *     
     */
    public void setInitlPhysForm(InitialPhysicalForm4Choice value) {
        this.initlPhysForm = value;
    }

    /**
     * Gets the value of the aftrXchgPhysForm property.
     * 
     * @return
     *     possible object is
     *     {@link InitialPhysicalForm3Choice }
     *     
     */
    public InitialPhysicalForm3Choice getAftrXchgPhysForm() {
        return aftrXchgPhysForm;
    }

    /**
     * Sets the value of the aftrXchgPhysForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialPhysicalForm3Choice }
     *     
     */
    public void setAftrXchgPhysForm(InitialPhysicalForm3Choice value) {
        this.aftrXchgPhysForm = value;
    }

    /**
     * Gets the value of the cmonSfkpr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public PartyIdentification177Choice getCmonSfkpr() {
        return cmonSfkpr;
    }

    /**
     * Sets the value of the cmonSfkpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public void setCmonSfkpr(PartyIdentification177Choice value) {
        this.cmonSfkpr = value;
    }

    /**
     * Gets the value of the redTp property.
     * 
     * @return
     *     possible object is
     *     {@link MaturityRedemptionType3Choice }
     *     
     */
    public MaturityRedemptionType3Choice getRedTp() {
        return redTp;
    }

    /**
     * Sets the value of the redTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaturityRedemptionType3Choice }
     *     
     */
    public void setRedTp(MaturityRedemptionType3Choice value) {
        this.redTp = value;
    }

    /**
     * Gets the value of the redPmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedPmtCcy() {
        return redPmtCcy;
    }

    /**
     * Sets the value of the redPmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedPmtCcy(String value) {
        this.redPmtCcy = value;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityRestriction3 }
     * 
     * 
     * @return
     *     The value of the rstrctn property.
     */
    public List<SecurityRestriction3> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<>();
        }
        return this.rstrctn;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the sttlmInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementInformation17 }
     * 
     * 
     * @return
     *     The value of the sttlmInf property.
     */
    public List<SettlementInformation17> getSttlmInf() {
        if (sttlmInf == null) {
            sttlmInf = new ArrayList<>();
        }
        return this.sttlmInf;
    }

    /**
     * Gets the value of the finInstrmForm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentForm2 }
     *     
     */
    public FinancialInstrumentForm2 getFinInstrmForm() {
        return finInstrmForm;
    }

    /**
     * Sets the value of the finInstrmForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentForm2 }
     *     
     */
    public void setFinInstrmForm(FinancialInstrumentForm2 value) {
        this.finInstrmForm = value;
    }

    /**
     * Gets the value of the ctctNm property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getCtctNm() {
        return ctctNm;
    }

    /**
     * Sets the value of the ctctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public void setCtctNm(Organisation38 value) {
        this.ctctNm = value;
    }

    /**
     * Gets the value of the leadMgr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getLeadMgr() {
        return leadMgr;
    }

    /**
     * Sets the value of the leadMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public void setLeadMgr(Organisation38 value) {
        this.leadMgr = value;
    }

    /**
     * Gets the value of the prncplPngAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getPrncplPngAgt() {
        return prncplPngAgt;
    }

    /**
     * Sets the value of the prncplPngAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public void setPrncplPngAgt(Organisation38 value) {
        this.prncplPngAgt = value;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getPngAgt() {
        return pngAgt;
    }

    /**
     * Sets the value of the pngAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public void setPngAgt(Organisation38 value) {
        this.pngAgt = value;
    }

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public void setDpstry(Organisation38 value) {
        this.dpstry = value;
    }

    /**
     * Gets the value of the undrlygRsk property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation38 }
     *     
     */
    public Organisation38 getUndrlygRsk() {
        return undrlygRsk;
    }

    /**
     * Sets the value of the undrlygRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation38 }
     *     
     */
    public void setUndrlygRsk(Organisation38 value) {
        this.undrlygRsk = value;
    }

}
