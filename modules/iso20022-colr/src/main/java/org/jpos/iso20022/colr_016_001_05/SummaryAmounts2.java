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

package org.jpos.iso20022.colr_016_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryAmounts2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SummaryAmounts2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ThrshldAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ThrshldTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ThresholdType1Code" minOccurs="0"/>
 *         <element name="PreHrcutCollVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AdjstdXpsr" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CollReqrd" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RtrXcssCshAndCollCcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ReturnExcessCash1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MinTrfAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RndgAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrvsXpsrVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrvsCollVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlPdgIncmgColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlPdgOutgngColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlAcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlFees" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryAmounts2", propOrder = {
    "thrshldAmt",
    "thrshldTp",
    "preHrcutCollVal",
    "adjstdXpsr",
    "collReqrd",
    "rtrXcssCshAndCollCcy",
    "minTrfAmt",
    "rndgAmt",
    "prvsXpsrVal",
    "prvsCollVal",
    "ttlPdgIncmgColl",
    "ttlPdgOutgngColl",
    "ttlAcrdIntrstAmt",
    "ttlFees"
})
public class SummaryAmounts2 {

    @XmlElement(name = "ThrshldAmt")
    protected ActiveCurrencyAndAmount thrshldAmt;
    @XmlElement(name = "ThrshldTp")
    @XmlSchemaType(name = "string")
    protected ThresholdType1Code thrshldTp;
    @XmlElement(name = "PreHrcutCollVal")
    protected ActiveCurrencyAndAmount preHrcutCollVal;
    @XmlElement(name = "AdjstdXpsr")
    protected ActiveCurrencyAndAmount adjstdXpsr;
    @XmlElement(name = "CollReqrd")
    protected ActiveCurrencyAndAmount collReqrd;
    @XmlElement(name = "RtrXcssCshAndCollCcy")
    protected List<ReturnExcessCash1> rtrXcssCshAndCollCcy;
    @XmlElement(name = "MinTrfAmt")
    protected ActiveCurrencyAndAmount minTrfAmt;
    @XmlElement(name = "RndgAmt")
    protected ActiveCurrencyAndAmount rndgAmt;
    @XmlElement(name = "PrvsXpsrVal")
    protected ActiveCurrencyAndAmount prvsXpsrVal;
    @XmlElement(name = "PrvsCollVal")
    protected ActiveCurrencyAndAmount prvsCollVal;
    @XmlElement(name = "TtlPdgIncmgColl")
    protected ActiveCurrencyAndAmount ttlPdgIncmgColl;
    @XmlElement(name = "TtlPdgOutgngColl")
    protected ActiveCurrencyAndAmount ttlPdgOutgngColl;
    @XmlElement(name = "TtlAcrdIntrstAmt")
    protected ActiveCurrencyAndAmount ttlAcrdIntrstAmt;
    @XmlElement(name = "TtlFees")
    protected ActiveCurrencyAndAmount ttlFees;

    /**
     * Gets the value of the thrshldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getThrshldAmt() {
        return thrshldAmt;
    }

    /**
     * Sets the value of the thrshldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setThrshldAmt(ActiveCurrencyAndAmount value) {
        this.thrshldAmt = value;
    }

    /**
     * Gets the value of the thrshldTp property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdType1Code }
     *     
     */
    public ThresholdType1Code getThrshldTp() {
        return thrshldTp;
    }

    /**
     * Sets the value of the thrshldTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdType1Code }
     *     
     */
    public void setThrshldTp(ThresholdType1Code value) {
        this.thrshldTp = value;
    }

    /**
     * Gets the value of the preHrcutCollVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPreHrcutCollVal() {
        return preHrcutCollVal;
    }

    /**
     * Sets the value of the preHrcutCollVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPreHrcutCollVal(ActiveCurrencyAndAmount value) {
        this.preHrcutCollVal = value;
    }

    /**
     * Gets the value of the adjstdXpsr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAdjstdXpsr() {
        return adjstdXpsr;
    }

    /**
     * Sets the value of the adjstdXpsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAdjstdXpsr(ActiveCurrencyAndAmount value) {
        this.adjstdXpsr = value;
    }

    /**
     * Gets the value of the collReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollReqrd() {
        return collReqrd;
    }

    /**
     * Sets the value of the collReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCollReqrd(ActiveCurrencyAndAmount value) {
        this.collReqrd = value;
    }

    /**
     * Gets the value of the rtrXcssCshAndCollCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtrXcssCshAndCollCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtrXcssCshAndCollCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnExcessCash1 }
     * 
     * 
     * @return
     *     The value of the rtrXcssCshAndCollCcy property.
     */
    public List<ReturnExcessCash1> getRtrXcssCshAndCollCcy() {
        if (rtrXcssCshAndCollCcy == null) {
            rtrXcssCshAndCollCcy = new ArrayList<>();
        }
        return this.rtrXcssCshAndCollCcy;
    }

    /**
     * Gets the value of the minTrfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinTrfAmt() {
        return minTrfAmt;
    }

    /**
     * Sets the value of the minTrfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMinTrfAmt(ActiveCurrencyAndAmount value) {
        this.minTrfAmt = value;
    }

    /**
     * Gets the value of the rndgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRndgAmt() {
        return rndgAmt;
    }

    /**
     * Sets the value of the rndgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRndgAmt(ActiveCurrencyAndAmount value) {
        this.rndgAmt = value;
    }

    /**
     * Gets the value of the prvsXpsrVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrvsXpsrVal() {
        return prvsXpsrVal;
    }

    /**
     * Sets the value of the prvsXpsrVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPrvsXpsrVal(ActiveCurrencyAndAmount value) {
        this.prvsXpsrVal = value;
    }

    /**
     * Gets the value of the prvsCollVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrvsCollVal() {
        return prvsCollVal;
    }

    /**
     * Sets the value of the prvsCollVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPrvsCollVal(ActiveCurrencyAndAmount value) {
        this.prvsCollVal = value;
    }

    /**
     * Gets the value of the ttlPdgIncmgColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlPdgIncmgColl() {
        return ttlPdgIncmgColl;
    }

    /**
     * Sets the value of the ttlPdgIncmgColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlPdgIncmgColl(ActiveCurrencyAndAmount value) {
        this.ttlPdgIncmgColl = value;
    }

    /**
     * Gets the value of the ttlPdgOutgngColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlPdgOutgngColl() {
        return ttlPdgOutgngColl;
    }

    /**
     * Sets the value of the ttlPdgOutgngColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlPdgOutgngColl(ActiveCurrencyAndAmount value) {
        this.ttlPdgOutgngColl = value;
    }

    /**
     * Gets the value of the ttlAcrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAcrdIntrstAmt() {
        return ttlAcrdIntrstAmt;
    }

    /**
     * Sets the value of the ttlAcrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlAcrdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.ttlAcrdIntrstAmt = value;
    }

    /**
     * Gets the value of the ttlFees property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlFees() {
        return ttlFees;
    }

    /**
     * Sets the value of the ttlFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlFees(ActiveCurrencyAndAmount value) {
        this.ttlFees = value;
    }

}
