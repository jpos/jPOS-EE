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

package org.jpos.iso20022.camt_054_001_11;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Product2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PdctCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Max70Text"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}UnitOfMeasure1Code" minOccurs="0"/>
 *         <element name="PdctQty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}DecimalNumber" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PdctAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Max35Text" minOccurs="0"/>
 *         <element name="AddtlPdctInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product2", propOrder = {
    "pdctCd",
    "unitOfMeasr",
    "pdctQty",
    "unitPric",
    "pdctAmt",
    "taxTp",
    "addtlPdctInf"
})
public class Product2 {

    @XmlElement(name = "PdctCd", required = true)
    protected String pdctCd;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "UnitPric")
    protected BigDecimal unitPric;
    @XmlElement(name = "PdctAmt")
    protected BigDecimal pdctAmt;
    @XmlElement(name = "TaxTp")
    protected String taxTp;
    @XmlElement(name = "AddtlPdctInf")
    protected String addtlPdctInf;

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
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public UnitOfMeasure1Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the pdctQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctQty() {
        return pdctQty;
    }

    /**
     * Sets the value of the pdctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPdctQty(BigDecimal value) {
        this.pdctQty = value;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPric(BigDecimal value) {
        this.unitPric = value;
    }

    /**
     * Gets the value of the pdctAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctAmt() {
        return pdctAmt;
    }

    /**
     * Sets the value of the pdctAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPdctAmt(BigDecimal value) {
        this.pdctAmt = value;
    }

    /**
     * Gets the value of the taxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTp() {
        return taxTp;
    }

    /**
     * Sets the value of the taxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTp(String value) {
        this.taxTp = value;
    }

    /**
     * Gets the value of the addtlPdctInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlPdctInf() {
        return addtlPdctInf;
    }

    /**
     * Sets the value of the addtlPdctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlPdctInf(String value) {
        this.addtlPdctInf = value;
    }

}
