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

package org.jpos.iso20022.caaa_020_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Product6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ItmId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max35Text" minOccurs="0"/>
 *         <element name="PdctCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max70Text"/>
 *         <element name="AddtlPdctCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max70Text" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}UnitOfMeasure6Code" minOccurs="0"/>
 *         <element name="PdctQty" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}DecimalNumber" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="UnitPricSgn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}PlusOrMinusIndicator" minOccurs="0"/>
 *         <element name="PdctAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}ImpliedCurrencyAndAmount"/>
 *         <element name="PdctAmtSgn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}PlusOrMinusIndicator" minOccurs="0"/>
 *         <element name="ValAddedTax" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max35Text" minOccurs="0"/>
 *         <element name="PdctDesc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max140Text" minOccurs="0"/>
 *         <element name="DlvryLctn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max10Text" minOccurs="0"/>
 *         <element name="DlvrySvc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}AttendanceContext2Code" minOccurs="0"/>
 *         <element name="SaleChanl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max70Text" minOccurs="0"/>
 *         <element name="AddtlPdctDesc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product6", propOrder = {
    "itmId",
    "pdctCd",
    "addtlPdctCd",
    "unitOfMeasr",
    "pdctQty",
    "unitPric",
    "unitPricSgn",
    "pdctAmt",
    "pdctAmtSgn",
    "valAddedTax",
    "taxTp",
    "pdctDesc",
    "dlvryLctn",
    "dlvrySvc",
    "saleChanl",
    "addtlPdctDesc"
})
public class Product6 {

    @XmlElement(name = "ItmId")
    protected String itmId;
    @XmlElement(name = "PdctCd", required = true)
    protected String pdctCd;
    @XmlElement(name = "AddtlPdctCd")
    protected String addtlPdctCd;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure6Code unitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "UnitPric")
    protected BigDecimal unitPric;
    @XmlElement(name = "UnitPricSgn")
    protected Boolean unitPricSgn;
    @XmlElement(name = "PdctAmt", required = true)
    protected BigDecimal pdctAmt;
    @XmlElement(name = "PdctAmtSgn")
    protected Boolean pdctAmtSgn;
    @XmlElement(name = "ValAddedTax")
    protected BigDecimal valAddedTax;
    @XmlElement(name = "TaxTp")
    protected String taxTp;
    @XmlElement(name = "PdctDesc")
    protected String pdctDesc;
    @XmlElement(name = "DlvryLctn")
    protected String dlvryLctn;
    @XmlElement(name = "DlvrySvc")
    @XmlSchemaType(name = "string")
    protected AttendanceContext2Code dlvrySvc;
    @XmlElement(name = "SaleChanl")
    protected String saleChanl;
    @XmlElement(name = "AddtlPdctDesc")
    protected String addtlPdctDesc;

    /**
     * Gets the value of the itmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmId() {
        return itmId;
    }

    /**
     * Sets the value of the itmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmId(String value) {
        this.itmId = value;
    }

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
     * Gets the value of the unitPricSgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnitPricSgn() {
        return unitPricSgn;
    }

    /**
     * Sets the value of the unitPricSgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnitPricSgn(Boolean value) {
        this.unitPricSgn = value;
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
     * Gets the value of the pdctAmtSgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdctAmtSgn() {
        return pdctAmtSgn;
    }

    /**
     * Sets the value of the pdctAmtSgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPdctAmtSgn(Boolean value) {
        this.pdctAmtSgn = value;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValAddedTax(BigDecimal value) {
        this.valAddedTax = value;
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
     * Gets the value of the pdctDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctDesc() {
        return pdctDesc;
    }

    /**
     * Sets the value of the pdctDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctDesc(String value) {
        this.pdctDesc = value;
    }

    /**
     * Gets the value of the dlvryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryLctn() {
        return dlvryLctn;
    }

    /**
     * Sets the value of the dlvryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryLctn(String value) {
        this.dlvryLctn = value;
    }

    /**
     * Gets the value of the dlvrySvc property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceContext2Code }
     *     
     */
    public AttendanceContext2Code getDlvrySvc() {
        return dlvrySvc;
    }

    /**
     * Sets the value of the dlvrySvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceContext2Code }
     *     
     */
    public void setDlvrySvc(AttendanceContext2Code value) {
        this.dlvrySvc = value;
    }

    /**
     * Gets the value of the saleChanl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleChanl() {
        return saleChanl;
    }

    /**
     * Sets the value of the saleChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleChanl(String value) {
        this.saleChanl = value;
    }

    /**
     * Gets the value of the addtlPdctDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlPdctDesc() {
        return addtlPdctDesc;
    }

    /**
     * Sets the value of the addtlPdctDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlPdctDesc(String value) {
        this.addtlPdctDesc = value;
    }

}
