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
 * <p>Java class for TimeHorizon2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TimeHorizon2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NbOfYrs" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}DecimalNumber"/>
 *         <element name="TmFrame" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TimeFrame9Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeHorizon2Choice", propOrder = {
    "nbOfYrs",
    "tmFrame"
})
public class TimeHorizon2Choice {

    @XmlElement(name = "NbOfYrs")
    protected BigDecimal nbOfYrs;
    @XmlElement(name = "TmFrame")
    protected TimeFrame9Choice tmFrame;

    /**
     * Gets the value of the nbOfYrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfYrs() {
        return nbOfYrs;
    }

    /**
     * Sets the value of the nbOfYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfYrs(BigDecimal value) {
        this.nbOfYrs = value;
    }

    /**
     * Gets the value of the tmFrame property.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrame9Choice }
     *     
     */
    public TimeFrame9Choice getTmFrame() {
        return tmFrame;
    }

    /**
     * Sets the value of the tmFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrame9Choice }
     *     
     */
    public void setTmFrame(TimeFrame9Choice value) {
        this.tmFrame = value;
    }

}
