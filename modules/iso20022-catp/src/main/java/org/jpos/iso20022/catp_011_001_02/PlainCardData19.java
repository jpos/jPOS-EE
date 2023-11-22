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

package org.jpos.iso20022.catp_011_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlainCardData19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PlainCardData19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PAN" type="{urn:iso:std:iso:20022:tech:xsd:catp.011.001.02}Min8Max28NumericText" minOccurs="0"/>
 *         <element name="CardSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.011.001.02}Min2Max3NumericText" minOccurs="0"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.011.001.02}Max10Text" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.011.001.02}Max10Text" minOccurs="0"/>
 *         <element name="Trck1" type="{urn:iso:std:iso:20022:tech:xsd:catp.011.001.02}Max76Text" minOccurs="0"/>
 *         <element name="Trck2" type="{urn:iso:std:iso:20022:tech:xsd:catp.011.001.02}Max37Text" minOccurs="0"/>
 *         <element name="Trck3" type="{urn:iso:std:iso:20022:tech:xsd:catp.011.001.02}Max104Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainCardData19", propOrder = {
    "pan",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "trck1",
    "trck2",
    "trck3"
})
public class PlainCardData19 {

    @XmlElement(name = "PAN")
    protected String pan;
    @XmlElement(name = "CardSeqNb")
    protected String cardSeqNb;
    @XmlElement(name = "FctvDt")
    protected String fctvDt;
    @XmlElement(name = "XpryDt")
    protected String xpryDt;
    @XmlElement(name = "Trck1")
    protected String trck1;
    @XmlElement(name = "Trck2")
    protected String trck2;
    @XmlElement(name = "Trck3")
    protected String trck3;

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the cardSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNb() {
        return cardSeqNb;
    }

    /**
     * Sets the value of the cardSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSeqNb(String value) {
        this.cardSeqNb = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFctvDt(String value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpryDt(String value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the trck1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck1() {
        return trck1;
    }

    /**
     * Sets the value of the trck1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrck1(String value) {
        this.trck1 = value;
    }

    /**
     * Gets the value of the trck2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck2() {
        return trck2;
    }

    /**
     * Sets the value of the trck2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrck2(String value) {
        this.trck2 = value;
    }

    /**
     * Gets the value of the trck3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck3() {
        return trck3;
    }

    /**
     * Sets the value of the trck3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrck3(String value) {
        this.trck3 = value;
    }

}
