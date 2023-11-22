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

package org.jpos.iso20022.semt_019_002_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceType5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceType5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Mkt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}Price3"/>
 *         <element name="Indctv" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}Price3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType5Choice", propOrder = {
    "mkt",
    "indctv"
})
public class PriceType5Choice {

    @XmlElement(name = "Mkt")
    protected Price3 mkt;
    @XmlElement(name = "Indctv")
    protected Price3 indctv;

    /**
     * Gets the value of the mkt property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getMkt() {
        return mkt;
    }

    /**
     * Sets the value of the mkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public void setMkt(Price3 value) {
        this.mkt = value;
    }

    /**
     * Gets the value of the indctv property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getIndctv() {
        return indctv;
    }

    /**
     * Sets the value of the indctv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public void setIndctv(Price3 value) {
        this.indctv = value;
    }

}
