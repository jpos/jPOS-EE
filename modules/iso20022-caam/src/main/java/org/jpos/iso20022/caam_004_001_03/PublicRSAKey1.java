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

package org.jpos.iso20022.caam_004_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicRSAKey1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PublicRSAKey1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mdlus" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max5000Binary"/>
 *         <element name="Expnt" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max5000Binary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicRSAKey1", propOrder = {
    "mdlus",
    "expnt"
})
public class PublicRSAKey1 {

    @XmlElement(name = "Mdlus", required = true)
    protected byte[] mdlus;
    @XmlElement(name = "Expnt", required = true)
    protected byte[] expnt;

    /**
     * Gets the value of the mdlus property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMdlus() {
        return mdlus;
    }

    /**
     * Sets the value of the mdlus property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMdlus(byte[] value) {
        this.mdlus = value;
    }

    /**
     * Gets the value of the expnt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExpnt() {
        return expnt;
    }

    /**
     * Sets the value of the expnt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setExpnt(byte[] value) {
        this.expnt = value;
    }

}
