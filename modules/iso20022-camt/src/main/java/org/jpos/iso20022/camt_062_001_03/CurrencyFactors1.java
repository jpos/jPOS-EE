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

package org.jpos.iso20022.camt_062_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyFactors1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyFactors1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}CurrencyCode"/>
 *         <element name="ShrtPosLmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}ImpliedCurrencyAndAmount"/>
 *         <element name="MinPayInAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}ImpliedCurrencyAndAmount"/>
 *         <element name="VoltlyMrgn" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}PercentageRate"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}AgreedRate2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyFactors1", propOrder = {
    "ccy",
    "shrtPosLmt",
    "minPayInAmt",
    "voltlyMrgn",
    "rate"
})
public class CurrencyFactors1 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "ShrtPosLmt", required = true)
    protected BigDecimal shrtPosLmt;
    @XmlElement(name = "MinPayInAmt", required = true)
    protected BigDecimal minPayInAmt;
    @XmlElement(name = "VoltlyMrgn", required = true)
    protected BigDecimal voltlyMrgn;
    @XmlElement(name = "Rate")
    protected AgreedRate2 rate;

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
     * Gets the value of the shrtPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShrtPosLmt() {
        return shrtPosLmt;
    }

    /**
     * Sets the value of the shrtPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShrtPosLmt(BigDecimal value) {
        this.shrtPosLmt = value;
    }

    /**
     * Gets the value of the minPayInAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPayInAmt() {
        return minPayInAmt;
    }

    /**
     * Sets the value of the minPayInAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPayInAmt(BigDecimal value) {
        this.minPayInAmt = value;
    }

    /**
     * Gets the value of the voltlyMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltlyMrgn() {
        return voltlyMrgn;
    }

    /**
     * Sets the value of the voltlyMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltlyMrgn(BigDecimal value) {
        this.voltlyMrgn = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate2 }
     *     
     */
    public AgreedRate2 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate2 }
     *     
     */
    public void setRate(AgreedRate2 value) {
        this.rate = value;
    }

}
