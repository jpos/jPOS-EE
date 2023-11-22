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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecomCallDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TelecomCallDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TelephonyCallType1Code" minOccurs="0"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max70Text" minOccurs="0"/>
 *         <element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}PhoneNumber" minOccurs="0"/>
 *         <element name="City" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Stat" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max16Text" minOccurs="0"/>
 *         <element name="Prvc" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ISOMax3ACountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecomCallDetails2", propOrder = {
    "tp",
    "othrTp",
    "phneNb",
    "city",
    "stat",
    "prvc",
    "ctry"
})
public class TelecomCallDetails2 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TelephonyCallType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Stat")
    protected String stat;
    @XmlElement(name = "Prvc")
    protected String prvc;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TelephonyCallType1Code }
     *     
     */
    public TelephonyCallType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephonyCallType1Code }
     *     
     */
    public void setTp(TelephonyCallType1Code value) {
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
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the prvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvc() {
        return prvc;
    }

    /**
     * Sets the value of the prvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvc(String value) {
        this.prvc = value;
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
