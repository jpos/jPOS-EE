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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionAmounts60 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionAmounts60">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WhldgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ScndLvlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAmounts60", propOrder = {
    "whldgTaxAmt",
    "scndLvlTaxAmt"
})
public class CorporateActionAmounts60 {

    @XmlElement(name = "WhldgTaxAmt")
    protected ActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "ScndLvlTaxAmt")
    protected ActiveCurrencyAndAmount scndLvlTaxAmt;

    /**
     * Gets the value of the whldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgTaxAmt() {
        return whldgTaxAmt;
    }

    /**
     * Sets the value of the whldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setWhldgTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
    }

    /**
     * Gets the value of the scndLvlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getScndLvlTaxAmt() {
        return scndLvlTaxAmt;
    }

    /**
     * Sets the value of the scndLvlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setScndLvlTaxAmt(ActiveCurrencyAndAmount value) {
        this.scndLvlTaxAmt = value;
    }

}
