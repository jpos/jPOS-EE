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

package org.jpos.iso20022.seev_001_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPerson43 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualPerson43">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrssgndPrxy" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PartyIdentification232Choice" minOccurs="0"/>
 *         <element name="EmplngPty" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PartyIdentification129Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPerson43", propOrder = {
    "prssgndPrxy",
    "emplngPty"
})
public class IndividualPerson43 {

    @XmlElement(name = "PrssgndPrxy")
    protected PartyIdentification232Choice prssgndPrxy;
    @XmlElement(name = "EmplngPty")
    protected PartyIdentification129Choice emplngPty;

    /**
     * Gets the value of the prssgndPrxy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getPrssgndPrxy() {
        return prssgndPrxy;
    }

    /**
     * Sets the value of the prssgndPrxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public void setPrssgndPrxy(PartyIdentification232Choice value) {
        this.prssgndPrxy = value;
    }

    /**
     * Gets the value of the emplngPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public PartyIdentification129Choice getEmplngPty() {
        return emplngPty;
    }

    /**
     * Sets the value of the emplngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification129Choice }
     *     
     */
    public void setEmplngPty(PartyIdentification129Choice value) {
        this.emplngPty = value;
    }

}
