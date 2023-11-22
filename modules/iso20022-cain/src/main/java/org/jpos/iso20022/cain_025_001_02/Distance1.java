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

package org.jpos.iso20022.cain_025_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Distance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Distance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}UnitOfMeasure10Code" minOccurs="0"/>
 *         <element name="OdmtrStart" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max10NumericText" minOccurs="0"/>
 *         <element name="OdmtrRtr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max10NumericText" minOccurs="0"/>
 *         <element name="TtlDstnc" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max10NumericText" minOccurs="0"/>
 *         <element name="FreeDstnc" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max10NumericText" minOccurs="0"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Distance1", propOrder = {
    "unitOfMeasr",
    "odmtrStart",
    "odmtrRtr",
    "ttlDstnc",
    "freeDstnc",
    "rate"
})
public class Distance1 {

    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure10Code unitOfMeasr;
    @XmlElement(name = "OdmtrStart")
    protected String odmtrStart;
    @XmlElement(name = "OdmtrRtr")
    protected String odmtrRtr;
    @XmlElement(name = "TtlDstnc")
    protected String ttlDstnc;
    @XmlElement(name = "FreeDstnc")
    protected String freeDstnc;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure10Code }
     *     
     */
    public UnitOfMeasure10Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure10Code }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure10Code value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the odmtrStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdmtrStart() {
        return odmtrStart;
    }

    /**
     * Sets the value of the odmtrStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdmtrStart(String value) {
        this.odmtrStart = value;
    }

    /**
     * Gets the value of the odmtrRtr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdmtrRtr() {
        return odmtrRtr;
    }

    /**
     * Sets the value of the odmtrRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdmtrRtr(String value) {
        this.odmtrRtr = value;
    }

    /**
     * Gets the value of the ttlDstnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlDstnc() {
        return ttlDstnc;
    }

    /**
     * Sets the value of the ttlDstnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlDstnc(String value) {
        this.ttlDstnc = value;
    }

    /**
     * Gets the value of the freeDstnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeDstnc() {
        return freeDstnc;
    }

    /**
     * Sets the value of the freeDstnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeDstnc(String value) {
        this.freeDstnc = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

}
