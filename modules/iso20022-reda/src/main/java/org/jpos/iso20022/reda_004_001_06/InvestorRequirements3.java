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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorRequirements3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestorRequirements3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RtrPrflPrsrvtn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="RtrPrflGrwth" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="RtrPrflIncm" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="RtrPrflHdgg" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="OptnOrLvrgdRtrPrfl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="RtrPrflPnsnSchmeDE" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="MinHldgPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TimeHorizon2Choice" minOccurs="0"/>
 *         <element name="ESGPrefs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket2Code" minOccurs="0"/>
 *         <element name="SstnbltyPrefs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}SustainabilityPreferences1Code" minOccurs="0"/>
 *         <element name="OthrSpcfcInvstmtNeed" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}InvestmentNeed2Choice" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}OtherInvestmentNeed1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorRequirements3", propOrder = {
    "rtrPrflPrsrvtn",
    "rtrPrflGrwth",
    "rtrPrflIncm",
    "rtrPrflHdgg",
    "optnOrLvrgdRtrPrfl",
    "rtrPrflPnsnSchmeDE",
    "minHldgPrd",
    "esgPrefs",
    "sstnbltyPrefs",
    "othrSpcfcInvstmtNeed",
    "othr"
})
public class InvestorRequirements3 {

    @XmlElement(name = "RtrPrflPrsrvtn")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflPrsrvtn;
    @XmlElement(name = "RtrPrflGrwth")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflGrwth;
    @XmlElement(name = "RtrPrflIncm")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflIncm;
    @XmlElement(name = "RtrPrflHdgg")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflHdgg;
    @XmlElement(name = "OptnOrLvrgdRtrPrfl")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code optnOrLvrgdRtrPrfl;
    @XmlElement(name = "RtrPrflPnsnSchmeDE")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code rtrPrflPnsnSchmeDE;
    @XmlElement(name = "MinHldgPrd")
    protected TimeHorizon2Choice minHldgPrd;
    @XmlElement(name = "ESGPrefs")
    @XmlSchemaType(name = "string")
    protected TargetMarket2Code esgPrefs;
    @XmlElement(name = "SstnbltyPrefs")
    @XmlSchemaType(name = "string")
    protected SustainabilityPreferences1Code sstnbltyPrefs;
    @XmlElement(name = "OthrSpcfcInvstmtNeed")
    protected InvestmentNeed2Choice othrSpcfcInvstmtNeed;
    @XmlElement(name = "Othr")
    protected List<OtherInvestmentNeed1> othr;

    /**
     * Gets the value of the rtrPrflPrsrvtn property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflPrsrvtn() {
        return rtrPrflPrsrvtn;
    }

    /**
     * Sets the value of the rtrPrflPrsrvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setRtrPrflPrsrvtn(TargetMarket1Code value) {
        this.rtrPrflPrsrvtn = value;
    }

    /**
     * Gets the value of the rtrPrflGrwth property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflGrwth() {
        return rtrPrflGrwth;
    }

    /**
     * Sets the value of the rtrPrflGrwth property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setRtrPrflGrwth(TargetMarket1Code value) {
        this.rtrPrflGrwth = value;
    }

    /**
     * Gets the value of the rtrPrflIncm property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflIncm() {
        return rtrPrflIncm;
    }

    /**
     * Sets the value of the rtrPrflIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setRtrPrflIncm(TargetMarket1Code value) {
        this.rtrPrflIncm = value;
    }

    /**
     * Gets the value of the rtrPrflHdgg property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflHdgg() {
        return rtrPrflHdgg;
    }

    /**
     * Sets the value of the rtrPrflHdgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setRtrPrflHdgg(TargetMarket1Code value) {
        this.rtrPrflHdgg = value;
    }

    /**
     * Gets the value of the optnOrLvrgdRtrPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getOptnOrLvrgdRtrPrfl() {
        return optnOrLvrgdRtrPrfl;
    }

    /**
     * Sets the value of the optnOrLvrgdRtrPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setOptnOrLvrgdRtrPrfl(TargetMarket1Code value) {
        this.optnOrLvrgdRtrPrfl = value;
    }

    /**
     * Gets the value of the rtrPrflPnsnSchmeDE property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getRtrPrflPnsnSchmeDE() {
        return rtrPrflPnsnSchmeDE;
    }

    /**
     * Sets the value of the rtrPrflPnsnSchmeDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setRtrPrflPnsnSchmeDE(TargetMarket1Code value) {
        this.rtrPrflPnsnSchmeDE = value;
    }

    /**
     * Gets the value of the minHldgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link TimeHorizon2Choice }
     *     
     */
    public TimeHorizon2Choice getMinHldgPrd() {
        return minHldgPrd;
    }

    /**
     * Sets the value of the minHldgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeHorizon2Choice }
     *     
     */
    public void setMinHldgPrd(TimeHorizon2Choice value) {
        this.minHldgPrd = value;
    }

    /**
     * Gets the value of the esgPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket2Code }
     *     
     */
    public TargetMarket2Code getESGPrefs() {
        return esgPrefs;
    }

    /**
     * Sets the value of the esgPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket2Code }
     *     
     */
    public void setESGPrefs(TargetMarket2Code value) {
        this.esgPrefs = value;
    }

    /**
     * Gets the value of the sstnbltyPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link SustainabilityPreferences1Code }
     *     
     */
    public SustainabilityPreferences1Code getSstnbltyPrefs() {
        return sstnbltyPrefs;
    }

    /**
     * Sets the value of the sstnbltyPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SustainabilityPreferences1Code }
     *     
     */
    public void setSstnbltyPrefs(SustainabilityPreferences1Code value) {
        this.sstnbltyPrefs = value;
    }

    /**
     * Gets the value of the othrSpcfcInvstmtNeed property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentNeed2Choice }
     *     
     */
    public InvestmentNeed2Choice getOthrSpcfcInvstmtNeed() {
        return othrSpcfcInvstmtNeed;
    }

    /**
     * Sets the value of the othrSpcfcInvstmtNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentNeed2Choice }
     *     
     */
    public void setOthrSpcfcInvstmtNeed(InvestmentNeed2Choice value) {
        this.othrSpcfcInvstmtNeed = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherInvestmentNeed1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<OtherInvestmentNeed1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
