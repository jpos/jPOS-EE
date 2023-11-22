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

package org.jpos.iso20022.camt_086_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingMethod1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingMethod1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MtdA" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingMethod1"/>
 *         <element name="MtdB" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingMethod2"/>
 *         <element name="MtdD" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingMethod3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingMethod1Choice", propOrder = {
    "mtdA",
    "mtdB",
    "mtdD"
})
public class BillingMethod1Choice {

    @XmlElement(name = "MtdA")
    protected BillingMethod1 mtdA;
    @XmlElement(name = "MtdB")
    protected BillingMethod2 mtdB;
    @XmlElement(name = "MtdD")
    protected BillingMethod3 mtdD;

    /**
     * Gets the value of the mtdA property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod1 }
     *     
     */
    public BillingMethod1 getMtdA() {
        return mtdA;
    }

    /**
     * Sets the value of the mtdA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod1 }
     *     
     */
    public void setMtdA(BillingMethod1 value) {
        this.mtdA = value;
    }

    /**
     * Gets the value of the mtdB property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod2 }
     *     
     */
    public BillingMethod2 getMtdB() {
        return mtdB;
    }

    /**
     * Sets the value of the mtdB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod2 }
     *     
     */
    public void setMtdB(BillingMethod2 value) {
        this.mtdB = value;
    }

    /**
     * Gets the value of the mtdD property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethod3 }
     *     
     */
    public BillingMethod3 getMtdD() {
        return mtdD;
    }

    /**
     * Sets the value of the mtdD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethod3 }
     *     
     */
    public void setMtdD(BillingMethod3 value) {
        this.mtdD = value;
    }

}
