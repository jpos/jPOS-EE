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

package org.jpos.iso20022.cain_021_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Address3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdrLine1" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max200Text" minOccurs="0"/>
 *         <element name="AdrLine2" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max200Text" minOccurs="0"/>
 *         <element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max200Text" minOccurs="0"/>
 *         <element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max35Text" minOccurs="0"/>
 *         <element name="PstlCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max35Text" minOccurs="0"/>
 *         <element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max100Text" minOccurs="0"/>
 *         <element name="CtrySubDvsnMnrNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max100Text" minOccurs="0"/>
 *         <element name="CtrySubDvsnMjrNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max100Text" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}ISOMax3ACountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address3", propOrder = {
    "adrLine1",
    "adrLine2",
    "strtNm",
    "bldgNb",
    "pstlCd",
    "twnNm",
    "ctrySubDvsnMnrNm",
    "ctrySubDvsnMjrNm",
    "ctry"
})
public class Address3 {

    @XmlElement(name = "AdrLine1")
    protected String adrLine1;
    @XmlElement(name = "AdrLine2")
    protected String adrLine2;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    @XmlElement(name = "PstlCd")
    protected String pstlCd;
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    @XmlElement(name = "CtrySubDvsnMnrNm")
    protected String ctrySubDvsnMnrNm;
    @XmlElement(name = "CtrySubDvsnMjrNm")
    protected String ctrySubDvsnMjrNm;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the adrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLine1() {
        return adrLine1;
    }

    /**
     * Sets the value of the adrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrLine1(String value) {
        this.adrLine1 = value;
    }

    /**
     * Gets the value of the adrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLine2() {
        return adrLine2;
    }

    /**
     * Sets the value of the adrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrLine2(String value) {
        this.adrLine2 = value;
    }

    /**
     * Gets the value of the strtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Sets the value of the strtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * Gets the value of the bldgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Sets the value of the bldgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    /**
     * Gets the value of the pstlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstlCd() {
        return pstlCd;
    }

    /**
     * Sets the value of the pstlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstlCd(String value) {
        this.pstlCd = value;
    }

    /**
     * Gets the value of the twnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Sets the value of the twnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
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

}
