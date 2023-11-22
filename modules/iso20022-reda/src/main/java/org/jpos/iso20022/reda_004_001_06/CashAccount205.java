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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashAccount205 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashAccount205">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="PmryAcct" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}CashAccount206" minOccurs="0"/>
 *         <element name="ScndryAcct" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}CashAccount206" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount205", propOrder = {
    "ccy",
    "pmryAcct",
    "scndryAcct"
})
public class CashAccount205 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "PmryAcct")
    protected CashAccount206 pmryAcct;
    @XmlElement(name = "ScndryAcct")
    protected CashAccount206 scndryAcct;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the pmryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount206 }
     *     
     */
    public CashAccount206 getPmryAcct() {
        return pmryAcct;
    }

    /**
     * Sets the value of the pmryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount206 }
     *     
     */
    public void setPmryAcct(CashAccount206 value) {
        this.pmryAcct = value;
    }

    /**
     * Gets the value of the scndryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount206 }
     *     
     */
    public CashAccount206 getScndryAcct() {
        return scndryAcct;
    }

    /**
     * Sets the value of the scndryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount206 }
     *     
     */
    public void setScndryAcct(CashAccount206 value) {
        this.scndryAcct = value;
    }

}
