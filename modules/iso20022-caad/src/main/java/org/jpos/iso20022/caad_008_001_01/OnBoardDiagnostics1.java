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

package org.jpos.iso20022.caad_008_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnBoardDiagnostics1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OnBoardDiagnostics1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NgnIdleTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max10NumberFraction2" minOccurs="0"/>
 *         <element name="NgnTtlIdleTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max10NumberFraction2" minOccurs="0"/>
 *         <element name="NgnHrs" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max10NumberFraction2" minOccurs="0"/>
 *         <element name="NgnTtlTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max6NumberFraction2" minOccurs="0"/>
 *         <element name="NgnLd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max12NumericText" minOccurs="0"/>
 *         <element name="NgnRPM" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max5NumericText" minOccurs="0"/>
 *         <element name="NgnOilTmprtr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max6NumberFraction2" minOccurs="0"/>
 *         <element name="NgnOilPrssr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max3NumericText" minOccurs="0"/>
 *         <element name="NgnOilLifeRmng" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max3NumericText" minOccurs="0"/>
 *         <element name="ChckNgnWrngSts" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="FuelTankLvlStart" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *         <element name="FuelGaugeLvl" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *         <element name="FuelEcnmy" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max6NumberFraction2" minOccurs="0"/>
 *         <element name="RfrgrtnHrs" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max10NumberFraction2" minOccurs="0"/>
 *         <element name="RfrgrtnTmprtr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max6NumberFraction2" minOccurs="0"/>
 *         <element name="CoolntTmprtr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max6NumberFraction2" minOccurs="0"/>
 *         <element name="BttryVltg" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *         <element name="HardBrakg" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *         <element name="HardAcclrtn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max4NumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnBoardDiagnostics1", propOrder = {
    "ngnIdleTm",
    "ngnTtlIdleTm",
    "ngnHrs",
    "ngnTtlTm",
    "ngnLd",
    "ngnRPM",
    "ngnOilTmprtr",
    "ngnOilPrssr",
    "ngnOilLifeRmng",
    "chckNgnWrngSts",
    "fuelTankLvlStart",
    "fuelGaugeLvl",
    "fuelEcnmy",
    "rfrgrtnHrs",
    "rfrgrtnTmprtr",
    "coolntTmprtr",
    "bttryVltg",
    "hardBrakg",
    "hardAcclrtn"
})
public class OnBoardDiagnostics1 {

    @XmlElement(name = "NgnIdleTm")
    protected BigDecimal ngnIdleTm;
    @XmlElement(name = "NgnTtlIdleTm")
    protected BigDecimal ngnTtlIdleTm;
    @XmlElement(name = "NgnHrs")
    protected BigDecimal ngnHrs;
    @XmlElement(name = "NgnTtlTm")
    protected BigDecimal ngnTtlTm;
    @XmlElement(name = "NgnLd")
    protected String ngnLd;
    @XmlElement(name = "NgnRPM")
    protected String ngnRPM;
    @XmlElement(name = "NgnOilTmprtr")
    protected BigDecimal ngnOilTmprtr;
    @XmlElement(name = "NgnOilPrssr")
    protected String ngnOilPrssr;
    @XmlElement(name = "NgnOilLifeRmng")
    protected String ngnOilLifeRmng;
    @XmlElement(name = "ChckNgnWrngSts")
    protected String chckNgnWrngSts;
    @XmlElement(name = "FuelTankLvlStart")
    protected String fuelTankLvlStart;
    @XmlElement(name = "FuelGaugeLvl")
    protected String fuelGaugeLvl;
    @XmlElement(name = "FuelEcnmy")
    protected BigDecimal fuelEcnmy;
    @XmlElement(name = "RfrgrtnHrs")
    protected BigDecimal rfrgrtnHrs;
    @XmlElement(name = "RfrgrtnTmprtr")
    protected BigDecimal rfrgrtnTmprtr;
    @XmlElement(name = "CoolntTmprtr")
    protected BigDecimal coolntTmprtr;
    @XmlElement(name = "BttryVltg")
    protected String bttryVltg;
    @XmlElement(name = "HardBrakg")
    protected String hardBrakg;
    @XmlElement(name = "HardAcclrtn")
    protected String hardAcclrtn;

