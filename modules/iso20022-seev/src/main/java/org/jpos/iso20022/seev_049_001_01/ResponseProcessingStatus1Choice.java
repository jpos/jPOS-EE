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

package org.jpos.iso20022.seev_049_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseProcessingStatus1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponseProcessingStatus1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:seev.049.001.01}AcceptedStatus1"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.049.001.01}RejectedStatus29Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseProcessingStatus1Choice", propOrder = {
    "accptd",
    "rjctd"
})
public class ResponseProcessingStatus1Choice {

    @XmlElement(name = "Accptd")
    protected AcceptedStatus1 accptd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus29Choice rjctd;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus1 }
     *     
     */
    public AcceptedStatus1 getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus1 }
     *     
     */
    public void setAccptd(AcceptedStatus1 value) {
        this.accptd = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus29Choice }
     *     
     */
    public RejectedStatus29Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus29Choice }
     *     
     */
    public void setRjctd(RejectedStatus29Choice value) {
        this.rjctd = value;
    }

}
