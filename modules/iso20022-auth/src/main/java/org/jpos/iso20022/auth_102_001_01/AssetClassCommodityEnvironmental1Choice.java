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

package org.jpos.iso20022.auth_102_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityEnvironmental1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityEnvironmental1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Emssns" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}EnvironmentalCommodityEmission1"/>
 *         <element name="Wthr" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}EnvironmentalCommodityWeather1"/>
 *         <element name="CrbnRltd" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}EnvironmentalCommodityCarbonRelated1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityEnvironmental1Choice", propOrder = {
    "emssns",
    "wthr",
    "crbnRltd"
})
public class AssetClassCommodityEnvironmental1Choice {

    @XmlElement(name = "Emssns")
    protected EnvironmentalCommodityEmission1 emssns;
    @XmlElement(name = "Wthr")
    protected EnvironmentalCommodityWeather1 wthr;
    @XmlElement(name = "CrbnRltd")
    protected EnvironmentalCommodityCarbonRelated1 crbnRltd;

    /**
     * Gets the value of the emssns property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityEmission1 }
     *     
     */
    public EnvironmentalCommodityEmission1 getEmssns() {
        return emssns;
    }

    /**
     * Sets the value of the emssns property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityEmission1 }
     *     
     */
    public void setEmssns(EnvironmentalCommodityEmission1 value) {
        this.emssns = value;
    }

    /**
     * Gets the value of the wthr property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityWeather1 }
     *     
     */
    public EnvironmentalCommodityWeather1 getWthr() {
        return wthr;
    }

    /**
     * Sets the value of the wthr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityWeather1 }
     *     
     */
    public void setWthr(EnvironmentalCommodityWeather1 value) {
        this.wthr = value;
    }

    /**
     * Gets the value of the crbnRltd property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityCarbonRelated1 }
     *     
     */
    public EnvironmentalCommodityCarbonRelated1 getCrbnRltd() {
        return crbnRltd;
    }

    /**
     * Sets the value of the crbnRltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityCarbonRelated1 }
     *     
     */
    public void setCrbnRltd(EnvironmentalCommodityCarbonRelated1 value) {
        this.crbnRltd = value;
    }

}
