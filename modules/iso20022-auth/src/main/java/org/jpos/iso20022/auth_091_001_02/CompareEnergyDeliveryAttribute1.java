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

package org.jpos.iso20022.auth_091_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompareEnergyDeliveryAttribute1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CompareEnergyDeliveryAttribute1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NrgyDlvryIntrvl" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareTimePeriod2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NrgyDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDatePeriod2" minOccurs="0"/>
 *         <element name="NrgyDrtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareDurationType1" minOccurs="0"/>
 *         <element name="NrgyWkDay" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareWeekDay1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NrgyDlvryCpcty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareLongFraction19DecimalNumber1" minOccurs="0"/>
 *         <element name="NrgyQtyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareEnergyQuantityUnit1" minOccurs="0"/>
 *         <element name="NrgyPricTmIntrvlQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CompareAmountAndDirection3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompareEnergyDeliveryAttribute1", propOrder = {
    "nrgyDlvryIntrvl",
    "nrgyDt",
    "nrgyDrtn",
    "nrgyWkDay",
    "nrgyDlvryCpcty",
    "nrgyQtyUnit",
    "nrgyPricTmIntrvlQty"
})
public class CompareEnergyDeliveryAttribute1 {

    @XmlElement(name = "NrgyDlvryIntrvl")
    protected List<CompareTimePeriod2> nrgyDlvryIntrvl;
    @XmlElement(name = "NrgyDt")
    protected CompareDatePeriod2 nrgyDt;
    @XmlElement(name = "NrgyDrtn")
    protected CompareDurationType1 nrgyDrtn;
    @XmlElement(name = "NrgyWkDay")
    protected List<CompareWeekDay1> nrgyWkDay;
    @XmlElement(name = "NrgyDlvryCpcty")
    protected CompareLongFraction19DecimalNumber1 nrgyDlvryCpcty;
    @XmlElement(name = "NrgyQtyUnit")
    protected CompareEnergyQuantityUnit1 nrgyQtyUnit;
    @XmlElement(name = "NrgyPricTmIntrvlQty")
    protected CompareAmountAndDirection3 nrgyPricTmIntrvlQty;

    /**
     * Gets the value of the nrgyDlvryIntrvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nrgyDlvryIntrvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrgyDlvryIntrvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareTimePeriod2 }
     * 
     * 
     * @return
     *     The value of the nrgyDlvryIntrvl property.
     */
    public List<CompareTimePeriod2> getNrgyDlvryIntrvl() {
        if (nrgyDlvryIntrvl == null) {
            nrgyDlvryIntrvl = new ArrayList<>();
        }
        return this.nrgyDlvryIntrvl;
    }

    /**
     * Gets the value of the nrgyDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDatePeriod2 }
     *     
     */
    public CompareDatePeriod2 getNrgyDt() {
        return nrgyDt;
    }

    /**
     * Sets the value of the nrgyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDatePeriod2 }
     *     
     */
    public void setNrgyDt(CompareDatePeriod2 value) {
        this.nrgyDt = value;
    }

    /**
     * Gets the value of the nrgyDrtn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDurationType1 }
     *     
     */
    public CompareDurationType1 getNrgyDrtn() {
        return nrgyDrtn;
    }

    /**
     * Sets the value of the nrgyDrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDurationType1 }
     *     
     */
    public void setNrgyDrtn(CompareDurationType1 value) {
        this.nrgyDrtn = value;
    }

    /**
     * Gets the value of the nrgyWkDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nrgyWkDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrgyWkDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareWeekDay1 }
     * 
     * 
     * @return
     *     The value of the nrgyWkDay property.
     */
    public List<CompareWeekDay1> getNrgyWkDay() {
        if (nrgyWkDay == null) {
            nrgyWkDay = new ArrayList<>();
        }
        return this.nrgyWkDay;
    }

    /**
     * Gets the value of the nrgyDlvryCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public CompareLongFraction19DecimalNumber1 getNrgyDlvryCpcty() {
        return nrgyDlvryCpcty;
    }

    /**
     * Sets the value of the nrgyDlvryCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareLongFraction19DecimalNumber1 }
     *     
     */
    public void setNrgyDlvryCpcty(CompareLongFraction19DecimalNumber1 value) {
        this.nrgyDlvryCpcty = value;
    }

    /**
     * Gets the value of the nrgyQtyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CompareEnergyQuantityUnit1 }
     *     
     */
    public CompareEnergyQuantityUnit1 getNrgyQtyUnit() {
        return nrgyQtyUnit;
    }

    /**
     * Sets the value of the nrgyQtyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareEnergyQuantityUnit1 }
     *     
     */
    public void setNrgyQtyUnit(CompareEnergyQuantityUnit1 value) {
        this.nrgyQtyUnit = value;
    }

    /**
     * Gets the value of the nrgyPricTmIntrvlQty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public CompareAmountAndDirection3 getNrgyPricTmIntrvlQty() {
        return nrgyPricTmIntrvlQty;
    }

    /**
     * Sets the value of the nrgyPricTmIntrvlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection3 }
     *     
     */
    public void setNrgyPricTmIntrvlQty(CompareAmountAndDirection3 value) {
        this.nrgyPricTmIntrvlQty = value;
    }

}
