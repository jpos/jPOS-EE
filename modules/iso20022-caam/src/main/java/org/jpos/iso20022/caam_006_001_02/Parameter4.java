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

package org.jpos.iso20022.caam_006_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parameter4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Parameter4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NcrptnFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caam.006.001.02}EncryptionFormat1Code" minOccurs="0"/>
 *         <element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.006.001.02}Algorithm11Code" minOccurs="0"/>
 *         <element name="MskGnrtrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.006.001.02}AlgorithmIdentification12" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter4", propOrder = {
    "ncrptnFrmt",
    "dgstAlgo",
    "mskGnrtrAlgo"
})
public class Parameter4 {

    @XmlElement(name = "NcrptnFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptionFormat1Code ncrptnFrmt;
    @XmlElement(name = "DgstAlgo")
    @XmlSchemaType(name = "string")
    protected Algorithm11Code dgstAlgo;
    @XmlElement(name = "MskGnrtrAlgo")
    protected AlgorithmIdentification12 mskGnrtrAlgo;

    /**
     * Gets the value of the ncrptnFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionFormat1Code }
     *     
     */
    public EncryptionFormat1Code getNcrptnFrmt() {
        return ncrptnFrmt;
    }

    /**
     * Sets the value of the ncrptnFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionFormat1Code }
     *     
     */
    public void setNcrptnFrmt(EncryptionFormat1Code value) {
        this.ncrptnFrmt = value;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm11Code }
     *     
     */
    public Algorithm11Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm11Code }
     *     
     */
    public void setDgstAlgo(Algorithm11Code value) {
        this.dgstAlgo = value;
    }

    /**
     * Gets the value of the mskGnrtrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification12 }
     *     
     */
    public AlgorithmIdentification12 getMskGnrtrAlgo() {
        return mskGnrtrAlgo;
    }

    /**
     * Sets the value of the mskGnrtrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification12 }
     *     
     */
    public void setMskGnrtrAlgo(AlgorithmIdentification12 value) {
        this.mskGnrtrAlgo = value;
    }

}
