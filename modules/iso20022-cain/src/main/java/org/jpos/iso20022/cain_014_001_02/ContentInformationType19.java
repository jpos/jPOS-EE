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

package org.jpos.iso20022.cain_014_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentInformationType19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContentInformationType19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CnttTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}ContentType2Code"/>
 *         <element name="EnvlpdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}EnvelopedData5" minOccurs="0"/>
 *         <element name="AuthntcdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}AuthenticatedData5" minOccurs="0"/>
 *         <element name="SgndData" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}SignedData5" minOccurs="0"/>
 *         <element name="DgstdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.014.001.02}DigestedData5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType19", propOrder = {
    "cnttTp",
    "envlpdData",
    "authntcdData",
    "sgndData",
    "dgstdData"
})
public class ContentInformationType19 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "EnvlpdData")
    protected EnvelopedData5 envlpdData;
    @XmlElement(name = "AuthntcdData")
    protected AuthenticatedData5 authntcdData;
    @XmlElement(name = "SgndData")
    protected SignedData5 sgndData;
    @XmlElement(name = "DgstdData")
    protected DigestedData5 dgstdData;

    /**
     * Gets the value of the cnttTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType2Code }
     *     
     */
    public ContentType2Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Sets the value of the cnttTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType2Code }
     *     
     */
    public void setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
    }

    /**
     * Gets the value of the envlpdData property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopedData5 }
     *     
     */
    public EnvelopedData5 getEnvlpdData() {
        return envlpdData;
    }

    /**
     * Sets the value of the envlpdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopedData5 }
     *     
     */
    public void setEnvlpdData(EnvelopedData5 value) {
        this.envlpdData = value;
    }

    /**
     * Gets the value of the authntcdData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatedData5 }
     *     
     */
    public AuthenticatedData5 getAuthntcdData() {
        return authntcdData;
    }

    /**
     * Sets the value of the authntcdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatedData5 }
     *     
     */
    public void setAuthntcdData(AuthenticatedData5 value) {
        this.authntcdData = value;
    }

    /**
     * Gets the value of the sgndData property.
     * 
     * @return
     *     possible object is
     *     {@link SignedData5 }
     *     
     */
    public SignedData5 getSgndData() {
        return sgndData;
    }

    /**
     * Sets the value of the sgndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedData5 }
     *     
     */
    public void setSgndData(SignedData5 value) {
        this.sgndData = value;
    }

    /**
     * Gets the value of the dgstdData property.
     * 
     * @return
     *     possible object is
     *     {@link DigestedData5 }
     *     
     */
    public DigestedData5 getDgstdData() {
        return dgstdData;
    }

    /**
     * Sets the value of the dgstdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestedData5 }
     *     
     */
    public void setDgstdData(DigestedData5 value) {
        this.dgstdData = value;
    }

}
