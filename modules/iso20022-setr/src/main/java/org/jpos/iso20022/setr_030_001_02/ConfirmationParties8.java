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

package org.jpos.iso20022.setr_030_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationParties8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConfirmationParties8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AffrmgPty" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}ConfirmationPartyDetails15"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="Brrwr" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="Lndr" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}ConfirmationPartyDetails12" minOccurs="0"/>
 *         <element name="TradBnfcryPty" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}ConfirmationPartyDetails14" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationParties8", propOrder = {
    "affrmgPty",
    "buyr",
    "brrwr",
    "sellr",
    "lndr",
    "tradBnfcryPty"
})
public class ConfirmationParties8 {

    @XmlElement(name = "AffrmgPty", required = true)
    protected ConfirmationPartyDetails15 affrmgPty;
    @XmlElement(name = "Buyr")
    protected ConfirmationPartyDetails12 buyr;
    @XmlElement(name = "Brrwr")
    protected ConfirmationPartyDetails12 brrwr;
    @XmlElement(name = "Sellr")
    protected ConfirmationPartyDetails12 sellr;
    @XmlElement(name = "Lndr")
    protected ConfirmationPartyDetails12 lndr;
    @XmlElement(name = "TradBnfcryPty")
    protected ConfirmationPartyDetails14 tradBnfcryPty;

    /**
     * Gets the value of the affrmgPty property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationPartyDetails15 }
     *     
     */
    public ConfirmationPartyDetails15 getAffrmgPty() {
        return affrmgPty;
    }

    /**
     * Sets the value of the affrmgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationPartyDetails15 }
     *     
     */
    public void setAffrmgPty(ConfirmationPartyDetails15 value) {
        this.affrmgPty = value;
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
