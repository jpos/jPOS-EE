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

package org.jpos.iso20022.secl_002_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingPlaceFormat7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SafekeepingPlaceFormat7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}SafekeepingPlaceTypeAndText1"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}CountryCode"/>
 *         <element name="TpAndId" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}SafekeepingPlaceTypeAndAnyBICIdentifier1"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:secl.002.001.03}GenericIdentification58"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceFormat7Choice", propOrder = {
    "id",
    "ctry",
    "tpAndId",
    "prtry"
})
public class SafekeepingPlaceFormat7Choice {

    @XmlElement(name = "Id")
    protected SafekeepingPlaceTypeAndText1 id;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "TpAndId")
    protected SafekeepingPlaceTypeAndAnyBICIdentifier1 tpAndId;
    @XmlElement(name = "Prtry")
    protected GenericIdentification58 prtry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndText1 }
     *     
     */
    public SafekeepingPlaceTypeAndText1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndText1 }
     *     
     */
    public void setId(SafekeepingPlaceTypeAndText1 value) {
        this.id = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the tpAndId property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     *     
     */
    public SafekeepingPlaceTypeAndAnyBICIdentifier1 getTpAndId() {
        return tpAndId;
    }

    /**
     * Sets the value of the tpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     *     
     */
    public void setTpAndId(SafekeepingPlaceTypeAndAnyBICIdentifier1 value) {
        this.tpAndId = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification58 }
     *     
     */
    public GenericIdentification58 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification58 }
     *     
     */
    public void setPrtry(GenericIdentification58 value) {
        this.prtry = value;
    }

}
