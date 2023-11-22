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

package org.jpos.iso20022.seev_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatioFormat2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RatioFormat2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="QtyToQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}QuantityToQuantityRatio1"/>
 *         <element name="AmtToAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AmountToAmountRatio1"/>
 *         <element name="AmtToQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AmountAndQuantityRatio1"/>
 *         <element name="QtyToAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AmountAndQuantityRatio1"/>
 *         <element name="NotSpcfdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}RateType12FormatChoice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatioFormat2Choice", propOrder = {
    "qtyToQty",
    "amtToAmt",
    "amtToQty",
    "qtyToAmt",
    "notSpcfdRate"
})
public class RatioFormat2Choice {

    @XmlElement(name = "QtyToQty")
    protected QuantityToQuantityRatio1 qtyToQty;
    @XmlElement(name = "AmtToAmt")
    protected AmountToAmountRatio1 amtToAmt;
    @XmlElement(name = "AmtToQty")
    protected AmountAndQuantityRatio1 amtToQty;
    @XmlElement(name = "QtyToAmt")
    protected AmountAndQuantityRatio1 qtyToAmt;
    @XmlElement(name = "NotSpcfdRate")
    protected RateType12FormatChoice notSpcfdRate;

    /**
     * Gets the value of the qtyToQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getQtyToQty() {
        return qtyToQty;
    }

    /**
     * Sets the value of the qtyToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public void setQtyToQty(QuantityToQuantityRatio1 value) {
        this.qtyToQty = value;
    }

    /**
     * Gets the value of the amtToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountToAmountRatio1 }
     *     
     */
    public AmountToAmountRatio1 getAmtToAmt() {
        return amtToAmt;
    }

    /**
     * Sets the value of the amtToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountToAmountRatio1 }
     *     
     */
    public void setAmtToAmt(AmountToAmountRatio1 value) {
        this.amtToAmt = value;
    }

    /**
     * Gets the value of the amtToQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio1 }
     *     
     */
    public AmountAndQuantityRatio1 getAmtToQty() {
        return amtToQty;
    }

    /**
     * Sets the value of the amtToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio1 }
     *     
     */
    public void setAmtToQty(AmountAndQuantityRatio1 value) {
        this.amtToQty = value;
    }

    /**
     * Gets the value of the qtyToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndQuantityRatio1 }
     *     
     */
    public AmountAndQuantityRatio1 getQtyToAmt() {
        return qtyToAmt;
    }

    /**
     * Sets the value of the qtyToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndQuantityRatio1 }
     *     
     */
    public void setQtyToAmt(AmountAndQuantityRatio1 value) {
        this.qtyToAmt = value;
    }

    /**
     * Gets the value of the notSpcfdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateType12FormatChoice }
     *     
     */
    public RateType12FormatChoice getNotSpcfdRate() {
        return notSpcfdRate;
    }

    /**
     * Sets the value of the notSpcfdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType12FormatChoice }
     *     
     */
    public void setNotSpcfdRate(RateType12FormatChoice value) {
        this.notSpcfdRate = value;
    }

}
