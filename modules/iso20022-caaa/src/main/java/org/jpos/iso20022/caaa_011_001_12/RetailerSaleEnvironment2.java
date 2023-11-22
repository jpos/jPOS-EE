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
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerSaleEnvironment2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RetailerSaleEnvironment2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleCpblties" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}SaleCapabilities1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="MinAmtToDlvr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MaxCshBckAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MinSpltAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DbtPrefrdFlg" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="LltyHdlg" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}LoyaltyHandling1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerSaleEnvironment2", propOrder = {
    "saleCpblties",
    "ccy",
    "minAmtToDlvr",
    "maxCshBckAmt",
    "minSpltAmt",
    "dbtPrefrdFlg",
    "lltyHdlg"
})
public class RetailerSaleEnvironment2 {

    @XmlElement(name = "SaleCpblties")
    @XmlSchemaType(name = "string")
    protected List<SaleCapabilities1Code> saleCpblties;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MinAmtToDlvr")
    protected BigDecimal minAmtToDlvr;
    @XmlElement(name = "MaxCshBckAmt")
    protected BigDecimal maxCshBckAmt;
    @XmlElement(name = "MinSpltAmt")
    protected BigDecimal minSpltAmt;
    @XmlElement(name = "DbtPrefrdFlg")
    protected Boolean dbtPrefrdFlg;
    @XmlElement(name = "LltyHdlg")
    @XmlSchemaType(name = "string")
    protected LoyaltyHandling1Code lltyHdlg;

    /**
     * Gets the value of the saleCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the saleCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleCapabilities1Code }
     * 
     * 
     * @return
     *     The value of the saleCpblties property.
     */
    public List<SaleCapabilities1Code> getSaleCpblties() {
        if (saleCpblties == null) {
            saleCpblties = new ArrayList<>();
        }
        return this.saleCpblties;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the minAmtToDlvr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmtToDlvr() {
        return minAmtToDlvr;
    }

    /**
     * Sets the value of the minAmtToDlvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmtToDlvr(BigDecimal value) {
        this.minAmtToDlvr = value;
    }

    /**
     * Gets the value of the maxCshBckAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxCshBckAmt() {
        return maxCshBckAmt;
    }

    /**
     * Sets the value of the maxCshBckAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxCshBckAmt(BigDecimal value) {
        this.maxCshBckAmt = value;
    }

    /**
     * Gets the value of the minSpltAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinSpltAmt() {
        return minSpltAmt;
    }

    /**
     * Sets the value of the minSpltAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinSpltAmt(BigDecimal value) {
        this.minSpltAmt = value;
    }

    /**
     * Gets the value of the dbtPrefrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtPrefrdFlg() {
        return dbtPrefrdFlg;
    }

    /**
     * Sets the value of the dbtPrefrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDbtPrefrdFlg(Boolean value) {
        this.dbtPrefrdFlg = value;
    }

    /**
     * Gets the value of the lltyHdlg property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyHandling1Code }
     *     
     */
    public LoyaltyHandling1Code getLltyHdlg() {
        return lltyHdlg;
    }

    /**
     * Sets the value of the lltyHdlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyHandling1Code }
     *     
     */
    public void setLltyHdlg(LoyaltyHandling1Code value) {
        this.lltyHdlg = value;
    }

}
