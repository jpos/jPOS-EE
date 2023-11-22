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

package org.jpos.iso20022.seev_039_002_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingPlaceFormat32Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SafekeepingPlaceFormat32Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}SafekeepingPlaceTypeAndText9"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}CountryCode"/>
 *         <element name="TpAndId" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}SafekeepingPlaceTypeAndIdentification1"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}GenericIdentification85"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceFormat32Choice", propOrder = {
    "id",
    "ctry",
    "tpAndId",
    "prtry"
})
public class SafekeepingPlaceFormat32Choice {

    @XmlElement(name = "Id")
    protected SafekeepingPlaceTypeAndText9 id;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "TpAndId")
    protected SafekeepingPlaceTypeAndIdentification1 tpAndId;
    @XmlElement(name = "Prtry")
    protected GenericIdentification85 prtry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndText9 }
     *     
     */
    public SafekeepingPlaceTypeAndText9 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndText9 }
     *     
     */
    public void setId(SafekeepingPlaceTypeAndText9 value) {
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
     *     {@link SafekeepingPlaceTypeAndIdentification1 }
     *     
     */
    public SafekeepingPlaceTypeAndIdentification1 getTpAndId() {
        return tpAndId;
    }

    /**
     * Sets the value of the tpAndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndIdentification1 }
     *     
     */
    public void setTpAndId(SafekeepingPlaceTypeAndIdentification1 value) {
        this.tpAndId = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification85 }
     *     
     */
    public GenericIdentification85 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification85 }
     *     
     */
    public void setPrtry(GenericIdentification85 value) {
        this.prtry = value;
    }

}
