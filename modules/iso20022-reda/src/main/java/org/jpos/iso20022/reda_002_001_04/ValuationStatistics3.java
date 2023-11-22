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
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationStatistics3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ValuationStatistics3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ccy" type="{urn:swift:xsd:reda.002.001.04}ActiveOrHistoricCurrencyCode"/>
 *         <element name="PricTpChngBsis" type="{urn:swift:xsd:reda.002.001.04}PriceType2"/>
 *         <element name="PricChng" type="{urn:swift:xsd:reda.002.001.04}PriceValueChange1"/>
 *         <element name="Yld" type="{urn:swift:xsd:reda.002.001.04}PercentageRate" minOccurs="0"/>
 *         <element name="ByPrdfndTmPrds" type="{urn:swift:xsd:reda.002.001.04}StatisticsByPredefinedTimePeriods2" minOccurs="0"/>
 *         <element name="ByUsrDfndTmPrd" type="{urn:swift:xsd:reda.002.001.04}StatisticsByUserDefinedTimePeriod2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationStatistics3", propOrder = {
    "ccy",
    "pricTpChngBsis",
    "pricChng",
    "yld",
    "byPrdfndTmPrds",
    "byUsrDfndTmPrd"
})
public class ValuationStatistics3 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "PricTpChngBsis", required = true)
    protected PriceType2 pricTpChngBsis;
    @XmlElement(name = "PricChng", required = true)
    protected PriceValueChange1 pricChng;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;
    @XmlElement(name = "ByPrdfndTmPrds")
    protected StatisticsByPredefinedTimePeriods2 byPrdfndTmPrds;
    @XmlElement(name = "ByUsrDfndTmPrd")
    protected List<StatisticsByUserDefinedTimePeriod2> byUsrDfndTmPrd;

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
     * Gets the value of the pricTpChngBsis property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType2 }
     *     
     */
    public PriceType2 getPricTpChngBsis() {
        return pricTpChngBsis;
    }

    /**
     * Sets the value of the pricTpChngBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType2 }
     *     
     */
    public void setPricTpChngBsis(PriceType2 value) {
        this.pricTpChngBsis = value;
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

    /**
     * Gets the value of the byPrdfndTmPrds property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsByPredefinedTimePeriods2 }
     *     
     */
    public StatisticsByPredefinedTimePeriods2 getByPrdfndTmPrds() {
        return byPrdfndTmPrds;
    }

    /**
     * Sets the value of the byPrdfndTmPrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsByPredefinedTimePeriods2 }
     *     
     */
    public void setByPrdfndTmPrds(StatisticsByPredefinedTimePeriods2 value) {
        this.byPrdfndTmPrds = value;
    }

    /**
     * Gets the value of the byUsrDfndTmPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the byUsrDfndTmPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByUsrDfndTmPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticsByUserDefinedTimePeriod2 }
     * 
     * 
     * @return
     *     The value of the byUsrDfndTmPrd property.
     */
    public List<StatisticsByUserDefinedTimePeriod2> getByUsrDfndTmPrd() {
        if (byUsrDfndTmPrd == null) {
            byUsrDfndTmPrd = new ArrayList<>();
        }
        return this.byUsrDfndTmPrd;
    }

}
