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

package org.jpos.iso20022.cain_023_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parameter10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Parameter10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NcrptnFrmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}EncryptionFormat2Code" minOccurs="0"/>
 *         <element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Algorithm16Code" minOccurs="0"/>
 *         <element name="MskGnrtrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}AlgorithmIdentification18" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter10", propOrder = {
    "ncrptnFrmt",
    "dgstAlgo",
    "mskGnrtrAlgo"
})
public class Parameter10 {

    @XmlElement(name = "NcrptnFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptionFormat2Code ncrptnFrmt;
    @XmlElement(name = "DgstAlgo")
    @XmlSchemaType(name = "string")
    protected Algorithm16Code dgstAlgo;
    @XmlElement(name = "MskGnrtrAlgo")
    protected AlgorithmIdentification18 mskGnrtrAlgo;

    /**
     * Gets the value of the ncrptnFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionFormat2Code }
     *     
     */
    public EncryptionFormat2Code getNcrptnFrmt() {
        return ncrptnFrmt;
    }

    /**
     * Sets the value of the ncrptnFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionFormat2Code }
     *     
     */
    public void setNcrptnFrmt(EncryptionFormat2Code value) {
        this.ncrptnFrmt = value;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm16Code }
     *     
     */
    public Algorithm16Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm16Code }
     *     
     */
    public void setDgstAlgo(Algorithm16Code value) {
        this.dgstAlgo = value;
    }

    /**
     * Gets the value of the mskGnrtrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification18 }
     *     
     */
    public AlgorithmIdentification18 getMskGnrtrAlgo() {
        return mskGnrtrAlgo;
    }

    /**
     * Sets the value of the mskGnrtrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification18 }
     *     
     */
    public void setMskGnrtrAlgo(AlgorithmIdentification18 value) {
        this.mskGnrtrAlgo = value;
    }

}
