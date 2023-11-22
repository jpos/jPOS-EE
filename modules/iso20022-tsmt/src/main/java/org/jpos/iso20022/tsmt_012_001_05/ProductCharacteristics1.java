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

package org.jpos.iso20022.tsmt_012_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCharacteristics1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductCharacteristics1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}ProductCharacteristics1Code"/>
 *         <element name="Chrtcs" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCharacteristics1", propOrder = {
    "tp",
    "chrtcs"
})
public class ProductCharacteristics1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ProductCharacteristics1Code tp;
    @XmlElement(name = "Chrtcs", required = true)
    protected String chrtcs;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCharacteristics1Code }
     *     
     */
    public ProductCharacteristics1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCharacteristics1Code }
     *     
     */
    public void setTp(ProductCharacteristics1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the chrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrtcs() {
        return chrtcs;
    }

    /**
     * Sets the value of the chrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrtcs(String value) {
        this.chrtcs = value;
    }

}
