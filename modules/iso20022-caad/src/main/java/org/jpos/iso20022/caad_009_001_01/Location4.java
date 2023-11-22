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

package org.jpos.iso20022.caad_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Location4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Location4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LctnCd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="LctnNm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max256Text" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Address2" minOccurs="0"/>
 *         <element name="LclTmZone" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text" minOccurs="0"/>
 *         <element name="LclCcy" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}ISO3NumericCurrencyCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location4", propOrder = {
    "lctnCd",
    "lctnNm",
    "desc",
    "adr",
    "lclTmZone",
    "lclCcy"
})
public class Location4 {

    @XmlElement(name = "LctnCd")
    protected String lctnCd;
    @XmlElement(name = "LctnNm")
    protected String lctnNm;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "LclTmZone")
    protected String lclTmZone;
    @XmlElement(name = "LclCcy")
    protected String lclCcy;

    /**
     * Gets the value of the lctnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCd() {
        return lctnCd;
    }

    /**
     * Sets the value of the lctnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctnCd(String value) {
        this.lctnCd = value;
    }

    /**
     * Gets the value of the lctnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnNm() {
        return lctnNm;
    }

    /**
     * Sets the value of the lctnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctnNm(String value) {
        this.lctnNm = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAdr(Address2 value) {
        this.adr = value;
    }

    /**
     * Gets the value of the lclTmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLclTmZone() {
        return lclTmZone;
    }

    /**
     * Sets the value of the lclTmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLclTmZone(String value) {
        this.lclTmZone = value;
    }

    /**
     * Gets the value of the lclCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLclCcy() {
        return lclCcy;
    }

    /**
     * Sets the value of the lclCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLclCcy(String value) {
        this.lclCcy = value;
    }

}
