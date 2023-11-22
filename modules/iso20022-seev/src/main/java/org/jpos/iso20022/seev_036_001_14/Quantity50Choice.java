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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity50Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Quantity50Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="OrgnlAndCurFaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}OriginalAndCurrentQuantities6"/>
 *         <element name="SgndQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}SignedQuantityFormat10"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity50Choice", propOrder = {
    "orgnlAndCurFaceAmt",
    "sgndQty"
})
public class Quantity50Choice {

    @XmlElement(name = "OrgnlAndCurFaceAmt")
    protected OriginalAndCurrentQuantities6 orgnlAndCurFaceAmt;
    @XmlElement(name = "SgndQty")
    protected SignedQuantityFormat10 sgndQty;

    /**
     * Gets the value of the orgnlAndCurFaceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAndCurrentQuantities6 }
     *     
     */
    public OriginalAndCurrentQuantities6 getOrgnlAndCurFaceAmt() {
        return orgnlAndCurFaceAmt;
    }

    /**
     * Sets the value of the orgnlAndCurFaceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAndCurrentQuantities6 }
     *     
     */
    public void setOrgnlAndCurFaceAmt(OriginalAndCurrentQuantities6 value) {
        this.orgnlAndCurFaceAmt = value;
    }

    /**
     * Gets the value of the sgndQty property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getSgndQty() {
        return sgndQty;
    }

    /**
     * Sets the value of the sgndQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setSgndQty(SignedQuantityFormat10 value) {
        this.sgndQty = value;
    }

}
