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

package org.jpos.iso20022.casp_010_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Vehicle2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max35Text" minOccurs="0"/>
 *         <element name="NtryMd" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}CardDataReading5Code" minOccurs="0"/>
 *         <element name="Data" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle2", propOrder = {
    "tp",
    "ntryMd",
    "data"
})
public class Vehicle2 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "NtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading5Code ntryMd;
    @XmlElement(name = "Data", required = true)
    protected String data;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ntryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading5Code }
     *     
     */
    public CardDataReading5Code getNtryMd() {
        return ntryMd;
    }

    /**
     * Sets the value of the ntryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading5Code }
     *     
     */
    public void setNtryMd(CardDataReading5Code value) {
        this.ntryMd = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

}
