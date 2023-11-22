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

package org.jpos.iso20022.auth_067_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetHolding1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetHolding1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Gold" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="Trpty" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="Csh" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="Scty" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}SecurityIdentificationAndAmount1"/>
 *         <element name="Grnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}Guarantee1"/>
 *         <element name="Cmmdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}Commodity2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetHolding1Choice", propOrder = {
    "gold",
    "trpty",
    "csh",
    "scty",
    "grnt",
    "cmmdty"
})
public class AssetHolding1Choice {

    @XmlElement(name = "Gold")
    protected ActiveCurrencyAndAmount gold;
    @XmlElement(name = "Trpty")
    protected ActiveCurrencyAndAmount trpty;
    @XmlElement(name = "Csh")
    protected ActiveCurrencyAndAmount csh;
    @XmlElement(name = "Scty")
    protected SecurityIdentificationAndAmount1 scty;
    @XmlElement(name = "Grnt")
    protected Guarantee1 grnt;
    @XmlElement(name = "Cmmdty")
    protected Commodity2 cmmdty;

    /**
     * Gets the value of the gold property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGold() {
        return gold;
    }

    /**
     * Sets the value of the gold property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGold(ActiveCurrencyAndAmount value) {
        this.gold = value;
    }

    /**
     * Gets the value of the trpty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTrpty() {
        return trpty;
    }

    /**
     * Sets the value of the trpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTrpty(ActiveCurrencyAndAmount value) {
        this.trpty = value;
    }

    /**
     * Gets the value of the csh property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCsh() {
        return csh;
    }

    /**
     * Sets the value of the csh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCsh(ActiveCurrencyAndAmount value) {
        this.csh = value;
    }

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentificationAndAmount1 }
     *     
     */
    public SecurityIdentificationAndAmount1 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentificationAndAmount1 }
     *     
     */
    public void setScty(SecurityIdentificationAndAmount1 value) {
        this.scty = value;
    }

    /**
     * Gets the value of the grnt property.
     * 
     * @return
     *     possible object is
     *     {@link Guarantee1 }
     *     
     */
    public Guarantee1 getGrnt() {
        return grnt;
    }

    /**
     * Sets the value of the grnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guarantee1 }
     *     
     */
    public void setGrnt(Guarantee1 value) {
        this.grnt = value;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link Commodity2 }
     *     
     */
    public Commodity2 getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commodity2 }
     *     
     */
    public void setCmmdty(Commodity2 value) {
        this.cmmdty = value;
    }

}
