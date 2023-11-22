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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrument96 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrument96">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PhysBrScties" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="DmtrlsdBrScties" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="PhysRegdScties" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="DmtrlsdRegdScties" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="DstrbtnPlcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DistributionPolicy1Code" minOccurs="0"/>
 *         <element name="DvddPlcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DividendPolicy1Code" minOccurs="0"/>
 *         <element name="DvddFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}EventFrequency5Code" minOccurs="0"/>
 *         <element name="RinvstmtFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}EventFrequency5Code" minOccurs="0"/>
 *         <element name="FrntEndLd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="BckEndLd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="SwtchFee" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="EUSvgsDrctv" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}EUSavingsDirective1Code" minOccurs="0"/>
 *         <element name="LnchDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" minOccurs="0"/>
 *         <element name="FndEndDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" minOccurs="0"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" minOccurs="0"/>
 *         <element name="InitlOfferEndDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" minOccurs="0"/>
 *         <element name="SspnsnStartDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" minOccurs="0"/>
 *         <element name="SspnsnEndDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" minOccurs="0"/>
 *         <element name="MayBeTermntdEarly" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="ClsdEndFnd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="Equlstn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="TaxEffcntPdctElgbl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="Authrsd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="RDRCmplnt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="MgmtFeeSrc" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AnnualChargePaymentType1Code" minOccurs="0"/>
 *         <element name="PrfrmncFee" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument96", propOrder = {
    "physBrScties",
    "dmtrlsdBrScties",
    "physRegdScties",
    "dmtrlsdRegdScties",
    "dstrbtnPlcy",
    "dvddPlcy",
    "dvddFrqcy",
    "rinvstmtFrqcy",
    "frntEndLd",
    "bckEndLd",
    "swtchFee",
    "euSvgsDrctv",
    "lnchDt",
    "fndEndDt",
    "termntnDt",
    "initlOfferEndDt",
    "sspnsnStartDt",
    "sspnsnEndDt",
    "mtrtyDt",
    "mayBeTermntdEarly",
    "clsdEndFnd",
    "equlstn",
    "taxEffcntPdctElgbl",
    "authrsd",
    "rdrCmplnt",
    "mgmtFeeSrc",
    "prfrmncFee",
    "addtlInf"
})
public class FinancialInstrument96 {

