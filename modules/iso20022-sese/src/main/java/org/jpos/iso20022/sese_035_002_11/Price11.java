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

package org.jpos.iso20022.sese_035_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Price11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Price11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}YieldedOrValueType2Choice"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:sese.035.002.11}PriceRateOrAmount1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price11", propOrder = {
    "tp",
    "val"
})
public class Price11 {

    @XmlElement(name = "Tp", required = true)
    protected YieldedOrValueType2Choice tp;
    @XmlElement(name = "Val", required = true)
    protected PriceRateOrAmount1Choice val;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link YieldedOrValueType2Choice }
     *     
     */
    public YieldedOrValueType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldedOrValueType2Choice }
     *     
     */
    public void setTp(YieldedOrValueType2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount1Choice }
     *     
     */
    public PriceRateOrAmount1Choice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount1Choice }
     *     
     */
    public void setVal(PriceRateOrAmount1Choice value) {
        this.val = value;
    }

}
