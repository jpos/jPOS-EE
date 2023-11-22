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

package org.jpos.iso20022.camt_045_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyDesignation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyDesignation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CcyDsgnt" type="{urn:swift:xsd:camt.045.001.03}CurrencyDesignation1Code" minOccurs="0"/>
 *         <element name="Lctn" type="{urn:swift:xsd:camt.045.001.03}CountryCode" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:swift:xsd:camt.045.001.03}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyDesignation1", propOrder = {
    "ccyDsgnt",
    "lctn",
    "addtlInf"
})
public class CurrencyDesignation1 {

    @XmlElement(name = "CcyDsgnt")
    @XmlSchemaType(name = "string")
    protected CurrencyDesignation1Code ccyDsgnt;
    @XmlElement(name = "Lctn")
    protected String lctn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the ccyDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDesignation1Code }
     *     
     */
    public CurrencyDesignation1Code getCcyDsgnt() {
        return ccyDsgnt;
    }

    /**
     * Sets the value of the ccyDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDesignation1Code }
     *     
     */
    public void setCcyDsgnt(CurrencyDesignation1Code value) {
        this.ccyDsgnt = value;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctn(String value) {
        this.lctn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
