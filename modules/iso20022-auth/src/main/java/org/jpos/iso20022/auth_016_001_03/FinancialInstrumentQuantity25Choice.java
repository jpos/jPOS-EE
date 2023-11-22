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

package org.jpos.iso20022.auth_016_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentQuantity25Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentQuantity25Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}DecimalNumber"/>
 *         <element name="NmnlVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.016.001.03}ActiveOrHistoricCurrencyAndAmount"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantity25Choice", propOrder = {
    "unit",
    "nmnlVal",
    "mntryVal"
})
public class FinancialInstrumentQuantity25Choice {

    @XmlElement(name = "Unit")
    protected BigDecimal unit;
    @XmlElement(name = "NmnlVal")
    protected ActiveOrHistoricCurrencyAndAmount nmnlVal;
    @XmlElement(name = "MntryVal")
    protected ActiveOrHistoricCurrencyAndAmount mntryVal;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnit(BigDecimal value) {
        this.unit = value;
    }

    /**
     * Gets the value of the nmnlVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getNmnlVal() {
        return nmnlVal;
    }

    /**
     * Sets the value of the nmnlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setNmnlVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.nmnlVal = value;
    }

    /**
     * Gets the value of the mntryVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMntryVal() {
        return mntryVal;
    }

    /**
     * Sets the value of the mntryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setMntryVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.mntryVal = value;
    }

}
