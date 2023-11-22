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

package org.jpos.iso20022.fxtr_017_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyOrDigitalTokenAmount1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyOrDigitalTokenAmount1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="DgtlTknAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.017.001.05}DigitalTokenAmount1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyOrDigitalTokenAmount1Choice", propOrder = {
    "amt",
    "dgtlTknAmt"
})
public class CurrencyOrDigitalTokenAmount1Choice {

    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "DgtlTknAmt")
    protected DigitalTokenAmount1 dgtlTknAmt;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the dgtlTknAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalTokenAmount1 }
     *     
     */
    public DigitalTokenAmount1 getDgtlTknAmt() {
        return dgtlTknAmt;
    }

    /**
     * Sets the value of the dgtlTknAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalTokenAmount1 }
     *     
     */
    public void setDgtlTknAmt(DigitalTokenAmount1 value) {
        this.dgtlTknAmt = value;
    }

}
