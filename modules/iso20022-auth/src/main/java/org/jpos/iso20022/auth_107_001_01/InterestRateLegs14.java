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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestRateLegs14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestRateLegs14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrstLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}InterestRate33Choice" minOccurs="0"/>
 *         <element name="ScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}InterestRate33Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateLegs14", propOrder = {
    "frstLeg",
    "scndLeg"
})
public class InterestRateLegs14 {

    @XmlElement(name = "FrstLeg")
    protected InterestRate33Choice frstLeg;
    @XmlElement(name = "ScndLeg")
    protected InterestRate33Choice scndLeg;

    /**
     * Gets the value of the frstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate33Choice }
     *     
     */
    public InterestRate33Choice getFrstLeg() {
        return frstLeg;
    }

    /**
     * Sets the value of the frstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate33Choice }
     *     
     */
    public void setFrstLeg(InterestRate33Choice value) {
        this.frstLeg = value;
    }

    /**
     * Gets the value of the scndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate33Choice }
     *     
     */
    public InterestRate33Choice getScndLeg() {
        return scndLeg;
    }

    /**
     * Sets the value of the scndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate33Choice }
     *     
     */
    public void setScndLeg(InterestRate33Choice value) {
        this.scndLeg = value;
    }

}
