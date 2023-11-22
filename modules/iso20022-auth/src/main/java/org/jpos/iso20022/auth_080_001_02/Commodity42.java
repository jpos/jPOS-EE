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

package org.jpos.iso20022.auth_080_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Commodity42 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Commodity42">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Clssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareCommodityAssetClass3" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDecimalNumber3" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareUnitPrice6" minOccurs="0"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareAmountAndDirection2" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareUnitOfMeasure3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity42", propOrder = {
    "clssfctn",
    "qty",
    "unitPric",
    "mktVal",
    "unitOfMeasr"
})
public class Commodity42 {

    @XmlElement(name = "Clssfctn")
    protected CompareCommodityAssetClass3 clssfctn;
    @XmlElement(name = "Qty")
    protected CompareDecimalNumber3 qty;
    @XmlElement(name = "UnitPric")
    protected CompareUnitPrice6 unitPric;
    @XmlElement(name = "MktVal")
    protected CompareAmountAndDirection2 mktVal;
    @XmlElement(name = "UnitOfMeasr")
    protected CompareUnitOfMeasure3 unitOfMeasr;

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCommodityAssetClass3 }
     *     
     */
    public CompareCommodityAssetClass3 getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCommodityAssetClass3 }
     *     
     */
    public void setClssfctn(CompareCommodityAssetClass3 value) {
        this.clssfctn = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public void setQty(CompareDecimalNumber3 value) {
        this.qty = value;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice6 }
     *     
     */
    public CompareUnitPrice6 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice6 }
     *     
     */
    public void setUnitPric(CompareUnitPrice6 value) {
        this.unitPric = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public CompareAmountAndDirection2 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public void setMktVal(CompareAmountAndDirection2 value) {
        this.mktVal = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitOfMeasure3 }
     *     
     */
    public CompareUnitOfMeasure3 getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitOfMeasure3 }
     *     
     */
    public void setUnitOfMeasr(CompareUnitOfMeasure3 value) {
        this.unitOfMeasr = value;
    }

}
