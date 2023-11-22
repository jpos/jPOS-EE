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
 * <p>Java class for ProcessingCharacteristics6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingCharacteristics6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DealgCcyAccptd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SwtchAuthstn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Forms1" minOccurs="0"/>
 *         <element name="AmtInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="UnitsInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="Rndg" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}RoundingDirection2Code" minOccurs="0"/>
 *         <element name="MainFndOrdrDskLctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}MainFundOrderDeskLocation1" minOccurs="0"/>
 *         <element name="DealgFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}EventFrequency5Code" minOccurs="0"/>
 *         <element name="DealgFrqcyDesc" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max350Text" minOccurs="0"/>
 *         <element name="DealgCutOffTm" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISOTime" minOccurs="0"/>
 *         <element name="DealgCutOffTmFrame" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TimeFrame4" minOccurs="0"/>
 *         <element name="DealConfTm" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISOTime" minOccurs="0"/>
 *         <element name="DealConfTmFrame" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TimeFrame5" minOccurs="0"/>
 *         <element name="LtdPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max350Text" minOccurs="0"/>
 *         <element name="SttlmCycl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TimeFrame8Choice" minOccurs="0"/>
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
@XmlType(name = "ProcessingCharacteristics6", propOrder = {
    "dealgCcyAccptd",
    "swtchAuthstn",
    "amtInd",
    "unitsInd",
    "rndg",
    "mainFndOrdrDskLctn",
    "dealgFrqcy",
    "dealgFrqcyDesc",
    "dealgCutOffTm",
    "dealgCutOffTmFrame",
    "dealConfTm",
    "dealConfTmFrame",
    "ltdPrd",
    "sttlmCycl",
    "addtlInf"
})
public class ProcessingCharacteristics6 {

    @XmlElement(name = "DealgCcyAccptd")
    protected List<String> dealgCcyAccptd;
    @XmlElement(name = "SwtchAuthstn")
    protected Forms1 swtchAuthstn;
    @XmlElement(name = "AmtInd")
    protected Boolean amtInd;
    @XmlElement(name = "UnitsInd")
    protected Boolean unitsInd;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "MainFndOrdrDskLctn")
    protected MainFundOrderDeskLocation1 mainFndOrdrDskLctn;
    @XmlElement(name = "DealgFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code dealgFrqcy;
    @XmlElement(name = "DealgFrqcyDesc")
    protected String dealgFrqcyDesc;
    @XmlElement(name = "DealgCutOffTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dealgCutOffTm;
    @XmlElement(name = "DealgCutOffTmFrame")
    protected TimeFrame4 dealgCutOffTmFrame;
    @XmlElement(name = "DealConfTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar dealConfTm;
    @XmlElement(name = "DealConfTmFrame")
    protected TimeFrame5 dealConfTmFrame;
    @XmlElement(name = "LtdPrd")
    protected String ltdPrd;
    @XmlElement(name = "SttlmCycl")
    protected TimeFrame8Choice sttlmCycl;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the dealgCcyAccptd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dealgCcyAccptd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDealgCcyAccptd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dealgCcyAccptd property.
     */
    public List<String> getDealgCcyAccptd() {
        if (dealgCcyAccptd == null) {
            dealgCcyAccptd = new ArrayList<>();
        }
        return this.dealgCcyAccptd;
    }

    /**
     * Gets the value of the swtchAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link Forms1 }
     *     
     */
    public Forms1 getSwtchAuthstn() {
        return swtchAuthstn;
    }

    /**
     * Sets the value of the swtchAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms1 }
     *     
     */
    public void setSwtchAuthstn(Forms1 value) {
        this.swtchAuthstn = value;
    }

    /**
     * Gets the value of the amtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmtInd() {
        return amtInd;
    }

    /**
     * Sets the value of the amtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmtInd(Boolean value) {
        this.amtInd = value;
    }

    /**
     * Gets the value of the unitsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnitsInd() {
        return unitsInd;
    }

    /**
     * Sets the value of the unitsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnitsInd(Boolean value) {
        this.unitsInd = value;
    }

    /**
     * Gets the value of the rndg property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public RoundingDirection2Code getRndg() {
        return rndg;
    }

    /**
     * Sets the value of the rndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public void setRndg(RoundingDirection2Code value) {
        this.rndg = value;
    }

    /**
     * Gets the value of the mainFndOrdrDskLctn property.
     * 
     * @return
     *     possible object is
     *     {@link MainFundOrderDeskLocation1 }
     *     
     */
    public MainFundOrderDeskLocation1 getMainFndOrdrDskLctn() {
        return mainFndOrdrDskLctn;
    }

    /**
     * Sets the value of the mainFndOrdrDskLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainFundOrderDeskLocation1 }
     *     
     */
    public void setMainFndOrdrDskLctn(MainFundOrderDeskLocation1 value) {
        this.mainFndOrdrDskLctn = value;
    }

    /**
     * Gets the value of the dealgFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getDealgFrqcy() {
        return dealgFrqcy;
    }

    /**
     * Sets the value of the dealgFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public void setDealgFrqcy(EventFrequency5Code value) {
        this.dealgFrqcy = value;
    }

    /**
     * Gets the value of the dealgFrqcyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealgFrqcyDesc() {
        return dealgFrqcyDesc;
    }

    /**
     * Sets the value of the dealgFrqcyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealgFrqcyDesc(String value) {
        this.dealgFrqcyDesc = value;
    }

    /**
     * Gets the value of the dealgCutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealgCutOffTm() {
        return dealgCutOffTm;
    }

    /**
     * Sets the value of the dealgCutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDealgCutOffTm(XMLGregorianCalendar value) {
        this.dealgCutOffTm = value;
    }

    /**
     * Gets the value of the dealgCutOffTmFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame4 }
     *     
     */
    public TimeFrame4 getDealgCutOffTmFrame() {
        return dealgCutOffTmFrame;
    }

    /**
     * Sets the value of the dealgCutOffTmFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame4 }
     *     
     */
    public void setDealgCutOffTmFrame(TimeFrame4 value) {
        this.dealgCutOffTmFrame = value;
    }

    /**
     * Gets the value of the dealConfTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealConfTm() {
        return dealConfTm;
    }

    /**
     * Sets the value of the dealConfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDealConfTm(XMLGregorianCalendar value) {
        this.dealConfTm = value;
    }

    /**
     * Gets the value of the dealConfTmFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame5 }
     *     
     */
    public TimeFrame5 getDealConfTmFrame() {
        return dealConfTmFrame;
    }

    /**
     * Sets the value of the dealConfTmFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame5 }
     *     
     */
    public void setDealConfTmFrame(TimeFrame5 value) {
        this.dealConfTmFrame = value;
    }

    /**
     * Gets the value of the ltdPrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLtdPrd() {
        return ltdPrd;
    }

    /**
     * Sets the value of the ltdPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLtdPrd(String value) {
        this.ltdPrd = value;
    }

    /**
     * Gets the value of the sttlmCycl property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame8Choice }
     *     
     */
    public TimeFrame8Choice getSttlmCycl() {
        return sttlmCycl;
    }

    /**
     * Sets the value of the sttlmCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame8Choice }
     *     
     */
    public void setSttlmCycl(TimeFrame8Choice value) {
        this.sttlmCycl = value;
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
