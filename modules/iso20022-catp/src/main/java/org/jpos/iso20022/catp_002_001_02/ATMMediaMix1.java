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

package org.jpos.iso20022.catp_002_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMMediaMix1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMMediaMix1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshUnitNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}Number" minOccurs="0"/>
 *         <element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}Number"/>
 *         <element name="UnitVal" type="{urn:iso:std:iso:20022:tech:xsd:catp.002.001.02}ImpliedCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMMediaMix1", propOrder = {
    "cshUnitNb",
    "nb",
    "unitVal"
})
public class ATMMediaMix1 {

    @XmlElement(name = "CshUnitNb")
    protected BigDecimal cshUnitNb;
    @XmlElement(name = "Nb", required = true)
    protected BigDecimal nb;
    @XmlElement(name = "UnitVal", required = true)
    protected BigDecimal unitVal;

    /**
     * Gets the value of the cshUnitNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshUnitNb() {
        return cshUnitNb;
    }

    /**
     * Sets the value of the cshUnitNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCshUnitNb(BigDecimal value) {
        this.cshUnitNb = value;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNb(BigDecimal value) {
        this.nb = value;
    }

    /**
     * Gets the value of the unitVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitVal() {
        return unitVal;
    }

    /**
     * Sets the value of the unitVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitVal(BigDecimal value) {
        this.unitVal = value;
    }

}
