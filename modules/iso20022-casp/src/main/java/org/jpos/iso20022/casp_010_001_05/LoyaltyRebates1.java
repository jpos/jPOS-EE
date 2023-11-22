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

package org.jpos.iso20022.casp_010_001_05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyRebates1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyRebates1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlRbt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RbtLabl" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SaleItmRbt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}SaleItemRebate1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRebates1", propOrder = {
    "ttlRbt",
    "rbtLabl",
    "saleItmRbt"
})
public class LoyaltyRebates1 {

    @XmlElement(name = "TtlRbt")
    protected BigDecimal ttlRbt;
    @XmlElement(name = "RbtLabl")
    protected String rbtLabl;
    @XmlElement(name = "SaleItmRbt")
    protected List<SaleItemRebate1> saleItmRbt;

    /**
     * Gets the value of the ttlRbt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlRbt() {
        return ttlRbt;
    }

    /**
     * Sets the value of the ttlRbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlRbt(BigDecimal value) {
        this.ttlRbt = value;
    }

    /**
     * Gets the value of the rbtLabl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbtLabl() {
        return rbtLabl;
    }

    /**
     * Sets the value of the rbtLabl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRbtLabl(String value) {
        this.rbtLabl = value;
    }

    /**
     * Gets the value of the saleItmRbt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the saleItmRbt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleItmRbt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleItemRebate1 }
     * 
     * 
     * @return
     *     The value of the saleItmRbt property.
     */
    public List<SaleItemRebate1> getSaleItmRbt() {
        if (saleItmRbt == null) {
            saleItmRbt = new ArrayList<>();
        }
        return this.saleItmRbt;
    }

}
