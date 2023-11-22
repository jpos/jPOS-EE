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

package org.jpos.iso20022.setr_013_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentQuantity29Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentQuantity29Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="UnitsNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}DecimalNumber"/>
 *         <element name="PctgOfTtlSbcptAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}PercentageRate"/>
 *         <element name="NetAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="GrssAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="HldgsRedRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}PercentageRate"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantity29Choice", propOrder = {
    "unitsNb",
    "pctgOfTtlSbcptAmt",
    "netAmt",
    "grssAmt",
    "hldgsRedRate"
})
public class FinancialInstrumentQuantity29Choice {

    @XmlElement(name = "UnitsNb")
    protected BigDecimal unitsNb;
    @XmlElement(name = "PctgOfTtlSbcptAmt")
    protected BigDecimal pctgOfTtlSbcptAmt;
    @XmlElement(name = "NetAmt")
    protected ActiveOrHistoricCurrencyAndAmount netAmt;
    @XmlElement(name = "GrssAmt")
    protected ActiveOrHistoricCurrencyAndAmount grssAmt;
    @XmlElement(name = "HldgsRedRate")
    protected BigDecimal hldgsRedRate;

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitsNb(BigDecimal value) {
        this.unitsNb = value;
    }

    /**
     * Gets the value of the pctgOfTtlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfTtlSbcptAmt() {
        return pctgOfTtlSbcptAmt;
    }

    /**
     * Sets the value of the pctgOfTtlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfTtlSbcptAmt(BigDecimal value) {
        this.pctgOfTtlSbcptAmt = value;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setNetAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.netAmt = value;
    }

    /**
     * Gets the value of the grssAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getGrssAmt() {
        return grssAmt;
    }

    /**
     * Sets the value of the grssAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setGrssAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.grssAmt = value;
    }

    /**
     * Gets the value of the hldgsRedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHldgsRedRate() {
        return hldgsRedRate;
    }

    /**
     * Sets the value of the hldgsRedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHldgsRedRate(BigDecimal value) {
        this.hldgsRedRate = value;
    }

}
