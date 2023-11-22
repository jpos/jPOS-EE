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

package org.jpos.iso20022.seev_001_001_10;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOrPercentage1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NumberOrPercentage1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ThrshldPctg" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}PercentageRate"/>
 *         <element name="ThrshldNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Number"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOrPercentage1Choice", propOrder = {
    "thrshldPctg",
    "thrshldNb"
})
public class NumberOrPercentage1Choice {

    @XmlElement(name = "ThrshldPctg")
    protected BigDecimal thrshldPctg;
    @XmlElement(name = "ThrshldNb")
    protected BigDecimal thrshldNb;

    /**
     * Gets the value of the thrshldPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThrshldPctg() {
        return thrshldPctg;
    }

    /**
     * Sets the value of the thrshldPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThrshldPctg(BigDecimal value) {
        this.thrshldPctg = value;
    }

    /**
     * Gets the value of the thrshldNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThrshldNb() {
        return thrshldNb;
    }

    /**
     * Sets the value of the thrshldNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThrshldNb(BigDecimal value) {
        this.thrshldNb = value;
    }

}
