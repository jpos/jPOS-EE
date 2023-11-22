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

package org.jpos.iso20022.tsmt_053_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualifiedPartyAndXMLSignature1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QualifiedPartyAndXMLSignature1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pty" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         <element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.053.001.01}SignatureEnvelope"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedPartyAndXMLSignature1", propOrder = {
    "pty",
    "sgntr"
})
public class QualifiedPartyAndXMLSignature1 {

    @XmlElement(name = "Pty")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object pty;
    @XmlElement(name = "Sgntr", required = true)
    protected SignatureEnvelope sgntr;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPty(Object value) {
        this.pty = value;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureEnvelope }
     *     
     */
    public SignatureEnvelope getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureEnvelope }
     *     
     */
    public void setSgntr(SignatureEnvelope value) {
        this.sgntr = value;
    }

}
