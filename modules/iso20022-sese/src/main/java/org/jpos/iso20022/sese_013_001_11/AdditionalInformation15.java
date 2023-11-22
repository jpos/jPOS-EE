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

package org.jpos.iso20022.sese_013_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalInformation15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalInformation15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InfTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}GenericIdentification36"/>
 *         <element name="InfVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max350Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation15", propOrder = {
    "infTp",
    "infVal"
})
public class AdditionalInformation15 {

    @XmlElement(name = "InfTp", required = true)
    protected GenericIdentification36 infTp;
    @XmlElement(name = "InfVal", required = true)
    protected String infVal;

    /**
     * Gets the value of the infTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getInfTp() {
        return infTp;
    }

    /**
     * Sets the value of the infTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setInfTp(GenericIdentification36 value) {
        this.infTp = value;
    }

    /**
     * Gets the value of the infVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfVal() {
        return infVal;
    }

    /**
     * Sets the value of the infVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfVal(String value) {
        this.infVal = value;
    }

}
