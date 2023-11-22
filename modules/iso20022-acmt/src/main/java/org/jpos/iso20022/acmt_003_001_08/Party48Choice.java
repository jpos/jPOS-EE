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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Party48Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Party48Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Org" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Organisation40"/>
 *         <element name="IndvPrsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}IndividualPerson38"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party48Choice", propOrder = {
    "org",
    "indvPrsn"
})
public class Party48Choice {

    @XmlElement(name = "Org")
    protected Organisation40 org;
    @XmlElement(name = "IndvPrsn")
    protected IndividualPerson38 indvPrsn;

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation40 }
     *     
     */
    public Organisation40 getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation40 }
     *     
     */
    public void setOrg(Organisation40 value) {
        this.org = value;
    }

    /**
     * Gets the value of the indvPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson38 }
     *     
     */
    public IndividualPerson38 getIndvPrsn() {
        return indvPrsn;
    }

    /**
     * Sets the value of the indvPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson38 }
     *     
     */
    public void setIndvPrsn(IndividualPerson38 value) {
        this.indvPrsn = value;
    }

}
