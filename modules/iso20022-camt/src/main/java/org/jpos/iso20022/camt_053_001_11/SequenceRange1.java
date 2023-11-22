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

package org.jpos.iso20022.camt_053_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SequenceRange1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SequenceRange1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}Max35Text"/>
 *         <element name="ToSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.11}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRange1", propOrder = {
    "frSeq",
    "toSeq"
})
public class SequenceRange1 {

    @XmlElement(name = "FrSeq", required = true)
    protected String frSeq;
    @XmlElement(name = "ToSeq", required = true)
    protected String toSeq;

    /**
     * Gets the value of the frSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrSeq() {
        return frSeq;
    }

    /**
     * Sets the value of the frSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrSeq(String value) {
        this.frSeq = value;
    }

    /**
     * Gets the value of the toSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSeq() {
        return toSeq;
    }

    /**
     * Sets the value of the toSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToSeq(String value) {
        this.toSeq = value;
    }

}
