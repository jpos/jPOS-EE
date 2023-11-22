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

package org.jpos.iso20022.seev_006_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonName3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PersonName3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmPrfx" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}NamePrefix2Code" minOccurs="0"/>
 *         <element name="FrstNm" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}Max350Text"/>
 *         <element name="Srnm" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}Max350Text"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:seev.006.001.09}PostalAddress26" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonName3", propOrder = {
    "nmPrfx",
    "frstNm",
    "srnm",
    "adr"
})
public class PersonName3 {

    @XmlElement(name = "NmPrfx")
    @XmlSchemaType(name = "string")
    protected NamePrefix2Code nmPrfx;
    @XmlElement(name = "FrstNm", required = true)
    protected String frstNm;
    @XmlElement(name = "Srnm", required = true)
    protected String srnm;
    @XmlElement(name = "Adr")
    protected PostalAddress26 adr;

    /**
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix2Code }
     *     
     */
    public NamePrefix2Code getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix2Code }
     *     
     */
    public void setNmPrfx(NamePrefix2Code value) {
        this.nmPrfx = value;
    }

    /**
     * Gets the value of the frstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstNm() {
        return frstNm;
    }

    /**
     * Sets the value of the frstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstNm(String value) {
        this.frstNm = value;
    }

    /**
     * Gets the value of the srnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrnm() {
        return srnm;
    }

    /**
     * Sets the value of the srnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrnm(String value) {
        this.srnm = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress26 }
     *     
     */
    public PostalAddress26 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress26 }
     *     
     */
    public void setAdr(PostalAddress26 value) {
        this.adr = value;
    }

}
