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

package org.jpos.iso20022.tsmt_011_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductIdentifier2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductIdentifier2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="StrdPdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}ProductIdentifier2"/>
 *         <element name="OthrPdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}GenericIdentification4"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentifier2Choice", propOrder = {
    "strdPdctIdr",
    "othrPdctIdr"
})
public class ProductIdentifier2Choice {

    @XmlElement(name = "StrdPdctIdr")
    protected ProductIdentifier2 strdPdctIdr;
    @XmlElement(name = "OthrPdctIdr")
    protected GenericIdentification4 othrPdctIdr;

    /**
     * Gets the value of the strdPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifier2 }
     *     
     */
    public ProductIdentifier2 getStrdPdctIdr() {
        return strdPdctIdr;
    }

    /**
     * Sets the value of the strdPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifier2 }
     *     
     */
    public void setStrdPdctIdr(ProductIdentifier2 value) {
        this.strdPdctIdr = value;
    }

    /**
     * Gets the value of the othrPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification4 }
     *     
     */
    public GenericIdentification4 getOthrPdctIdr() {
        return othrPdctIdr;
    }

    /**
     * Sets the value of the othrPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification4 }
     *     
     */
    public void setOthrPdctIdr(GenericIdentification4 value) {
        this.othrPdctIdr = value;
    }

}
