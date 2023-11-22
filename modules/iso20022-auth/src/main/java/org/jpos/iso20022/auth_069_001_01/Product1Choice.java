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

package org.jpos.iso20022.auth_069_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Product1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Deriv" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}Derivative3"/>
 *         <element name="SctiesFincgTx" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}RepurchaseAgreement3"/>
 *         <element name="Scty" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}FinancialInstrument59"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product1Choice", propOrder = {
    "deriv",
    "sctiesFincgTx",
    "scty"
})
public class Product1Choice {

    @XmlElement(name = "Deriv")
    protected Derivative3 deriv;
    @XmlElement(name = "SctiesFincgTx")
    protected RepurchaseAgreement3 sctiesFincgTx;
    @XmlElement(name = "Scty")
    protected FinancialInstrument59 scty;

    /**
     * Gets the value of the deriv property.
     * 
     * @return
     *     possible object is
     *     {@link Derivative3 }
     *     
     */
    public Derivative3 getDeriv() {
        return deriv;
    }

    /**
     * Sets the value of the deriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Derivative3 }
     *     
     */
    public void setDeriv(Derivative3 value) {
        this.deriv = value;
    }

    /**
     * Gets the value of the sctiesFincgTx property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseAgreement3 }
     *     
     */
    public RepurchaseAgreement3 getSctiesFincgTx() {
        return sctiesFincgTx;
    }

    /**
     * Sets the value of the sctiesFincgTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseAgreement3 }
     *     
     */
    public void setSctiesFincgTx(RepurchaseAgreement3 value) {
        this.sctiesFincgTx = value;
    }

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument59 }
     *     
     */
    public FinancialInstrument59 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument59 }
     *     
     */
    public void setScty(FinancialInstrument59 value) {
        this.scty = value;
    }

}
