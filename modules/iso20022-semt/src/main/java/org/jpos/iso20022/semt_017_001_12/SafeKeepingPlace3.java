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

package org.jpos.iso20022.semt_017_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafeKeepingPlace3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SafeKeepingPlace3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SfkpgPlcFrmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}SafekeepingPlaceFormat29Choice" minOccurs="0"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:semt.017.001.12}LEIIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeKeepingPlace3", propOrder = {
    "sfkpgPlcFrmt",
    "lei"
})
public class SafeKeepingPlace3 {

    @XmlElement(name = "SfkpgPlcFrmt")
    protected SafekeepingPlaceFormat29Choice sfkpgPlcFrmt;
    @XmlElement(name = "LEI")
    protected String lei;

    /**
     * Gets the value of the sfkpgPlcFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public SafekeepingPlaceFormat29Choice getSfkpgPlcFrmt() {
        return sfkpgPlcFrmt;
    }

    /**
     * Sets the value of the sfkpgPlcFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public void setSfkpgPlcFrmt(SafekeepingPlaceFormat29Choice value) {
        this.sfkpgPlcFrmt = value;
    }

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

}
