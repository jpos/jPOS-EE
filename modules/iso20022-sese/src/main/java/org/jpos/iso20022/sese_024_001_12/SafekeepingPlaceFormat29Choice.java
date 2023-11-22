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

package org.jpos.iso20022.sese_024_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafekeepingPlaceFormat29Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SafekeepingPlaceFormat29Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}SafekeepingPlaceTypeAndText8"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}CountryCode"/>
 *         <element name="TpAndId" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}SafekeepingPlaceTypeAndIdentification1"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:sese.024.001.12}GenericIdentification78"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceFormat29Choice", propOrder = {
    "id",
    "ctry",
    "tpAndId",
    "prtry"
})
public class SafekeepingPlaceFormat29Choice {

    @XmlElement(name = "Id")
    protected SafekeepingPlaceTypeAndText8 id;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "TpAndId")
    protected SafekeepingPlaceTypeAndIdentification1 tpAndId;
    @XmlElement(name = "Prtry")
    protected GenericIdentification78 prtry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndText8 }
     *     
     */
    public SafekeepingPlaceTypeAndText8 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndText8 }
     *     
     */
    public void setId(SafekeepingPlaceTypeAndText8 value) {
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
     *     {@link GenericIdentification78 }
     *     
     */
    public GenericIdentification78 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification78 }
     *     
     */
    public void setPrtry(GenericIdentification78 value) {
        this.prtry = value;
    }

}
