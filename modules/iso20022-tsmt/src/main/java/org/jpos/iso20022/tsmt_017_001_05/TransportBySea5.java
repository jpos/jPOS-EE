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

package org.jpos.iso20022.tsmt_017_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportBySea5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportBySea5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PortOfLoadng" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text"/>
 *         <element name="PortOfDschrge" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text"/>
 *         <element name="VsslNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="SeaCrrierNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="SeaCrrierCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}CountryCode" minOccurs="0"/>
 *         <element name="CrrierAgtNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="CrrierAgtCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}CountryCode" minOccurs="0"/>
 *         <element name="MstrNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="ChrtrrNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="OwnrNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="IMONb" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Exact7NumericText" minOccurs="0"/>
 *         <element name="VygNb" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportBySea5", propOrder = {
    "portOfLoadng",
    "portOfDschrge",
    "vsslNm",
    "seaCrrierNm",
    "seaCrrierCtry",
    "crrierAgtNm",
    "crrierAgtCtry",
    "mstrNm",
    "chrtrrNm",
    "ownrNm",
    "imoNb",
    "vygNb"
})
public class TransportBySea5 {

    @XmlElement(name = "PortOfLoadng", required = true)
    protected String portOfLoadng;
    @XmlElement(name = "PortOfDschrge", required = true)
    protected String portOfDschrge;
    @XmlElement(name = "VsslNm")
    protected String vsslNm;
    @XmlElement(name = "SeaCrrierNm")
    protected String seaCrrierNm;
    @XmlElement(name = "SeaCrrierCtry")
    protected String seaCrrierCtry;
    @XmlElement(name = "CrrierAgtNm")
    protected String crrierAgtNm;
    @XmlElement(name = "CrrierAgtCtry")
    protected String crrierAgtCtry;
    @XmlElement(name = "MstrNm")
    protected String mstrNm;
    @XmlElement(name = "ChrtrrNm")
    protected String chrtrrNm;
    @XmlElement(name = "OwnrNm")
    protected String ownrNm;
    @XmlElement(name = "IMONb")
    protected String imoNb;
    @XmlElement(name = "VygNb")
    protected String vygNb;

    /**
     * Gets the value of the portOfLoadng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfLoadng() {
        return portOfLoadng;
    }

    /**
     * Sets the value of the portOfLoadng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOfLoadng(String value) {
        this.portOfLoadng = value;
    }

    /**
     * Gets the value of the portOfDschrge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfDschrge() {
        return portOfDschrge;
    }

    /**
     * Sets the value of the portOfDschrge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOfDschrge(String value) {
        this.portOfDschrge = value;
    }

    /**
     * Gets the value of the vsslNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsslNm() {
        return vsslNm;
    }

    /**
     * Sets the value of the vsslNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsslNm(String value) {
        this.vsslNm = value;
    }

    /**
     * Gets the value of the seaCrrierNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeaCrrierNm() {
        return seaCrrierNm;
    }

    /**
     * Sets the value of the seaCrrierNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeaCrrierNm(String value) {
        this.seaCrrierNm = value;
    }

    /**
     * Gets the value of the seaCrrierCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeaCrrierCtry() {
        return seaCrrierCtry;
    }

    /**
     * Sets the value of the seaCrrierCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeaCrrierCtry(String value) {
        this.seaCrrierCtry = value;
    }

    /**
     * Gets the value of the crrierAgtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtNm() {
        return crrierAgtNm;
    }

    /**
     * Sets the value of the crrierAgtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrrierAgtNm(String value) {
        this.crrierAgtNm = value;
    }

    /**
     * Gets the value of the crrierAgtCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtCtry() {
        return crrierAgtCtry;
    }

    /**
     * Sets the value of the crrierAgtCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrrierAgtCtry(String value) {
        this.crrierAgtCtry = value;
    }

    /**
     * Gets the value of the mstrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrNm() {
        return mstrNm;
    }

    /**
     * Sets the value of the mstrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrNm(String value) {
        this.mstrNm = value;
    }

    /**
     * Gets the value of the chrtrrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrtrrNm() {
        return chrtrrNm;
    }

    /**
     * Sets the value of the chrtrrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrtrrNm(String value) {
        this.chrtrrNm = value;
    }

    /**
     * Gets the value of the ownrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrNm() {
        return ownrNm;
    }

    /**
     * Sets the value of the ownrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnrNm(String value) {
        this.ownrNm = value;
    }

    /**
     * Gets the value of the imoNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMONb() {
        return imoNb;
    }

    /**
     * Sets the value of the imoNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMONb(String value) {
        this.imoNb = value;
    }

    /**
     * Gets the value of the vygNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVygNb() {
        return vygNb;
    }

    /**
     * Sets the value of the vygNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVygNb(String value) {
        this.vygNb = value;
    }

}
