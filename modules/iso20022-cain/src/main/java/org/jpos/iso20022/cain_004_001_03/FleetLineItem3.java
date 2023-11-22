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

package org.jpos.iso20022.cain_004_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetLineItem3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FleetLineItem3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AllwdItmInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="FuelInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}TrueFalseIndicator"/>
 *         <element name="SvcTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}FleetServiceType1Code" minOccurs="0"/>
 *         <element name="FleetPdctCtgy" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}Max35Text" minOccurs="0"/>
 *         <element name="FleetPdctCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}Max15Text" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}UnitOfMeasure1Code" minOccurs="0"/>
 *         <element name="PdctQty" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}DecimalNumber" minOccurs="0"/>
 *         <element name="TtlAmtExclgTax" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlAmtInclgTax" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetLineItem3", propOrder = {
    "allwdItmInd",
    "fuelInd",
    "svcTp",
    "fleetPdctCtgy",
    "fleetPdctCd",
    "unitOfMeasr",
    "pdctQty",
    "ttlAmtExclgTax",
    "ttlAmtInclgTax"
})
public class FleetLineItem3 {

    @XmlElement(name = "AllwdItmInd")
    protected Boolean allwdItmInd;
    @XmlElement(name = "FuelInd")
    protected boolean fuelInd;
    @XmlElement(name = "SvcTp")
    @XmlSchemaType(name = "string")
    protected FleetServiceType1Code svcTp;
    @XmlElement(name = "FleetPdctCtgy")
    protected String fleetPdctCtgy;
    @XmlElement(name = "FleetPdctCd")
    protected String fleetPdctCd;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "TtlAmtExclgTax")
    protected BigDecimal ttlAmtExclgTax;
    @XmlElement(name = "TtlAmtInclgTax")
    protected BigDecimal ttlAmtInclgTax;

    /**
     * Gets the value of the allwdItmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllwdItmInd() {
        return allwdItmInd;
    }

    /**
     * Sets the value of the allwdItmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllwdItmInd(Boolean value) {
        this.allwdItmInd = value;
    }

    /**
     * Gets the value of the fuelInd property.
     * 
     */
    public boolean isFuelInd() {
        return fuelInd;
    }

    /**
     * Sets the value of the fuelInd property.
     * 
     */
    public void setFuelInd(boolean value) {
        this.fuelInd = value;
    }

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link FleetServiceType1Code }
     *     
     */
    public FleetServiceType1Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetServiceType1Code }
     *     
     */
    public void setSvcTp(FleetServiceType1Code value) {
        this.svcTp = value;
    }

    /**
     * Gets the value of the fleetPdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetPdctCtgy() {
        return fleetPdctCtgy;
    }

    /**
     * Sets the value of the fleetPdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleetPdctCtgy(String value) {
        this.fleetPdctCtgy = value;
    }

    /**
     * Gets the value of the fleetPdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetPdctCd() {
        return fleetPdctCd;
    }

    /**
     * Sets the value of the fleetPdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleetPdctCd(String value) {
        this.fleetPdctCd = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public UnitOfMeasure1Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the pdctQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctQty() {
        return pdctQty;
    }

    /**
     * Sets the value of the pdctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPdctQty(BigDecimal value) {
        this.pdctQty = value;
    }

    /**
     * Gets the value of the ttlAmtExclgTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmtExclgTax() {
        return ttlAmtExclgTax;
    }

    /**
     * Sets the value of the ttlAmtExclgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAmtExclgTax(BigDecimal value) {
        this.ttlAmtExclgTax = value;
    }

    /**
     * Gets the value of the ttlAmtInclgTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmtInclgTax() {
        return ttlAmtInclgTax;
    }

    /**
     * Sets the value of the ttlAmtInclgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAmtInclgTax(BigDecimal value) {
        this.ttlAmtInclgTax = value;
    }

}
