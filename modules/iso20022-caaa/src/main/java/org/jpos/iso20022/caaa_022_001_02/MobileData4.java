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

package org.jpos.iso20022.caaa_022_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileData4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MobileData4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MobCtryCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Min2Max3AlphaText" minOccurs="0"/>
 *         <element name="MobNtwkCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Min2Max3NumericText" minOccurs="0"/>
 *         <element name="MobMskdMSISDN" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Glctn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Geolocation1" minOccurs="0"/>
 *         <element name="SnstvMobData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}SensitiveMobileData1" minOccurs="0"/>
 *         <element name="PrtctdMobData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}ContentInformationType32" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileData4", propOrder = {
    "mobCtryCd",
    "mobNtwkCd",
    "mobMskdMSISDN",
    "glctn",
    "snstvMobData",
    "prtctdMobData"
})
public class MobileData4 {

    @XmlElement(name = "MobCtryCd")
    protected String mobCtryCd;
    @XmlElement(name = "MobNtwkCd")
    protected String mobNtwkCd;
    @XmlElement(name = "MobMskdMSISDN")
    protected String mobMskdMSISDN;
    @XmlElement(name = "Glctn")
    protected Geolocation1 glctn;
    @XmlElement(name = "SnstvMobData")
    protected SensitiveMobileData1 snstvMobData;
    @XmlElement(name = "PrtctdMobData")
    protected ContentInformationType32 prtctdMobData;

    /**
     * Gets the value of the mobCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobCtryCd() {
        return mobCtryCd;
    }

    /**
     * Sets the value of the mobCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobCtryCd(String value) {
        this.mobCtryCd = value;
    }

    /**
     * Gets the value of the mobNtwkCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobNtwkCd() {
        return mobNtwkCd;
    }

    /**
     * Sets the value of the mobNtwkCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobNtwkCd(String value) {
        this.mobNtwkCd = value;
    }

    /**
     * Gets the value of the mobMskdMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobMskdMSISDN() {
        return mobMskdMSISDN;
    }

    /**
     * Sets the value of the mobMskdMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobMskdMSISDN(String value) {
        this.mobMskdMSISDN = value;
    }

    /**
     * Gets the value of the glctn property.
     * 
     * @return
     *     possible object is
     *     {@link Geolocation1 }
     *     
     */
    public Geolocation1 getGlctn() {
        return glctn;
    }

    /**
     * Sets the value of the glctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geolocation1 }
     *     
     */
    public void setGlctn(Geolocation1 value) {
        this.glctn = value;
    }

    /**
     * Gets the value of the snstvMobData property.
     * 
     * @return
     *     possible object is
     *     {@link SensitiveMobileData1 }
     *     
     */
    public SensitiveMobileData1 getSnstvMobData() {
        return snstvMobData;
    }

    /**
     * Sets the value of the snstvMobData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitiveMobileData1 }
     *     
     */
    public void setSnstvMobData(SensitiveMobileData1 value) {
        this.snstvMobData = value;
    }

    /**
     * Gets the value of the prtctdMobData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType32 }
     *     
     */
    public ContentInformationType32 getPrtctdMobData() {
        return prtctdMobData;
    }

    /**
     * Sets the value of the prtctdMobData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType32 }
     *     
     */
    public void setPrtctdMobData(ContentInformationType32 value) {
        this.prtctdMobData = value;
    }

}
