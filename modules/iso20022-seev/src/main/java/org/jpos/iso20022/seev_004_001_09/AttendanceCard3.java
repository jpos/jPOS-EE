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

package org.jpos.iso20022.seev_004_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendanceCard3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AttendanceCard3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AttndncCardLbllg" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Max105Text" minOccurs="0"/>
 *         <element name="DlvryMtd" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}DeliveryPlace3Code"/>
 *         <element name="OthrAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}NameAndAddress9" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttendanceCard3", propOrder = {
    "attndncCardLbllg",
    "dlvryMtd",
    "othrAdr"
})
public class AttendanceCard3 {

    @XmlElement(name = "AttndncCardLbllg")
    protected String attndncCardLbllg;
    @XmlElement(name = "DlvryMtd", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryPlace3Code dlvryMtd;
    @XmlElement(name = "OthrAdr")
    protected NameAndAddress9 othrAdr;

    /**
     * Gets the value of the attndncCardLbllg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndncCardLbllg() {
        return attndncCardLbllg;
    }

    /**
     * Sets the value of the attndncCardLbllg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttndncCardLbllg(String value) {
        this.attndncCardLbllg = value;
    }

    /**
     * Gets the value of the dlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPlace3Code }
     *     
     */
    public DeliveryPlace3Code getDlvryMtd() {
        return dlvryMtd;
    }

    /**
     * Sets the value of the dlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPlace3Code }
     *     
     */
    public void setDlvryMtd(DeliveryPlace3Code value) {
        this.dlvryMtd = value;
    }

    /**
     * Gets the value of the othrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress9 }
     *     
     */
    public NameAndAddress9 getOthrAdr() {
        return othrAdr;
    }

    /**
     * Sets the value of the othrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress9 }
     *     
     */
    public void setOthrAdr(NameAndAddress9 value) {
        this.othrAdr = value;
    }

}
