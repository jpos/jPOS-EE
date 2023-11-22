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
 * <p>Java class for Incoterms4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Incoterms4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IncotrmsCd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Incoterms4Choice"/>
 *         <element name="Lctn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.012.001.05}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incoterms4", propOrder = {
    "incotrmsCd",
    "lctn"
})
public class Incoterms4 {

    @XmlElement(name = "IncotrmsCd", required = true)
    protected Incoterms4Choice incotrmsCd;
    @XmlElement(name = "Lctn")
    protected String lctn;

    /**
     * Gets the value of the incotrmsCd property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms4Choice }
     *     
     */
    public Incoterms4Choice getIncotrmsCd() {
        return incotrmsCd;
    }

    /**
     * Sets the value of the incotrmsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms4Choice }
     *     
     */
    public void setIncotrmsCd(Incoterms4Choice value) {
        this.incotrmsCd = value;
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

}
