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

package org.jpos.iso20022.semt_006_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosingBalance3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClosingBalance3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="FnlClsgBal" type="{urn:swift:xsd:semt.006.001.03}FinancialInstrumentQuantity1" minOccurs="0"/>
 *           <element name="IntrmyClsgBal" type="{urn:swift:xsd:semt.006.001.03}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosingBalance3Choice", propOrder = {
    "fnlClsgBal",
    "intrmyClsgBal"
})
public class ClosingBalance3Choice {

    @XmlElement(name = "FnlClsgBal")
    protected FinancialInstrumentQuantity1 fnlClsgBal;
    @XmlElement(name = "IntrmyClsgBal")
    protected FinancialInstrumentQuantity1 intrmyClsgBal;

    /**
     * Gets the value of the fnlClsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getFnlClsgBal() {
        return fnlClsgBal;
    }

    /**
     * Sets the value of the fnlClsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setFnlClsgBal(FinancialInstrumentQuantity1 value) {
        this.fnlClsgBal = value;
    }

    /**
     * Gets the value of the intrmyClsgBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getIntrmyClsgBal() {
        return intrmyClsgBal;
    }

    /**
     * Sets the value of the intrmyClsgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setIntrmyClsgBal(FinancialInstrumentQuantity1 value) {
        this.intrmyClsgBal = value;
    }

}
