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

package org.jpos.iso20022.cain_023_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Device2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Device2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Manfctr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max70Text" minOccurs="0"/>
 *         <element name="ManfctrMdlId" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max70Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}CustomerDeviceType2Code" minOccurs="0"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}LanguageCode" minOccurs="0"/>
 *         <element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}PhoneNumber" minOccurs="0"/>
 *         <element name="GeogcLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}GeographicPointInDecimalDegrees" minOccurs="0"/>
 *         <element name="LctnCtryCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}ISO3NumericCountryCode" minOccurs="0"/>
 *         <element name="IPAdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max70Text" minOccurs="0"/>
 *         <element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max256Text" minOccurs="0"/>
 *         <element name="DvcNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max100Text" minOccurs="0"/>
 *         <element name="DvcNmNrmlzd" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max100Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device2", propOrder = {
    "manfctr",
    "manfctrMdlId",
    "tp",
    "othrTp",
    "lang",
    "phneNb",
    "geogcLctn",
    "lctnCtryCd",
    "ipAdr",
    "email",
    "dvcNm",
    "dvcNmNrmlzd"
})
public class Device2 {

    @XmlElement(name = "Manfctr")
    protected String manfctr;
    @XmlElement(name = "ManfctrMdlId")
    protected String manfctrMdlId;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CustomerDeviceType2Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "LctnCtryCd")
    protected String lctnCtryCd;
    @XmlElement(name = "IPAdr")
    protected String ipAdr;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "DvcNm")
    protected String dvcNm;
    @XmlElement(name = "DvcNmNrmlzd")
    protected String dvcNmNrmlzd;

    /**
     * Gets the value of the manfctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctr() {
        return manfctr;
    }

    /**
     * Sets the value of the manfctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManfctr(String value) {
        this.manfctr = value;
    }

    /**
     * Gets the value of the manfctrMdlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctrMdlId() {
        return manfctrMdlId;
    }

    /**
     * Sets the value of the manfctrMdlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManfctrMdlId(String value) {
        this.manfctrMdlId = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDeviceType2Code }
     *     
     */
    public CustomerDeviceType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDeviceType2Code }
     *     
     */
    public void setTp(CustomerDeviceType2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the phneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Sets the value of the phneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhneNb(String value) {
        this.phneNb = value;
    }

    /**
     * Gets the value of the geogcLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Sets the value of the geogcLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeogcLctn(String value) {
        this.geogcLctn = value;
    }

    /**
     * Gets the value of the lctnCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCtryCd() {
        return lctnCtryCd;
    }

    /**
     * Sets the value of the lctnCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctnCtryCd(String value) {
        this.lctnCtryCd = value;
    }

    /**
     * Gets the value of the ipAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAdr() {
        return ipAdr;
    }

    /**
     * Sets the value of the ipAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAdr(String value) {
        this.ipAdr = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the dvcNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcNm() {
        return dvcNm;
    }

    /**
     * Sets the value of the dvcNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcNm(String value) {
        this.dvcNm = value;
    }

    /**
     * Gets the value of the dvcNmNrmlzd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcNmNrmlzd() {
        return dvcNmNrmlzd;
    }

    /**
     * Sets the value of the dvcNmNrmlzd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcNmNrmlzd(String value) {
        this.dvcNmNrmlzd = value;
    }

}
