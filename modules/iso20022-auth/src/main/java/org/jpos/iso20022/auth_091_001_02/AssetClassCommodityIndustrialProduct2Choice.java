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
 * <p>Java class for AssetClassCommodityIndustrialProduct2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityIndustrialProduct2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cnstrctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}IndustrialProductCommodityConstruction2"/>
 *         <element name="Manfctg" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}IndustrialProductCommodityManufacturing2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityIndustrialProduct2Choice", propOrder = {
    "cnstrctn",
    "manfctg"
})
public class AssetClassCommodityIndustrialProduct2Choice {

    @XmlElement(name = "Cnstrctn")
    protected IndustrialProductCommodityConstruction2 cnstrctn;
    @XmlElement(name = "Manfctg")
    protected IndustrialProductCommodityManufacturing2 manfctg;

    /**
     * Gets the value of the cnstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialProductCommodityConstruction2 }
     *     
     */
    public IndustrialProductCommodityConstruction2 getCnstrctn() {
        return cnstrctn;
    }

    /**
     * Sets the value of the cnstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialProductCommodityConstruction2 }
     *     
     */
    public void setCnstrctn(IndustrialProductCommodityConstruction2 value) {
        this.cnstrctn = value;
    }

    /**
     * Gets the value of the manfctg property.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialProductCommodityManufacturing2 }
     *     
     */
    public IndustrialProductCommodityManufacturing2 getManfctg() {
        return manfctg;
    }

    /**
     * Sets the value of the manfctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialProductCommodityManufacturing2 }
     *     
     */
    public void setManfctg(IndustrialProductCommodityManufacturing2 value) {
        this.manfctg = value;
    }

}
