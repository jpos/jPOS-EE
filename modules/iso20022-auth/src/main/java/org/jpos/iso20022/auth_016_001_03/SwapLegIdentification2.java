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

package org.jpos.iso20022.auth_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwapLegIdentification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SwapLegIdentification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SwpIn" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}FinancialInstrumentIdentification7Choice" minOccurs="0"/>
 *         <element name="SwpOut" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}FinancialInstrumentIdentification7Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwapLegIdentification2", propOrder = {
    "swpIn",
    "swpOut"
})
public class SwapLegIdentification2 {

    @XmlElement(name = "SwpIn")
    protected FinancialInstrumentIdentification7Choice swpIn;
    @XmlElement(name = "SwpOut")
    protected FinancialInstrumentIdentification7Choice swpOut;

    /**
     * Gets the value of the swpIn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public FinancialInstrumentIdentification7Choice getSwpIn() {
        return swpIn;
    }

    /**
     * Sets the value of the swpIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public void setSwpIn(FinancialInstrumentIdentification7Choice value) {
        this.swpIn = value;
    }

    /**
     * Gets the value of the swpOut property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public FinancialInstrumentIdentification7Choice getSwpOut() {
        return swpOut;
    }

    /**
     * Sets the value of the swpOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public void setSwpOut(FinancialInstrumentIdentification7Choice value) {
        this.swpOut = value;
    }

}
