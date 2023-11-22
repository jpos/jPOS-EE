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

package org.jpos.iso20022.setr_027_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialFill4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartialFill4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConfQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Quantity6Choice"/>
 *         <element name="DealPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}TradeDate7Choice" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}MarketIdentification97" minOccurs="0"/>
 *         <element name="OrgnlOrdrdQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}QuantityOrAmount2Choice"/>
 *         <element name="PrevslyExctdQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}QuantityOrAmount2Choice"/>
 *         <element name="RmngQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}QuantityOrAmount2Choice"/>
 *         <element name="MtchIncrmtQty" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}QuantityOrAmount2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialFill4", propOrder = {
    "confQty",
    "dealPric",
    "tradDt",
    "plcOfTrad",
    "orgnlOrdrdQty",
    "prevslyExctdQty",
    "rmngQty",
    "mtchIncrmtQty"
})
public class PartialFill4 {

    @XmlElement(name = "ConfQty", required = true)
    protected Quantity6Choice confQty;
    @XmlElement(name = "DealPric", required = true)
    protected Price14 dealPric;
    @XmlElement(name = "TradDt")
    protected TradeDate7Choice tradDt;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification97 plcOfTrad;
    @XmlElement(name = "OrgnlOrdrdQty", required = true)
    protected QuantityOrAmount2Choice orgnlOrdrdQty;
    @XmlElement(name = "PrevslyExctdQty", required = true)
    protected QuantityOrAmount2Choice prevslyExctdQty;
    @XmlElement(name = "RmngQty", required = true)
    protected QuantityOrAmount2Choice rmngQty;
    @XmlElement(name = "MtchIncrmtQty")
    protected QuantityOrAmount2Choice mtchIncrmtQty;

    /**
     * Gets the value of the confQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getConfQty() {
        return confQty;
    }

    /**
     * Sets the value of the confQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public void setConfQty(Quantity6Choice value) {
        this.confQty = value;
    }

    /**
     * Gets the value of the dealPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getDealPric() {
        return dealPric;
    }

    /**
     * Sets the value of the dealPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setDealPric(Price14 value) {
        this.dealPric = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate7Choice }
     *     
     */
    public TradeDate7Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate7Choice }
     *     
     */
    public void setTradDt(TradeDate7Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification97 }
     *     
     */
    public MarketIdentification97 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification97 }
     *     
     */
    public void setPlcOfTrad(MarketIdentification97 value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the orgnlOrdrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public QuantityOrAmount2Choice getOrgnlOrdrdQty() {
        return orgnlOrdrdQty;
    }

    /**
     * Sets the value of the orgnlOrdrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public void setOrgnlOrdrdQty(QuantityOrAmount2Choice value) {
        this.orgnlOrdrdQty = value;
    }

    /**
     * Gets the value of the prevslyExctdQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public QuantityOrAmount2Choice getPrevslyExctdQty() {
        return prevslyExctdQty;
    }

    /**
     * Sets the value of the prevslyExctdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public void setPrevslyExctdQty(QuantityOrAmount2Choice value) {
        this.prevslyExctdQty = value;
    }

    /**
     * Gets the value of the rmngQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public QuantityOrAmount2Choice getRmngQty() {
        return rmngQty;
    }

    /**
     * Sets the value of the rmngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public void setRmngQty(QuantityOrAmount2Choice value) {
        this.rmngQty = value;
    }

    /**
     * Gets the value of the mtchIncrmtQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public QuantityOrAmount2Choice getMtchIncrmtQty() {
        return mtchIncrmtQty;
    }

    /**
     * Sets the value of the mtchIncrmtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount2Choice }
     *     
     */
    public void setMtchIncrmtQty(QuantityOrAmount2Choice value) {
        this.mtchIncrmtQty = value;
    }

}
