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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Direction2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Direction2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DrctnOfTheFrstLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}OptionParty3Code"/>
 *         <element name="DrctnOfTheScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}OptionParty3Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direction2", propOrder = {
    "drctnOfTheFrstLeg",
    "drctnOfTheScndLeg"
})
public class Direction2 {

    @XmlElement(name = "DrctnOfTheFrstLeg", required = true)
    @XmlSchemaType(name = "string")
    protected OptionParty3Code drctnOfTheFrstLeg;
    @XmlElement(name = "DrctnOfTheScndLeg")
    @XmlSchemaType(name = "string")
    protected OptionParty3Code drctnOfTheScndLeg;

    /**
     * Gets the value of the drctnOfTheFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty3Code }
     *     
     */
    public OptionParty3Code getDrctnOfTheFrstLeg() {
        return drctnOfTheFrstLeg;
    }

    /**
     * Sets the value of the drctnOfTheFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty3Code }
     *     
     */
    public void setDrctnOfTheFrstLeg(OptionParty3Code value) {
        this.drctnOfTheFrstLeg = value;
    }

    /**
     * Gets the value of the drctnOfTheScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty3Code }
     *     
     */
    public OptionParty3Code getDrctnOfTheScndLeg() {
        return drctnOfTheScndLeg;
    }

    /**
     * Sets the value of the drctnOfTheScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty3Code }
     *     
     */
    public void setDrctnOfTheScndLeg(OptionParty3Code value) {
        this.drctnOfTheScndLeg = value;
    }

}
