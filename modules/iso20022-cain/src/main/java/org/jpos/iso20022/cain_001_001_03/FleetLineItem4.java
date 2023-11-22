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

package org.jpos.iso20022.cain_001_001_03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FleetLineItem4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FleetLineItem4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FuelInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator"/>
 *         <element name="SvcTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}FleetServiceType1Code" minOccurs="0"/>
 *         <element name="FuelBrndCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max4Text" minOccurs="0"/>
 *         <element name="FleetPdctCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max4Text" minOccurs="0"/>
 *         <element name="FleetPdctCtgy" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="FleetPdctQlfr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max6Text" minOccurs="0"/>
 *         <element name="FleetPdctCdAssgnr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="UnitPricTaxInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}UnitOfMeasure1Code" minOccurs="0"/>
 *         <element name="OthrUnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="PdctQty" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}DecimalNumber" minOccurs="0"/>
 *         <element name="DscntAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NonTaxblInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlAmtExclgTax" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlAmtInclgTax" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetLineItem4", propOrder = {
    "fuelInd",
    "svcTp",
    "fuelBrndCd",
    "fleetPdctCd",
    "fleetPdctCtgy",
    "fleetPdctQlfr",
    "fleetPdctCdAssgnr",
    "unitPricTaxInd",
    "unitPric",
    "unitOfMeasr",
    "othrUnitOfMeasr",
    "pdctQty",
    "dscntAmt",
    "nonTaxblInd",
    "tax",
    "ttlAmtExclgTax",
    "ttlAmtInclgTax"
})
public class FleetLineItem4 {

    @XmlElement(name = "FuelInd")
    protected boolean fuelInd;
    @XmlElement(name = "SvcTp")
    @XmlSchemaType(name = "string")
    protected FleetServiceType1Code svcTp;
    @XmlElement(name = "FuelBrndCd")
    protected String fuelBrndCd;
    @XmlElement(name = "FleetPdctCd")
    protected String fleetPdctCd;
    @XmlElement(name = "FleetPdctCtgy")
    protected String fleetPdctCtgy;
    @XmlElement(name = "FleetPdctQlfr")
    protected String fleetPdctQlfr;
    @XmlElement(name = "FleetPdctCdAssgnr")
    protected String fleetPdctCdAssgnr;
    @XmlElement(name = "UnitPricTaxInd")
    protected Boolean unitPricTaxInd;
    @XmlElement(name = "UnitPric")
    protected BigDecimal unitPric;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "OthrUnitOfMeasr")
    protected String othrUnitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "DscntAmt")
    protected BigDecimal dscntAmt;
    @XmlElement(name = "NonTaxblInd")
    protected Boolean nonTaxblInd;
    @XmlElement(name = "Tax")
    protected List<Tax39> tax;
    @XmlElement(name = "TtlAmtExclgTax")
    protected BigDecimal ttlAmtExclgTax;
    @XmlElement(name = "TtlAmtInclgTax")
    protected BigDecimal ttlAmtInclgTax;

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
     * Gets the value of the fuelBrndCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelBrndCd() {
        return fuelBrndCd;
    }

    /**
     * Sets the value of the fuelBrndCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelBrndCd(String value) {
        this.fuelBrndCd = value;
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
     * Gets the value of the fleetPdctQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetPdctQlfr() {
        return fleetPdctQlfr;
    }

    /**
     * Sets the value of the fleetPdctQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleetPdctQlfr(String value) {
        this.fleetPdctQlfr = value;
    }

    /**
     * Gets the value of the fleetPdctCdAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetPdctCdAssgnr() {
        return fleetPdctCdAssgnr;
    }

    /**
     * Sets the value of the fleetPdctCdAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleetPdctCdAssgnr(String value) {
        this.fleetPdctCdAssgnr = value;
    }

    /**
     * Gets the value of the unitPricTaxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnitPricTaxInd() {
        return unitPricTaxInd;
    }

    /**
     * Sets the value of the unitPricTaxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnitPricTaxInd(Boolean value) {
        this.unitPricTaxInd = value;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPric(BigDecimal value) {
        this.unitPric = value;
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
     * Gets the value of the othrUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitOfMeasr() {
        return othrUnitOfMeasr;
    }

    /**
     * Sets the value of the othrUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrUnitOfMeasr(String value) {
        this.othrUnitOfMeasr = value;
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
     * Gets the value of the dscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Sets the value of the dscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDscntAmt(BigDecimal value) {
        this.dscntAmt = value;
    }

    /**
     * Gets the value of the nonTaxblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonTaxblInd() {
        return nonTaxblInd;
    }

    /**
     * Sets the value of the nonTaxblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonTaxblInd(Boolean value) {
        this.nonTaxblInd = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax39> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
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
