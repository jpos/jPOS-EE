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

package org.jpos.iso20022.auth_030_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyDeliveryAttribute10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EnergyDeliveryAttribute10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlvryIntrvl" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TimePeriodDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlvryDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}DatePeriod1" minOccurs="0"/>
 *         <element name="Drtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}DurationType1Code" minOccurs="0"/>
 *         <element name="WkDay" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}WeekDay3Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlvryCpcty" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Quantity47Choice" minOccurs="0"/>
 *         <element name="QtyUnit" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyQuantityUnit2Choice" minOccurs="0"/>
 *         <element name="PricTmIntrvlQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AmountAndDirection106" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyDeliveryAttribute10", propOrder = {
    "dlvryIntrvl",
    "dlvryDt",
    "drtn",
    "wkDay",
    "dlvryCpcty",
    "qtyUnit",
    "pricTmIntrvlQty"
})
public class EnergyDeliveryAttribute10 {

    @XmlElement(name = "DlvryIntrvl")
    protected List<TimePeriodDetails1> dlvryIntrvl;
    @XmlElement(name = "DlvryDt")
    protected DatePeriod1 dlvryDt;
    @XmlElement(name = "Drtn")
    @XmlSchemaType(name = "string")
    protected DurationType1Code drtn;
    @XmlElement(name = "WkDay")
    @XmlSchemaType(name = "string")
    protected List<WeekDay3Code> wkDay;
    @XmlElement(name = "DlvryCpcty")
    protected Quantity47Choice dlvryCpcty;
    @XmlElement(name = "QtyUnit")
    protected EnergyQuantityUnit2Choice qtyUnit;
    @XmlElement(name = "PricTmIntrvlQty")
    protected AmountAndDirection106 pricTmIntrvlQty;

    /**
     * Gets the value of the dlvryIntrvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryIntrvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryIntrvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodDetails1 }
     * 
     * 
     * @return
     *     The value of the dlvryIntrvl property.
     */
    public List<TimePeriodDetails1> getDlvryIntrvl() {
        if (dlvryIntrvl == null) {
            dlvryIntrvl = new ArrayList<>();
        }
        return this.dlvryIntrvl;
    }

    /**
     * Gets the value of the dlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1 }
     *     
     */
    public DatePeriod1 getDlvryDt() {
        return dlvryDt;
    }

    /**
     * Sets the value of the dlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1 }
     *     
     */
    public void setDlvryDt(DatePeriod1 value) {
        this.dlvryDt = value;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType1Code }
     *     
     */
    public DurationType1Code getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType1Code }
     *     
     */
    public void setDrtn(DurationType1Code value) {
        this.drtn = value;
    }

    /**
     * Gets the value of the wkDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wkDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWkDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeekDay3Code }
     * 
     * 
     * @return
     *     The value of the wkDay property.
     */
    public List<WeekDay3Code> getWkDay() {
        if (wkDay == null) {
            wkDay = new ArrayList<>();
        }
        return this.wkDay;
    }

    /**
     * Gets the value of the dlvryCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity47Choice }
     *     
     */
    public Quantity47Choice getDlvryCpcty() {
        return dlvryCpcty;
    }

    /**
     * Sets the value of the dlvryCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity47Choice }
     *     
     */
    public void setDlvryCpcty(Quantity47Choice value) {
        this.dlvryCpcty = value;
    }

    /**
     * Gets the value of the qtyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyQuantityUnit2Choice }
     *     
     */
    public EnergyQuantityUnit2Choice getQtyUnit() {
        return qtyUnit;
    }

    /**
     * Sets the value of the qtyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyQuantityUnit2Choice }
     *     
     */
    public void setQtyUnit(EnergyQuantityUnit2Choice value) {
        this.qtyUnit = value;
    }

    /**
     * Gets the value of the pricTmIntrvlQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public AmountAndDirection106 getPricTmIntrvlQty() {
        return pricTmIntrvlQty;
    }

    /**
     * Sets the value of the pricTmIntrvlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection106 }
     *     
     */
    public void setPricTmIntrvlQty(AmountAndDirection106 value) {
        this.pricTmIntrvlQty = value;
    }

}
