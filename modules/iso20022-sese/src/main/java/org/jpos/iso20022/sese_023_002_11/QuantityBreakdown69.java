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

package org.jpos.iso20022.sese_023_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityBreakdown69 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QuantityBreakdown69">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LotNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}GenericIdentification39" minOccurs="0"/>
 *         <element name="LotQty" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}FinancialInstrumentQuantity36Choice" minOccurs="0"/>
 *         <element name="LotDtTm" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="LotPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}Price3" minOccurs="0"/>
 *         <element name="TpOfPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.023.002.11}TypeOfPrice32Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityBreakdown69", propOrder = {
    "lotNb",
    "lotQty",
    "lotDtTm",
    "lotPric",
    "tpOfPric"
})
public class QuantityBreakdown69 {

    @XmlElement(name = "LotNb")
    protected GenericIdentification39 lotNb;
    @XmlElement(name = "LotQty")
    protected FinancialInstrumentQuantity36Choice lotQty;
    @XmlElement(name = "LotDtTm")
    protected DateAndDateTime2Choice lotDtTm;
    @XmlElement(name = "LotPric")
    protected Price3 lotPric;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice32Choice tpOfPric;

    /**
     * Gets the value of the lotNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification39 }
     *     
     */
    public GenericIdentification39 getLotNb() {
        return lotNb;
    }

    /**
     * Sets the value of the lotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification39 }
     *     
     */
    public void setLotNb(GenericIdentification39 value) {
        this.lotNb = value;
    }

    /**
     * Gets the value of the lotQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getLotQty() {
        return lotQty;
    }

    /**
     * Sets the value of the lotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setLotQty(FinancialInstrumentQuantity36Choice value) {
        this.lotQty = value;
    }

    /**
     * Gets the value of the lotDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getLotDtTm() {
        return lotDtTm;
    }

    /**
     * Sets the value of the lotDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setLotDtTm(DateAndDateTime2Choice value) {
        this.lotDtTm = value;
    }

    /**
     * Gets the value of the lotPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getLotPric() {
        return lotPric;
    }

    /**
     * Sets the value of the lotPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public void setLotPric(Price3 value) {
        this.lotPric = value;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice32Choice }
     *     
     */
    public TypeOfPrice32Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice32Choice }
     *     
     */
    public void setTpOfPric(TypeOfPrice32Choice value) {
        this.tpOfPric = value;
    }

}
