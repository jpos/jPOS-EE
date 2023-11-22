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

package org.jpos.iso20022.tsmt_019_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductIdentifier2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductIdentifier2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}ProductIdentifier2Code"/>
 *         <element name="Idr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentifier2", propOrder = {
    "tp",
    "idr"
})
public class ProductIdentifier2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ProductIdentifier2Code tp;
    @XmlElement(name = "Idr", required = true)
    protected String idr;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifier2Code }
     *     
     */
    public ProductIdentifier2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifier2Code }
     *     
     */
    public void setTp(ProductIdentifier2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdr(String value) {
        this.idr = value;
    }

}
