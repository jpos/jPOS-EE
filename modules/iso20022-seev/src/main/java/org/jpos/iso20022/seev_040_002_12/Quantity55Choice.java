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

package org.jpos.iso20022.seev_040_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity55Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Quantity55Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}Quantity1Code"/>
 *         <element name="OrgnlAndCurFaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}OriginalAndCurrentQuantities4"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:seev.040.002.12}FinancialInstrumentQuantity36Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity55Choice", propOrder = {
    "cd",
    "orgnlAndCurFaceAmt",
    "qty"
})
public class Quantity55Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected Quantity1Code cd;
    @XmlElement(name = "OrgnlAndCurFaceAmt")
    protected OriginalAndCurrentQuantities4 orgnlAndCurFaceAmt;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity36Choice qty;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity1Code }
     *     
     */
    public Quantity1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity1Code }
     *     
     */
    public void setCd(Quantity1Code value) {
        this.cd = value;
    }

    /**
     * Gets the value of the orgnlAndCurFaceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAndCurrentQuantities4 }
     *     
     */
    public OriginalAndCurrentQuantities4 getOrgnlAndCurFaceAmt() {
        return orgnlAndCurFaceAmt;
    }

    /**
     * Sets the value of the orgnlAndCurFaceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAndCurrentQuantities4 }
     *     
     */
    public void setOrgnlAndCurFaceAmt(OriginalAndCurrentQuantities4 value) {
        this.orgnlAndCurFaceAmt = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity36Choice value) {
        this.qty = value;
    }

}
