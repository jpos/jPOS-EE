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

package org.jpos.iso20022.camt_009_001_07;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentageRangeBoundary1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PercentageRangeBoundary1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BdryRate" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}PercentageRate"/>
 *         <element name="Incl" type="{urn:iso:std:iso:20022:tech:xsd:camt.009.001.07}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageRangeBoundary1", propOrder = {
    "bdryRate",
    "incl"
})
public class PercentageRangeBoundary1 {

    @XmlElement(name = "BdryRate", required = true)
    protected BigDecimal bdryRate;
    @XmlElement(name = "Incl")
    protected boolean incl;

    /**
     * Gets the value of the bdryRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBdryRate() {
        return bdryRate;
    }

    /**
     * Sets the value of the bdryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBdryRate(BigDecimal value) {
        this.bdryRate = value;
    }

    /**
     * Gets the value of the incl property.
     * 
     */
    public boolean isIncl() {
        return incl;
    }

    /**
     * Sets the value of the incl property.
     * 
     */
    public void setIncl(boolean value) {
        this.incl = value;
    }

}
