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

package org.jpos.iso20022.casp_006_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlainCardData15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PlainCardData15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PAN" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Min8Max28NumericText"/>
 *         <element name="CardSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Min2Max3NumericText" minOccurs="0"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max10Text" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max10Text"/>
 *         <element name="SvcCd" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Exact3NumericText" minOccurs="0"/>
 *         <element name="Trck1" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max76Text" minOccurs="0"/>
 *         <element name="Trck2" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max37Text" minOccurs="0"/>
 *         <element name="Trck3" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max104Text" minOccurs="0"/>
 *         <element name="CrdhldrNm" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max45Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainCardData15", propOrder = {
    "pan",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "svcCd",
    "trck1",
    "trck2",
    "trck3",
    "crdhldrNm"
})
public class PlainCardData15 {

    @XmlElement(name = "PAN", required = true)
    protected String pan;
    @XmlElement(name = "CardSeqNb")
    protected String cardSeqNb;
    @XmlElement(name = "FctvDt")
    protected String fctvDt;
    @XmlElement(name = "XpryDt", required = true)
    protected String xpryDt;
    @XmlElement(name = "SvcCd")
    protected String svcCd;
    @XmlElement(name = "Trck1")
    protected String trck1;
    @XmlElement(name = "Trck2")
    protected String trck2;
    @XmlElement(name = "Trck3")
    protected String trck3;
    @XmlElement(name = "CrdhldrNm")
    protected String crdhldrNm;

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
     * Gets the value of the svcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCd() {
        return svcCd;
    }

    /**
     * Sets the value of the svcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcCd(String value) {
        this.svcCd = value;
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

    /**
     * Gets the value of the crdhldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdhldrNm() {
        return crdhldrNm;
    }

    /**
     * Sets the value of the crdhldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdhldrNm(String value) {
        this.crdhldrNm = value;
    }

}
