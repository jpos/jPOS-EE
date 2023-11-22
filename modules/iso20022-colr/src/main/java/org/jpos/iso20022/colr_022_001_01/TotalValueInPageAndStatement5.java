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

package org.jpos.iso20022.colr_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalValueInPageAndStatement5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalValueInPageAndStatement5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlXpsrValOfPg" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlCollHeldValOfPg" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalValueInPageAndStatement5", propOrder = {
    "ttlXpsrValOfPg",
    "ttlCollHeldValOfPg"
})
public class TotalValueInPageAndStatement5 {

    @XmlElement(name = "TtlXpsrValOfPg")
    protected ActiveOrHistoricCurrencyAndAmount ttlXpsrValOfPg;
    @XmlElement(name = "TtlCollHeldValOfPg")
    protected ActiveOrHistoricCurrencyAndAmount ttlCollHeldValOfPg;

    /**
     * Gets the value of the ttlXpsrValOfPg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlXpsrValOfPg() {
        return ttlXpsrValOfPg;
    }

    /**
     * Sets the value of the ttlXpsrValOfPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlXpsrValOfPg(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlXpsrValOfPg = value;
    }

    /**
     * Gets the value of the ttlCollHeldValOfPg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCollHeldValOfPg() {
        return ttlCollHeldValOfPg;
    }

    /**
     * Sets the value of the ttlCollHeldValOfPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlCollHeldValOfPg(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCollHeldValOfPg = value;
    }

}
