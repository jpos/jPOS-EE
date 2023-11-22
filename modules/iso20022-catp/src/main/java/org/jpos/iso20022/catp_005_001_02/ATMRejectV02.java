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

package org.jpos.iso20022.catp_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMRejectV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMRejectV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:catp.005.001.02}Header33"/>
 *         <element name="ATMRjct" type="{urn:iso:std:iso:20022:tech:xsd:catp.005.001.02}ATMReject2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMRejectV02", propOrder = {
    "hdr",
    "atmRjct"
})
public class ATMRejectV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header33 hdr;
    @XmlElement(name = "ATMRjct", required = true)
    protected ATMReject2 atmRjct;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header33 }
     *     
     */
    public Header33 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header33 }
     *     
     */
    public void setHdr(Header33 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the atmRjct property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReject2 }
     *     
     */
    public ATMReject2 getATMRjct() {
        return atmRjct;
    }

    /**
     * Sets the value of the atmRjct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReject2 }
     *     
     */
    public void setATMRjct(ATMReject2 value) {
        this.atmRjct = value;
    }

}
