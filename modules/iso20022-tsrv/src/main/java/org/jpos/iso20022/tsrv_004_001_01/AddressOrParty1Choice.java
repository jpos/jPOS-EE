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

package org.jpos.iso20022.tsrv_004_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressOrParty1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AddressOrParty1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NewAdr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}PostalAddress6"/>
 *         <element name="NewBnfcry" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}NameAndAddress10"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressOrParty1Choice", propOrder = {
    "newAdr",
    "newBnfcry"
})
public class AddressOrParty1Choice {

    @XmlElement(name = "NewAdr")
    protected PostalAddress6 newAdr;
    @XmlElement(name = "NewBnfcry")
    protected NameAndAddress10 newBnfcry;

    /**
     * Gets the value of the newAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getNewAdr() {
        return newAdr;
    }

    /**
     * Sets the value of the newAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setNewAdr(PostalAddress6 value) {
        this.newAdr = value;
    }

    /**
     * Gets the value of the newBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress10 }
     *     
     */
    public NameAndAddress10 getNewBnfcry() {
        return newBnfcry;
    }

    /**
     * Sets the value of the newBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress10 }
     *     
     */
    public void setNewBnfcry(NameAndAddress10 value) {
        this.newBnfcry = value;
    }

}
