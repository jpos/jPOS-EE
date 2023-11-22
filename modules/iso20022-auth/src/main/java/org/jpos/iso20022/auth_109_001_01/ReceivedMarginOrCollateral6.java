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

package org.jpos.iso20022.auth_109_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceivedMarginOrCollateral6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReceivedMarginOrCollateral6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitlMrgnRcvdPreHrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.109.001.01}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *         <element name="InitlMrgnRcvdPstHrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.109.001.01}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *         <element name="VartnMrgnRcvdPreHrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.109.001.01}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *         <element name="VartnMrgnRcvdPstHrcut" type="{urn:iso:std:iso:20022:tech:xsd:auth.109.001.01}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *         <element name="XcssCollRcvd" type="{urn:iso:std:iso:20022:tech:xsd:auth.109.001.01}ActiveOrHistoricCurrencyAnd20DecimalAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivedMarginOrCollateral6", propOrder = {
    "initlMrgnRcvdPreHrcut",
    "initlMrgnRcvdPstHrcut",
    "vartnMrgnRcvdPreHrcut",
    "vartnMrgnRcvdPstHrcut",
    "xcssCollRcvd"
})
public class ReceivedMarginOrCollateral6 {

    @XmlElement(name = "InitlMrgnRcvdPreHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount initlMrgnRcvdPreHrcut;
    @XmlElement(name = "InitlMrgnRcvdPstHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount initlMrgnRcvdPstHrcut;
    @XmlElement(name = "VartnMrgnRcvdPreHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount vartnMrgnRcvdPreHrcut;
    @XmlElement(name = "VartnMrgnRcvdPstHrcut")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount vartnMrgnRcvdPstHrcut;
    @XmlElement(name = "XcssCollRcvd")
    protected ActiveOrHistoricCurrencyAnd20DecimalAmount xcssCollRcvd;

    /**
     * Gets the value of the initlMrgnRcvdPreHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getInitlMrgnRcvdPreHrcut() {
        return initlMrgnRcvdPreHrcut;
    }

    /**
     * Sets the value of the initlMrgnRcvdPreHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setInitlMrgnRcvdPreHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.initlMrgnRcvdPreHrcut = value;
    }

    /**
     * Gets the value of the initlMrgnRcvdPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getInitlMrgnRcvdPstHrcut() {
        return initlMrgnRcvdPstHrcut;
    }

    /**
     * Sets the value of the initlMrgnRcvdPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setInitlMrgnRcvdPstHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.initlMrgnRcvdPstHrcut = value;
    }

    /**
     * Gets the value of the vartnMrgnRcvdPreHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getVartnMrgnRcvdPreHrcut() {
        return vartnMrgnRcvdPreHrcut;
    }

    /**
     * Sets the value of the vartnMrgnRcvdPreHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setVartnMrgnRcvdPreHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.vartnMrgnRcvdPreHrcut = value;
    }

    /**
     * Gets the value of the vartnMrgnRcvdPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getVartnMrgnRcvdPstHrcut() {
        return vartnMrgnRcvdPstHrcut;
    }

    /**
     * Sets the value of the vartnMrgnRcvdPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setVartnMrgnRcvdPstHrcut(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.vartnMrgnRcvdPstHrcut = value;
    }

    /**
     * Gets the value of the xcssCollRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd20DecimalAmount getXcssCollRcvd() {
        return xcssCollRcvd;
    }

    /**
     * Sets the value of the xcssCollRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd20DecimalAmount }
     *     
     */
    public void setXcssCollRcvd(ActiveOrHistoricCurrencyAnd20DecimalAmount value) {
        this.xcssCollRcvd = value;
    }

}
