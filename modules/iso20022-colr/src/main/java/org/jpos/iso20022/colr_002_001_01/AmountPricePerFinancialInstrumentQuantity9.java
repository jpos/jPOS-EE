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

package org.jpos.iso20022.colr_002_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPricePerFinancialInstrumentQuantity9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountPricePerFinancialInstrumentQuantity9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmtPricTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}YieldedOrValueType1Choice"/>
 *         <element name="PricVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}PriceRateOrAmount3Choice"/>
 *         <element name="FinInstrmQty" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}FinancialInstrumentQuantity1Choice"/>
 *         <element name="PricFxgDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}ISODate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPricePerFinancialInstrumentQuantity9", propOrder = {
    "amtPricTp",
    "pricVal",
    "finInstrmQty",
    "pricFxgDt"
})
public class AmountPricePerFinancialInstrumentQuantity9 {

    @XmlElement(name = "AmtPricTp", required = true)
    protected YieldedOrValueType1Choice amtPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected PriceRateOrAmount3Choice pricVal;
    @XmlElement(name = "FinInstrmQty", required = true)
    protected FinancialInstrumentQuantity1Choice finInstrmQty;
    @XmlElement(name = "PricFxgDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pricFxgDt;

    /**
     * Gets the value of the amtPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public YieldedOrValueType1Choice getAmtPricTp() {
        return amtPricTp;
    }

    /**
     * Sets the value of the amtPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public void setAmtPricTp(YieldedOrValueType1Choice value) {
        this.amtPricTp = value;
    }

    /**
     * Gets the value of the pricVal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public PriceRateOrAmount3Choice getPricVal() {
        return pricVal;
    }

    /**
     * Sets the value of the pricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public void setPricVal(PriceRateOrAmount3Choice value) {
        this.pricVal = value;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setFinInstrmQty(FinancialInstrumentQuantity1Choice value) {
        this.finInstrmQty = value;
    }

    /**
     * Gets the value of the pricFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPricFxgDt() {
        return pricFxgDt;
    }

    /**
     * Sets the value of the pricFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPricFxgDt(XMLGregorianCalendar value) {
        this.pricFxgDt = value;
    }

}
