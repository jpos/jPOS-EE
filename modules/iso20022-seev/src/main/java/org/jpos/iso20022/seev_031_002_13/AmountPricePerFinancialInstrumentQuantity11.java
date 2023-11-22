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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPricePerFinancialInstrumentQuantity11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountPricePerFinancialInstrumentQuantity11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmtPricTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}AmountPriceType1Code"/>
 *         <element name="PricVal" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RestrictedFINActiveCurrencyAnd13DecimalAmount"/>
 *         <element name="FinInstrmQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}FinancialInstrumentQuantity36Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPricePerFinancialInstrumentQuantity11", propOrder = {
    "amtPricTp",
    "pricVal",
    "finInstrmQty"
})
public class AmountPricePerFinancialInstrumentQuantity11 {

    @XmlElement(name = "AmtPricTp", required = true)
    @XmlSchemaType(name = "string")
    protected AmountPriceType1Code amtPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount pricVal;
    @XmlElement(name = "FinInstrmQty", required = true)
    protected FinancialInstrumentQuantity36Choice finInstrmQty;

    /**
     * Gets the value of the amtPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPriceType1Code }
     *     
     */
    public AmountPriceType1Code getAmtPricTp() {
        return amtPricTp;
    }

    /**
     * Sets the value of the amtPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPriceType1Code }
     *     
     */
    public void setAmtPricTp(AmountPriceType1Code value) {
        this.amtPricTp = value;
    }

    /**
     * Gets the value of the pricVal property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getPricVal() {
        return pricVal;
    }

    /**
     * Sets the value of the pricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setPricVal(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.pricVal = value;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setFinInstrmQty(FinancialInstrumentQuantity36Choice value) {
        this.finInstrmQty = value;
    }

}
