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

package org.jpos.iso20022.auth_079_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityFreight3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityFreight3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dry" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}FreightCommodityDry2"/>
 *         <element name="Wet" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}FreightCommodityWet2"/>
 *         <element name="CntnrShip" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}FreightCommodityContainerShip1"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}FreightCommodityOther1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFreight3Choice", propOrder = {
    "dry",
    "wet",
    "cntnrShip",
    "othr"
})
public class AssetClassCommodityFreight3Choice {

    @XmlElement(name = "Dry")
    protected FreightCommodityDry2 dry;
    @XmlElement(name = "Wet")
    protected FreightCommodityWet2 wet;
    @XmlElement(name = "CntnrShip")
    protected FreightCommodityContainerShip1 cntnrShip;
    @XmlElement(name = "Othr")
    protected FreightCommodityOther1 othr;

    /**
     * Gets the value of the dry property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityDry2 }
     *     
     */
    public FreightCommodityDry2 getDry() {
        return dry;
    }

    /**
     * Sets the value of the dry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityDry2 }
     *     
     */
    public void setDry(FreightCommodityDry2 value) {
        this.dry = value;
    }

    /**
     * Gets the value of the wet property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityWet2 }
     *     
     */
    public FreightCommodityWet2 getWet() {
        return wet;
    }

    /**
     * Sets the value of the wet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityWet2 }
     *     
     */
    public void setWet(FreightCommodityWet2 value) {
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

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityOther1 }
     *     
     */
    public FreightCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityOther1 }
     *     
     */
    public void setOthr(FreightCommodityOther1 value) {
        this.othr = value;
    }

}
