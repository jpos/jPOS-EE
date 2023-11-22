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

package org.jpos.iso20022.seev_035_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionQuantity12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionQuantity12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaseDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *         <element name="IncrmtlDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionQuantity12", propOrder = {
    "baseDnmtn",
    "incrmtlDnmtn"
})
public class CorporateActionQuantity12 {

    @XmlElement(name = "BaseDnmtn")
    protected FinancialInstrumentQuantity35Choice baseDnmtn;
    @XmlElement(name = "IncrmtlDnmtn")
    protected FinancialInstrumentQuantity35Choice incrmtlDnmtn;

    /**
     * Gets the value of the baseDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getBaseDnmtn() {
        return baseDnmtn;
    }

    /**
     * Sets the value of the baseDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public void setBaseDnmtn(FinancialInstrumentQuantity35Choice value) {
        this.baseDnmtn = value;
    }

    /**
     * Gets the value of the incrmtlDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getIncrmtlDnmtn() {
        return incrmtlDnmtn;
    }

    /**
     * Sets the value of the incrmtlDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public void setIncrmtlDnmtn(FinancialInstrumentQuantity35Choice value) {
        this.incrmtlDnmtn = value;
    }

}
