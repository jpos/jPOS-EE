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
 * <p>Java class for DefinedAttributes1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DefinedAttributes1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="QtyDfndAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}FinancialInstrumentAttributes89"/>
 *         <element name="ValDfndAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:auth.069.001.01}FinancialInstrumentAttributes90"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinedAttributes1Choice", propOrder = {
    "qtyDfndAttrbts",
    "valDfndAttrbts"
})
public class DefinedAttributes1Choice {

    @XmlElement(name = "QtyDfndAttrbts")
    protected FinancialInstrumentAttributes89 qtyDfndAttrbts;
    @XmlElement(name = "ValDfndAttrbts")
    protected FinancialInstrumentAttributes90 valDfndAttrbts;

    /**
     * Gets the value of the qtyDfndAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes89 }
     *     
     */
    public FinancialInstrumentAttributes89 getQtyDfndAttrbts() {
        return qtyDfndAttrbts;
    }

    /**
     * Sets the value of the qtyDfndAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes89 }
     *     
     */
    public void setQtyDfndAttrbts(FinancialInstrumentAttributes89 value) {
        this.qtyDfndAttrbts = value;
    }

    /**
     * Gets the value of the valDfndAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes90 }
     *     
     */
    public FinancialInstrumentAttributes90 getValDfndAttrbts() {
        return valDfndAttrbts;
    }

    /**
     * Sets the value of the valDfndAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes90 }
     *     
     */
    public void setValDfndAttrbts(FinancialInstrumentAttributes90 value) {
        this.valDfndAttrbts = value;
    }

}
