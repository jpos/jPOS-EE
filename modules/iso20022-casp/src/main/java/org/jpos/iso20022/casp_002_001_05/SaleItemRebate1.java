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

package org.jpos.iso20022.casp_002_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleItemRebate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SaleItemRebate1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleItm" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Product6"/>
 *         <element name="RbtLabl" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleItemRebate1", propOrder = {
    "saleItm",
    "rbtLabl"
})
public class SaleItemRebate1 {

    @XmlElement(name = "SaleItm", required = true)
    protected Product6 saleItm;
    @XmlElement(name = "RbtLabl")
    protected String rbtLabl;

    /**
     * Gets the value of the saleItm property.
     * 
     * @return
     *     possible object is
     *     {@link Product6 }
     *     
     */
    public Product6 getSaleItm() {
        return saleItm;
    }

    /**
     * Sets the value of the saleItm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product6 }
     *     
     */
    public void setSaleItm(Product6 value) {
        this.saleItm = value;
    }

    /**
     * Gets the value of the rbtLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbtLabl() {
        return rbtLabl;
    }

    /**
     * Sets the value of the rbtLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRbtLabl(String value) {
        this.rbtLabl = value;
    }

}
