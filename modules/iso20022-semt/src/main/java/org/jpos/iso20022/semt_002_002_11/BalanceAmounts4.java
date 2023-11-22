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

package org.jpos.iso20022.semt_002_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceAmounts4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BalanceAmounts4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HldgVal" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}AmountAndDirection14" minOccurs="0"/>
 *         <element name="PrvsHldgVal" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}AmountAndDirection14" minOccurs="0"/>
 *         <element name="BookVal" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}AmountAndDirection14" minOccurs="0"/>
 *         <element name="ElgblCollVal" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}AmountAndDirection14" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}AmountAndDirection14" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAmounts4", propOrder = {
    "hldgVal",
    "prvsHldgVal",
    "bookVal",
    "elgblCollVal",
    "acrdIntrstAmt"
})
public class BalanceAmounts4 {

    @XmlElement(name = "HldgVal")
    protected AmountAndDirection14 hldgVal;
    @XmlElement(name = "PrvsHldgVal")
    protected AmountAndDirection14 prvsHldgVal;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection14 bookVal;
    @XmlElement(name = "ElgblCollVal")
    protected AmountAndDirection14 elgblCollVal;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection14 acrdIntrstAmt;

    /**
     * Gets the value of the hldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getHldgVal() {
        return hldgVal;
    }

    /**
     * Sets the value of the hldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public void setHldgVal(AmountAndDirection14 value) {
        this.hldgVal = value;
    }

    /**
     * Gets the value of the prvsHldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getPrvsHldgVal() {
        return prvsHldgVal;
    }

    /**
     * Sets the value of the prvsHldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public void setPrvsHldgVal(AmountAndDirection14 value) {
        this.prvsHldgVal = value;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public void setBookVal(AmountAndDirection14 value) {
        this.bookVal = value;
    }

    /**
     * Gets the value of the elgblCollVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getElgblCollVal() {
        return elgblCollVal;
    }

    /**
     * Sets the value of the elgblCollVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public void setElgblCollVal(AmountAndDirection14 value) {
        this.elgblCollVal = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public AmountAndDirection14 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection14 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection14 value) {
        this.acrdIntrstAmt = value;
    }

}
