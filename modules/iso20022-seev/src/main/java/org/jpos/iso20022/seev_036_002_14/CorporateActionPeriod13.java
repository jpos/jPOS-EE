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

package org.jpos.iso20022.seev_036_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPeriod13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPeriod13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PricClctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Period11" minOccurs="0"/>
 *         <element name="ActnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Period11" minOccurs="0"/>
 *         <element name="ParllTradgPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Period11" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod13", propOrder = {
    "pricClctnPrd",
    "actnPrd",
    "parllTradgPrd"
})
public class CorporateActionPeriod13 {

    @XmlElement(name = "PricClctnPrd")
    protected Period11 pricClctnPrd;
    @XmlElement(name = "ActnPrd")
    protected Period11 actnPrd;
    @XmlElement(name = "ParllTradgPrd")
    protected Period11 parllTradgPrd;

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period11 }
     *     
     */
    public Period11 getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11 }
     *     
     */
    public void setPricClctnPrd(Period11 value) {
        this.pricClctnPrd = value;
    }

    /**
     * Gets the value of the actnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period11 }
     *     
     */
    public Period11 getActnPrd() {
        return actnPrd;
    }

    /**
     * Sets the value of the actnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11 }
     *     
     */
    public void setActnPrd(Period11 value) {
        this.actnPrd = value;
    }

    /**
     * Gets the value of the parllTradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period11 }
     *     
     */
    public Period11 getParllTradgPrd() {
        return parllTradgPrd;
    }

    /**
     * Sets the value of the parllTradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11 }
     *     
     */
    public void setParllTradgPrd(Period11 value) {
        this.parllTradgPrd = value;
    }

}
