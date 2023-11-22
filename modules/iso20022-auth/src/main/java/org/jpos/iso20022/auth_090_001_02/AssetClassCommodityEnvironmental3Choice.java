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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityEnvironmental3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityEnvironmental3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Emssns" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}EnvironmentalCommodityEmission3"/>
 *         <element name="Wthr" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}EnvironmentalCommodityWeather2"/>
 *         <element name="CrbnRltd" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}EnvironmentalCommodityCarbonRelated2"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}EnvironmentCommodityOther2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityEnvironmental3Choice", propOrder = {
    "emssns",
    "wthr",
    "crbnRltd",
    "othr"
})
public class AssetClassCommodityEnvironmental3Choice {

    @XmlElement(name = "Emssns")
    protected EnvironmentalCommodityEmission3 emssns;
    @XmlElement(name = "Wthr")
    protected EnvironmentalCommodityWeather2 wthr;
    @XmlElement(name = "CrbnRltd")
    protected EnvironmentalCommodityCarbonRelated2 crbnRltd;
    @XmlElement(name = "Othr")
    protected EnvironmentCommodityOther2 othr;

    /**
     * Gets the value of the emssns property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityEmission3 }
     *     
     */
    public EnvironmentalCommodityEmission3 getEmssns() {
        return emssns;
    }

    /**
     * Sets the value of the emssns property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityEmission3 }
     *     
     */
    public void setEmssns(EnvironmentalCommodityEmission3 value) {
        this.emssns = value;
    }

    /**
     * Gets the value of the wthr property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityWeather2 }
     *     
     */
    public EnvironmentalCommodityWeather2 getWthr() {
        return wthr;
    }

    /**
     * Sets the value of the wthr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityWeather2 }
     *     
     */
    public void setWthr(EnvironmentalCommodityWeather2 value) {
        this.wthr = value;
    }

    /**
     * Gets the value of the crbnRltd property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityCarbonRelated2 }
     *     
     */
    public EnvironmentalCommodityCarbonRelated2 getCrbnRltd() {
        return crbnRltd;
    }

    /**
     * Sets the value of the crbnRltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityCarbonRelated2 }
     *     
     */
    public void setCrbnRltd(EnvironmentalCommodityCarbonRelated2 value) {
        this.crbnRltd = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentCommodityOther2 }
     *     
     */
    public EnvironmentCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentCommodityOther2 }
     *     
     */
    public void setOthr(EnvironmentCommodityOther2 value) {
        this.othr = value;
    }

}
