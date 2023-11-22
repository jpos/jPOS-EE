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

package org.jpos.iso20022.catp_008_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parameter6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Parameter6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NcrptnFrmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.008.001.02}EncryptionFormat1Code" minOccurs="0"/>
 *         <element name="InitlstnVctr" type="{urn:iso:std:iso:20022:tech:xsd:catp.008.001.02}Max500Binary" minOccurs="0"/>
 *         <element name="BPddg" type="{urn:iso:std:iso:20022:tech:xsd:catp.008.001.02}BytePadding1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter6", propOrder = {
    "ncrptnFrmt",
    "initlstnVctr",
    "bPddg"
})
public class Parameter6 {

    @XmlElement(name = "NcrptnFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptionFormat1Code ncrptnFrmt;
    @XmlElement(name = "InitlstnVctr")
    protected byte[] initlstnVctr;
    @XmlElement(name = "BPddg")
    @XmlSchemaType(name = "string")
    protected BytePadding1Code bPddg;

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
     * Gets the value of the initlstnVctr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInitlstnVctr() {
        return initlstnVctr;
    }

    /**
     * Sets the value of the initlstnVctr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInitlstnVctr(byte[] value) {
        this.initlstnVctr = value;
    }

    /**
     * Gets the value of the bPddg property.
     * 
     * @return
     *     possible object is
     *     {@link BytePadding1Code }
     *     
     */
    public BytePadding1Code getBPddg() {
        return bPddg;
    }

    /**
     * Sets the value of the bPddg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BytePadding1Code }
     *     
     */
    public void setBPddg(BytePadding1Code value) {
        this.bPddg = value;
    }

}
