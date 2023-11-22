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

package org.jpos.iso20022.reda_007_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrument97 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrument97">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Eqty" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Equity3" minOccurs="0"/>
 *         <element name="Warrt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Warrant4" minOccurs="0"/>
 *         <element name="Debt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Debt5" minOccurs="0"/>
 *         <element name="Deriv" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Derivative4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument97", propOrder = {
    "eqty",
    "warrt",
    "debt",
    "deriv"
})
public class FinancialInstrument97 {

    @XmlElement(name = "Eqty")
    protected Equity3 eqty;
    @XmlElement(name = "Warrt")
    protected Warrant4 warrt;
    @XmlElement(name = "Debt")
    protected Debt5 debt;
    @XmlElement(name = "Deriv")
    protected Derivative4 deriv;

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link Equity3 }
     *     
     */
    public Equity3 getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equity3 }
     *     
     */
    public void setEqty(Equity3 value) {
        this.eqty = value;
    }

    /**
     * Gets the value of the warrt property.
     * 
     * @return
     *     possible object is
     *     {@link Warrant4 }
     *     
     */
    public Warrant4 getWarrt() {
        return warrt;
    }

    /**
     * Sets the value of the warrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warrant4 }
     *     
     */
    public void setWarrt(Warrant4 value) {
        this.warrt = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link Debt5 }
     *     
     */
    public Debt5 getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debt5 }
     *     
     */
    public void setDebt(Debt5 value) {
        this.debt = value;
    }

    /**
     * Gets the value of the deriv property.
     * 
     * @return
     *     possible object is
     *     {@link Derivative4 }
     *     
     */
    public Derivative4 getDeriv() {
        return deriv;
    }

    /**
     * Sets the value of the deriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Derivative4 }
     *     
     */
    public void setDeriv(Derivative4 value) {
        this.deriv = value;
    }

}
