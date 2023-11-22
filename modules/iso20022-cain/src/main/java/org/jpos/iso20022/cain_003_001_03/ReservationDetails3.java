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

package org.jpos.iso20022.cain_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationDetails3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReservationDetails3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sys" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max4Text" minOccurs="0"/>
 *         <element name="RsvatnNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlSys" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max4Text" minOccurs="0"/>
 *         <element name="OrgnlRsvatnNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationDetails3", propOrder = {
    "sys",
    "rsvatnNb",
    "orgnlSys",
    "orgnlRsvatnNb"
})
public class ReservationDetails3 {

    @XmlElement(name = "Sys")
    protected String sys;
    @XmlElement(name = "RsvatnNb")
    protected String rsvatnNb;
    @XmlElement(name = "OrgnlSys")
    protected String orgnlSys;
    @XmlElement(name = "OrgnlRsvatnNb")
    protected String orgnlRsvatnNb;

    /**
     * Gets the value of the sys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSys() {
        return sys;
    }

    /**
     * Sets the value of the sys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSys(String value) {
        this.sys = value;
    }

    /**
     * Gets the value of the rsvatnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsvatnNb() {
        return rsvatnNb;
    }

    /**
     * Sets the value of the rsvatnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsvatnNb(String value) {
        this.rsvatnNb = value;
    }

    /**
     * Gets the value of the orgnlSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlSys() {
        return orgnlSys;
    }

    /**
     * Sets the value of the orgnlSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlSys(String value) {
        this.orgnlSys = value;
    }

    /**
     * Gets the value of the orgnlRsvatnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRsvatnNb() {
        return orgnlRsvatnNb;
    }

    /**
     * Sets the value of the orgnlRsvatnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlRsvatnNb(String value) {
        this.orgnlRsvatnNb = value;
    }

}
