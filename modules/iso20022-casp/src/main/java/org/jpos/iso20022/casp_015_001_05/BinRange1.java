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

package org.jpos.iso20022.casp_015_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinRange1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BinRange1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LwrBin" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}Max15NumericText"/>
 *         <element name="HghrBin" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}Max15NumericText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinRange1", propOrder = {
    "lwrBin",
    "hghrBin"
})
public class BinRange1 {

    @XmlElement(name = "LwrBin", required = true)
    protected String lwrBin;
    @XmlElement(name = "HghrBin", required = true)
    protected String hghrBin;

    /**
     * Gets the value of the lwrBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLwrBin() {
        return lwrBin;
    }

    /**
     * Sets the value of the lwrBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLwrBin(String value) {
        this.lwrBin = value;
    }

    /**
     * Gets the value of the hghrBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHghrBin() {
        return hghrBin;
    }

    /**
     * Sets the value of the hghrBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHghrBin(String value) {
        this.hghrBin = value;
    }

}
