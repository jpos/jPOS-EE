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

package org.jpos.iso20022.caaa_002_001_12;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AlphaCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="NmrcCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12}Exact3NumericText" minOccurs="0"/>
 *         <element name="Dcml" type="{urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12}Number" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyDetails2", propOrder = {
    "alphaCd",
    "nmrcCd",
    "dcml",
    "nm"
})
public class CurrencyDetails2 {

    @XmlElement(name = "AlphaCd")
    protected String alphaCd;
    @XmlElement(name = "NmrcCd")
    protected String nmrcCd;
    @XmlElement(name = "Dcml")
    protected BigDecimal dcml;
    @XmlElement(name = "Nm")
    protected String nm;

    /**
     * Gets the value of the alphaCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaCd() {
        return alphaCd;
    }

    /**
     * Sets the value of the alphaCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaCd(String value) {
        this.alphaCd = value;
    }

    /**
     * Gets the value of the nmrcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmrcCd() {
        return nmrcCd;
    }

    /**
     * Sets the value of the nmrcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmrcCd(String value) {
        this.nmrcCd = value;
    }

    /**
     * Gets the value of the dcml property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcml() {
        return dcml;
    }

    /**
     * Sets the value of the dcml property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDcml(BigDecimal value) {
        this.dcml = value;
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
