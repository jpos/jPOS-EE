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

package org.jpos.iso20022.acmt_014_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaximumAmountByPeriod1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MaximumAmountByPeriod1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}ActiveCurrencyAndAmount"/>
 *         <element name="NbOfDays" type="{urn:iso:std:iso:20022:tech:xsd:acmt.014.001.04}Max3NumericText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumAmountByPeriod1", propOrder = {
    "maxAmt",
    "nbOfDays"
})
public class MaximumAmountByPeriod1 {

    @XmlElement(name = "MaxAmt", required = true)
    protected ActiveCurrencyAndAmount maxAmt;
    @XmlElement(name = "NbOfDays", required = true)
    protected String nbOfDays;

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMaxAmt(ActiveCurrencyAndAmount value) {
        this.maxAmt = value;
    }

    /**
     * Gets the value of the nbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfDays() {
        return nbOfDays;
    }

    /**
     * Sets the value of the nbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfDays(String value) {
        this.nbOfDays = value;
    }

}
