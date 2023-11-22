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

package org.jpos.iso20022.auth_029_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasketQuery1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BasketQuery1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Strr" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}LEIIdentifier" minOccurs="0"/>
 *         <element name="Idr" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}Max52Text" minOccurs="0"/>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}ISINOct2015Identifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketQuery1", propOrder = {
    "strr",
    "idr",
    "isin"
})
public class BasketQuery1 {

    @XmlElement(name = "Strr")
    protected String strr;
    @XmlElement(name = "Idr")
    protected String idr;
    @XmlElement(name = "ISIN")
    protected String isin;

    /**
     * Gets the value of the strr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrr() {
        return strr;
    }

    /**
     * Sets the value of the strr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrr(String value) {
        this.strr = value;
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

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

}
