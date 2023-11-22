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

package org.jpos.iso20022.semt_019_002_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherAmounts36 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherAmounts36">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="ChrgsFees" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="TradAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="ExctgBrkrAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="LclTax" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="LclBrkrComssn" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="StmpDty" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="TxTax" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="WhldgTax" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *         <element name="CsmptnTax" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.002.10}AmountAndDirection72" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmounts36", propOrder = {
    "acrdIntrstAmt",
    "chrgsFees",
    "tradAmt",
    "exctgBrkrAmt",
    "lclTax",
    "lclBrkrComssn",
    "othr",
    "stmpDty",
    "txTax",
    "whldgTax",
    "csmptnTax"
})
public class OtherAmounts36 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection72 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection72 chrgsFees;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection72 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection72 exctgBrkrAmt;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection72 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection72 lclBrkrComssn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection72 othr;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection72 stmpDty;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection72 txTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection72 whldgTax;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection72 csmptnTax;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection72 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setChrgsFees(AmountAndDirection72 value) {
        this.chrgsFees = value;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setTradAmt(AmountAndDirection72 value) {
        this.tradAmt = value;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setExctgBrkrAmt(AmountAndDirection72 value) {
        this.exctgBrkrAmt = value;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setLclTax(AmountAndDirection72 value) {
        this.lclTax = value;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setLclBrkrComssn(AmountAndDirection72 value) {
        this.lclBrkrComssn = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setOthr(AmountAndDirection72 value) {
        this.othr = value;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setStmpDty(AmountAndDirection72 value) {
        this.stmpDty = value;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setTxTax(AmountAndDirection72 value) {
        this.txTax = value;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setWhldgTax(AmountAndDirection72 value) {
        this.whldgTax = value;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public void setCsmptnTax(AmountAndDirection72 value) {
        this.csmptnTax = value;
    }

}
