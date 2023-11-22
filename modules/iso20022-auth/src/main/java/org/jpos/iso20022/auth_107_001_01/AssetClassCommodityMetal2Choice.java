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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityMetal2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityMetal2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NonPrcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}MetalCommodityNonPrecious2"/>
 *         <element name="Prcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}MetalCommodityPrecious2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityMetal2Choice", propOrder = {
    "nonPrcs",
    "prcs"
})
public class AssetClassCommodityMetal2Choice {

    @XmlElement(name = "NonPrcs")
    protected MetalCommodityNonPrecious2 nonPrcs;
    @XmlElement(name = "Prcs")
    protected MetalCommodityPrecious2 prcs;

    /**
     * Gets the value of the nonPrcs property.
     * 
     * @return
     *     possible object is
     *     {@link MetalCommodityNonPrecious2 }
     *     
     */
    public MetalCommodityNonPrecious2 getNonPrcs() {
        return nonPrcs;
    }

    /**
     * Sets the value of the nonPrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalCommodityNonPrecious2 }
     *     
     */
    public void setNonPrcs(MetalCommodityNonPrecious2 value) {
        this.nonPrcs = value;
    }

    /**
     * Gets the value of the prcs property.
     * 
     * @return
     *     possible object is
     *     {@link MetalCommodityPrecious2 }
     *     
     */
    public MetalCommodityPrecious2 getPrcs() {
        return prcs;
    }

    /**
     * Sets the value of the prcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalCommodityPrecious2 }
     *     
     */
    public void setPrcs(MetalCommodityPrecious2 value) {
        this.prcs = value;
    }

}
