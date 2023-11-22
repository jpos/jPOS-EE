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

package org.jpos.iso20022.cafm_002_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parameter13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Parameter13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Algorithm20Code" minOccurs="0"/>
 *         <element name="MskGnrtrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AlgorithmIdentification26" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter13", propOrder = {
    "dgstAlgo",
    "mskGnrtrAlgo"
})
public class Parameter13 {

    @XmlElement(name = "DgstAlgo")
    @XmlSchemaType(name = "string")
    protected Algorithm20Code dgstAlgo;
    @XmlElement(name = "MskGnrtrAlgo")
    protected AlgorithmIdentification26 mskGnrtrAlgo;

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm20Code }
     *     
     */
    public Algorithm20Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm20Code }
     *     
     */
    public void setDgstAlgo(Algorithm20Code value) {
        this.dgstAlgo = value;
    }

    /**
     * Gets the value of the mskGnrtrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification26 }
     *     
     */
    public AlgorithmIdentification26 getMskGnrtrAlgo() {
        return mskGnrtrAlgo;
    }

    /**
     * Sets the value of the mskGnrtrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification26 }
     *     
     */
    public void setMskGnrtrAlgo(AlgorithmIdentification26 value) {
        this.mskGnrtrAlgo = value;
    }

}
