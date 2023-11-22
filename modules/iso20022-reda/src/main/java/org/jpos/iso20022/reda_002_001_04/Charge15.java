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

package org.jpos.iso20022.reda_002_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Charge15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Charge15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="Tp" type="{urn:swift:xsd:reda.002.001.04}ChargeType9Code"/>
 *           <element name="XtndedTp" type="{urn:swift:xsd:reda.002.001.04}Extended350Code"/>
 *         </choice>
 *         <choice>
 *           <element name="Amt" type="{urn:swift:xsd:reda.002.001.04}ActiveCurrencyAnd13DecimalAmount"/>
 *           <element name="Rate" type="{urn:swift:xsd:reda.002.001.04}PercentageRate"/>
 *         </choice>
 *         <choice>
 *           <element name="ClctnBsis" type="{urn:swift:xsd:reda.002.001.04}CalculationBasis2Code" minOccurs="0"/>
 *           <element name="XtndedClctnBsis" type="{urn:swift:xsd:reda.002.001.04}Extended350Code" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge15", propOrder = {
    "tp",
    "xtndedTp",
    "amt",
    "rate",
    "clctnBsis",
    "xtndedClctnBsis"
})
public class Charge15 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ChargeType9Code tp;
    @XmlElement(name = "XtndedTp")
    protected String xtndedTp;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "ClctnBsis")
    @XmlSchemaType(name = "string")
    protected CalculationBasis2Code clctnBsis;
    @XmlElement(name = "XtndedClctnBsis")
    protected String xtndedClctnBsis;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType9Code }
     *     
     */
    public ChargeType9Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType9Code }
     *     
     */
    public void setTp(ChargeType9Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the xtndedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedTp() {
        return xtndedTp;
    }

    /**
     * Sets the value of the xtndedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedTp(String value) {
        this.xtndedTp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAnd13DecimalAmount value) {
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

    /**
     * Gets the value of the clctnBsis property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationBasis2Code }
     *     
     */
    public CalculationBasis2Code getClctnBsis() {
        return clctnBsis;
    }

    /**
     * Sets the value of the clctnBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationBasis2Code }
     *     
     */
    public void setClctnBsis(CalculationBasis2Code value) {
        this.clctnBsis = value;
    }

    /**
     * Gets the value of the xtndedClctnBsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedClctnBsis() {
        return xtndedClctnBsis;
    }

    /**
     * Sets the value of the xtndedClctnBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedClctnBsis(String value) {
        this.xtndedClctnBsis = value;
    }

}
