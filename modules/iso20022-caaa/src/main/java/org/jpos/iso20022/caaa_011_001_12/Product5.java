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

package org.jpos.iso20022.caaa_011_001_12;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Product5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PdctCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max70Text"/>
 *         <element name="AddtlPdctCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Max70Text" minOccurs="0"/>
 *         <element name="AmtLmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="QtyLmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}DecimalNumber" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}UnitOfMeasure6Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product5", propOrder = {
    "pdctCd",
    "addtlPdctCd",
    "amtLmt",
    "qtyLmt",
    "unitOfMeasr"
})
public class Product5 {

    @XmlElement(name = "PdctCd", required = true)
    protected String pdctCd;
    @XmlElement(name = "AddtlPdctCd")
    protected String addtlPdctCd;
    @XmlElement(name = "AmtLmt")
    protected BigDecimal amtLmt;
    @XmlElement(name = "QtyLmt")
    protected BigDecimal qtyLmt;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure6Code unitOfMeasr;

    /**
     * Gets the value of the pdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCd() {
        return pdctCd;
    }

    /**
     * Sets the value of the pdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctCd(String value) {
        this.pdctCd = value;
    }

    /**
     * Gets the value of the addtlPdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlPdctCd() {
        return addtlPdctCd;
    }

    /**
     * Sets the value of the addtlPdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlPdctCd(String value) {
        this.addtlPdctCd = value;
    }

    /**
     * Gets the value of the amtLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtLmt() {
        return amtLmt;
    }

    /**
     * Sets the value of the amtLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtLmt(BigDecimal value) {
        this.amtLmt = value;
    }

    /**
     * Gets the value of the qtyLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyLmt() {
        return qtyLmt;
    }

    /**
     * Sets the value of the qtyLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyLmt(BigDecimal value) {
        this.qtyLmt = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure6Code }
     *     
     */
    public UnitOfMeasure6Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure6Code }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure6Code value) {
        this.unitOfMeasr = value;
    }

}
