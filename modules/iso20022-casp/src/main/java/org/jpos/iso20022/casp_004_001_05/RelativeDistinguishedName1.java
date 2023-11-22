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

package org.jpos.iso20022.casp_004_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativeDistinguishedName1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RelativeDistinguishedName1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AttrTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.004.001.05}AttributeType1Code"/>
 *         <element name="AttrVal" type="{urn:iso:std:iso:20022:tech:xsd:casp.004.001.05}Max140Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeDistinguishedName1", propOrder = {
    "attrTp",
    "attrVal"
})
public class RelativeDistinguishedName1 {

    @XmlElement(name = "AttrTp", required = true)
    @XmlSchemaType(name = "string")
    protected AttributeType1Code attrTp;
    @XmlElement(name = "AttrVal", required = true)
    protected String attrVal;

    /**
     * Gets the value of the attrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType1Code }
     *     
     */
    public AttributeType1Code getAttrTp() {
        return attrTp;
    }

    /**
     * Sets the value of the attrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType1Code }
     *     
     */
    public void setAttrTp(AttributeType1Code value) {
        this.attrTp = value;
    }

    /**
     * Gets the value of the attrVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrVal() {
        return attrVal;
    }

    /**
     * Sets the value of the attrVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrVal(String value) {
        this.attrVal = value;
    }

}
