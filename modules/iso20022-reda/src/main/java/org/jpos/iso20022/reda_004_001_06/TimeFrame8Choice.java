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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeFrame8Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TimeFrame8Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="TPlus" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Number"/>
 *         <element name="RPlus" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Number"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFrame8Choice", propOrder = {
    "tPlus",
    "rPlus"
})
public class TimeFrame8Choice {

    @XmlElement(name = "TPlus")
    protected BigDecimal tPlus;
    @XmlElement(name = "RPlus")
    protected BigDecimal rPlus;

    /**
     * Gets the value of the tPlus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTPlus() {
        return tPlus;
    }

    /**
     * Sets the value of the tPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTPlus(BigDecimal value) {
        this.tPlus = value;
    }

    /**
     * Gets the value of the rPlus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRPlus() {
        return rPlus;
    }

    /**
     * Sets the value of the rPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRPlus(BigDecimal value) {
        this.rPlus = value;
    }

}
