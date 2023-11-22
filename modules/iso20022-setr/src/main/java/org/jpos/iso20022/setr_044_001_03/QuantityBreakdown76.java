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

package org.jpos.iso20022.setr_044_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityBreakdown76 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QuantityBreakdown76">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LotNb" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}GenericIdentification37" minOccurs="0"/>
 *         <element name="LotQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="LotDtTm" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="LotPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.044.001.03}Price14" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityBreakdown76", propOrder = {
    "lotNb",
    "lotQty",
    "lotDtTm",
    "lotPric"
})
public class QuantityBreakdown76 {

    @XmlElement(name = "LotNb")
    protected GenericIdentification37 lotNb;
    @XmlElement(name = "LotQty")
    protected FinancialInstrumentQuantity1Choice lotQty;
    @XmlElement(name = "LotDtTm")
    protected DateAndDateTime1Choice lotDtTm;
    @XmlElement(name = "LotPric")
    protected Price14 lotPric;

    /**
     * Gets the value of the lotNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getLotNb() {
        return lotNb;
    }

    /**
     * Sets the value of the lotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setLotNb(GenericIdentification37 value) {
        this.lotNb = value;
    }

    /**
     * Gets the value of the lotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getLotQty() {
        return lotQty;
    }

    /**
     * Sets the value of the lotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setLotQty(FinancialInstrumentQuantity1Choice value) {
        this.lotQty = value;
    }

    /**
     * Gets the value of the lotDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getLotDtTm() {
        return lotDtTm;
    }

    /**
     * Sets the value of the lotDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setLotDtTm(DateAndDateTime1Choice value) {
        this.lotDtTm = value;
    }

    /**
     * Gets the value of the lotPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getLotPric() {
        return lotPric;
    }

    /**
     * Sets the value of the lotPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setLotPric(Price14 value) {
        this.lotPric = value;
    }

}
