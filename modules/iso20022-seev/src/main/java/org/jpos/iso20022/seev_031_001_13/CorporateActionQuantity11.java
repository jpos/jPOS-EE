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
 * <p>Java class for CorporateActionQuantity11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionQuantity11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaxQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity34Choice" minOccurs="0"/>
 *         <element name="MinQtySght" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity34Choice" minOccurs="0"/>
 *         <element name="NewBrdLotQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *         <element name="NewDnmtnQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *         <element name="BaseDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *         <element name="IncrmtlDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}FinancialInstrumentQuantity35Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionQuantity11", propOrder = {
    "maxQty",
    "minQtySght",
    "newBrdLotQty",
    "newDnmtnQty",
    "baseDnmtn",
    "incrmtlDnmtn"
})
public class CorporateActionQuantity11 {

    @XmlElement(name = "MaxQty")
    protected FinancialInstrumentQuantity34Choice maxQty;
    @XmlElement(name = "MinQtySght")
    protected FinancialInstrumentQuantity34Choice minQtySght;
    @XmlElement(name = "NewBrdLotQty")
    protected FinancialInstrumentQuantity35Choice newBrdLotQty;
    @XmlElement(name = "NewDnmtnQty")
    protected FinancialInstrumentQuantity35Choice newDnmtnQty;
    @XmlElement(name = "BaseDnmtn")
    protected FinancialInstrumentQuantity35Choice baseDnmtn;
    @XmlElement(name = "IncrmtlDnmtn")
    protected FinancialInstrumentQuantity35Choice incrmtlDnmtn;

    /**
     * Gets the value of the maxQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public FinancialInstrumentQuantity34Choice getMaxQty() {
        return maxQty;
    }

    /**
     * Sets the value of the maxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public void setMaxQty(FinancialInstrumentQuantity34Choice value) {
        this.maxQty = value;
    }

    /**
     * Gets the value of the minQtySght property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public FinancialInstrumentQuantity34Choice getMinQtySght() {
        return minQtySght;
    }

    /**
     * Sets the value of the minQtySght property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity34Choice }
     *     
     */
    public void setMinQtySght(FinancialInstrumentQuantity34Choice value) {
        this.minQtySght = value;
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
     * Gets the value of the baseDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getBaseDnmtn() {
        return baseDnmtn;
    }

    /**
     * Sets the value of the baseDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public void setBaseDnmtn(FinancialInstrumentQuantity35Choice value) {
        this.baseDnmtn = value;
    }

    /**
     * Gets the value of the incrmtlDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public FinancialInstrumentQuantity35Choice getIncrmtlDnmtn() {
        return incrmtlDnmtn;
    }

    /**
     * Sets the value of the incrmtlDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity35Choice }
     *     
     */
    public void setIncrmtlDnmtn(FinancialInstrumentQuantity35Choice value) {
        this.incrmtlDnmtn = value;
    }

}