    /**
     * Gets the value of the ngnIdleTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnIdleTm() {
        return ngnIdleTm;
    }

    /**
     * Sets the value of the ngnIdleTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNgnIdleTm(BigDecimal value) {
        this.ngnIdleTm = value;
    }

    /**
     * Gets the value of the ngnTtlIdleTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnTtlIdleTm() {
        return ngnTtlIdleTm;
    }

    /**
     * Sets the value of the ngnTtlIdleTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNgnTtlIdleTm(BigDecimal value) {
        this.ngnTtlIdleTm = value;
    }

    /**
     * Gets the value of the ngnHrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnHrs() {
        return ngnHrs;
    }

    /**
     * Sets the value of the ngnHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNgnHrs(BigDecimal value) {
        this.ngnHrs = value;
    }

    /**
     * Gets the value of the ngnTtlTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnTtlTm() {
        return ngnTtlTm;
    }

    /**
     * Sets the value of the ngnTtlTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNgnTtlTm(BigDecimal value) {
        this.ngnTtlTm = value;
    }

    /**
     * Gets the value of the ngnLd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgnLd() {
        return ngnLd;
    }

    /**
     * Sets the value of the ngnLd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgnLd(String value) {
        this.ngnLd = value;
    }

    /**
     * Gets the value of the ngnRPM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgnRPM() {
        return ngnRPM;
    }

    /**
     * Sets the value of the ngnRPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgnRPM(String value) {
        this.ngnRPM = value;
    }

    /**
     * Gets the value of the ngnOilTmprtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNgnOilTmprtr() {
        return ngnOilTmprtr;
    }

    /**
     * Sets the value of the ngnOilTmprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNgnOilTmprtr(BigDecimal value) {
        this.ngnOilTmprtr = value;
    }

    /**
     * Gets the value of the ngnOilPrssr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgnOilPrssr() {
        return ngnOilPrssr;
    }

    /**
     * Sets the value of the ngnOilPrssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgnOilPrssr(String value) {
        this.ngnOilPrssr = value;
    }

    /**
     * Gets the value of the ngnOilLifeRmng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgnOilLifeRmng() {
        return ngnOilLifeRmng;
    }

    /**
     * Sets the value of the ngnOilLifeRmng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgnOilLifeRmng(String value) {
        this.ngnOilLifeRmng = value;
    }

    /**
     * Gets the value of the chckNgnWrngSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckNgnWrngSts() {
        return chckNgnWrngSts;
    }

    /**
     * Sets the value of the chckNgnWrngSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckNgnWrngSts(String value) {
        this.chckNgnWrngSts = value;
    }

    /**
     * Gets the value of the fuelTankLvlStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelTankLvlStart() {
        return fuelTankLvlStart;
    }

    /**
     * Sets the value of the fuelTankLvlStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelTankLvlStart(String value) {
        this.fuelTankLvlStart = value;
    }

    /**
     * Gets the value of the fuelGaugeLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelGaugeLvl() {
        return fuelGaugeLvl;
    }

    /**
     * Sets the value of the fuelGaugeLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelGaugeLvl(String value) {
        this.fuelGaugeLvl = value;
    }

    /**
     * Gets the value of the fuelEcnmy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelEcnmy() {
        return fuelEcnmy;
    }

    /**
     * Sets the value of the fuelEcnmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelEcnmy(BigDecimal value) {
        this.fuelEcnmy = value;
    }

    /**
     * Gets the value of the rfrgrtnHrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRfrgrtnHrs() {
        return rfrgrtnHrs;
    }

    /**
     * Sets the value of the rfrgrtnHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRfrgrtnHrs(BigDecimal value) {
        this.rfrgrtnHrs = value;
    }

    /**
     * Gets the value of the rfrgrtnTmprtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRfrgrtnTmprtr() {
        return rfrgrtnTmprtr;
    }

    /**
     * Sets the value of the rfrgrtnTmprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRfrgrtnTmprtr(BigDecimal value) {
        this.rfrgrtnTmprtr = value;
    }

    /**
     * Gets the value of the coolntTmprtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoolntTmprtr() {
        return coolntTmprtr;
    }

    /**
     * Sets the value of the coolntTmprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoolntTmprtr(BigDecimal value) {
        this.coolntTmprtr = value;
    }

    /**
     * Gets the value of the bttryVltg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBttryVltg() {
        return bttryVltg;
    }

    /**
     * Sets the value of the bttryVltg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBttryVltg(String value) {
        this.bttryVltg = value;
    }

    /**
     * Gets the value of the hardBrakg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardBrakg() {
        return hardBrakg;
    }

    /**
     * Sets the value of the hardBrakg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardBrakg(String value) {
        this.hardBrakg = value;
    }

    /**
     * Gets the value of the hardAcclrtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardAcclrtn() {
        return hardAcclrtn;
    }

    /**
     * Sets the value of the hardAcclrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardAcclrtn(String value) {
        this.hardAcclrtn = value;
    }

}
