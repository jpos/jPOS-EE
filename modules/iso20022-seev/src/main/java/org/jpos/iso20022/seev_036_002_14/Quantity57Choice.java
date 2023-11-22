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

package org.jpos.iso20022.seev_036_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity57Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Quantity57Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="OrgnlAndCurFaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}OriginalAndCurrentQuantities7"/>
 *         <element name="SgndQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SignedQuantityFormat13"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity57Choice", propOrder = {
    "orgnlAndCurFaceAmt",
    "sgndQty"
})
public class Quantity57Choice {

    @XmlElement(name = "OrgnlAndCurFaceAmt")
    protected OriginalAndCurrentQuantities7 orgnlAndCurFaceAmt;
    @XmlElement(name = "SgndQty")
    protected SignedQuantityFormat13 sgndQty;

    /**
     * Gets the value of the orgnlAndCurFaceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAndCurrentQuantities7 }
     *     
     */
    public OriginalAndCurrentQuantities7 getOrgnlAndCurFaceAmt() {
        return orgnlAndCurFaceAmt;
    }

    /**
     * Sets the value of the orgnlAndCurFaceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAndCurrentQuantities7 }
     *     
     */
    public void setOrgnlAndCurFaceAmt(OriginalAndCurrentQuantities7 value) {
        this.orgnlAndCurFaceAmt = value;
    }

    /**
     * Gets the value of the sgndQty property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getSgndQty() {
        return sgndQty;
    }

    /**
     * Sets the value of the sgndQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setSgndQty(SignedQuantityFormat13 value) {
        this.sgndQty = value;
    }

}
