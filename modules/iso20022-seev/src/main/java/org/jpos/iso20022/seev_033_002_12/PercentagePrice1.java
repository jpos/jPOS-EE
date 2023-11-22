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

package org.jpos.iso20022.seev_033_002_12;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentagePrice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PercentagePrice1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PctgPricTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}PriceRateType3Code"/>
 *         <element name="PricVal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.002.12}PercentageRate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentagePrice1", propOrder = {
    "pctgPricTp",
    "pricVal"
})
public class PercentagePrice1 {

    @XmlElement(name = "PctgPricTp", required = true)
    @XmlSchemaType(name = "string")
    protected PriceRateType3Code pctgPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected BigDecimal pricVal;

    /**
     * Gets the value of the pctgPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateType3Code }
     *     
     */
    public PriceRateType3Code getPctgPricTp() {
        return pctgPricTp;
    }

    /**
     * Sets the value of the pctgPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateType3Code }
     *     
     */
    public void setPctgPricTp(PriceRateType3Code value) {
        this.pctgPricTp = value;
    }

    /**
     * Gets the value of the pricVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricVal() {
        return pricVal;
    }

    /**
     * Sets the value of the pricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricVal(BigDecimal value) {
        this.pricVal = value;
    }

}
