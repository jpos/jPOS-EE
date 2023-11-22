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

package org.jpos.iso20022.fxtr_015_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementRateSource1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementRateSource1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RateSrc" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}RateSourceText"/>
 *         <element name="Tm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}Exact4NumericText" minOccurs="0"/>
 *         <element name="CtryCd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}CountryCode" minOccurs="0"/>
 *         <element name="LctnCd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}Exact2AlphaNumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementRateSource1", propOrder = {
    "rateSrc",
    "tm",
    "ctryCd",
    "lctnCd"
})
public class SettlementRateSource1 {

    @XmlElement(name = "RateSrc", required = true)
    protected String rateSrc;
    @XmlElement(name = "Tm")
    protected String tm;
    @XmlElement(name = "CtryCd")
    protected String ctryCd;
    @XmlElement(name = "LctnCd")
    protected String lctnCd;

    /**
     * Gets the value of the rateSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSrc() {
        return rateSrc;
    }

    /**
     * Sets the value of the rateSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSrc(String value) {
        this.rateSrc = value;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTm(String value) {
        this.tm = value;
    }

    /**
     * Gets the value of the ctryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryCd() {
        return ctryCd;
    }

    /**
     * Sets the value of the ctryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryCd(String value) {
        this.ctryCd = value;
    }

    /**
     * Gets the value of the lctnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCd() {
        return lctnCd;
    }

    /**
     * Sets the value of the lctnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctnCd(String value) {
        this.lctnCd = value;
    }

}
