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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualCostOrCharge2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualCostOrCharge2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CostTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ChargeType8Choice"/>
 *         <element name="ExAnteOrExPst" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}IntendedOrActual2Code"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="Sgn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}PlusOrMinusIndicator" minOccurs="0"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}PercentageRate" minOccurs="0"/>
 *         <element name="RefPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Period15" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCostOrCharge2", propOrder = {
    "costTp",
    "exAnteOrExPst",
    "amt",
    "sgn",
    "rate",
    "refPrd",
    "addtlInf"
})
public class IndividualCostOrCharge2 {

    @XmlElement(name = "CostTp", required = true)
    protected ChargeType8Choice costTp;
    @XmlElement(name = "ExAnteOrExPst", required = true)
    @XmlSchemaType(name = "string")
    protected IntendedOrActual2Code exAnteOrExPst;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Sgn")
    protected Boolean sgn;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RefPrd")
    protected Period15 refPrd;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the costTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType8Choice }
     *     
     */
    public ChargeType8Choice getCostTp() {
        return costTp;
    }

    /**
     * Sets the value of the costTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType8Choice }
     *     
     */
    public void setCostTp(ChargeType8Choice value) {
        this.costTp = value;
    }

    /**
     * Gets the value of the exAnteOrExPst property.
     * 
     * @return
     *     possible object is
     *     {@link IntendedOrActual2Code }
     *     
     */
    public IntendedOrActual2Code getExAnteOrExPst() {
        return exAnteOrExPst;
    }

    /**
     * Sets the value of the exAnteOrExPst property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntendedOrActual2Code }
     *     
     */
    public void setExAnteOrExPst(IntendedOrActual2Code value) {
        this.exAnteOrExPst = value;
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
     * Gets the value of the sgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSgn() {
        return sgn;
    }

    /**
     * Sets the value of the sgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSgn(Boolean value) {
        this.sgn = value;
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
     * Gets the value of the refPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period15 }
     *     
     */
    public Period15 getRefPrd() {
        return refPrd;
    }

    /**
     * Sets the value of the refPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period15 }
     *     
     */
    public void setRefPrd(Period15 value) {
        this.refPrd = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public void setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
    }

}
