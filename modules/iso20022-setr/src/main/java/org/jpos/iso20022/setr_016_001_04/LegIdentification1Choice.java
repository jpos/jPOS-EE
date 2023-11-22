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

package org.jpos.iso20022.setr_016_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegIdentification1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LegIdentification1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RedLegId" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Max35Text"/>
 *         <element name="SbcptLegId" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegIdentification1Choice", propOrder = {
    "redLegId",
    "sbcptLegId"
})
public class LegIdentification1Choice {

    @XmlElement(name = "RedLegId")
    protected String redLegId;
    @XmlElement(name = "SbcptLegId")
    protected String sbcptLegId;

    /**
     * Gets the value of the redLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedLegId() {
        return redLegId;
    }

    /**
     * Sets the value of the redLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedLegId(String value) {
        this.redLegId = value;
    }

    /**
     * Gets the value of the sbcptLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbcptLegId() {
        return sbcptLegId;
    }

    /**
     * Sets the value of the sbcptLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbcptLegId(String value) {
        this.sbcptLegId = value;
    }

}
