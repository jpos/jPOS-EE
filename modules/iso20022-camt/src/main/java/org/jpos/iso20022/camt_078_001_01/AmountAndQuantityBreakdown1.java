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

package org.jpos.iso20022.camt_078_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountAndQuantityBreakdown1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountAndQuantityBreakdown1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LotNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}GenericIdentification37" minOccurs="0"/>
 *         <element name="LotAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}AmountAndDirection5" minOccurs="0"/>
 *         <element name="LotQty" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="CshSubBalTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.078.001.01}GenericIdentification30" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndQuantityBreakdown1", propOrder = {
    "lotNb",
    "lotAmt",
    "lotQty",
    "cshSubBalTp"
})
public class AmountAndQuantityBreakdown1 {

    @XmlElement(name = "LotNb")
    protected GenericIdentification37 lotNb;
    @XmlElement(name = "LotAmt")
    protected AmountAndDirection5 lotAmt;
    @XmlElement(name = "LotQty")
    protected FinancialInstrumentQuantity1Choice lotQty;
    @XmlElement(name = "CshSubBalTp")
    protected GenericIdentification30 cshSubBalTp;

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
     * Gets the value of the lotAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getLotAmt() {
        return lotAmt;
    }

    /**
     * Sets the value of the lotAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setLotAmt(AmountAndDirection5 value) {
        this.lotAmt = value;
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
     * Gets the value of the cshSubBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getCshSubBalTp() {
        return cshSubBalTp;
    }

    /**
     * Sets the value of the cshSubBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setCshSubBalTp(GenericIdentification30 value) {
        this.cshSubBalTp = value;
    }

}
