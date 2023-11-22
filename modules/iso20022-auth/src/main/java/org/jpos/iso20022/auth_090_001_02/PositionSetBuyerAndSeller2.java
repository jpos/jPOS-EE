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
 * <p>Java class for PositionSetBuyerAndSeller2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetBuyerAndSeller2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PositionSetTotal2" minOccurs="0"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PositionSetTotal2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetBuyerAndSeller2", propOrder = {
    "buyr",
    "sellr"
})
public class PositionSetBuyerAndSeller2 {

    @XmlElement(name = "Buyr")
    protected PositionSetTotal2 buyr;
    @XmlElement(name = "Sellr")
    protected PositionSetTotal2 sellr;

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetTotal2 }
     *     
     */
    public PositionSetTotal2 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetTotal2 }
     *     
     */
    public void setBuyr(PositionSetTotal2 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetTotal2 }
     *     
     */
    public PositionSetTotal2 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetTotal2 }
     *     
     */
    public void setSellr(PositionSetTotal2 value) {
        this.sellr = value;
    }

}
