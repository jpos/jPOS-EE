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

package org.jpos.iso20022.camt_048_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentOrDefaultReservation3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrentOrDefaultReservation3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cur" type="{urn:iso:std:iso:20022:tech:xsd:camt.048.001.06}ReservationIdentification3"/>
 *         <element name="Dflt" type="{urn:iso:std:iso:20022:tech:xsd:camt.048.001.06}ReservationIdentification3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentOrDefaultReservation3Choice", propOrder = {
    "cur",
    "dflt"
})
public class CurrentOrDefaultReservation3Choice {

    @XmlElement(name = "Cur")
    protected ReservationIdentification3 cur;
    @XmlElement(name = "Dflt")
    protected ReservationIdentification3 dflt;

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentification3 }
     *     
     */
    public ReservationIdentification3 getCur() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentification3 }
     *     
     */
    public void setCur(ReservationIdentification3 value) {
        this.cur = value;
    }

    /**
     * Gets the value of the dflt property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationIdentification3 }
     *     
     */
    public ReservationIdentification3 getDflt() {
        return dflt;
    }

    /**
     * Sets the value of the dflt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationIdentification3 }
     *     
     */
    public void setDflt(ReservationIdentification3 value) {
        this.dflt = value;
    }

}
