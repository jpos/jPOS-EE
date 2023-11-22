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
 * <p>Java class for AmountPricePerFinancialInstrumentQuantity1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountPricePerFinancialInstrumentQuantity1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmtPricTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AmountPriceType1FormatChoice"/>
 *         <element name="PricVal" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}ActiveCurrencyAnd13DecimalAmount"/>
 *         <element name="FinInstrmQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}UnitOrFaceAmount1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPricePerFinancialInstrumentQuantity1", propOrder = {
    "amtPricTp",
    "pricVal",
    "finInstrmQty"
})
public class AmountPricePerFinancialInstrumentQuantity1 {

    @XmlElement(name = "AmtPricTp", required = true)
    protected AmountPriceType1FormatChoice amtPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected ActiveCurrencyAnd13DecimalAmount pricVal;
    @XmlElement(name = "FinInstrmQty", required = true)
    protected UnitOrFaceAmount1Choice finInstrmQty;

    /**
     * Gets the value of the amtPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPriceType1FormatChoice }
     *     
     */
    public AmountPriceType1FormatChoice getAmtPricTp() {
        return amtPricTp;
    }

    /**
     * Sets the value of the amtPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPriceType1FormatChoice }
     *     
     */
    public void setAmtPricTp(AmountPriceType1FormatChoice value) {
        this.amtPricTp = value;
    }

    /**
     * Gets the value of the pricVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPricVal() {
        return pricVal;
    }

    /**
     * Sets the value of the pricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setPricVal(ActiveCurrencyAnd13DecimalAmount value) {
        this.pricVal = value;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setFinInstrmQty(UnitOrFaceAmount1Choice value) {
        this.finInstrmQty = value;
    }

}
