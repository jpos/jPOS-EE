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
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FutureOrOptionDetails3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FutureOrOptionDetails3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FutrAndOptnCtrctTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}FutureAndOptionContractType1Code" minOccurs="0"/>
 *         <element name="LastDlvryDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}UnitOfMeasure1Code" minOccurs="0"/>
 *         <element name="FutrDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="MinSz" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AnncmntDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="Apprnc" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Appearance1Code" minOccurs="0"/>
 *         <element name="StrpblInd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="PosLmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number" minOccurs="0"/>
 *         <element name="NearTermPosLmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number" minOccurs="0"/>
 *         <element name="MinTradgPricgIncrmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Number" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max256Text" minOccurs="0"/>
 *         <element name="CtrctSttlmMnth" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISOYearMonth" minOccurs="0"/>
 *         <element name="FrstDealgDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="Ratio" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}UnderlyingRatio2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Ratg" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Rating1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IssePric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="OptnRghts" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}OptionRight2Choice" minOccurs="0"/>
 *         <element name="LastTx" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="SprdTx" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FutureOrOptionDetails3", propOrder = {
    "futrAndOptnCtrctTp",
    "lastDlvryDt",
    "unitOfMeasr",
    "futrDt",
    "minSz",
    "anncmntDt",
    "apprnc",
    "strpblInd",
    "posLmt",
    "nearTermPosLmt",
    "minTradgPricgIncrmt",
    "purp",
    "ctrctSttlmMnth",
    "frstDealgDt",
    "ratio",
    "ratg",
    "issePric",
    "optnRghts",
    "lastTx",
    "sprdTx"
})
public class FutureOrOptionDetails3 {

