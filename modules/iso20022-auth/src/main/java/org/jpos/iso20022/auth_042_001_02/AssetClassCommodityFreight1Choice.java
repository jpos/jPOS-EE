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

package org.jpos.iso20022.auth_042_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityFreight1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityFreight1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dry" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}FreightCommodityDry1"/>
 *         <element name="Wet" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}FreightCommodityWet1"/>
 *         <element name="CntnrShip" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}FreightCommodityContainerShip1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFreight1Choice", propOrder = {
    "dry",
    "wet",
    "cntnrShip"
})
public class AssetClassCommodityFreight1Choice {

    @XmlElement(name = "Dry")
    protected FreightCommodityDry1 dry;
    @XmlElement(name = "Wet")
    protected FreightCommodityWet1 wet;
    @XmlElement(name = "CntnrShip")
    protected FreightCommodityContainerShip1 cntnrShip;

    /**
     * Gets the value of the dry property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityDry1 }
     *     
     */
    public FreightCommodityDry1 getDry() {
        return dry;
    }

    /**
     * Sets the value of the dry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityDry1 }
     *     
     */
    public void setDry(FreightCommodityDry1 value) {
        this.dry = value;
    }

    /**
     * Gets the value of the wet property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityWet1 }
     *     
     */
    public FreightCommodityWet1 getWet() {
        return wet;
    }

    /**
     * Sets the value of the wet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityWet1 }
     *     
     */
    public void setWet(FreightCommodityWet1 value) {
        this.wet = value;
    }

    /**
     * Gets the value of the cntnrShip property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityContainerShip1 }
     *     
     */
    public FreightCommodityContainerShip1 getCntnrShip() {
        return cntnrShip;
    }

    /**
     * Sets the value of the cntnrShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityContainerShip1 }
     *     
     */
    public void setCntnrShip(FreightCommodityContainerShip1 value) {
        this.cntnrShip = value;
    }

}
