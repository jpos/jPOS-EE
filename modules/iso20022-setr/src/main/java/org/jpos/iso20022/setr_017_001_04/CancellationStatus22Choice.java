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

package org.jpos.iso20022.setr_017_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationStatus22Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CancellationStatus22Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}OrderCancellationStatus2Code"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:setr.017.001.04}RejectedStatus10"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatus22Choice", propOrder = {
    "sts",
    "rjctd"
})
public class CancellationStatus22Choice {

    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderCancellationStatus2Code sts;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus10 rjctd;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCancellationStatus2Code }
     *     
     */
    public OrderCancellationStatus2Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCancellationStatus2Code }
     *     
     */
    public void setSts(OrderCancellationStatus2Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus10 }
     *     
     */
    public RejectedStatus10 getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus10 }
     *     
     */
    public void setRjctd(RejectedStatus10 value) {
        this.rjctd = value;
    }

}
