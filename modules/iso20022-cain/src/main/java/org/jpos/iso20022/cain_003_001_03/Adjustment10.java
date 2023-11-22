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

package org.jpos.iso20022.cain_003_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adjustment10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Adjustment10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="AddtlTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max70Text" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="PrmtnElgblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PrmtnCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="PrmtnCpnNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}DecimalNumber" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}PercentageRate" minOccurs="0"/>
 *         <element name="AdjstmntAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxClctdOnOrgnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adjustment10", propOrder = {
    "tp",
    "addtlTp",
    "desc",
    "rsn",
    "prmtnElgblty",
    "prmtnCd",
    "prmtnCpnNb",
    "qty",
    "unitPric",
    "pctg",
    "adjstmntAmt",
    "taxClctdOnOrgnlAmt"
})
public class Adjustment10 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "AddtlTp")
    protected String addtlTp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Rsn")
    protected String rsn;
    @XmlElement(name = "PrmtnElgblty")
    protected Boolean prmtnElgblty;
    @XmlElement(name = "PrmtnCd")
    protected String prmtnCd;
    @XmlElement(name = "PrmtnCpnNb")
    protected String prmtnCpnNb;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "UnitPric")
    protected BigDecimal unitPric;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "AdjstmntAmt")
    protected BigDecimal adjstmntAmt;
    @XmlElement(name = "TaxClctdOnOrgnlAmt")
    protected Boolean taxClctdOnOrgnlAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the addtlTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTp() {
        return addtlTp;
    }

    /**
     * Sets the value of the addtlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlTp(String value) {
        this.addtlTp = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsn(String value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the prmtnElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrmtnElgblty() {
        return prmtnElgblty;
    }

    /**
     * Sets the value of the prmtnElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrmtnElgblty(Boolean value) {
        this.prmtnElgblty = value;
    }

    /**
     * Gets the value of the prmtnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmtnCd() {
        return prmtnCd;
    }

    /**
     * Sets the value of the prmtnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrmtnCd(String value) {
        this.prmtnCd = value;
    }

    /**
     * Gets the value of the prmtnCpnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmtnCpnNb() {
        return prmtnCpnNb;
    }

    /**
     * Sets the value of the prmtnCpnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrmtnCpnNb(String value) {
        this.prmtnCpnNb = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
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
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctg(BigDecimal value) {
        this.pctg = value;
    }

    /**
     * Gets the value of the adjstmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjstmntAmt() {
        return adjstmntAmt;
    }

    /**
     * Sets the value of the adjstmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjstmntAmt(BigDecimal value) {
        this.adjstmntAmt = value;
    }

    /**
     * Gets the value of the taxClctdOnOrgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxClctdOnOrgnlAmt() {
        return taxClctdOnOrgnlAmt;
    }

    /**
     * Sets the value of the taxClctdOnOrgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxClctdOnOrgnlAmt(Boolean value) {
        this.taxClctdOnOrgnlAmt = value;
    }

}
