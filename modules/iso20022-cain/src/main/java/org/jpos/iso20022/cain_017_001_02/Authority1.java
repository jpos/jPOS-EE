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

package org.jpos.iso20022.cain_017_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Authority1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Authority1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISO3NumericCountryCode" minOccurs="0"/>
 *         <element name="CtrySubDvsnMjr" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISOCountrySubDivisionCode" minOccurs="0"/>
 *         <element name="CtrySubDvsnMnr" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISOCountrySubDivisionCode" minOccurs="0"/>
 *         <element name="CtrySubDvsnMjrNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max50Text" minOccurs="0"/>
 *         <element name="CtrySubDvsnMnrNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max50Text" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max50Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authority1", propOrder = {
    "ctry",
    "ctrySubDvsnMjr",
    "ctrySubDvsnMnr",
    "ctrySubDvsnMjrNm",
    "ctrySubDvsnMnrNm",
    "nm"
})
public class Authority1 {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "CtrySubDvsnMjr")
    protected String ctrySubDvsnMjr;
    @XmlElement(name = "CtrySubDvsnMnr")
    protected String ctrySubDvsnMnr;
    @XmlElement(name = "CtrySubDvsnMjrNm")
    protected String ctrySubDvsnMjrNm;
    @XmlElement(name = "CtrySubDvsnMnrNm")
    protected String ctrySubDvsnMnrNm;
    @XmlElement(name = "Nm")
    protected String nm;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the ctrySubDvsnMjr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMjr() {
        return ctrySubDvsnMjr;
    }

    /**
     * Sets the value of the ctrySubDvsnMjr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsnMjr(String value) {
        this.ctrySubDvsnMjr = value;
    }

    /**
     * Gets the value of the ctrySubDvsnMnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMnr() {
        return ctrySubDvsnMnr;
    }

    /**
     * Sets the value of the ctrySubDvsnMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsnMnr(String value) {
        this.ctrySubDvsnMnr = value;
    }

    /**
     * Gets the value of the ctrySubDvsnMjrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMjrNm() {
        return ctrySubDvsnMjrNm;
    }

    /**
     * Sets the value of the ctrySubDvsnMjrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsnMjrNm(String value) {
        this.ctrySubDvsnMjrNm = value;
    }

    /**
     * Gets the value of the ctrySubDvsnMnrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMnrNm() {
        return ctrySubDvsnMnrNm;
    }

    /**
     * Sets the value of the ctrySubDvsnMnrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsnMnrNm(String value) {
        this.ctrySubDvsnMnrNm = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

}
