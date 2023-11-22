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

package org.jpos.iso20022.seev_031_001_13;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceFormat65Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceFormat65Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PctgPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PercentagePrice1"/>
 *         <element name="AmtPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}AmountPrice3"/>
 *         <element name="NotSpcfdPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceValueType8Code"/>
 *         <element name="AmtPricPerFinInstrmQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}AmountPricePerFinancialInstrumentQuantity10"/>
 *         <element name="AmtPricPerAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}AmountPricePerAmount2"/>
 *         <element name="IndxPts" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DecimalNumber"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceFormat65Choice", propOrder = {
    "pctgPric",
    "amtPric",
    "notSpcfdPric",
    "amtPricPerFinInstrmQty",
    "amtPricPerAmt",
    "indxPts"
})
public class PriceFormat65Choice {

    @XmlElement(name = "PctgPric")
    protected PercentagePrice1 pctgPric;
    @XmlElement(name = "AmtPric")
    protected AmountPrice3 amtPric;
    @XmlElement(name = "NotSpcfdPric")
    @XmlSchemaType(name = "string")
    protected PriceValueType8Code notSpcfdPric;
    @XmlElement(name = "AmtPricPerFinInstrmQty")
    protected AmountPricePerFinancialInstrumentQuantity10 amtPricPerFinInstrmQty;
    @XmlElement(name = "AmtPricPerAmt")
    protected AmountPricePerAmount2 amtPricPerAmt;
    @XmlElement(name = "IndxPts")
    protected BigDecimal indxPts;

    /**
     * Gets the value of the pctgPric property.
     * 
     * @return
     *     possible object is
     *     {@link PercentagePrice1 }
     *     
     */
    public PercentagePrice1 getPctgPric() {
        return pctgPric;
    }

    /**
     * Sets the value of the pctgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentagePrice1 }
     *     
     */
    public void setPctgPric(PercentagePrice1 value) {
        this.pctgPric = value;
    }

    /**
     * Gets the value of the amtPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice3 }
     *     
     */
    public AmountPrice3 getAmtPric() {
        return amtPric;
    }

    /**
     * Sets the value of the amtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice3 }
     *     
     */
    public void setAmtPric(AmountPrice3 value) {
        this.amtPric = value;
    }

    /**
     * Gets the value of the notSpcfdPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType8Code }
     *     
     */
    public PriceValueType8Code getNotSpcfdPric() {
        return notSpcfdPric;
    }

    /**
     * Sets the value of the notSpcfdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType8Code }
     *     
     */
    public void setNotSpcfdPric(PriceValueType8Code value) {
        this.notSpcfdPric = value;
    }

    /**
     * Gets the value of the amtPricPerFinInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerFinancialInstrumentQuantity10 }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity10 getAmtPricPerFinInstrmQty() {
        return amtPricPerFinInstrmQty;
    }

    /**
     * Sets the value of the amtPricPerFinInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerFinancialInstrumentQuantity10 }
     *     
     */
    public void setAmtPricPerFinInstrmQty(AmountPricePerFinancialInstrumentQuantity10 value) {
        this.amtPricPerFinInstrmQty = value;
    }

    /**
     * Gets the value of the amtPricPerAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerAmount2 }
     *     
     */
    public AmountPricePerAmount2 getAmtPricPerAmt() {
        return amtPricPerAmt;
    }

    /**
     * Sets the value of the amtPricPerAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerAmount2 }
     *     
     */
    public void setAmtPricPerAmt(AmountPricePerAmount2 value) {
        this.amtPricPerAmt = value;
    }

    /**
     * Gets the value of the indxPts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndxPts() {
        return indxPts;
    }

    /**
     * Sets the value of the indxPts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndxPts(BigDecimal value) {
        this.indxPts = value;
    }

}
