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

package org.jpos.iso20022.seev_033_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPrice3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountPrice3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmtPricTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}AmountPriceType1Code"/>
 *         <element name="PricVal" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}ActiveCurrencyAnd13DecimalAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPrice3", propOrder = {
    "amtPricTp",
    "pricVal"
})
public class AmountPrice3 {

    @XmlElement(name = "AmtPricTp", required = true)
    @XmlSchemaType(name = "string")
    protected AmountPriceType1Code amtPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected ActiveCurrencyAnd13DecimalAmount pricVal;

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

}
