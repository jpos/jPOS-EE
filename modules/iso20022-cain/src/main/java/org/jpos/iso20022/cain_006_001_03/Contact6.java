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

package org.jpos.iso20022.cain_006_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Contact6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HomePhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="BizPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="MobPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="OthrPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="PrsnlEmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max256Text" minOccurs="0"/>
 *         <element name="BizEmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max256Text" minOccurs="0"/>
 *         <element name="OthrEmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max256Text" minOccurs="0"/>
 *         <element name="HomeFaxNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="BizFaxNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max256Text" minOccurs="0"/>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}LanguageCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact6", propOrder = {
    "homePhneNb",
    "bizPhneNb",
    "mobPhneNb",
    "othrPhneNb",
    "prsnlEmailAdr",
    "bizEmailAdr",
    "othrEmailAdr",
    "homeFaxNb",
    "bizFaxNb",
    "urlAdr",
    "lang"
})
public class Contact6 {

    @XmlElement(name = "HomePhneNb")
    protected String homePhneNb;
    @XmlElement(name = "BizPhneNb")
    protected String bizPhneNb;
    @XmlElement(name = "MobPhneNb")
    protected String mobPhneNb;
    @XmlElement(name = "OthrPhneNb")
    protected String othrPhneNb;
    @XmlElement(name = "PrsnlEmailAdr")
    protected String prsnlEmailAdr;
    @XmlElement(name = "BizEmailAdr")
    protected String bizEmailAdr;
    @XmlElement(name = "OthrEmailAdr")
    protected String othrEmailAdr;
    @XmlElement(name = "HomeFaxNb")
    protected String homeFaxNb;
    @XmlElement(name = "BizFaxNb")
    protected String bizFaxNb;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "Lang")
    protected String lang;

    /**
     * Gets the value of the homePhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhneNb() {
        return homePhneNb;
    }

    /**
     * Sets the value of the homePhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhneNb(String value) {
        this.homePhneNb = value;
    }

    /**
     * Gets the value of the bizPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizPhneNb() {
        return bizPhneNb;
    }

    /**
     * Sets the value of the bizPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizPhneNb(String value) {
        this.bizPhneNb = value;
    }

    /**
     * Gets the value of the mobPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobPhneNb() {
        return mobPhneNb;
    }

    /**
     * Sets the value of the mobPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobPhneNb(String value) {
        this.mobPhneNb = value;
    }

    /**
     * Gets the value of the othrPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPhneNb() {
        return othrPhneNb;
    }

    /**
     * Sets the value of the othrPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPhneNb(String value) {
        this.othrPhneNb = value;
    }

    /**
     * Gets the value of the prsnlEmailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlEmailAdr() {
        return prsnlEmailAdr;
    }

    /**
     * Sets the value of the prsnlEmailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrsnlEmailAdr(String value) {
        this.prsnlEmailAdr = value;
    }

    /**
     * Gets the value of the bizEmailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizEmailAdr() {
        return bizEmailAdr;
    }

    /**
     * Sets the value of the bizEmailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizEmailAdr(String value) {
        this.bizEmailAdr = value;
    }

    /**
     * Gets the value of the othrEmailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrEmailAdr() {
        return othrEmailAdr;
    }

    /**
     * Sets the value of the othrEmailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrEmailAdr(String value) {
        this.othrEmailAdr = value;
    }

    /**
     * Gets the value of the homeFaxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeFaxNb() {
        return homeFaxNb;
    }

    /**
     * Sets the value of the homeFaxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeFaxNb(String value) {
        this.homeFaxNb = value;
    }

    /**
     * Gets the value of the bizFaxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizFaxNb() {
        return bizFaxNb;
    }

    /**
     * Sets the value of the bizFaxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizFaxNb(String value) {
        this.bizFaxNb = value;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
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

}
