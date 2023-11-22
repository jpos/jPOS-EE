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

package org.jpos.iso20022.semt_023_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationParties7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConfirmationParties7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="Brrwr" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="Lndr" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="BrkrOfCdt" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails11" minOccurs="0"/>
 *         <element name="IntrdcgFirm" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails11" minOccurs="0"/>
 *         <element name="StepInFirm" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails11" minOccurs="0"/>
 *         <element name="StepOutFirm" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails11" minOccurs="0"/>
 *         <element name="ClrFirm" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails13" minOccurs="0"/>
 *         <element name="ExctgBrkr" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails13" minOccurs="0"/>
 *         <element name="CMUPty" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails11" minOccurs="0"/>
 *         <element name="CMUCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails11" minOccurs="0"/>
 *         <element name="AffrmgPty" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails11" minOccurs="0"/>
 *         <element name="TradBnfcryPty" type="{urn:iso:std:iso:20022:tech:xsd:semt.023.001.02}ConfirmationPartyDetails14" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationParties7", propOrder = {
    "buyr",
    "brrwr",
    "sellr",
    "lndr",
    "brkrOfCdt",
    "intrdcgFirm",
    "stepInFirm",
    "stepOutFirm",
    "clrFirm",
    "exctgBrkr",
    "cmuPty",
    "cmuCtrPty",
    "affrmgPty",
    "tradBnfcryPty"
})
public class ConfirmationParties7 {

    @XmlElement(name = "Buyr")
    protected ConfirmationPartyDetails12 buyr;
    @XmlElement(name = "Brrwr")
    protected ConfirmationPartyDetails12 brrwr;
    @XmlElement(name = "Sellr")
    protected ConfirmationPartyDetails12 sellr;
    @XmlElement(name = "Lndr")
    protected ConfirmationPartyDetails12 lndr;
    @XmlElement(name = "BrkrOfCdt")
    protected ConfirmationPartyDetails11 brkrOfCdt;
    @XmlElement(name = "IntrdcgFirm")
    protected ConfirmationPartyDetails11 intrdcgFirm;
    @XmlElement(name = "StepInFirm")
    protected ConfirmationPartyDetails11 stepInFirm;
    @XmlElement(name = "StepOutFirm")
    protected ConfirmationPartyDetails11 stepOutFirm;
    @XmlElement(name = "ClrFirm")
    protected ConfirmationPartyDetails13 clrFirm;
    @XmlElement(name = "ExctgBrkr")
    protected ConfirmationPartyDetails13 exctgBrkr;
    @XmlElement(name = "CMUPty")
    protected ConfirmationPartyDetails11 cmuPty;
    @XmlElement(name = "CMUCtrPty")
    protected ConfirmationPartyDetails11 cmuCtrPty;
    @XmlElement(name = "AffrmgPty")
    protected ConfirmationPartyDetails11 affrmgPty;
    @XmlElement(name = "TradBnfcryPty")
    protected ConfirmationPartyDetails14 tradBnfcryPty;

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationPartyDetails12 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public void setBuyr(ConfirmationPartyDetails12 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the brrwr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationPartyDetails12 getBrrwr() {
        return brrwr;
    }

    /**
     * Sets the value of the brrwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public void setBrrwr(ConfirmationPartyDetails12 value) {
        this.brrwr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationPartyDetails12 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public void setSellr(ConfirmationPartyDetails12 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the lndr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public ConfirmationPartyDetails12 getLndr() {
        return lndr;
    }

    /**
     * Sets the value of the lndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails12 }
     *     
     */
    public void setLndr(ConfirmationPartyDetails12 value) {
        this.lndr = value;
    }

    /**
     * Gets the value of the brkrOfCdt property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getBrkrOfCdt() {
        return brkrOfCdt;
    }

    /**
     * Sets the value of the brkrOfCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public void setBrkrOfCdt(ConfirmationPartyDetails11 value) {
        this.brkrOfCdt = value;
    }

    /**
     * Gets the value of the intrdcgFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getIntrdcgFirm() {
        return intrdcgFirm;
    }

    /**
     * Sets the value of the intrdcgFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public void setIntrdcgFirm(ConfirmationPartyDetails11 value) {
        this.intrdcgFirm = value;
    }

    /**
     * Gets the value of the stepInFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getStepInFirm() {
        return stepInFirm;
    }

    /**
     * Sets the value of the stepInFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public void setStepInFirm(ConfirmationPartyDetails11 value) {
        this.stepInFirm = value;
    }

    /**
     * Gets the value of the stepOutFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getStepOutFirm() {
        return stepOutFirm;
    }

    /**
     * Sets the value of the stepOutFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public void setStepOutFirm(ConfirmationPartyDetails11 value) {
        this.stepOutFirm = value;
    }

    /**
     * Gets the value of the clrFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails13 }
     *     
     */
    public ConfirmationPartyDetails13 getClrFirm() {
        return clrFirm;
    }

    /**
     * Sets the value of the clrFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails13 }
     *     
     */
    public void setClrFirm(ConfirmationPartyDetails13 value) {
        this.clrFirm = value;
    }

    /**
     * Gets the value of the exctgBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails13 }
     *     
     */
    public ConfirmationPartyDetails13 getExctgBrkr() {
        return exctgBrkr;
    }

    /**
     * Sets the value of the exctgBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails13 }
     *     
     */
    public void setExctgBrkr(ConfirmationPartyDetails13 value) {
        this.exctgBrkr = value;
    }

    /**
     * Gets the value of the cmuPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getCMUPty() {
        return cmuPty;
    }

    /**
     * Sets the value of the cmuPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public void setCMUPty(ConfirmationPartyDetails11 value) {
        this.cmuPty = value;
    }

    /**
     * Gets the value of the cmuCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getCMUCtrPty() {
        return cmuCtrPty;
    }

    /**
     * Sets the value of the cmuCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public void setCMUCtrPty(ConfirmationPartyDetails11 value) {
        this.cmuCtrPty = value;
    }

    /**
     * Gets the value of the affrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public ConfirmationPartyDetails11 getAffrmgPty() {
        return affrmgPty;
    }

    /**
     * Sets the value of the affrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails11 }
     *     
     */
    public void setAffrmgPty(ConfirmationPartyDetails11 value) {
        this.affrmgPty = value;
    }

    /**
     * Gets the value of the tradBnfcryPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationPartyDetails14 getTradBnfcryPty() {
        return tradBnfcryPty;
    }

    /**
     * Sets the value of the tradBnfcryPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public void setTradBnfcryPty(ConfirmationPartyDetails14 value) {
        this.tradBnfcryPty = value;
    }

}
