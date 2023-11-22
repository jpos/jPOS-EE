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

package org.jpos.iso20022.auth_057_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StressItem1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StressItem1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Pdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}StressedProduct1"/>
 *         <element name="Strtgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}Strategy1"/>
 *         <element name="RskFctr" type="{urn:iso:std:iso:20022:tech:xsd:auth.057.001.01}RiskFactor1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressItem1Choice", propOrder = {
    "pdct",
    "strtgy",
    "rskFctr"
})
public class StressItem1Choice {

    @XmlElement(name = "Pdct")
    protected StressedProduct1 pdct;
    @XmlElement(name = "Strtgy")
    protected Strategy1 strtgy;
    @XmlElement(name = "RskFctr")
    protected RiskFactor1 rskFctr;

    /**
     * Gets the value of the pdct property.
     * 
     * @return
     *     possible object is
     *     {@link StressedProduct1 }
     *     
     */
    public StressedProduct1 getPdct() {
        return pdct;
    }

    /**
     * Sets the value of the pdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressedProduct1 }
     *     
     */
    public void setPdct(StressedProduct1 value) {
        this.pdct = value;
    }

    /**
     * Gets the value of the strtgy property.
     * 
     * @return
     *     possible object is
     *     {@link Strategy1 }
     *     
     */
    public Strategy1 getStrtgy() {
        return strtgy;
    }

    /**
     * Sets the value of the strtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strategy1 }
     *     
     */
    public void setStrtgy(Strategy1 value) {
        this.strtgy = value;
    }

    /**
     * Gets the value of the rskFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RiskFactor1 }
     *     
     */
    public RiskFactor1 getRskFctr() {
        return rskFctr;
    }

    /**
     * Sets the value of the rskFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskFactor1 }
     *     
     */
    public void setRskFctr(RiskFactor1 value) {
        this.rskFctr = value;
    }

}
