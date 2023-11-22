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

package org.jpos.iso20022.tsmt_017_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Consignment3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Consignment3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlQty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Quantity10" minOccurs="0"/>
 *         <element name="TtlVol" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Quantity10" minOccurs="0"/>
 *         <element name="TtlWght" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Quantity10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignment3", propOrder = {
    "ttlQty",
    "ttlVol",
    "ttlWght"
})
public class Consignment3 {

    @XmlElement(name = "TtlQty")
    protected Quantity10 ttlQty;
    @XmlElement(name = "TtlVol")
    protected Quantity10 ttlVol;
    @XmlElement(name = "TtlWght")
    protected Quantity10 ttlWght;

    /**
     * Gets the value of the ttlQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10 }
     *     
     */
    public Quantity10 getTtlQty() {
        return ttlQty;
    }

    /**
     * Sets the value of the ttlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10 }
     *     
     */
    public void setTtlQty(Quantity10 value) {
        this.ttlQty = value;
    }

    /**
     * Gets the value of the ttlVol property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10 }
     *     
     */
    public Quantity10 getTtlVol() {
        return ttlVol;
    }

    /**
     * Sets the value of the ttlVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10 }
     *     
     */
    public void setTtlVol(Quantity10 value) {
        this.ttlVol = value;
    }

    /**
     * Gets the value of the ttlWght property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10 }
     *     
     */
    public Quantity10 getTtlWght() {
        return ttlWght;
    }

    /**
     * Sets the value of the ttlWght property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10 }
     *     
     */
    public void setTtlWght(Quantity10 value) {
        this.ttlWght = value;
    }

}
