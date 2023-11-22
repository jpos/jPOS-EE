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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesOption81 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesOption81">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaxQtyToInst" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity34Choice" minOccurs="0"/>
 *         <element name="MinQtyToInst" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity34Choice" minOccurs="0"/>
 *         <element name="MinMltplQtyToInst" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *         <element name="NewBrdLotQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *         <element name="NewDnmtnQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *         <element name="FrntEndOddLotQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *         <element name="BckEndOddLotQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption81", propOrder = {
    "maxQtyToInst",
    "minQtyToInst",
    "minMltplQtyToInst",
    "newBrdLotQty",
    "newDnmtnQty",
    "frntEndOddLotQty",
    "bckEndOddLotQty"
})
public class SecuritiesOption81 {

    @XmlElement(name = "MaxQtyToInst")
    protected FinancialInstrumentQuantity34Choice maxQtyToInst;
    @XmlElement(name = "MinQtyToInst")
    protected FinancialInstrumentQuantity34Choice minQtyToInst;
    @XmlElement(name = "MinMltplQtyToInst")
    protected FinancialInstrumentQuantity35Choice minMltplQtyToInst;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity35Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity35Choice newDnmtnQty;
    @XmlElement(name = "FrntEndOddLotQty")
    protected FinancialInstrumentQuantity35Choice frntEndOddLotQty;
    @XmlElement(name = "BckEndOddLotQty")
    protected FinancialInstrumentQuantity35Choice bckEndOddLotQty;

    /**
     * Gets the value of the maxQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public FinancialInstrumentQuantity34Choice getMaxQtyToInst() {
        return maxQtyToInst;
    }

    /**
     * Sets the value of the maxQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public void setMaxQtyToInst(FinancialInstrumentQuantity34Choice value) {
        this.maxQtyToInst = value;
    }

    /**
     * Gets the value of the minQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public FinancialInstrumentQuantity34Choice getMinQtyToInst() {
        return minQtyToInst;
    }

    /**
     * Sets the value of the minQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public void setMinQtyToInst(FinancialInstrumentQuantity34Choice value) {
        this.minQtyToInst = value;
    }

    /**
     * Gets the value of the minMltplQtyToInst property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getMinMltplQtyToInst() {
        return minMltplQtyToInst;
    }

    /**
     * Sets the value of the minMltplQtyToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public void setMinMltplQtyToInst(FinancialInstrumentQuantity35Choice value) {
        this.minMltplQtyToInst = value;
    }

    /**
     * Gets the value of the newBrdLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getNewBrdLotQty() {
        return newBrdLotQty;
    }

    /**
     * Sets the value of the newBrdLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public void setNewBrdLotQty(FinancialInstrumentQuantity35Choice value) {
        this.newBrdLotQty = value;
    }

    /**
     * Gets the value of the newDnmtnQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getNewDnmtnQty() {
        return newDnmtnQty;
    }

    /**
     * Sets the value of the newDnmtnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public void setNewDnmtnQty(FinancialInstrumentQuantity35Choice value) {
        this.newDnmtnQty = value;
    }

    /**
     * Gets the value of the frntEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getFrntEndOddLotQty() {
        return frntEndOddLotQty;
    }

    /**
     * Sets the value of the frntEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public void setFrntEndOddLotQty(FinancialInstrumentQuantity35Choice value) {
        this.frntEndOddLotQty = value;
    }

    /**
     * Gets the value of the bckEndOddLotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getBckEndOddLotQty() {
        return bckEndOddLotQty;
    }

    /**
     * Sets the value of the bckEndOddLotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public void setBckEndOddLotQty(FinancialInstrumentQuantity35Choice value) {
        this.bckEndOddLotQty = value;
    }

}
