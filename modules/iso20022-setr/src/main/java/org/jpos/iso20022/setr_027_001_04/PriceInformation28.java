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
 * <p>Java class for PriceInformation28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceInformation28">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14"/>
 *         <element name="QtnDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="PricClctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}DateTimePeriod1Choice" minOccurs="0"/>
 *         <element name="SrcOfPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}MarketIdentification93" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformation28", propOrder = {
    "val",
    "qtnDt",
    "pricClctnPrd",
    "srcOfPric"
})
public class PriceInformation28 {

    @XmlElement(name = "Val", required = true)
    protected Price14 val;
    @XmlElement(name = "QtnDt")
    protected DateAndDateTime1Choice qtnDt;
    @XmlElement(name = "PricClctnPrd")
    protected DateTimePeriod1Choice pricClctnPrd;
    @XmlElement(name = "SrcOfPric")
    protected MarketIdentification93 srcOfPric;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setVal(Price14 value) {
        this.val = value;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setQtnDt(DateAndDateTime1Choice value) {
        this.qtnDt = value;
    }

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setPricClctnPrd(DateTimePeriod1Choice value) {
        this.pricClctnPrd = value;
    }

    /**
     * Gets the value of the srcOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification93 }
     *     
     */
    public MarketIdentification93 getSrcOfPric() {
        return srcOfPric;
    }

    /**
     * Sets the value of the srcOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification93 }
     *     
     */
    public void setSrcOfPric(MarketIdentification93 value) {
        this.srcOfPric = value;
    }

}
