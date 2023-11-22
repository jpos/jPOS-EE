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

package org.jpos.iso20022.setr_044_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationParties9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConfirmationParties9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}PartyIdentificationAndAccount220" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="Brrwr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="Lndr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="BrkrOfCdt" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails14" minOccurs="0"/>
 *         <element name="IntrdcgFirm" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails14" minOccurs="0"/>
 *         <element name="StepInFirm" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails11" minOccurs="0"/>
 *         <element name="StepOutFirm" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails11" minOccurs="0"/>
 *         <element name="ClrFirm" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails16" minOccurs="0"/>
 *         <element name="ExctgBrkr" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails16" minOccurs="0"/>
 *         <element name="AffrmgPty" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails14" minOccurs="0"/>
 *         <element name="TradBnfcryPty" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}ConfirmationPartyDetails14" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationParties9", propOrder = {
    "invstr",
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
    "affrmgPty",
    "tradBnfcryPty"
})
public class ConfirmationParties9 {

    @XmlElement(name = "Invstr")
    protected List<PartyIdentificationAndAccount220> invstr;
    @XmlElement(name = "Buyr")
    protected ConfirmationPartyDetails12 buyr;
    @XmlElement(name = "Brrwr")
    protected ConfirmationPartyDetails12 brrwr;
    @XmlElement(name = "Sellr")
    protected ConfirmationPartyDetails12 sellr;
    @XmlElement(name = "Lndr")
    protected ConfirmationPartyDetails12 lndr;
    @XmlElement(name = "BrkrOfCdt")
    protected ConfirmationPartyDetails14 brkrOfCdt;
    @XmlElement(name = "IntrdcgFirm")
    protected ConfirmationPartyDetails14 intrdcgFirm;
    @XmlElement(name = "StepInFirm")
    protected ConfirmationPartyDetails11 stepInFirm;
    @XmlElement(name = "StepOutFirm")
    protected ConfirmationPartyDetails11 stepOutFirm;
    @XmlElement(name = "ClrFirm")
    protected ConfirmationPartyDetails16 clrFirm;
    @XmlElement(name = "ExctgBrkr")
    protected ConfirmationPartyDetails16 exctgBrkr;
    @XmlElement(name = "AffrmgPty")
    protected ConfirmationPartyDetails14 affrmgPty;
    @XmlElement(name = "TradBnfcryPty")
    protected ConfirmationPartyDetails14 tradBnfcryPty;

    /**
     * Gets the value of the invstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount220 }
     * 
     * 
     * @return
     *     The value of the invstr property.
     */
    public List<PartyIdentificationAndAccount220> getInvstr() {
        if (invstr == null) {
            invstr = new ArrayList<>();
        }
        return this.invstr;
    }

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
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationPartyDetails14 getBrkrOfCdt() {
        return brkrOfCdt;
    }

    /**
     * Sets the value of the brkrOfCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public void setBrkrOfCdt(ConfirmationPartyDetails14 value) {
        this.brkrOfCdt = value;
    }

    /**
     * Gets the value of the intrdcgFirm property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationPartyDetails14 getIntrdcgFirm() {
        return intrdcgFirm;
    }

    /**
     * Sets the value of the intrdcgFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public void setIntrdcgFirm(ConfirmationPartyDetails14 value) {
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
     *     {@link ConfirmationPartyDetails16 }
     *     
     */
    public ConfirmationPartyDetails16 getClrFirm() {
        return clrFirm;
    }

    /**
     * Sets the value of the clrFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails16 }
     *     
     */
    public void setClrFirm(ConfirmationPartyDetails16 value) {
        this.clrFirm = value;
    }

    /**
     * Gets the value of the exctgBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails16 }
     *     
     */
    public ConfirmationPartyDetails16 getExctgBrkr() {
        return exctgBrkr;
    }

    /**
     * Sets the value of the exctgBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails16 }
     *     
     */
    public void setExctgBrkr(ConfirmationPartyDetails16 value) {
        this.exctgBrkr = value;
    }

    /**
     * Gets the value of the affrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public ConfirmationPartyDetails14 getAffrmgPty() {
        return affrmgPty;
    }

    /**
     * Sets the value of the affrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails14 }
     *     
     */
    public void setAffrmgPty(ConfirmationPartyDetails14 value) {
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
