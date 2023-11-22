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

package org.jpos.iso20022.auth_079_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Commodity43 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Commodity43">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Clssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}AssetClassCommodity5Choice" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Quantity17" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}SecuritiesTransactionPrice19Choice" minOccurs="0"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}AmountAndDirection53" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity43", propOrder = {
    "clssfctn",
    "qty",
    "unitPric",
    "mktVal"
})
public class Commodity43 {

    @XmlElement(name = "Clssfctn")
    protected AssetClassCommodity5Choice clssfctn;
    @XmlElement(name = "Qty")
    protected Quantity17 qty;
    @XmlElement(name = "UnitPric")
    protected SecuritiesTransactionPrice19Choice unitPric;
    @XmlElement(name = "MktVal")
    protected AmountAndDirection53 mktVal;

    /**
     * Gets the value of the clssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity5Choice }
     *     
     */
    public AssetClassCommodity5Choice getClssfctn() {
        return clssfctn;
    }

    /**
     * Sets the value of the clssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity5Choice }
     *     
     */
    public void setClssfctn(AssetClassCommodity5Choice value) {
        this.clssfctn = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity17 }
     *     
     */
    public Quantity17 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity17 }
     *     
     */
    public void setQty(Quantity17 value) {
        this.qty = value;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice19Choice }
     *     
     */
    public SecuritiesTransactionPrice19Choice getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice19Choice }
     *     
     */
    public void setUnitPric(SecuritiesTransactionPrice19Choice value) {
        this.unitPric = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setMktVal(AmountAndDirection53 value) {
        this.mktVal = value;
    }

}
