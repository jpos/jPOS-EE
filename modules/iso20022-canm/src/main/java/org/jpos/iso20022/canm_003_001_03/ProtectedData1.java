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

package org.jpos.iso20022.canm_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectedData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProtectedData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CnttTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}ContentType3Code"/>
 *         <element name="EnvlpdData" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}EnvelopedData6" minOccurs="0"/>
 *         <element name="NcrptdData" type="{urn:iso:std:iso:20022:tech:xsd:canm.003.001.03}EncryptedData1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectedData1", propOrder = {
    "cnttTp",
    "envlpdData",
    "ncrptdData"
})
public class ProtectedData1 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType3Code cnttTp;
    @XmlElement(name = "EnvlpdData")
    protected EnvelopedData6 envlpdData;
    @XmlElement(name = "NcrptdData")
    protected EncryptedData1 ncrptdData;

    /**
     * Gets the value of the cnttTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType3Code }
     *     
     */
    public ContentType3Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Sets the value of the cnttTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType3Code }
     *     
     */
    public void setCnttTp(ContentType3Code value) {
        this.cnttTp = value;
    }

    /**
     * Gets the value of the envlpdData property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopedData6 }
     *     
     */
    public EnvelopedData6 getEnvlpdData() {
        return envlpdData;
    }

    /**
     * Sets the value of the envlpdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopedData6 }
     *     
     */
    public void setEnvlpdData(EnvelopedData6 value) {
        this.envlpdData = value;
    }

    /**
     * Gets the value of the ncrptdData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedData1 }
     *     
     */
    public EncryptedData1 getNcrptdData() {
        return ncrptdData;
    }

    /**
     * Sets the value of the ncrptdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedData1 }
     *     
     */
    public void setNcrptdData(EncryptedData1 value) {
        this.ncrptdData = value;
    }

}
