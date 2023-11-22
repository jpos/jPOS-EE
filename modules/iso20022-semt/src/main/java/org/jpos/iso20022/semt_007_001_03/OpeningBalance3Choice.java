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

package org.jpos.iso20022.semt_007_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpeningBalance3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OpeningBalance3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="FrstOpngBal" type="{urn:swift:xsd:semt.007.001.03}FinancialInstrumentQuantity1"/>
 *           <element name="IntrmyOpngBal" type="{urn:swift:xsd:semt.007.001.03}FinancialInstrumentQuantity1"/>
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
@XmlType(name = "OpeningBalance3Choice", propOrder = {
    "frstOpngBal",
    "intrmyOpngBal"
})
public class OpeningBalance3Choice {

    @XmlElement(name = "FrstOpngBal")
    protected FinancialInstrumentQuantity1 frstOpngBal;
    @XmlElement(name = "IntrmyOpngBal")
    protected FinancialInstrumentQuantity1 intrmyOpngBal;

    /**
     * Gets the value of the frstOpngBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getFrstOpngBal() {
        return frstOpngBal;
    }

    /**
     * Sets the value of the frstOpngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setFrstOpngBal(FinancialInstrumentQuantity1 value) {
        this.frstOpngBal = value;
    }

    /**
     * Gets the value of the intrmyOpngBal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getIntrmyOpngBal() {
        return intrmyOpngBal;
    }

    /**
     * Sets the value of the intrmyOpngBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setIntrmyOpngBal(FinancialInstrumentQuantity1 value) {
        this.intrmyOpngBal = value;
    }

}
