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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityFreight4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityFreight4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dry" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}FreightCommodityDry3"/>
 *         <element name="Wet" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}FreightCommodityWet3"/>
 *         <element name="CntnrShip" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}FreightCommodityContainerShip2"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}FreightCommodityOther2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFreight4Choice", propOrder = {
    "dry",
    "wet",
    "cntnrShip",
    "othr"
})
public class AssetClassCommodityFreight4Choice {

    @XmlElement(name = "Dry")
    protected FreightCommodityDry3 dry;
    @XmlElement(name = "Wet")
    protected FreightCommodityWet3 wet;
    @XmlElement(name = "CntnrShip")
    protected FreightCommodityContainerShip2 cntnrShip;
    @XmlElement(name = "Othr")
    protected FreightCommodityOther2 othr;

    /**
     * Gets the value of the dry property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityDry3 }
     *     
     */
    public FreightCommodityDry3 getDry() {
        return dry;
    }

    /**
     * Sets the value of the dry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityDry3 }
     *     
     */
    public void setDry(FreightCommodityDry3 value) {
        this.dry = value;
    }

    /**
     * Gets the value of the wet property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityWet3 }
     *     
     */
    public FreightCommodityWet3 getWet() {
        return wet;
    }

    /**
     * Sets the value of the wet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityWet3 }
     *     
     */
    public void setWet(FreightCommodityWet3 value) {
        this.wet = value;
    }

    /**
     * Gets the value of the cntnrShip property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityContainerShip2 }
     *     
     */
    public FreightCommodityContainerShip2 getCntnrShip() {
        return cntnrShip;
    }

    /**
     * Sets the value of the cntnrShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityContainerShip2 }
     *     
     */
    public void setCntnrShip(FreightCommodityContainerShip2 value) {
        this.cntnrShip = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityOther2 }
     *     
     */
    public FreightCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityOther2 }
     *     
     */
    public void setOthr(FreightCommodityOther2 value) {
        this.othr = value;
    }

}
