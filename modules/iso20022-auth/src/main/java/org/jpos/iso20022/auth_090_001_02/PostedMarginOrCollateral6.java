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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostedMarginOrCollateral6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PostedMarginOrCollateral6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitlMrgnPstdPreHrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *         <element name="InitlMrgnPstdPstHrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *         <element name="VartnMrgnPstdPreHrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *         <element name="VartnMrgnPstdPstHrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *         <element name="XcssCollPstd" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostedMarginOrCollateral6", propOrder = {
    "initlMrgnPstdPreHrcut",
    "initlMrgnPstdPstHrcut",
    "vartnMrgnPstdPreHrcut",
    "vartnMrgnPstdPstHrcut",
    "xcssCollPstd"
})
public class PostedMarginOrCollateral6 {

    @XmlElement(name = "InitlMrgnPstdPreHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount initlMrgnPstdPreHrcut;
    @XmlElement(name = "InitlMrgnPstdPstHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount initlMrgnPstdPstHrcut;
    @XmlElement(name = "VartnMrgnPstdPreHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount vartnMrgnPstdPreHrcut;
    @XmlElement(name = "VartnMrgnPstdPstHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount vartnMrgnPstdPstHrcut;
    @XmlElement(name = "XcssCollPstd")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount xcssCollPstd;

    /**
     * Gets the value of the initlMrgnPstdPreHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getInitlMrgnPstdPreHrcut() {
        return initlMrgnPstdPreHrcut;
    }

    /**
     * Sets the value of the initlMrgnPstdPreHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setInitlMrgnPstdPreHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.initlMrgnPstdPreHrcut = value;
    }

    /**
     * Gets the value of the initlMrgnPstdPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getInitlMrgnPstdPstHrcut() {
        return initlMrgnPstdPstHrcut;
    }

    /**
     * Sets the value of the initlMrgnPstdPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setInitlMrgnPstdPstHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.initlMrgnPstdPstHrcut = value;
    }

    /**
     * Gets the value of the vartnMrgnPstdPreHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getVartnMrgnPstdPreHrcut() {
        return vartnMrgnPstdPreHrcut;
    }

    /**
     * Sets the value of the vartnMrgnPstdPreHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setVartnMrgnPstdPreHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.vartnMrgnPstdPreHrcut = value;
    }

    /**
     * Gets the value of the vartnMrgnPstdPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getVartnMrgnPstdPstHrcut() {
        return vartnMrgnPstdPstHrcut;
    }

    /**
     * Sets the value of the vartnMrgnPstdPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setVartnMrgnPstdPstHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.vartnMrgnPstdPstHrcut = value;
    }

    /**
     * Gets the value of the xcssCollPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getXcssCollPstd() {
        return xcssCollPstd;
    }

    /**
     * Sets the value of the xcssCollPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setXcssCollPstd(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.xcssCollPstd = value;
    }

}
