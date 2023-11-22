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

package org.jpos.iso20022.cain_025_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleItem3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SaleItem3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PdctTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="PdctCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max70Text" minOccurs="0"/>
 *         <element name="PdctCdTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ProductCodeType1Code" minOccurs="0"/>
 *         <element name="AddtlPdctCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max70Text" minOccurs="0"/>
 *         <element name="AddtlPdctCdTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="PdctCdModfr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}DecimalNumber" minOccurs="0"/>
 *         <element name="PdctDesc" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max140Text" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}UnitOfMeasure1Code" minOccurs="0"/>
 *         <element name="OthrUnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="PdctQty" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}DecimalNumber" minOccurs="0"/>
 *         <element name="NonAdjstdUnitPric" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NonAdjstdTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Adjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Adjustment10" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AdjstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="InsrncAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleItem3", propOrder = {
    "pdctTp",
    "pdctCd",
    "pdctCdTp",
    "addtlPdctCd",
    "addtlPdctCdTp",
    "pdctCdModfr",
    "pdctDesc",
    "unitOfMeasr",
    "othrUnitOfMeasr",
    "pdctQty",
    "nonAdjstdUnitPric",
    "nonAdjstdTtlAmt",
    "adjstmnt",
    "adjstdAmt",
    "insrncInd",
    "insrncAmt",
    "tax",
    "ttlAmt"
})
public class SaleItem3 {

    @XmlElement(name = "PdctTp")
    protected String pdctTp;
    @XmlElement(name = "PdctCd")
    protected String pdctCd;
    @XmlElement(name = "PdctCdTp")
    @XmlSchemaType(name = "string")
    protected ProductCodeType1Code pdctCdTp;
    @XmlElement(name = "AddtlPdctCd")
    protected String addtlPdctCd;
    @XmlElement(name = "AddtlPdctCdTp")
    protected String addtlPdctCdTp;
    @XmlElement(name = "PdctCdModfr")
    protected BigDecimal pdctCdModfr;
    @XmlElement(name = "PdctDesc")
    protected String pdctDesc;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "OthrUnitOfMeasr")
    protected String othrUnitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "NonAdjstdUnitPric")
    protected BigDecimal nonAdjstdUnitPric;
    @XmlElement(name = "NonAdjstdTtlAmt")
    protected BigDecimal nonAdjstdTtlAmt;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment10> adjstmnt;
    @XmlElement(name = "AdjstdAmt")
    protected BigDecimal adjstdAmt;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "Tax")
    protected List<Tax39> tax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctTp(String value) {
        this.pdctTp = value;
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
     * Gets the value of the pdctCdTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCodeType1Code }
     *     
     */
    public ProductCodeType1Code getPdctCdTp() {
        return pdctCdTp;
    }

    /**
     * Sets the value of the pdctCdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodeType1Code }
     *     
     */
    public void setPdctCdTp(ProductCodeType1Code value) {
        this.pdctCdTp = value;
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
     * Gets the value of the addtlPdctCdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlPdctCdTp() {
        return addtlPdctCdTp;
    }

    /**
     * Sets the value of the addtlPdctCdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlPdctCdTp(String value) {
        this.addtlPdctCdTp = value;
    }

    /**
     * Gets the value of the pdctCdModfr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctCdModfr() {
        return pdctCdModfr;
    }

    /**
     * Sets the value of the pdctCdModfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPdctCdModfr(BigDecimal value) {
        this.pdctCdModfr = value;
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
     * Gets the value of the othrUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitOfMeasr() {
        return othrUnitOfMeasr;
    }

    /**
     * Sets the value of the othrUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrUnitOfMeasr(String value) {
        this.othrUnitOfMeasr = value;
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
     * Gets the value of the nonAdjstdUnitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonAdjstdUnitPric() {
        return nonAdjstdUnitPric;
    }

    /**
     * Sets the value of the nonAdjstdUnitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonAdjstdUnitPric(BigDecimal value) {
        this.nonAdjstdUnitPric = value;
    }

    /**
     * Gets the value of the nonAdjstdTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonAdjstdTtlAmt() {
        return nonAdjstdTtlAmt;
    }

    /**
     * Sets the value of the nonAdjstdTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNonAdjstdTtlAmt(BigDecimal value) {
        this.nonAdjstdTtlAmt = value;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment10 }
     * 
     * 
     * @return
     *     The value of the adjstmnt property.
     */
    public List<Adjustment10> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the adjstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjstdAmt() {
        return adjstdAmt;
    }

    /**
     * Sets the value of the adjstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjstdAmt(BigDecimal value) {
        this.adjstdAmt = value;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsrncInd(Boolean value) {
        this.insrncInd = value;
    }

    /**
     * Gets the value of the insrncAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncAmt() {
        return insrncAmt;
    }

    /**
     * Sets the value of the insrncAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax39> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
    }

}
