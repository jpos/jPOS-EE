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
 * <p>Java class for PostedMarginOrCollateral4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PostedMarginOrCollateral4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitlMrgnPstd" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="VartnMrgnPstd" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XcssCollPstd" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostedMarginOrCollateral4", propOrder = {
    "initlMrgnPstd",
    "vartnMrgnPstd",
    "xcssCollPstd"
})
public class PostedMarginOrCollateral4 {

    @XmlElement(name = "InitlMrgnPstd")
    protected ActiveOrHistoricCurrencyAndAmount initlMrgnPstd;
    @XmlElement(name = "VartnMrgnPstd")
    protected ActiveOrHistoricCurrencyAndAmount vartnMrgnPstd;
    @XmlElement(name = "XcssCollPstd")
    protected ActiveOrHistoricCurrencyAndAmount xcssCollPstd;

    /**
     * Gets the value of the initlMrgnPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getInitlMrgnPstd() {
        return initlMrgnPstd;
    }

    /**
     * Sets the value of the initlMrgnPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setInitlMrgnPstd(ActiveOrHistoricCurrencyAndAmount value) {
        this.initlMrgnPstd = value;
    }

    /**
     * Gets the value of the vartnMrgnPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getVartnMrgnPstd() {
        return vartnMrgnPstd;
    }

    /**
     * Sets the value of the vartnMrgnPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setVartnMrgnPstd(ActiveOrHistoricCurrencyAndAmount value) {
        this.vartnMrgnPstd = value;
    }

    /**
     * Gets the value of the xcssCollPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getXcssCollPstd() {
        return xcssCollPstd;
    }

    /**
     * Sets the value of the xcssCollPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setXcssCollPstd(ActiveOrHistoricCurrencyAndAmount value) {
        this.xcssCollPstd = value;
    }

}
