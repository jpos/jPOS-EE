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

package org.jpos.iso20022.auth_070_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceivedMarginOrCollateral4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReceivedMarginOrCollateral4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitlMrgnRcvd" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="VartnMrgnRcvd" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XcssCollRcvd" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivedMarginOrCollateral4", propOrder = {
    "initlMrgnRcvd",
    "vartnMrgnRcvd",
    "xcssCollRcvd"
})
public class ReceivedMarginOrCollateral4 {

    @XmlElement(name = "InitlMrgnRcvd")
    protected ActiveOrHistoricCurrencyAndAmount initlMrgnRcvd;
    @XmlElement(name = "VartnMrgnRcvd")
    protected ActiveOrHistoricCurrencyAndAmount vartnMrgnRcvd;
    @XmlElement(name = "XcssCollRcvd")
    protected ActiveOrHistoricCurrencyAndAmount xcssCollRcvd;

    /**
     * Gets the value of the initlMrgnRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getInitlMrgnRcvd() {
        return initlMrgnRcvd;
    }

    /**
     * Sets the value of the initlMrgnRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setInitlMrgnRcvd(ActiveOrHistoricCurrencyAndAmount value) {
        this.initlMrgnRcvd = value;
    }

    /**
     * Gets the value of the vartnMrgnRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getVartnMrgnRcvd() {
        return vartnMrgnRcvd;
    }

    /**
     * Sets the value of the vartnMrgnRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setVartnMrgnRcvd(ActiveOrHistoricCurrencyAndAmount value) {
        this.vartnMrgnRcvd = value;
    }

    /**
     * Gets the value of the xcssCollRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getXcssCollRcvd() {
        return xcssCollRcvd;
    }

    /**
     * Sets the value of the xcssCollRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setXcssCollRcvd(ActiveOrHistoricCurrencyAndAmount value) {
        this.xcssCollRcvd = value;
    }

}
