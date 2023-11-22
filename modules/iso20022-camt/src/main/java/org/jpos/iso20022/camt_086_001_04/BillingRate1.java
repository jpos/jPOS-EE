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

package org.jpos.iso20022.camt_086_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingRate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingRate1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingRateIdentification1Choice"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}PercentageRate"/>
 *         <element name="DaysInPrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Number" minOccurs="0"/>
 *         <element name="DaysInYr" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingRate1", propOrder = {
    "id",
    "val",
    "daysInPrd",
    "daysInYr"
})
public class BillingRate1 {

    @XmlElement(name = "Id", required = true)
    protected BillingRateIdentification1Choice id;
    @XmlElement(name = "Val", required = true)
    protected BigDecimal val;
    @XmlElement(name = "DaysInPrd")
    protected BigDecimal daysInPrd;
    @XmlElement(name = "DaysInYr")
    protected BigDecimal daysInYr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BillingRateIdentification1Choice }
     *     
     */
    public BillingRateIdentification1Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingRateIdentification1Choice }
     *     
     */
    public void setId(BillingRateIdentification1Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVal(BigDecimal value) {
        this.val = value;
    }

    /**
     * Gets the value of the daysInPrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysInPrd() {
        return daysInPrd;
    }

    /**
     * Sets the value of the daysInPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysInPrd(BigDecimal value) {
        this.daysInPrd = value;
    }

    /**
     * Gets the value of the daysInYr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysInYr() {
        return daysInYr;
    }

    /**
     * Sets the value of the daysInYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysInYr(BigDecimal value) {
        this.daysInYr = value;
    }

}
