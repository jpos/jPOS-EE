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

package org.jpos.iso20022.tsmt_011_001_04;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentageTolerance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PercentageTolerance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlusPct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}PercentageRate"/>
 *         <element name="MnsPct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}PercentageRate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageTolerance1", propOrder = {
    "plusPct",
    "mnsPct"
})
public class PercentageTolerance1 {

    @XmlElement(name = "PlusPct", required = true)
    protected BigDecimal plusPct;
    @XmlElement(name = "MnsPct", required = true)
    protected BigDecimal mnsPct;

    /**
     * Gets the value of the plusPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlusPct() {
        return plusPct;
    }

    /**
     * Sets the value of the plusPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlusPct(BigDecimal value) {
        this.plusPct = value;
    }

    /**
     * Gets the value of the mnsPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMnsPct() {
        return mnsPct;
    }

    /**
     * Sets the value of the mnsPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMnsPct(BigDecimal value) {
        this.mnsPct = value;
    }

}
