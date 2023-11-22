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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCategory1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductCategory1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="StrdPdctCtgy" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}ProductCategory1"/>
 *         <element name="OthrPdctCtgy" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}GenericIdentification4"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCategory1Choice", propOrder = {
    "strdPdctCtgy",
    "othrPdctCtgy"
})
public class ProductCategory1Choice {

    @XmlElement(name = "StrdPdctCtgy")
    protected ProductCategory1 strdPdctCtgy;
    @XmlElement(name = "OthrPdctCtgy")
    protected GenericIdentification4 othrPdctCtgy;

    /**
     * Gets the value of the strdPdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategory1 }
     *     
     */
    public ProductCategory1 getStrdPdctCtgy() {
        return strdPdctCtgy;
    }

    /**
     * Sets the value of the strdPdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategory1 }
     *     
     */
    public void setStrdPdctCtgy(ProductCategory1 value) {
        this.strdPdctCtgy = value;
    }

    /**
     * Gets the value of the othrPdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification4 }
     *     
     */
    public GenericIdentification4 getOthrPdctCtgy() {
        return othrPdctCtgy;
    }

    /**
     * Sets the value of the othrPdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification4 }
     *     
     */
    public void setOthrPdctCtgy(GenericIdentification4 value) {
        this.othrPdctCtgy = value;
    }

}
