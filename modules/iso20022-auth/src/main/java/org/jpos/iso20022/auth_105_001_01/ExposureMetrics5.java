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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposureMetrics5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExposureMetrics5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshCollAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}AmountAndDirection53" minOccurs="0"/>
 *         <element name="CollMktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}AmountAndDirection53" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureMetrics5", propOrder = {
    "cshCollAmt",
    "collMktVal"
})
public class ExposureMetrics5 {

    @XmlElement(name = "CshCollAmt")
    protected AmountAndDirection53 cshCollAmt;
    @XmlElement(name = "CollMktVal")
    protected AmountAndDirection53 collMktVal;

    /**
     * Gets the value of the cshCollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getCshCollAmt() {
        return cshCollAmt;
    }

    /**
     * Sets the value of the cshCollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setCshCollAmt(AmountAndDirection53 value) {
        this.cshCollAmt = value;
    }

    /**
     * Gets the value of the collMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getCollMktVal() {
        return collMktVal;
    }

    /**
     * Sets the value of the collMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setCollMktVal(AmountAndDirection53 value) {
        this.collMktVal = value;
    }

}
