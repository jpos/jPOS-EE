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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticsByPredefinedTimePeriods2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatisticsByPredefinedTimePeriods2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HghstPricVal12Mnths" type="{urn:swift:xsd:reda.002.001.04}PriceValue5" minOccurs="0"/>
 *         <element name="LwstPricVal12Mnths" type="{urn:swift:xsd:reda.002.001.04}PriceValue5" minOccurs="0"/>
 *         <element name="OneYrPricChng" type="{urn:swift:xsd:reda.002.001.04}PriceValueChange1" minOccurs="0"/>
 *         <element name="ThreeYrPricChng" type="{urn:swift:xsd:reda.002.001.04}PriceValueChange1" minOccurs="0"/>
 *         <element name="FiveYrPricChng" type="{urn:swift:xsd:reda.002.001.04}PriceValueChange1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsByPredefinedTimePeriods2", propOrder = {
    "hghstPricVal12Mnths",
    "lwstPricVal12Mnths",
    "oneYrPricChng",
    "threeYrPricChng",
    "fiveYrPricChng"
})
public class StatisticsByPredefinedTimePeriods2 {

    @XmlElement(name = "HghstPricVal12Mnths")
    protected PriceValue5 hghstPricVal12Mnths;
    @XmlElement(name = "LwstPricVal12Mnths")
    protected PriceValue5 lwstPricVal12Mnths;
    @XmlElement(name = "OneYrPricChng")
    protected PriceValueChange1 oneYrPricChng;
    @XmlElement(name = "ThreeYrPricChng")
    protected PriceValueChange1 threeYrPricChng;
    @XmlElement(name = "FiveYrPricChng")
    protected PriceValueChange1 fiveYrPricChng;

    /**
     * Gets the value of the hghstPricVal12Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue5 }
     *     
     */
    public PriceValue5 getHghstPricVal12Mnths() {
        return hghstPricVal12Mnths;
    }

    /**
     * Sets the value of the hghstPricVal12Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue5 }
     *     
     */
    public void setHghstPricVal12Mnths(PriceValue5 value) {
        this.hghstPricVal12Mnths = value;
    }

    /**
     * Gets the value of the lwstPricVal12Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue5 }
     *     
     */
    public PriceValue5 getLwstPricVal12Mnths() {
        return lwstPricVal12Mnths;
    }

    /**
     * Sets the value of the lwstPricVal12Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue5 }
     *     
     */
    public void setLwstPricVal12Mnths(PriceValue5 value) {
        this.lwstPricVal12Mnths = value;
    }

    /**
     * Gets the value of the oneYrPricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueChange1 }
     *     
     */
    public PriceValueChange1 getOneYrPricChng() {
        return oneYrPricChng;
    }

    /**
     * Sets the value of the oneYrPricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueChange1 }
     *     
     */
    public void setOneYrPricChng(PriceValueChange1 value) {
        this.oneYrPricChng = value;
    }

    /**
     * Gets the value of the threeYrPricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueChange1 }
     *     
     */
    public PriceValueChange1 getThreeYrPricChng() {
        return threeYrPricChng;
    }

    /**
     * Sets the value of the threeYrPricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueChange1 }
     *     
     */
    public void setThreeYrPricChng(PriceValueChange1 value) {
        this.threeYrPricChng = value;
    }

    /**
     * Gets the value of the fiveYrPricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueChange1 }
     *     
     */
    public PriceValueChange1 getFiveYrPricChng() {
        return fiveYrPricChng;
    }

    /**
     * Sets the value of the fiveYrPricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueChange1 }
     *     
     */
    public void setFiveYrPricChng(PriceValueChange1 value) {
        this.fiveYrPricChng = value;
    }

}
