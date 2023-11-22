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

package org.jpos.iso20022.semt_003_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceAmounts1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BalanceAmounts1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HldgVal" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}AmountAndDirection6"/>
 *         <element name="PrvsHldgVal" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}AmountAndDirection6" minOccurs="0"/>
 *         <element name="BookVal" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}AmountAndDirection6" minOccurs="0"/>
 *         <element name="UrlsdGnLoss" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}AmountAndDirection6" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}AmountAndDirection6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAmounts1", propOrder = {
    "hldgVal",
    "prvsHldgVal",
    "bookVal",
    "urlsdGnLoss",
    "acrdIntrstAmt"
})
public class BalanceAmounts1 {

    @XmlElement(name = "HldgVal", required = true)
    protected AmountAndDirection6 hldgVal;
    @XmlElement(name = "PrvsHldgVal")
    protected AmountAndDirection6 prvsHldgVal;
    @XmlElement(name = "BookVal")
    protected AmountAndDirection6 bookVal;
    @XmlElement(name = "UrlsdGnLoss")
    protected AmountAndDirection6 urlsdGnLoss;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection6 acrdIntrstAmt;

    /**
     * Gets the value of the hldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getHldgVal() {
        return hldgVal;
    }

    /**
     * Sets the value of the hldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public void setHldgVal(AmountAndDirection6 value) {
        this.hldgVal = value;
    }

    /**
     * Gets the value of the prvsHldgVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getPrvsHldgVal() {
        return prvsHldgVal;
    }

    /**
     * Sets the value of the prvsHldgVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public void setPrvsHldgVal(AmountAndDirection6 value) {
        this.prvsHldgVal = value;
    }

    /**
     * Gets the value of the bookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getBookVal() {
        return bookVal;
    }

    /**
     * Sets the value of the bookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public void setBookVal(AmountAndDirection6 value) {
        this.bookVal = value;
    }

    /**
     * Gets the value of the urlsdGnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getUrlsdGnLoss() {
        return urlsdGnLoss;
    }

    /**
     * Sets the value of the urlsdGnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public void setUrlsdGnLoss(AmountAndDirection6 value) {
        this.urlsdGnLoss = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public AmountAndDirection6 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection6 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection6 value) {
        this.acrdIntrstAmt = value;
    }

}
