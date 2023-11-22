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

package org.jpos.iso20022.caaa_015_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptorRejectionV06 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptorRejectionV06">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.015.001.06}Header57"/>
 *         <element name="Rjct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.015.001.06}AcceptorRejection2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorRejectionV06", propOrder = {
    "hdr",
    "rjct"
})
public class AcceptorRejectionV06 {

    @XmlElement(name = "Hdr", required = true)
    protected Header57 hdr;
    @XmlElement(name = "Rjct", required = true)
    protected AcceptorRejection2 rjct;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header57 }
     *     
     */
    public Header57 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header57 }
     *     
     */
    public void setHdr(Header57 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the rjct property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorRejection2 }
     *     
     */
    public AcceptorRejection2 getRjct() {
        return rjct;
    }

    /**
     * Sets the value of the rjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorRejection2 }
     *     
     */
    public void setRjct(AcceptorRejection2 value) {
        this.rjct = value;
    }

}
