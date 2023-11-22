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

package org.jpos.iso20022.camt_042_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundBalance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundBalance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlUnitsFrUnitOrdrs" type="{urn:swift:xsd:camt.042.001.04}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="TtlUnitsFrCshOrdrs" type="{urn:swift:xsd:camt.042.001.04}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="TtlCshFrUnitOrdrs" type="{urn:swift:xsd:camt.042.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlCshFrCshOrdrs" type="{urn:swift:xsd:camt.042.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundBalance1", propOrder = {
    "ttlUnitsFrUnitOrdrs",
    "ttlUnitsFrCshOrdrs",
    "ttlCshFrUnitOrdrs",
    "ttlCshFrCshOrdrs"
})
public class FundBalance1 {

    @XmlElement(name = "TtlUnitsFrUnitOrdrs")
    protected FinancialInstrumentQuantity1 ttlUnitsFrUnitOrdrs;
    @XmlElement(name = "TtlUnitsFrCshOrdrs")
    protected FinancialInstrumentQuantity1 ttlUnitsFrCshOrdrs;
    @XmlElement(name = "TtlCshFrUnitOrdrs")
    protected ActiveOrHistoricCurrencyAndAmount ttlCshFrUnitOrdrs;
    @XmlElement(name = "TtlCshFrCshOrdrs")
    protected ActiveOrHistoricCurrencyAndAmount ttlCshFrCshOrdrs;

    /**
     * Gets the value of the ttlUnitsFrUnitOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getTtlUnitsFrUnitOrdrs() {
        return ttlUnitsFrUnitOrdrs;
    }

    /**
     * Sets the value of the ttlUnitsFrUnitOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setTtlUnitsFrUnitOrdrs(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsFrUnitOrdrs = value;
    }

    /**
     * Gets the value of the ttlUnitsFrCshOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getTtlUnitsFrCshOrdrs() {
        return ttlUnitsFrCshOrdrs;
    }

    /**
     * Sets the value of the ttlUnitsFrCshOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setTtlUnitsFrCshOrdrs(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsFrCshOrdrs = value;
    }

    /**
     * Gets the value of the ttlCshFrUnitOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCshFrUnitOrdrs() {
        return ttlCshFrUnitOrdrs;
    }

    /**
     * Sets the value of the ttlCshFrUnitOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlCshFrUnitOrdrs(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCshFrUnitOrdrs = value;
    }

    /**
     * Gets the value of the ttlCshFrCshOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCshFrCshOrdrs() {
        return ttlCshFrCshOrdrs;
    }

    /**
     * Sets the value of the ttlCshFrCshOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlCshFrCshOrdrs(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCshFrCshOrdrs = value;
    }

}
