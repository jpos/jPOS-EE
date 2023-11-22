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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceFactors1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PerformanceFactors1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CorpActnFctr" type="{urn:swift:xsd:reda.002.001.04}DecimalNumber" minOccurs="0"/>
 *         <element name="CmltvCorpActnFctr" type="{urn:swift:xsd:reda.002.001.04}DecimalNumber" minOccurs="0"/>
 *         <element name="AcmltnPrd" type="{urn:swift:xsd:reda.002.001.04}DatePeriodDetails" minOccurs="0"/>
 *         <element name="NrmlPrfrmnc" type="{urn:swift:xsd:reda.002.001.04}DecimalNumber" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceFactors1", propOrder = {
    "corpActnFctr",
    "cmltvCorpActnFctr",
    "acmltnPrd",
    "nrmlPrfrmnc"
})
public class PerformanceFactors1 {

    @XmlElement(name = "CorpActnFctr")
    protected BigDecimal corpActnFctr;
    @XmlElement(name = "CmltvCorpActnFctr")
    protected BigDecimal cmltvCorpActnFctr;
    @XmlElement(name = "AcmltnPrd")
    protected DatePeriodDetails acmltnPrd;
    @XmlElement(name = "NrmlPrfrmnc")
    protected BigDecimal nrmlPrfrmnc;

    /**
     * Gets the value of the corpActnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCorpActnFctr() {
        return corpActnFctr;
    }

    /**
     * Sets the value of the corpActnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCorpActnFctr(BigDecimal value) {
        this.corpActnFctr = value;
    }

    /**
     * Gets the value of the cmltvCorpActnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCmltvCorpActnFctr() {
        return cmltvCorpActnFctr;
    }

    /**
     * Sets the value of the cmltvCorpActnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCmltvCorpActnFctr(BigDecimal value) {
        this.cmltvCorpActnFctr = value;
    }

    /**
     * Gets the value of the acmltnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getAcmltnPrd() {
        return acmltnPrd;
    }

    /**
     * Sets the value of the acmltnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public void setAcmltnPrd(DatePeriodDetails value) {
        this.acmltnPrd = value;
    }

    /**
     * Gets the value of the nrmlPrfrmnc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrmlPrfrmnc() {
        return nrmlPrfrmnc;
    }

    /**
     * Sets the value of the nrmlPrfrmnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrmlPrfrmnc(BigDecimal value) {
        this.nrmlPrfrmnc = value;
    }

}
