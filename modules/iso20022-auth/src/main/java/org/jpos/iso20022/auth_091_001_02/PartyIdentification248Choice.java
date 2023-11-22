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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification248Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification248Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Lgl" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}LegalPersonIdentification1"/>
 *         <element name="Ntrl" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}NaturalPersonIdentification3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification248Choice", propOrder = {
    "lgl",
    "ntrl"
})
public class PartyIdentification248Choice {

    @XmlElement(name = "Lgl")
    protected LegalPersonIdentification1 lgl;
    @XmlElement(name = "Ntrl")
    protected NaturalPersonIdentification3 ntrl;

    /**
     * Gets the value of the lgl property.
     * 
     * @return
     *     possible object is
     *     {@link LegalPersonIdentification1 }
     *     
     */
    public LegalPersonIdentification1 getLgl() {
        return lgl;
    }

    /**
     * Sets the value of the lgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalPersonIdentification1 }
     *     
     */
    public void setLgl(LegalPersonIdentification1 value) {
        this.lgl = value;
    }

    /**
     * Gets the value of the ntrl property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalPersonIdentification3 }
     *     
     */
    public NaturalPersonIdentification3 getNtrl() {
        return ntrl;
    }

    /**
     * Sets the value of the ntrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalPersonIdentification3 }
     *     
     */
    public void setNtrl(NaturalPersonIdentification3 value) {
        this.ntrl = value;
    }

}