    @XmlElement(name = "PhysBrScties")
    protected Boolean physBrScties;
    @XmlElement(name = "DmtrlsdBrScties")
    protected Boolean dmtrlsdBrScties;
    @XmlElement(name = "PhysRegdScties")
    protected Boolean physRegdScties;
    @XmlElement(name = "DmtrlsdRegdScties")
    protected Boolean dmtrlsdRegdScties;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "DvddPlcy")
    @XmlSchemaType(name = "string")
    protected DividendPolicy1Code dvddPlcy;
    @XmlElement(name = "DvddFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code dvddFrqcy;
    @XmlElement(name = "RinvstmtFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code rinvstmtFrqcy;
    @XmlElement(name = "FrntEndLd")
    protected Boolean frntEndLd;
    @XmlElement(name = "BckEndLd")
    protected Boolean bckEndLd;
    @XmlElement(name = "SwtchFee")
    protected Boolean swtchFee;
    @XmlElement(name = "EUSvgsDrctv")
    @XmlSchemaType(name = "string")
    protected EUSavingsDirective1Code euSvgsDrctv;
    @XmlElement(name = "LnchDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lnchDt;
    @XmlElement(name = "FndEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fndEndDt;
    @XmlElement(name = "TermntnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termntnDt;
    @XmlElement(name = "InitlOfferEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initlOfferEndDt;
    @XmlElement(name = "SspnsnStartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sspnsnStartDt;
    @XmlElement(name = "SspnsnEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sspnsnEndDt;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "MayBeTermntdEarly")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code mayBeTermntdEarly;
    @XmlElement(name = "ClsdEndFnd")
    protected Boolean clsdEndFnd;
    @XmlElement(name = "Equlstn")
    protected Boolean equlstn;
    @XmlElement(name = "TaxEffcntPdctElgbl")
    protected Boolean taxEffcntPdctElgbl;
    @XmlElement(name = "Authrsd")
    protected Boolean authrsd;
    @XmlElement(name = "RDRCmplnt")
    protected Boolean rdrCmplnt;
    @XmlElement(name = "MgmtFeeSrc")
    @XmlSchemaType(name = "string")
    protected AnnualChargePaymentType1Code mgmtFeeSrc;
    @XmlElement(name = "PrfrmncFee")
    protected Boolean prfrmncFee;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the physBrScties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysBrScties() {
        return physBrScties;
    }

    /**
     * Sets the value of the physBrScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhysBrScties(Boolean value) {
        this.physBrScties = value;
    }

    /**
     * Gets the value of the dmtrlsdBrScties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmtrlsdBrScties() {
        return dmtrlsdBrScties;
    }

    /**
     * Sets the value of the dmtrlsdBrScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDmtrlsdBrScties(Boolean value) {
        this.dmtrlsdBrScties = value;
    }

    /**
     * Gets the value of the physRegdScties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysRegdScties() {
        return physRegdScties;
    }

    /**
     * Sets the value of the physRegdScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhysRegdScties(Boolean value) {
        this.physRegdScties = value;
    }

    /**
     * Gets the value of the dmtrlsdRegdScties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmtrlsdRegdScties() {
        return dmtrlsdRegdScties;
    }

    /**
     * Sets the value of the dmtrlsdRegdScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDmtrlsdRegdScties(Boolean value) {
        this.dmtrlsdRegdScties = value;
    }

    /**
     * Gets the value of the dstrbtnPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Sets the value of the dstrbtnPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public void setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
    }

    /**
     * Gets the value of the dvddPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DividendPolicy1Code }
     *     
     */
    public DividendPolicy1Code getDvddPlcy() {
        return dvddPlcy;
    }

    /**
     * Sets the value of the dvddPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendPolicy1Code }
     *     
     */
    public void setDvddPlcy(DividendPolicy1Code value) {
        this.dvddPlcy = value;
    }

    /**
     * Gets the value of the dvddFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getDvddFrqcy() {
        return dvddFrqcy;
    }

    /**
     * Sets the value of the dvddFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public void setDvddFrqcy(EventFrequency5Code value) {
        this.dvddFrqcy = value;
    }

    /**
     * Gets the value of the rinvstmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getRinvstmtFrqcy() {
        return rinvstmtFrqcy;
    }

    /**
     * Sets the value of the rinvstmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public void setRinvstmtFrqcy(EventFrequency5Code value) {
        this.rinvstmtFrqcy = value;
    }

    /**
     * Gets the value of the frntEndLd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrntEndLd() {
        return frntEndLd;
    }

    /**
     * Sets the value of the frntEndLd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrntEndLd(Boolean value) {
        this.frntEndLd = value;
    }

    /**
     * Gets the value of the bckEndLd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBckEndLd() {
        return bckEndLd;
    }

    /**
     * Sets the value of the bckEndLd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBckEndLd(Boolean value) {
        this.bckEndLd = value;
    }

    /**
     * Gets the value of the swtchFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSwtchFee() {
        return swtchFee;
    }

    /**
     * Sets the value of the swtchFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSwtchFee(Boolean value) {
        this.swtchFee = value;
    }

    /**
     * Gets the value of the euSvgsDrctv property.
     * 
     * @return
     *     possible object is
     *     {@link EUSavingsDirective1Code }
     *     
     */
    public EUSavingsDirective1Code getEUSvgsDrctv() {
        return euSvgsDrctv;
    }

    /**
     * Sets the value of the euSvgsDrctv property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUSavingsDirective1Code }
     *     
     */
    public void setEUSvgsDrctv(EUSavingsDirective1Code value) {
        this.euSvgsDrctv = value;
    }

    /**
     * Gets the value of the lnchDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLnchDt() {
        return lnchDt;
    }

    /**
     * Sets the value of the lnchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLnchDt(XMLGregorianCalendar value) {
        this.lnchDt = value;
    }

    /**
     * Gets the value of the fndEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFndEndDt() {
        return fndEndDt;
    }

    /**
     * Sets the value of the fndEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFndEndDt(XMLGregorianCalendar value) {
        this.fndEndDt = value;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermntnDt(XMLGregorianCalendar value) {
        this.termntnDt = value;
    }

    /**
     * Gets the value of the initlOfferEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitlOfferEndDt() {
        return initlOfferEndDt;
    }

    /**
     * Sets the value of the initlOfferEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitlOfferEndDt(XMLGregorianCalendar value) {
        this.initlOfferEndDt = value;
    }

    /**
     * Gets the value of the sspnsnStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSspnsnStartDt() {
        return sspnsnStartDt;
    }

    /**
     * Sets the value of the sspnsnStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSspnsnStartDt(XMLGregorianCalendar value) {
        this.sspnsnStartDt = value;
    }

    /**
     * Gets the value of the sspnsnEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSspnsnEndDt() {
        return sspnsnEndDt;
    }

    /**
     * Sets the value of the sspnsnEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSspnsnEndDt(XMLGregorianCalendar value) {
        this.sspnsnEndDt = value;
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
     * Gets the value of the mayBeTermntdEarly property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getMayBeTermntdEarly() {
        return mayBeTermntdEarly;
    }

    /**
     * Sets the value of the mayBeTermntdEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setMayBeTermntdEarly(TargetMarket1Code value) {
        this.mayBeTermntdEarly = value;
    }

    /**
     * Gets the value of the clsdEndFnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsdEndFnd() {
        return clsdEndFnd;
    }

    /**
     * Sets the value of the clsdEndFnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClsdEndFnd(Boolean value) {
        this.clsdEndFnd = value;
    }

    /**
     * Gets the value of the equlstn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEqulstn() {
        return equlstn;
    }

    /**
     * Sets the value of the equlstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEqulstn(Boolean value) {
        this.equlstn = value;
    }

    /**
     * Gets the value of the taxEffcntPdctElgbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxEffcntPdctElgbl() {
        return taxEffcntPdctElgbl;
    }

    /**
     * Sets the value of the taxEffcntPdctElgbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxEffcntPdctElgbl(Boolean value) {
        this.taxEffcntPdctElgbl = value;
    }

    /**
     * Gets the value of the authrsd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthrsd() {
        return authrsd;
    }

    /**
     * Sets the value of the authrsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthrsd(Boolean value) {
        this.authrsd = value;
    }

    /**
     * Gets the value of the rdrCmplnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRDRCmplnt() {
        return rdrCmplnt;
    }

    /**
     * Sets the value of the rdrCmplnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRDRCmplnt(Boolean value) {
        this.rdrCmplnt = value;
    }

    /**
     * Gets the value of the mgmtFeeSrc property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualChargePaymentType1Code }
     *     
     */
    public AnnualChargePaymentType1Code getMgmtFeeSrc() {
        return mgmtFeeSrc;
    }

    /**
     * Sets the value of the mgmtFeeSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualChargePaymentType1Code }
     *     
     */
    public void setMgmtFeeSrc(AnnualChargePaymentType1Code value) {
        this.mgmtFeeSrc = value;
    }

    /**
     * Gets the value of the prfrmncFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrfrmncFee() {
        return prfrmncFee;
    }

    /**
     * Sets the value of the prfrmncFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrfrmncFee(Boolean value) {
        this.prfrmncFee = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
