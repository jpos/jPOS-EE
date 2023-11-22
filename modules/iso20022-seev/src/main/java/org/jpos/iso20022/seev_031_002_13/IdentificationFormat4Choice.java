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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationFormat4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IdentificationFormat4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ShrtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Exact3UpperCaseAlphaNumericText"/>
 *         <element name="LngId" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RestrictedFINXMax30Text"/>
 *         <element name="PrtryId" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}GenericIdentification86"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationFormat4Choice", propOrder = {
    "shrtId",
    "lngId",
    "prtryId"
})
public class IdentificationFormat4Choice {

    @XmlElement(name = "ShrtId")
    protected String shrtId;
    @XmlElement(name = "LngId")
    protected String lngId;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification86 prtryId;

    /**
     * Gets the value of the shrtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtId() {
        return shrtId;
    }

    /**
     * Sets the value of the shrtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtId(String value) {
        this.shrtId = value;
    }

    /**
     * Gets the value of the lngId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngId() {
        return lngId;
    }

    /**
     * Sets the value of the lngId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLngId(String value) {
        this.lngId = value;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification86 }
     *     
     */
    public GenericIdentification86 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification86 }
     *     
     */
    public void setPrtryId(GenericIdentification86 value) {
        this.prtryId = value;
    }

}
