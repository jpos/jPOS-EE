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

package org.jpos.iso20022.seev_033_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesOption88 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesOption88">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CondlQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}FinancialInstrumentQuantity36Choice" minOccurs="0"/>
 *         <element name="InstdQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}Quantity55Choice"/>
 *         <element name="AddtlRndUpQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}FinancialInstrumentQuantity36Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption88", propOrder = {
    "condlQty",
    "instdQty",
    "addtlRndUpQty"
})
public class SecuritiesOption88 {

    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity36Choice condlQty;
    @XmlElement(name = "InstdQty", required = true)
    protected Quantity55Choice instdQty;
    @XmlElement(name = "AddtlRndUpQty")
    protected FinancialInstrumentQuantity36Choice addtlRndUpQty;

    /**
     * Gets the value of the condlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getCondlQty() {
        return condlQty;
    }

    /**
     * Sets the value of the condlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setCondlQty(FinancialInstrumentQuantity36Choice value) {
        this.condlQty = value;
    }

    /**
     * Gets the value of the instdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity55Choice }
     *     
     */
    public Quantity55Choice getInstdQty() {
        return instdQty;
    }

    /**
     * Sets the value of the instdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity55Choice }
     *     
     */
    public void setInstdQty(Quantity55Choice value) {
        this.instdQty = value;
    }

    /**
     * Gets the value of the addtlRndUpQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getAddtlRndUpQty() {
        return addtlRndUpQty;
    }

    /**
     * Sets the value of the addtlRndUpQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setAddtlRndUpQty(FinancialInstrumentQuantity36Choice value) {
        this.addtlRndUpQty = value;
    }

}
