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

package org.jpos.iso20022.catp_007_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyConversion5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyConversion5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SrcCcy" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ActiveCurrencyCode"/>
 *         <element name="SrcCcyNmrc" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ActiveCurrencyCode"/>
 *         <element name="TrgtCcy" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ActiveCurrencyCode"/>
 *         <element name="TrgtCcyNmrc" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Exact3NumericText"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}BaseOneRate"/>
 *         <element name="ClctdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ImpliedCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion5", propOrder = {
    "srcCcy",
    "srcCcyNmrc",
    "trgtCcy",
    "trgtCcyNmrc",
    "rate",
    "clctdAmt"
})
public class CurrencyConversion5 {

    @XmlElement(name = "SrcCcy", required = true)
    protected String srcCcy;
    @XmlElement(name = "SrcCcyNmrc", required = true)
    protected String srcCcyNmrc;
    @XmlElement(name = "TrgtCcy", required = true)
    protected String trgtCcy;
    @XmlElement(name = "TrgtCcyNmrc", required = true)
    protected String trgtCcyNmrc;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "ClctdAmt", required = true)
    protected BigDecimal clctdAmt;

    /**
     * Gets the value of the srcCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCcy() {
        return srcCcy;
    }

    /**
     * Sets the value of the srcCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcCcy(String value) {
        this.srcCcy = value;
    }

    /**
     * Gets the value of the srcCcyNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCcyNmrc() {
        return srcCcyNmrc;
    }

    /**
     * Sets the value of the srcCcyNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcCcyNmrc(String value) {
        this.srcCcyNmrc = value;
    }

    /**
     * Gets the value of the trgtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgtCcy(String value) {
        this.trgtCcy = value;
    }

    /**
     * Gets the value of the trgtCcyNmrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgtCcyNmrc() {
        return trgtCcyNmrc;
    }

    /**
     * Sets the value of the trgtCcyNmrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgtCcyNmrc(String value) {
        this.trgtCcyNmrc = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the clctdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClctdAmt() {
        return clctdAmt;
    }

    /**
     * Sets the value of the clctdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClctdAmt(BigDecimal value) {
        this.clctdAmt = value;
    }

}
