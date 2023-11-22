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

package org.jpos.iso20022.caaa_024_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchAnd1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SearchAnd1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Trgt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.024.001.03}Max500Text"/>
 *         <element name="Oprtr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.024.001.03}Operator1Code"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:caaa.024.001.03}Max500Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAnd1", propOrder = {
    "trgt",
    "oprtr",
    "val"
})
public class SearchAnd1 {

    @XmlElement(name = "Trgt", required = true)
    protected String trgt;
    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operator1Code oprtr;
    @XmlElement(name = "Val", required = true)
    protected String val;

    /**
     * Gets the value of the trgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgt() {
        return trgt;
    }

    /**
     * Sets the value of the trgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgt(String value) {
        this.trgt = value;
    }

    /**
     * Gets the value of the oprtr property.
     * 
     * @return
     *     possible object is
     *     {@link Operator1Code }
     *     
     */
    public Operator1Code getOprtr() {
        return oprtr;
    }

    /**
     * Sets the value of the oprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator1Code }
     *     
     */
    public void setOprtr(Operator1Code value) {
        this.oprtr = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal(String value) {
        this.val = value;
    }

}