    @XmlElement(name = "FutrAndOptnCtrctTp")
    @XmlSchemaType(name = "string")
    protected FutureAndOptionContractType1Code futrAndOptnCtrctTp;
    @XmlElement(name = "LastDlvryDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDlvryDt;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "FutrDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar futrDt;
    @XmlElement(name = "MinSz")
    protected ActiveCurrencyAndAmount minSz;
    @XmlElement(name = "AnncmntDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar anncmntDt;
    @XmlElement(name = "Apprnc")
    @XmlSchemaType(name = "string")
    protected Appearance1Code apprnc;
    @XmlElement(name = "StrpblInd")
    protected Boolean strpblInd;
    @XmlElement(name = "PosLmt")
    protected BigDecimal posLmt;
    @XmlElement(name = "NearTermPosLmt")
    protected BigDecimal nearTermPosLmt;
    @XmlElement(name = "MinTradgPricgIncrmt")
    protected BigDecimal minTradgPricgIncrmt;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "CtrctSttlmMnth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar ctrctSttlmMnth;
    @XmlElement(name = "FrstDealgDt")
    protected DateAndDateTime1Choice frstDealgDt;
    @XmlElement(name = "Ratio")
    protected List<UnderlyingRatio2> ratio;
    @XmlElement(name = "Ratg")
    protected List<Rating1> ratg;
    @XmlElement(name = "IssePric")
    protected Price14 issePric;
    @XmlElement(name = "OptnRghts")
    protected OptionRight2Choice optnRghts;
    @XmlElement(name = "LastTx")
    protected Boolean lastTx;
    @XmlElement(name = "SprdTx")
    protected Boolean sprdTx;

    /**
     * Gets the value of the futrAndOptnCtrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FutureAndOptionContractType1Code }
     *     
     */
    public FutureAndOptionContractType1Code getFutrAndOptnCtrctTp() {
        return futrAndOptnCtrctTp;
    }

    /**
     * Sets the value of the futrAndOptnCtrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureAndOptionContractType1Code }
     *     
     */
    public void setFutrAndOptnCtrctTp(FutureAndOptionContractType1Code value) {
        this.futrAndOptnCtrctTp = value;
    }

    /**
     * Gets the value of the lastDlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDlvryDt() {
        return lastDlvryDt;
    }

    /**
     * Sets the value of the lastDlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDlvryDt(XMLGregorianCalendar value) {
        this.lastDlvryDt = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public UnitOfMeasure1Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the futrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFutrDt() {
        return futrDt;
    }

    /**
     * Sets the value of the futrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFutrDt(XMLGregorianCalendar value) {
        this.futrDt = value;
    }

    /**
     * Gets the value of the minSz property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSz() {
        return minSz;
    }

    /**
     * Sets the value of the minSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMinSz(ActiveCurrencyAndAmount value) {
        this.minSz = value;
    }

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnncmntDt(XMLGregorianCalendar value) {
        this.anncmntDt = value;
    }

    /**
     * Gets the value of the apprnc property.
     * 
     * @return
     *     possible object is
     *     {@link Appearance1Code }
     *     
     */
    public Appearance1Code getApprnc() {
        return apprnc;
    }

    /**
     * Sets the value of the apprnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appearance1Code }
     *     
     */
    public void setApprnc(Appearance1Code value) {
        this.apprnc = value;
    }

    /**
     * Gets the value of the strpblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrpblInd() {
        return strpblInd;
    }

    /**
     * Sets the value of the strpblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrpblInd(Boolean value) {
        this.strpblInd = value;
    }

    /**
     * Gets the value of the posLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPosLmt() {
        return posLmt;
    }

    /**
     * Sets the value of the posLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPosLmt(BigDecimal value) {
        this.posLmt = value;
    }

    /**
     * Gets the value of the nearTermPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNearTermPosLmt() {
        return nearTermPosLmt;
    }

    /**
     * Sets the value of the nearTermPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNearTermPosLmt(BigDecimal value) {
        this.nearTermPosLmt = value;
    }

    /**
     * Gets the value of the minTradgPricgIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinTradgPricgIncrmt() {
        return minTradgPricgIncrmt;
    }

    /**
     * Sets the value of the minTradgPricgIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinTradgPricgIncrmt(BigDecimal value) {
        this.minTradgPricgIncrmt = value;
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
     * Gets the value of the ctrctSttlmMnth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCtrctSttlmMnth() {
        return ctrctSttlmMnth;
    }

    /**
     * Sets the value of the ctrctSttlmMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCtrctSttlmMnth(XMLGregorianCalendar value) {
        this.ctrctSttlmMnth = value;
    }

    /**
     * Gets the value of the frstDealgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getFrstDealgDt() {
        return frstDealgDt;
    }

    /**
     * Sets the value of the frstDealgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setFrstDealgDt(DateAndDateTime1Choice value) {
        this.frstDealgDt = value;
    }

    /**
     * Gets the value of the ratio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ratio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingRatio2 }
     * 
     * 
     * @return
     *     The value of the ratio property.
     */
    public List<UnderlyingRatio2> getRatio() {
        if (ratio == null) {
            ratio = new ArrayList<>();
        }
        return this.ratio;
    }

    /**
     * Gets the value of the ratg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ratg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rating1 }
     * 
     * 
     * @return
     *     The value of the ratg property.
     */
    public List<Rating1> getRatg() {
        if (ratg == null) {
            ratg = new ArrayList<>();
        }
        return this.ratg;
    }

    /**
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setIssePric(Price14 value) {
        this.issePric = value;
    }

    /**
     * Gets the value of the optnRghts property.
     * 
     * @return
     *     possible object is
     *     {@link OptionRight2Choice }
     *     
     */
    public OptionRight2Choice getOptnRghts() {
        return optnRghts;
    }

    /**
     * Sets the value of the optnRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionRight2Choice }
     *     
     */
    public void setOptnRghts(OptionRight2Choice value) {
        this.optnRghts = value;
    }

    /**
     * Gets the value of the lastTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastTx() {
        return lastTx;
    }

    /**
     * Sets the value of the lastTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastTx(Boolean value) {
        this.lastTx = value;
    }

    /**
     * Gets the value of the sprdTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprdTx() {
        return sprdTx;
    }

    /**
     * Sets the value of the sprdTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprdTx(Boolean value) {
        this.sprdTx = value;
    }

}
