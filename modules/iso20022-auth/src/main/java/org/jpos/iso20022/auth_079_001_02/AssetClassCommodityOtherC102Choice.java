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
 * <p>Java class for AssetClassCommodityOtherC102Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityOtherC102Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dlvrbl" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OtherC10CommodityDeliverable2"/>
 *         <element name="NonDlvrbl" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OtherC10CommodityNonDeliverable2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityOtherC102Choice", propOrder = {
    "dlvrbl",
    "nonDlvrbl"
})
public class AssetClassCommodityOtherC102Choice {

    @XmlElement(name = "Dlvrbl")
    protected OtherC10CommodityDeliverable2 dlvrbl;
    @XmlElement(name = "NonDlvrbl")
    protected OtherC10CommodityNonDeliverable2 nonDlvrbl;

    /**
     * Gets the value of the dlvrbl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherC10CommodityDeliverable2 }
     *     
     */
    public OtherC10CommodityDeliverable2 getDlvrbl() {
        return dlvrbl;
    }

    /**
     * Sets the value of the dlvrbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherC10CommodityDeliverable2 }
     *     
     */
    public void setDlvrbl(OtherC10CommodityDeliverable2 value) {
        this.dlvrbl = value;
    }

    /**
     * Gets the value of the nonDlvrbl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherC10CommodityNonDeliverable2 }
     *     
     */
    public OtherC10CommodityNonDeliverable2 getNonDlvrbl() {
        return nonDlvrbl;
    }

    /**
     * Sets the value of the nonDlvrbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherC10CommodityNonDeliverable2 }
     *     
     */
    public void setNonDlvrbl(OtherC10CommodityNonDeliverable2 value) {
        this.nonDlvrbl = value;
    }

}
