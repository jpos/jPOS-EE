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

package org.jpos.iso20022.auth_035_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumeCapReport2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VolumeCapReport2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.035.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.035.001.01}ISINOct2015Identifier"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:auth.035.001.01}ActiveOrHistoricCurrencyCode"/>
 *         <element name="TtlTradgVol" type="{urn:iso:std:iso:20022:tech:xsd:auth.035.001.01}ImpliedCurrencyAndAmount"/>
 *         <element name="TtlRefPricTradgVol" type="{urn:iso:std:iso:20022:tech:xsd:auth.035.001.01}ImpliedCurrencyAndAmount"/>
 *         <element name="TtlNgtdTxsTradgVol" type="{urn:iso:std:iso:20022:tech:xsd:auth.035.001.01}ImpliedCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeCapReport2", propOrder = {
    "techRcrdId",
    "id",
    "ccy",
    "ttlTradgVol",
    "ttlRefPricTradgVol",
    "ttlNgtdTxsTradgVol"
})
public class VolumeCapReport2 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "TtlTradgVol", required = true)
    protected BigDecimal ttlTradgVol;
    @XmlElement(name = "TtlRefPricTradgVol", required = true)
    protected BigDecimal ttlRefPricTradgVol;
    @XmlElement(name = "TtlNgtdTxsTradgVol", required = true)
    protected BigDecimal ttlNgtdTxsTradgVol;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the ttlTradgVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlTradgVol() {
        return ttlTradgVol;
    }

    /**
     * Sets the value of the ttlTradgVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlTradgVol(BigDecimal value) {
        this.ttlTradgVol = value;
    }

    /**
     * Gets the value of the ttlRefPricTradgVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlRefPricTradgVol() {
        return ttlRefPricTradgVol;
    }

    /**
     * Sets the value of the ttlRefPricTradgVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlRefPricTradgVol(BigDecimal value) {
        this.ttlRefPricTradgVol = value;
    }

    /**
     * Gets the value of the ttlNgtdTxsTradgVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNgtdTxsTradgVol() {
        return ttlNgtdTxsTradgVol;
    }

    /**
     * Sets the value of the ttlNgtdTxsTradgVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNgtdTxsTradgVol(BigDecimal value) {
        this.ttlNgtdTxsTradgVol = value;
    }

}
