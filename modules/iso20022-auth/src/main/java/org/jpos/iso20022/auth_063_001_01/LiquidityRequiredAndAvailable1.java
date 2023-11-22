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

package org.jpos.iso20022.auth_063_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiquidityRequiredAndAvailable1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LiquidityRequiredAndAvailable1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LqdRsrcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}LiquidResources1"/>
 *         <element name="LqdtyHrzn" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}SettlementDate6Code"/>
 *         <element name="StrssLqdRsrcRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.063.001.01}StressLiquidResourceRequirement1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityRequiredAndAvailable1", propOrder = {
    "lqdRsrcs",
    "lqdtyHrzn",
    "strssLqdRsrcRqrmnt"
})
public class LiquidityRequiredAndAvailable1 {

    @XmlElement(name = "LqdRsrcs", required = true)
    protected LiquidResources1 lqdRsrcs;
    @XmlElement(name = "LqdtyHrzn", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementDate6Code lqdtyHrzn;
    @XmlElement(name = "StrssLqdRsrcRqrmnt", required = true)
    protected StressLiquidResourceRequirement1 strssLqdRsrcRqrmnt;

    /**
     * Gets the value of the lqdRsrcs property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidResources1 }
     *     
     */
    public LiquidResources1 getLqdRsrcs() {
        return lqdRsrcs;
    }

    /**
     * Sets the value of the lqdRsrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidResources1 }
     *     
     */
    public void setLqdRsrcs(LiquidResources1 value) {
        this.lqdRsrcs = value;
    }

    /**
     * Gets the value of the lqdtyHrzn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate6Code }
     *     
     */
    public SettlementDate6Code getLqdtyHrzn() {
        return lqdtyHrzn;
    }

    /**
     * Sets the value of the lqdtyHrzn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate6Code }
     *     
     */
    public void setLqdtyHrzn(SettlementDate6Code value) {
        this.lqdtyHrzn = value;
    }

    /**
     * Gets the value of the strssLqdRsrcRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link StressLiquidResourceRequirement1 }
     *     
     */
    public StressLiquidResourceRequirement1 getStrssLqdRsrcRqrmnt() {
        return strssLqdRsrcRqrmnt;
    }

    /**
     * Sets the value of the strssLqdRsrcRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressLiquidResourceRequirement1 }
     *     
     */
    public void setStrssLqdRsrcRqrmnt(StressLiquidResourceRequirement1 value) {
        this.strssLqdRsrcRqrmnt = value;
    }

}
