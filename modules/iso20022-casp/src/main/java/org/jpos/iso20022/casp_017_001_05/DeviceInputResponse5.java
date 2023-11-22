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

package org.jpos.iso20022.casp_017_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInputResponse5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceInputResponse5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OutptRslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}OutputResult2" minOccurs="0"/>
 *         <element name="InptRslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}InputResult5"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInputResponse5", propOrder = {
    "outptRslt",
    "inptRslt"
})
public class DeviceInputResponse5 {

    @XmlElement(name = "OutptRslt")
    protected OutputResult2 outptRslt;
    @XmlElement(name = "InptRslt", required = true)
    protected InputResult5 inptRslt;

    /**
     * Gets the value of the outptRslt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputResult2 }
     *     
     */
    public OutputResult2 getOutptRslt() {
        return outptRslt;
    }

    /**
     * Sets the value of the outptRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputResult2 }
     *     
     */
    public void setOutptRslt(OutputResult2 value) {
        this.outptRslt = value;
    }

    /**
     * Gets the value of the inptRslt property.
     * 
     * @return
     *     possible object is
     *     {@link InputResult5 }
     *     
     */
    public InputResult5 getInptRslt() {
        return inptRslt;
    }

    /**
     * Sets the value of the inptRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputResult5 }
     *     
     */
    public void setInptRslt(InputResult5 value) {
        this.inptRslt = value;
    }

}
