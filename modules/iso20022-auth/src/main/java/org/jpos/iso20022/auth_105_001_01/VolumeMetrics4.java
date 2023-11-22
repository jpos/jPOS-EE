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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumeMetrics4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VolumeMetrics4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReuseVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ReuseValue1Choice" minOccurs="0"/>
 *         <element name="RinvstdCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeMetrics4", propOrder = {
    "reuseVal",
    "rinvstdCshAmt"
})
public class VolumeMetrics4 {

    @XmlElement(name = "ReuseVal")
    protected ReuseValue1Choice reuseVal;
    @XmlElement(name = "RinvstdCshAmt")
    protected ActiveOrHistoricCurrencyAndAmount rinvstdCshAmt;

    /**
     * Gets the value of the reuseVal property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseValue1Choice }
     *     
     */
    public ReuseValue1Choice getReuseVal() {
        return reuseVal;
    }

    /**
     * Sets the value of the reuseVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseValue1Choice }
     *     
     */
    public void setReuseVal(ReuseValue1Choice value) {
        this.reuseVal = value;
    }

    /**
     * Gets the value of the rinvstdCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRinvstdCshAmt() {
        return rinvstdCshAmt;
    }

    /**
     * Sets the value of the rinvstdCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setRinvstdCshAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rinvstdCshAmt = value;
    }

}
