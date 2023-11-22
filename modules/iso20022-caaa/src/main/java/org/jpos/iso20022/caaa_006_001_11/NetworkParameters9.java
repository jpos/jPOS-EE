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

package org.jpos.iso20022.caaa_006_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkParameters9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkParameters9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtwkTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.006.001.11}NetworkType1Code"/>
 *         <element name="AdrVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.006.001.11}Max500Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkParameters9", propOrder = {
    "ntwkTp",
    "adrVal"
})
public class NetworkParameters9 {

    @XmlElement(name = "NtwkTp", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkType1Code ntwkTp;
    @XmlElement(name = "AdrVal", required = true)
    protected String adrVal;

    /**
     * Gets the value of the ntwkTp property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkType1Code }
     *     
     */
    public NetworkType1Code getNtwkTp() {
        return ntwkTp;
    }

    /**
     * Sets the value of the ntwkTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkType1Code }
     *     
     */
    public void setNtwkTp(NetworkType1Code value) {
        this.ntwkTp = value;
    }

    /**
     * Gets the value of the adrVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrVal() {
        return adrVal;
    }

    /**
     * Sets the value of the adrVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrVal(String value) {
        this.adrVal = value;
    }

}
