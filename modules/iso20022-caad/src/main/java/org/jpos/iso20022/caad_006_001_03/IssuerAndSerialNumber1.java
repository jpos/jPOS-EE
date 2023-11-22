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

package org.jpos.iso20022.caad_006_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerAndSerialNumber1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IssuerAndSerialNumber1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}CertificateIssuer1"/>
 *         <element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.006.001.03}Max35Binary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerAndSerialNumber1", propOrder = {
    "issr",
    "srlNb"
})
public class IssuerAndSerialNumber1 {

    @XmlElement(name = "Issr", required = true)
    protected CertificateIssuer1 issr;
    @XmlElement(name = "SrlNb", required = true)
    protected byte[] srlNb;

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public CertificateIssuer1 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public void setIssr(CertificateIssuer1 value) {
        this.issr = value;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSrlNb(byte[] value) {
        this.srlNb = value;
    }

}
