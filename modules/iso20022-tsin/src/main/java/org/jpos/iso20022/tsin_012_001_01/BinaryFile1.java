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

package org.jpos.iso20022.tsin_012_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinaryFile1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BinaryFile1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MIMETp" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}Max35Text" minOccurs="0"/>
 *         <element name="NcodgTp" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CharSet" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}Max35Text" minOccurs="0"/>
 *         <element name="InclBinryObjct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.012.001.01}Max100KBinary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryFile1", propOrder = {
    "mimeTp",
    "ncodgTp",
    "charSet",
    "inclBinryObjct"
})
public class BinaryFile1 {

    @XmlElement(name = "MIMETp")
    protected String mimeTp;
    @XmlElement(name = "NcodgTp")
    protected String ncodgTp;
    @XmlElement(name = "CharSet")
    protected String charSet;
    @XmlElement(name = "InclBinryObjct")
    protected byte[] inclBinryObjct;

    /**
     * Gets the value of the mimeTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMETp() {
        return mimeTp;
    }

    /**
     * Sets the value of the mimeTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMETp(String value) {
        this.mimeTp = value;
    }

    /**
     * Gets the value of the ncodgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcodgTp() {
        return ncodgTp;
    }

    /**
     * Sets the value of the ncodgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcodgTp(String value) {
        this.ncodgTp = value;
    }

    /**
     * Gets the value of the charSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * Sets the value of the charSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharSet(String value) {
        this.charSet = value;
    }

    /**
     * Gets the value of the inclBinryObjct property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInclBinryObjct() {
        return inclBinryObjct;
    }

    /**
     * Sets the value of the inclBinryObjct property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInclBinryObjct(byte[] value) {
        this.inclBinryObjct = value;
    }

}
