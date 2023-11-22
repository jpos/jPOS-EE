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

package org.jpos.iso20022.auth_044_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticsTransparency3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatisticsTransparency3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AvrgDalyTrnvr" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AvrgTxVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="LrgInScale" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}DecimalNumber" minOccurs="0"/>
 *         <element name="StdMktSz" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}DecimalNumber" minOccurs="0"/>
 *         <element name="AvrgDalyNbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}DecimalNumber" minOccurs="0"/>
 *         <element name="TtlNbOfTxsExctd" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}DecimalNumber" minOccurs="0"/>
 *         <element name="TtlVolOfTxsExctd" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}DecimalNumber" minOccurs="0"/>
 *         <element name="TtlNbOfTradgDays" type="{urn:iso:std:iso:20022:tech:xsd:auth.044.001.02}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsTransparency3", propOrder = {
    "avrgDalyTrnvr",
    "avrgTxVal",
    "lrgInScale",
    "stdMktSz",
    "avrgDalyNbOfTxs",
    "ttlNbOfTxsExctd",
    "ttlVolOfTxsExctd",
    "ttlNbOfTradgDays"
})
public class StatisticsTransparency3 {

    @XmlElement(name = "AvrgDalyTrnvr")
    protected ActiveCurrencyAndAmount avrgDalyTrnvr;
    @XmlElement(name = "AvrgTxVal")
    protected ActiveCurrencyAndAmount avrgTxVal;
    @XmlElement(name = "LrgInScale")
    protected BigDecimal lrgInScale;
    @XmlElement(name = "StdMktSz")
    protected BigDecimal stdMktSz;
    @XmlElement(name = "AvrgDalyNbOfTxs")
    protected BigDecimal avrgDalyNbOfTxs;
    @XmlElement(name = "TtlNbOfTxsExctd")
    protected BigDecimal ttlNbOfTxsExctd;
    @XmlElement(name = "TtlVolOfTxsExctd")
    protected BigDecimal ttlVolOfTxsExctd;
    @XmlElement(name = "TtlNbOfTradgDays")
    protected BigDecimal ttlNbOfTradgDays;

    /**
     * Gets the value of the avrgDalyTrnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAvrgDalyTrnvr() {
        return avrgDalyTrnvr;
    }

    /**
     * Sets the value of the avrgDalyTrnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAvrgDalyTrnvr(ActiveCurrencyAndAmount value) {
        this.avrgDalyTrnvr = value;
    }

    /**
     * Gets the value of the avrgTxVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAvrgTxVal() {
        return avrgTxVal;
    }

    /**
     * Sets the value of the avrgTxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAvrgTxVal(ActiveCurrencyAndAmount value) {
        this.avrgTxVal = value;
    }

    /**
     * Gets the value of the lrgInScale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLrgInScale() {
        return lrgInScale;
    }

    /**
     * Sets the value of the lrgInScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLrgInScale(BigDecimal value) {
        this.lrgInScale = value;
    }

    /**
     * Gets the value of the stdMktSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStdMktSz() {
        return stdMktSz;
    }

    /**
     * Sets the value of the stdMktSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStdMktSz(BigDecimal value) {
        this.stdMktSz = value;
    }

    /**
     * Gets the value of the avrgDalyNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvrgDalyNbOfTxs() {
        return avrgDalyNbOfTxs;
    }

    /**
     * Sets the value of the avrgDalyNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvrgDalyNbOfTxs(BigDecimal value) {
        this.avrgDalyNbOfTxs = value;
    }

    /**
     * Gets the value of the ttlNbOfTxsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxsExctd() {
        return ttlNbOfTxsExctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfTxsExctd(BigDecimal value) {
        this.ttlNbOfTxsExctd = value;
    }

    /**
     * Gets the value of the ttlVolOfTxsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlVolOfTxsExctd() {
        return ttlVolOfTxsExctd;
    }

    /**
     * Sets the value of the ttlVolOfTxsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlVolOfTxsExctd(BigDecimal value) {
        this.ttlVolOfTxsExctd = value;
    }

    /**
     * Gets the value of the ttlNbOfTradgDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTradgDays() {
        return ttlNbOfTradgDays;
    }

    /**
     * Sets the value of the ttlNbOfTradgDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfTradgDays(BigDecimal value) {
        this.ttlNbOfTradgDays = value;
    }

}
