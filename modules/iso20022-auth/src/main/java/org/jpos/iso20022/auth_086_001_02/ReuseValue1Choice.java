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

package org.jpos.iso20022.auth_086_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReuseValue1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReuseValue1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Actl" type="{urn:iso:std:iso:20022:tech:xsd:auth.086.001.02}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="Estmtd" type="{urn:iso:std:iso:20022:tech:xsd:auth.086.001.02}ActiveOrHistoricCurrencyAndAmount"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReuseValue1Choice", propOrder = {
    "actl",
    "estmtd"
})
public class ReuseValue1Choice {

    @XmlElement(name = "Actl")
    protected ActiveOrHistoricCurrencyAndAmount actl;
    @XmlElement(name = "Estmtd")
    protected ActiveOrHistoricCurrencyAndAmount estmtd;

    /**
     * Gets the value of the actl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActl() {
        return actl;
    }

    /**
     * Sets the value of the actl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setActl(ActiveOrHistoricCurrencyAndAmount value) {
        this.actl = value;
    }

    /**
     * Gets the value of the estmtd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getEstmtd() {
        return estmtd;
    }

    /**
     * Sets the value of the estmtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setEstmtd(ActiveOrHistoricCurrencyAndAmount value) {
        this.estmtd = value;
    }

}
