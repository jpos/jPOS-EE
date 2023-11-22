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

package org.jpos.iso20022.catm_007_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicRSAKey2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PublicRSAKey2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}Algorithm7Code" minOccurs="0"/>
 *         <element name="PblcKeyVal" type="{urn:iso:std:iso:20022:tech:xsd:catm.007.001.06}PublicRSAKey1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicRSAKey2", propOrder = {
    "algo",
    "pblcKeyVal"
})
public class PublicRSAKey2 {

    @XmlElement(name = "Algo")
    @XmlSchemaType(name = "string")
    protected Algorithm7Code algo;
    @XmlElement(name = "PblcKeyVal", required = true)
    protected PublicRSAKey1 pblcKeyVal;

    /**
     * Gets the value of the algo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm7Code }
     *     
     */
    public Algorithm7Code getAlgo() {
        return algo;
    }

    /**
     * Sets the value of the algo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm7Code }
     *     
     */
    public void setAlgo(Algorithm7Code value) {
        this.algo = value;
    }

    /**
     * Gets the value of the pblcKeyVal property.
     * 
     * @return
     *     possible object is
     *     {@link PublicRSAKey1 }
     *     
     */
    public PublicRSAKey1 getPblcKeyVal() {
        return pblcKeyVal;
    }

    /**
     * Sets the value of the pblcKeyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicRSAKey1 }
     *     
     */
    public void setPblcKeyVal(PublicRSAKey1 value) {
        this.pblcKeyVal = value;
    }

}
