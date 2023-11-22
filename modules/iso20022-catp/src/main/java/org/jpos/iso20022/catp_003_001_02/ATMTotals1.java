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

package org.jpos.iso20022.catp_003_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTotals1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTotals1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MdiaTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ATMMediaType1Code" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="ATMBal" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ATMCur" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ATMBalNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *         <element name="ATMCurNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTotals1", propOrder = {
    "mdiaTp",
    "ccy",
    "atmBal",
    "atmCur",
    "atmBalNb",
    "atmCurNb"
})
public class ATMTotals1 {

    @XmlElement(name = "MdiaTp")
    @XmlSchemaType(name = "string")
    protected ATMMediaType1Code mdiaTp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "ATMBal")
    protected BigDecimal atmBal;
    @XmlElement(name = "ATMCur")
    protected BigDecimal atmCur;
    @XmlElement(name = "ATMBalNb")
    protected BigDecimal atmBalNb;
    @XmlElement(name = "ATMCurNb")
    protected BigDecimal atmCurNb;

    /**
     * Gets the value of the mdiaTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType1Code }
     *     
     */
    public ATMMediaType1Code getMdiaTp() {
        return mdiaTp;
    }

    /**
     * Sets the value of the mdiaTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType1Code }
     *     
     */
    public void setMdiaTp(ATMMediaType1Code value) {
        this.mdiaTp = value;
    }

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
     * Gets the value of the atmBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMBal() {
        return atmBal;
    }

    /**
     * Sets the value of the atmBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setATMBal(BigDecimal value) {
        this.atmBal = value;
    }

    /**
     * Gets the value of the atmCur property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMCur() {
        return atmCur;
    }

    /**
     * Sets the value of the atmCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setATMCur(BigDecimal value) {
        this.atmCur = value;
    }

    /**
     * Gets the value of the atmBalNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMBalNb() {
        return atmBalNb;
    }

    /**
     * Sets the value of the atmBalNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setATMBalNb(BigDecimal value) {
        this.atmBalNb = value;
    }

    /**
     * Gets the value of the atmCurNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getATMCurNb() {
        return atmCurNb;
    }

    /**
     * Sets the value of the atmCurNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setATMCurNb(BigDecimal value) {
        this.atmCurNb = value;
    }

}
