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

package org.jpos.iso20022.auth_019_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyndicatedLoan2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SyndicatedLoan2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Brrwr" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}TradeParty5"/>
 *         <element name="Lndr" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}TradeParty5" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Shr" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}PercentageRate" minOccurs="0"/>
 *         <element name="XchgRateInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}ExchangeRate1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyndicatedLoan2", propOrder = {
    "brrwr",
    "lndr",
    "amt",
    "shr",
    "xchgRateInf"
})
public class SyndicatedLoan2 {

    @XmlElement(name = "Brrwr", required = true)
    protected TradeParty5 brrwr;
    @XmlElement(name = "Lndr")
    protected TradeParty5 lndr;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Shr")
    protected BigDecimal shr;
    @XmlElement(name = "XchgRateInf")
    protected ExchangeRate1 xchgRateInf;

    /**
     * Gets the value of the brrwr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty5 }
     *     
     */
    public TradeParty5 getBrrwr() {
        return brrwr;
    }

    /**
     * Sets the value of the brrwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty5 }
     *     
     */
    public void setBrrwr(TradeParty5 value) {
        this.brrwr = value;
    }

    /**
     * Gets the value of the lndr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty5 }
     *     
     */
    public TradeParty5 getLndr() {
        return lndr;
    }

    /**
     * Sets the value of the lndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty5 }
     *     
     */
    public void setLndr(TradeParty5 value) {
        this.lndr = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the shr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShr() {
        return shr;
    }

    /**
     * Sets the value of the shr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShr(BigDecimal value) {
        this.shr = value;
    }

    /**
     * Gets the value of the xchgRateInf property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRate1 }
     *     
     */
    public ExchangeRate1 getXchgRateInf() {
        return xchgRateInf;
    }

    /**
     * Sets the value of the xchgRateInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRate1 }
     *     
     */
    public void setXchgRateInf(ExchangeRate1 value) {
        this.xchgRateInf = value;
    }

}
