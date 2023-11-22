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

package org.jpos.iso20022.acmt_017_001_03_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAndCertificate5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyAndCertificate5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ModCd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.017.001.03}Modification1Code" minOccurs="0"/>
 *         <element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.017.001.03}PartyIdentification135"/>
 *         <element name="Cert" type="{urn:iso:std:iso:20022:tech:xsd:acmt.017.001.03}Max10KBinary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAndCertificate5", propOrder = {
    "modCd",
    "pty",
    "cert"
})
public class PartyAndCertificate5 {

    @XmlElement(name = "ModCd")
    @XmlSchemaType(name = "string")
    protected Modification1Code modCd;
    @XmlElement(name = "Pty", required = true)
    protected PartyIdentification135 pty;
    @XmlElement(name = "Cert")
    protected byte[] cert;

    /**
     * Gets the value of the modCd property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getModCd() {
        return modCd;
    }

    /**
     * Sets the value of the modCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public void setModCd(Modification1Code value) {
        this.modCd = value;
    }

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setPty(PartyIdentification135 value) {
        this.pty = value;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCert(byte[] value) {
        this.cert = value;
    }

}
