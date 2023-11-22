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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignedQuantityFormat12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SignedQuantityFormat12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ShrtLngPos" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}ShortLong1Code"/>
 *         <element name="QtyChc" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Quantity53Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedQuantityFormat12", propOrder = {
    "shrtLngPos",
    "qtyChc"
})
public class SignedQuantityFormat12 {

    @XmlElement(name = "ShrtLngPos", required = true)
    @XmlSchemaType(name = "string")
    protected ShortLong1Code shrtLngPos;
    @XmlElement(name = "QtyChc", required = true)
    protected Quantity53Choice qtyChc;

    /**
     * Gets the value of the shrtLngPos property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLong1Code }
     *     
     */
    public ShortLong1Code getShrtLngPos() {
        return shrtLngPos;
    }

    /**
     * Sets the value of the shrtLngPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLong1Code }
     *     
     */
    public void setShrtLngPos(ShortLong1Code value) {
        this.shrtLngPos = value;
    }

    /**
     * Gets the value of the qtyChc property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity53Choice }
     *     
     */
    public Quantity53Choice getQtyChc() {
        return qtyChc;
    }

    /**
     * Sets the value of the qtyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity53Choice }
     *     
     */
    public void setQtyChc(Quantity53Choice value) {
        this.qtyChc = value;
    }

}
