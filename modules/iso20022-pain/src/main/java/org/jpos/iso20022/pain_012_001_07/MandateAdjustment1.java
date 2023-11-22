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

package org.jpos.iso20022.pain_012_001_07;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateAdjustment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MandateAdjustment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtAdjstmntRuleInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.012.001.07}TrueFalseIndicator"/>
 *         <element name="Ctgy" type="{urn:iso:std:iso:20022:tech:xsd:pain.012.001.07}Frequency37Choice" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pain.012.001.07}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:pain.012.001.07}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAdjustment1", propOrder = {
    "dtAdjstmntRuleInd",
    "ctgy",
    "amt",
    "rate"
})
public class MandateAdjustment1 {

    @XmlElement(name = "DtAdjstmntRuleInd")
    protected boolean dtAdjstmntRuleInd;
    @XmlElement(name = "Ctgy")
    protected Frequency37Choice ctgy;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;

    /**
     * Gets the value of the dtAdjstmntRuleInd property.
     * 
     */
    public boolean isDtAdjstmntRuleInd() {
        return dtAdjstmntRuleInd;
    }

    /**
     * Sets the value of the dtAdjstmntRuleInd property.
     * 
     */
    public void setDtAdjstmntRuleInd(boolean value) {
        this.dtAdjstmntRuleInd = value;
    }

    /**
     * Gets the value of the ctgy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency37Choice }
     *     
     */
    public Frequency37Choice getCtgy() {
        return ctgy;
    }

    /**
     * Sets the value of the ctgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency37Choice }
     *     
     */
    public void setCtgy(Frequency37Choice value) {
        this.ctgy = value;
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

}
