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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceFormat4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceFormat4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AmountPrice1"/>
 *         <element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}PriceRate1"/>
 *         <element name="NotSpcfd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}PriceValueType5FormatChoice"/>
 *         <element name="IndxPts" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}DecimalNumber"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceFormat4Choice", propOrder = {
    "amt",
    "rate",
    "notSpcfd",
    "indxPts"
})
public class PriceFormat4Choice {

    @XmlElement(name = "Amt")
    protected AmountPrice1 amt;
    @XmlElement(name = "Rate")
    protected PriceRate1 rate;
    @XmlElement(name = "NotSpcfd")
    protected PriceValueType5FormatChoice notSpcfd;
    @XmlElement(name = "IndxPts")
    protected BigDecimal indxPts;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice1 }
     *     
     */
    public AmountPrice1 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice1 }
     *     
     */
    public void setAmt(AmountPrice1 value) {
        this.amt = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRate1 }
     *     
     */
    public PriceRate1 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRate1 }
     *     
     */
    public void setRate(PriceRate1 value) {
        this.rate = value;
    }

    /**
     * Gets the value of the notSpcfd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType5FormatChoice }
     *     
     */
    public PriceValueType5FormatChoice getNotSpcfd() {
        return notSpcfd;
    }

    /**
     * Sets the value of the notSpcfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType5FormatChoice }
     *     
     */
    public void setNotSpcfd(PriceValueType5FormatChoice value) {
        this.notSpcfd = value;
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
