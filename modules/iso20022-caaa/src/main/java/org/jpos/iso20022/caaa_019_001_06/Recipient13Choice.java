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

package org.jpos.iso20022.caaa_019_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recipient13Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Recipient13Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="IssrAndSrlNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.019.001.06}IssuerAndSerialNumber2"/>
 *         <element name="SbjtKeyIdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.019.001.06}Max140Binary"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient13Choice", propOrder = {
    "issrAndSrlNb",
    "sbjtKeyIdr"
})
public class Recipient13Choice {

    @XmlElement(name = "IssrAndSrlNb")
    protected IssuerAndSerialNumber2 issrAndSrlNb;
    @XmlElement(name = "SbjtKeyIdr")
    protected byte[] sbjtKeyIdr;

    /**
     * Gets the value of the issrAndSrlNb property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerAndSerialNumber2 }
     *     
     */
    public IssuerAndSerialNumber2 getIssrAndSrlNb() {
        return issrAndSrlNb;
    }

    /**
     * Sets the value of the issrAndSrlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerAndSerialNumber2 }
     *     
     */
    public void setIssrAndSrlNb(IssuerAndSerialNumber2 value) {
        this.issrAndSrlNb = value;
    }

    /**
     * Gets the value of the sbjtKeyIdr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSbjtKeyIdr() {
        return sbjtKeyIdr;
    }

    /**
     * Sets the value of the sbjtKeyIdr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSbjtKeyIdr(byte[] value) {
        this.sbjtKeyIdr = value;
    }

}
