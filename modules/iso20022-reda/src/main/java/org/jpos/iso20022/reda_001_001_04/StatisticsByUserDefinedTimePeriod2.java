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

package org.jpos.iso20022.reda_001_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticsByUserDefinedTimePeriod2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatisticsByUserDefinedTimePeriod2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prd" type="{urn:swift:xsd:reda.001.001.04}DateOrDateTimePeriodChoice"/>
 *         <element name="HghstPricVal" type="{urn:swift:xsd:reda.001.001.04}PriceValue5" minOccurs="0"/>
 *         <element name="LwstPricVal" type="{urn:swift:xsd:reda.001.001.04}PriceValue5" minOccurs="0"/>
 *         <element name="PricChng" type="{urn:swift:xsd:reda.001.001.04}PriceValueChange1" minOccurs="0"/>
 *         <element name="Yld" type="{urn:swift:xsd:reda.001.001.04}PercentageRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsByUserDefinedTimePeriod2", propOrder = {
    "prd",
    "hghstPricVal",
    "lwstPricVal",
    "pricChng",
    "yld"
})
public class StatisticsByUserDefinedTimePeriod2 {

    @XmlElement(name = "Prd", required = true)
    protected DateOrDateTimePeriodChoice prd;
    @XmlElement(name = "HghstPricVal")
    protected PriceValue5 hghstPricVal;
    @XmlElement(name = "LwstPricVal")
    protected PriceValue5 lwstPricVal;
    @XmlElement(name = "PricChng")
    protected PriceValueChange1 pricChng;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public DateOrDateTimePeriodChoice getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public void setPrd(DateOrDateTimePeriodChoice value) {
        this.prd = value;
    }

    /**
     * Gets the value of the hghstPricVal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue5 }
     *     
     */
    public PriceValue5 getHghstPricVal() {
        return hghstPricVal;
    }

    /**
     * Sets the value of the hghstPricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue5 }
     *     
     */
    public void setHghstPricVal(PriceValue5 value) {
        this.hghstPricVal = value;
    }

    /**
     * Gets the value of the lwstPricVal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue5 }
     *     
     */
    public PriceValue5 getLwstPricVal() {
        return lwstPricVal;
    }

    /**
     * Sets the value of the lwstPricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue5 }
     *     
     */
    public void setLwstPricVal(PriceValue5 value) {
        this.lwstPricVal = value;
    }

    /**
     * Gets the value of the pricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueChange1 }
     *     
     */
    public PriceValueChange1 getPricChng() {
        return pricChng;
    }

    /**
     * Sets the value of the pricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueChange1 }
     *     
     */
    public void setPricChng(PriceValueChange1 value) {
        this.pricChng = value;
    }

    /**
     * Gets the value of the yld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYld() {
        return yld;
    }

    /**
     * Sets the value of the yld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYld(BigDecimal value) {
        this.yld = value;
    }

}
