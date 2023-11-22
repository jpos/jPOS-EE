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

package org.jpos.iso20022.seev_036_002_14;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionRate114 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionRate114">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddtlQtyForSbcbdRsltntScties" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RatioFormat21Choice" minOccurs="0"/>
 *         <element name="AddtlQtyForExstgScties" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RatioFormat21Choice" minOccurs="0"/>
 *         <element name="NewToOd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RatioFormat22Choice" minOccurs="0"/>
 *         <element name="ChrgsFees" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat43Choice" minOccurs="0"/>
 *         <element name="FsclStmp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PercentageRate" minOccurs="0"/>
 *         <element name="AplblRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PercentageRate" minOccurs="0"/>
 *         <element name="TaxCdtRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateFormat23Choice" minOccurs="0"/>
 *         <element name="FinTxTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PercentageRate" minOccurs="0"/>
 *         <element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat45Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ScndLvlTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateAndAmountFormat45Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate114", propOrder = {
    "addtlQtyForSbcbdRsltntScties",
    "addtlQtyForExstgScties",
    "newToOd",
    "chrgsFees",
    "fsclStmp",
    "aplblRate",
    "taxCdtRate",
    "finTxTaxRate",
    "whldgTaxRate",
    "scndLvlTax"
})
public class CorporateActionRate114 {

    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected RatioFormat21Choice addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected RatioFormat21Choice addtlQtyForExstgScties;
    @XmlElement(name = "NewToOd")
    protected RatioFormat22Choice newToOd;
    @XmlElement(name = "ChrgsFees")
    protected RateAndAmountFormat43Choice chrgsFees;
    @XmlElement(name = "FsclStmp")
    protected BigDecimal fsclStmp;
    @XmlElement(name = "AplblRate")
    protected BigDecimal aplblRate;
    @XmlElement(name = "TaxCdtRate")
    protected RateFormat23Choice taxCdtRate;
    @XmlElement(name = "FinTxTaxRate")
    protected BigDecimal finTxTaxRate;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat45Choice> whldgTaxRate;
    @XmlElement(name = "ScndLvlTax")
    protected List<RateAndAmountFormat45Choice> scndLvlTax;

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat21Choice }
     *     
     */
    public RatioFormat21Choice getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat21Choice }
     *     
     */
    public void setAddtlQtyForSbcbdRsltntScties(RatioFormat21Choice value) {
        this.addtlQtyForSbcbdRsltntScties = value;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat21Choice }
     *     
     */
    public RatioFormat21Choice getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat21Choice }
     *     
     */
    public void setAddtlQtyForExstgScties(RatioFormat21Choice value) {
        this.addtlQtyForExstgScties = value;
    }

    /**
     * Gets the value of the newToOd property.
     * 
     * @return
     *     possible object is
     *     {@link RatioFormat22Choice }
     *     
     */
    public RatioFormat22Choice getNewToOd() {
        return newToOd;
    }

    /**
     * Sets the value of the newToOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioFormat22Choice }
     *     
     */
    public void setNewToOd(RatioFormat22Choice value) {
        this.newToOd = value;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public void setChrgsFees(RateAndAmountFormat43Choice value) {
        this.chrgsFees = value;
    }

    /**
     * Gets the value of the fsclStmp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFsclStmp() {
        return fsclStmp;
    }

    /**
     * Sets the value of the fsclStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFsclStmp(BigDecimal value) {
        this.fsclStmp = value;
    }

    /**
     * Gets the value of the aplblRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAplblRate() {
        return aplblRate;
    }

    /**
     * Sets the value of the aplblRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAplblRate(BigDecimal value) {
        this.aplblRate = value;
    }

    /**
     * Gets the value of the taxCdtRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat23Choice }
     *     
     */
    public RateFormat23Choice getTaxCdtRate() {
        return taxCdtRate;
    }

    /**
     * Sets the value of the taxCdtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat23Choice }
     *     
     */
    public void setTaxCdtRate(RateFormat23Choice value) {
        this.taxCdtRate = value;
    }

    /**
     * Gets the value of the finTxTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinTxTaxRate() {
        return finTxTaxRate;
    }

    /**
     * Sets the value of the finTxTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinTxTaxRate(BigDecimal value) {
        this.finTxTaxRate = value;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the whldgTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhldgTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat45Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<>();
        }
        return this.whldgTaxRate;
    }

    /**
     * Gets the value of the scndLvlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scndLvlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndLvlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat45Choice }
     * 
     * 
     * @return
     *     The value of the scndLvlTax property.
     */
    public List<RateAndAmountFormat45Choice> getScndLvlTax() {
        if (scndLvlTax == null) {
            scndLvlTax = new ArrayList<>();
        }
        return this.scndLvlTax;
    }

}
